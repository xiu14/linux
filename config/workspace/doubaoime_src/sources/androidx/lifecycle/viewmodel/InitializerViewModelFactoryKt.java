package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, l<? super CreationExtras, ? extends VM> lVar) {
        kotlin.s.c.l.f(initializerViewModelFactoryBuilder, "<this>");
        kotlin.s.c.l.f(lVar, "initializer");
        kotlin.s.c.l.i();
        throw null;
    }

    public static final ViewModelProvider.Factory viewModelFactory(l<? super InitializerViewModelFactoryBuilder, o> lVar) {
        kotlin.s.c.l.f(lVar, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        lVar.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
