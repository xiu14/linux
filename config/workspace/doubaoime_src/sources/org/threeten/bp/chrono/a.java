package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
abstract class a<D extends b> extends b implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Serializable {
    a() {
    }

    @Override // org.threeten.bp.temporal.a
    public long e(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.h hVar) {
        b b = h().b(aVar);
        return hVar instanceof ChronoUnit ? org.threeten.bp.e.r(this).e(b, hVar) : hVar.between(this, b);
    }

    @Override // org.threeten.bp.chrono.b
    public c<?> f(org.threeten.bp.g gVar) {
        return d.q(this, gVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a<D> d(long j, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoUnit)) {
            return (a) h().d(hVar.addTo(this, j));
        }
        switch (((ChronoUnit) hVar).ordinal()) {
            case 7:
                return p(j);
            case 8:
                return p(org.apache.http.conn.ssl.d.n(j, 7));
            case 9:
                return q(j);
            case 10:
                return r(j);
            case 11:
                return r(org.apache.http.conn.ssl.d.n(j, 10));
            case 12:
                return r(org.apache.http.conn.ssl.d.n(j, 100));
            case 13:
                return r(org.apache.http.conn.ssl.d.n(j, 1000));
            default:
                throw new org.threeten.bp.b(hVar + " not valid for chronology " + h().j());
        }
    }

    abstract a<D> p(long j);

    abstract a<D> q(long j);

    abstract a<D> r(long j);
}
