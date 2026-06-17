package okhttp3.F.h;

import android.os.Build;
import android.util.Log;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
class b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f10556c;

    /* renamed from: d, reason: collision with root package name */
    private final f<Socket> f10557d;

    /* renamed from: e, reason: collision with root package name */
    private final f<Socket> f10558e;

    /* renamed from: f, reason: collision with root package name */
    private final f<Socket> f10559f;

    /* renamed from: g, reason: collision with root package name */
    private final f<Socket> f10560g;
    private final c h;

    static final class a extends okhttp3.F.k.c {
        private final Object a;
        private final Method b;

        a(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        @Override // okhttp3.F.k.c
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: okhttp3.F.h.b$b, reason: collision with other inner class name */
    static final class C0485b implements okhttp3.F.k.e {
        private final X509TrustManager a;
        private final Method b;

        C0485b(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        @Override // okhttp3.F.k.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw okhttp3.F.c.b("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0485b)) {
                return false;
            }
            C0485b c0485b = (C0485b) obj;
            return this.a.equals(c0485b.a) && this.b.equals(c0485b.b);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }
    }

    static final class c {
        private final Method a;
        private final Method b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f10561c;

        c(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.f10561c = method3;
        }

        Object a(String str) {
            Method method = this.a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean b(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f10561c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    b(Class<?> cls, f<Socket> fVar, f<Socket> fVar2, f<Socket> fVar3, f<Socket> fVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod(MonitorConstants.CONNECT_TYPE_GET, new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.h = new c(method3, method2, method);
        this.f10556c = cls;
        this.f10557d = fVar;
        this.f10558e = fVar2;
        this.f10559f = fVar3;
        this.f10560g = fVar4;
    }

    private boolean p(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // okhttp3.F.h.g
    public okhttp3.F.k.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new okhttp3.F.k.a(d(x509TrustManager));
        }
    }

    @Override // okhttp3.F.h.g
    public okhttp3.F.k.e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0485b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new okhttp3.F.k.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // okhttp3.F.h.g
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (str != null) {
            this.f10557d.c(sSLSocket, Boolean.TRUE);
            this.f10558e.c(sSLSocket, str);
        }
        f<Socket> fVar = this.f10560g;
        if (fVar == null || !fVar.e(sSLSocket)) {
            return;
        }
        Object[] objArr = new Object[1];
        f.e eVar = new f.e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                eVar.U(protocol.toString().length());
                eVar.j0(protocol.toString());
            }
        }
        objArr[0] = eVar.s();
        this.f10560g.d(sSLSocket, objArr);
    }

    @Override // okhttp3.F.h.g
    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (!okhttp3.F.c.u(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        } catch (SecurityException e4) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e4);
            throw iOException2;
        }
    }

    @Override // okhttp3.F.h.g
    public SSLContext i() {
        if (0 != 0) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance(SSLSocketFactory.TLS);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // okhttp3.F.h.g
    public String j(SSLSocket sSLSocket) {
        byte[] bArr;
        f<Socket> fVar = this.f10559f;
        if (fVar == null || !fVar.e(sSLSocket) || (bArr = (byte[]) this.f10559f.d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, okhttp3.F.c.i);
    }

    @Override // okhttp3.F.h.g
    public Object k(String str) {
        return this.h.a(str);
    }

    @Override // okhttp3.F.h.g
    public boolean m(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return p(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e2) {
            e = e2;
            throw okhttp3.F.c.b("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw okhttp3.F.c.b("unable to determine cleartext support", e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw okhttp3.F.c.b("unable to determine cleartext support", e);
        }
    }

    @Override // okhttp3.F.h.g
    public void n(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + DownloadErrorCode.ERROR_CRONET_HTTP_ERROR_END);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }

    @Override // okhttp3.F.h.g
    public void o(String str, Object obj) {
        if (this.h.b(obj)) {
            return;
        }
        n(5, str, null);
    }
}
