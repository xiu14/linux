package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import java.io.Serializable;
import java.util.Objects;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public final class h extends org.threeten.bp.o.b implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Comparable<h>, Serializable {
    private final f a;
    private final l b;

    static {
        f fVar = f.f10806c;
        l lVar = l.h;
        Objects.requireNonNull(fVar);
        org.apache.http.conn.ssl.d.k(fVar, "dateTime");
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        f fVar2 = f.f10807d;
        l lVar2 = l.f10851g;
        Objects.requireNonNull(fVar2);
        org.apache.http.conn.ssl.d.k(fVar2, "dateTime");
        org.apache.http.conn.ssl.d.k(lVar2, TypedValues.CycleType.S_WAVE_OFFSET);
    }

    private h(f fVar, l lVar) {
        org.apache.http.conn.ssl.d.k(fVar, "dateTime");
        this.a = fVar;
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        this.b = lVar;
    }

    public static h f(org.threeten.bp.temporal.b bVar) {
        if (bVar instanceof h) {
            return (h) bVar;
        }
        try {
            l j = l.j(bVar);
            try {
                return new h(f.r(bVar), j);
            } catch (b unused) {
                return i(d.h(bVar), j);
            }
        } catch (b unused2) {
            throw new b("Unable to obtain OffsetDateTime from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName());
        }
    }

    public static h h(f fVar, l lVar) {
        return new h(fVar, lVar);
    }

    public static h i(d dVar, k kVar) {
        org.apache.http.conn.ssl.d.k(dVar, "instant");
        org.apache.http.conn.ssl.d.k(kVar, "zone");
        l a = org.threeten.bp.zone.e.g((l) kVar).a(dVar);
        return new h(f.z(dVar.i(), dVar.j(), a), a);
    }

    private h m(f fVar, l lVar) {
        return (this.a == fVar && this.b.equals(lVar)) ? this : new h(fVar, lVar);
    }

    @Override // org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (h) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        int ordinal = chronoField.ordinal();
        return ordinal != 28 ? ordinal != 29 ? m(this.a.a(eVar, j), this.b) : m(this.a, l.n(chronoField.checkValidIntValue(j))) : i(d.n(j, g()), this.b);
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.EPOCH_DAY, this.a.F().l()).a(ChronoField.NANO_OF_DAY, l().u()).a(ChronoField.OFFSET_SECONDS, this.b.k());
    }

    @Override // org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a b(org.threeten.bp.temporal.c cVar) {
        return ((cVar instanceof e) || (cVar instanceof g) || (cVar instanceof f)) ? m(this.a.b(cVar), this.b) : cVar instanceof d ? i((d) cVar, this.b) : cVar instanceof l ? m(this.a, (l) cVar) : cVar instanceof h ? (h) cVar : (h) cVar.adjustInto(this);
    }

    @Override // org.threeten.bp.o.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a c(long j, org.threeten.bp.temporal.h hVar) {
        return j == Long.MIN_VALUE ? d(LocationRequestCompat.PASSIVE_INTERVAL, hVar).d(1L, hVar) : d(-j, hVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(h hVar) {
        h hVar2 = hVar;
        if (this.b.equals(hVar2.b)) {
            return this.a.compareTo(hVar2.a);
        }
        int b = org.apache.http.conn.ssl.d.b(k(), hVar2.k());
        return (b == 0 && (b = l().j() - hVar2.l().j()) == 0) ? this.a.compareTo(hVar2.a) : b;
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        h f2 = f(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, f2);
        }
        l lVar = this.b;
        if (!lVar.equals(f2.b)) {
            f2 = new h(f2.a.D(lVar.k() - f2.b.k()), lVar);
        }
        return this.a.e(f2.a, hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a) && this.b.equals(hVar.b);
    }

    public int g() {
        return this.a.s();
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
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

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        return ordinal != 28 ? ordinal != 29 ? this.a.getLong(eVar) : this.b.k() : k();
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return (eVar instanceof ChronoField) || (eVar != null && eVar.isSupportedBy(this));
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public h d(long j, org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoUnit ? m(this.a.d(j, hVar), this.b) : (h) hVar.addTo(this, j);
    }

    public long k() {
        return this.a.k(this.b);
    }

    public g l() {
        return this.a.n();
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.a()) {
            return (R) org.threeten.bp.chrono.l.f10784c;
        }
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (gVar == org.threeten.bp.temporal.f.d() || gVar == org.threeten.bp.temporal.f.f()) {
            return (R) this.b;
        }
        if (gVar == org.threeten.bp.temporal.f.b()) {
            return (R) this.a.F();
        }
        if (gVar == org.threeten.bp.temporal.f.c()) {
            return (R) l();
        }
        if (gVar == org.threeten.bp.temporal.f.g()) {
            return null;
        }
        return (R) super.query(gVar);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? (eVar == ChronoField.INSTANT_SECONDS || eVar == ChronoField.OFFSET_SECONDS) ? eVar.range() : this.a.range(eVar) : eVar.rangeRefinedBy(this);
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }
}
