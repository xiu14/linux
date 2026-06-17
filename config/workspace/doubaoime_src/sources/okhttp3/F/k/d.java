package okhttp3.F.k;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public final class d implements HostnameVerifier {
    public static final d a = new d();

    private d() {
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> b = b(x509Certificate, 7);
        List<String> b2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b2.size() + b.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    private static List<String> b(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:1: B:15:0x0034->B:44:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
            r9 = this;
            boolean r0 = okhttp3.F.c.C(r10)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L25
            r0 = 7
            java.util.List r11 = b(r11, r0)
            int r0 = r11.size()
            r3 = r1
        L12:
            if (r3 >= r0) goto Le4
            java.lang.Object r4 = r11.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r10.equalsIgnoreCase(r4)
            if (r4 == 0) goto L22
            goto Le3
        L22:
            int r3 = r3 + 1
            goto L12
        L25:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r10.toLowerCase(r0)
            r0 = 2
            java.util.List r11 = b(r11, r0)
            java.util.Iterator r11 = r11.iterator()
        L34:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r10 == 0) goto Le0
            int r3 = r10.length()
            if (r3 == 0) goto Le0
            java.lang.String r3 = "."
            boolean r4 = r10.startsWith(r3)
            if (r4 != 0) goto Le0
            java.lang.String r4 = ".."
            boolean r5 = r10.endsWith(r4)
            if (r5 == 0) goto L5a
            goto Le0
        L5a:
            if (r0 == 0) goto Le0
            int r5 = r0.length()
            if (r5 == 0) goto Le0
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto Le0
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L70
            goto Le0
        L70:
            boolean r4 = r10.endsWith(r3)
            r5 = 46
            if (r4 != 0) goto L7d
            java.lang.String r4 = e.a.a.a.a.i(r10, r5)
            goto L7e
        L7d:
            r4 = r10
        L7e:
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L88
            java.lang.String r0 = e.a.a.a.a.i(r0, r5)
        L88:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L9b
            boolean r0 = r4.equals(r0)
            goto Le1
        L9b:
            java.lang.String r3 = "*."
            boolean r6 = r0.startsWith(r3)
            if (r6 == 0) goto Le0
            r6 = 42
            int r6 = r0.indexOf(r6, r2)
            r7 = -1
            if (r6 == r7) goto Lad
            goto Le0
        Lad:
            int r6 = r4.length()
            int r8 = r0.length()
            if (r6 >= r8) goto Lb8
            goto Le0
        Lb8:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Lbf
            goto Le0
        Lbf:
            java.lang.String r0 = r0.substring(r2)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto Lca
            goto Le0
        Lca:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto Lde
            int r3 = r3 + (-1)
            int r0 = r4.lastIndexOf(r5, r3)
            if (r0 == r7) goto Lde
            goto Le0
        Lde:
            r0 = r2
            goto Le1
        Le0:
            r0 = r1
        Le1:
            if (r0 == 0) goto L34
        Le3:
            r1 = r2
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.k.d.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
