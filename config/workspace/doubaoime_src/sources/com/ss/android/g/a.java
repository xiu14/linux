package com.ss.android.g;

/* loaded from: classes2.dex */
public class a {
    private static String a;

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = com.bytedance.common.g.a.c().e().c().f4151c;
                }
            }
        }
        return e.a.a.a.a.J(sb, a, str);
    }

    public static void b(String str) {
        a = str;
    }
}
