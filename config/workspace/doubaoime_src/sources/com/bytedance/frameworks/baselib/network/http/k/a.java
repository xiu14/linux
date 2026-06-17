package com.bytedance.frameworks.baselib.network.http.k;

/* loaded from: classes.dex */
public class a {
    private static volatile a a;

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }
}
