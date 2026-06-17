package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.G;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class J extends com.ttnet.org.chromium.net.G {
    private final List<String> a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8714c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8715d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8716e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8717f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f8718g;
    private final a h;

    public static final class a extends G.a {
        private final List<Map.Entry<String, String>> a;
        private Map<String, List<String>> b;

        a(List<Map.Entry<String, String>> list) {
            this.a = list;
        }

        public List<Map.Entry<String, String>> a() {
            return this.a;
        }

        public Map<String, List<String>> b() {
            Map<String, List<String>> map = this.b;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, String> entry : this.a) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
            this.b = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    public J(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.a = Collections.unmodifiableList(list);
        this.b = i;
        this.f8714c = str;
        this.h = new a(Collections.unmodifiableList(list2));
        this.f8715d = z;
        this.f8716e = str2;
        this.f8717f = str3;
        this.f8718g = new AtomicLong(j);
    }

    @Override // com.ttnet.org.chromium.net.G
    public Map<String, List<String>> a() {
        return this.h.b();
    }

    @Override // com.ttnet.org.chromium.net.G
    public List<Map.Entry<String, String>> b() {
        return this.h.a();
    }

    @Override // com.ttnet.org.chromium.net.G
    public int c() {
        return this.b;
    }

    @Override // com.ttnet.org.chromium.net.G
    public String d() {
        return this.f8714c;
    }

    public String e() {
        return this.f8716e;
    }

    public void f(long j) {
        this.f8718g.set(j);
    }

    public boolean g() {
        return this.f8715d;
    }

    public String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), this.a.get(r2.size() - 1), this.a.toString(), Integer.valueOf(this.b), this.f8714c, this.h.a().toString(), Boolean.valueOf(this.f8715d), this.f8716e, this.f8717f, Long.valueOf(this.f8718g.get()));
    }
}
