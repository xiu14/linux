package kotlin.coroutines.intrinsics;

import kotlin.o;
import kotlin.r.g;
import kotlin.s.b.l;
import kotlin.s.b.p;

/* loaded from: classes2.dex */
public final class a extends f {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> kotlin.r.d<o> a(l<? super kotlin.r.d<? super T>, ? extends Object> lVar, kotlin.r.d<? super T> dVar) {
        kotlin.s.c.l.f(lVar, "<this>");
        kotlin.s.c.l.f(dVar, "completion");
        kotlin.s.c.l.f(dVar, "completion");
        if (lVar instanceof kotlin.r.h.a.a) {
            return ((kotlin.r.h.a.a) lVar).create(dVar);
        }
        kotlin.r.f context = dVar.getContext();
        return context == g.a ? new b(dVar, lVar) : new c(dVar, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> kotlin.r.d<o> b(p<? super R, ? super kotlin.r.d<? super T>, ? extends Object> pVar, R r, kotlin.r.d<? super T> dVar) {
        kotlin.s.c.l.f(pVar, "<this>");
        kotlin.s.c.l.f(dVar, "completion");
        kotlin.s.c.l.f(dVar, "completion");
        if (pVar instanceof kotlin.r.h.a.a) {
            return ((kotlin.r.h.a.a) pVar).create(r, dVar);
        }
        kotlin.r.f context = dVar.getContext();
        return context == g.a ? new d(dVar, pVar, r) : new e(dVar, context, pVar, r);
    }

    public static Object c() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> kotlin.r.d<T> d(kotlin.r.d<? super T> dVar) {
        kotlin.r.d<T> dVar2;
        kotlin.s.c.l.f(dVar, "<this>");
        kotlin.r.h.a.c cVar = dVar instanceof kotlin.r.h.a.c ? (kotlin.r.h.a.c) dVar : null;
        return (cVar == null || (dVar2 = (kotlin.r.d<T>) cVar.intercepted()) == null) ? dVar : dVar2;
    }
}
