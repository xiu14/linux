package okhttp3.F.g;

import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import f.A;
import f.k;
import f.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.s.c.l;
import okhttp3.B;
import okhttp3.D;
import okhttp3.F.f.h;
import okhttp3.F.f.j;
import okhttp3.Request;
import okhttp3.s;
import okhttp3.t;
import okhttp3.x;

/* loaded from: classes2.dex */
public final class a implements okhttp3.F.f.c {
    final x a;
    final okhttp3.F.e.g b;

    /* renamed from: c, reason: collision with root package name */
    final f.g f10542c;

    /* renamed from: d, reason: collision with root package name */
    final f.f f10543d;

    /* renamed from: e, reason: collision with root package name */
    int f10544e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f10545f = 262144;

    private abstract class b implements z {
        protected final k a;
        protected boolean b;

        /* renamed from: c, reason: collision with root package name */
        protected long f10546c = 0;

        b(C0484a c0484a) {
            this.a = new k(a.this.f10542c.c());
        }

        protected final void a(boolean z, IOException iOException) throws IOException {
            a aVar = a.this;
            int i = aVar.f10544e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                StringBuilder M = e.a.a.a.a.M("state: ");
                M.append(a.this.f10544e);
                throw new IllegalStateException(M.toString());
            }
            aVar.g(this.a);
            a aVar2 = a.this;
            aVar2.f10544e = 6;
            okhttp3.F.e.g gVar = aVar2.b;
            if (gVar != null) {
                gVar.o(!z, aVar2, this.f10546c, iOException);
            }
        }

        @Override // f.z
        public long b0(f.e eVar, long j) throws IOException {
            try {
                long b0 = a.this.f10542c.b0(eVar, j);
                if (b0 > 0) {
                    this.f10546c += b0;
                }
                return b0;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }

        @Override // f.z
        public A c() {
            return this.a;
        }
    }

    private final class c implements f.x {
        private final k a;
        private boolean b;

        c() {
            this.a = new k(a.this.f10543d.c());
        }

        @Override // f.x
        public void O(f.e eVar, long j) throws IOException {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            a.this.f10543d.R(j);
            a.this.f10543d.J("\r\n");
            a.this.f10543d.O(eVar, j);
            a.this.f10543d.J("\r\n");
        }

        @Override // f.x
        public A c() {
            return this.a;
        }

        @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            a.this.f10543d.J("0\r\n\r\n");
            a.this.g(this.a);
            a.this.f10544e = 3;
        }

