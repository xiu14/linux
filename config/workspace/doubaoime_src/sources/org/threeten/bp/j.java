package org.threeten.bp;

import java.io.Serializable;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class j extends org.threeten.bp.o.c implements org.threeten.bp.temporal.a, org.threeten.bp.temporal.c, Comparable<j>, Serializable {
    static {
        new DateTimeFormatterBuilder().p(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).w();
    }

    public static boolean f(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
