package com.bytedance.push.settings;

import android.content.Context;
import android.util.Log;
import com.bytedance.push.settings.storage.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class f {
    private final ConcurrentHashMap<Class<? extends ILocalSettings>, ILocalSettings> a = new ConcurrentHashMap<>();
    private final i b;

    f(i iVar) {
        this.b = iVar;
    }

    private <T extends ILocalSettings> T a(Context context, Class<T> cls) {
        i iVar = this.b;
        try {
            Constructor<?> constructor = Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(Context.class, k.class);
            com.bytedance.push.settings.k.a aVar = (com.bytedance.push.settings.k.a) cls.getAnnotation(com.bytedance.push.settings.k.a.class);
            if (aVar != null) {
                String storageKey = aVar.storageKey();
                boolean supportMultiProcess = aVar.supportMultiProcess();
                Log.d("SettingsManager", "createLocalSettingsInstance for " + storageKey);
                return (T) constructor.newInstance(context, ((com.bytedance.push.settings.storage.i) iVar).a(context, supportMultiProcess, storageKey, null));
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    <T extends ILocalSettings> T b(Context context, Class<T> cls) {
        T t = (T) this.a.get(cls);
        if (t == null) {
            synchronized (this) {
                t = (T) this.a.get(cls);
                if (t == null) {
                    ILocalSettings a = a(context, cls);
                    this.a.put(cls, a);
                    t = (T) a;
                }
            }
        }
        return t;
    }
}
