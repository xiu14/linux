package com.ttnet.org.chromium.net;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public class H {
    private static CertificateFactory a;
    private static X509TrustManagerExtensions b;

    /* renamed from: c, reason: collision with root package name */
    private static b f8600c;

    /* renamed from: d, reason: collision with root package name */
    private static X509TrustManagerExtensions f8601d;

    /* renamed from: e, reason: collision with root package name */
    private static KeyStore f8602e;

    /* renamed from: f, reason: collision with root package name */
    private static KeyStore f8603f;

    /* renamed from: g, reason: collision with root package name */
    private static File f8604g;
    private static Set<Pair<X500Principal, PublicKey>> h;
    private static boolean i;
    private static final Object j = new Object();
    private static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static final class b extends BroadcastReceiver {
        b(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) || "android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) || ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                try {
                    H.a();
                } catch (KeyStoreException e2) {
                    com.ttnet.org.chromium.base.d.a("X509Util", "Unable to reload the default TrustManager", e2);
                } catch (NoSuchAlgorithmException e3) {
                    com.ttnet.org.chromium.base.d.a("X509Util", "Unable to reload the default TrustManager", e3);
                } catch (CertificateException e4) {
                    com.ttnet.org.chromium.base.d.a("X509Util", "Unable to reload the default TrustManager", e4);
                }
            }
        }
    }

    static void a() throws KeyStoreException, NoSuchAlgorithmException, CertificateException {
        synchronized (j) {
            b = null;
            h = null;
            h();
        }
        N.MzV1TXLS();
    }

    public static void b(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        g();
        X509Certificate e2 = e(bArr);
        synchronized (j) {
            f8602e.setCertificateEntry("root_cert_" + Integer.toString(f8602e.size()), e2);
            f8601d = f(f8602e);
        }
    }

    private static List<X509Certificate> c(X509TrustManagerExtensions x509TrustManagerExtensions, X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        try {
            return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (RuntimeException e2) {
            com.ttnet.org.chromium.base.d.a("X509Util", "checkServerTrusted() unexpectedly threw: %s", e2);
            throw new CertificateException(e2);
        }
    }

    public static void d() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        g();
        synchronized (j) {
            try {
                f8602e.load(null);
                f8601d = f(f8602e);
            } catch (IOException unused) {
            }
        }
    }

    public static X509Certificate e(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        g();
        return (X509Certificate) a.generateCertificate(new ByteArrayInputStream(bArr));
    }

    private static X509TrustManagerExtensions f(KeyStore keyStore) throws KeyStoreException, NoSuchAlgorithmException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e2) {
                        com.ttnet.org.chromium.base.d.a("X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e2, new Object[0]);
                    }
                }
            }
            com.ttnet.org.chromium.base.d.a("X509Util", "Could not find suitable trust manager", new Object[0]);
            return null;
        } catch (RuntimeException e3) {
            com.ttnet.org.chromium.base.d.a("X509Util", "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e3);
            throw new KeyStoreException(e3);
        }
    }

    private static void g() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        synchronized (j) {
            h();
        }
    }

    private static void h() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        if (a == null) {
            a = CertificateFactory.getInstance("X.509");
        }
        if (b == null) {
            b = f(null);
        }
        if (!i) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                f8603f = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                f8604g = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            i = true;
        }
        if (h == null) {
            h = new HashSet();
        }
        if (f8602e == null) {
            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
            f8602e = keyStore2;
            try {
                keyStore2.load(null);
            } catch (IOException unused3) {
            }
        }
        if (f8601d == null) {
            f8601d = f(f8602e);
        }
        if (f8600c == null) {
            f8600c = new b(null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
            intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
            intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            com.ttnet.org.chromium.base.c.d(com.ttnet.org.chromium.base.c.b(), f8600c, intentFilter);
        }
    }

    private static boolean i(X509Certificate x509Certificate) throws NoSuchAlgorithmException, KeyStoreException {
        if (f8603f == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (h.contains(pair)) {
            return true;
        }
        byte[] digest = MessageDigest.getInstance("MD5").digest(x509Certificate.getSubjectX500Principal().getEncoded());
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 * 2;
            char[] cArr2 = k;
            int i4 = 3 - i2;
            cArr[i3] = cArr2[(digest[i4] >> 4) & 15];
            cArr[i3 + 1] = cArr2[digest[i4] & 15];
        }
        String str = new String(cArr);
        int i5 = 0;
        while (true) {
            String str2 = str + '.' + i5;
            if (!new File(f8604g, str2).exists()) {
                return false;
            }
            Certificate certificate = f8603f.getCertificate("system:" + str2);
            if (certificate != null) {
                if (certificate instanceof X509Certificate) {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        h.add(pair);
                        return true;
                    }
                } else {
                    com.ttnet.org.chromium.base.d.a("X509Util", e.a.a.a.a.u("Anchor ", str2, " not an X509Certificate: ", certificate.getClass().getName()), new Object[0]);
                }
            }
            i5++;
        }
    }

    static boolean j(X509Certificate x509Certificate) throws CertificateException {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (String str : extendedKeyUsage) {
            if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1") || str.equals("1.3.6.1.4.1.311.10.3.3")) {
                return true;
            }
        }
        return false;
    }

    public static AndroidCertVerifyResult k(byte[][] bArr, String str, String str2) throws KeyStoreException, NoSuchAlgorithmException {
        List<X509Certificate> c2;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            StringBuilder M = e.a.a.a.a.M("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=");
            M.append(Arrays.deepToString(bArr));
            throw new IllegalArgumentException(M.toString());
        }
        try {
            g();
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(e(bArr[0]));
                for (int i2 = 1; i2 < bArr.length; i2++) {
                    try {
                        arrayList.add(e(bArr[i2]));
                    } catch (CertificateException unused) {
                        com.ttnet.org.chromium.base.d.f("X509Util", e.a.a.a.a.k("intermediate ", i2, " failed parsing"), new Object[0]);
                    }
                }
                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!j(x509CertificateArr[0])) {
                        return new AndroidCertVerifyResult(-6);
                    }
                    synchronized (j) {
                        X509TrustManagerExtensions x509TrustManagerExtensions = b;
                        if (x509TrustManagerExtensions == null) {
                            return new AndroidCertVerifyResult(-1);
                        }
                        try {
                            c2 = c(x509TrustManagerExtensions, x509CertificateArr, str, str2);
                        } catch (CertificateException e2) {
                            try {
                                c2 = c(f8601d, x509CertificateArr, str, str2);
                            } catch (CertificateException unused2) {
                                com.ttnet.org.chromium.base.d.d("X509Util", "Failed to validate the certificate chain, error: " + e2.getMessage(), new Object[0]);
                                return new AndroidCertVerifyResult(-2);
                            }
                        }
                        return new AndroidCertVerifyResult(0, c2.size() > 0 ? i(c2.get(c2.size() - 1)) : false, c2);
                    }
                } catch (CertificateExpiredException unused3) {
                    return new AndroidCertVerifyResult(-3);
                } catch (CertificateNotYetValidException unused4) {
                    return new AndroidCertVerifyResult(-4);
                } catch (CertificateException unused5) {
                    return new AndroidCertVerifyResult(-1);
                }
            } catch (CertificateException unused6) {
                return new AndroidCertVerifyResult(-5);
            }
        } catch (CertificateException unused7) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
