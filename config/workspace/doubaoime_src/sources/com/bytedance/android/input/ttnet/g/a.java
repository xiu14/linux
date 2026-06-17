package com.bytedance.android.input.ttnet.g;

import com.bytedance.frameworks.baselib.network.http.p.k;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import com.vivo.push.PushClient;
import java.util.List;
import kotlin.collections.g;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class a implements com.bytedance.retrofit2.S.a {

    /* renamed from: com.bytedance.android.input.ttnet.g.a$a, reason: collision with other inner class name */
    static final class C0099a extends m implements l<com.bytedance.retrofit2.client.b, Boolean> {
        public static final C0099a a = new C0099a();

        C0099a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(com.bytedance.retrofit2.client.b bVar) {
            return Boolean.valueOf(kotlin.s.c.l.a(bVar.a(), "not-use-olympus-account"));
        }
    }

    @Override // com.bytedance.retrofit2.S.a
    public N<?> a(a.InterfaceC0308a interfaceC0308a) {
        Request d2 = interfaceC0308a != null ? ((com.bytedance.retrofit2.S.b) interfaceC0308a).d() : null;
        if (d2 == null) {
            return null;
        }
        Request.a newBuilder = d2.newBuilder();
        k kVar = new k(d2.getUrl());
        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
        kotlin.s.c.l.e(headers, "request.headers");
        List<com.bytedance.retrofit2.client.b> k0 = g.k0(headers);
        List<com.bytedance.retrofit2.client.b> headers2 = d2.headers("not-use-olympus-account");
        if (headers2 == null || headers2.isEmpty()) {
            kVar.b("use-olympus-account", PushClient.DEFAULT_REQUEST_ID);
        } else {
            kVar.b("use-olympus-account", "0");
            g.S(k0, C0099a.a);
        }
        newBuilder.g(kVar.c());
        newBuilder.b(k0);
        return ((com.bytedance.retrofit2.S.b) interfaceC0308a).b(newBuilder.a());
    }
}
