package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class G {
    public static final G a;

    static {
        G f2;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            f2 = new C(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    f2 = new D(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    f2 = new F();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                f2 = new E(declaredMethod3);
            }
        }
        a = f2;
    }

    static void a(Class cls) {
        String a2 = l.a(cls);
        if (a2 != null) {
            throw new AssertionError(e.a.a.a.a.s("UnsafeAllocator is used for non-instantiable type: ", a2));
        }
    }

    public abstract <T> T b(Class<T> cls) throws Exception;
}
