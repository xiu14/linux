package kotlinx.coroutines;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.r.e;
import kotlinx.coroutines.InterfaceC0817m0;

/* renamed from: kotlinx.coroutines.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0795d {
    public static InterfaceC0822s a(InterfaceC0817m0 interfaceC0817m0, int i) {
        int i2 = i & 1;
        return new D0(null);
    }

    public static L b(G g2, kotlin.r.f fVar, CoroutineStart coroutineStart, kotlin.s.b.p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = kotlin.r.g.a;
        }
        CoroutineStart coroutineStart2 = (i & 2) != 0 ? CoroutineStart.DEFAULT : null;
        kotlin.r.f m = m(g2, fVar);
        L t0Var = coroutineStart2.isLazy() ? new t0(m, pVar) : new M(m, true);
        coroutineStart2.invoke(pVar, t0Var, t0Var);
        return t0Var;
    }

    public static final <T> Object c(L<? extends T>[] lArr, kotlin.r.d<? super List<? extends T>> dVar) {
        return lArr.length == 0 ? kotlin.collections.l.a : new C0793c(lArr).b(dVar);
    }

    public static final void d(kotlin.r.f fVar, CancellationException cancellationException) {
        InterfaceC0817m0.a aVar = InterfaceC0817m0.H;
        InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) fVar.get(InterfaceC0817m0.a.a);
        if (interfaceC0817m0 != null) {
            interfaceC0817m0.d(cancellationException);
        }
    }

    public static /* synthetic */ void e(kotlin.r.f fVar, CancellationException cancellationException, int i, Object obj) {
        int i2 = i & 1;
        d(fVar, null);
    }

    public static final void f(kotlin.r.f fVar) {
        InterfaceC0817m0.a aVar = InterfaceC0817m0.H;
        InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) fVar.get(InterfaceC0817m0.a.a);
        if (interfaceC0817m0 != null && !interfaceC0817m0.a()) {
            throw interfaceC0817m0.r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final kotlin.r.f g(kotlin.r.f fVar, kotlin.r.f fVar2, boolean z) {
        boolean i = i(fVar);
        boolean i2 = i(fVar2);
        if (!i && !i2) {
            return fVar.plus(fVar2);
        }
        kotlin.s.c.z zVar = new kotlin.s.c.z();
        zVar.a = fVar2;
        kotlin.r.g gVar = kotlin.r.g.a;
        kotlin.r.f fVar3 = (kotlin.r.f) fVar.fold(gVar, new A(zVar, z));
        if (i2) {
            zVar.a = ((kotlin.r.f) zVar.a).fold(gVar, C0829z.a);
        }
        return fVar3.plus((kotlin.r.f) zVar.a);
    }

    public static final <T> C0814l<T> h(kotlin.r.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.N0.h)) {
            return new C0814l<>(dVar, 1);
        }
        C0814l<T> l = ((kotlinx.coroutines.N0.h) dVar).l();
        if (l != null) {
            if (!l.D()) {
                l = null;
            }
            if (l != null) {
                return l;
            }
        }
        return new C0814l<>(dVar, 2);
    }

    private static final boolean i(kotlin.r.f fVar) {
        return ((Boolean) fVar.fold(Boolean.FALSE, B.a)).booleanValue();
    }

    public static final boolean j(kotlin.r.f fVar) {
        InterfaceC0817m0.a aVar = InterfaceC0817m0.H;
        InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) fVar.get(InterfaceC0817m0.a.a);
        return interfaceC0817m0 != null && interfaceC0817m0.a();
    }

    public static final boolean k(int i) {
        return i == 1 || i == 2;
    }

    public static InterfaceC0817m0 l(G g2, kotlin.r.f fVar, CoroutineStart coroutineStart, kotlin.s.b.p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = kotlin.r.g.a;
        }
        CoroutineStart coroutineStart2 = (i & 2) != 0 ? CoroutineStart.DEFAULT : null;
        kotlin.r.f m = m(g2, fVar);
        InterfaceC0817m0 u0Var = coroutineStart2.isLazy() ? new u0(m, pVar) : new C0(m, true);
        coroutineStart2.invoke(pVar, u0Var, u0Var);
        return u0Var;
    }

    public static final kotlin.r.f m(G g2, kotlin.r.f fVar) {
        kotlin.r.f g3 = g(g2.getCoroutineContext(), fVar, true);
        return (g3 == S.a() || g3.get(kotlin.r.e.F) != null) ? g3 : g3.plus(S.a());
    }

    public static final void n(InterfaceC0812k<?> interfaceC0812k, kotlinx.coroutines.N0.m mVar) {
        ((C0814l) interfaceC0812k).f(new A0(mVar));
    }

    public static final <T> void o(Q<? super T> q, kotlin.r.d<? super T> dVar, boolean z) {
        Object k = q.k();
        Throwable d2 = q.d(k);
        Object J2 = d2 != null ? com.prolificinteractive.materialcalendarview.r.J(d2) : q.e(k);
        if (!z) {
            dVar.resumeWith(J2);
            return;
        }
        kotlinx.coroutines.N0.h hVar = (kotlinx.coroutines.N0.h) dVar;
        kotlin.r.d<T> dVar2 = hVar.f10160e;
        Object obj = hVar.f10162g;
        kotlin.r.f context = dVar2.getContext();
        Object c2 = kotlinx.coroutines.N0.z.c(context, obj);
        K0<?> r = c2 != kotlinx.coroutines.N0.z.a ? r(dVar2, context, c2) : null;
        try {
            hVar.f10160e.resumeWith(J2);
        } finally {
            if (r == null || r.s0()) {
                kotlinx.coroutines.N0.z.a(context, c2);
            }
        }
    }

    public static Object p(kotlin.r.f fVar, kotlin.s.b.p pVar, int i, Object obj) throws InterruptedException {
        kotlin.r.g gVar = (i & 1) != 0 ? kotlin.r.g.a : null;
        Thread currentThread = Thread.currentThread();
        gVar.get(kotlin.r.e.F);
        F0 f0 = F0.a;
        Y a = F0.a();
        C0800f0 c0800f0 = C0800f0.a;
        kotlin.s.c.l.f(a, "context");
        C0799f c0799f = new C0799f(m(c0800f0, a), currentThread, a);
        CoroutineStart.DEFAULT.invoke(pVar, c0799f, c0799f);
        return c0799f.s0();
    }

    private static final <U, T extends U> Object q(H0<U, ? super T> h0, kotlin.s.b.p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar) {
        Object c0824u;
        Object c0;
        h0.p(false, true, new W(com.prolificinteractive.materialcalendarview.r.N(h0.f10175c.getContext()).A(h0.f10150d, h0, h0.getContext())));
        try {
            kotlin.s.c.D.c(pVar, 2);
            c0824u = pVar.invoke(h0, h0);
        } catch (Throwable th) {
            c0824u = new C0824u(th, false, 2);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c0824u == coroutineSingletons || (c0 = h0.c0(c0824u)) == s0.b) {
            return coroutineSingletons;
        }
        if (c0 instanceof C0824u) {
            Throwable th2 = ((C0824u) c0).a;
            if (((th2 instanceof G0) && ((G0) th2).a == h0) ? false : true) {
                throw th2;
            }
            if (c0824u instanceof C0824u) {
                throw ((C0824u) c0824u).a;
            }
        } else {
            c0824u = s0.g(c0);
        }
        return c0824u;
    }

    public static final K0<?> r(kotlin.r.d<?> dVar, kotlin.r.f fVar, Object obj) {
        K0<?> k0 = null;
        if (!(dVar instanceof kotlin.r.h.a.d)) {
            return null;
        }
        if (!(fVar.get(L0.a) != null)) {
            return null;
        }
        kotlin.r.h.a.d dVar2 = (kotlin.r.h.a.d) dVar;
        while (true) {
            if ((dVar2 instanceof P) || (dVar2 = dVar2.getCallerFrame()) == null) {
                break;
            }
            if (dVar2 instanceof K0) {
                k0 = (K0) dVar2;
                break;
            }
        }
        if (k0 != null) {
            k0.t0(fVar, obj);
        }
        return k0;
    }

    public static final <T> Object s(kotlin.r.f fVar, kotlin.s.b.p<? super G, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        Object s0;
        kotlin.r.f context = dVar.getContext();
        kotlin.r.f plus = !i(fVar) ? context.plus(fVar) : g(context, fVar, false);
        f(plus);
        if (plus == context) {
            kotlinx.coroutines.N0.v vVar = new kotlinx.coroutines.N0.v(plus, dVar);
            s0 = com.prolificinteractive.materialcalendarview.r.j0(vVar, vVar, pVar);
        } else {
            e.a aVar = kotlin.r.e.F;
            if (kotlin.s.c.l.a(plus.get(aVar), context.get(aVar))) {
                K0 k0 = new K0(plus, dVar);
                Object c2 = kotlinx.coroutines.N0.z.c(plus, null);
                try {
                    Object j0 = com.prolificinteractive.materialcalendarview.r.j0(k0, k0, pVar);
                    kotlinx.coroutines.N0.z.a(plus, c2);
                    s0 = j0;
                } catch (Throwable th) {
                    kotlinx.coroutines.N0.z.a(plus, c2);
                    throw th;
                }
            } else {
                P p = new P(plus, dVar);
                kotlinx.coroutines.O0.a.d(pVar, p, p, null, 4);
                s0 = p.s0();
            }
        }
        if (s0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return s0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.H0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object t(long r7, kotlin.s.b.p<? super kotlinx.coroutines.G, ? super kotlin.r.d<? super T>, ? extends java.lang.Object> r9, kotlin.r.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.I0
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.I0 r0 = (kotlinx.coroutines.I0) r0
            int r1 = r0.f10153e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10153e = r1
            goto L18
        L13:
            kotlinx.coroutines.I0 r0 = new kotlinx.coroutines.I0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f10152d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10153e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f10151c
            kotlin.s.c.z r7 = (kotlin.s.c.z) r7
            java.lang.Object r8 = r0.b
            kotlin.s.b.p r8 = (kotlin.s.b.p) r8
            com.prolificinteractive.materialcalendarview.r.k0(r10)     // Catch: kotlinx.coroutines.G0 -> L30
            goto L6c
        L30:
            r8 = move-exception
            goto L6f
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            com.prolificinteractive.materialcalendarview.r.k0(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L44
            return r3
        L44:
            kotlin.s.c.z r10 = new kotlin.s.c.z
            r10.<init>()
            r0.b = r9     // Catch: kotlinx.coroutines.G0 -> L6d
            r0.f10151c = r10     // Catch: kotlinx.coroutines.G0 -> L6d
            r0.a = r7     // Catch: kotlinx.coroutines.G0 -> L6d
            r0.f10153e = r4     // Catch: kotlinx.coroutines.G0 -> L6d
            kotlinx.coroutines.H0 r2 = new kotlinx.coroutines.H0     // Catch: kotlinx.coroutines.G0 -> L6d
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.G0 -> L6d
            r10.a = r2     // Catch: kotlinx.coroutines.G0 -> L6d
            java.lang.Object r7 = q(r2, r9)     // Catch: kotlinx.coroutines.G0 -> L6d
            if (r7 != r1) goto L68
            java.lang.String r8 = "frame"
            kotlin.s.c.l.f(r0, r8)     // Catch: kotlinx.coroutines.G0 -> L66
            goto L68
        L64:
            r8 = r7
            goto L6e
        L66:
            r7 = move-exception
            goto L64
        L68:
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r10 = r7
        L6c:
            return r10
        L6d:
            r8 = move-exception
        L6e:
            r7 = r10
        L6f:
            kotlinx.coroutines.m0 r9 = r8.a
            T r7 = r7.a
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C0795d.t(long, kotlin.s.b.p, kotlin.r.d):java.lang.Object");
    }
}
