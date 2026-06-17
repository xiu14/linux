package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;
import org.threeten.bp.format.ResolverStyle;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
final class JulianFields$Field implements e {
    private static final /* synthetic */ JulianFields$Field[] $VALUES;
    public static final JulianFields$Field JULIAN_DAY;
    public static final JulianFields$Field MODIFIED_JULIAN_DAY;
    public static final JulianFields$Field RATA_DIE;
    private final h baseUnit;
    private final String name;
    private final long offset;
    private final j range;
    private final h rangeUnit;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        JulianFields$Field julianFields$Field = new JulianFields$Field("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = julianFields$Field;
        JulianFields$Field julianFields$Field2 = new JulianFields$Field("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = julianFields$Field2;
        JulianFields$Field julianFields$Field3 = new JulianFields$Field("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = julianFields$Field3;
        $VALUES = new JulianFields$Field[]{julianFields$Field, julianFields$Field2, julianFields$Field3};
    }

    private JulianFields$Field(String str, int i, String str2, h hVar, h hVar2, long j) {
        this.name = str2;
        this.baseUnit = hVar;
        this.rangeUnit = hVar2;
        this.range = j.g((-365243219162L) + j, 365241780471L + j);
        this.offset = j;
    }

    public static JulianFields$Field valueOf(String str) {
        return (JulianFields$Field) Enum.valueOf(JulianFields$Field.class, str);
    }

    public static JulianFields$Field[] values() {
        return (JulianFields$Field[]) $VALUES.clone();
    }

    @Override // org.threeten.bp.temporal.e
    public <R extends a> R adjustInto(R r, long j) {
        if (range().f(j)) {
            return (R) r.a(ChronoField.EPOCH_DAY, org.apache.http.conn.ssl.d.p(j, this.offset));
        }
        StringBuilder M = e.a.a.a.a.M("Invalid value: ");
        M.append(this.name);
        M.append(" ");
        M.append(j);
        throw new org.threeten.bp.b(M.toString());
    }

    public h getBaseUnit() {
        return this.baseUnit;
    }

    public String getDisplayName(Locale locale) {
        org.apache.http.conn.ssl.d.k(locale, "locale");
        return toString();
    }

    @Override // org.threeten.bp.temporal.e
    public long getFrom(b bVar) {
        return bVar.getLong(ChronoField.EPOCH_DAY) + this.offset;
    }

    public h getRangeUnit() {
        return this.rangeUnit;
    }

    @Override // org.threeten.bp.temporal.e
    public boolean isDateBased() {
        return true;
    }

    @Override // org.threeten.bp.temporal.e
    public boolean isSupportedBy(b bVar) {
        return bVar.isSupported(ChronoField.EPOCH_DAY);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean isTimeBased() {
        return false;
    }

    @Override // org.threeten.bp.temporal.e
    public j range() {
        return this.range;
    }

    @Override // org.threeten.bp.temporal.e
    public j rangeRefinedBy(b bVar) {
        if (isSupportedBy(bVar)) {
            return range();
        }
        throw new i("Unsupported field: " + this);
    }

    public b resolve(Map<e, Long> map, b bVar, ResolverStyle resolverStyle) {
        return org.threeten.bp.chrono.h.h(bVar).c(org.apache.http.conn.ssl.d.p(map.remove(this).longValue(), this.offset));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
