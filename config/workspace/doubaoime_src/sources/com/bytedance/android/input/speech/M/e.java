package com.bytedance.android.input.speech.M;

import android.accounts.NetworkErrorException;
import com.bytedance.android.input.network.utils.INetworkProxyApi;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.N;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e implements com.ss.ugc.effectplatform.bridge.network.d {
    private final void c(com.ss.ugc.effectplatform.bridge.network.f fVar) {
        try {
            com.bytedance.android.input.r.j.i("Effect-ImplNetWorker", "request url: " + new kotlin.text.i("&?device_info=[^&]*").e(fVar.g(), ""));
            com.bytedance.android.input.r.j.i("Effect-ImplNetWorker", "request header: " + fVar.e());
            com.bytedance.android.input.r.j.i("Effect-ImplNetWorker", "request useCommParam: " + fVar.h());
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.k("Effect-ImplNetWorker", "error in print url", e2);
        }
    }

    private final com.ss.ugc.effectplatform.bridge.network.h d(com.ss.ugc.effectplatform.bridge.network.f fVar) throws Exception {
        ArrayList arrayList;
        N<com.bytedance.retrofit2.mime.h> execute;
        Map<String, String> e2 = fVar.e();
        if (e2 == null || e2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : e2.entrySet()) {
                arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
            }
        }
        int ordinal = fVar.f().ordinal();
        if (ordinal == 0) {
            String g2 = fVar.g();
            boolean h = fVar.h();
            try {
                com.bytedance.android.input.network.utils.a l = com.bytedance.android.input.k.b.a.l(g2);
                InterfaceC0701e<com.bytedance.retrofit2.mime.h> interfaceC0701e = ((INetworkProxyApi) RetrofitUtils.e(l.a(), INetworkProxyApi.class)).get(h, -1, l.c(), l.b(), arrayList);
                if (interfaceC0701e != null) {
                    execute = interfaceC0701e.execute();
                }
                execute = null;
            } catch (Exception e3) {
                e.a.a.a.a.f0(e3, e.a.a.a.a.M("streamByGet error:"), "NetworkProxy");
                throw e3;
            }
        } else {
            if (ordinal != 1) {
                throw new kotlin.f();
            }
            String c2 = fVar.c();
            if (l.a(c2, "application/json")) {
                String g3 = fVar.g();
                boolean h2 = fVar.h();
                Map<String, ? extends Object> b = fVar.b();
                try {
                    com.bytedance.android.input.network.utils.a l2 = com.bytedance.android.input.k.b.a.l(g3);
                    InterfaceC0701e<com.bytedance.retrofit2.mime.h> postByJson = ((INetworkProxyApi) RetrofitUtils.e(l2.a(), INetworkProxyApi.class)).postByJson(h2, -1, l2.c(), l2.b(), b, arrayList);
                    if (postByJson != null) {
                        execute = postByJson.execute();
                    }
                    execute = null;
                } catch (Exception e4) {
                    e.a.a.a.a.f0(e4, e.a.a.a.a.M("streamByPostJson error:"), "NetworkProxy");
                    throw e4;
                }
            } else {
                if (l.a(c2, "application/x-www-form-urlencoded")) {
                    String g4 = fVar.g();
                    boolean h3 = fVar.h();
                    Map<String, ? extends Object> b2 = fVar.b();
                    try {
                        com.bytedance.android.input.network.utils.a l3 = com.bytedance.android.input.k.b.a.l(g4);
                        InterfaceC0701e<com.bytedance.retrofit2.mime.h> postByForm = ((INetworkProxyApi) RetrofitUtils.e(l3.a(), INetworkProxyApi.class)).postByForm(h3, -1, l3.c(), l3.b(), b2, arrayList);
                        if (postByForm != null) {
                            execute = postByForm.execute();
                        }
                    } catch (Exception e5) {
                        e.a.a.a.a.f0(e5, e.a.a.a.a.M("streamByPostForm error:"), "NetworkProxy");
                        throw e5;
                    }
                }
                execute = null;
            }
        }
        Integer valueOf = execute != null ? Integer.valueOf(execute.b()) : null;
        com.bytedance.retrofit2.mime.h a = execute != null ? execute.a() : null;
        com.bytedance.android.input.r.j.i("Effect-ImplNetWorker", "request code = " + valueOf);
        com.bytedance.android.input.r.j.i("Effect-ImplNetWorker", "request body = " + a);
        if (valueOf != null && valueOf.intValue() == 200 && a != null) {
            int intValue = valueOf.intValue();
            InputStream d2 = a.d();
            l.e(d2, "body.`in`()");
            return new com.ss.ugc.effectplatform.bridge.network.h(intValue, new j(d2), a.length(), null);
        }
        StringBuilder M = e.a.a.a.a.M("http response code:");
        Object obj = valueOf;
        if (valueOf == null) {
            obj = "unknown";
        }
        M.append(obj);
        throw new NetworkErrorException(M.toString());
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.d
    public com.ss.ugc.effectplatform.bridge.network.h a(com.ss.ugc.effectplatform.bridge.network.f fVar) {
        l.f(fVar, "netRequest");
        try {
            c(fVar);
            return d(fVar);
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.k("Effect-ImplNetWorker", e2.getMessage(), e2);
            return new com.ss.ugc.effectplatform.bridge.network.h(-1, new com.ss.ugc.effectplatform.bridge.network.b(), -1L, null, 8);
        }
    }
}
