package kotlin.r;

import kotlin.r.f;
import kotlin.r.f.b;
import kotlin.s.b.l;

/* loaded from: classes2.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {
    private final l<f.b, E> a;
    private final f.c<?> b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.r.f$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.s.b.l<? super kotlin.r.f$b, ? extends E extends B>, kotlin.s.b.l<kotlin.r.f$b, E extends B>] */
    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        kotlin.s.c.l.f(cVar, "baseKey");
        kotlin.s.c.l.f(lVar, "safeCast");
        this.a = lVar;
        this.b = cVar instanceof b ? (f.c<B>) ((b) cVar).b : cVar;
    }

    public final boolean a(f.c<?> cVar) {
        kotlin.s.c.l.f(cVar, "key");
        return cVar == this || this.b == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/r/f$b;)TE; */
    public final f.b b(f.b bVar) {
        kotlin.s.c.l.f(bVar, "element");
        return (f.b) this.a.invoke(bVar);
    }
}
