package kotlin.time;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c {
    public static final long a(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        l.f(durationUnit, "sourceUnit");
        l.f(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        l.f(durationUnit, "sourceUnit");
        l.f(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }
}
