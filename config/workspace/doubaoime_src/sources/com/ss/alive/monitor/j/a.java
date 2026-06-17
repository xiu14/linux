package com.ss.alive.monitor.j;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    private static final Map<String, Field> a = new HashMap();

    public static Field a(Class<?> cls, String str) {
        Field field;
        e.a(false, "cls can not be null", new Object[0]);
        e.a(TextUtils.isEmpty(str), "fieldName can not be null or empty", new Object[0]);
        String str2 = cls.toString() + "#" + str;
        Map<String, Field> map = a;
        synchronized (map) {
            field = map.get(str2);
        }
        if (field != null) {
            if (field.isAccessible()) {
                return field;
            }
            field.setAccessible(true);
            return field;
        }
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!Modifier.isPublic(declaredField.getModifiers())) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = a;
                synchronized (map2) {
                    continue;
                    map2.put(str2, declaredField);
                }
                return declaredField;
            } catch (Throwable unused) {
            }
        }
        Field field2 = null;
        List<Class<?>> b = d.b(cls);
        if (b != null) {
            Iterator<Class<?>> it2 = b.iterator();
            while (it2.hasNext()) {
                try {
                    Field field3 = it2.next().getField(str);
                    e.a(field2 != null, "field %s on %s is ambiguous, more than one interface have the field", str, cls);
                    field2 = field3;
                } catch (Throwable unused2) {
                }
            }
        }
        Map<String, Field> map3 = a;
        synchronized (map3) {
            if (field2 != null) {
                map3.put(str2, field2);
            }
        }
        return field2;
    }
}
