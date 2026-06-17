package e.b.i.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class d {
    private static final Class<?>[] a;
    private static final Map<Class<?>, Class<?>> b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f9566c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9567d = 0;

    static {
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Class<?> cls3 = Float.TYPE;
        a = new Class[]{Byte.TYPE, Short.TYPE, Character.TYPE, cls, cls2, cls3, Double.TYPE};
        HashMap hashMap = new HashMap();
        b = hashMap;
        f9566c = new HashMap();
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(cls2, Long.class);
        hashMap.put(cls, Integer.class);
        hashMap.put(cls3, Float.class);
        hashMap.put(Double.TYPE, Double.class);
        Class cls4 = Void.TYPE;
        hashMap.put(cls4, cls4);
        for (Class<?> cls5 : hashMap.keySet()) {
            Class<?> cls6 = b.get(cls5);
            if (!cls5.equals(cls6)) {
                f9566c.put(cls6, cls5);
            }
        }
    }

    static int a(Class<?>[] clsArr, Class<?>[] clsArr2, Class<?>[] clsArr3) {
        float b2 = b(clsArr3, clsArr);
        float b3 = b(clsArr3, clsArr2);
        if (b2 < b3) {
            return -1;
        }
        return b3 < b2 ? 1 : 0;
    }

    private static float b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr[i];
            Class<?> cls2 = clsArr2[i];
            if (cls2.isPrimitive()) {
                if (cls.isPrimitive()) {
                    f2 = 0.0f;
                } else {
                    cls = f9566c.get(cls);
                    f2 = 0.1f;
                }
                int i2 = 0;
                while (cls != cls2) {
                    Class<?>[] clsArr3 = a;
                    if (i2 < clsArr3.length) {
                        if (cls == clsArr3[i2]) {
                            f2 += 0.1f;
                            if (i2 < clsArr3.length - 1) {
                                cls = clsArr3[i2 + 1];
                            }
                        }
                        i2++;
                    }
                }
            } else {
                f2 = 0.0f;
                while (true) {
                    if (cls == null || cls2.equals(cls)) {
                        break;
                    }
                    if (cls2.isInterface() && c(cls, cls2, true)) {
                        f2 += 0.25f;
                        break;
                    }
                    f2 += 1.0f;
                    cls = cls.getSuperclass();
                }
                if (cls == null) {
                    f2 += 1.5f;
                }
            }
            f3 += f2;
        }
        return f3;
    }

    static boolean c(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive()) {
                if (cls.isPrimitive()) {
                    cls = b.get(cls);
                }
                if (cls == null) {
                    return false;
                }
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = f9566c.get(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        if (!cls3.equals(cls)) {
            Class cls4 = Long.TYPE;
            if (cls4.equals(cls)) {
                if (!Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
                    return false;
                }
            } else {
                if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                    return false;
                }
                Class cls5 = Float.TYPE;
                if (cls5.equals(cls)) {
                    return Double.TYPE.equals(cls2);
                }
                boolean z2 = cls3.equals(cls2) || cls4.equals(cls2) || cls5.equals(cls2) || Double.TYPE.equals(cls2);
                if (Character.TYPE.equals(cls) || Short.TYPE.equals(cls)) {
                    return z2;
                }
                if (!Byte.TYPE.equals(cls)) {
                    return false;
                }
                if (!Short.TYPE.equals(cls2) && !z2) {
                    return false;
                }
            }
        } else if (!Long.TYPE.equals(cls2) && !Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean d(AccessibleObject accessibleObject) {
        if (accessibleObject != 0 && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers())) {
                if ((member.getDeclaringClass().getModifiers() & 7) == 0) {
                    try {
                        accessibleObject.setAccessible(true);
                        return true;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return false;
    }
}
