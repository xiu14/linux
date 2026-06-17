package com.huawei.e.a.a.b;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public class c extends SSLSocketFactory {
    protected SSLContext a;
    protected SSLSocket b = null;

    /* renamed from: c, reason: collision with root package name */
    protected String[] f6998c;

    public c(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.a = null;
        SSLContext e2 = a.e();
        this.a = e2;
        e2.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z;
        boolean z2 = false;
        if (com.bytedance.feedbackerlib.a.c(null)) {
            z = false;
        } else {
            com.huawei.e.a.a.b.g.b.d("SSLFNew", "set protocols");
            z = a.d((SSLSocket) socket, null);
        }
        if (!com.bytedance.feedbackerlib.a.c(null) || !com.bytedance.feedbackerlib.a.c(null)) {
            com.huawei.e.a.a.b.g.b.d("SSLFNew", "set cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            a.c(sSLSocket);
            z2 = !com.bytedance.feedbackerlib.a.c(null) ? a.f(sSLSocket, null) : a.a(sSLSocket, null);
        }
        if (!z) {
            com.huawei.e.a.a.b.g.b.d("SSLFNew", "set default protocols");
            a.c((SSLSocket) socket);
        }
        if (z2) {
            return;
        }
        com.huawei.e.a.a.b.g.b.d("SSLFNew", "set default cipher");
        a.b((SSLSocket) socket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        com.huawei.e.a.a.b.g.b.d("SSLFNew", "createSocket: host , port");
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.f6998c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f6998c;
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
        com.huawei.e.a.a.b.g.b.d("SSLFNew", "createSocket");
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.f6998c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
