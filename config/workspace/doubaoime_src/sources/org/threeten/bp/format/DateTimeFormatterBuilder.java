package org.threeten.bp.format;

import com.huawei.hms.framework.common.ExceptionCode;
import com.mammon.audiosdk.SAMICoreCode;
import com.xiaomi.mipush.sdk.Constants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.format.e;
import org.threeten.bp.format.g;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;

/* loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {
    private static final org.threeten.bp.temporal.g<org.threeten.bp.k> h = new a();
    private static final Map<Character, org.threeten.bp.temporal.e> i;
    private DateTimeFormatterBuilder a;
    private final DateTimeFormatterBuilder b;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f10808c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10809d;

    /* renamed from: e, reason: collision with root package name */
    private int f10810e;

    /* renamed from: f, reason: collision with root package name */
    private char f10811f;

    /* renamed from: g, reason: collision with root package name */
    private int f10812g;

    enum SettingsParser implements e {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public int parse(org.threeten.bp.format.b bVar, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                throw null;
            }
            if (ordinal == 1) {
                throw null;
            }
            if (ordinal == 2) {
                throw null;
            }
            if (ordinal != 3) {
                return i;
            }
            throw null;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static class a implements org.threeten.bp.temporal.g<org.threeten.bp.k> {
        a() {
        }

        @Override // org.threeten.bp.temporal.g
        public org.threeten.bp.k a(org.threeten.bp.temporal.b bVar) {
            org.threeten.bp.k kVar = (org.threeten.bp.k) bVar.query(org.threeten.bp.temporal.f.g());
            if (kVar == null || (kVar instanceof org.threeten.bp.l)) {
                return null;
            }
            return kVar;
        }
    }

    class b extends org.threeten.bp.format.e {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.b f10813c;

        b(DateTimeFormatterBuilder dateTimeFormatterBuilder, g.b bVar) {
            this.f10813c = bVar;
        }

        @Override // org.threeten.bp.format.e
        public String b(org.threeten.bp.temporal.e eVar, long j, TextStyle textStyle, Locale locale) {
            return this.f10813c.a(j, textStyle);
        }
    }

    static final class c implements e {
        private final char a;

        c(char c2) {
            this.a = c2;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            StringBuilder M = e.a.a.a.a.M("'");
            M.append(this.a);
            M.append("'");
            return M.toString();
        }
    }

    interface e {
        boolean print(org.threeten.bp.format.d dVar, StringBuilder sb);
    }

    static final class f implements e {
        private final org.threeten.bp.temporal.e a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final int f10814c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f10815d;

        f(org.threeten.bp.temporal.e eVar, int i, int i2, boolean z) {
            org.apache.http.conn.ssl.d.k(eVar, "field");
            if (!eVar.range().e()) {
                throw new IllegalArgumentException(e.a.a.a.a.z("Field must have a fixed set of values: ", eVar));
            }
            if (i < 0 || i > 9) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Minimum width must be from 0 to 9 inclusive but was ", i));
            }
            if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Maximum width must be from 1 to 9 inclusive but was ", i2));
            }
            if (i2 < i) {
                throw new IllegalArgumentException(e.a.a.a.a.l("Maximum width must exceed or equal the minimum width but ", i2, " < ", i));
            }
            this.a = eVar;
            this.b = i;
            this.f10814c = i2;
            this.f10815d = z;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long e2 = dVar.e(this.a);
            if (e2 == null) {
                return false;
            }
            org.threeten.bp.format.f c2 = dVar.c();
            long longValue = e2.longValue();
            org.threeten.bp.temporal.j range = this.a.range();
            range.b(longValue, this.a);
            BigDecimal valueOf = BigDecimal.valueOf(range.d());
            BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(range.c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
            if (stripTrailingZeros.scale() != 0) {
                String a = c2.a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.b), this.f10814c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f10815d) {
                    sb.append(c2.b());
                }
                sb.append(a);
                return true;
            }
            if (this.b <= 0) {
                return true;
            }
            if (this.f10815d) {
                sb.append(c2.b());
            }
            for (int i = 0; i < this.b; i++) {
                sb.append(c2.e());
            }
            return true;
        }

        public String toString() {
            String str = this.f10815d ? ",DecimalPoint" : "";
            StringBuilder M = e.a.a.a.a.M("Fraction(");
            M.append(this.a);
            M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M.append(this.b);
            M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M.append(this.f10814c);
            M.append(str);
            M.append(")");
            return M.toString();
        }
    }

    static final class g implements e {
        g(int i) {
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long e2 = dVar.e(ChronoField.INSTANT_SECONDS);
            org.threeten.bp.temporal.b d2 = dVar.d();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            Long valueOf = d2.isSupported(chronoField) ? Long.valueOf(dVar.d().getLong(chronoField)) : 0L;
            if (e2 == null) {
                return false;
            }
            long longValue = e2.longValue();
            int checkValidIntValue = chronoField.checkValidIntValue(valueOf.longValue());
            if (longValue >= -62167219200L) {
                long j = (longValue - 315569520000L) + 62167219200L;
                long d3 = org.apache.http.conn.ssl.d.d(j, 315569520000L) + 1;
                org.threeten.bp.f z = org.threeten.bp.f.z(org.apache.http.conn.ssl.d.g(j, 315569520000L) - 62167219200L, 0, org.threeten.bp.l.f10850f);
                if (d3 > 0) {
                    sb.append('+');
                    sb.append(d3);
                }
                sb.append(z);
                if (z.t() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                org.threeten.bp.f z2 = org.threeten.bp.f.z(j4 - 62167219200L, 0, org.threeten.bp.l.f10850f);
                int length = sb.length();
                sb.append(z2);
                if (z2.t() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (z2.u() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            if (checkValidIntValue != 0) {
                sb.append('.');
                if (checkValidIntValue % 1000000 == 0) {
                    sb.append(Integer.toString((checkValidIntValue / 1000000) + 1000).substring(1));
                } else if (checkValidIntValue % 1000 == 0) {
                    sb.append(Integer.toString((checkValidIntValue / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(checkValidIntValue + 1000000000).substring(1));
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    static final class h implements e {
        private final TextStyle a;

        public h(TextStyle textStyle) {
            this.a = textStyle;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long e2 = dVar.e(ChronoField.OFFSET_SECONDS);
            if (e2 == null) {
                return false;
            }
            sb.append("GMT");
            if (this.a == TextStyle.FULL) {
                return new j("", "+HH:MM:ss").print(dVar, sb);
            }
            int q = org.apache.http.conn.ssl.d.q(e2.longValue());
            if (q == 0) {
                return true;
            }
            int abs = Math.abs((q / 3600) % 100);
            int abs2 = Math.abs((q / 60) % 60);
            int abs3 = Math.abs(q % 60);
            sb.append(q < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+");
            sb.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb.append(Constants.COLON_SEPARATOR);
            sb.append((char) ((abs2 / 10) + 48));
            sb.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb.append(Constants.COLON_SEPARATOR);
            sb.append((char) ((abs3 / 10) + 48));
            sb.append((char) ((abs3 % 10) + 48));
            return true;
        }
    }

    static final class j implements e {

        /* renamed from: c, reason: collision with root package name */
        static final String[] f10820c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: d, reason: collision with root package name */
        static final j f10821d = new j("Z", "+HH:MM:ss");
        private final String a;
        private final int b;

        j(String str, String str2) {
            org.apache.http.conn.ssl.d.k(str, "noOffsetText");
            org.apache.http.conn.ssl.d.k(str2, "pattern");
            this.a = str;
            int i = 0;
            while (true) {
                String[] strArr = f10820c;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException(e.a.a.a.a.s("Invalid zone offset pattern: ", str2));
                }
                if (strArr[i].equals(str2)) {
                    this.b = i;
                    return;
                }
                i++;
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long e2 = dVar.e(ChronoField.OFFSET_SECONDS);
            if (e2 == null) {
                return false;
            }
            int q = org.apache.http.conn.ssl.d.q(e2.longValue());
            if (q == 0) {
                sb.append(this.a);
            } else {
                int abs = Math.abs((q / 3600) % 100);
                int abs2 = Math.abs((q / 60) % 60);
                int abs3 = Math.abs(q % 60);
                int length = sb.length();
                sb.append(q < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i = this.b;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    int i2 = i % 2;
                    String str = Constants.COLON_SEPARATOR;
                    sb.append(i2 == 0 ? Constants.COLON_SEPARATOR : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i3 = this.b;
                    if (i3 >= 7 || (i3 >= 5 && abs3 > 0)) {
                        if (i3 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.a);
                }
            }
            return true;
        }

        public String toString() {
            String replace = this.a.replace("'", "''");
            StringBuilder M = e.a.a.a.a.M("Offset(");
            M.append(f10820c[this.b]);
            M.append(",'");
            M.append(replace);
            M.append("')");
            return M.toString();
        }
    }

    static final class k implements e {
        private final e a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final char f10822c;

        k(e eVar, int i, char c2) {
            this.a = eVar;
            this.b = i;
            this.f10822c = c2;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.a.print(dVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 > this.b) {
                StringBuilder N = e.a.a.a.a.N("Cannot print as output of ", length2, " characters exceeds pad width of ");
                N.append(this.b);
                throw new org.threeten.bp.b(N.toString());
            }
            for (int i = 0; i < this.b - length2; i++) {
                sb.insert(length, this.f10822c);
            }
            return true;
        }

        public String toString() {
            String sb;
            StringBuilder M = e.a.a.a.a.M("Pad(");
            M.append(this.a);
            M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M.append(this.b);
            if (this.f10822c == ' ') {
                sb = ")";
            } else {
                StringBuilder M2 = e.a.a.a.a.M(",'");
                M2.append(this.f10822c);
                M2.append("')");
                sb = M2.toString();
            }
            M.append(sb);
            return M.toString();
        }
    }

    static final class m implements e {
        private final String a;

        m(String str) {
            this.a = str;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            return e.a.a.a.a.t("'", this.a.replace("'", "''"), "'");
        }
    }

    static final class n implements e {
        private final org.threeten.bp.temporal.e a;
        private final TextStyle b;

        /* renamed from: c, reason: collision with root package name */
        private final org.threeten.bp.format.e f10824c;

        /* renamed from: d, reason: collision with root package name */
        private volatile i f10825d;

        n(org.threeten.bp.temporal.e eVar, TextStyle textStyle, org.threeten.bp.format.e eVar2) {
            this.a = eVar;
            this.b = textStyle;
            this.f10824c = eVar2;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long e2 = dVar.e(this.a);
            if (e2 == null) {
                return false;
            }
            String b = this.f10824c.b(this.a, e2.longValue(), this.b, dVar.b());
            if (b != null) {
                sb.append(b);
                return true;
            }
            if (this.f10825d == null) {
                this.f10825d = new i(this.a, 1, 19, SignStyle.NORMAL);
            }
            return this.f10825d.print(dVar, sb);
        }

        public String toString() {
            if (this.b == TextStyle.FULL) {
                StringBuilder M = e.a.a.a.a.M("Text(");
                M.append(this.a);
                M.append(")");
                return M.toString();
            }
            StringBuilder M2 = e.a.a.a.a.M("Text(");
            M2.append(this.a);
            M2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M2.append(this.b);
            M2.append(")");
            return M2.toString();
        }
    }

    static final class o implements e {
        private final char a;
        private final int b;

        public o(char c2, int i) {
            this.a = c2;
            this.b = i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            e iVar;
            e eVar;
            org.threeten.bp.temporal.k e2 = org.threeten.bp.temporal.k.e(dVar.b());
            char c2 = this.a;
            if (c2 == 'W') {
                iVar = new i(e2.h(), 1, 2, SignStyle.NOT_NEGATIVE);
            } else if (c2 != 'Y') {
                if (c2 == 'c') {
                    iVar = new i(e2.b(), this.b, 2, SignStyle.NOT_NEGATIVE);
                } else if (c2 == 'e') {
                    iVar = new i(e2.b(), this.b, 2, SignStyle.NOT_NEGATIVE);
                } else {
                    if (c2 != 'w') {
                        eVar = null;
                        return eVar.print(dVar, sb);
                    }
                    iVar = new i(e2.i(), this.b, 2, SignStyle.NOT_NEGATIVE);
                }
            } else if (this.b == 2) {
                iVar = new l(e2.g(), 2, 2, 0, l.i);
            } else {
                org.threeten.bp.temporal.e g2 = e2.g();
                int i = this.b;
                iVar = new i(g2, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, -1, null);
            }
            eVar = iVar;
            return eVar.print(dVar, sb);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c2 = this.a;
            if (c2 == 'Y') {
                int i = this.b;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    e.a.a.a.a.F0(sb, this.b, Constants.ACCEPT_TIME_SEPARATOR_SP, 19, Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(this.b < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
            } else {
                if (c2 == 'c' || c2 == 'e') {
                    sb.append("DayOfWeek");
                } else if (c2 == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                } else if (c2 == 'W') {
                    sb.append("WeekOfMonth");
                }
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.b);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    static final class p implements e {
        private final org.threeten.bp.temporal.g<org.threeten.bp.k> a;
        private final String b;

        p(org.threeten.bp.temporal.g<org.threeten.bp.k> gVar, String str) {
            this.a = gVar;
            this.b = str;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            org.threeten.bp.k kVar = (org.threeten.bp.k) dVar.f(this.a);
            if (kVar == null) {
                return false;
            }
            sb.append(kVar.g());
            return true;
        }

        public String toString() {
            return this.b;
        }
    }

    static final class q implements e {
        private final TextStyle a;

        q(TextStyle textStyle) {
            org.apache.http.conn.ssl.d.k(textStyle, "textStyle");
            this.a = textStyle;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean print(org.threeten.bp.format.d r7, java.lang.StringBuilder r8) {
            /*
                r6 = this;
                org.threeten.bp.temporal.g r0 = org.threeten.bp.temporal.f.g()
                java.lang.Object r0 = r7.f(r0)
                org.threeten.bp.k r0 = (org.threeten.bp.k) r0
                r1 = 0
                if (r0 != 0) goto Le
                return r1
            Le:
                org.threeten.bp.zone.e r2 = r0.h()     // Catch: org.threeten.bp.zone.f -> L1f
                boolean r3 = r2.e()     // Catch: org.threeten.bp.zone.f -> L1f
                if (r3 == 0) goto L1f
                org.threeten.bp.d r3 = org.threeten.bp.d.f10802c     // Catch: org.threeten.bp.zone.f -> L1f
                org.threeten.bp.l r2 = r2.a(r3)     // Catch: org.threeten.bp.zone.f -> L1f
                goto L20
            L1f:
                r2 = r0
            L20:
                boolean r2 = r2 instanceof org.threeten.bp.l
                r3 = 1
                if (r2 == 0) goto L2d
                java.lang.String r7 = r0.g()
                r8.append(r7)
                return r3
            L2d:
                org.threeten.bp.temporal.b r2 = r7.d()
                org.threeten.bp.temporal.ChronoField r4 = org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS
                boolean r5 = r2.isSupported(r4)
                if (r5 == 0) goto L4a
                long r4 = r2.getLong(r4)
                org.threeten.bp.d r2 = org.threeten.bp.d.m(r4)
                org.threeten.bp.zone.e r4 = r0.h()
                boolean r2 = r4.d(r2)
                goto L4b
            L4a:
                r2 = r1
            L4b:
                java.lang.String r0 = r0.g()
                java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
                org.threeten.bp.format.TextStyle r4 = r6.a
                org.threeten.bp.format.TextStyle r4 = r4.asNormal()
                org.threeten.bp.format.TextStyle r5 = org.threeten.bp.format.TextStyle.FULL
                if (r4 != r5) goto L5e
                r1 = r3
            L5e:
                java.util.Locale r7 = r7.b()
                java.lang.String r7 = r0.getDisplayName(r2, r1, r7)
                r8.append(r7)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.q.print(org.threeten.bp.format.d, java.lang.StringBuilder):boolean");
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("ZoneText(");
            M.append(this.a);
            M.append(")");
            return M.toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        org.threeten.bp.temporal.e eVar = IsoFields.a;
        hashMap.put('Q', eVar);
        hashMap.put('q', eVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.f10808c = new ArrayList();
        this.f10812g = -1;
        this.b = null;
        this.f10809d = false;
    }

    private int d(e eVar) {
        org.apache.http.conn.ssl.d.k(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.f10810e;
        if (i2 > 0) {
            k kVar = new k(eVar, i2, dateTimeFormatterBuilder.f10811f);
            dateTimeFormatterBuilder.f10810e = 0;
            dateTimeFormatterBuilder.f10811f = (char) 0;
            eVar = kVar;
        }
        dateTimeFormatterBuilder.f10808c.add(eVar);
        this.a.f10812g = -1;
        return r5.f10808c.size() - 1;
    }

    private DateTimeFormatterBuilder m(i iVar) {
        i b2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.f10812g;
        if (i2 < 0 || !(dateTimeFormatterBuilder.f10808c.get(i2) instanceof i)) {
            this.a.f10812g = d(iVar);
        } else {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            int i3 = dateTimeFormatterBuilder2.f10812g;
            i iVar2 = (i) dateTimeFormatterBuilder2.f10808c.get(i3);
            int i4 = iVar.b;
            int i5 = iVar.f10817c;
            if (i4 == i5 && iVar.f10818d == SignStyle.NOT_NEGATIVE) {
                b2 = iVar2.c(i5);
                d(iVar.b());
                this.a.f10812g = i3;
            } else {
                b2 = iVar2.b();
                this.a.f10812g = d(iVar);
            }
            this.a.f10808c.set(i3, b2);
        }
        return this;
    }

    public DateTimeFormatterBuilder a(org.threeten.bp.format.a aVar) {
        org.apache.http.conn.ssl.d.k(aVar, "formatter");
        d(aVar.f(false));
        return this;
    }

    public DateTimeFormatterBuilder b(org.threeten.bp.temporal.e eVar, int i2, int i3, boolean z) {
        d(new f(eVar, i2, i3, z));
        return this;
    }

    public DateTimeFormatterBuilder c() {
        d(new g(-2));
        return this;
    }

    public DateTimeFormatterBuilder e(char c2) {
        d(new c(c2));
        return this;
    }

    public DateTimeFormatterBuilder f(String str) {
        org.apache.http.conn.ssl.d.k(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                d(new c(str.charAt(0)));
            } else {
                d(new m(str));
            }
        }
        return this;
    }

    public DateTimeFormatterBuilder g(TextStyle textStyle) {
        org.apache.http.conn.ssl.d.k(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new h(textStyle));
        return this;
    }

    public DateTimeFormatterBuilder h(String str, String str2) {
        d(new j(str2, str));
        return this;
    }

    public DateTimeFormatterBuilder i() {
        d(j.f10821d);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.threeten.bp.format.DateTimeFormatterBuilder j(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.j(java.lang.String):org.threeten.bp.format.DateTimeFormatterBuilder");
    }

    public DateTimeFormatterBuilder k(org.threeten.bp.temporal.e eVar, Map<Long, String> map) {
        org.apache.http.conn.ssl.d.k(eVar, "field");
        org.apache.http.conn.ssl.d.k(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        d(new n(eVar, textStyle, new b(this, new g.b(Collections.singletonMap(textStyle, linkedHashMap)))));
        return this;
    }

    public DateTimeFormatterBuilder l(org.threeten.bp.temporal.e eVar, TextStyle textStyle) {
        org.apache.http.conn.ssl.d.k(eVar, "field");
        org.apache.http.conn.ssl.d.k(textStyle, "textStyle");
        int i2 = org.threeten.bp.format.e.b;
        d(new n(eVar, textStyle, e.a.a));
        return this;
    }

    public DateTimeFormatterBuilder n(org.threeten.bp.temporal.e eVar) {
        org.apache.http.conn.ssl.d.k(eVar, "field");
        m(new i(eVar, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder o(org.threeten.bp.temporal.e eVar, int i2) {
        org.apache.http.conn.ssl.d.k(eVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException(e.a.a.a.a.j("The width must be from 1 to 19 inclusive but was ", i2));
        }
        m(new i(eVar, i2, i2, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder p(org.threeten.bp.temporal.e eVar, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            o(eVar, i3);
            return this;
        }
        org.apache.http.conn.ssl.d.k(eVar, "field");
        org.apache.http.conn.ssl.d.k(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException(e.a.a.a.a.j("The minimum width must be from 1 to 19 inclusive but was ", i2));
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException(e.a.a.a.a.j("The maximum width must be from 1 to 19 inclusive but was ", i3));
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(e.a.a.a.a.l("The maximum width must exceed or equal the minimum width but ", i3, " < ", i2));
        }
        m(new i(eVar, i2, i3, signStyle));
        return this;
    }

    public DateTimeFormatterBuilder q() {
        d(new p(h, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder r() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.f10808c.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            d dVar = new d(dateTimeFormatterBuilder2.f10808c, dateTimeFormatterBuilder2.f10809d);
            this.a = this.a.b;
            d(dVar);
        } else {
            this.a = this.a.b;
        }
        return this;
    }

    public DateTimeFormatterBuilder s() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.f10812g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder t() {
        d(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder u() {
        d(SettingsParser.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder v() {
        d(SettingsParser.LENIENT);
        return this;
    }

    public org.threeten.bp.format.a w() {
        return x(Locale.getDefault());
    }

    public org.threeten.bp.format.a x(Locale locale) {
        org.apache.http.conn.ssl.d.k(locale, "locale");
        while (this.a.b != null) {
            r();
        }
        return new org.threeten.bp.format.a(new d(this.f10808c, false), locale, org.threeten.bp.format.f.f10835e, ResolverStyle.SMART, null, null, null);
    }

    org.threeten.bp.format.a y(ResolverStyle resolverStyle) {
        return w().h(resolverStyle);
    }

    static final class d implements e {
        private final e[] a;
        private final boolean b;

        d(List<e> list, boolean z) {
            this.a = (e[]) list.toArray(new e[list.size()]);
            this.b = z;
        }

        public d a(boolean z) {
            return z == this.b ? this : new d(this.a, z);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        public boolean print(org.threeten.bp.format.d dVar, StringBuilder sb) {
            int length = sb.length();
            if (this.b) {
                dVar.g();
            }
            try {
                for (e eVar : this.a) {
                    if (!eVar.print(dVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.b) {
                    dVar.a();
                }
                return true;
            } finally {
                if (this.b) {
                    dVar.a();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(this.b ? "[" : "(");
                for (e eVar : this.a) {
                    sb.append(eVar);
                }
                sb.append(this.b ? "]" : ")");
            }
            return sb.toString();
        }

        d(e[] eVarArr, boolean z) {
            this.a = eVarArr;
            this.b = z;
        }
    }

    static class i implements e {

        /* renamed from: f, reason: collision with root package name */
        static final int[] f10816f = {0, 10, 100, 1000, 10000, SAMICoreCode.SAMI_BASE, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};
        final org.threeten.bp.temporal.e a;
        final int b;

        /* renamed from: c, reason: collision with root package name */
        final int f10817c;

        /* renamed from: d, reason: collision with root package name */
        final SignStyle f10818d;

        /* renamed from: e, reason: collision with root package name */
        final int f10819e;

        i(org.threeten.bp.temporal.e eVar, int i, int i2, SignStyle signStyle) {
            this.a = eVar;
            this.b = i;
            this.f10817c = i2;
            this.f10818d = signStyle;
            this.f10819e = 0;
        }

        long a(org.threeten.bp.format.d dVar, long j) {
            return j;
        }

        i b() {
            return this.f10819e == -1 ? this : new i(this.a, this.b, this.f10817c, this.f10818d, -1);
        }

        i c(int i) {
            return new i(this.a, this.b, this.f10817c, this.f10818d, this.f10819e + i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        
            if (r4 != 4) goto L41;
         */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean print(org.threeten.bp.format.d r11, java.lang.StringBuilder r12) {
            /*
                r10 = this;
                org.threeten.bp.temporal.e r0 = r10.a
                java.lang.Long r0 = r11.e(r0)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                long r2 = r0.longValue()
                long r2 = r10.a(r11, r2)
                org.threeten.bp.format.f r11 = r11.c()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1f
                java.lang.String r0 = "9223372036854775808"
                goto L27
            L1f:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L27:
                int r4 = r0.length()
                int r5 = r10.f10817c
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto Lb5
                java.lang.String r0 = r11.a(r0)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 4
                r8 = 1
                if (r4 < 0) goto L69
                org.threeten.bp.format.SignStyle r4 = r10.f10818d
                int r4 = r4.ordinal()
                if (r4 == r8) goto L61
                if (r4 == r5) goto L4a
                goto L9e
            L4a:
                int r4 = r10.b
                r5 = 19
                if (r4 >= r5) goto L9e
                int[] r5 = org.threeten.bp.format.DateTimeFormatterBuilder.i.f10816f
                r4 = r5[r4]
                long r4 = (long) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L9e
                char r2 = r11.d()
                r12.append(r2)
                goto L9e
            L61:
                char r2 = r11.d()
                r12.append(r2)
                goto L9e
            L69:
                org.threeten.bp.format.SignStyle r4 = r10.f10818d
                int r4 = r4.ordinal()
                if (r4 == 0) goto L97
                if (r4 == r8) goto L97
                r9 = 3
                if (r4 == r9) goto L79
                if (r4 == r5) goto L97
                goto L9e
            L79:
                org.threeten.bp.b r11 = new org.threeten.bp.b
                java.lang.StringBuilder r12 = e.a.a.a.a.M(r7)
                org.threeten.bp.temporal.e r0 = r10.a
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L97:
                char r2 = r11.c()
                r12.append(r2)
            L9e:
                int r2 = r10.b
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto Lb1
                char r2 = r11.e()
                r12.append(r2)
                int r1 = r1 + 1
                goto L9e
            Lb1:
                r12.append(r0)
                return r8
            Lb5:
                org.threeten.bp.b r11 = new org.threeten.bp.b
                java.lang.StringBuilder r12 = e.a.a.a.a.M(r7)
                org.threeten.bp.temporal.e r0 = r10.a
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r12.append(r0)
                int r0 = r10.f10817c
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.i.print(org.threeten.bp.format.d, java.lang.StringBuilder):boolean");
        }

        public String toString() {
            int i = this.b;
            if (i == 1 && this.f10817c == 19 && this.f10818d == SignStyle.NORMAL) {
                StringBuilder M = e.a.a.a.a.M("Value(");
                M.append(this.a);
                M.append(")");
                return M.toString();
            }
            if (i == this.f10817c && this.f10818d == SignStyle.NOT_NEGATIVE) {
                StringBuilder M2 = e.a.a.a.a.M("Value(");
                M2.append(this.a);
                M2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                return e.a.a.a.a.D(M2, this.b, ")");
            }
            StringBuilder M3 = e.a.a.a.a.M("Value(");
            M3.append(this.a);
            M3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M3.append(this.b);
            M3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M3.append(this.f10817c);
            M3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M3.append(this.f10818d);
            M3.append(")");
            return M3.toString();
        }

        private i(org.threeten.bp.temporal.e eVar, int i, int i2, SignStyle signStyle, int i3) {
            this.a = eVar;
            this.b = i;
            this.f10817c = i2;
            this.f10818d = signStyle;
            this.f10819e = i3;
        }

        i(org.threeten.bp.temporal.e eVar, int i, int i2, SignStyle signStyle, int i3, a aVar) {
            this.a = eVar;
            this.b = i;
            this.f10817c = i2;
            this.f10818d = signStyle;
            this.f10819e = i3;
        }
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        this.a = this;
        this.f10808c = new ArrayList();
        this.f10812g = -1;
        this.b = dateTimeFormatterBuilder;
        this.f10809d = z;
    }

    static final class l extends i {
        static final org.threeten.bp.e i = org.threeten.bp.e.H(2000, 1, 1);

        /* renamed from: g, reason: collision with root package name */
        private final int f10823g;
        private final org.threeten.bp.chrono.b h;

        l(org.threeten.bp.temporal.e eVar, int i2, int i3, int i4, org.threeten.bp.chrono.b bVar) {
            super(eVar, i2, i3, SignStyle.NOT_NEGATIVE);
            if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException(e.a.a.a.a.j("The width must be from 1 to 10 inclusive but was ", i2));
            }
            if (i3 < 1 || i3 > 10) {
                throw new IllegalArgumentException(e.a.a.a.a.j("The maxWidth must be from 1 to 10 inclusive but was ", i3));
            }
            if (i3 < i2) {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
            if (bVar == null) {
                long j = i4;
                if (!eVar.range().f(j)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j + i.f10816f[i2] > 2147483647L) {
                    throw new org.threeten.bp.b("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.f10823g = i4;
            this.h = bVar;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.i
        long a(org.threeten.bp.format.d dVar, long j) {
            long abs = Math.abs(j);
            int i2 = this.f10823g;
            if (this.h != null) {
                i2 = org.threeten.bp.chrono.h.h(dVar.d()).b(this.h).get(this.a);
            }
            if (j >= i2) {
                int[] iArr = i.f10816f;
                int i3 = this.b;
                if (j < i2 + iArr[i3]) {
                    return abs % iArr[i3];
                }
            }
            return abs % i.f10816f[this.f10817c];
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.i
        i b() {
            return this.f10819e == -1 ? this : new l(this.a, this.b, this.f10817c, this.f10823g, this.h, -1);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.i
        i c(int i2) {
            return new l(this.a, this.b, this.f10817c, this.f10823g, this.h, this.f10819e + i2);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.i
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("ReducedValue(");
            M.append(this.a);
            M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M.append(this.b);
            M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M.append(this.f10817c);
            M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            Object obj = this.h;
            if (obj == null) {
                obj = Integer.valueOf(this.f10823g);
            }
            M.append(obj);
            M.append(")");
            return M.toString();
        }

        private l(org.threeten.bp.temporal.e eVar, int i2, int i3, int i4, org.threeten.bp.chrono.b bVar, int i5) {
            super(eVar, i2, i3, SignStyle.NOT_NEGATIVE, i5, null);
            this.f10823g = i4;
            this.h = bVar;
        }
    }
}
