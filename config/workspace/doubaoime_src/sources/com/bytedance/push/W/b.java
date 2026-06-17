package com.bytedance.push.W;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public class b extends e {

    /* renamed from: e, reason: collision with root package name */
    private static volatile b f5599e;

    public static b d() {
        if (f5599e == null) {
            synchronized (b.class) {
                if (f5599e == null) {
                    f5599e = new b();
                }
            }
        }
        return f5599e;
    }

    @Override // com.bytedance.push.W.e
    protected synchronized boolean b() {
        try {
            if (this.f5606d) {
                return true;
            }
            Field declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                com.bytedance.push.g0.f.m(this.a, "hook field because rawIActivityManager is null");
                return false;
            }
            if (obj2 instanceof b) {
                com.bytedance.push.g0.f.m(this.a, "not duplicate hook field because rawIActivityManager is ActivityTaskManagerHooker");
                return true;
            }
            this.b = obj2;
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Class.forName("android.app.IActivityManager")}, this));
            com.bytedance.push.g0.f.c(this.a, "success hook IActivityManager");
            return true;
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f(this.a, "error when hook IActivityManager ", th);
            return false;
        }
    }

    @Override // com.bytedance.push.W.e
    protected String c() {
        return "ActivityManagerHooker";
    }
}
