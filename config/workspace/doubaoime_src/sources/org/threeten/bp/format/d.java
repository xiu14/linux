package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.chrono.h;
import org.threeten.bp.chrono.l;
import org.threeten.bp.k;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
final class d {
    private org.threeten.bp.temporal.b a;
    private Locale b;

    /* renamed from: c, reason: collision with root package name */
    private f f10833c;

    /* renamed from: d, reason: collision with root package name */
    private int f10834d;

    d(org.threeten.bp.temporal.b bVar, a aVar) {
        k kVar;
        org.threeten.bp.zone.e h;
        h b = aVar.b();
        k e2 = aVar.e();
        if (b != null || e2 != null) {
            h hVar = (h) bVar.query(org.threeten.bp.temporal.f.a());
            k kVar2 = (k) bVar.query(org.threeten.bp.temporal.f.g());
            org.threeten.bp.chrono.b bVar2 = null;
            b = org.apache.http.conn.ssl.d.c(hVar, b) ? null : b;
            e2 = org.apache.http.conn.ssl.d.c(kVar2, e2) ? null : e2;
            if (b != null || e2 != null) {
                h hVar2 = b != null ? b : hVar;
                kVar2 = e2 != null ? e2 : kVar2;
                if (e2 != null) {
                    if (bVar.isSupported(ChronoField.INSTANT_SECONDS)) {
                        bVar = (hVar2 == null ? l.f10784c : hVar2).n(org.threeten.bp.d.h(bVar), e2);
                    } else {
                        try {
                            h = e2.h();
                        } catch (org.threeten.bp.zone.f unused) {
                        }
                        if (h.e()) {
                            kVar = h.a(org.threeten.bp.d.f10802c);
                            org.threeten.bp.l lVar = (org.threeten.bp.l) bVar.query(org.threeten.bp.temporal.f.d());
                            if ((kVar instanceof org.threeten.bp.l) && lVar != null && !kVar.equals(lVar)) {
                                throw new org.threeten.bp.b("Invalid override zone for temporal: " + e2 + " " + bVar);
                            }
                        }
                        kVar = e2;
                        org.threeten.bp.l lVar2 = (org.threeten.bp.l) bVar.query(org.threeten.bp.temporal.f.d());
                        if (kVar instanceof org.threeten.bp.l) {
                            throw new org.threeten.bp.b("Invalid override zone for temporal: " + e2 + " " + bVar);
                        }
                    }
                }
                if (b != null) {
                    if (bVar.isSupported(ChronoField.EPOCH_DAY)) {
                        bVar2 = hVar2.b(bVar);
                    } else if (b != l.f10784c || hVar != null) {
                        ChronoField[] values = ChronoField.values();
                        for (int i = 0; i < 30; i++) {
                            ChronoField chronoField = values[i];
                            if (chronoField.isDateBased() && bVar.isSupported(chronoField)) {
                                throw new org.threeten.bp.b("Invalid override chronology for temporal: " + b + " " + bVar);
                            }
                        }
                    }
                }
                bVar = new c(bVar2, bVar, hVar2, kVar2);
            }
        }
        this.a = bVar;
        this.b = aVar.d();
        this.f10833c = aVar.c();
    }

    void a() {
        this.f10834d--;
    }

    Locale b() {
        return this.b;
    }

    f c() {
        return this.f10833c;
    }

    org.threeten.bp.temporal.b d() {
        return this.a;
    }

    Long e(org.threeten.bp.temporal.e eVar) {
        try {
            return Long.valueOf(this.a.getLong(eVar));
        } catch (org.threeten.bp.b e2) {
            if (this.f10834d > 0) {
                return null;
            }
            throw e2;
        }
    }

    <R> R f(org.threeten.bp.temporal.g<R> gVar) {
        R r = (R) this.a.query(gVar);
        if (r != null || this.f10834d != 0) {
            return r;
        }
        StringBuilder M = e.a.a.a.a.M("Unable to extract value: ");
        M.append(this.a.getClass());
        throw new org.threeten.bp.b(M.toString());
    }

    void g() {
        this.f10834d++;
    }

    public String toString() {
        return this.a.toString();
    }
}
