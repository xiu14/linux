package okhttp3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class k {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10700c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10701d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10702e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10703f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10704g;
    private final boolean h;
    private final boolean i;

    private k(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.f10700c = j2;
        this.f10701d = str3;
        this.f10702e = str4;
        this.f10703f = z;
        this.f10704g = z2;
        this.i = z3;
        this.h = z4;
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0181, code lost:
    
        if (r4 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        if (r19 <= 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<okhttp3.k> c(okhttp3.t r33, okhttp3.s r34) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.k.c(okhttp3.t, okhttp3.s):java.util.List");
    }

    private static long d(String str, int i, int i2) {
        int a = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else {
                if (i6 == -1) {
                    Pattern pattern = k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            }
            a = a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i6 == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(okhttp3.F.c.o);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public String b() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.a.equals(this.a) && kVar.b.equals(this.b) && kVar.f10701d.equals(this.f10701d) && kVar.f10702e.equals(this.f10702e) && kVar.f10700c == this.f10700c && kVar.f10703f == this.f10703f && kVar.f10704g == this.f10704g && kVar.h == this.h && kVar.i == this.i;
    }

    public int hashCode() {
        int p0 = e.a.a.a.a.p0(this.f10702e, e.a.a.a.a.p0(this.f10701d, e.a.a.a.a.p0(this.b, e.a.a.a.a.p0(this.a, 527, 31), 31), 31), 31);
        long j2 = this.f10700c;
        return ((((((((p0 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f10703f ? 1 : 0)) * 31) + (!this.f10704g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            if (this.f10700c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(okhttp3.F.f.d.a(new Date(this.f10700c)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f10701d);
        }
        sb.append("; path=");
        sb.append(this.f10702e);
        if (this.f10703f) {
            sb.append("; secure");
        }
        if (this.f10704g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
