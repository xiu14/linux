package okhttp3.F.f;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.B;
import okhttp3.C0833a;
import okhttp3.InterfaceC0836d;
import okhttp3.Request;
import okhttp3.o;
import okhttp3.t;
import okhttp3.u;
import okhttp3.x;

/* loaded from: classes2.dex */
public final class i implements u {

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f10536g = okhttp3.F.c.r("Accept", "Accept-Charset", DownloadHelper.ACCEPT_ENCODING, "Accept-Language", "Authorization", DownloadHelper.CACHE_CONTROL, "Connection", DownloadUtils.CONTENT_LENGTH, DownloadHelper.CONTENT_TYPE, DownloadConstants.HOST, DownloadHelper.IF_MATCH, "If-Modified-Since", DownloadHelper.IF_NONE_MATCH, "If-Range", "If-Unmodified-Since", "Origin", "Pragma", "Proxy-Authorization", "Proxy-Connection", "Range", "Referer", DownloadHelper.TRANSFER_ENCODING, DownloadConstants.USER_AGENT);
    private final x a;
    private volatile okhttp3.F.e.g b;

    /* renamed from: c, reason: collision with root package name */
    private Object f10537c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f10538d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f10539e = -1;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f10540f = false;

    public i(x xVar, boolean z) {
        this.a = xVar;
    }

    private C0833a d(t tVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        okhttp3.f fVar;
        if (tVar.l()) {
            SSLSocketFactory v = this.a.v();
            hostnameVerifier = this.a.k();
            sSLSocketFactory = v;
            fVar = this.a.b();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new C0833a(tVar.k(), tVar.t(), this.a.f(), this.a.u(), sSLSocketFactory, hostnameVerifier, fVar, this.a.r(), this.a.q(), this.a.p(), this.a.d(), this.a.s(), this.a.w());
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private okhttp3.Request e(okhttp3.B r17, okhttp3.E r18, okhttp3.InterfaceC0836d r19, okhttp3.o r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.f.i.e(okhttp3.B, okhttp3.E, okhttp3.d, okhttp3.o):okhttp3.Request");
    }

    private boolean g(IOException iOException, okhttp3.F.e.g gVar, boolean z, Request request) {
        gVar.n(iOException);
        boolean z2 = false;
        if (!this.a.t()) {
            return false;
        }
        if (z) {
            request.body();
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) {
            z2 = true;
        }
        if (!z2) {
            return k(iOException, request);
        }
        if (this.b.g()) {
            return true;
        }
        return k(iOException, request);
    }

    private int h(B b, int i) {
        String p = b.p("Retry-After");
        if (p == null) {
            return i;
        }
        if (p.matches("\\d+")) {
            return Integer.valueOf(p).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean i(B b, t tVar) {
        t url = b.N().url();
        return url.k().equals(tVar.k()) && url.t() == tVar.t() && url.y().equals(tVar.y());
    }

    private boolean k(IOException iOException, Request request) {
        if (this.f10540f) {
            return false;
        }
        this.f10540f = true;
        int c2 = okhttp3.G.e.c(iOException);
        if (!okhttp3.G.a.j().p(iOException, request, c2)) {
            return false;
        }
        this.b.l(c2);
        okhttp3.G.d.a().b(request, true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0141, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r2 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m(okhttp3.InterfaceC0836d r10, okhttp3.Request r11, okhttp3.t r12, boolean r13, okhttp3.Request.a r14, okhttp3.o r15) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.f.i.m(okhttp3.d, okhttp3.Request, okhttp3.t, boolean, okhttp3.Request$a, okhttp3.o):void");
    }

    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        B g2;
        Request e2;
        f fVar = (f) aVar;
        Request i = fVar.i();
        InterfaceC0836d a = fVar.a();
        o d2 = fVar.d();
        okhttp3.F.e.g gVar = new okhttp3.F.e.g(this.a.c(), d(i.url()), a, d2, this.f10537c);
        this.b = gVar;
        int i2 = 0;
        B b = null;
        while (!this.f10538d) {
            try {
                try {
                    g2 = fVar.g(i, gVar, null, null);
                    if (b != null) {
                        B.a G = g2.G();
                        B.a G2 = b.G();
                        G2.b(null);
                        G.l(G2.c());
                        g2 = G.c();
                    }
                    try {
                        e2 = e(g2, gVar.m(), a, d2);
                    } catch (IOException e3) {
                        gVar.j();
                        throw e3;
                    }
                } catch (IOException e4) {
                    if (!g(e4, gVar, !(e4 instanceof okhttp3.internal.http2.a), i)) {
                        throw e4;
                    }
                } catch (okhttp3.F.e.e e5) {
                    if (!g(e5.c(), gVar, false, i)) {
                        throw e5.b();
                    }
                }
                if (e2 == null) {
                    gVar.j();
                    return g2;
                }
                okhttp3.F.c.g(g2.a());
                int i3 = i2 + 1;
                if (i3 > 20) {
                    gVar.j();
                    throw new ProtocolException(e.a.a.a.a.j("Too many follow-up requests: ", i3));
                }
                e2.body();
                if (!i(g2, e2.url())) {
                    gVar.j();
                    gVar = new okhttp3.F.e.g(this.a.c(), d(e2.url()), a, d2, this.f10537c);
                    this.b = gVar;
                } else if (gVar.c() != null) {
                    throw new IllegalStateException("Closing the body of " + g2 + " didn't close its backing stream. Bad interceptor?");
                }
                b = g2;
                i = e2;
                i2 = i3;
            } catch (Throwable th) {
                gVar.n(null);
                gVar.j();
                throw th;
            }
        }
        gVar.j();
        StringBuilder M = e.a.a.a.a.M("Canceled#Reason=");
        M.append(this.f10539e);
        throw new IOException(M.toString());
    }

    public void b(int i) {
        this.f10539e = i;
        this.f10538d = true;
        okhttp3.F.e.g gVar = this.b;
        if (gVar != null) {
            gVar.b(i);
        }
    }

    public boolean c() {
        return this.f10538d;
    }

    public boolean f() {
        return this.f10538d;
    }

    public void j(Object obj) {
        this.f10537c = obj;
    }

    public okhttp3.F.e.g l() {
        return this.b;
    }
}
