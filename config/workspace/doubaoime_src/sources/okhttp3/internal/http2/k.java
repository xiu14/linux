package okhttp3.internal.http2;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import f.A;
import f.x;
import f.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import okhttp3.s;

/* loaded from: classes2.dex */
public final class k {
    long a = 0;
    long b;

    /* renamed from: c, reason: collision with root package name */
    final int f10674c;

    /* renamed from: d, reason: collision with root package name */
    final f f10675d;

    /* renamed from: e, reason: collision with root package name */
    private final Deque<s> f10676e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10677f;

    /* renamed from: g, reason: collision with root package name */
    private final b f10678g;
    final a h;
    final c i;
    final c j;
    ErrorCode k;

    final class a implements x {
        private final f.e a = new f.e();
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        boolean f10679c;

        a() {
        }

        private void a(boolean z) throws IOException {
            k kVar;
            long min;
            k kVar2;
            synchronized (k.this) {
                k.this.j.q();
                while (true) {
                    try {
                        kVar = k.this;
                        if (kVar.b > 0 || this.f10679c || this.b || kVar.k != null) {
                            break;
                        } else {
                            kVar.o();
                        }
                    } finally {
                    }
                }
                kVar.j.w();
                k.this.c();
                min = Math.min(k.this.b, this.a.I());
                kVar2 = k.this;
                kVar2.b -= min;
            }
            kVar2.j.q();
            try {
                k kVar3 = k.this;
                kVar3.f10675d.j0(kVar3.f10674c, z && min == this.a.I(), this.a, min);
            } finally {
            }
        }

        @Override // f.x
        public void O(f.e eVar, long j) throws IOException {
            this.a.O(eVar, j);
            while (this.a.I() >= DownloadConstants.MK_DIR_MIN_SPACE) {
                a(false);
            }
        }

        @Override // f.x
        public A c() {
            return k.this.j;
        }

        @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (k.this) {
                if (this.b) {
                    return;
                }
                if (!k.this.h.f10679c) {
                    if (this.a.I() > 0) {
                        while (this.a.I() > 0) {
                            a(true);
                        }
                    } else {
                        k kVar = k.this;
                        kVar.f10675d.j0(kVar.f10674c, true, null, 0L);
                    }
                }
                synchronized (k.this) {
                    this.b = true;
                }
                k.this.f10675d.v.flush();
                k.this.b();
            }
        }

