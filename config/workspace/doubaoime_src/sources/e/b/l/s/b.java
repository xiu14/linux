package e.b.l.s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
class b implements h<List> {
    private final h k;

    b(h hVar) {
        this.k = hVar;
    }

    @Override // e.b.l.s.h
    public byte a() {
        return (byte) 15;
    }

    @Override // e.b.l.s.h
    public void b(List list, g.a.c.c.e eVar) throws g.a.c.b {
        List list2 = list;
        byte a = this.k.a();
        int size = list2.size();
        g.a.c.c.a aVar = (g.a.c.c.a) eVar;
        Objects.requireNonNull(aVar);
        aVar.n(a);
        aVar.p(size);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.k.b(it2.next(), eVar);
        }
    }

    @Override // e.b.l.s.h
    public List c(g.a.c.c.e eVar) throws g.a.c.b {
        g.a.c.c.c h = eVar.h();
        ArrayList arrayList = new ArrayList(h.b);
        int i = h.b;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.k.c(eVar));
        }
        return arrayList;
    }
}
