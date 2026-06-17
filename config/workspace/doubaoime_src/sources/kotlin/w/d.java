package kotlin.w;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<java.lang.Integer>] */
/* loaded from: classes2.dex */
public final class d extends b implements a<Integer> {

    /* renamed from: d, reason: collision with root package name */
    public static final d f10139d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final d f10140e = new d(1, 0);

    public d(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // kotlin.w.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (a() != dVar.a() || b() != dVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean f(int i) {
        return a() <= i && i <= b();
    }

    @Override // kotlin.w.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(b());
    }

    @Override // kotlin.w.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(a());
    }

    @Override // kotlin.w.b
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // kotlin.w.b
    public boolean isEmpty() {
        return a() > b();
    }

    @Override // kotlin.w.b
    public String toString() {
        return a() + ".." + b();
    }
}
