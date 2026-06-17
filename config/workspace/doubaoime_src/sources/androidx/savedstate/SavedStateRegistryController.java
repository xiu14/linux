package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SavedStateRegistryController {
    public static final Companion Companion = new Companion(null);
    private boolean attached;
    private final SavedStateRegistryOwner owner;
    private final SavedStateRegistry savedStateRegistry;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SavedStateRegistryController create(SavedStateRegistryOwner savedStateRegistryOwner) {
            l.f(savedStateRegistryOwner, "owner");
            return new SavedStateRegistryController(savedStateRegistryOwner, null);
        }
    }

    private SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.owner = savedStateRegistryOwner;
        this.savedStateRegistry = new SavedStateRegistry();
    }

    public /* synthetic */ SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner, g gVar) {
        this(savedStateRegistryOwner);
    }

    public static final SavedStateRegistryController create(SavedStateRegistryOwner savedStateRegistryOwner) {
        return Companion.create(savedStateRegistryOwner);
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @MainThread
    public final void performAttach() {
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (!(lifecycle.getCurrentState() == Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.addObserver(new Recreator(this.owner));
        this.savedStateRegistry.performAttach$savedstate_release(lifecycle);
        this.attached = true;
    }

    @MainThread
    public final void performRestore(Bundle bundle) {
        if (!this.attached) {
            performAttach();
        }
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            this.savedStateRegistry.performRestore$savedstate_release(bundle);
        } else {
            StringBuilder M = e.a.a.a.a.M("performRestore cannot be called when owner is ");
            M.append(lifecycle.getCurrentState());
            throw new IllegalStateException(M.toString().toString());
        }
    }

    @MainThread
    public final void performSave(Bundle bundle) {
        l.f(bundle, "outBundle");
        this.savedStateRegistry.performSave(bundle);
    }
}
