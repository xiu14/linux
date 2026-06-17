package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class k extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    final /* synthetic */ f<T> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    k(f<? extends T> fVar, kotlin.r.d<? super k> dVar) {
        super(2, dVar);
        this.b = fVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new k(this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        return new k(this.b, dVar).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            f<T> fVar = this.b;
            this.a = 1;
            Object a = fVar.a(kotlinx.coroutines.flow.D.o.a, this);
            if (a != obj2) {
                a = kotlin.o.a;
            }
            if (a == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.prolificinteractive.materialcalendarview.r.k0(obj);
        }
        return kotlin.o.a;
    }
}
