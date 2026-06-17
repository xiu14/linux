package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public final class B<T> implements g<T> {

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, TypedValues.CycleType.TYPE_WAVE_PERIOD}, m = "onSubscription")
    static final class a extends kotlin.r.h.a.c {
        Object a;
        Object b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10240c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B<T> f10241d;

        /* renamed from: e, reason: collision with root package name */
        int f10242e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B<T> b, kotlin.r.d<? super a> dVar) {
            super(dVar);
            this.f10241d = b;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.f10240c = obj;
            this.f10242e |= Integer.MIN_VALUE;
            return this.f10241d.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, kotlinx.coroutines.flow.D.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.r.d<? super kotlin.o> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.B.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.B$a r0 = (kotlinx.coroutines.flow.B.a) r0
            int r1 = r0.f10242e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10242e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.B$a r0 = new kotlinx.coroutines.flow.B$a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10240c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.f10242e
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L34
            r0 = 2
            if (r1 != r0) goto L2c
            com.prolificinteractive.materialcalendarview.r.k0(r5)
        L29:
            kotlin.o r5 = kotlin.o.a
            return r5
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            java.lang.Object r1 = r0.b
            kotlinx.coroutines.flow.D.q r1 = (kotlinx.coroutines.flow.D.q) r1
            java.lang.Object r0 = r0.a
            kotlinx.coroutines.flow.B r0 = (kotlinx.coroutines.flow.B) r0
            com.prolificinteractive.materialcalendarview.r.k0(r5)     // Catch: java.lang.Throwable -> L5a
            r1.releaseIntercepted()
            java.util.Objects.requireNonNull(r0)
            goto L29
        L46:
            com.prolificinteractive.materialcalendarview.r.k0(r5)
            kotlinx.coroutines.flow.D.q r1 = new kotlinx.coroutines.flow.D.q
            kotlin.r.f r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.a = r4     // Catch: java.lang.Throwable -> L5a
            r0.b = r1     // Catch: java.lang.Throwable -> L5a
            r0.f10242e = r2     // Catch: java.lang.Throwable -> L5a
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.B.a(kotlin.r.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.g
    public Object emit(T t, kotlin.r.d<? super kotlin.o> dVar) {
        throw null;
    }
}
