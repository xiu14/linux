package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class e<T> extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.channels.q<? super T>, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f<T> f10246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f<T> fVar, kotlin.r.d<? super e> dVar) {
        super(2, dVar);
        this.f10246c = fVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        e eVar = new e(this.f10246c, dVar);
        eVar.b = obj;
        return eVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(Object obj, kotlin.r.d<? super kotlin.o> dVar) {
        e eVar = new e(this.f10246c, dVar);
        eVar.b = (kotlinx.coroutines.channels.q) obj;
        return eVar.invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            kotlinx.coroutines.channels.q<? super T> qVar = (kotlinx.coroutines.channels.q) this.b;
            f<T> fVar = this.f10246c;
            this.a = 1;
            if (fVar.e(qVar, this) == coroutineSingletons) {
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
