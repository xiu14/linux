package org.threeten.bp;

import androidx.core.location.LocationRequestCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public final class g extends org.threeten.bp.o.c implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Comparable<g>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final g f10841e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f10842f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f10843g;
    private static final g[] h = new g[24];
    private final byte a;
    private final byte b;

    /* renamed from: c, reason: collision with root package name */
    private final byte f10844c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10845d;

    static {
        int i = 0;
        while (true) {
            g[] gVarArr = h;
            if (i >= gVarArr.length) {
                f10843g = gVarArr[0];
                g gVar = gVarArr[12];
                f10841e = gVarArr[0];
                f10842f = new g(23, 59, 59, 999999999);
                return;
            }
            gVarArr[i] = new g(i, 0, 0, 0);
            i++;
        }
    }

    private g(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.f10844c = (byte) i3;
        this.f10845d = i4;
    }

    private static g g(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new g(i, i2, i3, i4);
    }

    public static g h(org.threeten.bp.temporal.b bVar) {
        g gVar = (g) bVar.query(org.threeten.bp.temporal.f.c());
        if (gVar != null) {
            return gVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName());
    }

    private int i(org.threeten.bp.temporal.e eVar) {
        switch (((ChronoField) eVar).ordinal()) {
            case 0:
                return this.f10845d;
            case 1:
                throw new b(e.a.a.a.a.z("Field too large for an int: ", eVar));
            case 2:
                return this.f10845d / 1000;
            case 3:
                throw new b(e.a.a.a.a.z("Field too large for an int: ", eVar));
            case 4:
                return this.f10845d / 1000000;
            case 5:
                return (int) (u() / 1000000);
            case 6:
                return this.f10844c;
            case 7:
                return v();
            case 8:
                return this.b;
            case 9:
                return (this.a * 60) + this.b;
            case 10:
                return this.a % 12;
            case 11:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 12:
                return this.a;
            case 13:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 14:
                return this.a / 12;
            default:
                throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
    }

    public static g l(int i, int i2) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        if (i2 == 0) {
            return h[i];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        return new g(i, i2, 0, 0);
    }

    public static g m(long j) {
        ChronoField.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return g(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static g n(long j) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return g(i, (int) (j2 / 60), (int) (j2 - (r1 * 60)), 0);
    }

    static g o(long j, int i) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j);
        ChronoField.NANO_OF_SECOND.checkValidValue(i);
        int i2 = (int) (j / 3600);
        long j2 = j - (i2 * 3600);
        return g(i2, (int) (j2 / 60), (int) (j2 - (r1 * 60)), i);
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.NANO_OF_DAY, u());
    }

    @Override // org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a b(org.threeten.bp.temporal.c cVar) {
        return cVar instanceof g ? (g) cVar : (g) cVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a c(long j, org.threeten.bp.temporal.h hVar) {
        return j == Long.MIN_VALUE ? d(LocationRequestCompat.PASSIVE_INTERVAL, hVar).d(1L, hVar) : d(-j, hVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        g h2 = h(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, h2);
        }
        long u = h2.u() - u();
        switch (((ChronoUnit) hVar).ordinal()) {
            case 0:
                return u;
            case 1:
                return u / 1000;
            case 2:
                return u / 1000000;
            case 3:
                return u / 1000000000;
            case 4:
                return u / 60000000000L;
            case 5:
                return u / 3600000000000L;
            case 6:
                return u / 43200000000000L;
            default:
                throw new org.threeten.bp.temporal.i("Unsupported unit: " + hVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.f10844c == gVar.f10844c && this.f10845d == gVar.f10845d;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        int a = org.apache.http.conn.ssl.d.a(this.a, gVar.a);
        if (a != 0) {
            return a;
        }
        int a2 = org.apache.http.conn.ssl.d.a(this.b, gVar.b);
        if (a2 != 0) {
            return a2;
        }
        int a3 = org.apache.http.conn.ssl.d.a(this.f10844c, gVar.f10844c);
        return a3 == 0 ? org.apache.http.conn.ssl.d.a(this.f10845d, gVar.f10845d) : a3;
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? i(eVar) : super.get(eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar == ChronoField.NANO_OF_DAY ? u() : eVar == ChronoField.MICRO_OF_DAY ? u() / 1000 : i(eVar) : eVar.getFrom(this);
    }

    public int hashCode() {
        long u = u();
        return (int) (u ^ (u >>> 32));
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() : eVar != null && eVar.isSupportedBy(this);
    }

    public int j() {
        return this.f10845d;
    }

    public int k() {
        return this.f10844c;
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (g) hVar.addTo(this, j);
        }
        switch (((ChronoUnit) hVar).ordinal()) {
            case 0:
                return s(j);
            case 1:
                return s((j % 86400000000L) * 1000);
            case 2:
                return s((j % com.heytap.mcssdk.constant.a.f6888f) * 1000000);
            case 3:
                return t(j);
            case 4:
                return r(j);
            case 5:
                return q(j);
            case 6:
                return q((j % 2) * 12);
            default:
                throw new org.threeten.bp.temporal.i("Unsupported unit: " + hVar);
        }
    }

    public g q(long j) {
        return j == 0 ? this : g(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.f10844c, this.f10845d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (gVar == org.threeten.bp.temporal.f.c()) {
            return this;
        }
        if (gVar == org.threeten.bp.temporal.f.a() || gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.f() || gVar == org.threeten.bp.temporal.f.d() || gVar == org.threeten.bp.temporal.f.b()) {
            return null;
        }
        return gVar.a(this);
    }

    public g r(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : g(i2 / 60, i2 % 60, this.f10844c, this.f10845d);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        return super.range(eVar);
    }

    public g s(long j) {
        if (j == 0) {
            return this;
        }
        long u = u();
        long j2 = (((j % 86400000000000L) + u) + 86400000000000L) % 86400000000000L;
        return u == j2 ? this : g((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public g t(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.f10844c;
        int i2 = ((((int) (j % 86400)) + i) + RemoteMessageConst.DEFAULT_TTL) % RemoteMessageConst.DEFAULT_TTL;
        return i == i2 ? this : g(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f10845d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.f10844c;
        int i = this.f10845d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : Constants.COLON_SEPARATOR);
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 >= 10 ? Constants.COLON_SEPARATOR : ":0");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public long u() {
        return (this.f10844c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.f10845d;
    }

    public int v() {
        return (this.b * 60) + (this.a * 3600) + this.f10844c;
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public g a(org.threeten.bp.temporal.e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (g) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        switch (chronoField.ordinal()) {
            case 0:
                return y((int) j);
            case 1:
                return m(j);
            case 2:
                return y(((int) j) * 1000);
            case 3:
                return m(j * 1000);
            case 4:
                return y(((int) j) * 1000000);
            case 5:
                return m(j * 1000000);
            case 6:
                int i = (int) j;
                if (this.f10844c == i) {
                    return this;
                }
                ChronoField.SECOND_OF_MINUTE.checkValidValue(i);
                return g(this.a, this.b, i, this.f10845d);
            case 7:
                return t(j - v());
            case 8:
                int i2 = (int) j;
                if (this.b == i2) {
                    return this;
                }
                ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
                return g(this.a, i2, this.f10844c, this.f10845d);
            case 9:
                return r(j - ((this.a * 60) + this.b));
            case 10:
                return q(j - (this.a % 12));
            case 11:
                if (j == 12) {
                    j = 0;
                }
                return q(j - (this.a % 12));
            case 12:
                return x((int) j);
            case 13:
                if (j == 24) {
                    j = 0;
                }
                return x((int) j);
            case 14:
                return q((j - (this.a / 12)) * 12);
            default:
                throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
    }

    public g x(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        return g(i, this.b, this.f10844c, this.f10845d);
    }

    public g y(int i) {
        if (this.f10845d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.checkValidValue(i);
        return g(this.a, this.b, this.f10844c, i);
    }
}
