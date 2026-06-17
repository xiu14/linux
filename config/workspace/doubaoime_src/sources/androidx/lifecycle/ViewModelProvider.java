package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.g;
import kotlin.s.c.l;

@SourceDebugExtension({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* loaded from: classes.dex */
public class ViewModelProvider {
    private final CreationExtras defaultCreationExtras;
    private final Factory factory;
    private final ViewModelStore store;

    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
                l.f(viewModelInitializerArr, "initializers");
                return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
            }
        }

        static Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
            return Companion.from(viewModelInitializerArr);
        }

        default <T extends ViewModel> T create(Class<T> cls) {
            l.f(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            l.f(cls, "modelClass");
            l.f(creationExtras, "extras");
            return (T) create(cls);
        }
    }

    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = Companion.ViewModelKeyImpl.INSTANCE;
        private static NewInstanceFactory sInstance;

        public static final class Companion {

            private static final class ViewModelKeyImpl implements CreationExtras.Key<String> {
                public static final ViewModelKeyImpl INSTANCE = new ViewModelKeyImpl();

                private ViewModelKeyImpl() {
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory.sInstance == null) {
                    NewInstanceFactory.sInstance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory.sInstance;
                l.c(newInstanceFactory);
                return newInstanceFactory;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            l.f(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                l.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            l.f(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, null, 4, null);
        l.f(viewModelStore, "store");
        l.f(factory, "factory");
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        l.f(viewModelStore, "store");
        l.f(factory, "factory");
        l.f(creationExtras, "defaultCreationExtras");
        this.store = viewModelStore;
        this.factory = factory;
        this.defaultCreationExtras = creationExtras;
    }

    @MainThread
    public <T extends ViewModel> T get(Class<T> cls) {
        l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        private static AndroidViewModelFactory sInstance;
        private final Application application;
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<Application> APPLICATION_KEY = Companion.ApplicationKeyImpl.INSTANCE;

        public static final class Companion {

            private static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {
                public static final ApplicationKeyImpl INSTANCE = new ApplicationKeyImpl();

                private ApplicationKeyImpl() {
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Factory defaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner viewModelStoreOwner) {
                l.f(viewModelStoreOwner, "owner");
                return viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory() : NewInstanceFactory.Companion.getInstance();
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                l.f(application, "application");
                if (AndroidViewModelFactory.sInstance == null) {
                    AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory.sInstance;
                l.c(androidViewModelFactory);
                return androidViewModelFactory;
            }
        }

        private AndroidViewModelFactory(Application application, int i) {
            this.application = application;
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            l.f(cls, "modelClass");
            l.f(creationExtras, "extras");
            if (this.application != null) {
                return (T) create(cls);
            }
            Application application = (Application) creationExtras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(cls);
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            l.f(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            l.f(cls, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    l.e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (NoSuchMethodException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e5);
                }
            }
            return (T) super.create(cls);
        }
    }

    @MainThread
    public <T extends ViewModel> T get(String str, Class<T> cls) {
        T t;
        l.f(str, "key");
        l.f(cls, "modelClass");
        T t2 = (T) this.store.get(str);
        if (cls.isInstance(t2)) {
            Object obj = this.factory;
            OnRequeryFactory onRequeryFactory = obj instanceof OnRequeryFactory ? (OnRequeryFactory) obj : null;
            if (onRequeryFactory != null) {
                l.c(t2);
                onRequeryFactory.onRequery(t2);
            }
            l.d(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.defaultCreationExtras);
        mutableCreationExtras.set(NewInstanceFactory.VIEW_MODEL_KEY, str);
        try {
            t = (T) this.factory.create(cls, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            t = (T) this.factory.create(cls);
        }
        this.store.put(str, t);
        return t;
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i, g gVar) {
        this(viewModelStore, factory, (i & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner) {
        this(viewModelStoreOwner.getViewModelStore(), AndroidViewModelFactory.Companion.defaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner), ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        l.f(viewModelStoreOwner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        this(viewModelStoreOwner.getViewModelStore(), factory, ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        l.f(viewModelStoreOwner, "owner");
        l.f(factory, "factory");
    }
}
