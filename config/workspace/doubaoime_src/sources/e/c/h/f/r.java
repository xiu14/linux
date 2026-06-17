package e.c.h.f;

/* loaded from: classes2.dex */
public class r<K, V> implements s<K, V> {
    private final s<K, V> a;
    private final u b;

    public r(s<K, V> sVar, u uVar) {
        this.a = sVar;
        this.b = uVar;
    }

    @Override // e.c.h.f.s
    public e.c.c.g.a<V> b(K k, e.c.c.g.a<V> aVar) {
        this.b.c(k);
        return this.a.b(k, aVar);
    }

    @Override // e.c.h.f.s
    public e.c.c.g.a<V> get(K k) {
        e.c.c.g.a<V> aVar = this.a.get(k);
        if (aVar == null) {
            this.b.b(k);
        } else {
            this.b.a(k);
            V r = aVar.r();
            if (r instanceof com.facebook.imagepipeline.image.j) {
                ((com.facebook.imagepipeline.image.j) r).a();
            }
        }
        return aVar;
    }
}
