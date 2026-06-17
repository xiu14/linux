package com.ss.alive.monitor.j;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class b {
    private static Map<Class<?>, Class<?>> a;
    private static Map<Class<?>, Class<?>> b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8256c = 0;

    static {
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Character.TYPE;
        Class<?> cls4 = Integer.TYPE;
        Class<?> cls5 = Long.TYPE;
        Class<?> cls6 = Float.TYPE;
        Class cls7 = Double.TYPE;
        a = new HashMap();
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        b.put(Byte.TYPE, Byte.class);
        b.put(Character.TYPE, Character.class);
        b.put(Short.TYPE, Short.class);
        b.put(cls4, Integer.class);
        b.put(cls5, Long.class);
        b.put(Double.TYPE, Double.class);
        b.put(cls6, Float.class);
        Map<Class<?>, Class<?>> map = b;
        Class<?> cls8 = Void.TYPE;
        map.put(cls8, cls8);
        for (Class<?> cls9 : b.keySet()) {
            Class<?> cls10 = b.get(cls9);
            if (cls10 != null && !cls9.equals(cls10)) {
                a.put(cls10, cls9);
            }
        }
    }
}
