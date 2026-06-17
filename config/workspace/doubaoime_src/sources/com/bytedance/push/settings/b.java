package com.bytedance.push.settings;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {
    private static final ConcurrentHashMap<Class, Object> a = new ConcurrentHashMap<>();

    public static <T> T a(Class<T> cls, c cVar) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = a;
        Object obj = (T) concurrentHashMap.get(cls);
        if (obj == null) {
            synchronized (b.class) {
                obj = concurrentHashMap.get(cls);
                if (obj == null) {
                    Object create = cVar.create(cls);
                    if (create != null) {
                        concurrentHashMap.put(cls, create);
                    }
                    obj = (T) create;
                }
            }
        }
        return (T) obj;
    }
}
