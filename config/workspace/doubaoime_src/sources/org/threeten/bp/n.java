package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public final class n extends org.threeten.bp.chrono.f<e> implements org.threeten.bp.temporal.a, Serializable {
    private final f a;
    private final l b;

    /* renamed from: c, reason: collision with root package name */
    private final k f10855c;

    private n(f fVar, l lVar, k kVar) {
        this.a = fVar;
        this.b = lVar;
        this.f10855c = kVar;
    }

    private static n s(long j, int i, k kVar) {
        l a = kVar.h().a(d.n(j, i));
        return new n(f.z(j, i, a), a, kVar);
    }

    public static n t(org.threeten.bp.temporal.b bVar) {
        if (bVar instanceof n) {
            return (n) bVar;
        }
        try {
            k f2 = k.f(bVar);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (bVar.isSupported(chronoField)) {
                try {
                    return s(bVar.getLong(chronoField), bVar.get(ChronoField.NANO_OF_SECOND), f2);
                } catch (b unused) {
                }
            }
            return w(f.r(bVar), f2, null);
        } catch (b unused2) {
            throw new b("Unable to obtain ZonedDateTime from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName());
        }
    }

    public static n v(d dVar, k kVar) {
        org.apache.http.conn.ssl.d.k(dVar, "instant");
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        return s(dVar.i(), dVar.j(), kVar);
    }

    public static n w(f fVar, k kVar, l lVar) {
        org.apache.http.conn.ssl.d.k(fVar, "localDateTime");
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        if (kVar instanceof l) {
            return new n(fVar, (l) kVar, kVar);
        }
        org.threeten.bp.zone.e h = kVar.h();
        List<l> c2 = h.c(fVar);
        if (c2.size() == 1) {
            lVar = c2.get(0);
        } else if (c2.size() == 0) {
            org.threeten.bp.zone.d b = h.b(fVar);
            fVar = fVar.D(b.c().b());
            lVar = b.d();
        } else if (lVar == null || !c2.contains(lVar)) {
            l lVar2 = c2.get(0);
            org.apache.http.conn.ssl.d.k(lVar2, TypedValues.CycleType.S_WAVE_OFFSET);
            lVar = lVar2;
        }
        return new n(fVar, lVar, kVar);
    }

    private n y(f fVar) {
        return w(fVar, this.f10855c, this.b);
    }

    private n z(l lVar) {
        return (lVar.equals(this.b) || !this.f10855c.h().f(this.a, lVar)) ? this : new n(this.a, lVar, this.f10855c);
    }

    public f A() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public n b(org.threeten.bp.temporal.c cVar) {
        if (cVar instanceof e) {
            return w(f.y((e) cVar, this.a.n()), this.f10855c, this.b);
        }
        if (cVar instanceof g) {
            return w(f.y(this.a.F(), (g) cVar), this.f10855c, this.b);
        }
        if (cVar instanceof f) {
            return y((f) cVar);
        }
        if (!(cVar instanceof d)) {
            return cVar instanceof l ? z((l) cVar) : (n) cVar.adjustInto(this);
        }
        d dVar = (d) cVar;
        return s(dVar.i(), dVar.j(), this.f10855c);
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public n a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (n) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        int ordinal = chronoField.ordinal();
        return ordinal != 28 ? ordinal != 29 ? y(this.a.a(eVar, j)) : z(l.n(chronoField.checkValidIntValue(j))) : s(j, this.a.s(), this.f10855c);
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public n q(k kVar) {
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        return this.f10855c.equals(kVar) ? this : s(this.a.k(this.b), this.a.s(), kVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        n t = t(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, t);
        }
        n q = t.q(this.f10855c);
        return hVar.isDateBased() ? this.a.e(q.a, hVar) : h.h(this.a, this.b).e(h.h(q.a, q.b), hVar);
    }

    @Override // org.threeten.bp.chrono.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && this.b.equals(nVar.b) && this.f10855c.equals(nVar.f10855c);
    }

    @Override // org.threeten.bp.chrono.f
    public l g() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return super.get(eVar);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        if (ordinal != 28) {
            return ordinal != 29 ? this.a.get(eVar) : this.b.k();
        }
        throw new b(e.a.a.a.a.z("Field too large for an int: ", eVar));
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        return ordinal != 28 ? ordinal != 29 ? this.a.getLong(eVar) : this.b.k() : k();
    }

    @Override // org.threeten.bp.chrono.f
    public k h() {
        return this.f10855c;
    }

    @Override // org.threeten.bp.chrono.f
    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.f10855c.hashCode(), 3);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return (eVar instanceof ChronoField) || (eVar != null && eVar.isSupportedBy(this));
    }

    @Override // org.threeten.bp.chrono.f
    public e l() {
        return this.a.F();
    }

    @Override // org.threeten.bp.chrono.f
    public org.threeten.bp.chrono.c<e> m() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.f
    public g n() {
        return this.a.n();
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        return gVar == org.threeten.bp.temporal.f.b() ? (R) this.a.F() : (R) super.query(gVar);
    }

    @Override // org.threeten.bp.chrono.f
    public org.threeten.bp.chrono.f<e> r(k kVar) {
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        return this.f10855c.equals(kVar) ? this : w(this.a, kVar, this.b);
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? (eVar == ChronoField.INSTANT_SECONDS || eVar == ChronoField.OFFSET_SECONDS) ? eVar.range() : this.a.range(eVar) : eVar.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.chrono.f
    public String toString() {
        String str = this.a.toString() + this.b.toString();
        if (this.b == this.f10855c) {
            return str;
        }
        return str + '[' + this.f10855c.toString() + ']';
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public n c(long j, org.threeten.bp.temporal.h hVar) {
        return j == Long.MIN_VALUE ? d(LocationRequestCompat.PASSIVE_INTERVAL, hVar).d(1L, hVar) : d(-j, hVar);
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public n d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (n) hVar.addTo(this, j);
        }
        if (hVar.isDateBased()) {
            return y(this.a.d(j, hVar));
        }
        f d2 = this.a.d(j, hVar);
        l lVar = this.b;
        k kVar = this.f10855c;
        org.apache.http.conn.ssl.d.k(d2, "localDateTime");
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        return s(d2.k(lVar), d2.s(), kVar);
    }
}
