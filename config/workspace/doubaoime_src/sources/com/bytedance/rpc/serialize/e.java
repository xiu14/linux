package com.bytedance.rpc.serialize;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public interface e {
    d getDeserializer(com.bytedance.rpc.transport.e eVar, Type type);

    SerializeType getSerializeType();

    h getSerializer(Object obj, SerializeType serializeType);

    boolean isReflectSupported();
}
