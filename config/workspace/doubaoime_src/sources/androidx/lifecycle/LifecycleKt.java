package androidx.lifecycle;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;
import kotlinx.coroutines.r0;

/* loaded from: classes.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        l.f(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            kotlin.r.f a = C0795d.a(null, 1);
            int i = S.f10199c;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, r.d0((r0) a, q.f10173c.U()));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }
}
