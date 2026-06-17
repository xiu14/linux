package com.bytedance.android.input.common.u;

import java.util.HashMap;

/* loaded from: classes.dex */
public class e {
    private static HashMap<String, Long> a = new HashMap<>();

    public static void a(String str) {
        a.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static void b(String str) {
        a.remove(str);
    }

    public static long c(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = a.get(str);
        if (l == null) {
            return -1L;
        }
        a.remove(str);
        return currentTimeMillis - l.longValue();
    }

    public static long d(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = a.get(str);
        if (l == null) {
            return -1L;
        }
        return currentTimeMillis - l.longValue();
    }
}
