package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import java.util.Objects;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f2, @NonNull String str) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException(e.a.a.a.a.s(str, " must not be NaN"));
        }
        if (Float.isInfinite(f2)) {
            throw new IllegalArgumentException(e.a.a.a.a.s(str, " must not be infinite"));
        }
        return f2;
    }

    public static int checkArgumentInRange(int i, int i2, int i3, @NonNull String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i, @Nullable String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        StringBuilder M = e.a.a.a.a.M("Requested flags 0x");
        M.append(Integer.toHexString(i));
        M.append(", but only 0x");
        M.append(Integer.toHexString(i2));
        M.append(" are allowed");
        throw new IllegalArgumentException(M.toString());
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void checkState(boolean z, @Nullable String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException();
        }
        return t;
    }

    public static void checkArgument(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z) {
        checkState(z, null);
    }

    public static void checkArgument(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t, @NonNull Object obj) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t;
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t, @NonNull String str, @NonNull Object... objArr) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t;
    }

    public static long checkArgumentInRange(long j, long j2, long j3, @NonNull String str) {
        if (j < j2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
        if (j <= j3) {
            return j;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static float checkArgumentInRange(float f2, float f3, float f4, @NonNull String str) {
        if (f2 < f3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f3), Float.valueOf(f4)));
        }
        if (f2 <= f4) {
            return f2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f3), Float.valueOf(f4)));
    }

    public static double checkArgumentInRange(double d2, double d3, double d4, @NonNull String str) {
        if (d2 < d3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d3), Double.valueOf(d4)));
        }
        if (d2 <= d4) {
            return d2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d3), Double.valueOf(d4)));
    }
}
