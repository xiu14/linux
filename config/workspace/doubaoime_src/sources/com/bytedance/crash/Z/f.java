package com.bytedance.crash.Z;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {
    private static final Map<Class<?>, Class<?>> a;

    public static class a<T> {
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

    public static <T> T a(Object obj, String str, Object... objArr) {
        try {
            return (T) b(obj, str, objArr);
        } catch (Exception e2) {
            String str2 = "Meet exception when call Method '" + str + "' in " + obj;
            if (!com.bytedance.crash.N.h.d()) {
                return null;
            }
            Log.w("JavaCalls", str2, e2);
            return null;
        }
    }

    private static <T> T b(Object obj, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Class<?> cls = obj.getClass();
        Object[] objArr2 = null;
        if (objArr == null || objArr.length <= 0) {
            clsArr = null;
        } else {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 == null || !(obj2 instanceof a)) {
                    clsArr[i] = obj2 == null ? null : obj2.getClass();
                } else {
                    clsArr[i] = null;
                }
            }
        }
        Method c2 = c(cls, str, clsArr);
        if (objArr != null && objArr.length > 0) {
            Object[] objArr3 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj3 = objArr[i2];
                if (obj3 == null || !(obj3 instanceof a)) {
                    objArr3[i2] = obj3;
                } else {
                    objArr3[i2] = null;
                }
            }
            objArr2 = objArr3;
        }
        return (T) c2.invoke(obj, objArr2);
    }

    private static Method c(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod == null) {
                throw new NoSuchMethodException();
            }
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            if (cls.getSuperclass() != null) {
                return c(cls.getSuperclass(), str, clsArr);
            }
            throw new NoSuchMethodException();
        }
    }
}
