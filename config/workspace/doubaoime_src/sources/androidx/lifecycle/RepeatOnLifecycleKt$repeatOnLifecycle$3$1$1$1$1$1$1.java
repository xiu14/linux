package androidx.lifecycle;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 extends i implements p<G, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ p<G, kotlin.r.d<? super o>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar, kotlin.r.d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1> dVar) {
        super(2, dVar);
        this.$block = pVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(this.$block, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1;
    }

    @Override // kotlin.s.b.p
    public final Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) create(g2, dVar)).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            r.k0(obj);
            G g2 = (G) this.L$0;
            p<G, kotlin.r.d<? super o>, Object> pVar = this.$block;
            this.label = 1;
            if (pVar.invoke(g2, this) == coroutineSingletons) {
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
