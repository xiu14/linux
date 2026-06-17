package com.bytedance.android.input.basic.d;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class a {

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.basic.tools.CoroutineUtils$executeOnIO$1", f = "CoroutineUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.bytedance.android.input.basic.d.a$a, reason: collision with other inner class name */
    static final class C0056a extends kotlin.r.h.a.i implements p<G, kotlin.r.d<? super o>, Object> {
        final /* synthetic */ Runnable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0056a(Runnable runnable, kotlin.r.d<? super C0056a> dVar) {
            super(2, dVar);
            this.a = runnable;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return new C0056a(this.a, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            C0056a c0056a = new C0056a(this.a, dVar);
            o oVar = o.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(oVar);
            c0056a.a.run();
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(obj);
            this.a.run();
            return o.a;
        }
    }

    public static final void a(Runnable runnable) {
        l.f(runnable, "task");
        C0795d.l(C0800f0.a, S.b(), null, new C0056a(runnable, null), 2, null);
    }
}
