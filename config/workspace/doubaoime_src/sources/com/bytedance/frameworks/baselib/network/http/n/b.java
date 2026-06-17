package com.bytedance.frameworks.baselib.network.http.n;

import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;

/* loaded from: classes.dex */
public final class b implements com.bytedance.retrofit2.T.b {
    @Override // com.bytedance.retrofit2.S.a
    public N a(a.InterfaceC0308a interfaceC0308a) throws Exception {
        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
        Request d2 = bVar.d();
        if (d2 != null && !d2.isResponseStreaming()) {
            try {
                String O = f.O(d2.getUrl(), d2.isAddCommonParam(), d2.getMetrics(), d2.getBody());
                Request.a newBuilder = d2.newBuilder();
                newBuilder.g(O);
                d2 = newBuilder.a();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return com.bytedance.retrofit2.S.b.a() ? bVar.c(d2) : bVar.b(d2);
    }
}
