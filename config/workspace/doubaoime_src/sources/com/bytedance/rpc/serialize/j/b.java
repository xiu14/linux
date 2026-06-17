package com.bytedance.rpc.serialize.j;

import com.bytedance.rpc.serialize.SerializeType;
import e.b.l.s.f;
import e.b.l.s.g;
import e.b.l.s.h;

/* loaded from: classes2.dex */
public class b extends com.bytedance.rpc.serialize.b {
    public b(Object obj, SerializeType serializeType) {
        super(obj, serializeType);
    }

    @Override // com.bytedance.rpc.serialize.b
    public byte[] b(Object obj, String str) throws Exception {
        h<?> a = f.a(obj.getClass());
        g gVar = new g();
        a.b(obj, new g.a.c.c.a(gVar));
        return gVar.r();
    }
}
