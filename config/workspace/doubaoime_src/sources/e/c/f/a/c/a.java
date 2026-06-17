package e.c.f.a.c;

/* loaded from: classes2.dex */
public class a implements b {
    private final e.c.f.a.a.a a;
    private long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f9824c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f9825d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f9826e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f9827f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f9828g;

    public a(e.c.f.a.a.a aVar, int i) {
        this.a = aVar;
        this.f9828g = i;
    }

    @Override // e.c.f.a.c.b
    public long a(long j) {
        if (e() == 0) {
            return -1L;
        }
        if (!(this.a.c() == 0) && this.f9824c >= this.a.c()) {
            return -1L;
        }
        long f2 = this.a.f(this.f9825d);
        long j2 = this.f9826e + f2;
        return j2 >= j ? j2 : j + f2;
    }

    @Override // e.c.f.a.c.b
    public b b(b bVar) {
        if (!(bVar instanceof a)) {
            return null;
        }
        a aVar = (a) bVar;
        a aVar2 = new a(aVar.a, aVar.f9828g);
        aVar2.f9825d = this.f9825d;
        aVar2.f9827f = this.f9827f;
        aVar2.f9824c = this.f9824c;
        aVar2.f9826e = this.f9826e;
        return aVar2;
    }

    @Override // e.c.f.a.c.b
    public int c(long j, long j2) {
        if (e() == 0) {
            return -1;
        }
        int i = 0;
        if (!(this.a.c() == 0) && this.f9824c >= this.a.c()) {
            return -1;
        }
        if (this.f9825d == -1) {
            this.f9826e = j;
            this.f9827f = j;
            this.f9825d = 0;
            this.f9824c = 0;
            return 0;
        }
        this.f9827f = j;
        if (this.f9826e + this.a.f(r7) > j) {
            return this.f9825d;
        }
        this.f9826e = j;
        int i2 = this.f9825d + 1;
        if (i2 >= this.a.a()) {
            int i3 = this.f9828g;
            if (i3 == 0 || i3 == 3) {
                this.f9824c++;
            } else {
                i = i2 - 1;
            }
        } else {
            i = i2;
        }
        this.f9825d = i;
        return i;
    }

    @Override // e.c.f.a.c.b
    public void d(long j) {
    }

    public long e() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0L;
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            this.b += this.a.f(i);
        }
        return this.b;
    }
}
