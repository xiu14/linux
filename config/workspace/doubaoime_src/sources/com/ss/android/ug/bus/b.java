package com.ss.android.ug.bus;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {
    private static Map<Class, a> a = new ConcurrentHashMap();

    public static <T extends a> T a(Class<T> cls) {
        return (T) a.get(cls);
    }

    public static <T extends a> void b(Class<T> cls, a aVar) {
        if (aVar != null) {
            a.put(cls, aVar);
        }
    }
}
