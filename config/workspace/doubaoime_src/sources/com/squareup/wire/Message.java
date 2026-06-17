package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import f.e;
import f.f;
import f.h;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize = 0;
    protected transient int hashCode = 0;
    private final transient h unknownFields;

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        transient e unknownFieldsBuffer;
        transient h unknownFieldsByteString = h.f10045d;
        transient ProtoWriter unknownFieldsWriter;

        protected Builder() {
        }

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                e eVar = new e();
                this.unknownFieldsBuffer = eVar;
                ProtoWriter protoWriter = new ProtoWriter(eVar);
                this.unknownFieldsWriter = protoWriter;
                try {
                    protoWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = h.f10045d;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final Builder<M, B> addUnknownFields(h hVar) {
            if (hVar.f() > 0) {
                prepareForNewUnknownFields();
                try {
                    this.unknownFieldsWriter.writeBytes(hVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public abstract M build();

        public final h buildUnknownFields() {
            e eVar = this.unknownFieldsBuffer;
            if (eVar != null) {
                this.unknownFieldsByteString = eVar.w();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = h.f10045d;
            e eVar = this.unknownFieldsBuffer;
            if (eVar != null) {
                eVar.a();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }
    }

    protected Message(ProtoAdapter<M> protoAdapter, h hVar) {
        Objects.requireNonNull(protoAdapter, "adapter == null");
        Objects.requireNonNull(hVar, "unknownFields == null");
        this.adapter = protoAdapter;
        this.unknownFields = hVar;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(f fVar) throws IOException {
        this.adapter.encode(fVar, (f) this);
    }

    public abstract B newBuilder();

    public String toString() {
        return this.adapter.toString(this);
    }

    public final h unknownFields() {
        h hVar = this.unknownFields;
        return hVar != null ? hVar : h.f10045d;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    protected final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.encode(outputStream, (OutputStream) this);
    }
}
