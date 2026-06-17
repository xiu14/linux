package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.push.settings.storage.k;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class g {
    private final ConcurrentHashMap<Class<? extends ISettings>, ISettings> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Class<? extends ISettings>, Object> b = new ConcurrentHashMap<>();

    g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends ISettings> T a(Context context, Class<T> cls) {
        i a = h.a();
        InvocationTargetException invocationTargetException = null;
        try {
            com.bytedance.push.settings.k.a aVar = (com.bytedance.push.settings.k.a) cls.getAnnotation(com.bytedance.push.settings.k.a.class);
            if (aVar != null) {
                return (T) b(context, cls, ((com.bytedance.push.settings.storage.i) a).a(context, aVar.supportMultiProcess(), aVar.storageKey(), null));
            }
        } catch (ClassNotFoundException e2) {
            ClassNotFoundException classNotFoundException = e2;
            classNotFoundException.printStackTrace();
            invocationTargetException = classNotFoundException;
        } catch (IllegalAccessException e3) {
            IllegalAccessException illegalAccessException = e3;
            illegalAccessException.printStackTrace();
            invocationTargetException = illegalAccessException;
        } catch (InstantiationException e4) {
            InstantiationException instantiationException = e4;
            instantiationException.printStackTrace();
            invocationTargetException = instantiationException;
        } catch (NoSuchMethodException e5) {
            NoSuchMethodException noSuchMethodException = e5;
            noSuchMethodException.printStackTrace();
            invocationTargetException = noSuchMethodException;
        } catch (InvocationTargetException e6) {
            InvocationTargetException invocationTargetException2 = e6;
            invocationTargetException2.printStackTrace();
            invocationTargetException = invocationTargetException2;
        }
        if (invocationTargetException != null) {
            throw new IllegalStateException("get settings instance error，please check warning log", invocationTargetException);
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    private static <T extends ISettings> ISettings b(Context context, Class<T> cls, k kVar) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ISettings iSettings = (ISettings) Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(k.class).newInstance(kVar);
        iSettings.updateSettings(context, null);
        return iSettings;
    }

    public <T extends ISettings> T c(Context context, Class<T> cls) {
        Object obj;
        ISettings iSettings;
        T t = (T) this.a.get(cls);
        if (t != null) {
            if (!this.b.containsKey(cls)) {
                return t;
            }
            this.b.remove(cls);
            return t;
        }
        synchronized (this.b) {
            obj = this.b.containsKey(cls) ? this.b.get(cls) : null;
            if (obj == null) {
                obj = new Object();
                this.b.put(cls, obj);
            }
        }
        synchronized (obj) {
            ISettings iSettings2 = this.a.get(cls);
            if (iSettings2 == null) {
                iSettings = a(context, cls);
                this.a.put(cls, iSettings);
            } else {
                iSettings = iSettings2;
            }
        }
        return (T) iSettings;
    }
}
