package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import e.a.a.a.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends ProtoAdapter<M> {
    private static final String REDACTED = "██";
    private final Class<B> builderType;
    private final Map<Integer, FieldBinding<M, B>> fieldBindings;
    private final Class<M> messageType;

    RuntimeMessageAdapter(Class<M> cls, Class<B> cls2, Map<Integer, FieldBinding<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.messageType = cls;
        this.builderType = cls2;
        this.fieldBindings = map;
    }

    static <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> create(Class<M> cls) {
        Class builderType = getBuilderType(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : cls.getDeclaredFields()) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, builderType));
            }
        }
        return new RuntimeMessageAdapter<>(cls, builderType, Collections.unmodifiableMap(linkedHashMap));
    }

    private static <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            StringBuilder M = a.M("No builder class found for message type ");
            M.append(cls.getName());
            throw new IllegalArgumentException(M.toString());
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeMessageAdapter) && ((RuntimeMessageAdapter) obj).messageType == this.messageType;
    }

    Map<Integer, FieldBinding<M, B>> fieldBindings() {
        return this.fieldBindings;
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    B newBuilder() {
        try {
            return this.builderType.newInstance();
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader protoReader) throws IOException {
        B newBuilder = newBuilder();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                protoReader.endMessage(beginMessage);
                return (M) newBuilder.build();
            }
            FieldBinding<M, B> fieldBinding = this.fieldBindings.get(Integer.valueOf(nextTag));
            if (fieldBinding != null) {
                try {
                    fieldBinding.value(newBuilder, (fieldBinding.isMap() ? fieldBinding.adapter() : fieldBinding.singleAdapter()).decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    newBuilder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                newBuilder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, M m) throws IOException {
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                fieldBinding.adapter().encodeWithTag(protoWriter, fieldBinding.tag, obj);
            }
        }
        protoWriter.writeBytes(m.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                i2 += fieldBinding.adapter().encodedSizeWithTag(fieldBinding.tag, obj);
            }
        }
        int f2 = i2 + m.unknownFields().f();
        m.cachedSerializedSize = f2;
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M m) {
        Message.Builder newBuilder = m.newBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            if (fieldBinding.redacted && fieldBinding.label == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException(String.format("Field '%s' in %s is required and cannot be redacted.", fieldBinding.name, this.javaType.getName()));
            }
            boolean isAssignableFrom = Message.class.isAssignableFrom(fieldBinding.singleAdapter().javaType);
            if (fieldBinding.redacted || (isAssignableFrom && !fieldBinding.label.isRepeated())) {
                Object fromBuilder = fieldBinding.getFromBuilder(newBuilder);
                if (fromBuilder != null) {
                    fieldBinding.set(newBuilder, fieldBinding.adapter().redact(fromBuilder));
                }
            } else if (isAssignableFrom && fieldBinding.label.isRepeated()) {
                Internal.redactElements((List) fieldBinding.getFromBuilder(newBuilder), fieldBinding.singleAdapter());
            }
        }
        newBuilder.clearUnknownFields();
        return (M) newBuilder.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                sb.append(", ");
                sb.append(fieldBinding.name);
                sb.append('=');
                if (fieldBinding.redacted) {
                    obj = REDACTED;
                }
                sb.append(obj);
            }
        }
        sb.replace(0, 2, this.messageType.getSimpleName() + '{');
        sb.append('}');
        return sb.toString();
    }
}
