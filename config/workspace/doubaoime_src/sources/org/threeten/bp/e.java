package org.threeten.bp;

import androidx.core.location.LocationRequestCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import org.threeten.bp.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public final class e extends org.threeten.bp.chrono.b implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final e f10803d = H(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final e f10804e = H(999999999, 12, 31);
    private final int a;
    private final short b;

    /* renamed from: c, reason: collision with root package name */
    private final short f10805c;

    private e(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.f10805c = (short) i3;
    }

    private long F(e eVar) {
        return (((eVar.x() * 32) + eVar.f10805c) - ((x() * 32) + this.f10805c)) / 32;
    }

    public static e G() {
        k l;
        m mVar;
        m mVar2;
        Map<String, String> map = k.a;
        String id = TimeZone.getDefault().getID();
        Map<String, String> map2 = k.a;
        org.apache.http.conn.ssl.d.k(id, "zoneId");
        org.apache.http.conn.ssl.d.k(map2, "aliasMap");
        String str = map2.get(id);
        if (str != null) {
            id = str;
        }
        org.apache.http.conn.ssl.d.k(id, "zoneId");
        if (id.equals("Z")) {
            l = l.f10850f;
        } else {
            if (id.length() == 1) {
                throw new b(e.a.a.a.a.s("Invalid zone: ", id));
            }
            if (id.startsWith("+") || id.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                l = l.l(id);
            } else if (id.equals("UTC") || id.equals("GMT") || id.equals("UT")) {
                l lVar = l.f10850f;
                Objects.requireNonNull(lVar);
                l = new m(id, org.threeten.bp.zone.e.g(lVar));
            } else if (id.startsWith("UTC+") || id.startsWith("GMT+") || id.startsWith("UTC-") || id.startsWith("GMT-")) {
                l l2 = l.l(id.substring(3));
                if (l2.k() == 0) {
                    mVar = new m(id.substring(0, 3), org.threeten.bp.zone.e.g(l2));
                } else {
                    mVar = new m(id.substring(0, 3) + l2.g(), org.threeten.bp.zone.e.g(l2));
                }
                l = mVar;
            } else if (id.startsWith("UT+") || id.startsWith("UT-")) {
                l l3 = l.l(id.substring(2));
                if (l3.k() == 0) {
                    mVar2 = new m("UT", org.threeten.bp.zone.e.g(l3));
                } else {
                    StringBuilder M = e.a.a.a.a.M("UT");
                    M.append(l3.g());
                    mVar2 = new m(M.toString(), org.threeten.bp.zone.e.g(l3));
                }
                l = mVar2;
            } else {
                l = m.i(id, true);
            }
        }
        org.apache.http.conn.ssl.d.k(new a.C0489a(l), "clock");
        return J(org.apache.http.conn.ssl.d.d(d.l(System.currentTimeMillis()).i() + r0.a().h().a(r1).k(), 86400L));
    }

    public static e H(int i, int i2, int i3) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        ChronoField.DAY_OF_MONTH.checkValidValue(i3);
        return p(i, Month.of(i2), i3);
    }

    public static e I(int i, Month month, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        org.apache.http.conn.ssl.d.k(month, "month");
        ChronoField.DAY_OF_MONTH.checkValidValue(i2);
        return p(i, month, i2);
    }

    public static e J(long j) {
        long j2;
        ChronoField.EPOCH_DAY.checkValidValue(j);
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new e(ChronoField.YEAR.checkValidIntValue(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    private static e P(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, org.threeten.bp.chrono.l.f10784c.p((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return H(i, i2, i3);
    }

    private static e p(int i, Month month, int i2) {
        if (i2 <= 28 || i2 <= month.length(org.threeten.bp.chrono.l.f10784c.p(i))) {
            return new e(i, month.getValue(), i2);
        }
        if (i2 == 29) {
            throw new b(e.a.a.a.a.k("Invalid date 'February 29' as '", i, "' is not a leap year"));
        }
        StringBuilder M = e.a.a.a.a.M("Invalid date '");
        M.append(month.name());
        M.append(" ");
        M.append(i2);
        M.append("'");
        throw new b(M.toString());
    }

    public static e r(org.threeten.bp.temporal.b bVar) {
        e eVar = (e) bVar.query(org.threeten.bp.temporal.f.b());
        if (eVar != null) {
            return eVar;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName());
    }

    private int s(org.threeten.bp.temporal.e eVar) {
        switch (((ChronoField) eVar).ordinal()) {
            case 15:
                return u().getValue();
            case 16:
                return ((this.f10805c - 1) % 7) + 1;
            case 17:
                return ((v() - 1) % 7) + 1;
            case 18:
                return this.f10805c;
            case 19:
                return v();
            case 20:
                throw new b(e.a.a.a.a.z("Field too large for an int: ", eVar));
            case 21:
                return ((this.f10805c - 1) / 7) + 1;
            case 22:
                return ((v() - 1) / 7) + 1;
            case 23:
                return this.b;
            case 24:
                throw new b(e.a.a.a.a.z("Field too large for an int: ", eVar));
            case 25:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 26:
                return this.a;
            case 27:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
    }

    private long x() {
        return (this.a * 12) + (this.b - 1);
    }

    public boolean A(org.threeten.bp.chrono.b bVar) {
        return bVar instanceof e ? o((e) bVar) < 0 : l() < bVar.l();
    }

    public boolean B() {
        return org.threeten.bp.chrono.l.f10784c.p(this.a);
    }

    public int C() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : B() ? 29 : 28;
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public e c(long j, org.threeten.bp.temporal.h hVar) {
        return j == Long.MIN_VALUE ? d(LocationRequestCompat.PASSIVE_INTERVAL, hVar).d(1L, hVar) : d(-j, hVar);
    }

    public e E(long j) {
        return j == Long.MIN_VALUE ? L(LocationRequestCompat.PASSIVE_INTERVAL).L(1L) : L(-j);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public e d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (e) hVar.addTo(this, j);
        }
        switch (((ChronoUnit) hVar).ordinal()) {
            case 7:
                return L(j);
            case 8:
                return N(j);
            case 9:
                return M(j);
            case 10:
                return O(j);
            case 11:
                return O(org.apache.http.conn.ssl.d.n(j, 10));
            case 12:
                return O(org.apache.http.conn.ssl.d.n(j, 100));
            case 13:
                return O(org.apache.http.conn.ssl.d.n(j, 1000));
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return a(chronoField, org.apache.http.conn.ssl.d.m(getLong(chronoField), j));
            default:
                throw new org.threeten.bp.temporal.i("Unsupported unit: " + hVar);
        }
    }

    public e L(long j) {
        return j == 0 ? this : J(org.apache.http.conn.ssl.d.m(l(), j));
    }

    public e M(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        return P(ChronoField.YEAR.checkValidIntValue(org.apache.http.conn.ssl.d.d(j2, 12L)), org.apache.http.conn.ssl.d.f(j2, 12) + 1, this.f10805c);
    }

    public e N(long j) {
        return L(org.apache.http.conn.ssl.d.n(j, 7));
    }

    public e O(long j) {
        return j == 0 ? this : P(ChronoField.YEAR.checkValidIntValue(this.a + j), this.b, this.f10805c);
    }

    public i Q(org.threeten.bp.chrono.b bVar) {
        e r = r(bVar);
        long x = r.x() - x();
        int i = r.f10805c - this.f10805c;
        if (x > 0 && i < 0) {
            x--;
            i = (int) (r.l() - M(x).l());
        } else if (x < 0 && i > 0) {
            x++;
            i -= r.C();
        }
        return i.a(org.apache.http.conn.ssl.d.q(x / 12), (int) (x % 12), i);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public e b(org.threeten.bp.temporal.c cVar) {
        return cVar instanceof e ? (e) cVar : (e) cVar.adjustInto(this);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public e a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (e) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        switch (chronoField.ordinal()) {
            case 15:
                return L(j - u().getValue());
            case 16:
                return L(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 17:
                return L(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 18:
                return T((int) j);
            case 19:
                return U((int) j);
            case 20:
                return J(j);
            case 21:
                return N(j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 22:
                return N(j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 23:
                int i = (int) j;
                if (this.b == i) {
                    return this;
                }
                ChronoField.MONTH_OF_YEAR.checkValidValue(i);
                return P(this.a, i, this.f10805c);
            case 24:
                return M(j - getLong(ChronoField.PROLEPTIC_MONTH));
            case 25:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return V((int) j);
            case 26:
                return V((int) j);
            case 27:
                return getLong(ChronoField.ERA) == j ? this : V(1 - this.a);
            default:
                throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
    }

    public e T(int i) {
        return this.f10805c == i ? this : H(this.a, this.b, i);
    }

    public e U(int i) {
        if (v() == i) {
            return this;
        }
        int i2 = this.a;
        long j = i2;
        ChronoField.YEAR.checkValidValue(j);
        ChronoField.DAY_OF_YEAR.checkValidValue(i);
        boolean p = org.threeten.bp.chrono.l.f10784c.p(j);
        if (i == 366 && !p) {
            throw new b(e.a.a.a.a.k("Invalid date 'DayOfYear 366' as '", i2, "' is not a leap year"));
        }
        Month of = Month.of(((i - 1) / 31) + 1);
        if (i > (of.length(p) + of.firstDayOfYear(p)) - 1) {
            of = of.plus(1L);
        }
        return p(i2, of, (i - of.firstDayOfYear(p)) + 1);
    }

    public e V(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.checkValidValue(i);
        return P(i, this.b, this.f10805c);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return super.adjustInto(aVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        e r = r(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, r);
        }
        switch (((ChronoUnit) hVar).ordinal()) {
            case 7:
                return q(r);
            case 8:
                return q(r) / 7;
            case 9:
                return F(r);
            case 10:
                return F(r) / 12;
            case 11:
                return F(r) / 120;
            case 12:
                return F(r) / 1200;
            case 13:
                return F(r) / 12000;
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return r.getLong(chronoField) - getLong(chronoField);
            default:
                throw new org.threeten.bp.temporal.i("Unsupported unit: " + hVar);
        }
    }

    @Override // org.threeten.bp.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && o((e) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.b
    public org.threeten.bp.chrono.c f(g gVar) {
        return f.y(this, gVar);
    }

    @Override // org.threeten.bp.chrono.b, java.lang.Comparable
    /* renamed from: g */
    public int compareTo(org.threeten.bp.chrono.b bVar) {
        return bVar instanceof e ? o((e) bVar) : super.compareTo(bVar);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? s(eVar) : range(eVar).a(getLong(eVar), eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar == ChronoField.EPOCH_DAY ? l() : eVar == ChronoField.PROLEPTIC_MONTH ? x() : s(eVar) : eVar.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.b
    public org.threeten.bp.chrono.h h() {
        return org.threeten.bp.chrono.l.f10784c;
    }

    @Override // org.threeten.bp.chrono.b
    public int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.f10805c) ^ (i & (-2048));
    }

    @Override // org.threeten.bp.chrono.b
    public org.threeten.bp.chrono.i i() {
        return super.i();
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return super.isSupported(eVar);
    }

    @Override // org.threeten.bp.chrono.b
    public long l() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.f10805c - 1);
        if (j3 > 2) {
            j5--;
            if (!B()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    int o(e eVar) {
        int i = this.a - eVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - eVar.b;
        return i2 == 0 ? this.f10805c - eVar.f10805c : i2;
    }

    long q(e eVar) {
        return eVar.l() - l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.chrono.b, org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        return gVar == org.threeten.bp.temporal.f.b() ? this : (R) super.query(gVar);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        ChronoField chronoField = (ChronoField) eVar;
        if (!chronoField.isDateBased()) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        int ordinal = chronoField.ordinal();
        if (ordinal == 18) {
            return org.threeten.bp.temporal.j.g(1L, C());
        }
        if (ordinal == 19) {
            return org.threeten.bp.temporal.j.g(1L, B() ? 366 : 365);
        }
        if (ordinal == 21) {
            return org.threeten.bp.temporal.j.g(1L, (Month.of(this.b) != Month.FEBRUARY || B()) ? 5L : 4L);
        }
        if (ordinal != 25) {
            return eVar.range();
        }
        return org.threeten.bp.temporal.j.g(1L, this.a <= 0 ? 1000000000L : 999999999L);
    }

    public int t() {
        return this.f10805c;
    }

    @Override // org.threeten.bp.chrono.b
    public String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.f10805c;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append((int) s);
        sb.append(s2 >= 10 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "-0");
        sb.append((int) s2);
        return sb.toString();
    }

    public DayOfWeek u() {
        return DayOfWeek.of(org.apache.http.conn.ssl.d.f(l() + 3, 7) + 1);
    }

    public int v() {
        return (Month.of(this.b).firstDayOfYear(B()) + this.f10805c) - 1;
    }

    public int w() {
        return this.b;
    }

    public int y() {
        return this.a;
    }

    public boolean z(org.threeten.bp.chrono.b bVar) {
        return bVar instanceof e ? o((e) bVar) > 0 : l() > bVar.l();
    }
}
