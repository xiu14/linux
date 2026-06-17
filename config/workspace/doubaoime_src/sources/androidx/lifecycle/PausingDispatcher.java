package androidx.lifecycle;

import kotlin.s.c.l;
import kotlinx.coroutines.D;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class PausingDispatcher extends D {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // kotlinx.coroutines.D
    public void dispatch(kotlin.r.f fVar, Runnable runnable) {
        l.f(fVar, "context");
        l.f(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(fVar, runnable);
    }

    @Override // kotlinx.coroutines.D
    public boolean isDispatchNeeded(kotlin.r.f fVar) {
        l.f(fVar, "context");
        int i = S.f10199c;
        if (q.f10173c.U().isDispatchNeeded(fVar)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
