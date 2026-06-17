package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class s {
    static Map<String, l1> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static s f7391c;
    private g1 a = new g1();

    private s() {
    }

    public static s c() {
        if (f7391c == null) {
            d();
        }
        return f7391c;
    }

    private static synchronized void d() {
        synchronized (s.class) {
            if (f7391c == null) {
                f7391c = new s();
            }
        }
    }

    public l1 a(String str) {
        return b.get(str);
    }

    public Set<String> a() {
        return b.keySet();
    }

    public void a(String str, l1 l1Var) {
        b.put(str, l1Var);
    }

    public g1 b() {
        return this.a;
    }
}
