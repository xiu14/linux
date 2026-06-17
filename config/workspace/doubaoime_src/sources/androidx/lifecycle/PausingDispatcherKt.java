package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.s.b.p;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), pVar, dVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), pVar, dVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), pVar, dVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        int i = S.f10199c;
        return C0795d.s(q.f10173c.U(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, null), dVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, dVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, dVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, dVar);
    }
}
