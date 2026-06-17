package org.threeten.bp.chrono;

import com.ss.android.socialbase.downloader.segment.Segment;
import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class s extends h implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final s f10798c = new s();

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String[]> f10799d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String[]> f10800e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String[]> f10801f;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f10799d = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f10800e = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f10801f = hashMap3;
        hashMap.put(Segment.JsonKey.END, new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put(Segment.JsonKey.END, new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put(Segment.JsonKey.END, new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private s() {
    }

    @Override // org.threeten.bp.chrono.h
    public b b(org.threeten.bp.temporal.b bVar) {
        return bVar instanceof t ? (t) bVar : new t(org.threeten.bp.e.r(bVar));
    }

    @Override // org.threeten.bp.chrono.h
    public b c(long j) {
        return new t(org.threeten.bp.e.J(j));
    }

    @Override // org.threeten.bp.chrono.h
    public i g(int i) {
        return ThaiBuddhistEra.of(i);
    }

    @Override // org.threeten.bp.chrono.h
    public String i() {
        return "buddhist";
    }

    @Override // org.threeten.bp.chrono.h
    public String j() {
        return "ThaiBuddhist";
    }

    @Override // org.threeten.bp.chrono.h
    public c<t> k(org.threeten.bp.temporal.b bVar) {
        return super.k(bVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<t> n(org.threeten.bp.d dVar, org.threeten.bp.k kVar) {
        return g.t(this, dVar, kVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<t> o(org.threeten.bp.temporal.b bVar) {
        return super.o(bVar);
    }

    public org.threeten.bp.temporal.j p(ChronoField chronoField) {
        switch (chronoField.ordinal()) {
            case 24:
                org.threeten.bp.temporal.j range = ChronoField.PROLEPTIC_MONTH.range();
                return org.threeten.bp.temporal.j.g(range.d() + 6516, range.c() + 6516);
            case 25:
                org.threeten.bp.temporal.j range2 = ChronoField.YEAR.range();
                return org.threeten.bp.temporal.j.h(1L, (-(range2.d() + 543)) + 1, range2.c() + 543);
            case 26:
                org.threeten.bp.temporal.j range3 = ChronoField.YEAR.range();
                return org.threeten.bp.temporal.j.g(range3.d() + 543, range3.c() + 543);
            default:
                return chronoField.range();
        }
    }
}
