package com.ss.alive.monitor.j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
class d {
    private static Object[] a = new Object[0];

    private static void a(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    a(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    static List<Class<?>> b(Class<?> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }
}
