package com.ttnet.org.chromium.net.urlconnection;

import android.net.TrafficStats;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.ttnet.org.chromium.base.annotations.UsedByReflection;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.AbstractC0760h;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.G;
import com.ttnet.org.chromium.net.l;
import com.ttnet.org.chromium.net.p;
import com.ttnet.org.chromium.net.u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class CronetHttpURLConnection extends HttpURLConnection {
    private static final String I = CronetHttpURLConnection.class.getSimpleName();

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f8756J = 0;
    private long A;
    private int B;
    private String C;
    private String D;
    private int E;
    private final AtomicBoolean F;
    private final AtomicBoolean G;
    private boolean H;
    private final AbstractC0759g a;
    private final g b;

    /* renamed from: c, reason: collision with root package name */
    private F f8757c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Pair<String, String>> f8758d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8759e;

    /* renamed from: f, reason: collision with root package name */
    private int f8760f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8761g;
    private int h;
    private d i;
    private f j;
    private G k;
    private IOException l;
    private boolean m;
    private boolean n;
    private List<Map.Entry<String, String>> o;
    private Map<String, List<String>> p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private u.a x;
    private CookieHandler y;
    private int z;

    private class a extends F.b {
        public a() {
        }

        private void g(IOException iOException) {
            CronetHttpURLConnection.this.l = iOException;
            if (CronetHttpURLConnection.this.i != null) {
                CronetHttpURLConnection.this.i.h(iOException);
            }
            if (CronetHttpURLConnection.this.j != null) {
                CronetHttpURLConnection.this.j.p(iOException);
            }
            CronetHttpURLConnection.this.n = true;
            CronetHttpURLConnection.this.G.set(true);
            CronetHttpURLConnection.this.b.d();
        }

        @Override // com.ttnet.org.chromium.net.F.b
        public void a(F f2, G g2) {
            CronetHttpURLConnection.this.k = g2;
            if (com.ttnet.org.chromium.base.e.b()) {
                StringBuilder M = e.a.a.a.a.M("onCanceled loop quit url = ");
                M.append(CronetHttpURLConnection.this.getURL().toString());
                com.ttnet.org.chromium.base.e.a("CronetHttpURLConnection", M.toString());
            }
            if (CronetHttpURLConnection.this.l == null && !CronetHttpURLConnection.this.m) {
                CronetHttpURLConnection.this.l = new i("request canceled, ErrorCode=11, InternalErrorCode=-999");
            }
            g(CronetHttpURLConnection.this.l);
        }

        @Override // com.ttnet.org.chromium.net.F.b
        public void b(F f2, G g2, AbstractC0760h abstractC0760h) {
            IOException iOException;
            if (abstractC0760h == null) {
                throw new IllegalStateException("Exception cannot be null in onFailed.");
            }
            CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
            int i = CronetHttpURLConnection.f8756J;
            Objects.requireNonNull(cronetHttpURLConnection);
            if (abstractC0760h instanceof p) {
                switch (((p) abstractC0760h).getErrorCode()) {
                    case 1:
                        iOException = new UnknownHostException(abstractC0760h.getMessage());
                        break;
                    case 2:
                    case 3:
                        iOException = new ConnectException(abstractC0760h.getMessage());
                        break;
                    case 4:
                        iOException = new SocketTimeoutException(abstractC0760h.getMessage());
                        break;
                    case 5:
                    case 7:
                        iOException = new ConnectException(abstractC0760h.getMessage());
                        break;
                    case 6:
                        iOException = new g.a.b.c.a(abstractC0760h.getMessage());
                        break;
                    case 8:
                        StringBuilder M = e.a.a.a.a.M("reset by peer ");
                        M.append(abstractC0760h.getMessage());
                        iOException = new SocketException(M.toString());
                        break;
                    case 9:
                        iOException = new NoRouteToHostException(abstractC0760h.getMessage());
                        break;
                }
                cronetHttpURLConnection.l = iOException;
                CronetHttpURLConnection.this.k = g2;
                g(abstractC0760h);
            }
            iOException = abstractC0760h;
            cronetHttpURLConnection.l = iOException;
            CronetHttpURLConnection.this.k = g2;
            g(abstractC0760h);
        }

        @Override // com.ttnet.org.chromium.net.F.b
        public void c(F f2, G g2, ByteBuffer byteBuffer) {
            CronetHttpURLConnection.this.k = g2;
            CronetHttpURLConnection.this.b.d();
        }

        @Override // com.ttnet.org.chromium.net.F.b
        public void d(F f2, G g2, String str, String str2) {
            boolean z = true;
            CronetHttpURLConnection.this.m = true;
            if (g2 != null) {
                CronetHttpURLConnection.m(CronetHttpURLConnection.this, str2, g2.a());
            }
            URL url = ((HttpURLConnection) CronetHttpURLConnection.this).url;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    url = new URL(str2);
                } catch (Throwable unused) {
                }
            }
            try {
                URL url2 = new URL(str);
                if (((HttpURLConnection) CronetHttpURLConnection.this).instanceFollowRedirects) {
                    ((HttpURLConnection) CronetHttpURLConnection.this).url = url2;
                }
                if (((HttpURLConnection) CronetHttpURLConnection.this).instanceFollowRedirects) {
                    if (CronetHttpURLConnection.this.f8757c != null) {
                        if (!"http".equals(url2.getProtocol()) || !"https".equals(url.getProtocol())) {
                            z = false;
                        }
                        if (!url2.getHost().equals(url.getHost()) || z) {
                            CronetHttpURLConnection.this.f8757c.b();
                            URL url3 = new URL(str);
                            CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
                            HashMap hashMap = (HashMap) cronetHttpURLConnection.a(cronetHttpURLConnection.K(url3));
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    CronetHttpURLConnection.this.f8757c.a((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                        }
                        CronetHttpURLConnection.this.f8757c.f();
                        return;
                    }
                    return;
                }
            } catch (MalformedURLException unused2) {
            }
            CronetHttpURLConnection.this.k = g2;
            if (CronetHttpURLConnection.this.f8757c != null) {
                CronetHttpURLConnection.this.f8757c.d();
            }
        }

        @Override // com.ttnet.org.chromium.net.F.b
        public void e(F f2, G g2, String str) {
            CronetHttpURLConnection.this.k = g2;
            CronetHttpURLConnection.this.n = true;
            if (CronetHttpURLConnection.this.k != null) {
                long nanoTime = System.nanoTime();
                CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
                CronetHttpURLConnection.m(cronetHttpURLConnection, str, cronetHttpURLConnection.x());
                long nanoTime2 = (System.nanoTime() - nanoTime) / 1000;
                if (f2 != null) {
                    f2.m(nanoTime2);
                }
            }
            if (com.ttnet.org.chromium.base.e.b()) {
                StringBuilder M = e.a.a.a.a.M("onResponseStarted loop quit url = ");
                M.append(CronetHttpURLConnection.this.getURL().toString());
                com.ttnet.org.chromium.base.e.a("CronetHttpURLConnection", M.toString());
            }
            CronetHttpURLConnection.this.b.d();
        }

        @Override // com.ttnet.org.chromium.net.F.b
        public void f(F f2, G g2) {
            CronetHttpURLConnection.this.k = g2;
            g(null);
        }
    }

    public CronetHttpURLConnection(URL url, AbstractC0759g abstractC0759g, boolean z) {
        super(url);
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = false;
        this.a = abstractC0759g;
        this.b = new g();
        if (z) {
            this.i = new e(this);
        } else {
            this.i = new d(this);
        }
        this.f8758d = new ArrayList();
        this.y = CookieHandler.getDefault();
        this.E = -1;
    }

    private Map.Entry<String, String> A(int i) {
        try {
            D();
            List<Map.Entry<String, String>> y = y();
            if (i >= y.size()) {
                return null;
            }
            return y.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    private void D() throws IOException {
        f fVar = this.j;
        if (fVar != null) {
            fVar.h();
            if (F()) {
                this.j.close();
            }
        }
        if (!this.n) {
            J();
            if (com.ttnet.org.chromium.base.e.b()) {
                StringBuilder M = e.a.a.a.a.M("getResponse loop url = ");
                M.append(getURL().toString());
                com.ttnet.org.chromium.base.e.a("CronetHttpURLConnection", M.toString());
            }
            v(getReadTimeout() + getConnectTimeout());
            this.n = true;
        }
        if (!this.n) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.l;
        if (iOException != null) {
            throw iOException;
        }
        Objects.requireNonNull(this.k, "Response info is null when there is no exception.");
    }

    private boolean E() {
        String requestProperty = getRequestProperty(Request.KEY_BYPASS_TTNET_COOKIE_HEADER);
        return TextUtils.isEmpty(requestProperty) || !"0".equals(requestProperty);
    }

    private boolean F() {
        return ((HttpURLConnection) this).chunkLength > 0;
    }

    private final void I(String str, String str2, boolean z) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int w = w(str);
        if (w >= 0) {
            if (!z) {
                throw new UnsupportedOperationException(e.a.a.a.a.t("Cannot add multiple headers of the same key, ", str, ". crbug.com/432719."));
            }
            this.f8758d.remove(w);
        }
        this.f8758d.add(Pair.create(str, str2));
    }

    private void J() throws IOException {
        boolean z;
        boolean z2;
        String str;
        if (((HttpURLConnection) this).connected) {
            return;
        }
        if (com.ttnet.org.chromium.base.e.b()) {
            StringBuilder M = e.a.a.a.a.M("start request url = ");
            M.append(getURL().toString());
            com.ttnet.org.chromium.base.e.a("CronetHttpURLConnection", M.toString());
        }
        l.a aVar = (l.a) this.a.c(getURL().toString(), new a(), this.b);
        if (((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).method.equals("GET")) {
                ((HttpURLConnection) this).method = "POST";
            }
            f fVar = this.j;
            if (fVar != null) {
                aVar.m(fVar.l(), this.b);
                if (getRequestProperty(DownloadUtils.CONTENT_LENGTH) == null && !F()) {
                    addRequestProperty(DownloadUtils.CONTENT_LENGTH, Long.toString(this.j.l().a()));
                }
                this.j.o();
            } else if (getRequestProperty(DownloadUtils.CONTENT_LENGTH) == null) {
                addRequestProperty(DownloadUtils.CONTENT_LENGTH, "0");
            }
            if (getRequestProperty(DownloadHelper.CONTENT_TYPE) == null) {
                addRequestProperty(DownloadHelper.CONTENT_TYPE, "application/x-www-form-urlencoded");
            }
        }
        long nanoTime = System.nanoTime();
        HashMap hashMap = (HashMap) a(K(getURL()));
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.e((String) entry.getKey(), (String) entry.getValue());
            }
        }
        long nanoTime2 = (System.nanoTime() - nanoTime) / 1000;
        for (Pair<String, String> pair : this.f8758d) {
            aVar.e((String) pair.first, (String) pair.second);
        }
        if (!getUseCaches()) {
            aVar.g();
        }
        aVar.h(((HttpURLConnection) this).method);
        if (this.f8759e) {
            z = true;
        } else {
            int threadStatsTag = TrafficStats.getThreadStatsTag();
            if (threadStatsTag != -1) {
                this.f8760f = threadStatsTag;
                this.f8759e = true;
            }
            z = this.f8759e;
        }
        if (z) {
            aVar.k(this.f8760f);
        }
        if (this.f8761g) {
            z2 = true;
        } else if (Build.VERSION.SDK_INT < 28) {
            z2 = false;
        } else {
            int threadStatsUid = TrafficStats.getThreadStatsUid();
            if (threadStatsUid != -1) {
                this.h = threadStatsUid;
                this.f8761g = true;
            }
            z2 = this.f8761g;
        }
        if (z2) {
            aVar.l(this.h);
        }
        aVar.i(this.q);
        aVar.b(this.r);
        aVar.c(this.s);
        aVar.d(this.t);
        aVar.a(this.u);
        aVar.j(this.x);
        l f2 = aVar.f();
        this.f8757c = f2;
        int i = this.z;
        if (i != 0) {
            f2.k(i);
        }
        int i2 = this.B;
        if (i2 > 0) {
            this.f8757c.l(i2);
        }
        String str2 = this.C;
        if (str2 != null && (str = this.D) != null) {
            this.f8757c.i(str2, str);
        }
        this.f8757c.h(nanoTime2);
        this.f8757c.j(this.E);
        this.f8757c.o();
        long j = this.A;
        if (j > 0) {
            this.f8757c.n(j);
        }
        ((HttpURLConnection) this).connected = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(URI uri) {
        HashMap hashMap = new HashMap();
        if ((this.B & 2) > 0 || !E()) {
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a(I, "Do not read cookie from TTNet, url:" + uri);
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        List<Pair<String, String>> list = this.f8758d;
        if (list != null) {
            for (Pair<String, String> pair : list) {
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                List list2 = (List) hashMap2.get(str);
                if (list2 == null) {
                    list2 = new LinkedList();
                }
                list2.add(str2);
                hashMap2.put(str, list2);
            }
        }
        hashMap2.put("x-tt-get-cookie-source", new LinkedList());
        Map<String, List<String>> map = null;
        try {
            if (this.y == null) {
                this.y = CookieHandler.getDefault();
            }
            CookieHandler cookieHandler = this.y;
            if (cookieHandler != null) {
                map = cookieHandler.get(uri, hashMap2);
            }
        } catch (Exception e2) {
            if (com.ttnet.org.chromium.base.e.b()) {
                String str3 = I;
                StringBuilder M = e.a.a.a.a.M("Loading cookies failed for ");
                M.append(getURL().toString());
                M.append(" e = ");
                M.append(e2.getMessage());
                com.ttnet.org.chromium.base.e.a(str3, M.toString());
            }
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                int i = 0;
                if ("x-tt-get-cookie-source".equals(key) && !entry.getValue().isEmpty()) {
                    try {
                        this.E = Integer.parseInt(entry.getValue().get(0));
                    } catch (Throwable unused) {
                        this.E = -1;
                    }
                }
                StringBuilder sb = new StringBuilder();
                if ("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    if (!entry.getValue().isEmpty()) {
                        for (String str4 : entry.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str4);
                            i++;
                        }
                        hashMap.put(key, sb.toString());
                    }
                }
            }
        }
        return hashMap;
    }

    static void m(CronetHttpURLConnection cronetHttpURLConnection, String str, Map map) {
        if (!cronetHttpURLConnection.E()) {
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a(I, "Do not write cookie from TTNet, url:" + str);
                return;
            }
            return;
        }
        if (com.ttnet.org.chromium.base.e.b()) {
            String str2 = I;
            StringBuilder M = e.a.a.a.a.M("Saving cookies for url: ");
            M.append(TextUtils.isEmpty(str) ? cronetHttpURLConnection.getURL().toString() : str);
            com.ttnet.org.chromium.base.e.a(str2, M.toString());
        }
        try {
            if (cronetHttpURLConnection.y == null) {
                cronetHttpURLConnection.y = CookieHandler.getDefault();
            }
            if (cronetHttpURLConnection.y != null) {
                if (TextUtils.isEmpty(str)) {
                    cronetHttpURLConnection.y.put(cronetHttpURLConnection.K(cronetHttpURLConnection.getURL()), map);
                    return;
                }
                URI K = cronetHttpURLConnection.K(new URL(str));
                if ((cronetHttpURLConnection.B & 1) != 1) {
                    cronetHttpURLConnection.y.put(K, map);
                    return;
                }
                TreeMap treeMap = new TreeMap(map);
                treeMap.put("webview-origin-url", Collections.singletonList(cronetHttpURLConnection.getURL().getHost()));
                cronetHttpURLConnection.y.put(K, treeMap);
            }
        } catch (Exception e2) {
            if (com.ttnet.org.chromium.base.e.b()) {
                String str3 = I;
                StringBuilder M2 = e.a.a.a.a.M("Saving cookies failed for ");
                if (TextUtils.isEmpty(str)) {
                    str = cronetHttpURLConnection.getURL().toString();
                }
                M2.append(str);
                M2.append(" e = ");
                M2.append(e2.getMessage());
                com.ttnet.org.chromium.base.e.a(str3, M2.toString());
            }
        }
    }

    private void v(int i) throws IOException {
        try {
            this.b.b(i);
        } catch (SocketTimeoutException unused) {
            F f2 = this.f8757c;
            if (f2 != null) {
                f2.c();
                this.b.e();
                this.b.b(i / 2);
            }
        } catch (Exception e2) {
            F f3 = this.f8757c;
            if (f3 != null) {
                f3.e("Unexpected request usage, caught in CronetHttpURLConnection.", e2);
            }
            this.b.e();
            this.b.b(i / 2);
        }
    }

    private int w(String str) {
        for (int i = 0; i < this.f8758d.size(); i++) {
            if (((String) this.f8758d.get(i).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, List<String>> x() {
        Map<String, List<String>> map = this.p;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : y()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.p = unmodifiableMap;
        return unmodifiableMap;
    }

    private List<Map.Entry<String, String>> y() {
        List<Map.Entry<String, String>> list = this.o;
        if (list != null) {
            return list;
        }
        this.o = new ArrayList();
        Iterator<Map.Entry<String, String>> it2 = this.k.b().iterator();
        while (it2.hasNext()) {
            this.o.add(new AbstractMap.SimpleImmutableEntry(it2.next()));
        }
        List<Map.Entry<String, String>> unmodifiableList = Collections.unmodifiableList(this.o);
        this.o = unmodifiableList;
        return unmodifiableList;
    }

    public int B() {
        return this.v;
    }

    void C(ByteBuffer byteBuffer) throws IOException {
        F f2 = this.f8757c;
        if (f2 == null) {
            return;
        }
        f2.g(byteBuffer);
        v(getReadTimeout());
    }

    public void G() {
        F f2 = this.f8757c;
        if (f2 != null) {
            f2.c();
        }
    }

    public void H(u.a aVar) {
        this.x = aVar;
    }

    public URI K(URL url) {
        if (url == null) {
            return null;
        }
        String url2 = url.toString();
        try {
            return new URI(url2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(url2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                try {
                    return URI.create(url2.substring(0, url2.indexOf("?")));
                } catch (Exception unused2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        I(str, str2, false);
    }

    @UsedByReflection
    public void configureConnection(String str, Object... objArr) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "setSocketConnectTimeout":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.r = ((Integer) objArr[0]).intValue();
                return;
            case "setInputStreamBufferSize":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.v = ((Integer) objArr[0]).intValue();
                return;
            case "setRequestFlag":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.z = ((Integer) objArr[0]).intValue();
                return;
            case "setOutputStreamBufferSize":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.w = ((Integer) objArr[0]).intValue();
                return;
            case "setThrottleNetSpeed":
                com.ttnet.org.chromium.base.f.a(new Class[]{Long.TYPE}, objArr);
                long longValue = ((Long) objArr[0]).longValue();
                this.A = longValue;
                F f2 = this.f8757c;
                if (f2 != null) {
                    f2.n(longValue);
                    return;
                }
                return;
            case "setSocketReadTimeout":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.s = ((Integer) objArr[0]).intValue();
                return;
            case "setRequestTimeout":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.u = ((Integer) objArr[0]).intValue();
                return;
            case "setAuthCredentials":
                com.ttnet.org.chromium.base.f.a(new Class[]{String.class, String.class}, objArr);
                this.C = (String) objArr[0];
                this.D = (String) objArr[1];
                return;
            case "setRequestTypeFlags":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.B = ((Integer) objArr[0]).intValue();
                return;
            case "setSocketWriteTimeout":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.t = ((Integer) objArr[0]).intValue();
                return;
            case "setRequestPriority":
                com.ttnet.org.chromium.base.f.a(new Class[]{Integer.TYPE}, objArr);
                this.q = ((Integer) objArr[0]).intValue();
                return;
            case "enableFixCancelRequestReport":
                com.ttnet.org.chromium.base.f.a(new Class[0], objArr);
                this.H = true;
                return;
            default:
                throw new IllegalArgumentException(e.a.a.a.a.s("Unknown method name: ", str));
        }
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        getOutputStream();
        J();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        F f2;
        if (!((HttpURLConnection) this).connected || (f2 = this.f8757c) == null) {
            return;
        }
        f2.d();
        try {
            if (this.F.compareAndSet(false, true) && this.H && !this.G.get() && this.b.c() && !this.b.a()) {
                this.b.b(50);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @UsedByReflection
    public void enableFixCancelRequestReport() {
        this.H = true;
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        try {
            D();
            if (this.k.c() >= 400) {
                return this.i;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            D();
            Map<String, List<String>> x = x();
            if (!x.containsKey(str)) {
                return null;
            }
            return x.get(str).get(r4.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry<String, String> A = A(i);
        if (A == null) {
            return null;
        }
        return A.getKey();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            D();
            return x();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        D();
        if (!((HttpURLConnection) this).instanceFollowRedirects && this.m) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.k.c() < 400) {
            return this.i;
        }
        throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        if (this.j == null && ((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (F()) {
                this.j = new b(this, ((HttpURLConnection) this).chunkLength, this.b);
                J();
            } else {
                long j = ((HttpURLConnection) this).fixedContentLength;
                long j2 = ((HttpURLConnection) this).fixedContentLengthLong;
                if (j2 != -1) {
                    j = j2;
                }
                if (j != -1) {
                    c cVar = new c(this, j, this.w, this.b);
                    this.j = cVar;
                    if (j == 0) {
                        setFixedLengthStreamingMode((int) cVar.l().a());
                        if (getRequestProperty(DownloadUtils.CONTENT_LENGTH) == null) {
                            addRequestProperty(DownloadUtils.CONTENT_LENGTH, Long.toString(this.j.l().a()));
                        } else {
                            setRequestProperty(DownloadUtils.CONTENT_LENGTH, Long.toString(this.j.l().a()));
                        }
                    }
                    J();
                } else {
                    String requestProperty = getRequestProperty(DownloadUtils.CONTENT_LENGTH);
                    if (requestProperty == null) {
                        this.j = new com.ttnet.org.chromium.net.urlconnection.a(this);
                    } else {
                        this.j = new com.ttnet.org.chromium.net.urlconnection.a(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.j;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair<String, String> pair : this.f8758d) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        int w = w(str);
        if (w >= 0) {
            return (String) this.f8758d.get(w).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        D();
        return this.k.c();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        D();
        return this.k.d();
    }

    @UsedByReflection
    public void setAuthCredentials(String str, String str2) {
        this.C = str;
        this.D = str2;
    }

    @Override // java.net.URLConnection
    @UsedByReflection
    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    @UsedByReflection
    public void setInputStreamBufferSize(int i) {
        this.v = i;
    }

    @UsedByReflection
    public void setOutputStreamBufferSize(int i) {
        this.w = i;
    }

    @UsedByReflection
    public void setRequestFlag(int i) {
        this.z = i;
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        if (!"PATCH".equals(str)) {
            super.setRequestMethod(str);
        } else {
            if (((HttpURLConnection) this).connected) {
                throw new ProtocolException("Can't reset method: already connected");
            }
            ((HttpURLConnection) this).method = str;
        }
    }

    @UsedByReflection
    public void setRequestPriority(int i) {
        this.q = i;
    }

    @Override // java.net.URLConnection
    @UsedByReflection
    public final void setRequestProperty(String str, String str2) {
        I(str, str2, true);
    }

    @UsedByReflection
    public void setRequestTimeout(int i) {
        this.u = i;
    }

    @UsedByReflection
    public void setRequestTypeFlags(int i) {
        this.B = i | this.B;
    }

    @UsedByReflection
    public void setSocketConnectTimeout(int i) {
        this.r = i;
    }

    @UsedByReflection
    public void setSocketReadTimeout(int i) {
        this.s = i;
    }

    @UsedByReflection
    public void setSocketWriteTimeout(int i) {
        this.t = i;
    }

    @UsedByReflection
    public void setThrottleNetSpeed(long j) {
        this.A = j;
        F f2 = this.f8757c;
        if (f2 != null) {
            f2.n(j);
        }
    }

    @UsedByReflection
    public void setTrafficStatsTag(int i) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
        }
        this.f8759e = true;
        this.f8760f = i;
    }

    @UsedByReflection
    public void setTrafficStatsUid(int i) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
        }
        this.f8761g = true;
        this.h = i;
    }

    public void u(String str, Throwable th) {
        F f2 = this.f8757c;
        if (f2 != null) {
            f2.e(str, th);
        }
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    public int z() {
        IOException iOException = this.l;
        if (iOException instanceof p) {
            return ((p) iOException).getCronetInternalErrorCode();
        }
        if (!(iOException instanceof i)) {
            return 0;
        }
        Objects.requireNonNull((i) iOException);
        return -999;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry<String, String> A = A(i);
        if (A == null) {
            return null;
        }
        return A.getValue();
    }
}
