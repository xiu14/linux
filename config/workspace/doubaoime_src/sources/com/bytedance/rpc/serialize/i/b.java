package com.bytedance.rpc.serialize.i;

import com.bytedance.rpc.serialize.SerializeType;
import com.google.protobuf.MessageLite;

/* loaded from: classes2.dex */
public class b extends com.bytedance.rpc.serialize.b {
    public b(Object obj, SerializeType serializeType) {
        super(obj, serializeType);
    }

    @Override // com.bytedance.rpc.serialize.b
    public byte[] b(Object obj, String str) throws Exception {
        if (obj instanceof MessageLite) {
            return ((MessageLite) obj).toByteArray();
        }
        throw new IllegalArgumentException(String.format("unsupported class %s , SimplePbSerializer can only receive a proto object", obj.getClass()));
    }
}
