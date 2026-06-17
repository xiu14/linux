package org.threeten.bp.temporal;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.DayOfWeek;

/* loaded from: classes2.dex */
public final class k implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap<String, k> f10866g = new ConcurrentHashMap(4, 0.75f, 2);
    private final DayOfWeek a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final transient e f10867c = a.c(this);

    /* renamed from: d, reason: collision with root package name */
    private final transient e f10868d = a.e(this);

    /* renamed from: e, reason: collision with root package name */
    private final transient e f10869e;

    /* renamed from: f, reason: collision with root package name */
    private final transient e f10870f;

    static class a implements e {

        /* renamed from: f, reason: collision with root package name */
        private static final j f10871f = j.g(1, 7);

        /* renamed from: g, reason: collision with root package name */
        private static final j f10872g = j.i(0, 1, 4, 6);
        private static final j h = j.i(0, 1, 52, 54);
        private static final j i = j.h(1, 52, 53);
        private static final j j = ChronoField.YEAR.range();
        private final String a;
        private final k b;

        /* renamed from: c, reason: collision with root package name */
        private final h f10873c;

        /* renamed from: d, reason: collision with root package name */
        private final h f10874d;

        /* renamed from: e, reason: collision with root package name */
        private final j f10875e;

        private a(String str, k kVar, h hVar, h hVar2, j jVar) {
            this.a = str;
            this.b = kVar;
            this.f10873c = hVar;
            this.f10874d = hVar2;
            this.f10875e = jVar;
        }

        private int a(int i2, int i3) {
            return ((i3 - 1) + (i2 + 7)) / 7;
        }

        private long b(b bVar, int i2) {
            int i3 = bVar.get(ChronoField.DAY_OF_YEAR);
            return a(i(i3, i2), i3);
        }

        static a c(k kVar) {
            return new a("DayOfWeek", kVar, ChronoUnit.DAYS, ChronoUnit.WEEKS, f10871f);
        }

        static a d(k kVar) {
            return new a("WeekBasedYear", kVar, IsoFields.f10857d, ChronoUnit.FOREVER, j);
        }

        static a e(k kVar) {
            return new a("WeekOfMonth", kVar, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f10872g);
        }

        static a f(k kVar) {
            return new a("WeekOfWeekBasedYear", kVar, ChronoUnit.WEEKS, IsoFields.f10857d, i);
        }

        static a g(k kVar) {
            return new a("WeekOfYear", kVar, ChronoUnit.WEEKS, ChronoUnit.YEARS, h);
        }

        private j h(b bVar) {
            int e2 = org.apache.http.conn.ssl.d.e(bVar.get(ChronoField.DAY_OF_WEEK) - this.b.c().getValue(), 7) + 1;
            long b = b(bVar, e2);
            if (b == 0) {
                return h(org.threeten.bp.chrono.h.h(bVar).b(bVar).c(2L, ChronoUnit.WEEKS));
            }
            return b >= ((long) a(i(bVar.get(ChronoField.DAY_OF_YEAR), e2), this.b.d() + (org.threeten.bp.j.f((long) bVar.get(ChronoField.YEAR)) ? 366 : 365))) ? h(org.threeten.bp.chrono.h.h(bVar).b(bVar).d(2L, ChronoUnit.WEEKS)) : j.g(1L, r0 - 1);
        }

        private int i(int i2, int i3) {
            int e2 = org.apache.http.conn.ssl.d.e(i2 - i3, 7);
            return e2 + 1 > this.b.d() ? 7 - e2 : -e2;
        }

        @Override // org.threeten.bp.temporal.e
        public <R extends org.threeten.bp.temporal.a> R adjustInto(R r, long j2) {
            int a = this.f10875e.a(j2, this);
            if (a == r.get(this)) {
                return r;
            }
            if (this.f10874d != ChronoUnit.FOREVER) {
                return (R) r.d(a - r1, this.f10873c);
            }
            int i2 = r.get(this.b.f10869e);
            long j3 = (long) ((j2 - r1) * 52.1775d);
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            org.threeten.bp.temporal.a d2 = r.d(j3, chronoUnit);
            if (d2.get(this) > a) {
                return (R) d2.c(d2.get(this.b.f10869e), chronoUnit);
            }
            if (d2.get(this) < a) {
                d2 = d2.d(2L, chronoUnit);
            }
            R r2 = (R) d2.d(i2 - d2.get(this.b.f10869e), chronoUnit);
            return r2.get(this) > a ? (R) r2.c(1L, chronoUnit) : r2;
        }

        @Override // org.threeten.bp.temporal.e
        public long getFrom(b bVar) {
            int i2;
            int a;
            int value = this.b.c().getValue();
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            int e2 = org.apache.http.conn.ssl.d.e(bVar.get(chronoField) - value, 7) + 1;
            h hVar = this.f10874d;
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            if (hVar == chronoUnit) {
                return e2;
            }
            if (hVar == ChronoUnit.MONTHS) {
                int i3 = bVar.get(ChronoField.DAY_OF_MONTH);
                a = a(i(i3, e2), i3);
            } else {
                if (hVar != ChronoUnit.YEARS) {
                    if (hVar == IsoFields.f10857d) {
                        int e3 = org.apache.http.conn.ssl.d.e(bVar.get(chronoField) - this.b.c().getValue(), 7) + 1;
                        long b = b(bVar, e3);
                        if (b == 0) {
                            i2 = ((int) b(org.threeten.bp.chrono.h.h(bVar).b(bVar).c(1L, chronoUnit), e3)) + 1;
                        } else {
                            if (b >= 53) {
                                if (b >= a(i(bVar.get(ChronoField.DAY_OF_YEAR), e3), this.b.d() + (org.threeten.bp.j.f((long) bVar.get(ChronoField.YEAR)) ? 366 : 365))) {
                                    b -= r12 - 1;
                                }
                            }
                            i2 = (int) b;
                        }
                        return i2;
                    }
                    if (hVar != ChronoUnit.FOREVER) {
                        throw new IllegalStateException("unreachable");
                    }
                    int e4 = org.apache.http.conn.ssl.d.e(bVar.get(chronoField) - this.b.c().getValue(), 7) + 1;
                    int i4 = bVar.get(ChronoField.YEAR);
                    long b2 = b(bVar, e4);
                    if (b2 == 0) {
                        i4--;
                    } else if (b2 >= 53) {
                        if (b2 >= a(i(bVar.get(ChronoField.DAY_OF_YEAR), e4), this.b.d() + (org.threeten.bp.j.f((long) i4) ? 366 : 365))) {
                            i4++;
                        }
                    }
                    return i4;
                }
                int i5 = bVar.get(ChronoField.DAY_OF_YEAR);
                a = a(i(i5, e2), i5);
            }
            return a;
        }

        @Override // org.threeten.bp.temporal.e
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.e
        public boolean isSupportedBy(b bVar) {
            if (!bVar.isSupported(ChronoField.DAY_OF_WEEK)) {
                return false;
            }
            h hVar = this.f10874d;
            if (hVar == ChronoUnit.WEEKS) {
                return true;
            }
            if (hVar == ChronoUnit.MONTHS) {
                return bVar.isSupported(ChronoField.DAY_OF_MONTH);
            }
            if (hVar == ChronoUnit.YEARS) {
                return bVar.isSupported(ChronoField.DAY_OF_YEAR);
            }
            if (hVar == IsoFields.f10857d) {
                return bVar.isSupported(ChronoField.EPOCH_DAY);
            }
            if (hVar == ChronoUnit.FOREVER) {
                return bVar.isSupported(ChronoField.EPOCH_DAY);
            }
            return false;
        }

        @Override // org.threeten.bp.temporal.e
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.e
        public j range() {
            return this.f10875e;
        }

        @Override // org.threeten.bp.temporal.e
        public j rangeRefinedBy(b bVar) {
            ChronoField chronoField;
            h hVar = this.f10874d;
            if (hVar == ChronoUnit.WEEKS) {
                return this.f10875e;
            }
            if (hVar == ChronoUnit.MONTHS) {
                chronoField = ChronoField.DAY_OF_MONTH;
            } else {
                if (hVar != ChronoUnit.YEARS) {
                    if (hVar == IsoFields.f10857d) {
                        return h(bVar);
                    }
                    if (hVar == ChronoUnit.FOREVER) {
                        return bVar.range(ChronoField.YEAR);
                    }
                    throw new IllegalStateException("unreachable");
                }
                chronoField = ChronoField.DAY_OF_YEAR;
            }
            int i2 = i(bVar.get(chronoField), org.apache.http.conn.ssl.d.e(bVar.get(ChronoField.DAY_OF_WEEK) - this.b.c().getValue(), 7) + 1);
            j range = bVar.range(chronoField);
            return j.g(a(i2, (int) range.d()), a(i2, (int) range.c()));
        }

        public String toString() {
            return this.a + "[" + this.b.toString() + "]";
        }
    }

    static {
        new k(DayOfWeek.MONDAY, 4);
        f(DayOfWeek.SUNDAY, 1);
    }

    private k(DayOfWeek dayOfWeek, int i) {
        a.g(this);
        this.f10869e = a.f(this);
        this.f10870f = a.d(this);
        org.apache.http.conn.ssl.d.k(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = dayOfWeek;
        this.b = i;
    }

    public static k e(Locale locale) {
        org.apache.http.conn.ssl.d.k(locale, "locale");
        return f(DayOfWeek.SUNDAY.plus(r4.getFirstDayOfWeek() - 1), new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    public static k f(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap<String, k> concurrentMap = f10866g;
        k kVar = concurrentMap.get(str);
        if (kVar != null) {
            return kVar;
        }
        concurrentMap.putIfAbsent(str, new k(dayOfWeek, i));
        return concurrentMap.get(str);
    }

    public e b() {
        return this.f10867c;
    }

    public DayOfWeek c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && hashCode() == obj.hashCode();
    }

    public e g() {
        return this.f10870f;
    }

    public e h() {
        return this.f10868d;
    }

    public int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public e i() {
        return this.f10869e;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("WeekFields[");
        M.append(this.a);
        M.append(',');
        return e.a.a.a.a.C(M, this.b, ']');
    }
}
