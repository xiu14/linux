package org.threeten.bp.chrono;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public abstract class c<D extends b> extends org.threeten.bp.o.b implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Comparable<c<?>> {
    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.EPOCH_DAY, m().l()).a(ChronoField.NANO_OF_DAY, n().u());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public abstract f<D> f(org.threeten.bp.k kVar);

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(c<?> cVar) {
        int compareTo = m().compareTo(cVar.m());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = n().compareTo(cVar.n());
        return compareTo2 == 0 ? h().compareTo(cVar.h()) : compareTo2;
    }

    public h h() {
        return m().h();
    }

    public int hashCode() {
        return m().hashCode() ^ n().hashCode();
    }

    @Override // org.threeten.bp.o.b, org.threeten.bp.temporal.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c<D> c(long j, org.threeten.bp.temporal.h hVar) {
        return m().h().e(super.c(j, hVar));
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract c<D> d(long j, org.threeten.bp.temporal.h hVar);

    public long k(org.threeten.bp.l lVar) {
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return ((m().l() * 86400) + n().v()) - lVar.k();
    }

    public org.threeten.bp.d l(org.threeten.bp.l lVar) {
        return org.threeten.bp.d.n(k(lVar), n().j());
    }

    public abstract D m();

    public abstract org.threeten.bp.g n();

    @Override // org.threeten.bp.temporal.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public c<D> b(org.threeten.bp.temporal.c cVar) {
        return m().h().e(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract c<D> a(org.threeten.bp.temporal.e eVar, long j);

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.a()) {
            return (R) h();
        }
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (gVar == org.threeten.bp.temporal.f.b()) {
            return (R) org.threeten.bp.e.J(m().l());
        }
        if (gVar == org.threeten.bp.temporal.f.c()) {
            return (R) n();
        }
        if (gVar == org.threeten.bp.temporal.f.f() || gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.d()) {
            return null;
        }
        return (R) super.query(gVar);
    }

    public String toString() {
        return m().toString() + 'T' + n().toString();
    }
}
