package com.bytedance.apm.s.i;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private Map<String, b> a = new HashMap();

    public void a(String str, b bVar) {
        this.a.put(str, bVar);
    }

    public void b() throws Throwable {
        if (this.a.size() == 0) {
            return;
        }
        Class<?> cls = Class.forName("android.app.SystemServiceRegistry");
        Field declaredField = cls.getDeclaredField("SYSTEM_SERVICE_FETCHERS");
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(null);
        for (Map.Entry<String, b> entry : this.a.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            Object obj = map.get(key);
            map.put(key, Proxy.newProxyInstance(cls.getClassLoader(), obj.getClass().getSuperclass().getInterfaces(), new c(obj, value)));
        }
    }
}
