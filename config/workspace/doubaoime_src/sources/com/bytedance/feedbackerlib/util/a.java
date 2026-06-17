package com.bytedance.feedbackerlib.util;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private static final Map<String, Field> a = new HashMap();

    public static Field a(Class<?> cls, String str) {
        Field field;
        com.bytedance.feedbackerlib.a.i(cls, "The class must not be null");
        if (!(!TextUtils.isEmpty(str))) {
            throw new IllegalArgumentException("The field name must not be blank");
        }
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
        com.bytedance.feedbackerlib.a.i(obj, "target object must not be null");
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
