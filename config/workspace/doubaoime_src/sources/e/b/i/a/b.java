package e.b.i.a;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    private static final Map<String, Field> a = new HashMap();

    public static Field a(Class<?> cls, String str) {
        Field field;
        String str2 = cls.toString() + "#" + str;
        Map<String, Field> map = a;
        synchronized (map) {
            field = map.get(str2);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = a;
                synchronized (map2) {
                    continue;
                    map2.put(str2, declaredField);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object b(Object obj, String str) throws IllegalAccessException {
        Field a2 = a(obj.getClass(), str);
        if (a2 == null) {
            return null;
        }
        if (!a2.isAccessible()) {
            a2.setAccessible(true);
        }
        return a2.get(obj);
    }
}
