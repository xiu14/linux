package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class h implements Comparable<h> {
    private static final ConcurrentHashMap<String, h> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, h> b = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    protected h() {
    }

    public static h h(org.threeten.bp.temporal.b bVar) {
        org.apache.http.conn.ssl.d.k(bVar, "temporal");
        h hVar = (h) bVar.query(org.threeten.bp.temporal.f.a());
        return hVar != null ? hVar : l.f10784c;
    }

    static h l(DataInput dataInput) throws IOException {
        String readUTF = dataInput.readUTF();
        ConcurrentHashMap<String, h> concurrentHashMap = a;
        if (concurrentHashMap.isEmpty()) {
            m(l.f10784c);
            m(s.f10798c);
            m(p.f10797c);
            m(m.f10786d);
            j jVar = j.f10775c;
            m(jVar);
            concurrentHashMap.putIfAbsent("Hijrah", jVar);
            b.putIfAbsent("islamic", jVar);
            Iterator it2 = ServiceLoader.load(h.class, h.class.getClassLoader()).iterator();
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                a.putIfAbsent(hVar.j(), hVar);
                String i = hVar.i();
                if (i != null) {
                    b.putIfAbsent(i, hVar);
                }
            }
        }
        h hVar2 = a.get(readUTF);
        if (hVar2 == null && (hVar2 = b.get(readUTF)) == null) {
            throw new org.threeten.bp.b(e.a.a.a.a.s("Unknown chronology: ", readUTF));
        }
        return hVar2;
    }

    private static void m(h hVar) {
        a.putIfAbsent(hVar.j(), hVar);
        String i = hVar.i();
        if (i != null) {
            b.putIfAbsent(i, hVar);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        return j().compareTo(hVar.j());
    }

    public abstract b b(org.threeten.bp.temporal.b bVar);

    public abstract b c(long j);

    <D extends b> D d(org.threeten.bp.temporal.a aVar) {
        D d2 = (D) aVar;
        if (equals(d2.h())) {
            return d2;
        }
        StringBuilder M = e.a.a.a.a.M("Chrono mismatch, expected: ");
        M.append(j());
        M.append(", actual: ");
        M.append(d2.h().j());
        throw new ClassCastException(M.toString());
    }

    <D extends b> d<D> e(org.threeten.bp.temporal.a aVar) {
        d<D> dVar = (d) aVar;
        if (equals(dVar.m().h())) {
            return dVar;
        }
        StringBuilder M = e.a.a.a.a.M("Chrono mismatch, required: ");
        M.append(j());
        M.append(", supplied: ");
        M.append(dVar.m().h().j());
        throw new ClassCastException(M.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    <D extends b> g<D> f(org.threeten.bp.temporal.a aVar) {
        g<D> gVar = (g) aVar;
        if (equals(gVar.l().h())) {
            return gVar;
        }
        StringBuilder M = e.a.a.a.a.M("Chrono mismatch, required: ");
        M.append(j());
        M.append(", supplied: ");
        M.append(gVar.l().h().j());
        throw new ClassCastException(M.toString());
    }

    public abstract i g(int i);

    public int hashCode() {
        return getClass().hashCode() ^ j().hashCode();
    }

    public abstract String i();

    public abstract String j();

    public c<?> k(org.threeten.bp.temporal.b bVar) {
        try {
            return b(bVar).f(org.threeten.bp.g.h(bVar));
        } catch (org.threeten.bp.b e2) {
            StringBuilder M = e.a.a.a.a.M("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            M.append(bVar.getClass());
            throw new org.threeten.bp.b(M.toString(), e2);
        }
    }

    public f<?> n(org.threeten.bp.d dVar, org.threeten.bp.k kVar) {
        return g.t(this, dVar, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.threeten.bp.chrono.f, org.threeten.bp.chrono.f<?>] */
    public f<?> o(org.threeten.bp.temporal.b bVar) {
        try {
            org.threeten.bp.k f2 = org.threeten.bp.k.f(bVar);
            try {
                bVar = n(org.threeten.bp.d.h(bVar), f2);
                return bVar;
            } catch (org.threeten.bp.b unused) {
                return g.s(e(k(bVar)), f2, null);
            }
        } catch (org.threeten.bp.b e2) {
            StringBuilder M = e.a.a.a.a.M("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ");
            M.append(bVar.getClass());
            throw new org.threeten.bp.b(M.toString(), e2);
        }
    }

    public String toString() {
        return j();
    }
}
