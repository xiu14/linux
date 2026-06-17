package org.threeten.bp.chrono;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
final class g<D extends b> extends f<D> implements Serializable {
    private final d<D> a;
    private final org.threeten.bp.l b;

    /* renamed from: c, reason: collision with root package name */
    private final org.threeten.bp.k f10774c;

    private g(d<D> dVar, org.threeten.bp.l lVar, org.threeten.bp.k kVar) {
        org.apache.http.conn.ssl.d.k(dVar, "dateTime");
        this.a = dVar;
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        this.b = lVar;
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        this.f10774c = kVar;
    }

    static <R extends b> f<R> s(d<R> dVar, org.threeten.bp.k kVar, org.threeten.bp.l lVar) {
        org.apache.http.conn.ssl.d.k(dVar, "localDateTime");
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        if (kVar instanceof org.threeten.bp.l) {
            return new g(dVar, (org.threeten.bp.l) kVar, kVar);
        }
        org.threeten.bp.zone.e h = kVar.h();
        org.threeten.bp.f r = org.threeten.bp.f.r(dVar);
        List<org.threeten.bp.l> c2 = h.c(r);
        if (c2.size() == 1) {
            lVar = c2.get(0);
        } else if (c2.size() == 0) {
            org.threeten.bp.zone.d b = h.b(r);
            dVar = dVar.u(b.c().b());
            lVar = b.d();
        } else if (lVar == null || !c2.contains(lVar)) {
            lVar = c2.get(0);
        }
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return new g(dVar, lVar, kVar);
    }

    static <R extends b> g<R> t(h hVar, org.threeten.bp.d dVar, org.threeten.bp.k kVar) {
        org.threeten.bp.l a = kVar.h().a(dVar);
        org.apache.http.conn.ssl.d.k(a, TypedValues.CycleType.S_WAVE_OFFSET);
        return new g<>((d) hVar.k(org.threeten.bp.f.z(dVar.i(), dVar.j(), a)), a, kVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        f<?> o = l().h().o(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, o);
        }
        return this.a.e(o.q(this.b).m(), hVar);
    }

    @Override // org.threeten.bp.chrono.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.f
    public org.threeten.bp.l g() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.f
    public org.threeten.bp.k h() {
        return this.f10774c;
    }

    @Override // org.threeten.bp.chrono.f
    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.f10774c.hashCode(), 3);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return (eVar instanceof ChronoField) || (eVar != null && eVar.isSupportedBy(this));
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.a
    /* renamed from: j */
    public f<D> d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return l().h().f(hVar.addTo(this, j));
        }
        return l().h().f(this.a.d(j, hVar).adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.f
    public c<D> m() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.a
    /* renamed from: p */
    public f<D> a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return l().h().f(eVar.adjustInto(this, j));
        }
        ChronoField chronoField = (ChronoField) eVar;
        int ordinal = chronoField.ordinal();
        if (ordinal == 28) {
            return d(j - k(), ChronoUnit.SECONDS);
        }
        if (ordinal != 29) {
            return s(this.a.a(eVar, j), this.f10774c, this.b);
        }
        return t(l().h(), this.a.l(org.threeten.bp.l.n(chronoField.checkValidIntValue(j))), this.f10774c);
    }

    @Override // org.threeten.bp.chrono.f
    public f<D> q(org.threeten.bp.k kVar) {
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        if (this.f10774c.equals(kVar)) {
            return this;
        }
        return t(l().h(), this.a.l(this.b), kVar);
    }

    @Override // org.threeten.bp.chrono.f
    public f<D> r(org.threeten.bp.k kVar) {
        return s(this.a, kVar, this.b);
    }

    @Override // org.threeten.bp.chrono.f
    public String toString() {
        String str = this.a.toString() + this.b.toString();
        if (this.b == this.f10774c) {
            return str;
        }
        return str + '[' + this.f10774c.toString() + ']';
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.f10774c);
    }
}
