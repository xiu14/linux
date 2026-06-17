package org.threeten.bp;

import java.util.Locale;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public enum Month implements org.threeten.bp.temporal.b, org.threeten.bp.temporal.c {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static final org.threeten.bp.temporal.g<Month> FROM = new org.threeten.bp.temporal.g<Month>() { // from class: org.threeten.bp.Month.a
        @Override // org.threeten.bp.temporal.g
        public Month a(org.threeten.bp.temporal.b bVar) {
            return Month.from(bVar);
        }
    };
    private static final Month[] ENUMS = values();

    public static Month from(org.threeten.bp.temporal.b bVar) {
        if (bVar instanceof Month) {
            return (Month) bVar;
        }
        try {
            if (!org.threeten.bp.chrono.l.f10784c.equals(org.threeten.bp.chrono.h.h(bVar))) {
                bVar = e.r(bVar);
            }
            return of(bVar.get(ChronoField.MONTH_OF_YEAR));
        } catch (b e2) {
            throw new b("Unable to obtain Month from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName(), e2);
        }
    }

    public static Month of(int i) {
        if (i < 1 || i > 12) {
            throw new b(e.a.a.a.a.j("Invalid value for MonthOfYear: ", i));
        }
        return ENUMS[i - 1];
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        if (org.threeten.bp.chrono.h.h(aVar).equals(org.threeten.bp.chrono.l.f10784c)) {
            return aVar.a(ChronoField.MONTH_OF_YEAR, getValue());
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    public int firstDayOfYear(boolean z) {
        switch (this) {
            case JANUARY:
                return 1;
            case FEBRUARY:
                return 32;
            case MARCH:
                return (z ? 1 : 0) + 60;
            case APRIL:
                return (z ? 1 : 0) + 91;
            case MAY:
                return (z ? 1 : 0) + 121;
            case JUNE:
                return (z ? 1 : 0) + 152;
            case JULY:
                return (z ? 1 : 0) + 182;
            case AUGUST:
                return (z ? 1 : 0) + 213;
            case SEPTEMBER:
                return (z ? 1 : 0) + 244;
            case OCTOBER:
                return (z ? 1 : 0) + 274;
            case NOVEMBER:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public Month firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    @Override // org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        return eVar == ChronoField.MONTH_OF_YEAR ? getValue() : range(eVar).a(getLong(eVar), eVar);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.l(ChronoField.MONTH_OF_YEAR, textStyle);
        return dateTimeFormatterBuilder.x(locale).a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.getFrom(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar == ChronoField.MONTH_OF_YEAR : eVar != null && eVar.isSupportedBy(this);
    }

    public int length(boolean z) {
        int ordinal = ordinal();
        return ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : z ? 29 : 28;
    }

    public int maxLength() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            return (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31;
        }
        return 29;
    }

    public int minLength() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            return (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31;
        }
        return 28;
    }

    public Month minus(long j) {
        return plus(-(j % 12));
    }

    public Month plus(long j) {
        return ENUMS[((((int) (j % 12)) + 12) + ordinal()) % 12];
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.a()) {
            return (R) org.threeten.bp.chrono.l.f10784c;
        }
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.MONTHS;
        }
        if (gVar == org.threeten.bp.temporal.f.b() || gVar == org.threeten.bp.temporal.f.c() || gVar == org.threeten.bp.temporal.f.f() || gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.d()) {
            return null;
        }
        return gVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.MONTH_OF_YEAR) {
            return eVar.range();
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.rangeRefinedBy(this);
    }
}
