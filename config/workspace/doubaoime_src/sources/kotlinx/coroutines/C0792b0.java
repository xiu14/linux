package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;

/* renamed from: kotlinx.coroutines.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0792b0 {
    private static final kotlinx.coroutines.N0.x a = new kotlinx.coroutines.N0.x("REMOVED_TASK");
    private static final kotlinx.coroutines.N0.x b = new kotlinx.coroutines.N0.x("CLOSED_EMPTY");

    public static final long c(long j) {
        if (j <= 0) {
            return 0L;
        }
        return j >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j;
    }
}
