package com.bytedance.android.input.basic.network.c;

import com.prolificinteractive.materialcalendarview.r;
import e.b.l.b;
import e.b.l.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.e;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.z;
import kotlinx.coroutines.G;

/* loaded from: classes.dex */
public final class c {

    @e(c = "com.bytedance.android.input.basic.network.interceptor.RpcContinuationExtKt", f = "RpcContinuationExt.kt", l = {17}, m = "awaitResponseWithDispatchers")
    static final class a extends kotlin.r.h.a.c {
        Object a;
        /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        int f2072c;

        a(kotlin.r.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.f2072c |= Integer.MIN_VALUE;
            return c.a(null, null, this);
        }
    }

    @e(c = "com.bytedance.android.input.basic.network.interceptor.RpcContinuationExtKt$awaitResponseWithDispatchers$2", f = "RpcContinuationExt.kt", l = {}, m = "invokeSuspend")
    static final class b extends i implements p<G, kotlin.r.d<? super o>, Object> {
        final /* synthetic */ z<Object> a;
        final /* synthetic */ b.a b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f2073c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z<Object> zVar, b.a aVar, m mVar, kotlin.r.d<? super b> dVar) {
            super(2, dVar);
            this.a = zVar;
            this.b = aVar;
            this.f2073c = mVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return new b(this.a, this.b, this.f2073c, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            b bVar = new b(this.a, this.b, this.f2073c, dVar);
            o oVar = o.a;
            bVar.invokeSuspend(oVar);
            return oVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(obj);
            z<Object> zVar = this.a;
            ?? a = this.b.a(this.f2073c);
            l.e(a, "rpcInvoke.invoke(request)");
            zVar.a = a;
            return o.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e.b.l.b.a r6, e.b.l.m r7, kotlin.r.d<java.lang.Object> r8) {
        /*
            boolean r0 = r8 instanceof com.bytedance.android.input.basic.network.c.c.a
            if (r0 == 0) goto L13
            r0 = r8
            com.bytedance.android.input.basic.network.c.c$a r0 = (com.bytedance.android.input.basic.network.c.c.a) r0
            int r1 = r0.f2072c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2072c = r1
            goto L18
        L13:
            com.bytedance.android.input.basic.network.c.c$a r0 = new com.bytedance.android.input.basic.network.c.c$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2072c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            kotlin.s.c.z r6 = (kotlin.s.c.z) r6
            com.prolificinteractive.materialcalendarview.r.k0(r8)
            goto L51
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.prolificinteractive.materialcalendarview.r.k0(r8)
            kotlin.s.c.z r8 = new kotlin.s.c.z
            r8.<init>()
            kotlinx.coroutines.D r2 = kotlinx.coroutines.S.b()
            com.bytedance.android.input.basic.network.c.c$b r4 = new com.bytedance.android.input.basic.network.c.c$b
            r5 = 0
            r4.<init>(r8, r6, r7, r5)
            r0.a = r8
            r0.f2072c = r3
            java.lang.Object r6 = kotlinx.coroutines.C0795d.s(r2, r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = r8
        L51:
            T r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.network.c.c.a(e.b.l.b$a, e.b.l.m, kotlin.r.d):java.lang.Object");
    }
}
