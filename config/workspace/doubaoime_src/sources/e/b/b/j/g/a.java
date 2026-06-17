package e.b.b.j.g;

/* loaded from: classes.dex */
public final class a {
    private long a;
    private double b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9476c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9477d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9478e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9479f;

    public a(long j, double d2, boolean z, boolean z2, boolean z3, boolean z4) {
        if (j <= 0) {
            this.a = 120L;
        } else {
            this.a = j;
        }
        this.b = d2;
        this.f9479f = z4;
        this.f9476c = z;
        this.f9477d = z2;
        this.f9478e = z3;
    }

    public boolean a() {
        return this.f9479f;
    }

    public boolean b() {
        return this.f9477d;
    }

    public boolean c() {
        return this.f9476c;
    }

    public boolean d() {
        return this.f9478e;
    }

    public long e() {
        return this.a;
    }

    public double f() {
        double d2 = this.b;
        if (d2 > 0.5d) {
            return d2;
        }
        return 0.8d;
    }

    public void g(boolean z) {
        this.f9477d = z;
    }

    public void h(boolean z) {
        this.f9476c = z;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MemoryConfig{memoryCollectionInterval=");
        M.append(this.a);
        M.append(", memoryTopCheckThreshold=");
        M.append(this.b);
        M.append(", isStopWhenBackground=");
        M.append(this.f9476c);
        M.append(", isRealTimeMemEnable=");
        M.append(this.f9477d);
        M.append(", isUploadEnable=");
        M.append(this.f9478e);
        M.append(", isApm6SampleEnable=");
        return e.a.a.a.a.L(M, this.f9479f, '}');
    }
}
