package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public final class r {
    private final TlsVersion a;
    private final g b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f10708c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Certificate> f10709d;

    private r(TlsVersion tlsVersion, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.a = tlsVersion;
        this.b = gVar;
        this.f10708c = list;
        this.f10709d = list2;
    }

    public static r b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g a = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        TlsVersion forJavaName = TlsVersion.forJavaName(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List r = certificateArr != null ? okhttp3.F.c.r(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new r(forJavaName, a, r, localCertificates != null ? okhttp3.F.c.r(localCertificates) : Collections.emptyList());
    }

    public g a() {
        return this.b;
    }

    public List<Certificate> c() {
        return this.f10708c;
    }

    public TlsVersion d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b) && this.f10708c.equals(rVar.f10708c) && this.f10709d.equals(rVar.f10709d);
    }

    public int hashCode() {
        return this.f10709d.hashCode() + ((this.f10708c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
