package okhttp3;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.B;
import okhttp3.g;
import okhttp3.o;
import okhttp3.s;

/* loaded from: classes2.dex */
public class x implements Cloneable {
    static final List<Protocol> D = okhttp3.F.c.r(Protocol.HTTP_2, Protocol.HTTP_1_1);
    static final List<j> E = okhttp3.F.c.r(j.i, j.k);
    final int A;
    final okhttp3.G.b B;
    final boolean C;
    final m a;
    final Proxy b;

    /* renamed from: c, reason: collision with root package name */
    final List<Protocol> f10730c;

    /* renamed from: d, reason: collision with root package name */
    final List<j> f10731d;

    /* renamed from: e, reason: collision with root package name */
    final List<u> f10732e;

    /* renamed from: f, reason: collision with root package name */
    final List<u> f10733f;

    /* renamed from: g, reason: collision with root package name */
    final o.b f10734g;
    final ProxySelector h;
    final l i;
    final okhttp3.F.d.e j;
    final SocketFactory k;
    final SSLSocketFactory l;
    final okhttp3.F.k.c m;
    final HostnameVerifier n;
    final f o;
    final InterfaceC0834b p;
    final InterfaceC0834b q;
    final i r;
    final n s;
    final boolean t;
    final boolean u;
    final boolean v;
    final int w;
    final int x;
    final int y;
    final int z;

    static class a extends okhttp3.F.a {
        a() {
        }

        @Override // okhttp3.F.a
        public void a(s.a aVar, String str) {
            int indexOf = str.indexOf(Constants.COLON_SEPARATOR, 1);
            if (indexOf != -1) {
                aVar.b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return;
            }
            if (!str.startsWith(Constants.COLON_SEPARATOR)) {
                aVar.a.add("");
                aVar.a.add(str.trim());
            } else {
                String substring = str.substring(1);
                aVar.a.add("");
                aVar.a.add(substring.trim());
            }
        }

        @Override // okhttp3.F.a
        public void b(s.a aVar, String str, String str2) {
            aVar.a.add(str);
            aVar.a.add(str2.trim());
        }

