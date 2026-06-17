package com.bytedance.rpc.serialize;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
class f implements e {
    SerializeType a;
    e[] b;

    f(SerializeType serializeType, e[] eVarArr) {
        this.a = serializeType;
        this.b = eVarArr;
    }

    @Override // com.bytedance.rpc.serialize.e
    public d getDeserializer(com.bytedance.rpc.transport.e eVar, Type type) {
        for (e eVar2 : this.b) {
            d deserializer = eVar2.getDeserializer(eVar, type);
            if (deserializer != null) {
                return deserializer;
            }
        }
        return null;
    }

    @Override // com.bytedance.rpc.serialize.e
    public SerializeType getSerializeType() {
        return this.a;
    }

    @Override // com.bytedance.rpc.serialize.e
    public h getSerializer(Object obj, SerializeType serializeType) {
        for (e eVar : this.b) {
            h serializer = eVar.getSerializer(obj, serializeType);
            if (serializer != null) {
                return serializer;
            }
        }
        return null;
    }

    @Override // com.bytedance.rpc.serialize.e
    public boolean isReflectSupported() {
        for (e eVar : this.b) {
            if (eVar.isReflectSupported()) {
                return true;
            }
        }
        return false;
    }
}
