package com.bytedance.frameworks.baselib.network.dispatcher;

/* loaded from: classes.dex */
public class f {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f5049c;

    /* renamed from: d, reason: collision with root package name */
    private int f5050d;

    /* renamed from: e, reason: collision with root package name */
    private long f5051e;

    /* renamed from: f, reason: collision with root package name */
    private long f5052f;

    /* renamed from: g, reason: collision with root package name */
    private long f5053g;
    private boolean h;

    public static final class b {
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f5054c;

        /* renamed from: d, reason: collision with root package name */
        private int f5055d;

        /* renamed from: e, reason: collision with root package name */
        private long f5056e;

        /* renamed from: f, reason: collision with root package name */
        private long f5057f;

        /* renamed from: g, reason: collision with root package name */
        private long f5058g;
        private boolean h = true;

        public f i() {
            return new f(this, null);
        }

        public b j(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("Api keep alive time must set > 0 when allow core thread timeout.");
            }
            this.f5056e = j;
            return this;
        }

        public b k(int i, int i2) {
            if (i2 <= 0 || i <= 0) {
                throw new IllegalArgumentException("Api thread size must set > 0.");
            }
            if (i > i2) {
                throw new IllegalArgumentException("Core thread size must set less equal than Max thread size.");
            }
            this.a = i2;
            this.f5054c = i;
            return this;
        }

        public b l(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("Download keep alive time must set > 0 when allow core thread timeout.");
            }
            this.f5057f = j;
            return this;
        }

        public b m(int i, int i2) {
            if (i2 <= 0 || i <= 0) {
                throw new IllegalArgumentException("Download thread size must set > 0.");
            }
            if (i > i2) {
                throw new IllegalArgumentException("Core thread size must set less equal than Max thread size.");
            }
            this.b = i2;
            this.f5055d = i;
            return this;
        }

        public b n(boolean z) {
            this.h = z;
            return this;
        }

        public b o(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("Immediate keep alive time must set > 0 when allow core thread timeout.");
            }
            this.f5058g = j;
            return this;
        }
    }

    f(b bVar, a aVar) {
        this.a = 8;
        this.b = 8;
        this.f5049c = 8;
        this.f5050d = 8;
        this.f5051e = 10L;
        this.f5052f = 30L;
        this.f5053g = 10L;
        this.h = true;
        if (bVar.a > 0) {
            this.f5049c = bVar.a;
        }
        if (bVar.b > 0) {
            this.f5050d = bVar.b;
        }
        if (bVar.f5054c > 0) {
            this.a = bVar.f5054c;
        }
        if (bVar.f5055d > 0) {
            this.b = bVar.f5055d;
        }
        if (bVar.f5056e > 0) {
            this.f5052f = bVar.f5056e;
        }
        if (bVar.f5057f > 0) {
            this.f5053g = bVar.f5057f;
        }
        if (bVar.f5058g > 0) {
            this.f5051e = bVar.f5058g;
        }
        this.h = bVar.h;
    }

    public long a() {
        return this.f5052f;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return 1;
    }

    public long e() {
        return this.f5053g;
    }

    public long f() {
        return this.f5051e;
    }

    public long g() {
        return 10L;
    }

    public int h() {
        return this.f5049c;
    }

    public int i() {
        return this.f5050d;
    }

    public boolean j() {
        return this.h;
    }

    public void k(boolean z) {
        this.h = z;
    }
}
