package org.threeten.bp.chrono;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
final class d<D extends b> extends c<D> implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Serializable {
    private final D a;
    private final org.threeten.bp.g b;

    private d(D d2, org.threeten.bp.g gVar) {
        org.apache.http.conn.ssl.d.k(d2, "date");
        org.apache.http.conn.ssl.d.k(gVar, CrashHianalyticsData.TIME);
        this.a = d2;
        this.b = gVar;
    }

    static <R extends b> d<R> q(R r, org.threeten.bp.g gVar) {
        return new d<>(r, gVar);
    }

    private d<D> s(long j) {
        return w(this.a.d(j, ChronoUnit.DAYS), this.b);
    }

    private d<D> t(long j) {
        return v(this.a, 0L, 0L, 0L, j);
    }

    private d<D> v(D d2, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return w(d2, this.b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long u = this.b.u();
        long j7 = j6 + u;
        long d3 = org.apache.http.conn.ssl.d.d(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long g2 = org.apache.http.conn.ssl.d.g(j7, 86400000000000L);
        return w(d2.d(d3, ChronoUnit.DAYS), g2 == u ? this.b : org.threeten.bp.g.m(g2));
    }

    private d<D> w(org.threeten.bp.temporal.a aVar, org.threeten.bp.g gVar) {
        D d2 = this.a;
        return (d2 == aVar && this.b == gVar) ? this : new d<>(d2.h().d(aVar), gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [org.threeten.bp.chrono.b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.threeten.bp.temporal.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [org.threeten.bp.chrono.b] */
    /* JADX WARN: Type inference failed for: r7v7, types: [D extends org.threeten.bp.chrono.b, org.threeten.bp.temporal.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.threeten.bp.temporal.h] */
    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        c<?> k = this.a.h().k(aVar);
        if (!(hVar instanceof ChronoUnit)) {
            return hVar.between(this, k);
        }
        ChronoUnit chronoUnit = (ChronoUnit) hVar;
        if (!chronoUnit.isTimeBased()) {
            ?? m = k.m();
            if (k.n().compareTo(this.b) < 0) {
                m = m.c(1L, ChronoUnit.DAYS);
            }
            return this.a.e(m, hVar);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long j = k.getLong(chronoField) - this.a.getLong(chronoField);
        switch (chronoUnit) {
            case NANOS:
                j = org.apache.http.conn.ssl.d.o(j, 86400000000000L);
                break;
            case MICROS:
                j = org.apache.http.conn.ssl.d.o(j, 86400000000L);
                break;
            case MILLIS:
                j = org.apache.http.conn.ssl.d.o(j, com.heytap.mcssdk.constant.a.f6888f);
                break;
            case SECONDS:
                j = org.apache.http.conn.ssl.d.n(j, RemoteMessageConst.DEFAULT_TTL);
                break;
            case MINUTES:
                j = org.apache.http.conn.ssl.d.n(j, 1440);
                break;
            case HOURS:
                j = org.apache.http.conn.ssl.d.n(j, 24);
                break;
            case HALF_DAYS:
                j = org.apache.http.conn.ssl.d.n(j, 2);
                break;
        }
        return org.apache.http.conn.ssl.d.m(j, this.b.e(k.n(), hVar));
    }

    @Override // org.threeten.bp.chrono.c
    public f<D> f(org.threeten.bp.k kVar) {
        return g.s(this, kVar, null);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? this.b.get(eVar) : this.a.get(eVar) : range(eVar).a(getLong(eVar), eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? this.b.getLong(eVar) : this.a.getLong(eVar) : eVar.getFrom(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isDateBased() || eVar.isTimeBased() : eVar != null && eVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.c
    public D m() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.c
    public org.threeten.bp.g n() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public d<D> d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return this.a.h().e(hVar.addTo(this, j));
        }
        switch ((ChronoUnit) hVar) {
            case NANOS:
                return t(j);
            case MICROS:
                return s(j / 86400000000L).t((j % 86400000000L) * 1000);
            case MILLIS:
                return s(j / com.heytap.mcssdk.constant.a.f6888f).t((j % com.heytap.mcssdk.constant.a.f6888f) * 1000000);
            case SECONDS:
                return v(this.a, 0L, 0L, j, 0L);
            case MINUTES:
                return v(this.a, 0L, j, 0L, 0L);
            case HOURS:
                return v(this.a, j, 0L, 0L, 0L);
            case HALF_DAYS:
                d<D> s = s(j / 256);
                return s.v(s.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return w(this.a.d(j, hVar), this.b);
        }
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? this.b.range(eVar) : this.a.range(eVar) : eVar.rangeRefinedBy(this);
    }

    d<D> u(long j) {
        return v(this.a, 0L, 0L, j, 0L);
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d<D> b(org.threeten.bp.temporal.c cVar) {
        return cVar instanceof b ? w((b) cVar, this.b) : cVar instanceof org.threeten.bp.g ? w(this.a, (org.threeten.bp.g) cVar) : cVar instanceof d ? this.a.h().e((d) cVar) : this.a.h().e((d) cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public d<D> a(org.threeten.bp.temporal.e eVar, long j) {
        return eVar instanceof ChronoField ? eVar.isTimeBased() ? w(this.a, this.b.a(eVar, j)) : w(this.a.a(eVar, j), this.b) : this.a.h().e(eVar.adjustInto(this, j));
    }
}
