package com.ss.alive.monitor.j;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {
    private static final Map<String, Method> a = new HashMap();

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        return interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (Throwable unused) {
                        Method a2 = a(interfaces[i], str, clsArr);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        r6 = r8.getMethod(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method b(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>... r8) throws java.lang.NoSuchMethodException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            r0.append(r7)
            int r2 = r8.length
            r3 = 0
            if (r2 <= 0) goto L2b
            int r2 = r8.length
            r4 = r3
        L1a:
            if (r4 >= r2) goto L34
            r5 = r8[r4]
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            r0.append(r1)
            int r4 = r4 + 1
            goto L1a
        L2b:
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L34:
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, java.lang.reflect.Method> r1 = com.ss.alive.monitor.j.c.a
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
            r1 = 1
            if (r2 == 0) goto L4f
            boolean r6 = r2.isAccessible()
            if (r6 != 0) goto L4e
            r2.setAccessible(r1)
        L4e:
            return r2
        L4f:
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)
            int r7 = com.ss.alive.monitor.j.b.f8256c
            if (r6 == 0) goto L68
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isPublic(r7)
            if (r7 == 0) goto L68
            boolean r7 = r6.isSynthetic()
            if (r7 != 0) goto L68
            r3 = r1
        L68:
            r7 = 0
            if (r3 != 0) goto L6c
            goto La3
        L6c:
            java.lang.Class r8 = r6.getDeclaringClass()
            int r1 = r8.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L7b
            goto La6
        L7b:
            java.lang.String r1 = r6.getName()
            java.lang.Class[] r6 = r6.getParameterTypes()
            java.lang.reflect.Method r2 = a(r8, r1, r6)
            if (r2 != 0) goto La5
            java.lang.Class r8 = r8.getSuperclass()
        L8d:
            if (r8 == 0) goto La3
            int r2 = r8.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 == 0) goto L9e
            java.lang.reflect.Method r6 = r8.getMethod(r1, r6)     // Catch: java.lang.Throwable -> La3
            goto La6
        L9e:
            java.lang.Class r8 = r8.getSuperclass()
            goto L8d
        La3:
            r6 = r7
            goto La6
        La5:
            r6 = r2
        La6:
            java.util.Map<java.lang.String, java.lang.reflect.Method> r7 = com.ss.alive.monitor.j.c.a
            monitor-enter(r7)
            if (r6 == 0) goto Lae
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> Lb0
        Lae:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb0
            return r6
        Lb0:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb0
            throw r6
        Lb3:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.j.c.b(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
