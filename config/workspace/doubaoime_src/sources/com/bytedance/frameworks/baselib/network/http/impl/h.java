package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f5142c = "h";

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, String> f5143d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static String f5144e;
    private final SharedPreferences a;
    private final Map<URI, Set<i>> b = new LinkedHashMap();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h.a(h.this);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public h(Context context) {
        String str = f5144e;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str == null ? "cookieStore" : str, 4);
        this.a = sharedPreferences;
        e(sharedPreferences.getAll(), true);
        e(f5143d, false);
    }

    static void a(h hVar) {
        Map<URI, Set<i>> map;
        synchronized (hVar) {
            Map<URI, Set<i>> map2 = hVar.b;
            if (map2 != null && !map2.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<URI, Set<i>> entry : hVar.b.entrySet()) {
                    if (entry != null) {
                        URI key = entry.getKey();
                        if (key.getScheme() != null && key.getScheme().equals("https")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (entry2 != null) {
                        URI uri = (URI) entry2.getKey();
                        Set<i> set = (Set) entry2.getValue();
                        try {
                            URI uri2 = new URI(uri.toString().replace("https:", "http:"));
                            Set<i> set2 = hVar.b.get(uri2);
                            if (set2 != null && !set2.isEmpty()) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (i iVar : set2) {
                                    boolean z = false;
                                    for (i iVar2 : set) {
                                        if (iVar != null && iVar2 != null && iVar.d().equals(iVar2.d()) && iVar2.e().longValue() >= iVar.e().longValue()) {
                                            linkedHashSet.add(iVar2);
                                            z = true;
                                        }
                                    }
                                    if (!z) {
                                        linkedHashSet.add(iVar);
                                    }
                                }
                                for (i iVar3 : set) {
                                    if (!linkedHashSet.contains(iVar3)) {
                                        linkedHashSet.add(iVar3);
                                    }
                                }
                                hVar.b.remove(uri);
                                hVar.b.put(uri2, linkedHashSet);
                            }
                            hVar.b.remove(uri);
                            hVar.b.put(uri2, set);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
                try {
                    map = hVar.b;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (map != null && !map.isEmpty()) {
                    SharedPreferences.Editor edit = hVar.a.edit();
                    edit.clear();
                    for (Map.Entry<URI, Set<i>> entry3 : hVar.b.entrySet()) {
                        URI key2 = entry3.getKey();
                        for (i iVar4 : entry3.getValue()) {
                            String str = key2.toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + iVar4.d().s();
                            String b = iVar4.b();
                            if (iVar4.d().r() > 0) {
                                edit.putString(str, b);
                            } else {
                                f5143d.put(str, b);
                            }
                        }
                    }
                    com.bytedance.common.utility.i.a.a(edit);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        if (r4.endsWith(r7.toString()) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.bytedance.frameworks.baselib.network.http.impl.f> d(java.net.URI r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.h.d(java.net.URI):java.util.List");
    }

    private synchronized void e(Map<String, ?> map, boolean z) {
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (Map.Entry<String, ?> entry : map.entrySet()) {
                        try {
                            URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                            i a2 = i.a((String) entry.getValue());
                            Set<i> set = this.b.get(uri);
                            if (set == null) {
                                set = new HashSet<>();
                                this.b.put(uri, set);
                            }
                            if (a2 != null) {
                                set.add(a2);
                            }
                        } catch (URISyntaxException e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (z) {
                        com.bytedance.common.utility.h.c.b(new a());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void f(URI uri, i iVar) {
        String str = uri.toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + iVar.d().s();
        String b = iVar.b();
        if (iVar.d().r() <= 0) {
            f5143d.put(str, b);
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, b);
        edit.apply();
    }

    public static void g() {
        f5144e = "ttnetCookieStore";
    }

    public synchronized void b(URI uri, f fVar) {
        if (fVar.q() != null) {
            String q = fVar.q();
            if (q.charAt(0) == '.') {
                q = q.substring(1);
            }
            try {
                uri = new URI("http", q, fVar.t() == null ? "/" : fVar.t(), null);
            } catch (URISyntaxException e2) {
                Log.w(f5142c, e2);
            }
        }
        Set<i> set = this.b.get(uri);
        i iVar = new i(fVar);
        if (set == null) {
            set = new HashSet<>();
            this.b.put(uri, set);
        } else {
            set.remove(iVar);
        }
        set.add(iVar);
        f(uri, iVar);
    }

    public synchronized List<f> c(URI uri) {
        return d(uri);
    }
}
