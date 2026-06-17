package com.bytedance.android.input.basic.c;

import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {
    private final Object a;
    private final boolean b = true;

    /* renamed from: com.bytedance.android.input.basic.c.a$a, reason: collision with other inner class name */
    public static class C0055a {
    }

    private a(Class<?> cls) {
        this.a = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d(java.lang.reflect.Method r5, java.lang.String r6, java.lang.Class<?>[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getName()
            boolean r6 = r0.equals(r6)
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L3a
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r6 = r5.length
            int r2 = r7.length
            if (r6 != r2) goto L36
            r6 = r0
        L15:
            int r2 = r7.length
            if (r6 >= r2) goto L34
            r2 = r7[r6]
            java.lang.Class<com.bytedance.android.input.basic.c.a$a> r3 = com.bytedance.android.input.basic.c.a.C0055a.class
            if (r2 != r3) goto L1f
            goto L31
        L1f:
            r2 = r5[r6]
            java.lang.Class r2 = i(r2)
            r3 = r7[r6]
            java.lang.Class r3 = i(r3)
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L36
        L31:
            int r6 = r6 + 1
            goto L15
        L34:
            r5 = r1
            goto L37
        L36:
            r5 = r0
        L37:
            if (r5 == 0) goto L3a
            r0 = r1
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.c.a.d(java.lang.reflect.Method, java.lang.String, java.lang.Class[]):boolean");
    }

    public static a e(Class<?> cls) {
        return new a(cls);
    }

    private static a f(Method method, Object obj, Object... objArr) throws b {
        if (method != null) {
            try {
                if ((!Modifier.isPublic(method.getModifiers()) || !Modifier.isPublic(method.getDeclaringClass().getModifiers())) && !method.isAccessible()) {
                    method.setAccessible(true);
                }
            } catch (Exception e2) {
                throw new b(e2);
            }
        }
        if (method.getReturnType() != Void.TYPE) {
            return new a(method.invoke(obj, objArr));
        }
        method.invoke(obj, objArr);
        return new a(obj);
    }

    private Method g(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> h = h();
        for (Method method : h.getMethods()) {
            if (d(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : h.getDeclaredMethods()) {
                if (d(method2, str, clsArr)) {
                    return method2;
                }
            }
            h = h.getSuperclass();
        } while (h != null);
        StringBuilder U = e.a.a.a.a.U("No similar method ", str, " with params ");
        U.append(Arrays.toString(clsArr));
        U.append(" could be found on type ");
        U.append(h());
        U.append(".");
        throw new NoSuchMethodException(U.toString());
    }

    public static Class<?> i(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public a a(String str) throws b {
        Object[] objArr = new Object[0];
        try {
            try {
                return f(b(str, null), this.a, objArr);
            } catch (NoSuchMethodException e2) {
                throw new b(e2);
            }
        } catch (NoSuchMethodException unused) {
            return f(g(str, null), this.a, objArr);
        }
    }

    public Method b(String str, Class... clsArr) throws NoSuchMethodException {
        Class<?>[] parameterTypes;
        Class<?> h = h();
        try {
            return h.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return h.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                    h = h.getSuperclass();
                }
            } while (h != null);
            for (Method method : h().getMethods()) {
                if (str.equals(method.getName()) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == clsArr.length) {
                    return method;
                }
            }
            throw new NoSuchMethodException();
        }
    }

    public <T> T c() {
        return (T) this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public Class<?> h() {
        return this.b ? (Class) this.a : this.a.getClass();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.a.toString();
    }

    private a(Object obj) {
        this.a = obj;
    }
}
