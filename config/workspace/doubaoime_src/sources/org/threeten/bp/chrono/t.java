package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class t extends a<t> implements Serializable {
    private final org.threeten.bp.e a;

    t(org.threeten.bp.e eVar) {
        org.apache.http.conn.ssl.d.k(eVar, "date");
        this.a = eVar;
    }

    private long s() {
        return ((t() * 12) + this.a.w()) - 1;
    }

    private int t() {
        return this.a.y() + 543;
    }

    private t u(org.threeten.bp.e eVar) {
        return eVar.equals(this.a) ? this : new t(eVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a b(org.threeten.bp.temporal.c cVar) {
        return (t) s.f10798c.d(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.o.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a c(long j, org.threeten.bp.temporal.h hVar) {
        return (t) super.c(j, hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a d(long j, org.threeten.bp.temporal.h hVar) {
        return (t) super.d(j, hVar);
    }

    @Override // org.threeten.bp.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.a.equals(((t) obj).a);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b
    public final c<t> f(org.threeten.bp.g gVar) {
        return d.q(this, gVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        switch (((ChronoField) eVar).ordinal()) {
            case 24:
                return s();
            case 25:
                int t = t();
                if (t < 1) {
                    t = 1 - t;
                }
                return t;
            case 26:
                return t();
            case 27:
                return t() < 1 ? 0 : 1;
            default:
                return this.a.getLong(eVar);
        }
    }

    @Override // org.threeten.bp.chrono.b
    public h h() {
        return s.f10798c;
    }

    @Override // org.threeten.bp.chrono.b
    public int hashCode() {
        s sVar = s.f10798c;
        return 146118545 ^ this.a.hashCode();
    }

    @Override // org.threeten.bp.chrono.b
    public i i() {
        return (ThaiBuddhistEra) super.i();
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: j */
    public b c(long j, org.threeten.bp.temporal.h hVar) {
        return (t) super.c(j, hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b
    /* renamed from: k */
    public b d(long j, org.threeten.bp.temporal.h hVar) {
        return (t) super.d(j, hVar);
    }

    @Override // org.threeten.bp.chrono.b
    public long l() {
        return this.a.l();
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: m */
    public b b(org.threeten.bp.temporal.c cVar) {
        return (t) s.f10798c.d(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.a
    /* renamed from: o */
    public a<t> d(long j, org.threeten.bp.temporal.h hVar) {
        return (t) super.d(j, hVar);
    }

    @Override // org.threeten.bp.chrono.a
    a<t> p(long j) {
        return u(this.a.L(j));
    }

    @Override // org.threeten.bp.chrono.a
    a<t> q(long j) {
        return u(this.a.M(j));
    }

    @Override // org.threeten.bp.chrono.a
    a<t> r(long j) {
        return u(this.a.O(j));
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (!isSupported(eVar)) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        ChronoField chronoField = (ChronoField) eVar;
        int ordinal = chronoField.ordinal();
        if (ordinal == 18 || ordinal == 19 || ordinal == 21) {
            return this.a.range(eVar);
        }
        if (ordinal != 25) {
            return s.f10798c.p(chronoField);
        }
        org.threeten.bp.temporal.j range = ChronoField.YEAR.range();
        return org.threeten.bp.temporal.j.g(1L, t() <= 0 ? (-(range.d() + 543)) + 1 : 543 + range.c());
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public t a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (t) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        if (getLong(chronoField) == j) {
            return this;
        }
        switch (chronoField.ordinal()) {
            case 24:
                s.f10798c.p(chronoField).b(j, chronoField);
                return u(this.a.M(j - s()));
            case 25:
            case 26:
            case 27:
                int a = s.f10798c.p(chronoField).a(j, chronoField);
                switch (chronoField.ordinal()) {
                    case 25:
                        org.threeten.bp.e eVar2 = this.a;
                        if (t() < 1) {
                            a = 1 - a;
                        }
                        return u(eVar2.V(a - 543));
                    case 26:
                        return u(this.a.V(a - 543));
                    case 27:
                        return u(this.a.V((1 - t()) - 543));
                }
        }
        return u(this.a.a(eVar, j));
    }
}
