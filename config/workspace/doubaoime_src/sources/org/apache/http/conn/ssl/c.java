package org.apache.http.conn.ssl;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

@Deprecated
/* loaded from: classes2.dex */
public class c {
    private String a;
    private final Set<KeyManager> b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set<TrustManager> f10751c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    private SecureRandom f10752d;

    static class a implements X509TrustManager {
        private final X509TrustManager a;
        private final g b;

        a(X509TrustManager x509TrustManager, g gVar) {
            this.a = x509TrustManager;
            this.b = gVar;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (this.b.a(x509CertificateArr, str)) {
                return;
            }
            this.a.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.a.getAcceptedIssuers();
        }
    }

    public SSLContext a() throws NoSuchAlgorithmException, KeyManagementException {
        KeyManager[] keyManagerArr;
        String str = this.a;
        if (str == null) {
            str = SSLSocketFactory.TLS;
        }
        SSLContext sSLContext = SSLContext.getInstance(str);
        TrustManager[] trustManagerArr = null;
        if (this.b.isEmpty()) {
            keyManagerArr = null;
        } else {
            Set<KeyManager> set = this.b;
            keyManagerArr = (KeyManager[]) set.toArray(new KeyManager[set.size()]);
        }
        if (!this.f10751c.isEmpty()) {
            Set<TrustManager> set2 = this.f10751c;
            trustManagerArr = (TrustManager[]) set2.toArray(new TrustManager[set2.size()]);
        }
        sSLContext.init(keyManagerArr, trustManagerArr, this.f10752d);
        return sSLContext;
    }

    public c b(KeyStore keyStore, char[] cArr) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers != null) {
            for (KeyManager keyManager : keyManagers) {
                this.b.add(keyManager);
            }
        }
        return this;
    }

    public c c(KeyStore keyStore, g gVar) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (gVar != null) {
                for (int i = 0; i < trustManagers.length; i++) {
                    TrustManager trustManager = trustManagers[i];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i] = new a((X509TrustManager) trustManager, gVar);
                    }
                }
            }
            for (TrustManager trustManager2 : trustManagers) {
                this.f10751c.add(trustManager2);
            }
        }
        return this;
    }

    public c d(SecureRandom secureRandom) {
        this.f10752d = secureRandom;
        return this;
    }

    public c e(String str) {
        this.a = str;
        return this;
    }
}
