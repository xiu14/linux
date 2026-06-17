package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class i<T> extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super T>, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j<S, T> f10257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j<S, T> jVar, kotlin.r.d<? super i> dVar) {
        super(2, dVar);
        this.f10257c = jVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        i iVar = new i(this.f10257c, dVar);
        iVar.b = obj;
        return iVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(Object obj, kotlin.r.d<? super kotlin.o> dVar) {
        i iVar = new i(this.f10257c, dVar);
        iVar.b = (kotlinx.coroutines.flow.g) obj;
        return iVar.invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            kotlinx.coroutines.flow.g<? super T> gVar = (kotlinx.coroutines.flow.g) this.b;
            j<S, T> jVar = this.f10257c;
            this.a = 1;
            if (jVar.h(gVar, this) == coroutineSingletons) {
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
