package com.bytedance.applog.w;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class i {
    private static final CopyOnWriteArraySet<f> a = new CopyOnWriteArraySet<>();
    private static final Map<String, f> b = new ConcurrentHashMap();

    public static void a(g gVar) {
        if (gVar == null) {
            return;
        }
        CopyOnWriteArraySet<f> copyOnWriteArraySet = a;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator<f> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().a(gVar);
        }
    }

    public static f b(String str) {
        if (str != null && str.length() > 0) {
            return b.get(str);
        }
        return null;
    }

    public static Iterator<f> c() {
        return b.values().iterator();
    }

    public static boolean d() {
        return a.isEmpty() && b.isEmpty();
    }

    public static void e(String str, f fVar) {
        b.put(str, fVar);
    }
}
