package org.threeten.bp;

import java.util.Locale;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public enum DayOfWeek implements org.threeten.bp.temporal.b, org.threeten.bp.temporal.c {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static final org.threeten.bp.temporal.g<DayOfWeek> FROM = new org.threeten.bp.temporal.g<DayOfWeek>() { // from class: org.threeten.bp.DayOfWeek.a
        @Override // org.threeten.bp.temporal.g
        public DayOfWeek a(org.threeten.bp.temporal.b bVar) {
            return DayOfWeek.from(bVar);
        }
    };
    private static final DayOfWeek[] ENUMS = values();

    public static DayOfWeek from(org.threeten.bp.temporal.b bVar) {
        if (bVar instanceof DayOfWeek) {
            return (DayOfWeek) bVar;
        }
        try {
            return of(bVar.get(ChronoField.DAY_OF_WEEK));
        } catch (b e2) {
            throw new b("Unable to obtain DayOfWeek from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName(), e2);
        }
    }

    public static DayOfWeek of(int i) {
        if (i < 1 || i > 7) {
            throw new b(e.a.a.a.a.j("Invalid value for DayOfWeek: ", i));
        }
        return ENUMS[i - 1];
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.DAY_OF_WEEK, getValue());
    }

    @Override // org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        return eVar == ChronoField.DAY_OF_WEEK ? getValue() : range(eVar).a(getLong(eVar), eVar);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.l(ChronoField.DAY_OF_WEEK, textStyle);
        return dateTimeFormatterBuilder.x(locale).a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.DAY_OF_WEEK) {
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
        return eVar instanceof ChronoField ? eVar == ChronoField.DAY_OF_WEEK : eVar != null && eVar.isSupportedBy(this);
    }

    public DayOfWeek minus(long j) {
        return plus(-(j % 7));
    }

    public DayOfWeek plus(long j) {
        return ENUMS[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.DAYS;
        }
        if (gVar == org.threeten.bp.temporal.f.b() || gVar == org.threeten.bp.temporal.f.c() || gVar == org.threeten.bp.temporal.f.a() || gVar == org.threeten.bp.temporal.f.f() || gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.d()) {
            return null;
        }
        return gVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.DAY_OF_WEEK) {
            return eVar.range();
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.rangeRefinedBy(this);
    }
}
