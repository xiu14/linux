package com.bytedance.common.wschannel.channel.c.a.i;

import f.A;
import f.e;
import f.h;
import f.x;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes.dex */
final class f {
    final boolean a;
    final Random b;

    /* renamed from: c, reason: collision with root package name */
    final f.f f4233c;

    /* renamed from: d, reason: collision with root package name */
    final f.e f4234d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4235e;

    /* renamed from: f, reason: collision with root package name */
    final f.e f4236f = new f.e();

    /* renamed from: g, reason: collision with root package name */
    final a f4237g = new a();
    boolean h;
    private final byte[] i;
    private final e.a j;

    final class a implements x {
        int a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4238c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4239d;

        a() {
        }

        @Override // f.x
        public void O(f.e eVar, long j) throws IOException {
            if (this.f4239d) {
                throw new IOException("closed");
            }
            f.this.f4236f.O(eVar, j);
            boolean z = this.f4238c && this.b != -1 && f.this.f4236f.I() > this.b - 8192;
            long d2 = f.this.f4236f.d();
            if (d2 <= 0 || z) {
                return;
            }
            f.this.c(this.a, d2, this.f4238c, false);
            this.f4238c = false;
        }

        @Override // f.x
        public A c() {
            return f.this.f4233c.c();
        }

        @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f4239d) {
                throw new IOException("closed");
            }
            f fVar = f.this;
            fVar.c(this.a, fVar.f4236f.I(), this.f4238c, true);
            this.f4239d = true;
            f.this.h = false;
        }

        @Override // f.x, java.io.Flushable
        public void flush() throws IOException {
            if (this.f4239d) {
                throw new IOException("closed");
            }
            f fVar = f.this;
            fVar.c(this.a, fVar.f4236f.I(), this.f4238c, false);
            this.f4238c = false;
        }
    }

    f(boolean z, f.f fVar, Random random) {
        Objects.requireNonNull(fVar, "sink == null");
        Objects.requireNonNull(random, "random == null");
        this.a = z;
        this.f4233c = fVar;
        this.f4234d = fVar.b();
        this.b = random;
        this.i = z ? new byte[4] : null;
        this.j = z ? new e.a() : null;
    }

    private void b(int i, h hVar) throws IOException {
        if (this.f4235e) {
            throw new IOException("closed");
        }
        int f2 = hVar.f();
        if (f2 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f4234d.U(i | 128);
        if (this.a) {
            this.f4234d.U(f2 | 128);
            this.b.nextBytes(this.i);
            this.f4234d.P(this.i);
            if (f2 > 0) {
                long I = this.f4234d.I();
                this.f4234d.N(hVar);
                this.f4234d.r(this.j);
                this.j.a(I);
                d.b(this.j, this.i);
                this.j.close();
            }
        } else {
            this.f4234d.U(f2);
            this.f4234d.N(hVar);
        }
        this.f4233c.flush();
    }

    void a(int i, h hVar) throws IOException {
        String a2;
        h hVar2 = h.f10045d;
        if (i != 0 || hVar != null) {
            if (i != 0 && (a2 = d.a(i)) != null) {
                throw new IllegalArgumentException(a2);
            }
            f.e eVar = new f.e();
            eVar.f0(i);
            if (hVar != null) {
                eVar.N(hVar);
            }
            hVar2 = eVar.w();
        }
        try {
            b(8, hVar2);
        } finally {
            this.f4235e = true;
        }
    }

    void c(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f4235e) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f4234d.U(i);
        int i2 = this.a ? 128 : 0;
        if (j <= 125) {
            this.f4234d.U(((int) j) | i2);
        } else if (j <= 65535) {
            this.f4234d.U(i2 | 126);
            this.f4234d.f0((int) j);
        } else {
            this.f4234d.U(i2 | 127);
            this.f4234d.e0(j);
        }
        if (this.a) {
            this.b.nextBytes(this.i);
            this.f4234d.P(this.i);
            if (j > 0) {
                long I = this.f4234d.I();
                this.f4234d.O(this.f4236f, j);
                this.f4234d.r(this.j);
                this.j.a(I);
                d.b(this.j, this.i);
                this.j.close();
            }
        } else {
            this.f4234d.O(this.f4236f, j);
        }
        this.f4233c.n();
    }

    void d(h hVar) throws IOException {
        b(9, hVar);
    }

    void e(h hVar) throws IOException {
        b(10, hVar);
    }
}
