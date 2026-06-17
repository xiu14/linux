package com.bytedance.common.utility.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private static final Map<Class<?>, Class<?>> a;
    public static final /* synthetic */ int b = 0;

    /* renamed from: com.bytedance.common.utility.reflect.a$a, reason: collision with other inner class name */
    public static class C0178a<T> {
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        hashMap.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        hashMap.put(Long.class, cls4);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(cls, cls);
        Class cls5 = Byte.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        hashMap.put(cls7, cls7);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Object[] objArr2;
        if (objArr == null || objArr.length <= 0) {
            clsArr = null;
        } else {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null || !(obj instanceof C0178a)) {
                    clsArr[i] = obj == null ? null : obj.getClass();
                } else {
                    clsArr[i] = null;
                }
            }
        }
        Method b2 = b(cls, str, clsArr);
        if (objArr == null || objArr.length <= 0) {
            objArr2 = null;
        } else {
            objArr2 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 == null || !(obj2 instanceof C0178a)) {
                    objArr2[i2] = obj2;
                } else {
                    objArr2[i2] = null;
                }
            }
        }
        return (T) b2.invoke(null, objArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r13.length != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        if (r6.length == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Method b(java.lang.Class<?> r11, java.lang.String r12, java.lang.Class<?>... r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            java.lang.reflect.Method[] r0 = r11.getDeclaredMethods()
            java.lang.String r1 = "Method name must not be null."
            java.util.Objects.requireNonNull(r12, r1)
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            r4 = 1
            if (r3 >= r1) goto L6a
            r5 = r0[r3]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L67
            java.lang.Class[] r6 = r5.getParameterTypes()
            if (r6 != 0) goto L27
            if (r13 == 0) goto L63
            int r6 = r13.length
            if (r6 != 0) goto L5e
            goto L63
        L27:
            if (r13 != 0) goto L2d
            int r6 = r6.length
            if (r6 != 0) goto L5e
            goto L63
        L2d:
            int r7 = r6.length
            int r8 = r13.length
            if (r7 == r8) goto L32
            goto L5e
        L32:
            r7 = r2
        L33:
            int r8 = r6.length
            if (r7 >= r8) goto L63
            r8 = r6[r7]
            r9 = r13[r7]
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 != 0) goto L60
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r8 = com.bytedance.common.utility.reflect.a.a
            r9 = r6[r7]
            boolean r9 = r8.containsKey(r9)
            if (r9 == 0) goto L5e
            r9 = r6[r7]
            java.lang.Object r9 = r8.get(r9)
            java.lang.Class r9 = (java.lang.Class) r9
            r10 = r13[r7]
            java.lang.Object r8 = r8.get(r10)
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L60
        L5e:
            r6 = r2
            goto L64
        L60:
            int r7 = r7 + 1
            goto L33
        L63:
            r6 = r4
        L64:
            if (r6 == 0) goto L67
            goto L6b
        L67:
            int r3 = r3 + 1
            goto Lc
        L6a:
            r5 = 0
        L6b:
            if (r5 != 0) goto L82
            java.lang.Class r0 = r11.getSuperclass()
            if (r0 == 0) goto L7c
            java.lang.Class r11 = r11.getSuperclass()
            java.lang.reflect.Method r11 = b(r11, r12, r13)
            return r11
        L7c:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            r11.<init>()
            throw r11
        L82:
            r5.setAccessible(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.a.b(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
