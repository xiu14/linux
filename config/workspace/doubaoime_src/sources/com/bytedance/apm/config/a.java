package com.bytedance.apm.config;

/* loaded from: classes.dex */
public class a {
    private boolean a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3375c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3376d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.apm.B.j.f f3377e;

    public static final class b {
        private boolean a = false;
        private long b = com.heytap.mcssdk.constant.a.f6886d;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3378c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3379d = true;

        /* renamed from: e, reason: collision with root package name */
        private com.bytedance.apm.B.j.f f3380e;

        b(C0114a c0114a) {
        }

        public b f(com.bytedance.apm.B.j.f fVar) {
            this.f3380e = fVar;
            return this;
        }

        public b g(boolean z) {
            this.a = z;
            return this;
        }

        public b h(boolean z) {
            this.f3378c = z;
            return this;
        }

        public b i(boolean z) {
            this.f3379d = z;
            return this;
        }

        public b j(long j) {
            this.b = j;
            return this;
        }
    }

    public a(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f3375c = bVar.f3378c;
        this.f3376d = bVar.f3379d;
        this.f3377e = bVar.f3380e;
    }

    public static b a() {
        return new b(null);
    }

    public com.bytedance.apm.B.j.f b() {
        return this.f3377e;
    }

    public long c() {
        return this.b;
    }

    public boolean d() {
        return this.a;
    }

    public boolean e() {
        return this.f3375c;
    }

    public boolean f() {
        return this.f3376d;
    }
}
