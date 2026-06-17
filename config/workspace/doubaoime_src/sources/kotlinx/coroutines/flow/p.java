package kotlinx.coroutines.flow;

/* loaded from: classes2.dex */
final class p<T> implements g {
    final /* synthetic */ g<T> a;

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", l = {80}, m = "emit")
    static final class a extends kotlin.r.h.a.c {
        /* synthetic */ Object a;
        final /* synthetic */ p<T> b;

        /* renamed from: c, reason: collision with root package name */
        int f10280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super T> pVar, kotlin.r.d<? super a> dVar) {
            super(dVar);
            this.b = pVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.f10280c |= Integer.MIN_VALUE;
            return this.b.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    p(g<? super T> gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(kotlinx.coroutines.flow.f<? extends T> r5, kotlin.r.d<? super kotlin.o> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.p$a r0 = (kotlinx.coroutines.flow.p.a) r0
            int r1 = r0.f10280c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10280c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.p$a r0 = new kotlinx.coroutines.flow.p$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10280c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            kotlinx.coroutines.flow.g<T> r6 = r4.a
            r0.f10280c = r3
            boolean r2 = r6 instanceof kotlinx.coroutines.flow.C
            if (r2 != 0) goto L49
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L41
            goto L43
        L41:
            kotlin.o r5 = kotlin.o.a
        L43:
            if (r5 != r1) goto L46
            return r1
        L46:
            kotlin.o r5 = kotlin.o.a
            return r5
        L49:
            kotlinx.coroutines.flow.C r6 = (kotlinx.coroutines.flow.C) r6
            java.lang.Throwable r5 = r6.a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.emit(kotlinx.coroutines.flow.f, kotlin.r.d):java.lang.Object");
    }
}
