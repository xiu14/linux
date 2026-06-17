package e.b.b.j.f;

/* loaded from: classes.dex */
public class a {
    public long a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f9471c;

    /* renamed from: d, reason: collision with root package name */
    public long f9472d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9473e;

    /* renamed from: f, reason: collision with root package name */
    public long f9474f;

    /* renamed from: g, reason: collision with root package name */
    public long f9475g;
    public long h;
    public long i;
    public long j;
    public long k;
    public boolean l;

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MemoryCollectInfo{gcCount=");
        M.append(this.a);
        M.append(", gcTime=");
        M.append(this.b);
        M.append(", blockingGcCount=");
        M.append(this.f9471c);
        M.append(", blockingGcTime=");
        M.append(this.f9472d);
        M.append(", background=");
        M.append(this.f9473e);
        M.append(", nativePss=");
        M.append(this.f9474f);
        M.append(", totalPss=");
        M.append(this.f9475g);
        M.append(", javaUsedMemory=");
        M.append(this.h);
        M.append(", dalvikUsedSize=");
        M.append(this.i);
        M.append(", graphics=");
        M.append(this.j);
        M.append(", vmSize=");
        M.append(this.k);
        M.append(", isMemoryReachTop=");
        return e.a.a.a.a.L(M, this.l, '}');
    }
}
