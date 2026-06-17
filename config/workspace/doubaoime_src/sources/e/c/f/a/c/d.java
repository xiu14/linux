package e.c.f.a.c;

/* loaded from: classes2.dex */
public class d implements b {
    private final e.c.f.a.a.a a;
    private long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f9829c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f9830d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f9831e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f9832f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f9833g;

    public d(e.c.f.a.a.a aVar, int i) {
        this.a = aVar;
        this.f9833g = i;
    }

    @Override // e.c.f.a.c.b
    public long a(long j) {
        if (e() == 0) {
            return -1L;
        }
        if (!(this.a.c() == 0) && this.f9829c >= this.a.c()) {
            return -1L;
        }
        long f2 = this.a.f(this.f9830d);
        long j2 = this.f9831e + f2;
        return j2 >= j ? j2 : j + f2;
    }

    @Override // e.c.f.a.c.b
    public b b(b bVar) {
        if (!(bVar instanceof d)) {
            return null;
        }
        d dVar = (d) bVar;
        d dVar2 = new d(dVar.a, dVar.f9833g);
        dVar2.f9830d = this.f9830d;
        dVar2.f9832f = this.f9832f;
        dVar2.f9829c = this.f9829c;
        dVar2.f9831e = this.f9831e;
        return dVar2;
    }

    @Override // e.c.f.a.c.b
    public int c(long j, long j2) {
        long e2 = e();
        long j3 = 0;
        if (e2 == 0) {
            return -1;
        }
        int i = 0;
        if (!(this.a.c() == 0) && j / e2 >= this.a.c()) {
            return -1;
        }
        int i2 = 0;
        do {
            j3 += this.a.f(i2);
            i2++;
        } while (j % e2 >= j3);
        int i3 = i2 - 1;
        if (this.f9830d == -1 || j2 != this.f9832f) {
            this.f9831e = j;
            this.f9832f = j;
            this.f9830d = i3;
            this.f9829c = 0;
            return i3;
        }
        this.f9832f = j;
        if (this.f9831e + this.a.f(r3) > j) {
            return this.f9830d;
        }
        this.f9831e = j;
        int i4 = this.f9830d + 1;
        if (i4 >= this.a.a()) {
            int i5 = this.f9833g;
            if (i5 == 0 || i5 == 3) {
                this.f9829c++;
            } else {
                i = i4 - 1;
            }
        } else {
            i = i4;
        }
        if (!this.a.b(i)) {
            return this.f9830d;
        }
        this.f9830d = i;
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
