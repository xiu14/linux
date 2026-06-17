package com.bytedance.news.common.settings.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {
    private static final ConcurrentHashMap<Class, Object> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Class, Object> b = new ConcurrentHashMap<>();

    public static <T> T a(Class<T> cls, d dVar) {
        Object obj;
        Object obj2;
        ConcurrentHashMap<Class, Object> concurrentHashMap = a;
        T t = (T) concurrentHashMap.get(cls);
        if (t != null) {
            ConcurrentHashMap<Class, Object> concurrentHashMap2 = b;
            if (!concurrentHashMap2.containsKey(cls)) {
                return t;
            }
            concurrentHashMap2.remove(cls);
            return t;
        }
        ConcurrentHashMap<Class, Object> concurrentHashMap3 = b;
        synchronized (concurrentHashMap3) {
            obj = concurrentHashMap3.containsKey(cls) ? concurrentHashMap3.get(cls) : null;
            if (obj == null) {
                obj = new Object();
                concurrentHashMap3.put(cls, obj);
            }
        }
        synchronized (obj) {
            Object obj3 = concurrentHashMap.get(cls);
            if (obj3 == null) {
                obj2 = dVar.create(cls);
                if (obj2 != null) {
                    concurrentHashMap.put(cls, obj2);
                }
            } else {
                obj2 = obj3;
            }
        }
        return (T) obj2;
    }
}
