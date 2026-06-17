package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import e.a.a.a.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.l;

@SourceDebugExtension({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... viewModelInitializerArr) {
        l.f(viewModelInitializerArr, "initializers");
        this.initializers = viewModelInitializerArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        l.f(cls, "modelClass");
        l.f(creationExtras, "extras");
        T t = null;
        for (ViewModelInitializer<?> viewModelInitializer : this.initializers) {
            if (l.a(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), cls)) {
                Object invoke = viewModelInitializer.getInitializer$lifecycle_viewmodel_release().invoke(creationExtras);
                t = invoke instanceof ViewModel ? (T) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder M = a.M("No initializer set for given class ");
        M.append(cls.getName());
        throw new IllegalArgumentException(M.toString());
    }
}
