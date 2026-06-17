package com.bytedance.rpc.serialize.k;

import com.bytedance.rpc.transport.e;
import com.squareup.wire.ProtoAdapter;
import e.b.l.t.d;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class a extends com.bytedance.rpc.serialize.a {
    public a(e eVar, Type type) {
        super(eVar, type);
    }

    @Override // com.bytedance.rpc.serialize.a
    protected Object b(e eVar, Type type) throws Exception {
        ProtoAdapter<?> a = d.a(null, (Class) type);
        InputStream d2 = ((com.bytedance.rpc.transport.ttnet.b) eVar).d();
        try {
            try {
                return a.decode(d2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } finally {
            try {
                d2.close();
            } catch (IOException unused) {
            }
        }
    }
}
