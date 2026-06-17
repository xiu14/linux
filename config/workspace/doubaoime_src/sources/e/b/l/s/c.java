package e.b.l.s;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
class c implements h<Map<?, ?>> {
    private final h k;
    private final h l;

    c(h hVar, h hVar2) {
        this.k = hVar;
        this.l = hVar2;
    }

    @Override // e.b.l.s.h
    public byte a() {
        return (byte) 13;
    }

    @Override // e.b.l.s.h
    public void b(Map<?, ?> map, g.a.c.c.e eVar) throws g.a.c.b {
        Map<?, ?> map2 = map;
        byte a = this.k.a();
        byte a2 = this.l.a();
        int size = map2.size();
        g.a.c.c.a aVar = (g.a.c.c.a) eVar;
        Objects.requireNonNull(aVar);
        aVar.n(a);
        aVar.n(a2);
        aVar.p(size);
        for (Map.Entry<?, ?> entry : map2.entrySet()) {
            this.k.b(entry.getKey(), eVar);
            this.l.b(entry.getValue(), eVar);
        }
    }

    @Override // e.b.l.s.h
    public Map<?, ?> c(g.a.c.c.e eVar) throws g.a.c.b {
        g.a.c.c.d i = eVar.i();
        HashMap hashMap = new HashMap(i.f10077c);
        int i2 = i.f10077c;
        for (int i3 = 0; i3 < i2; i3++) {
            hashMap.put(this.k.c(eVar), this.l.c(eVar));
        }
        return hashMap;
    }
}
