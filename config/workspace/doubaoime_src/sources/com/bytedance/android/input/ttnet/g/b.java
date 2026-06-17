package com.bytedance.android.input.ttnet.g;

import android.text.TextUtils;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b implements com.bytedance.retrofit2.S.a {
    @Override // com.bytedance.retrofit2.S.a
    public N<?> a(a.InterfaceC0308a interfaceC0308a) {
        l.f(interfaceC0308a, "chain");
        com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
        Request d2 = bVar.d();
        String host = new URI(d2.getUrl()).getHost();
        l.e(host, "URI(request.url).host");
        String lowerCase = host.toLowerCase(Locale.ROOT);
        l.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ArrayList arrayList = new ArrayList();
        String url = d2.getUrl();
        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
        l.e(headers, "request.headers");
        arrayList.addAll(headers);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("ime.doubao.com");
        arrayList2.add("os-assistant-boe.bytedance.net");
        arrayList2.add("mp.oceancloudapi.com");
        Iterator it2 = arrayList2.iterator();
        Map<String, String> map = null;
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            l.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (kotlin.text.a.g(lowerCase, lowerCase2, false, 2, null)) {
                map = com.bytedance.android.input.common.s.a.a.a.b();
            }
        }
        if (map == null || map.isEmpty()) {
            Request.a newBuilder = d2.newBuilder();
            newBuilder.b(arrayList);
            newBuilder.g(url);
            N<?> b = bVar.b(newBuilder.a());
            l.e(b, "chain.proceed(request.ne…eaders).url(url).build())");
            return b;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(new com.bytedance.retrofit2.client.b("Server-Cluster", "AssistantIM"));
        com.bytedance.android.input.common.s.a.a.a.a();
        throw null;
    }
}