        @Override // f.x, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.b) {
                return;
            }
            a.this.f10543d.flush();
        }
    }

    private class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final t f10549e;

        /* renamed from: f, reason: collision with root package name */
        private long f10550f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f10551g;

        d(t tVar) {
            super(null);
            this.f10550f = -1L;
            this.f10551g = true;
            this.f10549e = tVar;
        }

        @Override // okhttp3.F.g.a.b, f.z
        public long b0(f.e eVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f10551g) {
                return -1L;
            }
            long j2 = this.f10550f;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    a.this.f10542c.V();
                }
                try {
                    this.f10550f = a.this.f10542c.k0();
                    String trim = a.this.f10542c.V().trim();
                    if (this.f10550f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f10550f + trim + "\"");
                    }
                    if (this.f10550f == 0) {
                        this.f10551g = false;
                        okhttp3.F.f.e.d(a.this.a.e(), this.f10549e, a.this.j());
                        a(true, null);
                    }
                    if (!this.f10551g) {
                        return -1L;
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long b0 = super.b0(eVar, Math.min(j, this.f10550f));
            if (b0 != -1) {
                this.f10550f -= b0;
                return b0;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.f10551g && !okhttp3.F.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.b = true;
        }
    }

    private final class e implements f.x {
        private final k a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private long f10552c;

        e(long j) {
            this.a = new k(a.this.f10543d.c());
            this.f10552c = j;
        }

        @Override // f.x
        public void O(f.e eVar, long j) throws IOException {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            okhttp3.F.c.f(eVar.I(), 0L, j);
            if (j <= this.f10552c) {
                a.this.f10543d.O(eVar, j);
                this.f10552c -= j;
            } else {
                StringBuilder M = e.a.a.a.a.M("expected ");
                M.append(this.f10552c);
                M.append(" bytes but received ");
                M.append(j);
                throw new ProtocolException(M.toString());
            }
        }

        @Override // f.x
        public A c() {
            return this.a;
        }

        @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.f10552c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.g(this.a);
            a.this.f10544e = 3;
        }

        @Override // f.x, java.io.Flushable
        public void flush() throws IOException {
            if (this.b) {
                return;
            }
            a.this.f10543d.flush();
        }
    }

    private class f extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f10554e;

        f(a aVar, long j) throws IOException {
            super(null);
            this.f10554e = j;
            if (j == 0) {
                a(true, null);
            }
        }

        @Override // okhttp3.F.g.a.b, f.z
        public long b0(f.e eVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f10554e;
            if (j2 == 0) {
                return -1L;
            }
            long b0 = super.b0(eVar, Math.min(j2, j));
            if (b0 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j3 = this.f10554e - b0;
            this.f10554e = j3;
            if (j3 == 0) {
                a(true, null);
            }
            return b0;
        }

        @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.f10554e != 0 && !okhttp3.F.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.b = true;
        }
    }

    private class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f10555e;

        g(a aVar) {
            super(null);
        }

        @Override // okhttp3.F.g.a.b, f.z
        public long b0(f.e eVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (this.f10555e) {
                return -1L;
            }
            long b0 = super.b0(eVar, j);
            if (b0 != -1) {
                return b0;
            }
            this.f10555e = true;
            a(true, null);
            return -1L;
        }

        @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (!this.f10555e) {
                a(false, null);
            }
            this.b = true;
        }
    }

    public a(x xVar, okhttp3.F.e.g gVar, f.g gVar2, f.f fVar) {
        this.a = xVar;
        this.b = gVar;
        this.f10542c = gVar2;
        this.f10543d = fVar;
    }

    private String i() throws IOException {
        String E = this.f10542c.E(this.f10545f);
        this.f10545f -= E.length();
        return E;
    }

    @Override // okhttp3.F.f.c
    public void a() throws IOException {
        this.f10543d.flush();
    }

    @Override // okhttp3.F.f.c
    public void b(Request request) throws IOException {
        Proxy.Type type = this.b.d().n().c().type();
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (!request.isHttps() && type == Proxy.Type.HTTP) {
            sb.append(request.url());
        } else {
            sb.append(h.a(request.url()));
        }
        sb.append(" HTTP/1.1");
        k(request.headers(), sb.toString());
    }

    @Override // okhttp3.F.f.c
    public D c(B b2) throws IOException {
        okhttp3.F.e.g gVar = this.b;
        gVar.f10527f.t(gVar.f10526e);
        String p = b2.p(DownloadHelper.CONTENT_TYPE);
        if (!okhttp3.F.f.e.b(b2)) {
            z h = h(0L);
            l.g(h, "$receiver");
            return new okhttp3.F.f.g(p, 0L, new f.t(h));
        }
        if (DownloadHelper.VALUE_CHUNKED.equalsIgnoreCase(b2.p(DownloadHelper.TRANSFER_ENCODING))) {
            t url = b2.N().url();
            if (this.f10544e != 4) {
                StringBuilder M = e.a.a.a.a.M("state: ");
                M.append(this.f10544e);
                throw new IllegalStateException(M.toString());
            }
            this.f10544e = 5;
            d dVar = new d(url);
            l.g(dVar, "$receiver");
            return new okhttp3.F.f.g(p, -1L, new f.t(dVar));
        }
        long a = okhttp3.F.f.e.a(b2);
        if (a != -1) {
            z h2 = h(a);
            l.g(h2, "$receiver");
            return new okhttp3.F.f.g(p, a, new f.t(h2));
        }
        if (this.f10544e != 4) {
            StringBuilder M2 = e.a.a.a.a.M("state: ");
            M2.append(this.f10544e);
            throw new IllegalStateException(M2.toString());
        }
        okhttp3.F.e.g gVar2 = this.b;
        if (gVar2 == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f10544e = 5;
        gVar2.i();
        g gVar3 = new g(this);
        l.g(gVar3, "$receiver");
        return new okhttp3.F.f.g(p, -1L, new f.t(gVar3));
    }

    @Override // okhttp3.F.f.c
    public void cancel() {
        okhttp3.F.e.c d2 = this.b.d();
        if (d2 != null) {
            d2.c();
        }
    }

    @Override // okhttp3.F.f.c
    public B.a d(boolean z) throws IOException {
        int i = this.f10544e;
        if (i != 1 && i != 3) {
            StringBuilder M = e.a.a.a.a.M("state: ");
            M.append(this.f10544e);
            throw new IllegalStateException(M.toString());
        }
        try {
            j a = j.a(i());
            B.a aVar = new B.a();
            aVar.m(a.a);
            aVar.f(a.b);
            aVar.j(a.f10541c);
            aVar.i(j());
            if (z && a.b == 100) {
                return null;
            }
            if (a.b == 100) {
                this.f10544e = 3;
                return aVar;
            }
            this.f10544e = 4;
            return aVar;
        } catch (EOFException e2) {
            StringBuilder M2 = e.a.a.a.a.M("unexpected end of stream on ");
            M2.append(this.b);
            IOException iOException = new IOException(M2.toString());
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // okhttp3.F.f.c
    public void e() throws IOException {
        this.f10543d.flush();
    }

    @Override // okhttp3.F.f.c
    public f.x f(Request request, long j) {
        if (DownloadHelper.VALUE_CHUNKED.equalsIgnoreCase(request.header(DownloadHelper.TRANSFER_ENCODING))) {
            if (this.f10544e == 1) {
                this.f10544e = 2;
                return new c();
            }
            StringBuilder M = e.a.a.a.a.M("state: ");
            M.append(this.f10544e);
            throw new IllegalStateException(M.toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f10544e == 1) {
            this.f10544e = 2;
            return new e(j);
        }
        StringBuilder M2 = e.a.a.a.a.M("state: ");
        M2.append(this.f10544e);
        throw new IllegalStateException(M2.toString());
    }

    void g(k kVar) {
        A i = kVar.i();
        kVar.j(A.f10033d);
        i.a();
        i.b();
    }

    public z h(long j) throws IOException {
        if (this.f10544e == 4) {
            this.f10544e = 5;
            return new f(this, j);
        }
        StringBuilder M = e.a.a.a.a.M("state: ");
        M.append(this.f10544e);
        throw new IllegalStateException(M.toString());
    }

    public s j() throws IOException {
        s.a aVar = new s.a();
        while (true) {
            String i = i();
            if (i.length() == 0) {
                return aVar.c();
            }
            okhttp3.F.a.a.a(aVar, i);
        }
    }

    public void k(s sVar, String str) throws IOException {
        if (this.f10544e != 0) {
            StringBuilder M = e.a.a.a.a.M("state: ");
            M.append(this.f10544e);
            throw new IllegalStateException(M.toString());
        }
        this.f10543d.J(str).J("\r\n");
        int i = sVar.i();
        for (int i2 = 0; i2 < i; i2++) {
            this.f10543d.J(sVar.e(i2)).J(": ").J(sVar.k(i2)).J("\r\n");
        }
        this.f10543d.J("\r\n");
        this.f10544e = 1;
    }
}
