package com.bytedance.rpc.serialize.j;

import com.bytedance.rpc.transport.e;
import e.b.l.s.f;
import e.b.l.s.g;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class a extends com.bytedance.rpc.serialize.a {
    public a(e eVar, Type type) {
        super(eVar, type);
    }

    @Override // com.bytedance.rpc.serialize.a
    protected Object b(e eVar, Type type) throws Exception {
        try {
            return f.a(type).c(new g.a.c.c.a(new g(((com.bytedance.rpc.transport.ttnet.b) eVar).d())));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
