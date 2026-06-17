package com.huawei.hianalytics.h;

import android.content.Context;
import java.io.InputStream;
import java.security.KeyStore;
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
public class f implements X509TrustManager {
    protected List<X509TrustManager> a = new ArrayList();

    public f() {
        Context s = com.huawei.hianalytics.e.a.a().f().s();
        if (s == null) {
            throw new IllegalArgumentException("context is null");
        }
        InputStream inputStream = null;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            KeyStore keyStore = KeyStore.getInstance("bks");
            inputStream = s.getAssets().open("hianalyticscas.bks");
            inputStream.reset();
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.a.add((X509TrustManager) trustManager);
                }
            }
            if (this.a.isEmpty()) {
                throw new CertificateException("X509TrustManager is empty");
            }
        } finally {
            com.huawei.hianalytics.util.f.a(7, inputStream);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (this.a.isEmpty()) {
            throw new CertificateException("checkClientTrusted CertificateException");
        }
        this.a.get(0).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (this.a.isEmpty()) {
            throw new CertificateException("checkServerTrusted CertificateException");
        }
        this.a.get(0).checkServerTrusted(x509CertificateArr, str);
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
            com.huawei.hianalytics.g.b.d("SecureX509TrustManager", "getAcceptedIssuers exception : " + e2.getMessage());
            return new X509Certificate[0];
        }
    }
}
