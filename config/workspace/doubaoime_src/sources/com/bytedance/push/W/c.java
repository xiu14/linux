package com.bytedance.push.W;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public class c extends e {

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f5600e;

    public static c d() {
        if (f5600e == null) {
            synchronized (c.class) {
                if (f5600e == null) {
                    f5600e = new c();
                }
            }
        }
        return f5600e;
    }

    @Override // com.bytedance.push.W.e
    protected synchronized boolean b() {
        try {
            if (this.f5606d) {
                return true;
            }
            Class<?> cls = Class.forName("android.app.ActivityTaskManager");
            Field declaredField = cls.getDeclaredField("IActivityTaskManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Class<?> cls2 = Class.forName("android.util.Singleton");
            try {
                cls.getDeclaredMethod("getService", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.push.g0.f.e(this.a, "error when invoke ActivityTaskManager#getService:" + th.getLocalizedMessage() + " use IActivityTaskManagerSingleton.get backup");
                Method declaredMethod = cls2.getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new Object[0]);
            }
            Field declaredField2 = cls2.getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                com.bytedance.push.g0.f.m(this.a, "hook field because rawIActivityManager is null");
                return false;
            }
            Class<?> cls3 = Class.forName("android.app.IActivityTaskManager");
            if (obj2 instanceof c) {
                com.bytedance.push.g0.f.m(this.a, "not duplicate hook field because rawIActivityManager is ActivityTaskManagerHooker");
                return true;
            }
            this.b = obj2;
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls3}, this));
            com.bytedance.push.g0.f.c(this.a, "success hook ActivityTaskManager");
            return true;
        } catch (Throwable th2) {
            com.bytedance.push.g0.f.f(this.a, "error when hook IActivityTaskManager ", th2);
            return false;
        }
    }

    @Override // com.bytedance.push.W.e
    protected String c() {
        return "ActivityTaskManagerHooker";
    }
}
