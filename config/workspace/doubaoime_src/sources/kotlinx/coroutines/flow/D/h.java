package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
public final class h<T> extends f<T> {

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.flow.f<kotlinx.coroutines.flow.f<T>> f10248d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10249e;

    static final class a<T> implements kotlinx.coroutines.flow.g {
        final /* synthetic */ InterfaceC0817m0 a;
        final /* synthetic */ kotlinx.coroutines.P0.g b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.q<T> f10250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t<T> f10251d;

        @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {69}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.D.h$a$a, reason: collision with other inner class name */
        static final class C0478a extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
            int a;
            final /* synthetic */ kotlinx.coroutines.flow.f<T> b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ t<T> f10252c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.P0.g f10253d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0478a(kotlinx.coroutines.flow.f<? extends T> fVar, t<T> tVar, kotlinx.coroutines.P0.g gVar, kotlin.r.d<? super C0478a> dVar) {
                super(2, dVar);
                this.b = fVar;
                this.f10252c = tVar;
                this.f10253d = gVar;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new C0478a(this.b, this.f10252c, this.f10253d, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
                return new C0478a(this.b, this.f10252c, this.f10253d, dVar).invokeSuspend(kotlin.o.a);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.a;
                try {
                    if (i == 0) {
                        com.prolificinteractive.materialcalendarview.r.k0(obj);
                        kotlinx.coroutines.flow.f<T> fVar = this.b;
                        t<T> tVar = this.f10252c;
                        this.a = 1;
                        if (fVar.a(tVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.prolificinteractive.materialcalendarview.r.k0(obj);
                    }
                    this.f10253d.release();
                    return kotlin.o.a;
                } catch (Throwable th) {
                    this.f10253d.release();
                    throw th;
                }
            }
        }

        @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", l = {66}, m = "emit")
        static final class b extends kotlin.r.h.a.c {
            Object a;
            Object b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f10254c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a<T> f10255d;

            /* renamed from: e, reason: collision with root package name */
            int f10256e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.r.d<? super b> dVar) {
                super(dVar);
                this.f10255d = aVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                this.f10254c = obj;
                this.f10256e |= Integer.MIN_VALUE;
                return this.f10255d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC0817m0 interfaceC0817m0, kotlinx.coroutines.P0.g gVar, kotlinx.coroutines.channels.q<? super T> qVar, t<T> tVar) {
            this.a = interfaceC0817m0;
            this.b = gVar;
            this.f10250c = qVar;
            this.f10251d = tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(kotlinx.coroutines.flow.f<? extends T> r8, kotlin.r.d<? super kotlin.o> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.D.h.a.b
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.D.h$a$b r0 = (kotlinx.coroutines.flow.D.h.a.b) r0
                int r1 = r0.f10256e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10256e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.D.h$a$b r0 = new kotlinx.coroutines.flow.D.h$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f10254c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f10256e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r8 = r0.b
                kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.f) r8
                java.lang.Object r0 = r0.a
                kotlinx.coroutines.flow.D.h$a r0 = (kotlinx.coroutines.flow.D.h.a) r0
                com.prolificinteractive.materialcalendarview.r.k0(r9)
                goto L5a
            L2f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L37:
                com.prolificinteractive.materialcalendarview.r.k0(r9)
                kotlinx.coroutines.m0 r9 = r7.a
                if (r9 == 0) goto L4a
                boolean r2 = r9.a()
                if (r2 == 0) goto L45
                goto L4a
            L45:
                java.util.concurrent.CancellationException r8 = r9.r()
                throw r8
            L4a:
                kotlinx.coroutines.P0.g r9 = r7.b
                r0.a = r7
                r0.b = r8
                r0.f10256e = r3
                java.lang.Object r9 = r9.a(r0)
                if (r9 != r1) goto L59
                return r1
            L59:
                r0 = r7
            L5a:
                kotlinx.coroutines.channels.q<T> r1 = r0.f10250c
                r2 = 0
                r3 = 0
                kotlinx.coroutines.flow.D.h$a$a r4 = new kotlinx.coroutines.flow.D.h$a$a
                kotlinx.coroutines.flow.D.t<T> r9 = r0.f10251d
                kotlinx.coroutines.P0.g r0 = r0.b
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.C0795d.l(r1, r2, r3, r4, r5, r6)
                kotlin.o r8 = kotlin.o.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.D.h.a.emit(kotlinx.coroutines.flow.f, kotlin.r.d):java.lang.Object");
        }
    }

    public h(kotlinx.coroutines.flow.f fVar, int i, kotlin.r.f fVar2, int i2, BufferOverflow bufferOverflow, int i3) {
        super((i3 & 4) != 0 ? kotlin.r.g.a : null, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : null);
        this.f10248d = fVar;
        this.f10249e = i;
    }

    @Override // kotlinx.coroutines.flow.D.f
    protected String d() {
        StringBuilder M = e.a.a.a.a.M("concurrency=");
        M.append(this.f10249e);
        return M.toString();
    }

    @Override // kotlinx.coroutines.flow.D.f
    protected Object e(kotlinx.coroutines.channels.q<? super T> qVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object a2 = this.f10248d.a(new a((InterfaceC0817m0) ((kotlin.r.h.a.c) dVar).getContext().get(InterfaceC0817m0.H), kotlinx.coroutines.P0.i.a(this.f10249e, 0, 2), qVar, new t(qVar)), dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }

    @Override // kotlinx.coroutines.flow.D.f
    protected f<T> f(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        return new h(this.f10248d, this.f10249e, fVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.D.f
    public kotlinx.coroutines.channels.s<T> g(G g2) {
        return kotlinx.coroutines.channels.h.c(g2, this.a, this.b, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, new e(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(kotlinx.coroutines.flow.f<? extends kotlinx.coroutines.flow.f<? extends T>> fVar, int i, kotlin.r.f fVar2, int i2, BufferOverflow bufferOverflow) {
        super(fVar2, i2, bufferOverflow);
        this.f10248d = fVar;
        this.f10249e = i;
    }
}
