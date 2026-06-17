package com.bytedance.frameworks.baselib.network.i;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Method> f5250c;
    private final Object a;
    private final boolean b = true;

    private static class a {
        private a() {
        }
    }

    static {
        new ConcurrentHashMap();
        f5250c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    private b(Class<?> cls) {
        this.a = cls;
    }

    public static <T extends AccessibleObject> T a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        try {
            if (!t.isAccessible()) {
                t.setAccessible(true);
            }
            return t;
        } catch (SecurityException e2) {
            throw new c("Failed to set accessible for " + t, e2, t.getClass().getSimpleName());
        }
    }

    private String b(String str, String str2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("#");
        sb.append(str2);
        if (clsArr != null && clsArr.length > 0) {
            sb.append("[");
            for (int i = 0; i < clsArr.length; i++) {
                Class<?> cls = clsArr[i];
                sb.append(cls != null ? cls.getName() : "null");
                if (i != clsArr.length - 1) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }

    private Method d(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        String b = b(g(), str, clsArr);
        Method method = f5250c.get(b);
        if (method != null) {
            return method;
        }
        Class<?> l = l();
        Method method2 = null;
        while (l != null && method2 == null) {
            try {
                try {
                    method2 = l.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    method2 = l.getDeclaredMethod(str, clsArr);
                }
            } catch (NoSuchMethodException unused2) {
                l = l.getSuperclass();
            }
        }
        if (method2 == null) {
            throw new NoSuchMethodException();
        }
        a(method2);
        f5250c.put(b, method2);
        return method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.reflect.Method e(java.lang.String r14, java.lang.Class<?>[] r15) throws java.lang.NoSuchMethodException {
        /*
            r13 = this;
            java.lang.Class r0 = r13.l()
            r1 = 0
            r2 = r1
        L6:
            if (r0 == 0) goto L65
            if (r2 != 0) goto L65
            java.lang.reflect.Method[] r3 = r0.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L11:
            if (r6 >= r4) goto L5e
            r7 = r3[r6]
            java.lang.String r8 = r7.getName()
            boolean r8 = r8.equals(r14)
            if (r8 == 0) goto L5b
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            int r9 = r15.length
            if (r8 != r9) goto L5b
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r9 = r8.length
            int r10 = r15.length
            if (r9 == r10) goto L31
        L2f:
            r8 = r5
            goto L57
        L31:
            r9 = r5
        L32:
            int r10 = r8.length
            if (r9 >= r10) goto L56
            r10 = r8[r9]
            java.lang.Class r10 = m(r10)
            r11 = r15[r9]
            java.lang.Class<com.bytedance.frameworks.baselib.network.i.b$a> r12 = com.bytedance.frameworks.baselib.network.i.b.a.class
            if (r11 != r12) goto L43
            r11 = r1
            goto L49
        L43:
            r11 = r15[r9]
            java.lang.Class r11 = m(r11)
        L49:
            if (r11 != 0) goto L4c
            goto L53
        L4c:
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 != 0) goto L53
            goto L2f
        L53:
            int r9 = r9 + 1
            goto L32
        L56:
            r8 = 1
        L57:
            if (r8 == 0) goto L5b
            r2 = r7
            goto L5e
        L5b:
            int r6 = r6 + 1
            goto L11
        L5e:
            if (r2 != 0) goto L6
            java.lang.Class r0 = r0.getSuperclass()
            goto L6
        L65:
            if (r2 == 0) goto L78
            a(r2)
            java.lang.String r0 = r13.g()
            java.lang.String r14 = r13.b(r0, r14, r15)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r15 = com.bytedance.frameworks.baselib.network.i.b.f5250c
            r15.put(r14, r2)
            return r2
        L78:
            java.lang.NoSuchMethodException r14 = new java.lang.NoSuchMethodException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.i.b.e(java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private String g() {
        return l().getName();
    }

    private b h(Method method, Object... objArr) throws c {
        try {
            a(method);
            return method.getReturnType() == Void.TYPE ? this : j(method.invoke(this.a, objArr));
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Failed to invoke method: ");
            M.append(method.getName());
            throw new c(M.toString(), e2, g(), method.getName(), Arrays.toString(method.getParameterTypes()));
        }
    }

    public static b i(Class<?> cls) {
        if (cls != null) {
            return new b(cls);
        }
        throw new c("Class object cannot be null", null, new String[0]);
    }

    public static b j(Object obj) {
        if (obj != null) {
            return new b(obj);
        }
        throw new c("Instance object cannot be null", null, new String[0]);
    }

    public static b k(String str) throws c {
        try {
            return i(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            throw new c(e.a.a.a.a.s("Class not found: ", str), e2, str);
        } catch (Exception e3) {
            throw new c(e.a.a.a.a.s("Failed to load class: ", str), e3, str);
        }
    }

    public static Class<?> m(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public b c(String str, Class<?>[] clsArr, Object... objArr) throws c {
        try {
            try {
                return h(d(str, clsArr), objArr);
            } catch (NoSuchMethodException unused) {
                return h(e(str, clsArr), objArr);
            }
        } catch (NoSuchMethodException e2) {
            throw new c(e.a.a.a.a.s("No method found: ", str), e2, g(), str, Arrays.toString(clsArr));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public <T> T f() {
        return (T) this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Class<?> l() {
        return this.b ? (Class) this.a : this.a.getClass();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("TTReflect{target=");
        M.append(this.a);
        M.append(", isClassTarget=");
        M.append(this.b);
        M.append(", targetClass=");
        return e.a.a.a.a.G(M, g(), '}');
    }

    private b(Object obj) {
        this.a = obj;
    }
}
