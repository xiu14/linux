package com.bytedance.rpc.transport;

import e.b.l.e;

/* loaded from: classes2.dex */
public class g {
    private String a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6060c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6061d;

    /* renamed from: e, reason: collision with root package name */
    private long f6062e;

    /* renamed from: f, reason: collision with root package name */
    private long f6063f;

    /* renamed from: g, reason: collision with root package name */
    private long f6064g;
    private e.b h;

    public static class b {
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private int f6065c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6066d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f6067e;

        /* renamed from: f, reason: collision with root package name */
        private long f6068f;

        /* renamed from: g, reason: collision with root package name */
        private long f6069g;
        private long h;
        private e.b i = new e.b.l.e().i();

        b(int i, a aVar) {
            this.f6065c = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.bytedance.rpc.transport.g h() {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.rpc.transport.g.b.h():com.bytedance.rpc.transport.g");
        }

        public b i(String str) {
            this.b = str;
            return this;
        }

        public b j(long j) {
            this.h = j;
            return this;
        }

        public b k(boolean z) {
            this.f6066d = z;
            return this;
        }

        public b l(boolean z) {
            this.f6067e = z;
            return this;
        }

        public b m(String str) {
            this.a = str;
            return this;
        }

        public b n(long j) {
            this.f6068f = j;
            return this;
        }

        public b o(e.b bVar) {
            this.i = bVar;
            return this;
        }

        public b p(long j) {
            this.f6069g = j;
            return this;
        }
    }

    g(b bVar, String str) {
        this.a = str;
        this.b = bVar.f6065c;
        this.f6060c = bVar.f6066d;
        this.f6061d = bVar.f6067e;
        this.f6064g = bVar.h;
        this.f6062e = bVar.f6068f;
        this.f6063f = bVar.f6069g;
        this.h = bVar.i;
    }

    public static b i(int i) {
        return new b(i, null);
    }

    public long a() {
        return this.f6064g;
    }

    public long b() {
        return this.f6062e;
    }

    public e.b c() {
        return this.h;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public long f() {
        return this.f6063f;
    }

    public boolean g() {
        return this.f6061d;
    }

    public boolean h() {
        return this.f6060c;
    }
}
