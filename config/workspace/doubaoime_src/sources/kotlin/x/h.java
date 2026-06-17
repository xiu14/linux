package kotlin.x;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.x.c;

/* loaded from: classes2.dex */
public final class h extends q {
    public static <T> e<T> a(Iterator<? extends T> it2) {
        kotlin.s.c.l.f(it2, "<this>");
        k kVar = new k(it2);
        kotlin.s.c.l.f(kVar, "<this>");
        return kVar instanceof a ? kVar : new a(kVar);
    }

    public static <T> e<T> b(e<? extends T> eVar, kotlin.s.b.l<? super T, Boolean> lVar) {
        kotlin.s.c.l.f(eVar, "<this>");
        kotlin.s.c.l.f(lVar, "predicate");
        return new c(eVar, true, lVar);
    }

    public static <T> T c(e<? extends T> eVar) {
        kotlin.s.c.l.f(eVar, "<this>");
        c.a aVar = new c.a((c) eVar);
        if (aVar.hasNext()) {
            return (T) aVar.next();
        }
        return null;
    }

    public static <T> e<T> d(T t, kotlin.s.b.l<? super T, ? extends T> lVar) {
        kotlin.s.c.l.f(lVar, "nextFunction");
        return t == null ? b.a : new d(new l(t), lVar);
    }

    public static <T> e<T> e(kotlin.s.b.a<? extends T> aVar, kotlin.s.b.l<? super T, ? extends T> lVar) {
        kotlin.s.c.l.f(aVar, "seedFunction");
        kotlin.s.c.l.f(lVar, "nextFunction");
        return new d(aVar, lVar);
    }

    public static <T, R> e<R> f(e<? extends T> eVar, kotlin.s.b.l<? super T, ? extends R> lVar) {
        kotlin.s.c.l.f(eVar, "<this>");
        kotlin.s.c.l.f(lVar, "transform");
        return new r(eVar, lVar);
    }

    public static <T, R> e<R> g(e<? extends T> eVar, kotlin.s.b.l<? super T, ? extends R> lVar) {
        kotlin.s.c.l.f(eVar, "<this>");
        kotlin.s.c.l.f(lVar, "transform");
        r rVar = new r(eVar, lVar);
        kotlin.s.c.l.f(rVar, "<this>");
        p pVar = p.a;
        kotlin.s.c.l.f(rVar, "<this>");
        kotlin.s.c.l.f(pVar, "predicate");
        c cVar = new c(rVar, false, pVar);
        kotlin.s.c.l.d(cVar, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return cVar;
    }

    public static <T> List<T> h(e<? extends T> eVar) {
        kotlin.s.c.l.f(eVar, "<this>");
        kotlin.s.c.l.f(eVar, "<this>");
        ArrayList arrayList = new ArrayList();
        kotlin.s.c.l.f(eVar, "<this>");
        kotlin.s.c.l.f(arrayList, "destination");
        Iterator<? extends T> it2 = eVar.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return kotlin.collections.g.M(arrayList);
    }
}
