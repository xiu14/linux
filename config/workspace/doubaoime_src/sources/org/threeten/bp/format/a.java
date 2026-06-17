package org.threeten.bp.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.threeten.bp.chrono.h;
import org.threeten.bp.chrono.l;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.k;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;

/* loaded from: classes2.dex */
public final class a {
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    private final DateTimeFormatterBuilder.d a;
    private final Locale b;

    /* renamed from: c, reason: collision with root package name */
    private final f f10826c;

    /* renamed from: d, reason: collision with root package name */
    private final ResolverStyle f10827d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<org.threeten.bp.temporal.e> f10828e;

    /* renamed from: f, reason: collision with root package name */
    private final h f10829f;

    /* renamed from: g, reason: collision with root package name */
    private final k f10830g;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder p = dateTimeFormatterBuilder.p(chronoField, 4, 10, signStyle);
        p.e('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        p.o(chronoField2, 2);
        p.e('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        p.o(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        a y = p.y(resolverStyle);
        l lVar = l.f10784c;
        a g2 = y.g(lVar);
        h = g2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder2.t();
        dateTimeFormatterBuilder2.a(g2);
        dateTimeFormatterBuilder2.i();
        dateTimeFormatterBuilder2.y(resolverStyle).g(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.t();
        dateTimeFormatterBuilder3.a(g2);
        dateTimeFormatterBuilder3.s();
        dateTimeFormatterBuilder3.i();
        dateTimeFormatterBuilder3.y(resolverStyle).g(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.o(chronoField4, 2);
        dateTimeFormatterBuilder4.e(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.o(chronoField5, 2);
        dateTimeFormatterBuilder4.s();
        dateTimeFormatterBuilder4.e(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.o(chronoField6, 2);
        dateTimeFormatterBuilder4.s();
        dateTimeFormatterBuilder4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        a y2 = dateTimeFormatterBuilder4.y(resolverStyle);
        i = y2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.t();
        dateTimeFormatterBuilder5.a(y2);
        dateTimeFormatterBuilder5.i();
        dateTimeFormatterBuilder5.y(resolverStyle);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.t();
        dateTimeFormatterBuilder6.a(y2);
        dateTimeFormatterBuilder6.s();
        dateTimeFormatterBuilder6.i();
        dateTimeFormatterBuilder6.y(resolverStyle);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.t();
        dateTimeFormatterBuilder7.a(g2);
        dateTimeFormatterBuilder7.e('T');
        dateTimeFormatterBuilder7.a(y2);
        a g3 = dateTimeFormatterBuilder7.y(resolverStyle).g(lVar);
        j = g3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.t();
        dateTimeFormatterBuilder8.a(g3);
        dateTimeFormatterBuilder8.i();
        a g4 = dateTimeFormatterBuilder8.y(resolverStyle).g(lVar);
        k = g4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(g4);
        dateTimeFormatterBuilder9.s();
        dateTimeFormatterBuilder9.e('[');
        dateTimeFormatterBuilder9.u();
        dateTimeFormatterBuilder9.q();
        dateTimeFormatterBuilder9.e(']');
        dateTimeFormatterBuilder9.y(resolverStyle).g(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(g3);
        dateTimeFormatterBuilder10.s();
        dateTimeFormatterBuilder10.i();
        dateTimeFormatterBuilder10.s();
        dateTimeFormatterBuilder10.e('[');
        dateTimeFormatterBuilder10.u();
        dateTimeFormatterBuilder10.q();
        dateTimeFormatterBuilder10.e(']');
        dateTimeFormatterBuilder10.y(resolverStyle).g(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.t();
        DateTimeFormatterBuilder p2 = dateTimeFormatterBuilder11.p(chronoField, 4, 10, signStyle);
        p2.e('-');
        p2.o(ChronoField.DAY_OF_YEAR, 3);
        p2.s();
        p2.i();
        p2.y(resolverStyle).g(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.t();
        DateTimeFormatterBuilder p3 = dateTimeFormatterBuilder12.p(IsoFields.f10856c, 4, 10, signStyle);
        p3.f("-W");
        p3.o(IsoFields.b, 2);
        p3.e('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        p3.o(chronoField7, 1);
        p3.s();
        p3.i();
        p3.y(resolverStyle).g(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.t();
        dateTimeFormatterBuilder13.c();
        l = dateTimeFormatterBuilder13.y(resolverStyle);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.t();
        dateTimeFormatterBuilder14.o(chronoField, 4);
        dateTimeFormatterBuilder14.o(chronoField2, 2);
        dateTimeFormatterBuilder14.o(chronoField3, 2);
        dateTimeFormatterBuilder14.s();
        dateTimeFormatterBuilder14.h("+HHMMss", "Z");
        dateTimeFormatterBuilder14.y(resolverStyle).g(lVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.t();
        dateTimeFormatterBuilder15.v();
        dateTimeFormatterBuilder15.s();
        dateTimeFormatterBuilder15.k(chronoField7, hashMap);
        dateTimeFormatterBuilder15.f(", ");
        dateTimeFormatterBuilder15.r();
        DateTimeFormatterBuilder p4 = dateTimeFormatterBuilder15.p(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE);
        p4.e(' ');
        p4.k(chronoField2, hashMap2);
        p4.e(' ');
        p4.o(chronoField, 4);
        p4.e(' ');
        p4.o(chronoField4, 2);
        p4.e(':');
        p4.o(chronoField5, 2);
        p4.s();
        p4.e(':');
        p4.o(chronoField6, 2);
        p4.r();
        p4.e(' ');
        p4.h("+HHMM", "GMT");
        p4.y(ResolverStyle.SMART).g(lVar);
    }

    a(DateTimeFormatterBuilder.d dVar, Locale locale, f fVar, ResolverStyle resolverStyle, Set<org.threeten.bp.temporal.e> set, h hVar, k kVar) {
        org.apache.http.conn.ssl.d.k(dVar, "printerParser");
        this.a = dVar;
        org.apache.http.conn.ssl.d.k(locale, "locale");
        this.b = locale;
        org.apache.http.conn.ssl.d.k(fVar, "decimalStyle");
        this.f10826c = fVar;
        org.apache.http.conn.ssl.d.k(resolverStyle, "resolverStyle");
        this.f10827d = resolverStyle;
        this.f10828e = set;
        this.f10829f = hVar;
        this.f10830g = kVar;
    }

    public String a(org.threeten.bp.temporal.b bVar) {
        StringBuilder sb = new StringBuilder(32);
        org.apache.http.conn.ssl.d.k(bVar, "temporal");
        org.apache.http.conn.ssl.d.k(sb, "appendable");
        try {
            this.a.print(new d(bVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new org.threeten.bp.b(e2.getMessage(), e2);
        }
    }

    public h b() {
        return this.f10829f;
    }

    public f c() {
        return this.f10826c;
    }

    public Locale d() {
        return this.b;
    }

    public k e() {
        return this.f10830g;
    }

    DateTimeFormatterBuilder.d f(boolean z) {
        return this.a.a(z);
    }

    public a g(h hVar) {
        return org.apache.http.conn.ssl.d.c(this.f10829f, hVar) ? this : new a(this.a, this.b, this.f10826c, this.f10827d, this.f10828e, hVar, this.f10830g);
    }

    public a h(ResolverStyle resolverStyle) {
        org.apache.http.conn.ssl.d.k(resolverStyle, "resolverStyle");
        return org.apache.http.conn.ssl.d.c(this.f10827d, resolverStyle) ? this : new a(this.a, this.b, this.f10826c, resolverStyle, this.f10828e, this.f10829f, this.f10830g);
    }

    public String toString() {
        String dVar = this.a.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
