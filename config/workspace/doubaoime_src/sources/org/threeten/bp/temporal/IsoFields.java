package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.chrono.l;
import org.threeten.bp.format.ResolverStyle;

/* loaded from: classes2.dex */
public final class IsoFields {
    public static final e a;
    public static final e b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f10856c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f10857d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f10858e;

    private enum Unit implements h {
        WEEK_BASED_YEARS("WeekBasedYears", org.threeten.bp.c.d(31556952)),
        QUARTER_YEARS("QuarterYears", org.threeten.bp.c.d(7889238));

        private final org.threeten.bp.c duration;
        private final String name;

        Unit(String str, org.threeten.bp.c cVar) {
            this.name = str;
            this.duration = cVar;
        }

        @Override // org.threeten.bp.temporal.h
        public <R extends org.threeten.bp.temporal.a> R addTo(R r, long j) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return (R) r.a(IsoFields.f10856c, org.apache.http.conn.ssl.d.m(r.get(r0), j));
            }
            if (ordinal == 1) {
                return (R) r.d(j / 256, ChronoUnit.YEARS).d((j % 256) * 3, ChronoUnit.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // org.threeten.bp.temporal.h
        public long between(org.threeten.bp.temporal.a aVar, org.threeten.bp.temporal.a aVar2) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                e eVar = IsoFields.f10856c;
                return org.apache.http.conn.ssl.d.p(aVar2.getLong(eVar), aVar.getLong(eVar));
            }
            if (ordinal == 1) {
                return aVar.e(aVar2, ChronoUnit.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        public org.threeten.bp.c getDuration() {
            return this.duration;
        }

        @Override // org.threeten.bp.temporal.h
        public boolean isDateBased() {
            return true;
        }

        public boolean isDurationEstimated() {
            return true;
        }

        public boolean isSupportedBy(org.threeten.bp.temporal.a aVar) {
            return aVar.isSupported(ChronoField.EPOCH_DAY);
        }

        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    static {
        Field field = Field.DAY_OF_QUARTER;
        a = Field.QUARTER_OF_YEAR;
        b = Field.WEEK_OF_WEEK_BASED_YEAR;
        f10856c = Field.WEEK_BASED_YEAR;
        f10857d = Unit.WEEK_BASED_YEARS;
        f10858e = Unit.QUARTER_YEARS;
    }

    private enum Field implements e {
        DAY_OF_QUARTER { // from class: org.threeten.bp.temporal.IsoFields.Field.1
            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public <R extends org.threeten.bp.temporal.a> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return (R) r.a(chronoField, (j - from) + r.getLong(chronoField));
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getBaseUnit() {
                return ChronoUnit.DAYS;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public long getFrom(b bVar) {
                if (!bVar.isSupported(this)) {
                    throw new i("Unsupported field: DayOfQuarter");
                }
                return bVar.get(ChronoField.DAY_OF_YEAR) - Field.QUARTER_DAYS[((bVar.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (l.f10784c.p(bVar.getLong(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getRangeUnit() {
                return IsoFields.f10858e;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.DAY_OF_YEAR) && bVar.isSupported(ChronoField.MONTH_OF_YEAR) && bVar.isSupported(ChronoField.YEAR) && Field.isIso(bVar);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j range() {
                return j.h(1L, 90L, 92L);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j rangeRefinedBy(b bVar) {
                if (!bVar.isSupported(this)) {
                    throw new i("Unsupported field: DayOfQuarter");
                }
                long j = bVar.getLong(Field.QUARTER_OF_YEAR);
                if (j == 1) {
                    return l.f10784c.p(bVar.getLong(ChronoField.YEAR)) ? j.g(1L, 91L) : j.g(1L, 90L);
                }
                return j == 2 ? j.g(1L, 91L) : (j == 3 || j == 4) ? j.g(1L, 92L) : range();
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
            
                if (r2 == 2) goto L19;
             */
            @Override // org.threeten.bp.temporal.IsoFields.Field
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public org.threeten.bp.temporal.b resolve(java.util.Map<org.threeten.bp.temporal.e, java.lang.Long> r13, org.threeten.bp.temporal.b r14, org.threeten.bp.format.ResolverStyle r15) {
                /*
                    r12 = this;
                    org.threeten.bp.temporal.ChronoField r14 = org.threeten.bp.temporal.ChronoField.YEAR
                    java.lang.Object r0 = r13.get(r14)
                    java.lang.Long r0 = (java.lang.Long) r0
                    org.threeten.bp.temporal.IsoFields$Field r1 = org.threeten.bp.temporal.IsoFields.Field.QUARTER_OF_YEAR
                    java.lang.Object r2 = r13.get(r1)
                    java.lang.Long r2 = (java.lang.Long) r2
                    if (r0 == 0) goto L9c
                    if (r2 != 0) goto L16
                    goto L9c
                L16:
                    long r3 = r0.longValue()
                    int r0 = r14.checkValidIntValue(r3)
                    org.threeten.bp.temporal.IsoFields$Field r3 = org.threeten.bp.temporal.IsoFields.Field.DAY_OF_QUARTER
                    java.lang.Object r3 = r13.get(r3)
                    java.lang.Long r3 = (java.lang.Long) r3
                    long r3 = r3.longValue()
                    org.threeten.bp.format.ResolverStyle r5 = org.threeten.bp.format.ResolverStyle.LENIENT
                    r6 = 3
                    r7 = 1
                    r9 = 1
                    if (r15 != r5) goto L4f
                    long r10 = r2.longValue()
                    org.threeten.bp.e r15 = org.threeten.bp.e.H(r0, r9, r9)
                    long r9 = org.apache.http.conn.ssl.d.p(r10, r7)
                    long r5 = org.apache.http.conn.ssl.d.n(r9, r6)
                    org.threeten.bp.e r15 = r15.M(r5)
                    long r2 = org.apache.http.conn.ssl.d.p(r3, r7)
                    org.threeten.bp.e r15 = r15.L(r2)
                    goto L92
                L4f:
                    org.threeten.bp.temporal.j r5 = r1.range()
                    long r10 = r2.longValue()
                    int r2 = r5.a(r10, r1)
                    org.threeten.bp.format.ResolverStyle r5 = org.threeten.bp.format.ResolverStyle.STRICT
                    if (r15 != r5) goto L7f
                    r15 = 92
                    r5 = 91
                    if (r2 != r9) goto L72
                    org.threeten.bp.chrono.l r15 = org.threeten.bp.chrono.l.f10784c
                    long r10 = (long) r0
                    boolean r15 = r15.p(r10)
                    if (r15 == 0) goto L6f
                    goto L75
                L6f:
                    r15 = 90
                    goto L76
                L72:
                    r10 = 2
                    if (r2 != r10) goto L76
                L75:
                    r15 = r5
                L76:
                    long r10 = (long) r15
                    org.threeten.bp.temporal.j r15 = org.threeten.bp.temporal.j.g(r7, r10)
                    r15.b(r3, r12)
                    goto L86
                L7f:
                    org.threeten.bp.temporal.j r15 = r12.range()
                    r15.b(r3, r12)
                L86:
                    int r2 = r2 - r9
                    int r2 = r2 * r6
                    int r2 = r2 + r9
                    org.threeten.bp.e r15 = org.threeten.bp.e.H(r0, r2, r9)
                    long r3 = r3 - r7
                    org.threeten.bp.e r15 = r15.L(r3)
                L92:
                    r13.remove(r12)
                    r13.remove(r14)
                    r13.remove(r1)
                    return r15
                L9c:
                    r13 = 0
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.temporal.IsoFields.Field.AnonymousClass1.resolve(java.util.Map, org.threeten.bp.temporal.b, org.threeten.bp.format.ResolverStyle):org.threeten.bp.temporal.b");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.2
            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public <R extends org.threeten.bp.temporal.a> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return (R) r.a(chronoField, ((j - from) * 3) + r.getLong(chronoField));
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getBaseUnit() {
                return IsoFields.f10858e;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public long getFrom(b bVar) {
                if (bVar.isSupported(this)) {
                    return (bVar.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new i("Unsupported field: QuarterOfYear");
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getRangeUnit() {
                return ChronoUnit.YEARS;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.MONTH_OF_YEAR) && Field.isIso(bVar);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j range() {
                return j.g(1L, 4L);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j rangeRefinedBy(b bVar) {
                return range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.3
            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public <R extends org.threeten.bp.temporal.a> R adjustInto(R r, long j) {
                range().b(j, this);
                return (R) r.d(org.apache.http.conn.ssl.d.p(j, getFrom(r)), ChronoUnit.WEEKS);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getBaseUnit() {
                return ChronoUnit.WEEKS;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public String getDisplayName(Locale locale) {
                org.apache.http.conn.ssl.d.k(locale, "locale");
                return "Week";
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public long getFrom(b bVar) {
                if (bVar.isSupported(this)) {
                    return Field.getWeek(org.threeten.bp.e.r(bVar));
                }
                throw new i("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getRangeUnit() {
                return IsoFields.f10857d;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(bVar);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j range() {
                return j.h(1L, 52L, 53L);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j rangeRefinedBy(b bVar) {
                if (bVar.isSupported(this)) {
                    return Field.getWeekRange(org.threeten.bp.e.r(bVar));
                }
                throw new i("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public b resolve(Map<e, Long> map, b bVar, ResolverStyle resolverStyle) {
                e eVar;
                org.threeten.bp.e a;
                e eVar2 = Field.WEEK_BASED_YEAR;
                Long l = map.get(eVar2);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int a2 = eVar2.range().a(l.longValue(), eVar2);
                long longValue = map.get(Field.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long longValue2 = l2.longValue();
                    long j = 0;
                    if (longValue2 > 7) {
                        long j2 = longValue2 - 1;
                        j = j2 / 7;
                        longValue2 = (j2 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    eVar = eVar2;
                    a = org.threeten.bp.e.H(a2, 1, 4).N(longValue - 1).N(j).a(chronoField, longValue2);
                } else {
                    eVar = eVar2;
                    int checkValidIntValue = chronoField.checkValidIntValue(l2.longValue());
                    if (resolverStyle == ResolverStyle.STRICT) {
                        Field.getWeekRange(org.threeten.bp.e.H(a2, 1, 4)).b(longValue, this);
                    } else {
                        range().b(longValue, this);
                    }
                    a = org.threeten.bp.e.H(a2, 1, 4).N(longValue - 1).a(chronoField, checkValidIntValue);
                }
                map.remove(this);
                map.remove(eVar);
                map.remove(chronoField);
                return a;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.4
            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public <R extends org.threeten.bp.temporal.a> R adjustInto(R r, long j) {
                if (!isSupportedBy(r)) {
                    throw new i("Unsupported field: WeekBasedYear");
                }
                int a = range().a(j, Field.WEEK_BASED_YEAR);
                org.threeten.bp.e r2 = org.threeten.bp.e.r(r);
                int i = r2.get(ChronoField.DAY_OF_WEEK);
                int week = Field.getWeek(r2);
                if (week == 53 && Field.getWeekRange(a) == 52) {
                    week = 52;
                }
                return (R) r.b(org.threeten.bp.e.H(a, 1, 4).L(((week - 1) * 7) + (i - r6.get(r0))));
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getBaseUnit() {
                return IsoFields.f10857d;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public long getFrom(b bVar) {
                if (bVar.isSupported(this)) {
                    return Field.getWeekBasedYear(org.threeten.bp.e.r(bVar));
                }
                throw new i("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field
            public h getRangeUnit() {
                return ChronoUnit.FOREVER;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(bVar);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j range() {
                return ChronoField.YEAR.range();
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.e
            public j rangeRefinedBy(b bVar) {
                return ChronoField.YEAR.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        };

        private static final int[] QUARTER_DAYS = {0, 90, 181, 273, 0, 91, 182, 274};

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(org.threeten.bp.e eVar) {
            int ordinal = eVar.u().ordinal();
            int v = eVar.v() - 1;
            int i = (3 - ordinal) + v;
            int i2 = (i - ((i / 7) * 7)) - 3;
            if (i2 < -3) {
                i2 += 7;
            }
            if (v < i2) {
                return (int) getWeekRange(eVar.U(180).O(-1L)).c();
            }
            int i3 = ((v - i2) / 7) + 1;
            if (i3 == 53) {
                if (!(i2 == -3 || (i2 == -2 && eVar.B()))) {
                    return 1;
                }
            }
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(org.threeten.bp.e eVar) {
            int y = eVar.y();
            int v = eVar.v();
            if (v <= 3) {
                return v - eVar.u().ordinal() < -2 ? y - 1 : y;
            }
            if (v >= 363) {
                return ((v - 363) - (eVar.B() ? 1 : 0)) - eVar.u().ordinal() >= 0 ? y + 1 : y;
            }
            return y;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static j getWeekRange(org.threeten.bp.e eVar) {
            return j.g(1L, getWeekRange(getWeekBasedYear(eVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(b bVar) {
            return org.threeten.bp.chrono.h.h(bVar).equals(l.f10784c);
        }

        @Override // org.threeten.bp.temporal.e
        public abstract /* synthetic */ <R extends org.threeten.bp.temporal.a> R adjustInto(R r, long j);

        public abstract /* synthetic */ h getBaseUnit();

        public String getDisplayName(Locale locale) {
            org.apache.http.conn.ssl.d.k(locale, "locale");
            return toString();
        }

        @Override // org.threeten.bp.temporal.e
        public abstract /* synthetic */ long getFrom(b bVar);

        public abstract /* synthetic */ h getRangeUnit();

        @Override // org.threeten.bp.temporal.e
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.e
        public abstract /* synthetic */ boolean isSupportedBy(b bVar);

        @Override // org.threeten.bp.temporal.e
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.e
        public abstract /* synthetic */ j range();

        @Override // org.threeten.bp.temporal.e
        public abstract /* synthetic */ j rangeRefinedBy(b bVar);

        public b resolve(Map<e, Long> map, b bVar, ResolverStyle resolverStyle) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i) {
            org.threeten.bp.e H = org.threeten.bp.e.H(i, 1, 1);
            if (H.u() != DayOfWeek.THURSDAY) {
                return (H.u() == DayOfWeek.WEDNESDAY && H.B()) ? 53 : 52;
            }
            return 53;
        }
    }
}
