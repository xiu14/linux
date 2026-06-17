package e.b.l.s;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
class d implements h<Set> {
    private final h k;

    d(h hVar) {
        this.k = hVar;
    }

    @Override // e.b.l.s.h
    public byte a() {
        return (byte) 14;
    }

    @Override // e.b.l.s.h
    public void b(Set set, g.a.c.c.e eVar) throws g.a.c.b {
        Set set2 = set;
        byte a = this.k.a();
        int size = set2.size();
        g.a.c.c.a aVar = (g.a.c.c.a) eVar;
        Objects.requireNonNull(aVar);
        aVar.n(a);
        aVar.p(size);
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            this.k.b(it2.next(), eVar);
        }
    }

    @Override // e.b.l.s.h
    public Set c(g.a.c.c.e eVar) throws g.a.c.b {
        g.a.c.c.h j = eVar.j();
        HashSet hashSet = new HashSet(j.b);
        int i = j.b;
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(this.k.c(eVar));
        }
        return hashSet;
    }
}
