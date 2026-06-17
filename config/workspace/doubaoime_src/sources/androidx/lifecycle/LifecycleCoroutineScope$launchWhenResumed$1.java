package androidx.lifecycle;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {375}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LifecycleCoroutineScope$launchWhenResumed$1 extends i implements p<G, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ p<G, kotlin.r.d<? super o>, Object> $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LifecycleCoroutineScope$launchWhenResumed$1(LifecycleCoroutineScope lifecycleCoroutineScope, p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar, kotlin.r.d<? super LifecycleCoroutineScope$launchWhenResumed$1> dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = pVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        return new LifecycleCoroutineScope$launchWhenResumed$1(this.this$0, this.$block, dVar);
    }

    @Override // kotlin.s.b.p
    public final Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        return ((LifecycleCoroutineScope$launchWhenResumed$1) create(g2, dVar)).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            r.k0(obj);
            Lifecycle lifecycle$lifecycle_common = this.this$0.getLifecycle$lifecycle_common();
            p<G, kotlin.r.d<? super o>, Object> pVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, pVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.k0(obj);
        }
        return o.a;
    }
}
