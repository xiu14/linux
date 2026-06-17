package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class n extends a<n> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final org.threeten.bp.e f10790d = org.threeten.bp.e.H(1873, 1, 1);
    private final org.threeten.bp.e a;
    private transient o b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f10791c;

    n(org.threeten.bp.e eVar) {
        if (eVar.A(f10790d)) {
            throw new org.threeten.bp.b("Minimum supported date is January 1st Meiji 6");
        }
        this.b = o.g(eVar);
        this.f10791c = eVar.y() - (r0.j().y() - 1);
        this.a = eVar;
    }

    private org.threeten.bp.temporal.j s(int i) {
        Calendar calendar = Calendar.getInstance(m.f10785c);
        calendar.set(0, this.b.h() + 2);
        calendar.set(this.f10791c, this.a.w() - 1, this.a.t());
        return org.threeten.bp.temporal.j.g(calendar.getActualMinimum(i), calendar.getActualMaximum(i));
    }

    private long t() {
        return this.f10791c == 1 ? (this.a.v() - this.b.j().v()) + 1 : this.a.v();
    }

    private n u(org.threeten.bp.e eVar) {
        return eVar.equals(this.a) ? this : new n(eVar);
    }

    private n w(o oVar, int i) {
        Objects.requireNonNull(m.f10786d);
        if (!(oVar instanceof o)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int y = (oVar.j().y() + i) - 1;
        org.threeten.bp.temporal.j.g(1L, (oVar.f().y() - oVar.j().y()) + 1).b(i, ChronoField.YEAR_OF_ERA);
        return u(this.a.V(y));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a b(org.threeten.bp.temporal.c cVar) {
        return (n) m.f10786d.d(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.o.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a c(long j, org.threeten.bp.temporal.h hVar) {
        return (n) super.c(j, hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a d(long j, org.threeten.bp.temporal.h hVar) {
        return (n) super.d(j, hVar);
    }

    @Override // org.threeten.bp.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.a.equals(((n) obj).a);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b
    public final c<n> f(org.threeten.bp.g gVar) {
        return d.q(this, gVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        if (ordinal != 16 && ordinal != 17) {
            if (ordinal == 19) {
                return t();
            }
            if (ordinal == 25) {
                return this.f10791c;
            }
            if (ordinal == 27) {
                return this.b.h();
            }
            if (ordinal != 21 && ordinal != 22) {
                return this.a.getLong(eVar);
            }
        }
        throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
    }

    @Override // org.threeten.bp.chrono.b
    public h h() {
        return m.f10786d;
    }

    @Override // org.threeten.bp.chrono.b
    public int hashCode() {
        Objects.requireNonNull(m.f10786d);
        return (-688086063) ^ this.a.hashCode();
    }

    @Override // org.threeten.bp.chrono.b
    public i i() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || eVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || eVar == ChronoField.ALIGNED_WEEK_OF_MONTH || eVar == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(eVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: j */
    public b c(long j, org.threeten.bp.temporal.h hVar) {
        return (n) super.c(j, hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b
    /* renamed from: k */
    public b d(long j, org.threeten.bp.temporal.h hVar) {
        return (n) super.d(j, hVar);
    }

    @Override // org.threeten.bp.chrono.b
    public long l() {
        return this.a.l();
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: m */
    public b b(org.threeten.bp.temporal.c cVar) {
        return (n) m.f10786d.d(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.a
    /* renamed from: o */
    public a<n> d(long j, org.threeten.bp.temporal.h hVar) {
        return (n) super.d(j, hVar);
    }

    @Override // org.threeten.bp.chrono.a
    a<n> p(long j) {
        return u(this.a.L(j));
    }

    @Override // org.threeten.bp.chrono.a
    a<n> q(long j) {
        return u(this.a.M(j));
    }

    @Override // org.threeten.bp.chrono.a
    a<n> r(long j) {
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
        return ordinal != 19 ? ordinal != 25 ? m.f10786d.p(chronoField) : s(1) : s(6);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public n a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (n) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        if (getLong(chronoField) == j) {
            return this;
        }
        int ordinal = chronoField.ordinal();
        if (ordinal == 19 || ordinal == 25 || ordinal == 27) {
            int a = m.f10786d.p(chronoField).a(j, chronoField);
            int ordinal2 = chronoField.ordinal();
            if (ordinal2 == 19) {
                return u(this.a.L(a - t()));
            }
            if (ordinal2 == 25) {
                return w(this.b, a);
            }
            if (ordinal2 == 27) {
                return w(o.i(a), this.f10791c);
            }
        }
        return u(this.a.a(eVar, j));
    }
}
