package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import com.vivo.push.PushClient;
import java.io.IOException;
import java.util.Map;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.s;
import okhttp3.u;

/* loaded from: classes.dex */
public class l implements u {
    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
        Request i = fVar.i();
        if (PushClient.DEFAULT_REQUEST_ID.equals(i.headers().d("x-metasec-bypass-mssdk"))) {
            Request.a newBuilder = i.newBuilder();
            newBuilder.h("x-metasec-bypass-mssdk");
            return fVar.f(newBuilder.b());
        }
        Map<String, String> P = com.bytedance.frameworks.baselib.network.http.f.P(i.url().toString(), i.headers().j());
        if (PushClient.DEFAULT_REQUEST_ID.equals(i.headers().d("x-tt-oec-opaque-enable"))) {
            i.url().toString();
            i.headers().j();
            int i2 = com.bytedance.frameworks.baselib.network.http.f.v;
        }
        if (P == null) {
            return fVar.f(i);
        }
        Request.a aVar2 = new Request.a();
        aVar2.k(i.url());
        aVar2.f(i.method(), i.body());
        aVar2.i(i.tag());
        s.a g2 = i.headers().g();
        if (P != null) {
            for (Map.Entry<String, String> entry : P.entrySet()) {
                g2.a(entry.getKey(), entry.getValue());
            }
        }
        g2.d("x-tt-oec-opaque-enable");
        aVar2.e(g2.c());
        return fVar.f(aVar2.b());
    }
}
