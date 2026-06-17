package com.bytedance.push.settings.storage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class g {
    private static Map<String, f> a;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a = concurrentHashMap;
        concurrentHashMap.put("_contains", new a());
    }

    public static f a(String str) {
        return a.get(str);
    }
}
