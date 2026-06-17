package com.bytedance.rpc.serialize.k;

import com.bytedance.rpc.serialize.SerializeType;
import e.b.l.t.d;

/* loaded from: classes2.dex */
public class b extends com.bytedance.rpc.serialize.b {
    public b(Object obj, SerializeType serializeType) {
        super(obj, serializeType);
    }

    @Override // com.bytedance.rpc.serialize.b
    public byte[] b(Object obj, String str) throws Exception {
        try {
            return d.a(null, obj.getClass()).encode(obj);
        } finally {
            d.b().clear();
        }
    }
}
