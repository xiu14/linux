package com.bytedance.bdinstall.o0;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {
    public static final ConcurrentHashMap<String, d> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Class, Object> a = new ConcurrentHashMap<>();

    public d() {
        new ConcurrentHashMap();
    }

    public static <T> T a(Class<T> cls, String str) {
        d dVar = b.get(str);
        if (dVar != null) {
            return (T) dVar.a.get(cls);
        }
        return null;
    }

    public static <T> void b(Class<T> cls, T t, String str) {
        ConcurrentHashMap<String, d> concurrentHashMap = b;
        d dVar = concurrentHashMap.get(str);
        if (dVar == null) {
            dVar = new d();
            concurrentHashMap.put(str, dVar);
        }
        dVar.a.put(cls, t);
    }
}
