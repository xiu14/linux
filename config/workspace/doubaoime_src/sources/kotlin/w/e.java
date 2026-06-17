package kotlin.w;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class e implements Iterable<Long>, kotlin.s.c.E.a {
    private final long a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10141c;

    public e(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = j;
        this.b = kotlin.internal.c.b(j, j2, j3);
        this.f10141c = j3;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new f(this.a, this.b, this.f10141c);
    }
}
