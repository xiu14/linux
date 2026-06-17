package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class r<T> implements f<T> {
    final /* synthetic */ f a;

    public static final class a<T> implements g {
        final /* synthetic */ g a;

        @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.r$a$a, reason: collision with other inner class name */
        public static final class C0482a extends kotlin.r.h.a.c {
            /* synthetic */ Object a;
            int b;

            public C0482a(kotlin.r.d dVar) {
                super(dVar);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(g gVar) {
            this.a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, kotlin.r.d<? super kotlin.o> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.a.C0482a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.r$a$a r0 = (kotlinx.coroutines.flow.r.a.C0482a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.r$a$a r0 = new kotlinx.coroutines.flow.r$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.prolificinteractive.materialcalendarview.r.k0(r6)
                goto L3f
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                com.prolificinteractive.materialcalendarview.r.k0(r6)
                kotlinx.coroutines.flow.g r6 = r4.a
                if (r5 == 0) goto L3f
                r0.b = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                kotlin.o r5 = kotlin.o.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
        }
    }

    public r(f fVar) {
        this.a = fVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(g gVar, kotlin.r.d dVar) {
        Object a2 = this.a.a(new a(gVar), dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }
}
