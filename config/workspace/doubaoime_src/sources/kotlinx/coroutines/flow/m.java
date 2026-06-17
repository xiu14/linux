package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class m<T> implements f<T> {
    final /* synthetic */ f a;
    final /* synthetic */ kotlin.s.b.q b;

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
    public static final class a extends kotlin.r.h.a.c {
        /* synthetic */ Object a;
        int b;

        /* renamed from: d, reason: collision with root package name */
        Object f10276d;

        /* renamed from: e, reason: collision with root package name */
        Object f10277e;

        public a(kotlin.r.d dVar) {
            super(dVar);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return m.this.a(null, this);
        }
    }

    public m(f fVar, kotlin.s.b.q qVar) {
        this.a = fVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.g<? super T> r9, kotlin.r.d<? super kotlin.o> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.m.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.m$a r0 = (kotlinx.coroutines.flow.m.a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$a r0 = new kotlinx.coroutines.flow.m$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f10276d
            kotlinx.coroutines.flow.D.q r9 = (kotlinx.coroutines.flow.D.q) r9
            com.prolificinteractive.materialcalendarview.r.k0(r10)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L32:
            r10 = move-exception
            goto L88
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f10276d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.prolificinteractive.materialcalendarview.r.k0(r10)
            goto La2
        L44:
            java.lang.Object r9 = r0.f10277e
            kotlinx.coroutines.flow.g r9 = (kotlinx.coroutines.flow.g) r9
            java.lang.Object r2 = r0.f10276d
            kotlinx.coroutines.flow.m r2 = (kotlinx.coroutines.flow.m) r2
            com.prolificinteractive.materialcalendarview.r.k0(r10)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r9 = move-exception
            goto L8e
        L52:
            com.prolificinteractive.materialcalendarview.r.k0(r10)
            kotlinx.coroutines.flow.f r10 = r8.a     // Catch: java.lang.Throwable -> L8c
            r0.f10276d = r8     // Catch: java.lang.Throwable -> L8c
            r0.f10277e = r9     // Catch: java.lang.Throwable -> L8c
            r0.b = r5     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r1) goto L64
            return r1
        L64:
            r2 = r8
        L65:
            kotlinx.coroutines.flow.D.q r10 = new kotlinx.coroutines.flow.D.q
            kotlin.r.f r4 = r0.getContext()
            r10.<init>(r9, r4)
            kotlin.s.b.q r9 = r2.b     // Catch: java.lang.Throwable -> L84
            r0.f10276d = r10     // Catch: java.lang.Throwable -> L84
            r0.f10277e = r6     // Catch: java.lang.Throwable -> L84
            r0.b = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = r9.d(r10, r6, r0)     // Catch: java.lang.Throwable -> L84
            if (r9 != r1) goto L7d
            return r1
        L7d:
            r9 = r10
        L7e:
            r9.releaseIntercepted()
            kotlin.o r9 = kotlin.o.a
            return r9
        L84:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L88:
            r9.releaseIntercepted()
            throw r10
        L8c:
            r9 = move-exception
            r2 = r8
        L8e:
            kotlinx.coroutines.flow.C r10 = new kotlinx.coroutines.flow.C
            r10.<init>(r9)
            kotlin.s.b.q r2 = r2.b
            r0.f10276d = r9
            r0.f10277e = r6
            r0.b = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.h.b(r10, r2, r9, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.a(kotlinx.coroutines.flow.g, kotlin.r.d):java.lang.Object");
    }
}
