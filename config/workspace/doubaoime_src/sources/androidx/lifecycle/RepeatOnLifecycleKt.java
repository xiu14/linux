package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.s.b.p;
import kotlinx.coroutines.G;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar, kotlin.r.d<? super o> dVar) {
        if (!(state != Lifecycle.State.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return o.a;
        }
        Object I = r.I(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), dVar);
        return I == CoroutineSingletons.COROUTINE_SUSPENDED ? I : o.a;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar, kotlin.r.d<? super o> dVar) {
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, pVar, dVar);
        return repeatOnLifecycle == CoroutineSingletons.COROUTINE_SUSPENDED ? repeatOnLifecycle : o.a;
    }
}
