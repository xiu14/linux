package com.bytedance.apm.G.i;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {
    private static HashMap<String, Integer> a;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put("xx", 12334);
    }

    public static Integer a(String str) {
        return a.get(str);
    }
}
