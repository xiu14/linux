package kotlin.internal;

/* loaded from: classes2.dex */
public final class c {
    public static final int a(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - c(c(i2, i3) - c(i, i3), i3);
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i4 = -i3;
        return i2 + c(c(i, i4) - c(i2, i4), i4);
    }

    public static final long b(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - d(d(j2, j3) - d(j, j3), j3);
        }
        if (j3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (j <= j2) {
            return j2;
        }
        long j4 = -j3;
        return j2 + d(d(j, j4) - d(j2, j4), j4);
    }

    private static final int c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long d(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
