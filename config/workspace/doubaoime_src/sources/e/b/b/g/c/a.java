package e.b.b.g.c;

/* loaded from: classes.dex */
public class a {
    private long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9449c;

    public a(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.f9449c = z;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.f9449c;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("FdConfig{fdCountThreshold=");
        M.append(this.a);
        M.append(", collectIntervalMs=");
        M.append(this.b);
        M.append(", isSampled=");
        return e.a.a.a.a.L(M, this.f9449c, '}');
    }
}
