package com.bytedance.android.input.keyboard.aiwrite;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.aiwrite.AiPanelViewModel$waitFwkCallbackText$2", f = "AiPanelViewModel.kt", l = {219}, m = "invokeSuspend")
/* renamed from: com.bytedance.android.input.keyboard.aiwrite.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0602w extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super String>, Object> {
    int a;

    C0602w(kotlin.r.d<? super C0602w> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new C0602w(dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super String> dVar) {
        return new C0602w(dVar).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            kotlinx.coroutines.channels.e eVar = C0601v.f2625f;
            this.a = 1;
            obj = eVar.e(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.prolificinteractive.materialcalendarview.r.k0(obj);
        }
        return obj;
    }
}
