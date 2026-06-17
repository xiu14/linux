package com.huawei.e.a.a.b;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

@Deprecated
/* loaded from: classes2.dex */
public class b extends SSLSocketFactory {

    /* renamed from: f, reason: collision with root package name */
    private static final String f6993f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile b f6994g;
    private SSLContext a;
    private SSLSocket b = null;

    /* renamed from: c, reason: collision with root package name */
    private Context f6995c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f6996d;

    /* renamed from: e, reason: collision with root package name */
    private X509TrustManager f6997e;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        f6993f = b.class.getSimpleName();
        f6994g = null;
    }

    private b(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException, NullPointerException {
        this.a = null;
        this.f6995c = context.getApplicationContext();
        this.a = a.e();
        e a = d.a(context);
        this.f6997e = a;
        this.a.init(null, new X509TrustManager[]{a}, null);
    }

    private void a(Socket socket) {
        boolean z;
        boolean z2 = false;
        if (com.bytedance.feedbackerlib.a.c(null)) {
            z = false;
        } else {
            com.huawei.e.a.a.b.g.b.d(f6993f, "set protocols");
            a.d((SSLSocket) socket, null);
            z = true;
        }
        if (!com.bytedance.feedbackerlib.a.c(null) || !com.bytedance.feedbackerlib.a.c(null)) {
            com.huawei.e.a.a.b.g.b.d(f6993f, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            a.c(sSLSocket);
            z2 = !com.bytedance.feedbackerlib.a.c(null) ? a.f(sSLSocket, null) : a.a(sSLSocket, null);
        }
        if (!z) {
            com.huawei.e.a.a.b.g.b.d(f6993f, "set default protocols");
            a.c((SSLSocket) socket);
        }
        if (z2) {
            return;
        }
        com.huawei.e.a.a.b.g.b.d(f6993f, "set default cipher suites");
        a.b((SSLSocket) socket);
    }

    @Deprecated
    public static b b(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        System.currentTimeMillis();
        com.huawei.e.a.a.b.g.b.g(context);
        if (f6994g == null) {
            synchronized (b.class) {
                if (f6994g == null) {
                    f6994g = new b(context, null);
                }
            }
        }
        if (f6994g.f6995c == null && context != null) {
            b bVar = f6994g;
            Objects.requireNonNull(bVar);
            bVar.f6995c = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return f6994g;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        com.huawei.e.a.a.b.g.b.d(f6993f, "createSocket: host , port");
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.f6996d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f6996d;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        com.huawei.e.a.a.b.g.b.d(f6993f, "createSocket s host port autoClose");
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.f6996d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
