package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC0817m0;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.r.h.a.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PausingDispatcherKt$whenStateAtLeast$2<T> extends i implements p<G, kotlin.r.d<? super T>, Object> {
    final /* synthetic */ p<G, kotlin.r.d<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super PausingDispatcherKt$whenStateAtLeast$2> dVar) {
        super(2, dVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = pVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.s.b.p
    public final Object invoke(G g2, kotlin.r.d<? super T> dVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(g2, dVar)).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            r.k0(obj);
            InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) ((G) this.L$0).getCoroutineContext().get(InterfaceC0817m0.H);
            if (interfaceC0817m0 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC0817m0);
            try {
                p<G, kotlin.r.d<? super T>, Object> pVar = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = C0795d.s(pausingDispatcher, pVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lifecycleController = lifecycleController2;
            } catch (Throwable th) {
                th = th;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleController = (LifecycleController) this.L$0;
            try {
                r.k0(obj);
            } catch (Throwable th2) {
                th = th2;
                lifecycleController.finish();
                throw th;
            }
        }
        lifecycleController.finish();
        return obj;
    }
}
