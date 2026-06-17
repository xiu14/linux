package kotlinx.coroutines.flow;

/* renamed from: kotlinx.coroutines.flow.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0801a<T> implements f<T>, InterfaceC0803c<T> {

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    static final class C0479a extends kotlin.r.h.a.c {
        Object a;
        /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC0801a<T> f10264c;

        /* renamed from: d, reason: collision with root package name */
        int f10265d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0479a(AbstractC0801a<T> abstractC0801a, kotlin.r.d<? super C0479a> dVar) {
            super(dVar);
            this.f10264c = abstractC0801a;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.f10265d |= Integer.MIN_VALUE;
            return this.f10264c.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<? super T> r6, kotlin.r.d<? super kotlin.o> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractC0801a.C0479a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.AbstractC0801a.C0479a) r0
            int r1 = r0.f10265d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10265d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10265d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.a
            kotlinx.coroutines.flow.D.q r6 = (kotlinx.coroutines.flow.D.q) r6
            com.prolificinteractive.materialcalendarview.r.k0(r7)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r7 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.prolificinteractive.materialcalendarview.r.k0(r7)
            kotlinx.coroutines.flow.D.q r7 = new kotlinx.coroutines.flow.D.q
            kotlin.r.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.a = r7     // Catch: java.lang.Throwable -> L53
            r0.f10265d = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r6 = r5.d(r7, r0)     // Catch: java.lang.Throwable -> L53
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r6 = r7
        L4d:
            r6.releaseIntercepted()
            kotlin.o r6 = kotlin.o.a
            return r6
        L53:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L57:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC0801a.a(kotlinx.coroutines.flow.g, kotlin.r.d):java.lang.Object");
    }

    public abstract Object d(g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar);
}
