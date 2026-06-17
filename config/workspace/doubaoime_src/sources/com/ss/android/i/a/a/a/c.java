package com.ss.android.i.a.a.a;

import com.ss.android.ugc.quota.BDNetworkTagConfigDefault;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class c {
    private Map<String, f> a = new ConcurrentHashMap();
    private Map<String, Object> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<String, String> f8313c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    final Set<String> f8314d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e, reason: collision with root package name */
    final Set<String> f8315e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private static final c a = new c();
    }

    public <T> T a(Class<T> cls) {
        String name = cls.getName();
        f fVar = this.a.get(name);
        if (fVar != null) {
            return (T) fVar.get();
        }
        T t = (T) this.b.get(name);
        if (t != null || this.f8315e.contains(name)) {
            return t;
        }
        if (cls.getName().hashCode() != -1748441402 || !cls.getName().equals("com.ss.android.ugc.quota.IBDNetworkTagConfig")) {
            this.f8315e.add(cls.getName());
            return null;
        }
        T t2 = (T) new BDNetworkTagConfigDefault();
        this.b.put("com.ss.android.ugc.quota.IBDNetworkTagConfig", t2);
        return t2;
    }
}
