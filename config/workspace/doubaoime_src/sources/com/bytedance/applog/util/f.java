package com.bytedance.applog.util;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class f {
    private static final List<String> a = Collections.singletonList("EventsSenderUtils");
    private static final Map<String, g> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final com.bytedance.applog.util.a<Boolean> f3900c = new a();

    static class a extends com.bytedance.applog.util.a<Boolean> {
        a() {
        }

        @Override // com.bytedance.applog.util.a
        protected Boolean a(Object[] objArr) {
            Class<?> cls;
            try {
                cls = Class.forName("com.bytedance.applog.et_verify.EventVerify");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            return Boolean.valueOf(cls != null);
        }
    }

    private static g a(String str) {
        com.bytedance.applog.util.a<Boolean> aVar = f3900c;
        g gVar = null;
        if (!aVar.b(new Object[0]).booleanValue()) {
            return null;
        }
        Map<String, g> map = b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        if (aVar.b(new Object[0]).booleanValue()) {
            com.bytedance.applog.c a2 = com.bytedance.applog.b.a(str);
            if (a2 == null) {
                a2 = (com.bytedance.applog.c) com.bytedance.applog.a.e();
            }
            try {
                Constructor<?> constructor = Class.forName("com.bytedance.applog.et_verify.EventVerify").getConstructor(com.bytedance.applog.c.class);
                constructor.setAccessible(true);
                g gVar2 = (g) constructor.newInstance(a2);
                if (gVar2 == null) {
                    com.bytedance.applog.w.k.z().f(a, "can't find event verify, should compile with ET", new Object[0]);
                } else {
                    com.bytedance.applog.w.k.z().n(a, "found event sender: {}", gVar2);
                }
                gVar = gVar2;
            } catch (Exception unused) {
                com.bytedance.applog.w.k.z().f(a, "can't find event verify, should compile with ET", new Object[0]);
            } catch (Throwable th) {
                com.bytedance.applog.w.k.z().f(a, "can't find event verify, should compile with ET", new Object[0]);
                throw th;
            }
        }
        b.put(str, gVar);
        return gVar;
    }

    public static boolean b(String str) {
        g a2;
        if (f3900c.b(new Object[0]).booleanValue() && (a2 = a(str)) != null) {
            return a2.isEnable();
        }
        return false;
    }

    public static void c(String str, String str2, JSONArray jSONArray) {
        g a2 = a(str);
        if (a2 != null) {
            a2.putEvent(str2, jSONArray);
        }
    }
}
