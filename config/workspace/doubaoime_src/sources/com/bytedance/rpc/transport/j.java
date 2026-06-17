package com.bytedance.rpc.transport;

import java.util.Map;

/* loaded from: classes2.dex */
public class j {
    Object a;
    Map<String, String> b;

    /* renamed from: c, reason: collision with root package name */
    e.b.l.f f6074c;

    public static class b {
        int a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f6075c;

        /* renamed from: d, reason: collision with root package name */
        long f6076d;

        /* renamed from: e, reason: collision with root package name */
        long f6077e;

        /* renamed from: f, reason: collision with root package name */
        int f6078f;

        /* renamed from: g, reason: collision with root package name */
        String f6079g;
        String h;
        long i;
        Object j;
        Map<String, String> k;
        e.b.l.f l;

        public j a() {
            return new j(this, null);
        }

        public b b(long j) {
            this.i = j;
            return this;
        }

        public b c(String str) {
            this.h = str;
            return this;
        }

        public b d(Map<String, String> map) {
            this.k = map;
            return this;
        }

        public b e(int i) {
            this.f6078f = i;
            return this;
        }

        public b f(String str) {
            this.f6079g = str;
            return this;
        }

        public b g(long j) {
            this.f6077e = j;
            return this;
        }

        public b h(int i) {
            this.a = i;
            return this;
        }

        public b i(long j) {
            this.b = j;
            return this;
        }

        public b j(long j) {
            this.f6076d = j;
            return this;
        }

        public b k(long j) {
            this.f6075c = j;
            return this;
        }

        public b l(Object obj) {
            if (!(obj instanceof Throwable)) {
                this.j = obj;
            } else if (obj instanceof e.b.l.f) {
                e.b.l.f fVar = (e.b.l.f) obj;
                this.l = fVar;
                if (fVar.v()) {
                    this.f6078f = this.l.p();
                    this.f6079g = this.l.getMessage();
                }
            } else {
                this.l = e.b.l.f.o((Throwable) obj).b();
            }
            return this;
        }
    }

    j(b bVar, a aVar) {
        this.a = bVar.j;
        this.f6074c = bVar.l;
        this.b = bVar.k;
    }

    public e.b.l.f a() {
        return this.f6074c;
    }

    public Map<String, String> b() {
        return this.b;
    }

    public boolean c() {
        return this.f6074c == null;
    }
}