        @Override // f.x, java.io.Flushable
        public void flush() throws IOException {
            synchronized (k.this) {
                k.this.c();
            }
            while (this.a.I() > 0) {
                a(false);
                k.this.f10675d.flush();
            }
        }
    }

    private final class b implements z {
        private final f.e a = new f.e();
        private final f.e b = new f.e();

        /* renamed from: c, reason: collision with root package name */
        private final long f10681c;

        /* renamed from: d, reason: collision with root package name */
        boolean f10682d;

        /* renamed from: e, reason: collision with root package name */
        boolean f10683e;

        b(long j) {
            this.f10681c = j;
        }

        private void d(long j) {
            k.this.f10675d.f0(j);
        }

        void a(f.g gVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (k.this) {
                    z = this.f10683e;
                    z2 = true;
                    z3 = this.b.I() + j > this.f10681c;
                }
                if (z3) {
                    gVar.skip(j);
                    k.this.f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    gVar.skip(j);
                    return;
                }
                long b0 = gVar.b0(this.a, j);
                if (b0 == -1) {
                    throw new EOFException();
                }
                j -= b0;
                synchronized (k.this) {
                    if (this.f10682d) {
                        j2 = this.a.I();
                        this.a.a();
                    } else {
                        if (this.b.I() != 0) {
                            z2 = false;
                        }
                        this.b.S(this.a);
                        if (z2) {
                            k.this.notifyAll();
                        }
                        j2 = 0;
                    }
                }
                if (j2 > 0) {
                    d(j2);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        
            r12 = -1;
         */
        @Override // f.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long b0(f.e r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Laf
            L6:
                r2 = 0
                okhttp3.internal.http2.k r3 = okhttp3.internal.http2.k.this
                monitor-enter(r3)
                okhttp3.internal.http2.k r4 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> Lac
                okhttp3.internal.http2.k$c r4 = r4.i     // Catch: java.lang.Throwable -> Lac
                r4.q()     // Catch: java.lang.Throwable -> Lac
                okhttp3.internal.http2.k r4 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> La3
                okhttp3.internal.http2.ErrorCode r5 = r4.k     // Catch: java.lang.Throwable -> La3
                if (r5 == 0) goto L18
                r2 = r5
            L18:
                boolean r5 = r11.f10682d     // Catch: java.lang.Throwable -> La3
                if (r5 != 0) goto L9b
                java.util.Deque r4 = okhttp3.internal.http2.k.a(r4)     // Catch: java.lang.Throwable -> La3
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La3
                if (r4 != 0) goto L2b
                okhttp3.internal.http2.k r4 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> La3
                java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> La3
            L2b:
                f.e r4 = r11.b     // Catch: java.lang.Throwable -> La3
                long r4 = r4.I()     // Catch: java.lang.Throwable -> La3
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r5 = -1
                if (r4 <= 0) goto L6d
                f.e r4 = r11.b     // Catch: java.lang.Throwable -> La3
                long r7 = r4.I()     // Catch: java.lang.Throwable -> La3
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> La3
                long r12 = r4.b0(r12, r13)     // Catch: java.lang.Throwable -> La3
                okhttp3.internal.http2.k r14 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> La3
                long r7 = r14.a     // Catch: java.lang.Throwable -> La3
                long r7 = r7 + r12
                r14.a = r7     // Catch: java.lang.Throwable -> La3
                if (r2 != 0) goto L82
                okhttp3.internal.http2.f r14 = r14.f10675d     // Catch: java.lang.Throwable -> La3
                okhttp3.internal.http2.o r14 = r14.s     // Catch: java.lang.Throwable -> La3
                int r14 = r14.d()     // Catch: java.lang.Throwable -> La3
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> La3
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L82
                okhttp3.internal.http2.k r14 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> La3
                okhttp3.internal.http2.f r4 = r14.f10675d     // Catch: java.lang.Throwable -> La3
                int r7 = r14.f10674c     // Catch: java.lang.Throwable -> La3
                long r8 = r14.a     // Catch: java.lang.Throwable -> La3
                r4.o0(r7, r8)     // Catch: java.lang.Throwable -> La3
                okhttp3.internal.http2.k r14 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> La3
                r14.a = r0     // Catch: java.lang.Throwable -> La3
                goto L82
            L6d:
                boolean r4 = r11.f10683e     // Catch: java.lang.Throwable -> La3
                if (r4 != 0) goto L81
                if (r2 != 0) goto L81
                okhttp3.internal.http2.k r2 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> La3
                r2.o()     // Catch: java.lang.Throwable -> La3
                okhttp3.internal.http2.k r2 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> Lac
                okhttp3.internal.http2.k$c r2 = r2.i     // Catch: java.lang.Throwable -> Lac
                r2.w()     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                goto L6
            L81:
                r12 = r5
            L82:
                okhttp3.internal.http2.k r14 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> Lac
                okhttp3.internal.http2.k$c r14 = r14.i     // Catch: java.lang.Throwable -> Lac
                r14.w()     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto L92
                r11.d(r12)
                return r12
            L92:
                if (r2 != 0) goto L95
                return r5
            L95:
                okhttp3.internal.http2.p r12 = new okhttp3.internal.http2.p
                r12.<init>(r2)
                throw r12
            L9b:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> La3
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> La3
                throw r12     // Catch: java.lang.Throwable -> La3
            La3:
                r12 = move-exception
                okhttp3.internal.http2.k r13 = okhttp3.internal.http2.k.this     // Catch: java.lang.Throwable -> Lac
                okhttp3.internal.http2.k$c r13 = r13.i     // Catch: java.lang.Throwable -> Lac
                r13.w()     // Catch: java.lang.Throwable -> Lac
                throw r12     // Catch: java.lang.Throwable -> Lac
            Lac:
                r12 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                throw r12
            Laf:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r13 = e.a.a.a.a.n(r0, r13)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.k.b.b0(f.e, long):long");
        }

        @Override // f.z
        public A c() {
            return k.this.i;
        }

        @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long I;
            synchronized (k.this) {
                this.f10682d = true;
                I = this.b.I();
                this.b.a();
                if (!k.this.f10676e.isEmpty()) {
                    Objects.requireNonNull(k.this);
                }
                k.this.notifyAll();
            }
            if (I > 0) {
                d(I);
            }
            k.this.b();
        }
    }

    class c extends f.b {
        c() {
        }

        @Override // f.b
        protected IOException u(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // f.b
        protected void v() {
            k.this.f(ErrorCode.CANCEL);
            k.this.f10675d.a0();
        }

        public void w() throws IOException {
            if (r()) {
                throw u(null);
            }
        }
    }

    k(int i, f fVar, boolean z, boolean z2, s sVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f10676e = arrayDeque;
        this.i = new c();
        this.j = new c();
        this.k = null;
        Objects.requireNonNull(fVar, "connection == null");
        this.f10674c = i;
        this.f10675d = fVar;
        this.b = fVar.t.d();
        b bVar = new b(fVar.s.d());
        this.f10678g = bVar;
        a aVar = new a();
        this.h = aVar;
        bVar.f10683e = z2;
        aVar.f10679c = z;
        if (sVar != null) {
            arrayDeque.add(sVar);
        }
        if (i() && sVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!i() && sVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean e(ErrorCode errorCode) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.f10678g.f10683e && this.h.f10679c) {
                return false;
            }
            this.k = errorCode;
            notifyAll();
            this.f10675d.Y(this.f10674c);
            return true;
        }
    }

    void b() throws IOException {
        boolean z;
        boolean j;
        synchronized (this) {
            b bVar = this.f10678g;
            if (!bVar.f10683e && bVar.f10682d) {
                a aVar = this.h;
                if (aVar.f10679c || aVar.b) {
                    z = true;
                    j = j();
                }
            }
            z = false;
            j = j();
        }
        if (z) {
            d(ErrorCode.CANCEL);
        } else {
            if (j) {
                return;
            }
            this.f10675d.Y(this.f10674c);
        }
    }

    void c() throws IOException {
        a aVar = this.h;
        if (aVar.b) {
            throw new IOException("stream closed");
        }
        if (aVar.f10679c) {
            throw new IOException("stream finished");
        }
        if (this.k != null) {
            throw new p(this.k);
        }
    }

    public void d(ErrorCode errorCode) throws IOException {
        if (e(errorCode)) {
            f fVar = this.f10675d;
            fVar.v.w(this.f10674c, errorCode);
        }
    }

    public void f(ErrorCode errorCode) {
        if (e(errorCode)) {
            this.f10675d.n0(this.f10674c, errorCode);
        }
    }

    public x g() {
        synchronized (this) {
            if (!this.f10677f && !i()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public z h() {
        return this.f10678g;
    }

    public boolean i() {
        return this.f10675d.a == ((this.f10674c & 1) == 1);
    }

    public synchronized boolean j() {
        if (this.k != null) {
            return false;
        }
        b bVar = this.f10678g;
        if (bVar.f10683e || bVar.f10682d) {
            a aVar = this.h;
            if (aVar.f10679c || aVar.b) {
                if (this.f10677f) {
                    return false;
                }
            }
        }
        return true;
    }

    void k(f.g gVar, int i) throws IOException {
        this.f10678g.a(gVar, i);
    }

    void l() {
        boolean j;
        synchronized (this) {
            this.f10678g.f10683e = true;
            j = j();
            notifyAll();
        }
        if (j) {
            return;
        }
        this.f10675d.Y(this.f10674c);
    }

    void m(List<okhttp3.internal.http2.b> list) {
        boolean j;
        synchronized (this) {
            this.f10677f = true;
            this.f10676e.add(okhttp3.F.c.A(list));
            j = j();
            notifyAll();
        }
        if (j) {
            return;
        }
        this.f10675d.Y(this.f10674c);
    }

    public synchronized s n() throws IOException {
        this.i.q();
        while (this.f10676e.isEmpty() && this.k == null) {
            try {
                o();
            } catch (Throwable th) {
                this.i.w();
                throw th;
            }
        }
        this.i.w();
        if (this.f10676e.isEmpty()) {
            throw new p(this.k);
        }
        return this.f10676e.removeFirst();
    }

    void o() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
