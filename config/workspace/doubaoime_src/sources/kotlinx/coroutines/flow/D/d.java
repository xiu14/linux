package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class d extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    private /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.g<T> f10244c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f<T> f10245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(kotlinx.coroutines.flow.g<? super T> gVar, f<T> fVar, kotlin.r.d<? super d> dVar) {
        super(2, dVar);
        this.f10244c = gVar;
        this.f10245d = fVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        d dVar2 = new d(this.f10244c, this.f10245d, dVar);
        dVar2.b = obj;
        return dVar2;
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        d dVar2 = new d(this.f10244c, this.f10245d, dVar);
        dVar2.b = g2;
        return dVar2.invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            G g2 = (G) this.b;
            kotlinx.coroutines.flow.g<T> gVar = this.f10244c;
            kotlinx.coroutines.channels.s g3 = this.f10245d.g(g2);
            this.a = 1;
            if (kotlinx.coroutines.flow.h.f(gVar, g3, this) == coroutineSingletons) {
                return coroutineSingletons;
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
