package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.D;

/* loaded from: classes2.dex */
final class l extends D {
    public static final l a = new l();

    private l() {
    }

    @Override // kotlinx.coroutines.D
    public void dispatch(kotlin.r.f fVar, Runnable runnable) {
        b.f10323f.U(runnable, k.f10332g, false);
    }

    @Override // kotlinx.coroutines.D
    public void dispatchYield(kotlin.r.f fVar, Runnable runnable) {
        b.f10323f.U(runnable, k.f10332g, true);
    }
}
