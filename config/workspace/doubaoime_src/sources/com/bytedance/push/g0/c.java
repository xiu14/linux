package com.bytedance.push.g0;

import com.bytedance.common.utility.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {
    private static Method a;
    private static Method b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f5699c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f5700d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5701e = 0;

    static {
        new HashMap();
        HashMap hashMap = new HashMap();
        f5699c = hashMap;
        f5700d = new HashMap();
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Character.TYPE;
        Class cls4 = Integer.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Float.TYPE;
        Class cls7 = Double.TYPE;
        try {
            a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]);
            Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            Class.class.getDeclaredMethod("forName", String.class);
            hashMap.put(Boolean.TYPE, Boolean.class);
            hashMap.put(Byte.TYPE, Byte.class);
            hashMap.put(Character.TYPE, Character.class);
            hashMap.put(Short.TYPE, Short.class);
            hashMap.put(cls4, Integer.class);
            hashMap.put(cls5, Long.class);
            hashMap.put(Double.TYPE, Double.class);
            hashMap.put(cls6, Float.class);
            Class cls8 = Void.TYPE;
            hashMap.put(cls8, cls8);
            for (Map.Entry entry : hashMap.entrySet()) {
                Class<?> cls9 = (Class) entry.getKey();
                Class<?> cls10 = (Class) entry.getValue();
                if (!cls9.equals(cls10)) {
                    f5700d.put(cls10, cls9);
                }
            }
        } catch (Throwable th) {
            Logger.e("DoubleReflector", "DoubleReflectorinit failed", th);
        }
    }

    public static Field a(Class<?> cls, String str) {
        Field b2 = b(cls, str);
        if (b2 != null && !b2.isAccessible()) {
            b2.setAccessible(true);
        }
        return b2;
    }

    public static Field b(Class<?> cls, String str) {
        if (cls == null) {
            throw new IllegalArgumentException("The class must not be null !!!");
        }
        Method method = a;
        if (method == null) {
            return null;
        }
        try {
            return (Field) method.invoke(cls, str);
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("DoubleReflector");
            M.append(String.format("getField %s#%s failed !!!", cls.getName(), str));
            Logger.e("DoubleReflector", M.toString(), th);
            return null;
        }
    }

    public static Method c(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            throw new IllegalArgumentException("The class must not be null !!!");
        }
        Method method = b;
        if (method == null) {
            return null;
        }
        try {
            return (Method) method.invoke(cls, str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
