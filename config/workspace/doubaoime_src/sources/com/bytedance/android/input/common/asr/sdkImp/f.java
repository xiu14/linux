package com.bytedance.android.input.common.asr.sdkImp;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.s.b.p;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl$connect$1", f = "SdkImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class f extends kotlin.r.h.a.i implements p<G, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ SdkImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(boolean z, SdkImpl sdkImpl, kotlin.r.d<? super f> dVar) {
        super(2, dVar);
        this.a = z;
        this.b = sdkImpl;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        return new f(this.a, this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        return new f(this.a, this.b, dVar).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r.k0(obj);
        if (this.a) {
            this.b.u.b();
        }
        if (this.b.v.isConnected()) {
            return o.a;
        }
        this.b.v.a();
        return o.a;
    }
}
