package okhttp3.F.e;

import androidx.core.location.LocationRequestCompat;
import com.xiaomi.mipush.sdk.Constants;
import f.A;
import f.s;
import f.t;
import f.x;
import f.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.s.c.l;
import okhttp3.C0833a;
import okhttp3.E;
import okhttp3.InterfaceC0836d;
import okhttp3.Protocol;
import okhttp3.h;
import okhttp3.i;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.f;
import okhttp3.internal.http2.k;
import okhttp3.j;
import okhttp3.o;
import okhttp3.r;
import okhttp3.u;

/* loaded from: classes2.dex */
public final class c extends f.j implements h {
    private final i b;

    /* renamed from: c, reason: collision with root package name */
    private final E f10512c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f10513d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f10514e;

    /* renamed from: f, reason: collision with root package name */
    private r f10515f;

    /* renamed from: g, reason: collision with root package name */
    private Protocol f10516g;
    private okhttp3.internal.http2.f h;
    private f.g i;
    private f.f j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<g>> n = new ArrayList();
    public long o = LocationRequestCompat.PASSIVE_INTERVAL;

    class a extends okhttp3.F.l.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f10517d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, boolean z, f.g gVar, f.f fVar, g gVar2) {
            super(z, gVar, fVar);
            this.f10517d = gVar2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            g gVar = this.f10517d;
            gVar.o(true, gVar.c(), -1L, null);
        }
    }

    public c(i iVar, E e2) {
        this.b = iVar;
        this.f10512c = e2;
    }

    private void e(int i, int i2, InterfaceC0836d interfaceC0836d, o oVar) throws IOException {
        Proxy c2 = this.f10512c.c();
        this.f10513d = (c2.type() == Proxy.Type.DIRECT || c2.type() == Proxy.Type.HTTP) ? this.f10512c.a().j().createSocket() : new Socket(c2);
        oVar.i(interfaceC0836d, this.f10512c.e(), c2);
        this.f10513d.setSoTimeout(i2);
        try {
            okhttp3.F.h.g.h().g(this.f10513d, this.f10512c.e(), i);
            try {
                z f2 = f.o.f(this.f10513d);
                l.g(f2, "$receiver");
                this.i = new t(f2);
                x d2 = f.o.d(this.f10513d);
                l.g(d2, "$receiver");
                this.j = new s(d2);
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder M = e.a.a.a.a.M("Failed to connect to ");
            M.append(this.f10512c.e());
            ConnectException connectException = new ConnectException(M.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0168, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x016b, code lost:
    
        okhttp3.F.c.h(r19.f10513d);
        r6 = false;
        r19.f10513d = null;
        r19.j = null;
        r19.i = null;
        r24.f(r23, r19.f10512c.e(), r19.f10512c.c(), null);
        r8 = r8 + 1;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0193, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [okhttp3.F.e.g, okhttp3.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(int r20, int r21, int r22, okhttp3.InterfaceC0836d r23, okhttp3.o r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.e.c.f(int, int, int, okhttp3.d, okhttp3.o):void");
    }

    private void g(b bVar, int i, InterfaceC0836d interfaceC0836d, o oVar) throws IOException {
        SSLSocket sSLSocket;
        if (this.f10512c.a().k() == null) {
            List<Protocol> f2 = this.f10512c.a().f();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!f2.contains(protocol)) {
                this.f10514e = this.f10513d;
                this.f10516g = Protocol.HTTP_1_1;
                return;
            } else {
                this.f10514e = this.f10513d;
                this.f10516g = protocol;
                p(i);
                return;
            }
        }
        oVar.x(interfaceC0836d);
        C0833a a2 = this.f10512c.a();
        try {
            try {
                sSLSocket = (SSLSocket) a2.k().createSocket(this.f10513d, a2.m().k(), a2.m().t(), true);
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            j a3 = bVar.a(sSLSocket);
            if (a3.b()) {
                okhttp3.F.h.g.h().f(sSLSocket, a2.m().k(), a2.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            r b = r.b(session);
            if (a2.e().verify(a2.m().k(), session)) {
                a2.a().a(a2.m().k(), b.c());
                String j = a3.b() ? okhttp3.F.h.g.h().j(sSLSocket) : null;
                this.f10514e = sSLSocket;
                z f3 = f.o.f(sSLSocket);
                l.g(f3, "$receiver");
                this.i = new t(f3);
                x d2 = f.o.d(this.f10514e);
                l.g(d2, "$receiver");
                this.j = new s(d2);
                this.f10515f = b;
                this.f10516g = j != null ? Protocol.get(j) : Protocol.HTTP_1_1;
                okhttp3.F.h.g.h().a(sSLSocket);
                oVar.w(interfaceC0836d, this.f10515f);
                if (this.f10516g == Protocol.HTTP_2) {
                    p(i);
                    return;
                }
                return;
            }
            List<Certificate> c2 = b.c();
            if (c2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + a2.m().k() + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) c2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + a2.m().k() + " not verified:\n    certificate: " + okhttp3.f.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + okhttp3.F.k.d.a(x509Certificate));
        } catch (AssertionError e3) {
            e = e3;
            if (!okhttp3.F.c.u(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                okhttp3.F.h.g.h().a(sSLSocket);
            }
            okhttp3.F.c.h(sSLSocket);
            throw th;
        }
    }

    private void p(int i) throws IOException {
        this.f10514e.setSoTimeout(0);
        f.h hVar = new f.h(true);
        hVar.d(this.f10514e, this.f10512c.a().m().k(), this.i, this.j);
        hVar.b(this);
        hVar.c(i);
        okhttp3.internal.http2.f a2 = hVar.a();
        this.h = a2;
        a2.e0();
    }

    @Override // okhttp3.internal.http2.f.j
    public void a(okhttp3.internal.http2.f fVar) {
        synchronized (this.b) {
            this.m = fVar.H();
        }
    }

    @Override // okhttp3.internal.http2.f.j
    public void b(k kVar) throws IOException {
        kVar.d(ErrorCode.REFUSED_STREAM);
    }

    public void c() {
        okhttp3.F.c.h(this.f10513d);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [f.f, f.g, java.net.Socket, okhttp3.Protocol, okhttp3.internal.http2.f, okhttp3.r] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r17, int r18, int r19, int r20, boolean r21, okhttp3.InterfaceC0836d r22, okhttp3.o r23) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.e.c.d(int, int, int, int, boolean, okhttp3.d, okhttp3.o):void");
    }

    public r h() {
        return this.f10515f;
    }

    public boolean i(C0833a c0833a, E e2) {
        if (this.n.size() >= this.m || this.k || !okhttp3.F.a.a.g(this.f10512c.a(), c0833a)) {
            return false;
        }
        if (c0833a.m().k().equals(this.f10512c.a().m().k())) {
            return true;
        }
        if (this.h == null || e2 == null || e2.c().type() != Proxy.Type.DIRECT || this.f10512c.c().type() != Proxy.Type.DIRECT || !this.f10512c.e().equals(e2.e()) || e2.a().e() != okhttp3.F.k.d.a || !q(c0833a.m())) {
            return false;
        }
        try {
            c0833a.a().a(c0833a.m().k(), this.f10515f.c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean j(boolean z) {
        if (this.f10514e.isClosed() || this.f10514e.isInputShutdown() || this.f10514e.isOutputShutdown()) {
            return false;
        }
        okhttp3.internal.http2.f fVar = this.h;
        if (fVar != null) {
            return fVar.G(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f10514e.getSoTimeout();
                try {
                    this.f10514e.setSoTimeout(1);
                    return !this.i.v();
                } finally {
                    this.f10514e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean k() {
        return this.h != null;
    }

    public okhttp3.F.f.c l(okhttp3.x xVar, u.a aVar, g gVar) throws SocketException {
        if (this.h != null) {
            return new okhttp3.internal.http2.e(xVar, aVar, gVar, this.h);
        }
        okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
        this.f10514e.setSoTimeout(fVar.h());
        A c2 = this.i.c();
        long h = fVar.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2.g(h, timeUnit);
        this.j.c().g(fVar.k(), timeUnit);
        return new okhttp3.F.g.a(xVar, gVar, this.i, this.j);
    }

    public okhttp3.F.l.a m(g gVar) {
        return new a(this, true, this.i, this.j, gVar);
    }

    public E n() {
        return this.f10512c;
    }

    public Socket o() {
        return this.f10514e;
    }

    public boolean q(okhttp3.t tVar) {
        if (tVar.t() != this.f10512c.a().m().t()) {
            return false;
        }
        if (tVar.k().equals(this.f10512c.a().m().k())) {
            return true;
        }
        return this.f10515f != null && okhttp3.F.k.d.a.c(tVar.k(), (X509Certificate) this.f10515f.c().get(0));
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Connection{");
        M.append(this.f10512c.a().m().k());
        M.append(Constants.COLON_SEPARATOR);
        M.append(this.f10512c.a().m().t());
        M.append(", proxy=");
        M.append(this.f10512c.c());
        M.append(" hostAddress=");
        M.append(this.f10512c.e());
        M.append(" cipherSuite=");
        r rVar = this.f10515f;
        M.append(rVar != null ? rVar.a() : "none");
        M.append(" protocol=");
        M.append(this.f10516g);
        M.append('}');
        return M.toString();
    }
}
