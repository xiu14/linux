package org.threeten.bp.chrono;

import java.util.Locale;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public enum IsoEra implements i {
    BCE,
    CE;

    public static IsoEra of(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        throw new org.threeten.bp.b(e.a.a.a.a.j("Invalid era: ", i));
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.ERA, getValue());
    }

    @Override // org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        return eVar == ChronoField.ERA ? getValue() : range(eVar).a(getLong(eVar), eVar);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.l(ChronoField.ERA, textStyle);
        return dateTimeFormatterBuilder.x(locale).a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.ERA) {
            return getValue();
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.getFrom(this);
    }

    public int getValue() {
        return ordinal();
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar == ChronoField.ERA : eVar != null && eVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.e()) {
            return (R) ChronoUnit.ERAS;
        }
        if (gVar == org.threeten.bp.temporal.f.a() || gVar == org.threeten.bp.temporal.f.f() || gVar == org.threeten.bp.temporal.f.g() || gVar == org.threeten.bp.temporal.f.d() || gVar == org.threeten.bp.temporal.f.b() || gVar == org.threeten.bp.temporal.f.c()) {
            return null;
        }
        return gVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.ERA) {
            return eVar.range();
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.rangeRefinedBy(this);
    }
}
