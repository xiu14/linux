package kotlin.time;

import androidx.core.location.LocationRequestCompat;
import com.bytedance.crash.dumper.Scraps;
import java.util.Objects;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a implements Comparable<a> {
    public static final C0473a a = new C0473a(null);
    private static final long b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f10134c;

    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0473a {
        public C0473a(g gVar) {
        }
    }

    static {
        int i = b.a;
        b = LocationRequestCompat.PASSIVE_INTERVAL;
        f10134c = -9223372036854775805L;
    }

    public static int a(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return c(j) ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final boolean b(long j) {
        return j == b || j == f10134c;
    }

    public static final boolean c(long j) {
        return j < 0;
    }

    public static final long d(long j, DurationUnit durationUnit) {
        l.f(durationUnit, Scraps.INNER_UNIT);
        if (j == b) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        if (j == f10134c) {
            return Long.MIN_VALUE;
        }
        return c.a(j >> 1, (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS, durationUnit);
    }

    @Override // java.lang.Comparable
    public int compareTo(a aVar) {
        Objects.requireNonNull(aVar);
        return a(0L, 0L);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        Objects.requireNonNull((a) obj);
        return true;
    }

    public int hashCode() {
        return (int) 0;
    }

    public String toString() {
        return "0s";
    }
}
