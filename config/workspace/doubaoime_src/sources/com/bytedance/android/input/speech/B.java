package com.bytedance.android.input.speech;

import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.speech.A;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrProcess$startFlow$1$3$mStream$2$1", f = "AsrProcess.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class B extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ kotlin.s.b.p<s, Boolean, Object> b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A.c f3064c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.z<String> f3065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B(boolean z, kotlin.s.b.p<? super s, ? super Boolean, ? extends Object> pVar, A.c cVar, kotlin.s.c.z<String> zVar, kotlin.r.d<? super B> dVar) {
        super(2, dVar);
        this.a = z;
        this.b = pVar;
        this.f3064c = cVar;
        this.f3065d = zVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new B(this.a, this.b, this.f3064c, this.f3065d, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
        B b = new B(this.a, this.b, this.f3064c, this.f3065d, dVar);
        kotlin.o oVar = kotlin.o.a;
        b.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        if (this.a) {
            kotlin.s.b.p<s, Boolean, Object> pVar = this.b;
            IAsr.ErrorType f2 = this.f3064c.f();
            pVar.invoke(new s(4, null, this.f3065d.a, this.f3064c.e(), f2, null, false, 0L, false, false, 994), Boolean.TRUE);
        } else {
            Objects.requireNonNull(this.f3064c);
            this.b.invoke(new s(5, null, this.f3065d.a, 0, null, null, false, 0L, false, false, 1018), Boolean.TRUE);
        }
        return kotlin.o.a;
    }
}
