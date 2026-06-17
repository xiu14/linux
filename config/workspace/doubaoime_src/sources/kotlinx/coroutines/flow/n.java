package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class n<R> implements f<f<? extends R>> {
    final /* synthetic */ f a;
    final /* synthetic */ kotlin.s.b.p b;

    public static final class a<T> implements g {
        final /* synthetic */ g a;
        final /* synthetic */ kotlin.s.b.p b;

        @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {223, 223}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.n$a$a, reason: collision with other inner class name */
        public static final class C0481a extends kotlin.r.h.a.c {
            /* synthetic */ Object a;
            int b;

            /* renamed from: c, reason: collision with root package name */
            Object f10278c;

            public C0481a(kotlin.r.d dVar) {
                super(dVar);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(g gVar, kotlin.s.b.p pVar) {
            this.a = gVar;
            this.b = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, kotlin.r.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.n.a.C0481a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.n$a$a r0 = (kotlinx.coroutines.flow.n.a.C0481a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.n$a$a r0 = new kotlinx.coroutines.flow.n$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                com.prolificinteractive.materialcalendarview.r.k0(r8)
                goto L5b
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                java.lang.Object r7 = r0.f10278c
                kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.g) r7
                com.prolificinteractive.materialcalendarview.r.k0(r8)
                goto L4f
            L3a:
                com.prolificinteractive.materialcalendarview.r.k0(r8)
                kotlinx.coroutines.flow.g r8 = r6.a
                kotlin.s.b.p r2 = r6.b
                r0.f10278c = r8
                r0.b = r4
                java.lang.Object r7 = r2.invoke(r7, r0)
                if (r7 != r1) goto L4c
                return r1
            L4c:
                r5 = r8
                r8 = r7
                r7 = r5
            L4f:
                r2 = 0
                r0.f10278c = r2
                r0.b = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                kotlin.o r7 = kotlin.o.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
        }
    }

    public n(f fVar, kotlin.s.b.p pVar) {
        this.a = fVar;
        this.b = pVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(g gVar, kotlin.r.d dVar) {
        Object a2 = this.a.a(new a(gVar, this.b), dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }
}
