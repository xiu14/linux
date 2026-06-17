package org.threeten.bp.temporal;

import androidx.core.location.LocationRequestCompat;

/* loaded from: classes2.dex */
public enum ChronoUnit implements h {
    NANOS("Nanos", org.threeten.bp.c.c(1)),
    MICROS("Micros", org.threeten.bp.c.c(1000)),
    MILLIS("Millis", org.threeten.bp.c.c(1000000)),
    SECONDS("Seconds", org.threeten.bp.c.d(1)),
    MINUTES("Minutes", org.threeten.bp.c.d(60)),
    HOURS("Hours", org.threeten.bp.c.d(3600)),
    HALF_DAYS("HalfDays", org.threeten.bp.c.d(43200)),
    DAYS("Days", org.threeten.bp.c.d(86400)),
    WEEKS("Weeks", org.threeten.bp.c.d(604800)),
    MONTHS("Months", org.threeten.bp.c.d(2629746)),
    YEARS("Years", org.threeten.bp.c.d(31556952)),
    DECADES("Decades", org.threeten.bp.c.d(315569520)),
    CENTURIES("Centuries", org.threeten.bp.c.d(3155695200L)),
    MILLENNIA("Millennia", org.threeten.bp.c.d(31556952000L)),
    ERAS("Eras", org.threeten.bp.c.d(31556952000000000L)),
    FOREVER("Forever", org.threeten.bp.c.e(LocationRequestCompat.PASSIVE_INTERVAL, 999999999));

    private final org.threeten.bp.c duration;
    private final String name;

    ChronoUnit(String str, org.threeten.bp.c cVar) {
        this.name = str;
        this.duration = cVar;
    }

    @Override // org.threeten.bp.temporal.h
    public <R extends a> R addTo(R r, long j) {
        return (R) r.d(j, this);
    }

    @Override // org.threeten.bp.temporal.h
    public long between(a aVar, a aVar2) {
        return aVar.e(aVar2, this);
    }

    public org.threeten.bp.c getDuration() {
        return this.duration;
    }

    @Override // org.threeten.bp.temporal.h
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    public boolean isSupportedBy(a aVar) {
        if (this == FOREVER) {
            return false;
        }
        if (aVar instanceof org.threeten.bp.chrono.b) {
            return isDateBased();
        }
        if ((aVar instanceof org.threeten.bp.chrono.c) || (aVar instanceof org.threeten.bp.chrono.f)) {
            return true;
        }
        try {
            aVar.d(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                aVar.d(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
