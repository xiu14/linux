package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: kotlinx.coroutines.flow.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0802b<T> extends e<T> {

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.s.b.p<kotlinx.coroutines.channels.q<? super T>, kotlin.r.d<? super kotlin.o>, Object> f10266e;

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    /* renamed from: kotlinx.coroutines.flow.b$a */
    static final class a extends kotlin.r.h.a.c {
        Object a;
        /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0802b<T> f10267c;

        /* renamed from: d, reason: collision with root package name */
        int f10268d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0802b<T> c0802b, kotlin.r.d<? super a> dVar) {
            super(dVar);
            this.f10267c = c0802b;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.f10268d |= Integer.MIN_VALUE;
            return this.f10267c.e(null, this);
        }
    }

    public C0802b(kotlin.s.b.p pVar, kotlin.r.f fVar, int i, BufferOverflow bufferOverflow, int i2) {
        super(pVar, (i2 & 2) != 0 ? kotlin.r.g.a : null, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : null);
        this.f10266e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.D.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object e(kotlinx.coroutines.channels.q<? super T> r5, kotlin.r.d<? super kotlin.o> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C0802b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.C0802b.a) r0
            int r1 = r0.f10268d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10268d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10268d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.q) r5
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            r0.a = r5
            r0.f10268d = r3
            java.lang.Object r6 = super.e(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            boolean r5 = r5.q()
            if (r5 == 0) goto L4a
            kotlin.o r5 = kotlin.o.a
            return r5
        L4a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C0802b.e(kotlinx.coroutines.channels.q, kotlin.r.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.D.f
    protected kotlinx.coroutines.flow.D.f<T> f(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        return new C0802b(this.f10266e, fVar, i, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0802b(kotlin.s.b.p<? super kotlinx.coroutines.channels.q<? super T>, ? super kotlin.r.d<? super kotlin.o>, ? extends Object> pVar, kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        super(pVar, fVar, i, bufferOverflow);
        this.f10266e = pVar;
    }
}
