package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import com.huawei.hms.framework.common.BundleUtil;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.g;
import kotlin.s.c.l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            GeneratedAdapter newInstance = constructor.newInstance(obj);
            l.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            l.e(name, "fullPackage");
            if (!(name.length() == 0)) {
                l.e(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                l.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            l.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(canonicalName);
            if (!(name.length() == 0)) {
                adapterName = name + '.' + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            l.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final String getAdapterName(String str) {
        l.f(str, PushClientConstants.TAG_CLASS_NAME);
        return e.a.a.a.a.J(new StringBuilder(), kotlin.text.a.E(str, ".", BundleUtil.UNDERLINE_TAG, false, 4, null), "_LifecycleAdapter");
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object obj) {
        l.f(obj, "object");
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, null);
        }
        if (z) {
            return (LifecycleEventObserver) obj;
        }
        Class<?> cls = obj.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
        l.c(list);
        List<Constructor<? extends GeneratedAdapter>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), obj));
        }
        int size = list2.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i = 0; i < size; i++) {
            generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter(list2.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            classToAdapters.put(cls, g.F(generatedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (isLifecycleParent(superclass)) {
            l.e(superclass, "superclass");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
            l.c(list);
            arrayList = new ArrayList(list);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        l.e(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (isLifecycleParent(cls2)) {
                l.e(cls2, "intrface");
                if (getObserverConstructorType(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls2);
                l.c(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(cls, arrayList);
        return 2;
    }
}
