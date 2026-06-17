package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.c;
import kotlin.s.b.l;

@ViewModelFactoryDsl
@SourceDebugExtension({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public final class InitializerViewModelFactoryBuilder {
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(c<T> cVar, l<? super CreationExtras, ? extends T> lVar) {
        kotlin.s.c.l.f(cVar, "clazz");
        kotlin.s.c.l.f(lVar, "initializer");
        this.initializers.add(new ViewModelInitializer<>(r.O(cVar), lVar));
    }

    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
