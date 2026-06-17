package com.bytedance.news.common.service.manager;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {
    private static final ConcurrentHashMap<Class, Object> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Class, a<?>> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<Class, b> f5488c = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000f, B:10:0x0011, B:12:0x001b, B:14:0x0024, B:15:0x0027, B:17:0x0029, B:24:0x0050, B:25:0x0053, B:27:0x0055), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: all -> 0x0057, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000f, B:10:0x0011, B:12:0x001b, B:14:0x0024, B:15:0x0027, B:17:0x0029, B:24:0x0050, B:25:0x0053, B:27:0x0055), top: B:4:0x0009 }] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T a(java.lang.Class<T> r3) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.lang.Object> r0 = com.bytedance.news.common.service.manager.c.a
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L5a
            monitor-enter(r3)
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L11
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            return r0
        L11:
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, com.bytedance.news.common.service.manager.a<?>> r0 = com.bytedance.news.common.service.manager.c.b     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L57
            com.bytedance.news.common.service.manager.a r1 = (com.bytedance.news.common.service.manager.a) r1     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L29
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L57
            r0.remove(r3)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L29
            b(r3, r1)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            return r1
        L29:
            java.lang.String r0 = r3.getName()     // Catch: java.lang.Throwable -> L57
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L57
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "%s__ServiceProxy"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.Throwable -> L57
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r0 instanceof com.bytedance.news.common.service.manager.IServiceProxy     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L4c
            com.bytedance.news.common.service.manager.IServiceProxy r0 = (com.bytedance.news.common.service.manager.IServiceProxy) r0     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L4c
            goto L4d
        L4c:
            r0 = 0
        L4d:
            r1 = r0
            if (r1 == 0) goto L55
            b(r3, r1)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            return r1
        L55:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            goto L5a
        L57:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            throw r0
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.news.common.service.manager.c.a(java.lang.Class):java.lang.Object");
    }

    private static <T> void b(Class<T> cls, T t) {
        a.put(cls, t);
        ConcurrentHashMap<Class, b> concurrentHashMap = f5488c;
        b bVar = concurrentHashMap.get(cls);
        if (bVar != null) {
            bVar.a(t);
            concurrentHashMap.remove(cls);
        }
    }

    public static <T> void c(Class<T> cls, a<T> aVar) {
        b.put(cls, aVar);
    }

    public static <T> void d(Class<T> cls, T t) {
        a.put(cls, t);
    }
}
