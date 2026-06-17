package com.bytedance.feedbackerlib.util;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g {
    private static final Map<String, Method> a = new HashMap();
    private static final HashMap<Class<?>, Class<?>> b;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        boolean isAssignableFrom;
        Class<?> cls2 = cls;
        com.bytedance.feedbackerlib.a.i(cls2, "The class must not be null");
        if (!(!TextUtils.isEmpty(str))) {
            throw new IllegalArgumentException("The method name must not be blank");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        if (clsArr.length > 0) {
            for (Class<?> cls3 : clsArr) {
                sb.append("#");
                sb.append(cls3.toString());
            }
        } else {
            sb.append("#");
            sb.append(Void.class.toString());
        }
        String sb2 = sb.toString();
        Map<String, Method> map = a;
        synchronized (map) {
            method = map.get(sb2);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        while (cls2 != null) {
            try {
                method = cls2.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method == null) {
                Method[] declaredMethods = cls2.getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Method method2 = declaredMethods[i];
                    if (method2 != null && TextUtils.equals(method2.getName(), str)) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        if (clsArr.length == parameterTypes.length) {
                            boolean z = true;
                            for (int i2 = 0; i2 < clsArr.length; i2++) {
                                Class<?> cls4 = clsArr[i2];
                                Class<?> cls5 = parameterTypes[i2];
                                if (cls5 == null) {
                                    isAssignableFrom = false;
                                } else if (cls4 == null) {
                                    isAssignableFrom = !cls5.isPrimitive();
                                } else {
                                    if (cls4.isPrimitive() && !cls5.isPrimitive()) {
                                        cls4 = b.get(cls4);
                                    }
                                    if (cls5.isPrimitive() && !cls4.isPrimitive()) {
                                        cls5 = b.get(cls5);
                                    }
                                    isAssignableFrom = cls5.isAssignableFrom(cls4);
                                }
                                if (!isAssignableFrom) {
                                    z = false;
                                }
                            }
                            if (z) {
                                method = method2;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
            }
            if (method != null) {
                method.setAccessible(true);
                Map<String, Method> map2 = a;
                synchronized (map2) {
                    map2.put(sb2, method);
                }
                return method;
            }
            cls2 = cls2.getSuperclass();
        }
        return null;
    }

    public static Object b(Object obj, String str, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object[] b2 = b.b(objArr);
        Class<?>[] c2 = b.c(b2);
        if (c2.length == 0) {
            c2 = b.b;
        }
        Object[] b3 = b.b(b2);
        Method a2 = a(obj.getClass(), str, c2);
        if (a2 != null) {
            return a2.invoke(obj, b3);
        }
        return null;
    }

    public static Object c(Class<?> cls, String str, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object[] b2 = b.b(objArr);
        Class<?>[] c2 = b.c(b2);
        if (c2.length == 0) {
            c2 = b.b;
        }
        Object[] b3 = b.b(b2);
        Method a2 = a(cls, str, c2);
        if (a2 != null) {
            return a2.invoke(null, b3);
        }
        return null;
    }
}
