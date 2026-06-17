package com.bytedance.rpc.serialize.json;

import com.bytedance.rpc.serialize.g;
import com.google.gson.Gson;
import java.io.InputStream;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends com.bytedance.rpc.serialize.a {

    /* renamed from: c, reason: collision with root package name */
    private Gson f6056c;

    public d(Gson gson, com.bytedance.rpc.transport.e eVar, Type type) {
        super(eVar, type);
        this.f6056c = gson;
    }

    @Override // com.bytedance.rpc.serialize.a
    protected Object b(com.bytedance.rpc.transport.e eVar, Type type) throws Exception {
        InputStream d2 = eVar == null ? null : ((com.bytedance.rpc.transport.ttnet.b) eVar).d();
        if (d2 == null) {
            return null;
        }
        com.bytedance.rpc.transport.ttnet.b bVar = (com.bytedance.rpc.transport.ttnet.b) eVar;
        String j = e.b.l.q.c.c(bVar.c()) ? g.j(bVar.c(), "UTF-8") : "UTF-8";
        if (String.class == type) {
            return e.b.l.q.c.e(d2, j);
        }
        if (JSONObject.class == type) {
            return new JSONObject(e.b.l.q.c.e(d2, j));
        }
        return this.f6056c.d(e.b.l.q.c.e(d2, j), type);
    }
}
