package com.bytedance.news.common.settings.internal;

import com.bytedance.news.common.settings.api.annotation.ILocalSettings;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class f {
    private final ConcurrentHashMap<Class<? extends ILocalSettings>, ILocalSettings> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Class<? extends ILocalSettings>, Object> b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends ILocalSettings> T a(Class<T> cls, com.bytedance.news.common.settings.a aVar) {
        InvocationTargetException invocationTargetException;
        Constructor<?> constructor;
        com.bytedance.news.common.settings.api.annotation.a aVar2;
        com.bytedance.news.common.settings.e.h m = aVar.m();
        try {
            constructor = Class.forName(cls.getName() + "$$Impl", true, cls.getClassLoader()).getConstructor(com.bytedance.news.common.settings.e.g.class);
            aVar2 = (com.bytedance.news.common.settings.api.annotation.a) cls.getAnnotation(com.bytedance.news.common.settings.api.annotation.a.class);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            invocationTargetException = e2;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            invocationTargetException = e3;
        } catch (InstantiationException e4) {
            e4.printStackTrace();
            invocationTargetException = e4;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
            invocationTargetException = e5;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            invocationTargetException = e6;
        }
        if (aVar2 == null) {
            invocationTargetException = null;
            throw new IllegalStateException("获取settings实例失败，检查warning日志确认问题", invocationTargetException);
        }
        if (com.bytedance.news.common.settings.e.j.a.n != null && com.bytedance.news.common.settings.e.j.a.n.a().booleanValue()) {
            aVar.o();
        }
        return (T) constructor.newInstance(m.b(aVar2.storageKey(), false, aVar2.isSupportMultiProcess()));
    }

    public <T extends ILocalSettings> T b(Class<T> cls, com.bytedance.news.common.settings.a aVar, String str) {
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
                    ILocalSettings a = a(cls, aVar);
                    if (a != null) {
                        this.a.put(cls, a);
                    }
                    t = (T) a;
                }
            }
        } else if (this.b.containsKey(cls)) {
            this.b.remove(cls);
        }
        return t;
    }
}
