package com.bytedance.android.input.q;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class t implements kotlinx.coroutines.flow.f<kotlin.o> {
    final /* synthetic */ kotlinx.coroutines.flow.f a;
    final /* synthetic */ kotlin.s.b.l b;

    public static final class a<T> implements kotlinx.coroutines.flow.g {
        final /* synthetic */ kotlinx.coroutines.flow.g a;
        final /* synthetic */ kotlin.s.b.l b;

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.ChatIntentWithRequest$request$$inlined$mapNotNull$1$2", f = "ChatIntentWithRequest.kt", l = {225}, m = "emit")
        /* renamed from: com.bytedance.android.input.q.t$a$a, reason: collision with other inner class name */
        public static final class C0093a extends kotlin.r.h.a.c {
            /* synthetic */ Object a;
            int b;

            public C0093a(kotlin.r.d dVar) {
                super(dVar);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(kotlinx.coroutines.flow.g gVar, kotlin.s.b.l lVar) {
            this.a = gVar;
            this.b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.r.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.bytedance.android.input.q.t.a.C0093a
                if (r0 == 0) goto L13
                r0 = r6
                com.bytedance.android.input.q.t$a$a r0 = (com.bytedance.android.input.q.t.a.C0093a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                com.bytedance.android.input.q.t$a$a r0 = new com.bytedance.android.input.q.t$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.prolificinteractive.materialcalendarview.r.k0(r6)
                goto L47
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                com.prolificinteractive.materialcalendarview.r.k0(r6)
                kotlinx.coroutines.flow.g r6 = r4.a
                java.util.Map r5 = (java.util.Map) r5
                kotlin.s.b.l r2 = r4.b
                java.lang.Object r5 = r2.invoke(r5)
                if (r5 == 0) goto L47
                r0.b = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.o r5 = kotlin.o.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.t.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
        }
    }

    public t(kotlinx.coroutines.flow.f fVar, kotlin.s.b.l lVar) {
        this.a = fVar;
        this.b = lVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(kotlinx.coroutines.flow.g<? super kotlin.o> gVar, kotlin.r.d dVar) {
        Object a2 = this.a.a(new a(gVar, this.b), dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }
}
