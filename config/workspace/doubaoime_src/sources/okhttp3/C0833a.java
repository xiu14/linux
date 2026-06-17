package okhttp3;

import com.xiaomi.mipush.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.t;

/* renamed from: okhttp3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0833a {
    final t a;
    final n b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f10591c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0834b f10592d;

    /* renamed from: e, reason: collision with root package name */
    final List<Protocol> f10593e;

    /* renamed from: f, reason: collision with root package name */
    final List<j> f10594f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f10595g;
    final Proxy h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final f k;
    okhttp3.G.b l;

    public C0833a(String str, int i, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, InterfaceC0834b interfaceC0834b, Proxy proxy, List<Protocol> list, List<j> list2, ProxySelector proxySelector, okhttp3.G.b bVar) {
        t.a aVar = new t.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException(e.a.a.a.a.s("unexpected scheme: ", str2));
            }
            aVar.a = "https";
        }
        Objects.requireNonNull(str, "host == null");
        String d2 = okhttp3.F.c.d(t.p(str, 0, str.length(), false));
        if (d2 == null) {
            throw new IllegalArgumentException(e.a.a.a.a.s("unexpected host: ", str));
        }
        aVar.f10716d = d2;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(e.a.a.a.a.j("unexpected port: ", i));
        }
        aVar.f10717e = i;
        this.a = aVar.b();
        Objects.requireNonNull(nVar, "dns == null");
        this.b = nVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f10591c = socketFactory;
        Objects.requireNonNull(interfaceC0834b, "proxyAuthenticator == null");
        this.f10592d = interfaceC0834b;
        Objects.requireNonNull(list, "protocols == null");
        this.f10593e = okhttp3.F.c.q(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f10594f = okhttp3.F.c.q(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f10595g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = fVar;
        this.l = bVar;
    }

    public f a() {
        return this.k;
    }

    public List<j> b() {
        return this.f10594f;
    }

    public n c() {
        return this.b;
    }

    boolean d(C0833a c0833a) {
        return this.b.equals(c0833a.b) && this.f10592d.equals(c0833a.f10592d) && this.f10593e.equals(c0833a.f10593e) && this.f10594f.equals(c0833a.f10594f) && this.f10595g.equals(c0833a.f10595g) && okhttp3.F.c.n(this.h, c0833a.h) && okhttp3.F.c.n(this.i, c0833a.i) && okhttp3.F.c.n(this.j, c0833a.j) && okhttp3.F.c.n(this.k, c0833a.k) && this.a.f10712e == c0833a.a.f10712e;
    }

    public HostnameVerifier e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0833a) {
            C0833a c0833a = (C0833a) obj;
            if (this.a.equals(c0833a.a) && d(c0833a)) {
                return true;
            }
        }
        return false;
    }

    public List<Protocol> f() {
        return this.f10593e;
    }

    public Proxy g() {
        return this.h;
    }

    public InterfaceC0834b h() {
        return this.f10592d;
    }

    public int hashCode() {
        int hashCode = (this.f10595g.hashCode() + ((this.f10594f.hashCode() + ((this.f10593e.hashCode() + ((this.f10592d.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.k;
        return hashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public ProxySelector i() {
        return this.f10595g;
    }

    public SocketFactory j() {
        return this.f10591c;
    }

    public SSLSocketFactory k() {
        return this.i;
    }

    public okhttp3.G.b l() {
        return this.l;
    }

    public t m() {
        return this.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Address{");
        M.append(this.a.f10711d);
        M.append(Constants.COLON_SEPARATOR);
        M.append(this.a.f10712e);
        if (this.h != null) {
            M.append(", proxy=");
            M.append(this.h);
        } else {
            M.append(", proxySelector=");
            M.append(this.f10595g);
        }
        M.append("}");
        return M.toString();
    }
}
