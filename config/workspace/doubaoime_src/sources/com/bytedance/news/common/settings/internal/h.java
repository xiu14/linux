package com.bytedance.news.common.settings.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.news.common.settings.api.annotation.ISettings;
import com.bytedance.services.apm.api.IEnsure;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class h {
    private final ConcurrentHashMap<Class<? extends ISettings>, ISettings> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Class<? extends ISettings>, Object> b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends ISettings> T a(Class<T> cls, com.bytedance.news.common.settings.a aVar) {
        InvocationTargetException invocationTargetException;
        com.bytedance.news.common.settings.api.annotation.a aVar2;
        boolean z;
        com.bytedance.news.common.settings.e.h m = aVar.m();
        try {
            aVar2 = (com.bytedance.news.common.settings.api.annotation.a) cls.getAnnotation(com.bytedance.news.common.settings.api.annotation.a.class);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            IEnsure iEnsure = (IEnsure) com.bytedance.news.common.service.manager.c.a(IEnsure.class);
            invocationTargetException = e2;
            if (iEnsure != null) {
                iEnsure.ensureNotReachHere(e2, "获取settings实例失败，ClassNotFoundException");
                invocationTargetException = e2;
            }
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            IEnsure iEnsure2 = (IEnsure) com.bytedance.news.common.service.manager.c.a(IEnsure.class);
            invocationTargetException = e3;
            if (iEnsure2 != null) {
                iEnsure2.ensureNotReachHere(e3, "获取settings实例失败，IllegalAccessException");
                invocationTargetException = e3;
            }
        } catch (InstantiationException e4) {
            e4.printStackTrace();
            IEnsure iEnsure3 = (IEnsure) com.bytedance.news.common.service.manager.c.a(IEnsure.class);
            invocationTargetException = e4;
            if (iEnsure3 != null) {
                iEnsure3.ensureNotReachHere(e4, "获取settings实例失败，InstantiationException");
                invocationTargetException = e4;
            }
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
            IEnsure iEnsure4 = (IEnsure) com.bytedance.news.common.service.manager.c.a(IEnsure.class);
            invocationTargetException = e5;
            if (iEnsure4 != null) {
                iEnsure4.ensureNotReachHere(e5, "获取settings实例失败，NoSuchMethodException");
                invocationTargetException = e5;
            }
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            IEnsure iEnsure5 = (IEnsure) com.bytedance.news.common.service.manager.c.a(IEnsure.class);
            invocationTargetException = e6;
            if (iEnsure5 != null) {
                iEnsure5.ensureNotReachHere(e6, "获取settings实例失败，InvocationTargetException");
                invocationTargetException = e6;
            }
        }
        if (aVar2 == null) {
            invocationTargetException = null;
            if (invocationTargetException != null) {
                throw new IllegalStateException("获取settings实例失败，检查warning日志确认问题", invocationTargetException);
            }
            throw new IllegalStateException("获取settings实例失败，检查warning日志确认问题");
        }
        aVar.e();
        try {
            z = com.bytedance.news.common.settings.e.j.a.c();
        } catch (RuntimeException e7) {
            e7.printStackTrace();
            z = false;
        }
        aVar.t();
        String storageKey = aVar2.storageKey();
        if (z) {
            try {
                com.bytedance.news.common.settings.e.j.a.i(false);
            } catch (RuntimeException e8) {
                e8.printStackTrace();
            }
        }
        return aVar.u() ? (T) b(cls, m.a(storageKey, true)) : (T) b(cls, m.a(storageKey, true));
    }

    private static <T extends ISettings> ISettings b(Class<T> cls, com.bytedance.news.common.settings.e.g gVar) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ISettings iSettings = (ISettings) Class.forName(cls.getName() + "$$Impl", true, cls.getClassLoader()).getConstructor(com.bytedance.news.common.settings.e.g.class).newInstance(gVar);
        iSettings.updateSettings(null);
        return iSettings;
    }

    public <T extends ISettings> T c(Class<T> cls, com.bytedance.news.common.settings.a aVar, String str) {
        Object obj;
        T t = (T) this.a.get(cls);
        if (t == null) {
            com.bytedance.news.common.settings.api.annotation.a aVar2 = (com.bytedance.news.common.settings.api.annotation.a) cls.getAnnotation(com.bytedance.news.common.settings.api.annotation.a.class);
            String str2 = aVar2 == null ? "" : aVar2.settingsId();
            if (!str.equals(str2)) {
                throw new IllegalArgumentException(e.a.a.a.a.t("Settings声明id与Manager不匹配：", str2, " - "));
            }
            synchronized (this.b) {
                obj = this.b.containsKey(cls) ? this.b.get(cls) : null;
                if (obj == null) {
                    obj = new Object();
                    this.b.put(cls, obj);
                }
            }
            synchronized (obj) {
                t = (T) this.a.get(cls);
                if (t == null) {
                    ISettings a = a(cls, aVar);
                    this.a.put(cls, a);
                    t = (T) a;
                }
            }
        } else if (this.b.containsKey(cls)) {
            this.b.remove(cls);
        }
        return t;
    }

    public synchronized void d(@NonNull com.bytedance.news.common.settings.e.d dVar, @NonNull com.bytedance.news.common.settings.a aVar, boolean z) {
        Iterator<ISettings> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            it2.next().updateSettings(dVar);
        }
        Context a = a.a();
        g.b(a).f(dVar.b(), aVar.d());
        e.c(a).h(dVar, aVar, z);
    }
}
