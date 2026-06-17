package okhttp3.F.h;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
public class g {
    private static final g a;
    private static final Logger b;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    static {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.h.g.<clinit>():void");
    }

    public static List<String> b(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public static g h() {
        return a;
    }

    public static boolean l() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public void a(SSLSocket sSLSocket) {
    }

    public okhttp3.F.k.c c(X509TrustManager x509TrustManager) {
        return new okhttp3.F.k.a(d(x509TrustManager));
    }

    public okhttp3.F.k.e d(X509TrustManager x509TrustManager) {
        return new okhttp3.F.k.b(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocketFactory sSLSocketFactory) {
    }

    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public SSLContext i() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance(org.apache.http.conn.ssl.SSLSocketFactory.TLS);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String j(SSLSocket sSLSocket) {
        return null;
    }

    public Object k(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean m(String str) {
        return true;
    }

    public void n(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void o(String str, Object obj) {
        if (obj == null) {
            str = e.a.a.a.a.s(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        n(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
