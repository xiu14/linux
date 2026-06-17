package com.bytedance.android.doubaoime;

import com.bytedance.android.input.speech.AsrContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.ImeService$initialize$2", f = "ImeService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class q extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    q(kotlin.r.d<? super q> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new q(dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        new q(dVar);
        kotlin.o oVar = kotlin.o.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(oVar);
        AsrContext.a.g0();
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        AsrContext.a.g0();
        return kotlin.o.a;
    }
}
