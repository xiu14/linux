package e.b.b.m;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {
    private static final ConcurrentHashMap<Class, Object> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Class, a<?>> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<Class, b> f9491c = new ConcurrentHashMap<>();

    public static <T> T a(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (c.class) {
                ConcurrentHashMap<Class, a<?>> concurrentHashMap2 = b;
                a<?> aVar = concurrentHashMap2.get(cls);
                if (aVar != null) {
                    t = (T) aVar.a();
                    concurrentHashMap2.remove(cls);
                    if (t != null) {
                        concurrentHashMap.put(cls, t);
                        ConcurrentHashMap<Class, b> concurrentHashMap3 = f9491c;
                        b bVar = concurrentHashMap3.get(cls);
                        if (bVar != null) {
                            bVar.a(t);
                            concurrentHashMap3.remove(cls);
                        }
                        return t;
                    }
                }
            }
        }
        return t;
    }

    public static <T> void b(Class<T> cls, a<T> aVar) {
        b.put(cls, aVar);
    }

    public static <T> void c(Class<T> cls, T t) {
        a.put(cls, t);
    }
}
