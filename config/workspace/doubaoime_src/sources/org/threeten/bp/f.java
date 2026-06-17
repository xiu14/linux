package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public final class f extends org.threeten.bp.chrono.c<e> implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final f f10806c = y(e.f10803d, g.f10841e);

    /* renamed from: d, reason: collision with root package name */
    public static final f f10807d = y(e.f10804e, g.f10842f);
    private final e a;
    private final g b;

    private f(e eVar, g gVar) {
        this.a = eVar;
        this.b = gVar;
    }

    private f E(e eVar, long j, long j2, long j3, long j4, int i) {
        if ((j | j2 | j3 | j4) == 0) {
            return G(eVar, this.b);
        }
        long j5 = i;
        long u = this.b.u();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + u;
        long d2 = org.apache.http.conn.ssl.d.d(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long g2 = org.apache.http.conn.ssl.d.g(j6, 86400000000000L);
        return G(eVar.L(d2), g2 == u ? this.b : g.m(g2));
    }

    private f G(e eVar, g gVar) {
        return (this.a == eVar && this.b == gVar) ? this : new f(eVar, gVar);
    }

    private int q(f fVar) {
        int o = this.a.o(fVar.a);
        return o == 0 ? this.b.compareTo(fVar.b) : o;
    }

    public static f r(org.threeten.bp.temporal.b bVar) {
        if (bVar instanceof f) {
            return (f) bVar;
        }
        if (bVar instanceof n) {
            return ((n) bVar).A();
        }
        try {
            return new f(e.r(bVar), g.h(bVar));
        } catch (b unused) {
            throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName());
        }
    }

    public static f y(e eVar, g gVar) {
        org.apache.http.conn.ssl.d.k(eVar, "date");
        org.apache.http.conn.ssl.d.k(gVar, CrashHianalyticsData.TIME);
        return new f(eVar, gVar);
    }

    public static f z(long j, int i, l lVar) {
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return new f(e.J(org.apache.http.conn.ssl.d.d(j + lVar.k(), 86400L)), g.o(org.apache.http.conn.ssl.d.f(r2, RemoteMessageConst.DEFAULT_TTL), i));
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public f d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (f) hVar.addTo(this, j);
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return C(j);
            case MICROS:
                return B(j / 86400000000L).C((j % 86400000000L) * 1000);
            case MILLIS:
                return B(j / com.heytap.mcssdk.constant.a.f6888f).C((j % com.heytap.mcssdk.constant.a.f6888f) * 1000000);
            case SECONDS:
                return D(j);
            case MINUTES:
                return E(this.a, 0L, j, 0L, 0L, 1);
            case HOURS:
                return E(this.a, j, 0L, 0L, 0L, 1);
            case HALF_DAYS:
                f B = B(j / 256);
                return B.E(B.a, (j % 256) * 12, 0L, 0L, 0L, 1);
            default:
                return G(this.a.d(j, hVar), this.b);
        }
    }

    public f B(long j) {
        return G(this.a.L(j), this.b);
    }

    public f C(long j) {
        return E(this.a, 0L, 0L, 0L, j, 1);
    }

    public f D(long j) {
        return E(this.a, 0L, 0L, j, 0L, 1);
    }

    public e F() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public f b(org.threeten.bp.temporal.c cVar) {
        return cVar instanceof e ? G((e) cVar, this.b) : cVar instanceof g ? G(this.a, (g) cVar) : cVar instanceof f ? (f) cVar : (f) cVar.adjustInto(this);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public f a(org.threeten.bp.temporal.e eVar, long j) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? G(this.a, this.b.a(eVar, j)) : G(this.a.a(eVar, j), this.b) : (f) eVar.adjustInto(this, j);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return super.adjustInto(aVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        f r = r(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, r);
        }
        ChronoUnit chronoUnit = (ChronoUnit) hVar;
        if (!chronoUnit.isTimeBased()) {
            e eVar = r.a;
            if (eVar.z(this.a)) {
                if (r.b.compareTo(this.b) < 0) {
                    eVar = eVar.E(1L);
                    return this.a.e(eVar, hVar);
                }
            }
            if (eVar.A(this.a)) {
                if (r.b.compareTo(this.b) > 0) {
                    eVar = eVar.L(1L);
                }
            }
            return this.a.e(eVar, hVar);
        }
        long q = this.a.q(r.a);
        long u = r.b.u() - this.b.u();
        if (q > 0 && u < 0) {
            q--;
            u += 86400000000000L;
        } else if (q < 0 && u > 0) {
            q++;
            u -= 86400000000000L;
        }
        switch (chronoUnit) {
            case NANOS:
                return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.o(q, 86400000000000L), u);
            case MICROS:
                return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.o(q, 86400000000L), u / 1000);
            case MILLIS:
                return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.o(q, com.heytap.mcssdk.constant.a.f6888f), u / 1000000);
            case SECONDS:
                return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.n(q, RemoteMessageConst.DEFAULT_TTL), u / 1000000000);
            case MINUTES:
                return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.n(q, 1440), u / 60000000000L);
            case HOURS:
                return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.n(q, 24), u / 3600000000000L);
            case HALF_DAYS:
                return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.n(q, 2), u / 43200000000000L);
            default:
                throw new org.threeten.bp.temporal.i("Unsupported unit: " + hVar);
        }
    }

    @Override // org.threeten.bp.chrono.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b);
    }

    @Override // org.threeten.bp.chrono.c
    public org.threeten.bp.chrono.f<e> f(k kVar) {
        return n.w(this, kVar, null);
    }

    @Override // org.threeten.bp.chrono.c, java.lang.Comparable
    /* renamed from: g */
    public int compareTo(org.threeten.bp.chrono.c<?> cVar) {
        return cVar instanceof f ? q((f) cVar) : super.compareTo(cVar);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? this.b.get(eVar) : this.a.get(eVar) : super.get(eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? this.b.getLong(eVar) : this.a.getLong(eVar) : eVar.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.c
    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isDateBased() || eVar.isTimeBased() : eVar != null && eVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.c
    public e m() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.c
    public g n() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        return gVar == org.threeten.bp.temporal.f.b() ? (R) this.a : (R) super.query(gVar);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? this.b.range(eVar) : this.a.range(eVar) : eVar.rangeRefinedBy(this);
    }

    public int s() {
        return this.b.j();
    }

    public int t() {
        return this.b.k();
    }

    @Override // org.threeten.bp.chrono.c
    public String toString() {
        return this.a.toString() + 'T' + this.b.toString();
    }

    public int u() {
        return this.a.y();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [org.threeten.bp.chrono.b] */
    public boolean v(org.threeten.bp.chrono.c<?> cVar) {
        if (cVar instanceof f) {
            return q((f) cVar) > 0;
        }
        long l = m().l();
        long l2 = cVar.m().l();
        return l > l2 || (l == l2 && n().u() > cVar.n().u());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [org.threeten.bp.chrono.b] */
    public boolean w(org.threeten.bp.chrono.c<?> cVar) {
        if (cVar instanceof f) {
            return q((f) cVar) < 0;
        }
        long l = m().l();
        long l2 = cVar.m().l();
        return l < l2 || (l == l2 && n().u() < cVar.n().u());
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public f c(long j, org.threeten.bp.temporal.h hVar) {
        return j == Long.MIN_VALUE ? d(LocationRequestCompat.PASSIVE_INTERVAL, hVar).d(1L, hVar) : d(-j, hVar);
    }
}
