package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class SavedStateHandleSupport$savedStateHandlesVM$1$1 extends m implements l<CreationExtras, SavedStateHandlesVM> {
    public static final SavedStateHandleSupport$savedStateHandlesVM$1$1 INSTANCE = new SavedStateHandleSupport$savedStateHandlesVM$1$1();

    SavedStateHandleSupport$savedStateHandlesVM$1$1() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final SavedStateHandlesVM invoke(CreationExtras creationExtras) {
        kotlin.s.c.l.f(creationExtras, "$this$initializer");
        return new SavedStateHandlesVM();
    }
}
