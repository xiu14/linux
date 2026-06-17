package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ViewModelProviderGetKt {
    public static final CreationExtras defaultCreationExtras(ViewModelStoreOwner viewModelStoreOwner) {
        l.f(viewModelStoreOwner, "owner");
        return viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        l.f(viewModelProvider, "<this>");
        l.i();
        throw null;
    }
}
