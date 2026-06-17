package com.huawei.e.a.a.b.f;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public class a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            com.huawei.e.a.a.b.g.b.d("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            c.a(str, x509Certificate, true);
            com.huawei.e.a.a.b.g.c.a();
            return true;
        } catch (SSLException e2) {
            StringBuilder M = e.a.a.a.a.M("SSLException : ");
            M.append(e2.getMessage());
            com.huawei.e.a.a.b.g.b.c("", M.toString());
            return false;
        }
    }
}
