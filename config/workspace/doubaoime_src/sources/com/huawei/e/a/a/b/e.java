package com.huawei.e.a.a.b;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public class e implements X509TrustManager {
    protected List<X509TrustManager> a = new ArrayList();

    public e(InputStream inputStream, String str) throws IllegalArgumentException {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, str.toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (int i = 0; i < trustManagers.length; i++) {
                    if (trustManagers[i] instanceof X509TrustManager) {
                        this.a.add((X509TrustManager) trustManagers[i]);
                    }
                }
                com.bytedance.feedbackerlib.a.a(inputStream);
            } finally {
                com.bytedance.feedbackerlib.a.a(inputStream);
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            com.huawei.e.a.a.b.g.b.c("SX509TM", "loadInputStream: exception : " + e2.getMessage());
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        com.huawei.e.a.a.b.g.b.d("SX509TM", "checkClientTrusted: ");
        Iterator<X509TrustManager> it2 = this.a.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e2) {
                StringBuilder M = e.a.a.a.a.M("checkServerTrusted CertificateException");
                M.append(e2.getMessage());
                com.huawei.e.a.a.b.g.b.c("SX509TM", M.toString());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        StringBuilder M = e.a.a.a.a.M("checkServerTrusted begin,size=");
        M.append(x509CertificateArr.length);
        M.append(",authType=");
        M.append(str);
        com.huawei.e.a.a.b.g.b.d("SX509TM", M.toString());
        System.currentTimeMillis();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                com.huawei.e.a.a.b.g.b.d("SX509TM", "check server i=" + i);
                X509TrustManager x509TrustManager = this.a.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    com.huawei.e.a.a.b.g.b.d("SX509TM", "client root ca size=" + acceptedIssuers.length);
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                com.huawei.e.a.a.b.g.b.d("SX509TM", "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e2) {
                StringBuilder M2 = e.a.a.a.a.M("checkServerTrusted error :");
                M2.append(e2.getMessage());
                M2.append(" , time : ");
                M2.append(i);
                com.huawei.e.a.a.b.g.b.c("SX509TM", M2.toString());
                if (i == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        StringBuilder M3 = e.a.a.a.a.M("root ca issuer : ");
                        M3.append(x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                        com.huawei.e.a.a.b.g.b.c("SX509TM", M3.toString());
                    }
                    throw e2;
                }
            }
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it2 = this.a.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(Arrays.asList(it2.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("getAcceptedIssuers exception : ");
            M.append(e2.getMessage());
            com.huawei.e.a.a.b.g.b.c("SX509TM", M.toString());
            return new X509Certificate[0];
        }
    }
}
