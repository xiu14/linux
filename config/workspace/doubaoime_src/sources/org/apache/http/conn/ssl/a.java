package org.apache.http.conn.ssl;

import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import g.a.a.a.i;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
/* loaded from: classes2.dex */
public abstract class a implements X509HostnameVerifier {
    static final String[] b;
    private final g.a.a.a.a a = i.f(getClass());

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", DBDefinition.SEGMENT_INFO, "lg", "ne", "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    private static boolean a(String str, String str2, boolean z) {
        boolean endsWith;
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str2.toLowerCase(locale);
        String[] split = lowerCase2.split("\\.");
        if (!(split.length >= 3 && split[0].endsWith("*") && (!z || b(split)))) {
            return lowerCase.equals(lowerCase2);
        }
        String str3 = split[0];
        if (str3.length() > 1) {
            String substring = str3.substring(0, str3.length() - 1);
            endsWith = lowerCase.startsWith(substring) && lowerCase.substring(substring.length()).endsWith(lowerCase2.substring(str3.length()));
        } else {
            endsWith = lowerCase.endsWith(lowerCase2.substring(1));
        }
        if (endsWith) {
            return !z || countDots(lowerCase) == countDots(lowerCase2);
        }
        return false;
    }

    public static boolean acceptableCountryWildcard(String str) {
        return b(str.split("\\."));
    }

    private static boolean b(String[] strArr) {
        return (strArr.length == 3 && strArr[2].length() == 2 && Arrays.binarySearch(b, strArr[1]) >= 0) ? false : true;
    }

    public static int countDots(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static String[] getCNs(X509Certificate x509Certificate) {
        try {
            String a = DefaultHostnameVerifier.a(x509Certificate.getSubjectX500Principal().toString());
            if (a != null) {
                return new String[]{a};
            }
            return null;
        } catch (SSLException unused) {
            return null;
        }
    }

    public static String[] getDNSSubjectAlts(X509Certificate x509Certificate) {
        List<f> b2 = DefaultHostnameVerifier.b(x509Certificate);
        if (b2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (f fVar : b2) {
            if (fVar.a() == 2) {
                arrayList.add(fVar.b());
            }
        }
        if (arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, SSLSocket sSLSocket) throws IOException {
        d.j(str, DownloadConstants.HOST);
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        verify(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e2) {
            if (this.a.b()) {
                this.a.a(e2.getMessage(), e2);
            }
            return false;
        }
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, X509Certificate x509Certificate) throws SSLException {
        List<f> b2 = DefaultHostnameVerifier.b(x509Certificate);
        ArrayList arrayList = new ArrayList();
        if (!org.apache.http.conn.util.a.a(str) && !org.apache.http.conn.util.a.b(str)) {
            for (f fVar : b2) {
                if (fVar.a() == 2) {
                    arrayList.add(fVar.b());
                }
            }
        } else {
            for (f fVar2 : b2) {
                if (fVar2.a() == 7) {
                    arrayList.add(fVar2.b());
                }
            }
        }
        String a = DefaultHostnameVerifier.a(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        verify(str, a != null ? new String[]{a} : null, arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void verify(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        List<String> list = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            list = Arrays.asList(strArr2);
        }
        String c2 = org.apache.http.conn.util.a.b(str) ? DefaultHostnameVerifier.c(str.toLowerCase(Locale.ROOT)) : str;
        if (list == null) {
            if (str2 != null) {
                if (!a(c2, org.apache.http.conn.util.a.b(str2) ? DefaultHostnameVerifier.c(str2) : str2, z)) {
                    throw new SSLException(e.a.a.a.a.v("Certificate for <", str, "> doesn't match ", "common name of the certificate subject: ", str2));
                }
                return;
            }
            throw new SSLException(e.a.a.a.a.u("Certificate subject for <", str, "> doesn't contain ", "a common name and does not have alternative names"));
        }
        for (String str3 : list) {
            if (org.apache.http.conn.util.a.b(str3)) {
                str3 = DefaultHostnameVerifier.c(str3);
            }
            if (a(c2, str3, z)) {
                return;
            }
        }
        throw new SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }
}
