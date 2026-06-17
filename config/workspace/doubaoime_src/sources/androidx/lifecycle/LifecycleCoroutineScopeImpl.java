package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final kotlin.r.f coroutineContext;
    private final Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, kotlin.r.f fVar) {
        l.f(lifecycle, "lifecycle");
        l.f(fVar, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = fVar;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            C0795d.e(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, kotlinx.coroutines.G
    public kotlin.r.f getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l.f(lifecycleOwner, "source");
        l.f(event, NotificationCompat.CATEGORY_EVENT);
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            C0795d.e(getCoroutineContext(), null, 1, null);
        }
    }

    public final void register() {
        int i = S.f10199c;
        C0795d.l(this, q.f10173c.U(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2, null);
    }
}
