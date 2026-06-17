package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LifecycleCoroutineScopeImpl$register$1 extends i implements p<G, kotlin.r.d<? super o>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, kotlin.r.d<? super LifecycleCoroutineScopeImpl$register$1> dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, dVar);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // kotlin.s.b.p
    public final Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(g2, dVar)).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.k0(obj);
        G g2 = (G) this.L$0;
        if (this.this$0.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            this.this$0.getLifecycle$lifecycle_common().addObserver(this.this$0);
        } else {
            C0795d.e(g2.getCoroutineContext(), null, 1, null);
        }
        return o.a;
    }
}
