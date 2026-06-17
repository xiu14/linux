package com.bytedance.feedbackerlib.util;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.j;
import okhttp3.x;

/* loaded from: classes.dex */
public class d {
    private static x a;

    static class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Map b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f4982c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f4983d;

        /* renamed from: com.bytedance.feedbackerlib.util.d$a$a, reason: collision with other inner class name */
        class RunnableC0245a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ StringBuffer b;

            RunnableC0245a(String str, StringBuffer stringBuffer) {
                this.a = str;
                this.b = stringBuffer;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f4983d.a(this.a, this.b.toString());
            }
        }

        a(String str, Map map, Map map2, e eVar) {
            this.a = str;
            this.b = map;
            this.f4982c = map2;
            this.f4983d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuffer stringBuffer = new StringBuffer();
            String d2 = d.d(this.a, this.b, this.f4982c, stringBuffer, null);
            StringBuilder M = e.a.a.a.a.M("httpGetFinished: \n\turl: ");
            M.append(this.a);
            M.append("\n\theaders: ");
            M.append(this.b);
            M.append("\n\tqueryParams: ");
            M.append(this.f4982c);
            M.append("\n\tresult: ");
            M.append(d2);
            M.append("\n\terrDetail: ");
            M.append((Object) stringBuffer);
            com.bytedance.feedbackerlib.a.R("HttpUtils", M.toString());
            k.a(new RunnableC0245a(d2, stringBuffer));
        }
    }

    static class b implements Runnable {
        final /* synthetic */ e a;

        class a implements Callable<String> {
            final /* synthetic */ StringBuffer a;

            a(b bVar, StringBuffer stringBuffer) {
                this.a = stringBuffer;
            }

            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                return d.d("https://app-alpha.bytedance.net/ping", null, null, this.a, null);
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.util.d$b$b, reason: collision with other inner class name */
        class RunnableC0246b implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ StringBuffer b;

            RunnableC0246b(String str, StringBuffer stringBuffer) {
                this.a = str;
                this.b = stringBuffer;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.a.a(this.a, this.b.toString());
            }
        }

        b(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            StringBuffer stringBuffer = new StringBuffer();
            try {
                str = (String) k.d().submit(new a(this, stringBuffer)).get(1000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                str = null;
                com.bytedance.feedbackerlib.a.R("HttpUtils", "httpGetFinished: \n\turl: https://app-alpha.bytedance.net/ping\n\tresult: " + str + "\n\terrDetail: " + ((Object) stringBuffer));
                k.a(new RunnableC0246b(str, stringBuffer));
            } catch (ExecutionException e3) {
                e3.printStackTrace();
                str = null;
                com.bytedance.feedbackerlib.a.R("HttpUtils", "httpGetFinished: \n\turl: https://app-alpha.bytedance.net/ping\n\tresult: " + str + "\n\terrDetail: " + ((Object) stringBuffer));
                k.a(new RunnableC0246b(str, stringBuffer));
            } catch (TimeoutException e4) {
                e4.printStackTrace();
                str = null;
                com.bytedance.feedbackerlib.a.R("HttpUtils", "httpGetFinished: \n\turl: https://app-alpha.bytedance.net/ping\n\tresult: " + str + "\n\terrDetail: " + ((Object) stringBuffer));
                k.a(new RunnableC0246b(str, stringBuffer));
            }
            com.bytedance.feedbackerlib.a.R("HttpUtils", "httpGetFinished: \n\turl: https://app-alpha.bytedance.net/ping\n\tresult: " + str + "\n\terrDetail: " + ((Object) stringBuffer));
            k.a(new RunnableC0246b(str, stringBuffer));
        }
    }

    static class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Map b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f4986c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bytedance.feedbackerlib.util.c f4987d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f4988e;

        class a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ StringBuffer b;

            a(String str, StringBuffer stringBuffer) {
                this.a = str;
                this.b = stringBuffer;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f4988e.a(this.a, this.b.toString());
            }
        }

        c(String str, Map map, Map map2, com.bytedance.feedbackerlib.util.c cVar, e eVar) {
            this.a = str;
            this.b = map;
            this.f4986c = map2;
            this.f4987d = cVar;
            this.f4988e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuffer stringBuffer = new StringBuffer();
            String d2 = d.d(this.a, this.b, this.f4986c, stringBuffer, this.f4987d);
            StringBuilder M = e.a.a.a.a.M("httpGetFinished: \n\turl: ");
            M.append(this.a);
            M.append("\n\theaders: ");
            M.append(this.b);
            M.append("\n\tqueryParams: ");
            M.append(this.f4986c);
            M.append("\n\tresult: ");
            M.append(d2);
            M.append("\n\terrDetail: ");
            M.append((Object) stringBuffer);
            com.bytedance.feedbackerlib.a.R("HttpUtils", M.toString());
            k.a(new a(d2, stringBuffer));
        }
    }

    /* renamed from: com.bytedance.feedbackerlib.util.d$d, reason: collision with other inner class name */
    public static class C0247d extends SSLSocketFactory {
        private static final String[] b = {"TLSv1", "TLSv1.1", "TLSv1.2", "TLSv1.3"};

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f4990c = {"TLSv1", "TLSv1.1", "TLSv1.2"};
        final SSLSocketFactory a;

        public C0247d(SSLSocketFactory sSLSocketFactory) {
            this.a = sSLSocketFactory;
        }

        private Socket a(Socket socket) {
            if (socket instanceof SSLSocket) {
                if (Build.VERSION.SDK_INT >= 29) {
                    ((SSLSocket) socket).setEnabledProtocols(b);
                } else {
                    ((SSLSocket) socket).setEnabledProtocols(f4990c);
                }
            }
            return socket;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            Socket createSocket = this.a.createSocket(socket, str, i, z);
            a(createSocket);
            return createSocket;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return this.a.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return this.a.getSupportedCipherSuites();
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
            Socket createSocket = this.a.createSocket(str, i);
            a(createSocket);
            return createSocket;
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
            Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
            a(createSocket);
            return createSocket;
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
            Socket createSocket = this.a.createSocket(inetAddress, i);
            a(createSocket);
            return createSocket;
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
            a(createSocket);
            return createSocket;
        }
    }

    public interface e {
        void a(@Nullable String str, @NonNull String str2);
    }

    public static final class f {
        public static String a = "https://starling.snssdk.com/text/";
        public static String b = "https://app-alpha.bytedance.com/";

        public static boolean a() {
            return b == "https://app-alpha-boe.bytedance.net/" && a == "https://starling.snssdk.com/text_test/";
        }
    }

    public static void a(@NonNull e eVar) {
        com.bytedance.feedbackerlib.a.R("HttpUtils", "start checkNetworkStateAsync, \n\turl: https://app-alpha.bytedance.net/ping");
        k.c(new b(eVar));
    }

    public static void b(@NonNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NonNull e eVar) {
        com.bytedance.feedbackerlib.a.R("HttpUtils", "start doHttpGetAsync, \n\turl: " + str + "\n\theaders: " + map + "\n\tqueryParams: " + map2);
        k.c(new a(str, map, map2, eVar));
    }

    public static void c(@NonNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NonNull e eVar, @Nullable com.bytedance.feedbackerlib.util.c cVar) {
        com.bytedance.feedbackerlib.a.R("HttpUtils", "start doHttpGetAsync, \n\turl: " + str + "\n\theaders: " + map + "\n\tqueryParams: " + ((Object) null));
        k.c(new c(str, map, null, cVar, eVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0125 A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:65:0x00de, B:67:0x00eb, B:68:0x00f5, B:70:0x00fb, B:71:0x0101, B:73:0x0107, B:52:0x0118, B:54:0x0125, B:55:0x012f, B:57:0x0135, B:60:0x013b, B:62:0x0141), top: B:37:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135 A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:65:0x00de, B:67:0x00eb, B:68:0x00f5, B:70:0x00fb, B:71:0x0101, B:73:0x0107, B:52:0x0118, B:54:0x0125, B:55:0x012f, B:57:0x0135, B:60:0x013b, B:62:0x0141), top: B:37:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:65:0x00de, B:67:0x00eb, B:68:0x00f5, B:70:0x00fb, B:71:0x0101, B:73:0x0107, B:52:0x0118, B:54:0x0125, B:55:0x012f, B:57:0x0135, B:60:0x013b, B:62:0x0141), top: B:37:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:65:0x00de, B:67:0x00eb, B:68:0x00f5, B:70:0x00fb, B:71:0x0101, B:73:0x0107, B:52:0x0118, B:54:0x0125, B:55:0x012f, B:57:0x0135, B:60:0x013b, B:62:0x0141), top: B:37:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:65:0x00de, B:67:0x00eb, B:68:0x00f5, B:70:0x00fb, B:71:0x0101, B:73:0x0107, B:52:0x0118, B:54:0x0125, B:55:0x012f, B:57:0x0135, B:60:0x013b, B:62:0x0141), top: B:37:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101 A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:65:0x00de, B:67:0x00eb, B:68:0x00f5, B:70:0x00fb, B:71:0x0101, B:73:0x0107, B:52:0x0118, B:54:0x0125, B:55:0x012f, B:57:0x0135, B:60:0x013b, B:62:0x0141), top: B:37:0x00ac }] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable, okhttp3.Request] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable, okhttp3.x] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r8, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r9, @androidx.annotation.Nullable java.lang.StringBuffer r10, @androidx.annotation.Nullable com.bytedance.feedbackerlib.util.c r11) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.util.d.d(java.lang.String, java.util.Map, java.util.Map, java.lang.StringBuffer, com.bytedance.feedbackerlib.util.c):java.lang.String");
    }

    private static x.b e(x.b bVar) {
        SSLContext sSLContext;
        TrustManager[] trustManagers;
        try {
            sSLContext = SSLContext.getInstance(org.apache.http.conn.ssl.SSLSocketFactory.TLS);
            sSLContext.init(null, null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            trustManagers = trustManagerFactory.getTrustManagers();
        } catch (Exception unused) {
        }
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        }
        bVar.q(new C0247d(sSLContext.getSocketFactory()), (X509TrustManager) trustManagers[0]);
        okhttp3.j a2 = new j.a(okhttp3.j.i).a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        arrayList.add(okhttp3.j.j);
        arrayList.add(okhttp3.j.k);
        bVar.f(arrayList);
        return bVar;
    }

    public static x f() {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    x.b bVar = new x.b();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    bVar.d(30000L, timeUnit);
                    bVar.o(30000L, timeUnit);
                    bVar.s(30000L, timeUnit);
                    bVar.p(true);
                    bVar.l(true);
                    e(bVar);
                    a = bVar.c();
                }
            }
        }
        return a;
    }
}
