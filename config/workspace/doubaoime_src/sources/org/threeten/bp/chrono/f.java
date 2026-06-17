package org.threeten.bp.chrono;

import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public abstract class f<D extends b> extends org.threeten.bp.o.b implements org.threeten.bp.temporal.a, Comparable<f<?>> {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.threeten.bp.chrono.b] */
    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(f<?> fVar) {
        int b = org.apache.http.conn.ssl.d.b(k(), fVar.k());
        if (b != 0) {
            return b;
        }
        int j = n().j() - fVar.n().j();
        if (j != 0) {
            return j;
        }
        int compareTo = m().compareTo(fVar.m());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = h().g().compareTo(fVar.h().g());
        return compareTo2 == 0 ? l().h().compareTo(fVar.l().h()) : compareTo2;
    }

    public abstract org.threeten.bp.l g();

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return super.get(eVar);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        if (ordinal != 28) {
            return ordinal != 29 ? m().get(eVar) : g().k();
        }
        throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Field too large for an int: ", eVar));
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        return ordinal != 28 ? ordinal != 29 ? m().getLong(eVar) : g().k() : k();
    }

    public abstract org.threeten.bp.k h();

    public int hashCode() {
        return (m().hashCode() ^ g().hashCode()) ^ Integer.rotateLeft(h().hashCode(), 3);
    }

    @Override // org.threeten.bp.o.b, org.threeten.bp.temporal.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f<D> c(long j, org.threeten.bp.temporal.h hVar) {
        return l().h().f(super.c(j, hVar));
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract f<D> d(long j, org.threeten.bp.temporal.h hVar);

    public long k() {
        return ((l().l() * 86400) + n().v()) - g().k();
    }

    public D l() {
        return m().m();
    }

    public abstract c<D> m();

    public org.threeten.bp.g n() {
        return m().n();
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public f<D> b(org.threeten.bp.temporal.c cVar) {
        return l().h().f(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract f<D> a(org.threeten.bp.temporal.e eVar, long j);

    public abstract f<D> q(org.threeten.bp.k kVar);

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        return (gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.f()) ? (R) h() : gVar == org.threeten.bp.temporal.f.a() ? (R) l().h() : gVar == org.threeten.bp.temporal.f.e() ? (R) ChronoUnit.NANOS : gVar == org.threeten.bp.temporal.f.d() ? (R) g() : gVar == org.threeten.bp.temporal.f.b() ? (R) org.threeten.bp.e.J(l().l()) : gVar == org.threeten.bp.temporal.f.c() ? (R) n() : (R) super.query(gVar);
    }

    public abstract f<D> r(org.threeten.bp.k kVar);

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? (eVar == ChronoField.INSTANT_SECONDS || eVar == ChronoField.OFFSET_SECONDS) ? eVar.range() : m().range(eVar) : eVar.rangeRefinedBy(this);
    }

    public String toString() {
        String str = m().toString() + g().toString();
        if (g() == h()) {
            return str;
        }
        return str + '[' + h().toString() + ']';
    }
}
