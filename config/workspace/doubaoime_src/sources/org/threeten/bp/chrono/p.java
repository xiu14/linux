package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class p extends h implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final p f10797c = new p();

    private p() {
    }

    @Override // org.threeten.bp.chrono.h
    public b b(org.threeten.bp.temporal.b bVar) {
        return bVar instanceof q ? (q) bVar : new q(org.threeten.bp.e.r(bVar));
    }

    @Override // org.threeten.bp.chrono.h
    public b c(long j) {
        return new q(org.threeten.bp.e.J(j));
    }

    @Override // org.threeten.bp.chrono.h
    public i g(int i) {
        return MinguoEra.of(i);
    }

    @Override // org.threeten.bp.chrono.h
    public String i() {
        return "roc";
    }

    @Override // org.threeten.bp.chrono.h
    public String j() {
        return "Minguo";
    }

    @Override // org.threeten.bp.chrono.h
    public c<q> k(org.threeten.bp.temporal.b bVar) {
        return super.k(bVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<q> n(org.threeten.bp.d dVar, org.threeten.bp.k kVar) {
        return g.t(this, dVar, kVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<q> o(org.threeten.bp.temporal.b bVar) {
        return super.o(bVar);
    }

    public org.threeten.bp.temporal.j p(ChronoField chronoField) {
        switch (chronoField.ordinal()) {
            case 24:
                org.threeten.bp.temporal.j range = ChronoField.PROLEPTIC_MONTH.range();
                return org.threeten.bp.temporal.j.g(range.d() - 22932, range.c() - 22932);
            case 25:
                org.threeten.bp.temporal.j range2 = ChronoField.YEAR.range();
                return org.threeten.bp.temporal.j.h(1L, range2.c() - 1911, (-range2.d()) + 1 + 1911);
            case 26:
                org.threeten.bp.temporal.j range3 = ChronoField.YEAR.range();
                return org.threeten.bp.temporal.j.g(range3.d() - 1911, range3.c() - 1911);
            default:
                return chronoField.range();
        }
    }
}
