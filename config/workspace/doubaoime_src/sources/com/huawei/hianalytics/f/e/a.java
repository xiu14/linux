package com.huawei.hianalytics.f.e;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {
    private static a b;
    private volatile Map<String, b> a = new HashMap();

    private a() {
    }

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    private b b(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new b());
        }
        return this.a.get(str);
    }

    public final b a(String str, long j) {
        b b2 = b(str);
        b2.d(j);
        return b2;
    }

    public final void a(String str) {
        b(str).c();
    }

    public final void b(String str, long j) {
        b(str).b(j);
    }

    public final void c(String str, long j) {
        b(str).c(j);
    }
}
