package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.g;
import kotlin.s.c.l;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = g.G(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = g.F(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> cls, List<? extends Class<?>> list) {
        l.f(cls, "modelClass");
        l.f(list, "signature");
        Object[] constructors = cls.getConstructors();
        l.e(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            l.e(parameterTypes, "constructor.parameterTypes");
            List f0 = g.f0(parameterTypes);
            if (l.a(list, f0)) {
                l.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == f0.size() && f0.containsAll(list)) {
                StringBuilder M = e.a.a.a.a.M("Class ");
                M.append(cls.getSimpleName());
                M.append(" must have parameters in the proper order: ");
                M.append(list);
                throw new UnsupportedOperationException(M.toString());
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        l.f(cls, "modelClass");
        l.f(constructor, "constructor");
        l.f(objArr, com.heytap.mcssdk.constant.b.D);
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
        }
    }
}
