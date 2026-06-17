package com.bytedance.rpc.serialize;

import com.bytedance.rpc.annotation.RpcKeep;
import java.lang.reflect.Type;

@RpcKeep
/* loaded from: classes2.dex */
public class ThriftSerializeFactory implements e {
    @Override // com.bytedance.rpc.serialize.e
    public d getDeserializer(com.bytedance.rpc.transport.e eVar, Type type) {
        return new com.bytedance.rpc.serialize.j.a(eVar, type);
    }

    @Override // com.bytedance.rpc.serialize.e
    public SerializeType getSerializeType() {
        return SerializeType.THRIFT;
    }

    @Override // com.bytedance.rpc.serialize.e
    public h getSerializer(Object obj, SerializeType serializeType) {
        return new com.bytedance.rpc.serialize.j.b(obj, serializeType);
    }

    @Override // com.bytedance.rpc.serialize.e
    public boolean isReflectSupported() {
        return true;
    }
}
