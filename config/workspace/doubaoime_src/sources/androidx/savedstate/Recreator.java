package androidx.savedstate;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class Recreator implements LifecycleEventObserver {
    public static final String CLASSES_KEY = "classes_to_restore";
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryOwner owner;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {
        private final Set<String> classes;

        public SavedStateProvider(SavedStateRegistry savedStateRegistry) {
            l.f(savedStateRegistry, "registry");
            this.classes = new LinkedHashSet();
            savedStateRegistry.registerSavedStateProvider(Recreator.COMPONENT_KEY, this);
        }

        public final void add(String str) {
            l.f(str, PushClientConstants.TAG_CLASS_NAME);
            this.classes.add(str);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.CLASSES_KEY, new ArrayList<>(this.classes));
            return bundle;
        }
    }

    public Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        l.f(savedStateRegistryOwner, "owner");
        this.owner = savedStateRegistryOwner;
    }

    private final void reflectiveNew(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
            l.e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    l.e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((SavedStateRegistry.AutoRecreated) newInstance).onRecreated(this.owner);
                } catch (Exception e2) {
                    throw new RuntimeException(e.a.a.a.a.s("Failed to instantiate ", str), e2);
                }
            } catch (NoSuchMethodException e3) {
                StringBuilder M = e.a.a.a.a.M("Class ");
                M.append(asSubclass.getSimpleName());
                M.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(M.toString(), e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e.a.a.a.a.t("Class ", str, " wasn't found"), e4);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l.f(lifecycleOwner, "source");
        l.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        Bundle consumeRestoredStateForKey = this.owner.getSavedStateRegistry().consumeRestoredStateForKey(COMPONENT_KEY);
        if (consumeRestoredStateForKey == null) {
            return;
        }
        ArrayList<String> stringArrayList = consumeRestoredStateForKey.getStringArrayList(CLASSES_KEY);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it2 = stringArrayList.iterator();
        while (it2.hasNext()) {
            reflectiveNew(it2.next());
        }
    }
}
