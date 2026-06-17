package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import e.a.a.a.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    private ProtoAdapter<Object> adapter;
    private final String adapterString;
    private final Field builderField;
    private final Method builderMethod;
    private ProtoAdapter<?> keyAdapter;
    private final String keyAdapterString;
    public final WireField.Label label;
    private final Field messageField;
    public final String name;
    public final boolean redacted;
    private ProtoAdapter<?> singleAdapter;
    public final int tag;

    FieldBinding(WireField wireField, Field field, Class<B> cls) {
        this.label = wireField.label();
        String name = field.getName();
        this.name = name;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.messageField = field;
        this.builderField = getBuilderField(cls, name);
        this.builderMethod = getBuilderMethod(cls, name, field.getType());
    }

    private static Field getBuilderField(Class<?> cls, String str) {
        try {
            return cls.getField(str);
        } catch (NoSuchFieldException unused) {
            StringBuilder M = a.M("No builder field ");
            M.append(cls.getName());
            M.append(".");
            M.append(str);
            throw new AssertionError(M.toString());
        }
    }

    private static Method getBuilderMethod(Class<?> cls, String str, Class<?> cls2) {
        try {
            return cls.getMethod(str, cls2);
        } catch (NoSuchMethodException unused) {
            StringBuilder M = a.M("No builder method ");
            M.append(cls.getName());
            M.append(".");
            M.append(str);
            M.append("(");
            M.append(cls2.getName());
            M.append(")");
            throw new AssertionError(M.toString());
        }
    }

    ProtoAdapter<Object> adapter() {
        ProtoAdapter<Object> protoAdapter = this.adapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (isMap()) {
            ProtoAdapter<Object> newMapAdapter = ProtoAdapter.newMapAdapter(keyAdapter(), singleAdapter());
            this.adapter = newMapAdapter;
            return newMapAdapter;
        }
        ProtoAdapter<?> withLabel = singleAdapter().withLabel(this.label);
        this.adapter = withLabel;
        return withLabel;
    }

    Object get(M m) {
        try {
            return this.messageField.get(m);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    Object getFromBuilder(B b) {
        try {
            return this.builderField.get(b);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    boolean isMap() {
        return !this.keyAdapterString.isEmpty();
    }

    ProtoAdapter<?> keyAdapter() {
        ProtoAdapter<?> protoAdapter = this.keyAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.keyAdapterString);
        this.keyAdapter = protoAdapter2;
        return protoAdapter2;
    }

    void set(B b, Object obj) {
        try {
            if (this.label.isOneOf()) {
                this.builderMethod.invoke(b, obj);
            } else {
                this.builderField.set(b, obj);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    ProtoAdapter<?> singleAdapter() {
        ProtoAdapter<?> protoAdapter = this.singleAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.adapterString);
        this.singleAdapter = protoAdapter2;
        return protoAdapter2;
    }

    void value(B b, Object obj) {
        if (this.label.isRepeated()) {
            ((List) getFromBuilder(b)).add(obj);
        } else if (this.keyAdapterString.isEmpty()) {
            set(b, obj);
        } else {
            ((Map) getFromBuilder(b)).putAll((Map) obj);
        }
    }
}
