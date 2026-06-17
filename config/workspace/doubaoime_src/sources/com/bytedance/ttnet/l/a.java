package com.bytedance.ttnet.l;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.p.k;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a extends com.bytedance.frameworks.baselib.network.http.n.a {
    private static volatile boolean a = false;
    private static volatile boolean b = false;

    public static void c(boolean z) {
        a = z;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.n.a
    protected Request b(Request request) throws IOException {
        Request a2;
        List list;
        List list2;
        int i = f.v;
        if (request == null) {
            a2 = null;
        } else {
            try {
                URL url = new URL(request.getUrl());
                if ("http".equals(url.getProtocol())) {
                    f.q(url.getHost(), url.getPath(), false, request.getMetrics());
                }
            } catch (MalformedURLException unused) {
            }
            String url2 = request.getUrl();
            if (request.getExtraInfo() instanceof c) {
                f.d(url2, (c) request.getExtraInfo(), request.getMetrics());
            } else {
                f.d(url2, null, request.getMetrics());
            }
            if (request.getUrl().startsWith("https:") && url2.startsWith("http:")) {
                try {
                    URL url3 = new URL(url2);
                    f.q(url3.getHost(), url3.getPath(), true, request.getMetrics());
                } catch (Throwable unused2) {
                }
            }
            if (request.isAddCommonParam()) {
                Objects.requireNonNull(com.bytedance.frameworks.baselib.network.http.k.a.a());
                try {
                    url2 = f.a(url2, true, request.getMetrics());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            Request.a newBuilder = request.newBuilder();
            newBuilder.g(url2);
            a2 = newBuilder.a();
        }
        if (a2 == null) {
            return null;
        }
        if (!b) {
            com.bytedance.ttnet.i.b.q();
            b = true;
        }
        Request.a newBuilder2 = a2.newBuilder();
        String url4 = a2.getUrl();
        ArrayList arrayList = new ArrayList();
        if (a2.getHeaders() != null) {
            arrayList.addAll(a2.getHeaders());
        }
        RetrofitMetrics metrics = a2.getMetrics();
        if (!com.bytedance.android.input.k.b.a.Y(url4)) {
            metrics.E0.f5962c.c();
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> d2 = l.d(url4, linkedHashMap);
                if (!linkedHashMap.isEmpty()) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (entry != null && (list2 = (List) entry.getValue()) != null && !list2.isEmpty()) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                String str = (String) it2.next();
                                if (linkedHashSet.contains(str)) {
                                    it2.remove();
                                } else {
                                    linkedHashSet.add(str);
                                }
                            }
                        }
                    }
                }
                k kVar = new k(((String) d2.first) + ((String) d2.second));
                if (!linkedHashMap.isEmpty()) {
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (entry2 != null && entry2.getKey() != null && (list = (List) entry2.getValue()) != null && !list.isEmpty()) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                kVar.b((String) entry2.getKey(), (String) it3.next());
                            }
                        }
                    }
                }
                url4 = kVar.c();
            } finally {
                try {
                } finally {
                }
            }
        }
        RetrofitMetrics metrics2 = a2.getMetrics();
        if (a) {
            try {
                LinkedList<Pair> linkedList = new LinkedList();
                metrics2.E0.b.c();
                try {
                    String g2 = e.b.f.a.a.a.g(url4, linkedList);
                    if (g2 != null) {
                        newBuilder2.g(g2);
                    }
                    if (!linkedList.isEmpty()) {
                        for (Pair pair : linkedList) {
                            if (pair != null) {
                                arrayList.add(new com.bytedance.retrofit2.client.b((String) pair.first, (String) pair.second));
                            }
                        }
                    }
                } finally {
                    metrics2.q();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        com.bytedance.ttnet.utils.b.e(url4, arrayList, a2.getMetrics());
        com.bytedance.ttnet.utils.a.e(url4, arrayList, a2.getMetrics());
        ClientKeyManager.j().a(arrayList, a2.getMetrics());
        newBuilder2.g(url4);
        newBuilder2.b(arrayList);
        return newBuilder2.a();
    }
}
