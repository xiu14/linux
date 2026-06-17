package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.j;
import okhttp3.internal.http2.n;

/* loaded from: classes2.dex */
public final class f implements Closeable {
    private static final ExecutorService y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), okhttp3.F.c.z("OkHttp Http2Connection", true));
    final boolean a;
    final j b;

    /* renamed from: d, reason: collision with root package name */
    final String f10637d;

    /* renamed from: e, reason: collision with root package name */
    int f10638e;

    /* renamed from: f, reason: collision with root package name */
    int f10639f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10640g;
    private final ScheduledExecutorService h;
    private final ExecutorService i;
    final n j;
    long r;
    final o t;
    final Socket u;
    final okhttp3.internal.http2.l v;
    final l w;
    final Set<Integer> x;

    /* renamed from: c, reason: collision with root package name */
    final Map<Integer, okhttp3.internal.http2.k> f10636c = new LinkedHashMap();
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    long q = 0;
    o s = new o();

    class a extends okhttp3.F.b {
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ErrorCode f10641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.b = i;
            this.f10641c = errorCode;
        }

        @Override // okhttp3.F.b
        public void a() {
            try {
                f fVar = f.this;
                fVar.v.w(this.b, this.f10641c);
            } catch (IOException unused) {
                f.a(f.this);
            }
        }
    }

    class b extends okhttp3.F.b {
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f10643c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.b = i;
            this.f10643c = j;
        }

        @Override // okhttp3.F.b
        public void a() {
            try {
                f.this.v.A(this.b, this.f10643c);
            } catch (IOException unused) {
                f.a(f.this);
            }
        }
    }

    class c extends okhttp3.F.b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // okhttp3.F.b
        public void a() {
            f.this.l0(false, 2, 0);
        }
    }

    class d extends okhttp3.F.b {
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f10645c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.b = i;
            this.f10645c = list;
        }

        @Override // okhttp3.F.b
        public void a() {
            Objects.requireNonNull(f.this.j);
            try {
                f.this.v.w(this.b, ErrorCode.CANCEL);
                synchronized (f.this) {
                    f.this.x.remove(Integer.valueOf(this.b));
                }
            } catch (IOException unused) {
            }
        }
    }

    class e extends okhttp3.F.b {
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f10647c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10648d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.b = i;
            this.f10647c = list;
            this.f10648d = z;
        }

        @Override // okhttp3.F.b
        public void a() {
            Objects.requireNonNull(f.this.j);
            try {
                f.this.v.w(this.b, ErrorCode.CANCEL);
                synchronized (f.this) {
                    f.this.x.remove(Integer.valueOf(this.b));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$f, reason: collision with other inner class name */
    class C0487f extends okhttp3.F.b {
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.e f10650c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10651d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10652e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0487f(String str, Object[] objArr, int i, f.e eVar, int i2, boolean z) {
            super(str, objArr);
            this.b = i;
            this.f10650c = eVar;
            this.f10651d = i2;
            this.f10652e = z;
        }

        @Override // okhttp3.F.b
        public void a() {
            try {
                n nVar = f.this.j;
                f.e eVar = this.f10650c;
                int i = this.f10651d;
                Objects.requireNonNull((n.a) nVar);
                eVar.skip(i);
                f.this.v.w(this.b, ErrorCode.CANCEL);
                synchronized (f.this) {
                    f.this.x.remove(Integer.valueOf(this.b));
                }
            } catch (IOException unused) {
            }
        }
    }

    class g extends okhttp3.F.b {
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ErrorCode f10654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.b = i;
            this.f10654c = errorCode;
        }

        @Override // okhttp3.F.b
        public void a() {
            Objects.requireNonNull((n.a) f.this.j);
            synchronized (f.this) {
                f.this.x.remove(Integer.valueOf(this.b));
            }
        }
    }

    public static class h {
        Socket a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        f.g f10656c;

        /* renamed from: d, reason: collision with root package name */
        f.f f10657d;

        /* renamed from: e, reason: collision with root package name */
        j f10658e = j.a;

        /* renamed from: f, reason: collision with root package name */
        int f10659f;

        public h(boolean z) {
        }

        public f a() {
            return new f(this);
        }

        public h b(j jVar) {
            this.f10658e = jVar;
            return this;
        }

        public h c(int i) {
            this.f10659f = i;
            return this;
        }

        public h d(Socket socket, String str, f.g gVar, f.f fVar) {
            this.a = socket;
            this.b = str;
            this.f10656c = gVar;
            this.f10657d = fVar;
            return this;
        }
    }

    final class i extends okhttp3.F.b {
        i() {
            super("OkHttp %s ping", f.this.f10637d);
        }

        @Override // okhttp3.F.b
        public void a() {
            boolean z;
            if (okhttp3.G.a.j().b()) {
                synchronized (f.this) {
                    if (f.this.l < f.this.k) {
                        z = true;
                    } else {
                        f.o(f.this);
                        z = false;
                    }
                }
                if (z) {
                    f.a(f.this);
                } else {
                    f.this.l0(false, 1, 0);
                }
            }
        }
    }

    public static abstract class j {
        public static final j a = new a();

        static class a extends j {
            a() {
            }

            @Override // okhttp3.internal.http2.f.j
            public void b(okhttp3.internal.http2.k kVar) throws IOException {
                kVar.d(ErrorCode.REFUSED_STREAM);
            }
        }

        public void a(f fVar) {
        }

        public abstract void b(okhttp3.internal.http2.k kVar) throws IOException;
    }

    final class k extends okhttp3.F.b {
        final boolean b;

        /* renamed from: c, reason: collision with root package name */
        final int f10660c;

        /* renamed from: d, reason: collision with root package name */
        final int f10661d;

        k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", f.this.f10637d, Integer.valueOf(i), Integer.valueOf(i2));
            this.b = z;
            this.f10660c = i;
            this.f10661d = i2;
        }

        @Override // okhttp3.F.b
        public void a() {
            f.this.l0(this.b, this.f10660c, this.f10661d);
        }
    }

    class l extends okhttp3.F.b implements j.b {
        final okhttp3.internal.http2.j b;

        l(okhttp3.internal.http2.j jVar) {
            super("OkHttp %s", f.this.f10637d);
            this.b = jVar;
        }

        @Override // okhttp3.F.b
        protected void a() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.b.h(this);
                    while (this.b.d(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        try {
                            f.this.A(errorCode, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            f.this.A(errorCode3, errorCode3);
                            okhttp3.F.c.g(this.b);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            f.this.A(errorCode, errorCode2);
                        } catch (IOException unused2) {
                        }
                        okhttp3.F.c.g(this.b);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                errorCode = errorCode2;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                f.this.A(errorCode, errorCode2);
                okhttp3.F.c.g(this.b);
                throw th;
            }
            okhttp3.F.c.g(this.b);
        }
    }

    f(h hVar) {
        o oVar = new o();
        this.t = oVar;
        this.x = new LinkedHashSet();
        this.j = n.a;
        this.a = true;
        this.b = hVar.f10658e;
        this.f10639f = 1;
        this.f10639f = 3;
        this.s.i(7, 16777216);
        String str = hVar.b;
        this.f10637d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, okhttp3.F.c.z(okhttp3.F.c.o("OkHttp %s Writer", str), false));
        this.h = scheduledThreadPoolExecutor;
        if (hVar.f10659f != 0) {
            i iVar = new i();
            long j2 = hVar.f10659f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), okhttp3.F.c.z(okhttp3.F.c.o("OkHttp %s Push Observer", str), true));
        oVar.i(7, 65535);
        oVar.i(5, 16384);
        this.r = oVar.d();
        this.u = hVar.a;
        this.v = new okhttp3.internal.http2.l(hVar.f10657d, true);
        this.w = new l(new okhttp3.internal.http2.j(hVar.f10656c, true));
    }

    private synchronized void N(okhttp3.F.b bVar) {
        if (!this.f10640g) {
            this.i.execute(bVar);
        }
    }

    static void a(f fVar) {
        Objects.requireNonNull(fVar);
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            fVar.A(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    static /* synthetic */ long h(f fVar) {
        long j2 = fVar.l;
        fVar.l = 1 + j2;
        return j2;
    }

    static /* synthetic */ long o(f fVar) {
        long j2 = fVar.k;
        fVar.k = 1 + j2;
        return j2;
    }

    static /* synthetic */ long x(f fVar) {
        long j2 = fVar.n;
        fVar.n = 1 + j2;
        return j2;
    }

    static /* synthetic */ long z(f fVar) {
        long j2 = fVar.o;
        fVar.o = 1 + j2;
        return j2;
    }

    void A(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        okhttp3.internal.http2.k[] kVarArr = null;
        try {
            c0(errorCode);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f10636c.isEmpty()) {
                kVarArr = (okhttp3.internal.http2.k[]) this.f10636c.values().toArray(new okhttp3.internal.http2.k[this.f10636c.size()]);
                this.f10636c.clear();
            }
        }
        if (kVarArr != null) {
            for (okhttp3.internal.http2.k kVar : kVarArr) {
                try {
                    kVar.d(errorCode2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.v.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.u.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.h.shutdown();
        this.i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    synchronized okhttp3.internal.http2.k D(int i2) {
        return this.f10636c.get(Integer.valueOf(i2));
    }

    public synchronized boolean G(long j2) {
        if (this.f10640g) {
            return false;
        }
        if (this.n < this.m) {
            if (j2 >= this.p) {
                return false;
            }
        }
        return true;
    }

    public synchronized int H() {
        return this.t.e(Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x005f, TryCatch #1 {, blocks: (B:6:0x0006, B:8:0x000d, B:9:0x0012, B:11:0x0016, B:13:0x0029, B:15:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x004a, B:30:0x0059, B:31:0x005e), top: B:5:0x0006, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.internal.http2.k I(java.util.List<okhttp3.internal.http2.b> r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r12 ^ 1
            okhttp3.internal.http2.l r7 = r10.v
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L62
            int r0 = r10.f10639f     // Catch: java.lang.Throwable -> L5f
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L12
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L5f
            r10.c0(r0)     // Catch: java.lang.Throwable -> L5f
        L12:
            boolean r0 = r10.f10640g     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L59
            int r8 = r10.f10639f     // Catch: java.lang.Throwable -> L5f
            int r0 = r8 + 2
            r10.f10639f = r0     // Catch: java.lang.Throwable -> L5f
            okhttp3.internal.http2.k r9 = new okhttp3.internal.http2.k     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L5f
            if (r12 == 0) goto L3a
            long r0 = r10.r     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3a
            long r0 = r9.b     // Catch: java.lang.Throwable -> L5f
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L38
            goto L3a
        L38:
            r12 = 0
            goto L3b
        L3a:
            r12 = 1
        L3b:
            boolean r0 = r9.j()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L4a
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.k> r0 = r10.f10636c     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L5f
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L5f
        L4a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5f
            okhttp3.internal.http2.l r0 = r10.v     // Catch: java.lang.Throwable -> L62
            r0.z(r6, r8, r11)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto L58
            okhttp3.internal.http2.l r11 = r10.v
            r11.flush()
        L58:
            return r9
        L59:
            okhttp3.internal.http2.a r11 = new okhttp3.internal.http2.a     // Catch: java.lang.Throwable -> L5f
            r11.<init>()     // Catch: java.lang.Throwable -> L5f
            throw r11     // Catch: java.lang.Throwable -> L5f
        L5f:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5f
            throw r11     // Catch: java.lang.Throwable -> L62
        L62:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L62
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.f.I(java.util.List, boolean):okhttp3.internal.http2.k");
    }

    void M(int i2, f.g gVar, int i3, boolean z) throws IOException {
        f.e eVar = new f.e();
        long j2 = i3;
        gVar.g0(j2);
        gVar.b0(eVar, j2);
        if (eVar.I() == j2) {
            N(new C0487f("OkHttp %s Push Data[%s]", new Object[]{this.f10637d, Integer.valueOf(i2)}, i2, eVar, i3, z));
            return;
        }
        throw new IOException(eVar.I() + " != " + i3);
    }

    void P(int i2, List<okhttp3.internal.http2.b> list, boolean z) {
        try {
            N(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f10637d, Integer.valueOf(i2)}, i2, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    void Q(int i2, List<okhttp3.internal.http2.b> list) {
        synchronized (this) {
            if (this.x.contains(Integer.valueOf(i2))) {
                n0(i2, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.x.add(Integer.valueOf(i2));
            try {
                N(new d("OkHttp %s Push Request[%s]", new Object[]{this.f10637d, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    void S(int i2, ErrorCode errorCode) {
        N(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f10637d, Integer.valueOf(i2)}, i2, errorCode));
    }

    boolean U(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    synchronized okhttp3.internal.http2.k Y(int i2) {
        okhttp3.internal.http2.k remove;
        remove = this.f10636c.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    void a0() {
        synchronized (this) {
            long j2 = this.n;
            long j3 = this.m;
            if (j2 < j3) {
                return;
            }
            this.m = j3 + 1;
            this.p = System.nanoTime() + 1000000000;
            try {
                this.h.execute(new c("OkHttp %s ping", this.f10637d));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void c0(ErrorCode errorCode) throws IOException {
        synchronized (this.v) {
            synchronized (this) {
                if (this.f10640g) {
                    return;
                }
                this.f10640g = true;
                this.v.o(this.f10638e, errorCode, okhttp3.F.c.a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        A(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void e0() throws IOException {
        this.v.d();
        this.v.x(this.s);
        if (this.s.d() != 65535) {
            this.v.A(0, r0 - 65535);
        }
        new Thread(this.w).start();
    }

    synchronized void f0(long j2) {
        long j3 = this.q + j2;
        this.q = j3;
        if (j3 >= this.s.d() / 2) {
            o0(0, this.q);
            this.q = 0L;
        }
    }

    public void flush() throws IOException {
        this.v.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.v.r());
        r6 = r2;
        r8.r -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(int r9, boolean r10, f.e r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.l r12 = r8.v
            r12.h(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.r     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.k> r2 = r8.f10636c     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L56
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L56
            okhttp3.internal.http2.l r4 = r8.v     // Catch: java.lang.Throwable -> L56
            int r4 = r4.r()     // Catch: java.lang.Throwable -> L56
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.r     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.r = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            okhttp3.internal.http2.l r4 = r8.v
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.h(r5, r9, r11, r2)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.f.j0(int, boolean, f.e, long):void");
    }

    void l0(boolean z, int i2, int i3) {
        try {
            try {
                this.v.s(z, i2, i3);
            } catch (IOException unused) {
                ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                A(errorCode, errorCode);
            }
        } catch (IOException unused2) {
        }
    }

    void n0(int i2, ErrorCode errorCode) {
        try {
            this.h.execute(new a("OkHttp %s stream %d", new Object[]{this.f10637d, Integer.valueOf(i2)}, i2, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    void o0(int i2, long j2) {
        try {
            this.h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f10637d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}
