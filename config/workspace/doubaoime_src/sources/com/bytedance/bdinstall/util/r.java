package com.bytedance.bdinstall.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class r {
    private static final Map<String, Object> a = new ConcurrentHashMap();

    public static Object a(String str) throws IllegalArgumentException {
        Map<String, Object> map = a;
        Object obj = map.get(str);
        if (obj != null) {
            return obj;
        }
        String a2 = q.a(str);
        if (a2 != null) {
            map.put(str, a2);
        }
        return a2;
    }
}
