package com.bytedance.rpc.serialize;

import com.bytedance.rpc.annotation.RpcKeep;
import com.google.protobuf.MessageLite;
import java.lang.reflect.Type;

@RpcKeep
/* loaded from: classes2.dex */
public class PbSerializeFactory implements e {
    private boolean isSupportedType(Type type) {
        return (type instanceof Class) && MessageLite.class.isAssignableFrom((Class) type);
    }

    @Override // com.bytedance.rpc.serialize.e
    public d getDeserializer(com.bytedance.rpc.transport.e eVar, Type type) {
        if (isSupportedType(type)) {
            return new com.bytedance.rpc.serialize.i.a(eVar, type);
        }
        return null;
    }

    @Override // com.bytedance.rpc.serialize.e
    public SerializeType getSerializeType() {
        return SerializeType.PB;
    }

    @Override // com.bytedance.rpc.serialize.e
    public h getSerializer(Object obj, SerializeType serializeType) {
        Object c2 = b.c(obj, true);
        if (isSupportedType(c2 == null ? null : c2.getClass())) {
            return new com.bytedance.rpc.serialize.i.b(obj, serializeType);
        }
        return null;
    }

    @Override // com.bytedance.rpc.serialize.e
    public boolean isReflectSupported() {
        return false;
    }
}
