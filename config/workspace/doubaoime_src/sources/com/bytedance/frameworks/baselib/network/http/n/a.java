package com.bytedance.frameworks.baselib.network.http.n;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.i.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements com.bytedance.retrofit2.T.b {
    @Override // com.bytedance.retrofit2.S.a
    public N a(a.InterfaceC0308a interfaceC0308a) throws Exception {
        com.bytedance.ttnet.i.b bVar;
        String str;
        List<com.bytedance.retrofit2.client.b> i;
        com.bytedance.retrofit2.S.b bVar2 = (com.bytedance.retrofit2.S.b) interfaceC0308a;
        Request b = b(bVar2.d());
        N c2 = com.bytedance.retrofit2.S.b.a() ? bVar2.c(b) : bVar2.b(b);
        if (b != null && c2 != null) {
            com.bytedance.retrofit2.client.c h = c2.h();
            if (f.f() != null) {
                b.getMetrics().E0.b.c();
                try {
                    String b2 = f.f().b();
                    if (!com.bytedance.android.input.k.b.a.Y(b2) && (i = h.i(b2)) != null && i.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<com.bytedance.retrofit2.client.b> it2 = i.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().b());
                        }
                        f.f().a(arrayList);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            ClientKeyManager.j().f(b, h);
            b.getMetrics().E0.b.c();
            try {
                Object b3 = h.b();
                if (b3 instanceof com.bytedance.ttnet.i.b) {
                    bVar = (com.bytedance.ttnet.i.b) b3;
                    if (bVar.f5082c != 0) {
                        JSONObject jSONObject = new JSONObject();
                        List<com.bytedance.retrofit2.client.b> d2 = h.d();
                        for (int i2 = 0; i2 < d2.size(); i2++) {
                            try {
                                com.bytedance.retrofit2.client.b bVar3 = d2.get(i2);
                                if (bVar3 != null && !TextUtils.isEmpty(bVar3.a())) {
                                    jSONObject.put(bVar3.a().toUpperCase(), bVar3.b());
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        T t = bVar.f5082c;
                        if (t instanceof d) {
                            Objects.requireNonNull((d) t);
                        }
                        Objects.requireNonNull((d) bVar.f5082c);
                        ((d) bVar.f5082c).a = bVar.s;
                    }
                } else {
                    bVar = null;
                }
                try {
                    b.getFirstHeader("X-SS-REQ-TICKET");
                    h.c("X-SS-REQ-TICKET");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    String url = b.getUrl();
                    Uri parse = Uri.parse(url);
                    String host = parse.getHost();
                    com.bytedance.feedbackerlib.a.C();
                    if (host.endsWith("snssdk.com")) {
                        String[] strArr = {"Set-Cookie"};
                        String[] strArr2 = {"sessionid", "tt_sessionid"};
                        int i3 = 0;
                        while (i3 < 1) {
                            List<com.bytedance.retrofit2.client.b> i4 = h.i(strArr[i3]);
                            if (i4 != null && i4.size() > 0) {
                                for (com.bytedance.retrofit2.client.b bVar4 : i4) {
                                    int i5 = 0;
                                    while (i5 < 2) {
                                        String L = com.bytedance.feedbackerlib.a.L(bVar4.b(), strArr2[i5]);
                                        if (Logger.debug()) {
                                            Logger.d("SsOkHttpClient", L);
                                        }
                                        if (com.bytedance.android.input.k.b.a.Y(L)) {
                                            str = url;
                                        } else {
                                            int f2 = h.f();
                                            Objects.requireNonNull(bVar);
                                            JSONObject jSONObject2 = new JSONObject();
                                            try {
                                                String encodedQuery = parse.getEncodedQuery();
                                                if (!com.bytedance.android.input.k.b.a.Y(encodedQuery)) {
                                                    jSONObject2.put("url_query", encodedQuery);
                                                }
                                            } catch (Throwable unused) {
                                            }
                                            if (!com.bytedance.android.input.k.b.a.Y(bVar.s)) {
                                                jSONObject2.put("remote_ip", bVar.s);
                                            }
                                            if (h.d() != null) {
                                                jSONObject2.put("header_list", h.d().toString());
                                            }
                                            int indexOf = url.indexOf("?");
                                            if (indexOf == -1) {
                                                indexOf = url.length();
                                            }
                                            str = url;
                                            com.bytedance.ttnet.utils.b.b("set_cookie", url.substring(0, indexOf), f2, false, jSONObject2);
                                        }
                                        i5++;
                                        url = str;
                                    }
                                }
                            }
                            i3++;
                            url = url;
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                b.getMetrics().k();
                com.bytedance.ttnet.utils.a.d(b, h, null);
            } catch (Throwable th3) {
                b.getMetrics().k();
                throw th3;
            }
        }
        return c2;
    }

    protected Request b(Request request) throws IOException {
        throw null;
    }
}
