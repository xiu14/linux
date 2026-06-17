package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.impl.f;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends CookieManager {
    private final e a;
    private d b;

    public c(Context context, d dVar) {
        this.a = new h(context);
        this.b = dVar;
    }

    private void b(URI uri, List<f> list) {
        if (com.bytedance.android.input.k.b.a.g0(list)) {
            return;
        }
        for (f fVar : list) {
            if (TextUtils.isEmpty(fVar.q())) {
                fVar.C(uri.getHost());
            }
            if (TextUtils.isEmpty(fVar.t())) {
                String path = uri.getPath();
                fVar.D(TextUtils.isEmpty(path) ? "/" : path.substring(0, path.lastIndexOf(47) + 1));
            }
            if ("".equals(fVar.u())) {
                fVar.E(Integer.toString(i.c(uri.getScheme(), uri.getPort())));
            } else if (fVar.u() != null && !f.A(fVar, uri)) {
            }
            if (this.b.a(uri, fVar)) {
                ((h) this.a).b(uri, fVar);
            }
        }
    }

    public void a(URI uri, List<String> list) throws IOException {
        if (uri == null || list == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!com.bytedance.android.input.k.b.a.Y(str)) {
                try {
                    int i = f.p;
                    arrayList.addAll(new f.b(str).b());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        b(uri, arrayList);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) ((h) this.a).c(uri)).iterator();
        while (it2.hasNext()) {
            f fVar = (f) it2.next();
            if (f.z(fVar, uri) && f.B(fVar, uri) && f.A(fVar, uri)) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        StringBuilder sb = new StringBuilder();
        Iterator it3 = arrayList.iterator();
        int i = 1;
        while (it3.hasNext()) {
            i = Math.min(i, ((f) it3.next()).v());
        }
        if (i == 1) {
            sb.append("$Version=\"1\"; ");
        }
        sb.append(((f) arrayList.get(0)).toString());
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            sb.append("; ");
            sb.append(((f) arrayList.get(i2)).toString());
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && (key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2"))) {
                for (String str : entry.getValue()) {
                    try {
                        int i = f.p;
                        Iterator it2 = ((ArrayList) new f.b(str).b()).iterator();
                        while (it2.hasNext()) {
                            arrayList.add((f) it2.next());
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        b(uri, arrayList);
    }
}
