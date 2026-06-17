package com.ttnet.org.chromium.net.impl;

import android.annotation.TargetApi;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.ttnet.org.chromium.net.AbstractC0760h;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.impl.CronetLogger;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@TargetApi(14)
/* renamed from: com.ttnet.org.chromium.net.impl.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0772l extends H {
    private static final String r = "l";
    public static final /* synthetic */ int s = 0;
    private final f a;
    private final Executor b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8745c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f8746d = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f8747e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f8748f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f8749g = new AtomicBoolean(false);
    private final boolean h;
    private String i;
    private P j;
    private Executor k;
    private String l;

    @Nullable
    private ReadableByteChannel m;
    private J n;
    private String o;
    private HttpURLConnection p;
    private g q;

    /* renamed from: com.ttnet.org.chromium.net.impl.l$a */
    class a implements Runnable {
        final /* synthetic */ ByteBuffer a;

        /* renamed from: com.ttnet.org.chromium.net.impl.l$a$a, reason: collision with other inner class name */
        class C0401a implements y {
            C0401a() {
            }

            @Override // com.ttnet.org.chromium.net.impl.y
            public void run() throws Exception {
                int read = C0772l.this.m == null ? -1 : C0772l.this.m.read(a.this.a);
                a aVar = a.this;
                C0772l.V(C0772l.this, read, aVar.a);
            }
        }

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor = C0772l.this.b;
            C0772l c0772l = C0772l.this;
            C0401a c0401a = new C0401a();
            Objects.requireNonNull(c0772l);
            executor.execute(new RunnableC0777q(c0772l, c0401a));
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.l$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0772l.this.q != null) {
                try {
                    C0772l.this.q.u();
                } catch (IOException e2) {
                    Log.e(C0772l.r, "Exception when closing OutputChannel", e2);
                }
            }
            if (C0772l.this.p != null) {
                C0772l.this.p.disconnect();
                C0772l.this.p = null;
            }
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.l$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0772l.this.f8747e.add(C0772l.this.l);
            C0772l.x(C0772l.this);
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.l$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0772l c0772l = C0772l.this;
            c0772l.l = c0772l.o;
            C0772l.this.o = null;
            C0772l.x(C0772l.this);
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.l$e */
    class e implements y {
        e() {
        }

        @Override // com.ttnet.org.chromium.net.impl.y
        public void run() throws Exception {
            C0772l.this.j.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ttnet.org.chromium.net.impl.l$f */
    final class f {
        final Q a;
        final Executor b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f8750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0772l f8751d;

        static void a(f fVar) {
            Objects.requireNonNull(fVar);
            try {
                Objects.requireNonNull(fVar.f8751d);
                Objects.requireNonNull(fVar.f8751d);
                fVar.b();
                throw null;
            } catch (RuntimeException e2) {
                Log.e(C0772l.r, "Error while trying to log CronetTrafficInfo: ", e2);
            }
        }

        @RequiresApi(26)
        private CronetLogger.b b() {
            Map<String, List<String>> emptyMap;
            boolean z;
            int i;
            String str;
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            if (this.f8751d.n != null) {
                emptyMap = this.f8751d.n.a();
                String e2 = this.f8751d.n.e();
                int c2 = this.f8751d.n.c();
                z = this.f8751d.n.g();
                str = e2;
                i = c2;
            } else {
                emptyMap = Collections.emptyMap();
                z = false;
                i = 0;
                str = "";
            }
            if (z) {
                j = 0;
                j2 = 0;
            } else {
                Map map = this.f8751d.f8746d;
                if (map == null) {
                    j = 0;
                } else {
                    j = 0;
                    for (Map.Entry entry : map.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            j += r13.length();
                        }
                        if (((String) entry.getValue()) != null) {
                            j += r11.length();
                        }
                    }
                }
                j2 = -1;
            }
            if (z) {
                j5 = 0;
                j6 = 0;
                j3 = 0;
            } else {
                if (emptyMap == null) {
                    j3 = 0;
                } else {
                    j3 = 0;
                    for (Map.Entry<String, List<String>> entry2 : emptyMap.entrySet()) {
                        if (entry2.getKey() != null) {
                            j3 += r11.length();
                        }
                        if (entry2.getValue() != null) {
                            Iterator<String> it2 = entry2.getValue().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    j3 += r4.length();
                                }
                            }
                        }
                    }
                }
                if (emptyMap.containsKey(DownloadUtils.CONTENT_LENGTH)) {
                    try {
                        j4 = Long.parseLong(emptyMap.get(DownloadUtils.CONTENT_LENGTH).get(0));
                    } catch (NumberFormatException unused) {
                        j4 = 0;
                    }
                } else {
                    j4 = -1;
                }
                j5 = j4;
                j6 = 0;
            }
            return new CronetLogger.b(j, j2, j3, j5, i, Duration.ofSeconds(j6), Duration.ofSeconds(j6), str, false, false);
        }

        void c(y yVar) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ttnet.org.chromium.net.impl.l$g */
    final class g extends AbstractC0770j {
        private final HttpURLConnection h;
        private final AtomicBoolean i;
        private WritableByteChannel j;
        private OutputStream k;

        g(Executor executor, Executor executor2, HttpURLConnection httpURLConnection, P p) {
            super(executor, executor2, p);
            this.i = new AtomicBoolean(false);
            this.h = httpURLConnection;
        }

        @Override // com.ttnet.org.chromium.net.impl.AbstractC0770j
        protected void o() throws IOException {
            u();
            C0772l.Y(C0772l.this);
        }

        @Override // com.ttnet.org.chromium.net.impl.AbstractC0770j
        protected void p() throws IOException {
            if (this.j == null) {
                C0772l c0772l = C0772l.this;
                int i = C0772l.s;
                Objects.requireNonNull(c0772l);
                this.h.setDoOutput(true);
                this.h.connect();
                Objects.requireNonNull(C0772l.this);
                OutputStream outputStream = this.h.getOutputStream();
                this.k = outputStream;
                this.j = Channels.newChannel(outputStream);
            }
        }

        @Override // com.ttnet.org.chromium.net.impl.AbstractC0770j
        protected void q(long j) {
            if (j > 0) {
                this.h.setFixedLengthStreamingMode(j);
            } else {
                this.h.setChunkedStreamingMode(8192);
            }
        }

        @Override // com.ttnet.org.chromium.net.impl.AbstractC0770j
        protected int r(ByteBuffer byteBuffer) throws IOException {
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                i += this.j.write(byteBuffer);
            }
            this.k.flush();
            return i;
        }

        void u() throws IOException {
            if (this.j == null || !this.i.compareAndSet(false, true)) {
                return;
            }
            this.j.close();
        }
    }

    C0772l(JavaCronetEngine javaCronetEngine, F.b bVar, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(bVar, "Listener is required");
        throw null;
    }

    static void E(C0772l c0772l, String str) {
        c0772l.g0(1, 2, new RunnableC0775o(c0772l, str));
    }

    static void U(C0772l c0772l, Throwable th) {
        Objects.requireNonNull(c0772l);
        c0772l.d0(new C0764d("System error", th));
    }

    static void V(C0772l c0772l, int i, ByteBuffer byteBuffer) throws IOException {
        if (i != -1) {
            f fVar = c0772l.a;
            fVar.c(new t(fVar, c0772l.n, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel = c0772l.m;
        if (readableByteChannel != null) {
            readableByteChannel.close();
        }
        if (c0772l.f8748f.compareAndSet(5, 7)) {
            c0772l.f0();
            f fVar2 = c0772l.a;
            fVar2.b.execute(new v(fVar2, c0772l.n));
        }
    }

    static void X(C0772l c0772l) {
        c0772l.b.execute(new RunnableC0773m(c0772l));
    }

    static void Y(C0772l c0772l) {
        c0772l.b.execute(new RunnableC0777q(c0772l, new C0774n(c0772l)));
    }

    static void Z(C0772l c0772l, Throwable th) {
        Objects.requireNonNull(c0772l);
        c0772l.d0(new C0762b("Exception received from UploadDataProvider", th));
    }

    private void c0() {
        int i = this.f8748f.get();
        if (i != 0) {
            throw new IllegalStateException(e.a.a.a.a.j("Request is already started. State is: ", i));
        }
    }

    private void d0(AbstractC0760h abstractC0760h) {
        int i;
        boolean z;
        do {
            i = this.f8748f.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                z = false;
                break;
            }
        } while (!this.f8748f.compareAndSet(i, 6));
        z = true;
        if (z) {
            f0();
            e0();
            f fVar = this.a;
            J j = this.n;
            X(fVar.f8751d);
            w wVar = new w(fVar, j, abstractC0760h);
            try {
                fVar.b.execute(wVar);
            } catch (com.ttnet.org.chromium.net.n unused) {
                Executor executor = fVar.f8750c;
                if (executor != null) {
                    executor.execute(wVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        if (this.j == null || !this.f8749g.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(new RunnableC0771k(this, new e()));
        } catch (RejectedExecutionException e2) {
            Log.e(r, "Exception when closing uploadDataProvider", e2);
        }
    }

    private void f0() {
        this.b.execute(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i, int i2, Runnable runnable) {
        if (this.f8748f.compareAndSet(i, i2)) {
            runnable.run();
            return;
        }
        int i3 = this.f8748f.get();
        if (i3 != 8 && i3 != 6) {
            throw new IllegalStateException(e.a.a.a.a.l("Invalid state transition - expected ", i, " but was ", i3));
        }
    }

    static void x(C0772l c0772l) {
        c0772l.b.execute(new RunnableC0777q(c0772l, new C0776p(c0772l)));
    }

    @Override // com.ttnet.org.chromium.net.F
    public void a(String str, String str2) {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void b() {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void d() {
        int andSet = this.f8748f.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f0();
            e0();
            f fVar = this.a;
            J j = this.n;
            X(fVar.f8751d);
            fVar.b.execute(new u(fVar, j));
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void f() {
        g0(3, 1, new d());
    }

    @Override // com.ttnet.org.chromium.net.F
    public void g(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        g0(4, 5, new a(byteBuffer));
    }

    @Override // com.ttnet.org.chromium.net.F
    public void h(long j) {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void i(String str, String str2) {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void j(int i) {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void l(int i) {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void m(long j) {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void n(long j) {
    }

    @Override // com.ttnet.org.chromium.net.F
    public void o() {
        g0(0, 1, new c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r6.contains("\r\n") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r4.f8746d.containsKey(r5) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        r4.f8746d.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r4.f8746d.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        return;
     */
    @Override // com.ttnet.org.chromium.net.impl.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r4.c0()
            r0 = 0
            r1 = r0
        L5:
            int r2 = r5.length()
            if (r1 >= r2) goto L38
            char r2 = r5.charAt(r1)
            r3 = 44
            if (r2 == r3) goto L39
            r3 = 47
            if (r2 == r3) goto L39
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L39
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L39
            switch(r2) {
                case 39: goto L39;
                case 40: goto L39;
                case 41: goto L39;
                default: goto L22;
            }
        L22:
            switch(r2) {
                case 58: goto L39;
                case 59: goto L39;
                case 60: goto L39;
                case 61: goto L39;
                case 62: goto L39;
                case 63: goto L39;
                case 64: goto L39;
                default: goto L25;
            }
        L25:
            switch(r2) {
                case 91: goto L39;
                case 92: goto L39;
                case 93: goto L39;
                default: goto L28;
            }
        L28:
            boolean r3 = java.lang.Character.isISOControl(r2)
            if (r3 != 0) goto L39
            boolean r2 = java.lang.Character.isWhitespace(r2)
            if (r2 == 0) goto L35
            goto L39
        L35:
            int r1 = r1 + 1
            goto L5
        L38:
            r0 = 1
        L39:
            if (r0 == 0) goto L56
            java.lang.String r0 = "\r\n"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L56
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f8746d
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L50
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f8746d
            r0.remove(r5)
        L50:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f8746d
            r0.put(r5, r6)
            return
        L56:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid header "
            java.lang.String r2 = "="
            java.lang.String r5 = e.a.a.a.a.u(r1, r5, r2, r6)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.C0772l.p(java.lang.String, java.lang.String):void");
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void q(String str) {
        c0();
        Objects.requireNonNull(str, "Method is required.");
        if (!"OPTIONS".equalsIgnoreCase(str) && !"GET".equalsIgnoreCase(str) && !"HEAD".equalsIgnoreCase(str) && !"POST".equalsIgnoreCase(str) && !"PUT".equalsIgnoreCase(str) && !"DELETE".equalsIgnoreCase(str) && !"TRACE".equalsIgnoreCase(str) && !"PATCH".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException(e.a.a.a.a.s("Invalid http method ", str));
        }
        this.i = str;
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void r(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void s(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void t(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void u(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void v(com.ttnet.org.chromium.net.D d2, Executor executor) {
        Objects.requireNonNull(d2, "Invalid UploadDataProvider.");
        if (!this.f8746d.containsKey(DownloadHelper.CONTENT_TYPE)) {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        c0();
        if (this.i == null) {
            this.i = "POST";
        }
        this.j = new P(d2);
        if (this.h) {
            this.k = executor;
        } else {
            this.k = new z(executor);
        }
    }
}
