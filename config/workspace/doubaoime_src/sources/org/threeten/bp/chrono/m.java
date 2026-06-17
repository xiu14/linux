package org.threeten.bp.chrono;

import androidx.exifinterface.media.ExifInterface;
import com.ss.android.socialbase.downloader.segment.Segment;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class m extends h implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    static final Locale f10785c = new Locale("ja", "JP", "JP");

    /* renamed from: d, reason: collision with root package name */
    public static final m f10786d = new m();

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, String[]> f10787e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, String[]> f10788f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, String[]> f10789g;

    static {
        HashMap hashMap = new HashMap();
        f10787e = hashMap;
        HashMap hashMap2 = new HashMap();
        f10788f = hashMap2;
        HashMap hashMap3 = new HashMap();
        f10789g = hashMap3;
        hashMap.put(Segment.JsonKey.END, new String[]{"Unknown", "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap2.put(Segment.JsonKey.END, new String[]{"Unknown", "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put(Segment.JsonKey.END, new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private m() {
    }

    @Override // org.threeten.bp.chrono.h
    public b b(org.threeten.bp.temporal.b bVar) {
        return bVar instanceof n ? (n) bVar : new n(org.threeten.bp.e.r(bVar));
    }

    @Override // org.threeten.bp.chrono.h
    public b c(long j) {
        return new n(org.threeten.bp.e.J(j));
    }

    @Override // org.threeten.bp.chrono.h
    public i g(int i) {
        return o.i(i);
    }

    @Override // org.threeten.bp.chrono.h
    public String i() {
        return "japanese";
    }

    @Override // org.threeten.bp.chrono.h
    public String j() {
        return "Japanese";
    }

    @Override // org.threeten.bp.chrono.h
    public c<n> k(org.threeten.bp.temporal.b bVar) {
        return super.k(bVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<n> n(org.threeten.bp.d dVar, org.threeten.bp.k kVar) {
        return g.t(this, dVar, kVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f<n> o(org.threeten.bp.temporal.b bVar) {
        return super.o(bVar);
    }

    public org.threeten.bp.temporal.j p(ChronoField chronoField) {
        int ordinal = chronoField.ordinal();
        if (ordinal != 15 && ordinal != 18 && ordinal != 20 && ordinal != 24) {
            switch (ordinal) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    Calendar calendar = Calendar.getInstance(f10785c);
                    int ordinal2 = chronoField.ordinal();
                    int i = 0;
                    if (ordinal2 == 19) {
                        o[] k = o.k();
                        int i2 = 366;
                        while (i < k.length) {
                            i2 = Math.min(i2, ((k[i].j().B() ? 366 : 365) - k[i].j().v()) + 1);
                            i++;
                        }
                        return org.threeten.bp.temporal.j.h(1L, i2, 366L);
                    }
                    if (ordinal2 == 23) {
                        return org.threeten.bp.temporal.j.i(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    }
                    switch (ordinal2) {
                        case 25:
                            o[] k2 = o.k();
                            int y = (k2[k2.length - 1].f().y() - k2[k2.length - 1].j().y()) + 1;
                            int i3 = Integer.MAX_VALUE;
                            while (i < k2.length) {
                                i3 = Math.min(i3, (k2[i].f().y() - k2[i].j().y()) + 1);
                                i++;
                            }
                            return org.threeten.bp.temporal.j.i(1L, 6L, i3, y);
                        case 26:
                            o[] k3 = o.k();
                            return org.threeten.bp.temporal.j.g(n.f10790d.y(), k3[k3.length - 1].f().y());
                        case 27:
                            o[] k4 = o.k();
                            return org.threeten.bp.temporal.j.g(k4[0].h(), k4[k4.length - 1].h());
                        default:
                            throw new UnsupportedOperationException("Unimplementable field: " + chronoField);
                    }
            }
        }
        return chronoField.range();
    }
}
