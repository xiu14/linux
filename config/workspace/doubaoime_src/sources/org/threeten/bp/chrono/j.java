package org.threeten.bp.chrono;

import com.ss.android.socialbase.downloader.segment.Segment;
import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class j extends h implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final j f10775c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String[]> f10776d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String[]> f10777e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String[]> f10778f;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f10776d = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f10777e = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f10778f = hashMap3;
        hashMap.put(Segment.JsonKey.END, new String[]{"BH", "HE"});
        hashMap2.put(Segment.JsonKey.END, new String[]{"B.H.", "H.E."});
        hashMap3.put(Segment.JsonKey.END, new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private j() {
    }

    @Override // org.threeten.bp.chrono.h
    public b b(org.threeten.bp.temporal.b bVar) {
        return bVar instanceof k ? (k) bVar : k.E(bVar.getLong(ChronoField.EPOCH_DAY));
    }

    @Override // org.threeten.bp.chrono.h
    public b c(long j) {
        return k.C(org.threeten.bp.e.J(j));
    }

    @Override // org.threeten.bp.chrono.h
    public i g(int i) {
        if (i == 0) {
            return HijrahEra.BEFORE_AH;
        }
        if (i == 1) {
            return HijrahEra.AH;
        }
        throw new org.threeten.bp.b("invalid Hijrah era");
    }

    @Override // org.threeten.bp.chrono.h
    public String i() {
        return "islamic-umalqura";
    }

    @Override // org.threeten.bp.chrono.h
    public String j() {
        return "Hijrah-umalqura";
    }

    @Override // org.threeten.bp.chrono.h
    public c<k> k(org.threeten.bp.temporal.b bVar) {
        return super.k(bVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<k> n(org.threeten.bp.d dVar, org.threeten.bp.k kVar) {
        return g.t(this, dVar, kVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<k> o(org.threeten.bp.temporal.b bVar) {
        return super.o(bVar);
    }
}
