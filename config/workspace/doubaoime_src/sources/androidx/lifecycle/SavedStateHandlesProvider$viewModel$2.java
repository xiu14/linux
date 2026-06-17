package androidx.lifecycle;

import kotlin.s.c.m;

/* loaded from: classes.dex */
final class SavedStateHandlesProvider$viewModel$2 extends m implements kotlin.s.b.a<SavedStateHandlesVM> {
    final /* synthetic */ ViewModelStoreOwner $viewModelStoreOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$viewModelStoreOwner = viewModelStoreOwner;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.s.b.a
    public final SavedStateHandlesVM invoke() {
        return SavedStateHandleSupport.getSavedStateHandlesVM(this.$viewModelStoreOwner);
    }
}
