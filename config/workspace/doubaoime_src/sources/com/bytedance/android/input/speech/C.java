package com.bytedance.android.input.speech;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrProcess$startFlow$1$sendAction$1$1", f = "AsrProcess.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class C extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    private /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.channels.w<s> f3066c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ z f3067d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ s f3068e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f3069f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.channels.q<s> f3070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C(kotlinx.coroutines.channels.w<? super s> wVar, z zVar, s sVar, boolean z, kotlinx.coroutines.channels.q<? super s> qVar, kotlin.r.d<? super C> dVar) {
        super(2, dVar);
        this.f3066c = wVar;
        this.f3067d = zVar;
        this.f3068e = sVar;
        this.f3069f = z;
        this.f3070g = qVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        C c2 = new C(this.f3066c, this.f3067d, this.f3068e, this.f3069f, this.f3070g, dVar);
        c2.b = obj;
        return c2;
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
        return ((C) create(g2, dVar)).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            if (!com.prolificinteractive.materialcalendarview.r.W((kotlinx.coroutines.G) this.b) || this.f3066c.q()) {
                z.g(this.f3067d, "startFlow no send");
                return kotlin.o.a;
            }
            z.g(this.f3067d, "startFlow send");
            kotlinx.coroutines.channels.w<s> wVar = this.f3066c;
            s sVar = this.f3068e;
            this.a = 1;
            if (wVar.o(sVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.prolificinteractive.materialcalendarview.r.k0(obj);
        }
        if (this.f3069f) {
            com.prolificinteractive.materialcalendarview.r.D(this.f3070g, null, 1, null);
        }
        return kotlin.o.a;
    }
}
