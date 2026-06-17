package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    public static final Companion Companion = new Companion(null);
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private Bundle defaultArgs;
    private Lifecycle lifecycle;
    private SavedStateRegistry savedStateRegistry;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public AbstractSavedStateViewModelFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        l.f(cls, "modelClass");
        l.f(creationExtras, "extras");
        String str = (String) creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) create(str, cls) : (T) create(str, cls, SavedStateHandleSupport.createSavedStateHandle(creationExtras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    protected abstract <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(ViewModel viewModel) {
        l.f(viewModel, "viewModel");
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            l.c(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            l.c(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        l.f(savedStateRegistryOwner, "owner");
        this.savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        this.lifecycle = savedStateRegistryOwner.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends ViewModel> T create(String str, Class<T> cls) {
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        l.c(savedStateRegistry);
        Lifecycle lifecycle = this.lifecycle;
        l.c(lifecycle);
        SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, this.defaultArgs);
        T t = (T) create(str, cls, create.getHandle());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return t;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
