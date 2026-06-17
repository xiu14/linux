package org.threeten.bp.temporal;

import org.threeten.bp.DayOfWeek;

/* loaded from: classes2.dex */
public final class d {

    private static final class b implements c {
        private final int a;
        private final int b;

        b(int i, DayOfWeek dayOfWeek, a aVar) {
            org.apache.http.conn.ssl.d.k(dayOfWeek, "dayOfWeek");
            this.a = i;
            this.b = dayOfWeek.getValue();
        }

        @Override // org.threeten.bp.temporal.c
        public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
            int i = aVar.get(ChronoField.DAY_OF_WEEK);
            int i2 = this.a;
            if (i2 < 2 && i == this.b) {
                return aVar;
            }
            if ((i2 & 1) == 0) {
                return aVar.d(i - this.b >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            }
            return aVar.c(this.b - i >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }

    public static c a(DayOfWeek dayOfWeek) {
        return new b(0, dayOfWeek, null);
    }

    public static c b(DayOfWeek dayOfWeek) {
        return new b(1, dayOfWeek, null);
    }
}
