package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
final class d<T> implements InterfaceC0803c<T> {
    private final f<T> a;

    static final class a<T> implements g {
        final /* synthetic */ g<T> a;

        @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {275}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.d$a$a, reason: collision with other inner class name */
        static final class C0480a extends kotlin.r.h.a.c {
            /* synthetic */ Object a;
            final /* synthetic */ a<T> b;

            /* renamed from: c, reason: collision with root package name */
            int f10269c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0480a(a<? super T> aVar, kotlin.r.d<? super C0480a> dVar) {
                super(dVar);
                this.b = aVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.f10269c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(g<? super T> gVar) {
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.d.a.C0480a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.d$a$a r0 = (kotlinx.coroutines.flow.d.a.C0480a) r0
                int r1 = r0.f10269c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10269c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.d$a$a r0 = new kotlinx.coroutines.flow.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f10269c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.prolificinteractive.materialcalendarview.r.k0(r6)
                goto L44
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                com.prolificinteractive.materialcalendarview.r.k0(r6)
                kotlin.r.f r6 = r0.getContext()
                kotlinx.coroutines.C0795d.f(r6)
                kotlinx.coroutines.flow.g<T> r6 = r4.a
                r0.f10269c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                kotlin.o r5 = kotlin.o.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(f<? extends T> fVar) {
        this.a = fVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object a2 = this.a.a(new a(gVar), dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }
}
