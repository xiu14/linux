package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import com.vivo.push.PushClient;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.s;
import okhttp3.u;

/* loaded from: classes.dex */
public class g implements u {
    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        URI n;
        Set<String> f2;
        boolean z;
        Set<String> f3;
        okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
        Request i = fVar.i();
        if (i != null && i.headers() != null && "0".equals(i.header(com.bytedance.retrofit2.client.Request.KEY_BYPASS_TTNET_COOKIE_HEADER))) {
            Request.a newBuilder = i.newBuilder();
            newBuilder.h(com.bytedance.retrofit2.client.Request.KEY_BYPASS_TTNET_COOKIE_HEADER);
            return fVar.f(newBuilder.b());
        }
        try {
            n = i.url().z();
        } catch (Exception unused) {
            n = com.bytedance.feedbackerlib.a.n(i.url().toString());
        }
        Request.a newBuilder2 = i.newBuilder();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        s headers = i.headers();
        Map<String, List<String>> map = null;
        String e2 = n != null ? com.bytedance.frameworks.baselib.network.http.p.c.e(n.toString()) : null;
        try {
            HashMap hashMap = new HashMap();
            if (headers != null && (f3 = headers.f()) != null && !f3.isEmpty()) {
                for (String str : f3) {
                    hashMap.put(str, headers.l(str));
                }
            }
            if (i.headers() != null) {
                z = PushClient.DEFAULT_REQUEST_ID.equals(i.header(com.bytedance.retrofit2.client.Request.KEY_BYPASS_OKHTTP_COOKIE));
                if (PushClient.DEFAULT_REQUEST_ID.equals(i.header("x-metasec-ok-bypass-downgrade-cookie"))) {
                    z = true;
                }
            } else {
                z = false;
            }
            if (cookieHandler != null && !z) {
                try {
                    map = e2 != null ? cookieHandler.get(new URI(e2), hashMap) : cookieHandler.get(n, hashMap);
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    StringBuilder sb = new StringBuilder();
                    if ("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                        if (!entry.getValue().isEmpty()) {
                            int i2 = 0;
                            for (String str2 : entry.getValue()) {
                                if (i2 > 0) {
                                    sb.append("; ");
                                }
                                sb.append(str2);
                                i2++;
                            }
                            newBuilder2.a(key, sb.toString());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            i = newBuilder2.b();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        B f4 = fVar.f(i);
        HashMap hashMap2 = new HashMap();
        s w = f4.w();
        if (w != null && (f2 = w.f()) != null && !f2.isEmpty()) {
            for (String str3 : f2) {
                hashMap2.put(str3, w.l(str3));
            }
        }
        if (cookieHandler != null) {
            try {
                if (e2 != null) {
                    cookieHandler.put(new URI(e2), hashMap2);
                } else {
                    cookieHandler.put(n, hashMap2);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        return f4;
    }
}
