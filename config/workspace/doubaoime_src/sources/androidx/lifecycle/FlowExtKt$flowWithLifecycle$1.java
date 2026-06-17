package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.G;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.flow.g;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.r.h.a.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowExtKt$flowWithLifecycle$1<T> extends i implements p<q<? super T>, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ kotlinx.coroutines.flow.f<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @kotlin.r.h.a.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends i implements p<G, kotlin.r.d<? super o>, Object> {
        final /* synthetic */ q<T> $$this$callbackFlow;
        final /* synthetic */ kotlinx.coroutines.flow.f<T> $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.f<? extends T> fVar, q<? super T> qVar, kotlin.r.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_flowWithLifecycle = fVar;
            this.$$this$callbackFlow = qVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, dVar);
        }

        @Override // kotlin.s.b.p
        public final Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            return ((AnonymousClass1) create(g2, dVar)).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                r.k0(obj);
                kotlinx.coroutines.flow.f<T> fVar = this.$this_flowWithLifecycle;
                final q<T> qVar = this.$$this$callbackFlow;
                g<? super T> gVar = new g() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // kotlinx.coroutines.flow.g
                    public final Object emit(T t, kotlin.r.d<? super o> dVar) {
                        Object o = qVar.o(t, dVar);
                        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : o.a;
                    }
                };
                this.label = 1;
                if (fVar.a(gVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.flow.f<? extends T> fVar, kotlin.r.d<? super FlowExtKt$flowWithLifecycle$1> dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = fVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.s.b.p
    public final Object invoke(q<? super T> qVar, kotlin.r.d<? super o> dVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(qVar, dVar)).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            r.k0(obj);
            q qVar2 = (q) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, qVar2, null);
            this.L$0 = qVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            qVar = qVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) this.L$0;
            r.k0(obj);
        }
        r.D(qVar, null, 1, null);
        return o.a;
    }
}
