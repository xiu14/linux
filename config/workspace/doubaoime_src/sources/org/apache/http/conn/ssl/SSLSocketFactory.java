package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

@Deprecated
/* loaded from: classes2.dex */
public class SSLSocketFactory {
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final String TLS = "TLS";
    private final javax.net.ssl.SSLSocketFactory a;
    private final g.a.b.c.c.a b;

    /* renamed from: c, reason: collision with root package name */
    private volatile X509HostnameVerifier f10748c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f10749d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f10750e;
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new b();
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(java.lang.String r2, java.security.KeyStore r3, java.lang.String r4, java.security.KeyStore r5, java.security.SecureRandom r6, g.a.b.c.c.a r7) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r1 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            r0.e(r2)
            r0.d(r6)
            r2 = 0
            if (r4 == 0) goto L13
            char[] r4 = r4.toCharArray()
            goto L14
        L13:
            r4 = r2
        L14:
            r0.b(r3, r4)
            r0.c(r5, r2)
            javax.net.ssl.SSLContext r2 = r0.a()
            r1.<init>(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(java.lang.String, java.security.KeyStore, java.lang.String, java.security.KeyStore, java.security.SecureRandom, g.a.b.c.c.a):void");
    }

    private static String[] b(String str) {
        boolean z = true;
        if (str != null) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                }
                if (!Character.isWhitespace(str.charAt(i))) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        if (z) {
            return null;
        }
        return str.split(" *, *");
    }

    public static SSLSocketFactory getSocketFactory() throws e {
        try {
            SSLContext sSLContext = SSLContext.getInstance(TLS);
            sSLContext.init(null, null, null);
            return new SSLSocketFactory(sSLContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        } catch (KeyManagementException e2) {
            throw new e(e2.getMessage(), e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new e(e3.getMessage(), e3);
        }
    }

    public static SSLSocketFactory getSystemSocketFactory() throws e {
        return new SSLSocketFactory((javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault(), b(System.getProperty("https.protocols")), b(System.getProperty("https.cipherSuites")), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    protected void a() throws IOException {
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g.a.b.d.a aVar) throws IOException, UnknownHostException, g.a.b.c.a {
        d.j(inetSocketAddress, "Remote address");
        d.j(aVar, "HTTP parameters");
        g.a.b.a a = inetSocketAddress instanceof g.a.b.c.b ? ((g.a.b.c.b) inetSocketAddress).a() : new g.a.b.a(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        d.j(aVar, "HTTP parameters");
        int a2 = aVar.a("http.socket.timeout", 0);
        d.j(aVar, "HTTP parameters");
        int a3 = aVar.a("http.connection.timeout", 0);
        socket.setSoTimeout(a2);
        return connectSocket(a3, socket, a, inetSocketAddress, inetSocketAddress2, (g.a.b.e.a) null);
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, g.a.b.d.a aVar) throws IOException, UnknownHostException {
        return createLayeredSocket(socket, str, i, (g.a.b.e.a) null);
    }

    public Socket createSocket(g.a.b.d.a aVar) throws IOException {
        return createSocket((g.a.b.e.a) null);
    }

    public X509HostnameVerifier getHostnameVerifier() {
        return this.f10748c;
    }

    public boolean isSecure(Socket socket) throws IllegalArgumentException {
        d.j(socket, "Socket");
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalStateException("Socket not created by this factory");
        }
        if (!socket.isClosed()) {
            return true;
        }
        throw new IllegalStateException("Socket is closed");
    }

    public void setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        d.j(x509HostnameVerifier, "Hostname verifier");
        this.f10748c = x509HostnameVerifier;
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        return createLayeredSocket(socket, str, i, (g.a.b.e.a) null);
    }

    public Socket createSocket() throws IOException {
        return createSocket((g.a.b.e.a) null);
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, g.a.b.e.a aVar) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.a.createSocket(socket, str, i, true);
        String[] strArr = this.f10749d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.f10750e;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        a();
        sSLSocket.startHandshake();
        try {
            this.f10748c.verify(str, sSLSocket);
            return sSLSocket;
        } catch (IOException e2) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e2;
        }
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        return createLayeredSocket(socket, str, i, z);
    }

    public Socket createSocket(g.a.b.e.a aVar) throws IOException {
        return SocketFactory.getDefault().createSocket();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(java.lang.String r2, java.security.KeyStore r3, java.lang.String r4, java.security.KeyStore r5, java.security.SecureRandom r6, org.apache.http.conn.ssl.g r7, org.apache.http.conn.ssl.X509HostnameVerifier r8) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r1 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            r0.e(r2)
            r0.d(r6)
            if (r4 == 0) goto L12
            char[] r2 = r4.toCharArray()
            goto L13
        L12:
            r2 = 0
        L13:
            r0.b(r3, r2)
            r0.c(r5, r7)
            javax.net.ssl.SSLContext r2 = r0.a()
            r1.<init>(r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(java.lang.String, java.security.KeyStore, java.lang.String, java.security.KeyStore, java.security.SecureRandom, org.apache.http.conn.ssl.g, org.apache.http.conn.ssl.X509HostnameVerifier):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(java.lang.String r2, java.security.KeyStore r3, java.lang.String r4, java.security.KeyStore r5, java.security.SecureRandom r6, org.apache.http.conn.ssl.X509HostnameVerifier r7) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r1 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            r0.e(r2)
            r0.d(r6)
            r2 = 0
            if (r4 == 0) goto L13
            char[] r4 = r4.toCharArray()
            goto L14
        L13:
            r4 = r2
        L14:
            r0.b(r3, r4)
            r0.c(r5, r2)
            javax.net.ssl.SSLContext r2 = r0.a()
            r1.<init>(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(java.lang.String, java.security.KeyStore, java.lang.String, java.security.KeyStore, java.security.SecureRandom, org.apache.http.conn.ssl.X509HostnameVerifier):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(java.security.KeyStore r3) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r2 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            r1 = 0
            r0.c(r3, r1)
            javax.net.ssl.SSLContext r3 = r0.a()
            org.apache.http.conn.ssl.X509HostnameVerifier r0 = org.apache.http.conn.ssl.SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(java.security.KeyStore):void");
    }

    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, g.a.b.d.a aVar) throws IOException, UnknownHostException, g.a.b.c.a {
        InetAddress byName;
        InetSocketAddress inetSocketAddress;
        g.a.b.c.c.a aVar2 = this.b;
        if (aVar2 != null) {
            byName = aVar2.a(str);
        } else {
            byName = InetAddress.getByName(str);
        }
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        return connectSocket(socket, new g.a.b.c.b(new g.a.b.a(str, i, null), byName, i), inetSocketAddress, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(java.security.KeyStore r2, java.lang.String r3) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r1 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            if (r3 == 0) goto Lc
            char[] r3 = r3.toCharArray()
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r0.b(r2, r3)
            javax.net.ssl.SSLContext r2 = r0.a()
            org.apache.http.conn.ssl.X509HostnameVerifier r3 = org.apache.http.conn.ssl.SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(java.security.KeyStore, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(java.security.KeyStore r3, java.lang.String r4, java.security.KeyStore r5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r2 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto Ld
            char[] r4 = r4.toCharArray()
            goto Le
        Ld:
            r4 = r1
        Le:
            r0.b(r3, r4)
            r0.c(r5, r1)
            javax.net.ssl.SSLContext r3 = r0.a()
            org.apache.http.conn.ssl.X509HostnameVerifier r4 = org.apache.http.conn.ssl.SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(java.security.KeyStore, java.lang.String, java.security.KeyStore):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(org.apache.http.conn.ssl.g r3) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r2 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            r1 = 0
            r0.c(r1, r3)
            javax.net.ssl.SSLContext r3 = r0.a()
            org.apache.http.conn.ssl.X509HostnameVerifier r0 = org.apache.http.conn.ssl.SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(org.apache.http.conn.ssl.g):void");
    }

    public Socket connectSocket(int i, Socket socket, g.a.b.a aVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g.a.b.e.a aVar2) throws IOException {
        d.j(aVar, "HTTP host");
        d.j(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = createSocket(aVar2);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                sSLSocket.startHandshake();
                try {
                    this.f10748c.verify(aVar.a(), sSLSocket);
                    return socket;
                } catch (IOException e2) {
                    try {
                        sSLSocket.close();
                    } catch (Exception unused) {
                    }
                    throw e2;
                }
            }
            return createLayeredSocket(socket, aVar.a(), inetSocketAddress.getPort(), aVar2);
        } catch (IOException e3) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
            throw e3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SSLSocketFactory(org.apache.http.conn.ssl.g r3, org.apache.http.conn.ssl.X509HostnameVerifier r4) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
        /*
            r2 = this;
            org.apache.http.conn.ssl.c r0 = new org.apache.http.conn.ssl.c
            r0.<init>()
            r1 = 0
            r0.c(r1, r3)
            javax.net.ssl.SSLContext r3 = r0.a()
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLSocketFactory.<init>(org.apache.http.conn.ssl.g, org.apache.http.conn.ssl.X509HostnameVerifier):void");
    }

    public SSLSocketFactory(SSLContext sSLContext) {
        this(sSLContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sSLContext, g.a.b.c.c.a aVar) {
        this.a = sSLContext.getSocketFactory();
        this.f10748c = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        this.b = aVar;
        this.f10749d = null;
        this.f10750e = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SSLSocketFactory(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLContext.getSocketFactory(), (String[]) null, (String[]) null, x509HostnameVerifier);
        d.j(sSLContext, "SSL context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SSLSocketFactory(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLContext.getSocketFactory(), strArr, strArr2, x509HostnameVerifier);
        d.j(sSLContext, "SSL context");
    }

    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        d.j(sSLSocketFactory, "SSL socket factory");
        this.a = sSLSocketFactory;
        this.f10749d = strArr;
        this.f10750e = strArr2;
        this.f10748c = x509HostnameVerifier == null ? BROWSER_COMPATIBLE_HOSTNAME_VERIFIER : x509HostnameVerifier;
        this.b = null;
    }
}