        @Override // okhttp3.F.a
        public void c(j jVar, SSLSocket sSLSocket, boolean z) {
            String[] t = jVar.f10696c != null ? okhttp3.F.c.t(g.b, sSLSocket.getEnabledCipherSuites(), jVar.f10696c) : sSLSocket.getEnabledCipherSuites();
            String[] t2 = jVar.f10697d != null ? okhttp3.F.c.t(okhttp3.F.c.p, sSLSocket.getEnabledProtocols(), jVar.f10697d) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            Comparator<String> comparator = g.b;
            byte[] bArr = okhttp3.F.c.a;
            int length = supportedCipherSuites.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else {
                    if (((g.a) comparator).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z && i != -1) {
                String str = supportedCipherSuites[i];
                int length2 = t.length + 1;
                String[] strArr = new String[length2];
                System.arraycopy(t, 0, strArr, 0, t.length);
                strArr[length2 - 1] = str;
                t = strArr;
            }
            boolean z2 = jVar.a;
            if (!z2) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (t.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            String[] strArr2 = (String[]) t.clone();
            if (!z2) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (t2.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            String[] strArr3 = (String[]) t2.clone();
            if (strArr3 != null) {
                sSLSocket.setEnabledProtocols(strArr3);
            }
            if (strArr2 != null) {
                sSLSocket.setEnabledCipherSuites(strArr2);
            }
        }

        @Override // okhttp3.F.a
        public int d(B.a aVar) {
            return aVar.f10490c;
        }

        @Override // okhttp3.F.a
        public boolean e(i iVar, okhttp3.F.e.c cVar) {
            return iVar.b(cVar);
        }

        @Override // okhttp3.F.a
        public Socket f(i iVar, C0833a c0833a, okhttp3.F.e.g gVar) {
            return iVar.c(c0833a, gVar);
        }

        @Override // okhttp3.F.a
        public boolean g(C0833a c0833a, C0833a c0833a2) {
            return c0833a.d(c0833a2);
        }

        @Override // okhttp3.F.a
        public okhttp3.F.e.c h(i iVar, C0833a c0833a, okhttp3.F.e.g gVar, E e2) {
            return iVar.d(c0833a, gVar, e2);
        }

        @Override // okhttp3.F.a
        public InterfaceC0836d i(x xVar, Request request) {
            return y.e(xVar, request, true);
        }

        @Override // okhttp3.F.a
        public void j(i iVar, okhttp3.F.e.c cVar) {
            iVar.f(cVar);
        }

        @Override // okhttp3.F.a
        public okhttp3.F.e.d k(i iVar) {
            return iVar.f10610e;
        }

        @Override // okhttp3.F.a
        public okhttp3.F.e.g l(InterfaceC0836d interfaceC0836d) {
            return ((y) interfaceC0836d).b.l();
        }

        @Override // okhttp3.F.a
        public IOException m(InterfaceC0836d interfaceC0836d, IOException iOException) {
            return ((y) interfaceC0836d).g(iOException);
        }
    }

    static {
        okhttp3.F.a.a = new a();
    }

    public x() {
        this(new b());
    }

    public InterfaceC0834b a() {
        return this.q;
    }

    public f b() {
        return this.o;
    }

    public i c() {
        return this.r;
    }

    public List<j> d() {
        return this.f10731d;
    }

    public l e() {
        return this.i;
    }

    public n f() {
        return this.s;
    }

    public boolean g() {
        return this.C;
    }

    public o.b h() {
        return this.f10734g;
    }

    public boolean i() {
        return this.u;
    }

    public boolean j() {
        return this.t;
    }

    public HostnameVerifier k() {
        return this.n;
    }

    public b l() {
        return new b(this);
    }

    public InterfaceC0836d m(Request request) {
        return y.e(this, request, false);
    }

    public int n() {
        return this.A;
    }

    public int o(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (okhttp3.G.a.j().c().contains(str + Constants.COLON_SEPARATOR + i)) {
                return okhttp3.G.a.j().d();
            }
        }
        return this.A;
    }

    public List<Protocol> p() {
        return this.f10730c;
    }

    public Proxy q() {
        return this.b;
    }

    public InterfaceC0834b r() {
        return this.p;
    }

    public ProxySelector s() {
        return this.h;
    }

    public boolean t() {
        return this.v;
    }

    public SocketFactory u() {
        return this.k;
    }

    public SSLSocketFactory v() {
        return this.l;
    }

    public okhttp3.G.b w() {
        return this.B;
    }

    x(b bVar) {
        boolean z;
        this.a = bVar.a;
        this.b = bVar.b;
        this.f10730c = bVar.f10735c;
        List<j> list = bVar.f10736d;
        this.f10731d = list;
        this.f10732e = okhttp3.F.c.q(bVar.f10737e);
        this.f10733f = okhttp3.F.c.q(bVar.f10738f);
        this.f10734g = bVar.f10739g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        Iterator<j> it2 = list.iterator();
        loop0: while (true) {
            z = false;
            while (it2.hasNext()) {
                z = (z || it2.next().a) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.l;
        if (sSLSocketFactory == null && z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    SSLContext i = okhttp3.F.h.g.h().i();
                    i.init(null, new TrustManager[]{x509TrustManager}, null);
                    this.l = i.getSocketFactory();
                    this.m = okhttp3.F.h.g.h().c(x509TrustManager);
                } catch (GeneralSecurityException e2) {
                    throw okhttp3.F.c.b("No System TLS", e2);
                }
            } catch (GeneralSecurityException e3) {
                throw okhttp3.F.c.b("No System TLS", e3);
            }
        } else {
            this.l = sSLSocketFactory;
            this.m = bVar.m;
        }
        if (this.l != null) {
            okhttp3.F.h.g.h().e(this.l);
        }
        this.n = bVar.n;
        this.o = bVar.o.c(this.m);
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = bVar.t;
        this.u = bVar.u;
        this.v = bVar.v;
        this.w = bVar.w;
        this.x = bVar.x;
        this.y = bVar.y;
        this.z = bVar.z;
        this.A = bVar.A;
        this.B = bVar.B;
        this.C = bVar.C;
        if (this.f10732e.contains(null)) {
            StringBuilder M = e.a.a.a.a.M("Null interceptor: ");
            M.append(this.f10732e);
            throw new IllegalStateException(M.toString());
        }
        if (this.f10733f.contains(null)) {
            StringBuilder M2 = e.a.a.a.a.M("Null network interceptor: ");
            M2.append(this.f10733f);
            throw new IllegalStateException(M2.toString());
        }
    }

    public static final class b {
        int A;
        okhttp3.G.b B;
        boolean C;
        m a;
        Proxy b;

        /* renamed from: c, reason: collision with root package name */
        List<Protocol> f10735c;

        /* renamed from: d, reason: collision with root package name */
        List<j> f10736d;

        /* renamed from: e, reason: collision with root package name */
        final List<u> f10737e;

        /* renamed from: f, reason: collision with root package name */
        final List<u> f10738f;

        /* renamed from: g, reason: collision with root package name */
        o.b f10739g;
        ProxySelector h;
        l i;
        okhttp3.F.d.e j;
        SocketFactory k;
        SSLSocketFactory l;
        okhttp3.F.k.c m;
        HostnameVerifier n;
        f o;
        InterfaceC0834b p;
        InterfaceC0834b q;
        i r;
        n s;
        boolean t;
        boolean u;
        boolean v;
        int w;
        int x;
        int y;
        int z;

        public b() {
            this.f10737e = new ArrayList();
            this.f10738f = new ArrayList();
            this.a = new m();
            this.f10735c = x.D;
            this.f10736d = x.E;
            this.f10739g = new p(o.a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new okhttp3.F.i.a();
            }
            this.i = l.a;
            this.k = SocketFactory.getDefault();
            this.n = okhttp3.F.k.d.a;
            this.o = f.f10601c;
            InterfaceC0834b interfaceC0834b = InterfaceC0834b.a;
            this.p = interfaceC0834b;
            this.q = interfaceC0834b;
            this.r = new i(5, 5L, TimeUnit.MINUTES);
            this.s = n.a;
            this.t = true;
            this.u = true;
            this.v = true;
            this.w = 0;
            this.x = 10000;
            this.y = 10000;
            this.z = 10000;
            this.A = 0;
            this.B = null;
            this.C = false;
        }

        public b a(u uVar) {
            if (uVar == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f10737e.add(uVar);
            return this;
        }

        public b b(u uVar) {
            this.f10738f.add(uVar);
            return this;
        }

        public x c() {
            return new x(this);
        }

        public b d(long j, TimeUnit timeUnit) {
            this.x = okhttp3.F.c.e("timeout", j, timeUnit);
            return this;
        }

        public b e(i iVar) {
            this.r = iVar;
            return this;
        }

        public b f(List<j> list) {
            this.f10736d = okhttp3.F.c.q(list);
            return this;
        }

        public b g(l lVar) {
            this.i = lVar;
            return this;
        }

        public b h(m mVar) {
            this.a = mVar;
            return this;
        }

        public b i(n nVar) {
            this.s = nVar;
            return this;
        }

        public b j(boolean z) {
            this.C = z;
            return this;
        }

        public b k(o oVar) {
            this.f10739g = new p(oVar);
            return this;
        }

        public b l(boolean z) {
            this.u = z;
            return this;
        }

        public b m(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(Protocol.SPDY_3);
            this.f10735c = Collections.unmodifiableList(arrayList);
            return this;
        }

        public b n(Proxy proxy) {
            this.b = proxy;
            return this;
        }

        public b o(long j, TimeUnit timeUnit) {
            this.y = okhttp3.F.c.e("timeout", j, timeUnit);
            return this;
        }

        public b p(boolean z) {
            this.v = z;
            return this;
        }

        public b q(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            Objects.requireNonNull(x509TrustManager, "trustManager == null");
            this.l = sSLSocketFactory;
            this.m = okhttp3.F.h.g.h().c(x509TrustManager);
            return this;
        }

        public b r(okhttp3.G.b bVar) {
            Objects.requireNonNull(bVar, "ttnetDns == null");
            this.B = bVar;
            return this;
        }

        public b s(long j, TimeUnit timeUnit) {
            this.z = okhttp3.F.c.e("timeout", j, timeUnit);
            return this;
        }

        b(x xVar) {
            ArrayList arrayList = new ArrayList();
            this.f10737e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f10738f = arrayList2;
            this.a = xVar.a;
            this.b = xVar.b;
            this.f10735c = xVar.f10730c;
            this.f10736d = xVar.f10731d;
            arrayList.addAll(xVar.f10732e);
            arrayList2.addAll(xVar.f10733f);
            this.f10739g = xVar.f10734g;
            this.h = xVar.h;
            this.i = xVar.i;
            this.j = xVar.j;
            this.k = xVar.k;
            this.l = xVar.l;
            this.m = xVar.m;
            this.n = xVar.n;
            this.o = xVar.o;
            this.p = xVar.p;
            this.q = xVar.q;
            this.r = xVar.r;
            this.s = xVar.s;
            this.t = xVar.t;
            this.u = xVar.u;
            this.v = xVar.v;
            this.w = xVar.w;
            this.x = xVar.x;
            this.y = xVar.y;
            this.z = xVar.z;
            this.A = xVar.A;
            this.B = xVar.B;
            this.C = xVar.C;
        }
    }
}
