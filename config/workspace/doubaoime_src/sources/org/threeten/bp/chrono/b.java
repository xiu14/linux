package org.threeten.bp.chrono;

import com.xiaomi.mipush.sdk.Constants;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public abstract class b extends org.threeten.bp.o.b implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Comparable<b> {
    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.EPOCH_DAY, l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    public c<?> f(org.threeten.bp.g gVar) {
        return d.q(this, gVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        int b = org.apache.http.conn.ssl.d.b(l(), bVar.l());
        return b == 0 ? h().compareTo(bVar.h()) : b;
    }

    public abstract h h();

    public int hashCode() {
        long l = l();
        return ((int) (l ^ (l >>> 32))) ^ h().hashCode();
    }

    public i i() {
        return h().g(get(ChronoField.ERA));
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isDateBased() : eVar != null && eVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.o.b, org.threeten.bp.temporal.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b c(long j, org.threeten.bp.temporal.h hVar) {
        return h().d(super.c(j, hVar));
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract b d(long j, org.threeten.bp.temporal.h hVar);

    public long l() {
        return getLong(ChronoField.EPOCH_DAY);
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b b(org.threeten.bp.temporal.c cVar) {
        return h().d(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.temporal.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract b a(org.threeten.bp.temporal.e eVar, long j);

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.a()) {
            return (R) h();
        }
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.DAYS;
        }
        if (gVar == org.threeten.bp.temporal.f.b()) {
            return (R) org.threeten.bp.e.J(l());
        }
        if (gVar == org.threeten.bp.temporal.f.c() || gVar == org.threeten.bp.temporal.f.f() || gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.d()) {
            return null;
        }
        return (R) super.query(gVar);
    }

    public String toString() {
        long j = getLong(ChronoField.YEAR_OF_ERA);
        long j2 = getLong(ChronoField.MONTH_OF_YEAR);
        long j3 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(h().j());
        sb.append(" ");
        sb.append(i());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(j2);
        sb.append(j3 >= 10 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "-0");
        sb.append(j3);
        return sb.toString();
    }
}
