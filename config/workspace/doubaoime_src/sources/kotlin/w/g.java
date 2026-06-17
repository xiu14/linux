package kotlin.w;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<java.lang.Long>] */
/* loaded from: classes2.dex */
public final class g extends e implements a<Long> {
    static {
        new g(1L, 0L);
    }

    public g(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean c(long j) {
        return a() <= j && j <= b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (a() != gVar.a() || b() != gVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.w.a
    public Long getEndInclusive() {
        return Long.valueOf(b());
    }

    @Override // kotlin.w.a
    public Long getStart() {
        return Long.valueOf(a());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (a() ^ (a() >>> 32))) + (b() ^ (b() >>> 32)));
    }

    public boolean isEmpty() {
        return a() > b();
    }

    public String toString() {
        return a() + ".." + b();
    }
}
