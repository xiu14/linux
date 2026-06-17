package org.threeten.bp;

import androidx.core.location.LocationRequestCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public final class d extends org.threeten.bp.o.c implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Comparable<d>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final d f10802c = new d(0, 0);
    private final long a;
    private final int b;

    static {
        n(-31557014167219200L, 0L);
        n(31556889864403199L, 999999999L);
    }

    private d(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static d g(long j, int i) {
        if ((i | j) == 0) {
            return f10802c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new d(j, i);
    }

    public static d h(org.threeten.bp.temporal.b bVar) {
        try {
            return n(bVar.getLong(ChronoField.INSTANT_SECONDS), bVar.get(ChronoField.NANO_OF_SECOND));
        } catch (b e2) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName(), e2);
        }
    }

    private long k(d dVar) {
        return org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.n(org.apache.http.conn.ssl.d.p(dVar.a, this.a), 1000000000), dVar.b - this.b);
    }

    public static d l(long j) {
        return g(org.apache.http.conn.ssl.d.d(j, 1000L), org.apache.http.conn.ssl.d.f(j, 1000) * 1000000);
    }

    public static d m(long j) {
        return g(j, 0);
    }

    public static d n(long j, long j2) {
        return g(org.apache.http.conn.ssl.d.m(j, org.apache.http.conn.ssl.d.d(j2, 1000000000L)), org.apache.http.conn.ssl.d.f(j2, 1000000000));
    }

    private d o(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return n(org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.m(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private long r(d dVar) {
        long p = org.apache.http.conn.ssl.d.p(dVar.a, this.a);
        long j = dVar.b - this.b;
        return (p <= 0 || j >= 0) ? (p >= 0 || j <= 0) ? p : p + 1 : p - 1;
    }

    @Override // org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (d) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        int ordinal = chronoField.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                int i = ((int) j) * 1000;
                if (i != this.b) {
                    return g(this.a, i);
                }
            } else if (ordinal == 4) {
                int i2 = ((int) j) * 1000000;
                if (i2 != this.b) {
                    return g(this.a, i2);
                }
            } else {
                if (ordinal != 28) {
                    throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
                }
                if (j != this.a) {
                    return g(j, this.b);
                }
            }
        } else if (j != this.b) {
            return g(this.a, (int) j);
        }
        return this;
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.INSTANT_SECONDS, this.a).a(ChronoField.NANO_OF_SECOND, this.b);
    }

    @Override // org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a b(org.threeten.bp.temporal.c cVar) {
        return (d) cVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a c(long j, org.threeten.bp.temporal.h hVar) {
        return j == Long.MIN_VALUE ? d(LocationRequestCompat.PASSIVE_INTERVAL, hVar).d(1L, hVar) : d(-j, hVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        d dVar2 = dVar;
        int b = org.apache.http.conn.ssl.d.b(this.a, dVar2.a);
        return b != 0 ? b : this.b - dVar2.b;
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        d h = h(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, h);
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return k(h);
            case MICROS:
                return k(h) / 1000;
            case MILLIS:
                return org.apache.http.conn.ssl.d.p(h.s(), s());
            case SECONDS:
                return r(h);
            case MINUTES:
                return r(h) / 60;
            case HOURS:
                return r(h) / 3600;
            case HALF_DAYS:
                return r(h) / 43200;
            case DAYS:
                return r(h) / 86400;
            default:
                throw new org.threeten.bp.temporal.i("Unsupported unit: " + hVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b;
    }

    public int f(d dVar) {
        int b = org.apache.http.conn.ssl.d.b(this.a, dVar.a);
        return b != 0 ? b : this.b - dVar.b;
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return super.range(eVar).a(eVar.getFrom(this), eVar);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        if (ordinal == 0) {
            return this.b;
        }
        if (ordinal == 2) {
            return this.b / 1000;
        }
        if (ordinal == 4) {
            return this.b / 1000000;
        }
        throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        int i;
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int ordinal = ((ChronoField) eVar).ordinal();
        if (ordinal == 0) {
            i = this.b;
        } else if (ordinal == 2) {
            i = this.b / 1000;
        } else {
            if (ordinal != 4) {
                if (ordinal == 28) {
                    return this.a;
                }
                throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public long i() {
        return this.a;
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar == ChronoField.INSTANT_SECONDS || eVar == ChronoField.NANO_OF_SECOND || eVar == ChronoField.MICRO_OF_SECOND || eVar == ChronoField.MILLI_OF_SECOND : eVar != null && eVar.isSupportedBy(this);
    }

    public int j() {
        return this.b;
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public d d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (d) hVar.addTo(this, j);
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return o(0L, j);
            case MICROS:
                return o(j / 1000000, (j % 1000000) * 1000);
            case MILLIS:
                return o(j / 1000, (j % 1000) * 1000000);
            case SECONDS:
                return o(j, 0L);
            case MINUTES:
                return q(org.apache.http.conn.ssl.d.n(j, 60));
            case HOURS:
                return q(org.apache.http.conn.ssl.d.n(j, 3600));
            case HALF_DAYS:
                return q(org.apache.http.conn.ssl.d.n(j, 43200));
            case DAYS:
                return q(org.apache.http.conn.ssl.d.n(j, RemoteMessageConst.DEFAULT_TTL));
            default:
                throw new org.threeten.bp.temporal.i("Unsupported unit: " + hVar);
        }
    }

    public d q(long j) {
        return o(j, 0L);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (gVar == org.threeten.bp.temporal.f.b() || gVar == org.threeten.bp.temporal.f.c() || gVar == org.threeten.bp.temporal.f.a() || gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.f() || gVar == org.threeten.bp.temporal.f.d()) {
            return null;
        }
        return gVar.a(this);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        return super.range(eVar);
    }

    public long s() {
        long j = this.a;
        return j >= 0 ? org.apache.http.conn.ssl.d.m(org.apache.http.conn.ssl.d.o(j, 1000L), this.b / 1000000) : org.apache.http.conn.ssl.d.p(org.apache.http.conn.ssl.d.o(j + 1, 1000L), 1000 - (this.b / 1000000));
    }

    public String toString() {
        return org.threeten.bp.format.a.l.a(this);
    }
}
