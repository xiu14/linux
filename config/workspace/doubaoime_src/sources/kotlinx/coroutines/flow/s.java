package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class s<T> implements f<T> {
    final /* synthetic */ f a;
    final /* synthetic */ kotlin.s.b.p b;

    public static final class a<T> implements g {
        final /* synthetic */ g a;
        final /* synthetic */ kotlin.s.b.p b;

        @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.s$a$a, reason: collision with other inner class name */
        public static final class C0483a extends kotlin.r.h.a.c {
            /* synthetic */ Object a;
            int b;

            /* renamed from: d, reason: collision with root package name */
            Object f10283d;

            /* renamed from: e, reason: collision with root package name */
            Object f10284e;

            public C0483a(kotlin.r.d dVar) {
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.r.d<? super kotlin.o> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.s.a.C0483a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.s$a$a r0 = (kotlinx.coroutines.flow.s.a.C0483a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.s$a$a r0 = new kotlinx.coroutines.flow.s$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                com.prolificinteractive.materialcalendarview.r.k0(r7)
                goto L60
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                java.lang.Object r6 = r0.f10284e
                kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.g) r6
                java.lang.Object r2 = r0.f10283d
                com.prolificinteractive.materialcalendarview.r.k0(r7)
                goto L52
            L3c:
                com.prolificinteractive.materialcalendarview.r.k0(r7)
                kotlinx.coroutines.flow.g r7 = r5.a
                kotlin.s.b.p r2 = r5.b
                r0.f10283d = r6
                r0.f10284e = r7
                r0.b = r4
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L50
                return r1
            L50:
                r2 = r6
                r6 = r7
            L52:
                r7 = 0
                r0.f10283d = r7
                r0.f10284e = r7
                r0.b = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                kotlin.o r6 = kotlin.o.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.s.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
        }
    }

    public s(f fVar, kotlin.s.b.p pVar) {
        this.a = fVar;
        this.b = pVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(g gVar, kotlin.r.d dVar) {
        Object a2 = this.a.a(new a(gVar, this.b), dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }
}
