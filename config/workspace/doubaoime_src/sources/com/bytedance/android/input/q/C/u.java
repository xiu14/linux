package com.bytedance.android.input.q.C;

import com.bytedance.android.input.network.api.IRecommends;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.Request$expansionOrPolishFlow$2", f = "Request.kt", l = {301}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class u extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super IRecommends.Data>, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    private /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f2974c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IRecommends.Data.Source f2975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(String str, IRecommends.Data.Source source, kotlin.r.d<? super u> dVar) {
        super(2, dVar);
        this.f2974c = str;
        this.f2975d = source;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        u uVar = new u(this.f2974c, this.f2975d, dVar);
        uVar.b = obj;
        return uVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.flow.g<? super IRecommends.Data> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        u uVar = new u(this.f2974c, this.f2975d, dVar);
        uVar.b = gVar;
        return uVar.invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            kotlinx.coroutines.flow.g gVar = (kotlinx.coroutines.flow.g) this.b;
            IRecommends.Data data = new IRecommends.Data("Error", this.f2974c, null, false, this.f2975d, null, 44);
            this.a = 1;
            if (gVar.emit(data, this) == coroutineSingletons) {
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
