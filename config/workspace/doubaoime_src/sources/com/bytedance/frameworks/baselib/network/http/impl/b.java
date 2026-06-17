package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.TTNetInitMetrics;
import com.bytedance.retrofit2.A;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b implements com.bytedance.retrofit2.client.d, r, g {

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f5128e = true;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5129f = false;
    protected Request a;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f5130c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile boolean f5131d = false;
    protected com.bytedance.frameworks.baselib.network.http.b b = com.bytedance.frameworks.baselib.network.http.b.o();

    class a implements com.bytedance.retrofit2.mime.h {
        private volatile com.bytedance.frameworks.baselib.network.http.e a = null;
        final /* synthetic */ g b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.bytedance.frameworks.baselib.network.http.b f5132c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Request f5133d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.bytedance.retrofit2.client.d f5134e;

        a(g gVar, com.bytedance.frameworks.baselib.network.http.b bVar, Request request, com.bytedance.retrofit2.client.d dVar) {
            this.b = gVar;
            this.f5132c = bVar;
            this.f5133d = request;
            this.f5134e = dVar;
        }

        private com.bytedance.frameworks.baselib.network.http.e b() throws IOException {
            InputStream m;
            try {
                try {
                    m = this.b.j();
                } catch (Exception unused) {
                    m = this.b.m();
                }
                if (m != null) {
                    m = com.bytedance.frameworks.baselib.network.http.parser.e.e(m, this.b.t(), this.b.o(), this.f5132c.f5083d);
                }
                return this.f5132c.x == 1 ? new com.bytedance.frameworks.baselib.network.a(m, this.f5134e, this.f5132c) : new com.bytedance.frameworks.baselib.network.http.e(m, this.f5134e);
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("reason = ");
                M.append(this.b.q());
                M.append(", exception = ");
                M.append(e2.getMessage());
                throw new com.bytedance.frameworks.baselib.network.http.l.c(this.b.k(), M.toString(), this.f5133d.getPath(), null);
            }
        }

        @Override // com.bytedance.retrofit2.mime.h
        public String a() {
            return this.b.n();
        }

        @Override // com.bytedance.retrofit2.mime.h
        public InputStream d() throws IOException {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = b();
                    }
                }
            }
            return this.a;
        }

        @Override // com.bytedance.retrofit2.mime.h
        public long length() throws IOException {
            return this.b.p();
        }
    }

    protected b(Request request) {
        this.f5130c = false;
        this.a = request;
        if (request.getMetrics() != null) {
            this.b.n(request.getMetrics());
        }
        RetrofitMetrics retrofitMetrics = this.b.f5083d;
        Objects.requireNonNull(retrofitMetrics);
        retrofitMetrics.F0 = new A();
        this.b.f5083d.E0.a.f5970c = TTNetInitMetrics.j().n;
        this.b.f5083d.E0.a.f5971d = TTNetInitMetrics.j().K;
        com.bytedance.frameworks.baselib.network.http.b bVar = this.b;
        bVar.f5083d.f0 = "4.2.243.8-doubao";
        bVar.C = this.a.isResponseStreaming();
        if (this.a.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.c) {
            this.b.f5082c = (T) this.a.getExtraInfo();
            T t = this.b.f5082c;
            this.f5130c = t.f5091g;
            Objects.requireNonNull(t);
        }
    }

    protected static String A(com.bytedance.frameworks.baselib.network.http.b bVar, Map<String, List<String>> map, int i, InputStream inputStream, String str, boolean z) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                inputStream = com.bytedance.frameworks.baselib.network.http.parser.e.e(inputStream, map, z, bVar.f5083d);
                byte[] f2 = com.bytedance.frameworks.baselib.network.http.parser.e.f(z, i, inputStream, new int[1], bVar.f5083d, false, bVar.a);
                if (f2 == null || f2.length <= 0 || com.bytedance.android.input.k.b.a.Y(str) || !Logger.debug()) {
                    return null;
                }
                try {
                    com.bytedance.frameworks.baselib.network.http.parser.a aVar = new com.bytedance.frameworks.baselib.network.http.parser.a(str);
                    if (!"text".equalsIgnoreCase(aVar.c()) && !"application/json".equalsIgnoreCase(aVar.a())) {
                        return null;
                    }
                    String b = aVar.b("charset");
                    if (com.bytedance.android.input.k.b.a.Y(b)) {
                        b = "utf-8";
                    }
                    return new String(f2, b);
                } catch (Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        } finally {
            com.bytedance.frameworks.baselib.network.http.parser.e.k(inputStream);
        }
    }

    protected static com.bytedance.retrofit2.mime.h B(String str, Request request, com.bytedance.frameworks.baselib.network.http.b bVar, g gVar, com.bytedance.retrofit2.client.d dVar) throws IOException {
        RetrofitMetrics retrofitMetrics = bVar.f5083d;
        retrofitMetrics.F0.a.f5898e = System.nanoTime();
        retrofitMetrics.F0.f5887c.c();
        try {
            T t = bVar.f5082c;
            a aVar = new a(gVar, bVar, request, dVar);
            if (request.isResponseStreaming() && u(request, gVar)) {
                return aVar;
            }
            bVar.f5083d.F0.f5889e.f5913e = true;
            boolean z = f5128e && f5129f;
            boolean z2 = bVar.a;
            InputStream inputStream = null;
            r14 = null;
            r14 = null;
            r14 = null;
            r14 = null;
            r14 = null;
            String str2 = null;
            try {
                int[] iArr = new int[1];
                InputStream d2 = aVar.d();
                try {
                    byte[] f2 = com.bytedance.frameworks.baselib.network.http.parser.e.f(gVar.o(), request.getMaxLength(), d2, iArr, bVar.f5083d, z, z2);
                    com.bytedance.frameworks.baselib.network.http.parser.e.k(d2);
                    if (u(request, gVar)) {
                        if (com.bytedance.frameworks.baselib.network.http.parser.e.n(gVar.n()) && f2 != null) {
                            com.bytedance.frameworks.baselib.network.http.parser.e.a(f2, f2.length);
                        }
                        String n = gVar.n();
                        if (f2 == null) {
                            f2 = new byte[0];
                        }
                        return new com.bytedance.retrofit2.mime.f(n, f2, new String[0]);
                    }
                    if (f2 != null && f2.length > 0 && !com.bytedance.android.input.k.b.a.Y(gVar.n())) {
                        if (Logger.debug()) {
                            try {
                                com.bytedance.frameworks.baselib.network.http.parser.a aVar2 = new com.bytedance.frameworks.baselib.network.http.parser.a(gVar.n());
                                if ("text".equalsIgnoreCase(aVar2.c()) || "application/json".equalsIgnoreCase(aVar2.a())) {
                                    String b = aVar2.b("charset");
                                    if (com.bytedance.android.input.k.b.a.Y(b)) {
                                        b = "utf-8";
                                    }
                                    str2 = new String(f2, b);
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        } else {
                            T t2 = bVar.f5082c;
                        }
                    }
                    com.bytedance.frameworks.baselib.network.http.l.c cVar = new com.bytedance.frameworks.baselib.network.http.l.c(gVar.k(), "", request.getPath(), str2);
                    if (!request.isResponseStreaming() && gVar.k() != 304) {
                        throw cVar;
                    }
                    cVar.a(true, false, str, bVar.G, bVar);
                    throw cVar;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = d2;
                    com.bytedance.frameworks.baselib.network.http.parser.e.k(inputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } finally {
            bVar.f5083d.O();
        }
    }

    public static void E(boolean z) {
        f5128e = z;
    }

    public static void F(boolean z) {
        f5129f = z;
    }

    protected static void G(Request request, com.bytedance.frameworks.baselib.network.http.b bVar) {
        com.bytedance.frameworks.baselib.network.http.f.Q(bVar.f5083d);
        Object extraInfo = request.getExtraInfo();
        if (extraInfo != null && (extraInfo instanceof com.bytedance.frameworks.baselib.network.http.c)) {
        }
        bVar.f5083d.F0.b.c();
        try {
            com.bytedance.frameworks.baselib.network.http.f.R();
        } finally {
            bVar.f5083d.t0();
        }
    }

    private void H(Request request, int i, com.bytedance.frameworks.baselib.network.http.b bVar, g gVar, IOException iOException, boolean z) throws IOException {
        com.bytedance.frameworks.baselib.network.http.h N = com.bytedance.frameworks.baselib.network.http.f.N(request, i, bVar, request.getHeaders(), null, z, false);
        if (N == null) {
            throw iOException;
        }
        N.c();
        throw iOException;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static void I(com.bytedance.frameworks.baselib.network.http.b r2, com.bytedance.frameworks.baselib.network.http.impl.g r3, java.lang.Exception r4) {
        /*
            java.util.Map r3 = r3.t()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = g(r3)     // Catch: java.lang.Throwable -> L4f
            boolean r0 = com.bytedance.android.input.k.b.a.Y(r3)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L15
            org.json.JSONObject r0 = r2.B     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "response-headers"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L4f
        L15:
            java.lang.String r3 = r4.getMessage()     // Catch: java.lang.Throwable -> L4f
            java.lang.Throwable r0 = r4.getCause()     // Catch: java.lang.Throwable -> L4f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L47
            if (r0 == 0) goto L47
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L4f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            r1.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = ", cause = "
            r1.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L4f
            r1.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L4f
        L47:
            org.json.JSONObject r0 = r2.B     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "ex"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r3 = move-exception
            r3.printStackTrace()
        L53:
            java.lang.String r3 = r2.s
            boolean r3 = com.bytedance.android.input.k.b.a.Y(r3)
            if (r3 == 0) goto L92
            if (r4 != 0) goto L5e
            goto L81
        L5e:
            java.lang.String r3 = r4.getMessage()     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L81
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L7d
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L6f
            goto L81
        L6f:
            java.lang.String r4 = "\\|"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L7d
            int r4 = r3.length     // Catch: java.lang.Throwable -> L7d
            r0 = 2
            if (r4 < r0) goto L81
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L7d
            goto L83
        L7d:
            r3 = move-exception
            r3.printStackTrace()
        L81:
            java.lang.String r3 = ""
        L83:
            boolean r4 = com.bytedance.android.input.k.b.a.Y(r3)
            if (r4 == 0) goto L8a
            goto L92
        L8a:
            r2.s = r3     // Catch: java.lang.Throwable -> L92
            T extends com.bytedance.frameworks.baselib.network.http.c r2 = r2.f5082c     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L92
            r2.a = r3     // Catch: java.lang.Throwable -> L92
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.b.I(com.bytedance.frameworks.baselib.network.http.b, com.bytedance.frameworks.baselib.network.http.impl.g, java.lang.Exception):void");
    }

    protected static List<com.bytedance.retrofit2.client.b> e(g gVar, List<String> list) {
        Map<String, List<String>> t = gVar.t();
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : t.entrySet()) {
            String key = entry.getKey();
            if (key != null && list != null && !list.isEmpty()) {
                boolean z = false;
                Iterator<String> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (key.equalsIgnoreCase(it2.next())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                }
            }
            Iterator<String> it3 = entry.getValue().iterator();
            while (it3.hasNext()) {
                arrayList.add(new com.bytedance.retrofit2.client.b(key, it3.next()));
            }
        }
        return arrayList;
    }

    private static String g(Map<String, List<String>> map) {
        List<String> value;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            if (!com.bytedance.android.input.k.b.a.Y(key) && (value = entry.getValue()) != null && !value.isEmpty()) {
                                StringBuilder sb = new StringBuilder();
                                int i = 0;
                                for (String str : value) {
                                    if (!com.bytedance.android.input.k.b.a.Y(str)) {
                                        if (i == 0) {
                                            sb.append(str);
                                        } else {
                                            sb.append("; ");
                                            sb.append(str);
                                        }
                                        i++;
                                    }
                                }
                                jSONObject.put(key, sb.toString());
                            }
                        }
                    }
                    return jSONObject.toString();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    private static boolean u(Request request, g gVar) {
        return request.isResponseStreaming() ? gVar.k() >= 200 && gVar.k() < 300 : gVar.k() == 200;
    }

    protected void C(Request request, com.bytedance.frameworks.baselib.network.http.b bVar, g gVar, Map<String, String> map) throws IOException {
        gVar.s();
        bVar.P = System.currentTimeMillis();
        z(request.getUrl(), request, bVar, map);
        try {
            f(bVar.f5083d);
            D(request, bVar, this, false, false);
        } catch (IOException e2) {
            H(request, i(e2), bVar, gVar, e2, false);
        }
    }

    protected List<String> D(Request request, com.bytedance.frameworks.baselib.network.http.b bVar, g gVar, boolean z, boolean z2) throws IOException {
        com.bytedance.frameworks.baselib.network.http.h N = com.bytedance.frameworks.baselib.network.http.f.N(request, gVar.k(), bVar, request.getHeaders(), gVar.t(), z, z2);
        ArrayList arrayList = null;
        if (N != null && N.c()) {
            C(request, bVar, gVar, N.a());
            return null;
        }
        if (!com.bytedance.android.input.k.b.a.Y(bVar.M) && (N == null || N.b())) {
            arrayList = new ArrayList();
            if (!com.bytedance.android.input.k.b.a.Y(bVar.M)) {
                arrayList.add(bVar.M);
            }
        }
        return arrayList;
    }

    protected boolean a() {
        return false;
    }

    protected void b(Request request, Exception exc) throws com.bytedance.frameworks.baselib.network.http.l.d {
    }

    protected void c() throws com.bytedance.frameworks.baselib.network.http.l.d {
        if (a() || h() == null || NetworkUtils.h(h())) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("network not available for ");
        M.append(this.a.getPath());
        com.bytedance.frameworks.baselib.network.http.l.d dVar = new com.bytedance.frameworks.baselib.network.http.l.d(M.toString());
        dVar.a(false, false, this.a.getUrl(), "", this.b);
        throw dVar;
    }

    protected IOException d(Exception exc) {
        return new IOException(exc.getMessage(), exc.getCause());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:16|(13:18|20|21|22|23|24|25|26|27|(1:29)|30|(1:33)|34))|22|23|24|25|26|27|(0)|30|(1:33)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        H(r15.a, i(r6), r15.b, r15, r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        r6 = r15.b.f5083d;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107 A[Catch: all -> 0x00f8, TRY_ENTER, TryCatch #4 {all -> 0x00f8, blocks: (B:9:0x0022, B:12:0x002f, B:14:0x0037, B:16:0x003d, B:18:0x004b, B:48:0x0107, B:50:0x010e, B:53:0x011a, B:54:0x011b, B:56:0x011f, B:58:0x012b, B:59:0x012c, B:60:0x0135, B:61:0x0136, B:80:0x00fb, B:81:0x0102), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #4 {all -> 0x00f8, blocks: (B:9:0x0022, B:12:0x002f, B:14:0x0037, B:16:0x003d, B:18:0x004b, B:48:0x0107, B:50:0x010e, B:53:0x011a, B:54:0x011b, B:56:0x011f, B:58:0x012b, B:59:0x012c, B:60:0x0135, B:61:0x0136, B:80:0x00fb, B:81:0x0102), top: B:7:0x0022 }] */
    @Override // com.bytedance.retrofit2.client.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.retrofit2.client.c execute() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.b.execute():com.bytedance.retrofit2.client.c");
    }

    protected abstract void f(RetrofitMetrics retrofitMetrics) throws IOException;

    @Override // com.bytedance.retrofit2.r
    public Object getRequestInfo() {
        return this.b;
    }

    protected abstract Context h();

    protected int i(IOException iOException) {
        return -1;
    }

    protected void v() throws IOException {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:16:0x0056, B:18:0x005e, B:19:0x0065, B:21:0x006b, B:22:0x0072, B:24:0x0076, B:25:0x007f, B:27:0x0083, B:28:0x008a, B:30:0x008e, B:32:0x0094, B:34:0x009a), top: B:15:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:16:0x0056, B:18:0x005e, B:19:0x0065, B:21:0x006b, B:22:0x0072, B:24:0x0076, B:25:0x007f, B:27:0x0083, B:28:0x008a, B:30:0x008e, B:32:0x0094, B:34:0x009a), top: B:15:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:16:0x0056, B:18:0x005e, B:19:0x0065, B:21:0x006b, B:22:0x0072, B:24:0x0076, B:25:0x007f, B:27:0x0083, B:28:0x008a, B:30:0x008e, B:32:0x0094, B:34:0x009a), top: B:15:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:16:0x0056, B:18:0x005e, B:19:0x0065, B:21:0x006b, B:22:0x0072, B:24:0x0076, B:25:0x007f, B:27:0x0083, B:28:0x008a, B:30:0x008e, B:32:0x0094, B:34:0x009a), top: B:15:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void w(com.bytedance.frameworks.baselib.network.http.b r6, com.bytedance.frameworks.baselib.network.http.impl.g r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            r6.h = r1
            r6.i = r1
            java.lang.String r1 = r7.n()
            boolean r2 = com.bytedance.android.input.k.b.a.Y(r1)     // Catch: com.bytedance.frameworks.baselib.network.http.parser.c -> L1e
            if (r2 != 0) goto L22
            com.bytedance.frameworks.baselib.network.http.parser.a r2 = new com.bytedance.frameworks.baselib.network.http.parser.a     // Catch: com.bytedance.frameworks.baselib.network.http.parser.c -> L1e
            r2.<init>(r1)     // Catch: com.bytedance.frameworks.baselib.network.http.parser.c -> L1e
            java.lang.String r1 = r2.a()     // Catch: com.bytedance.frameworks.baselib.network.http.parser.c -> L1e
            goto L23
        L1e:
            r1 = move-exception
            r1.printStackTrace()
        L22:
            r1 = r0
        L23:
            r6.F = r1
            java.lang.String r1 = "x-net-info.remoteaddr"
            java.lang.String r1 = r7.l(r1)
            boolean r2 = com.bytedance.android.input.k.b.a.Y(r1)
            if (r2 == 0) goto L32
            goto L3a
        L32:
            r6.s = r1     // Catch: java.lang.Throwable -> L3a
            T extends com.bytedance.frameworks.baselib.network.http.c r2 = r6.f5082c     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3a
            r2.a = r1     // Catch: java.lang.Throwable -> L3a
        L3a:
            T extends com.bytedance.frameworks.baselib.network.http.c r1 = r6.f5082c
            if (r1 == 0) goto L41
            r7.k()
        L41:
            java.lang.String r1 = "X-TT-LOGID"
            java.lang.String r1 = r7.l(r1)
            r6.G = r1
            if (r1 != 0) goto L4d
            r6.G = r0
        L4d:
            com.bytedance.retrofit2.RetrofitMetrics r0 = r6.f5083d
            java.lang.String r1 = r6.G
            r0.h0 = r1
            r7.r()
            long r0 = r6.L     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L65
            org.json.JSONObject r7 = r6.B     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "turing_callback"
            r7.put(r4, r0)     // Catch: java.lang.Throwable -> Lac
        L65:
            long r0 = r6.N     // Catch: java.lang.Throwable -> Lac
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L72
            org.json.JSONObject r7 = r6.B     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "retry_for_account_cost"
            r7.put(r2, r0)     // Catch: java.lang.Throwable -> Lac
        L72:
            boolean r7 = r6.K     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L7f
            org.json.JSONObject r7 = r6.B     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "turing_retry"
            java.lang.String r1 = "1"
            r7.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
        L7f:
            java.lang.String r7 = r6.M     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L8a
            org.json.JSONObject r0 = r6.B     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "retry_by_header"
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> Lac
        L8a:
            com.bytedance.frameworks.baselib.network.http.i r7 = r6.O     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto Lb0
            org.json.JSONObject r7 = r7.a()     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto Lb0
            int r0 = r7.length()     // Catch: java.lang.Throwable -> Lac
            if (r0 <= 0) goto Lb0
            org.json.JSONObject r0 = r6.B     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "rotation_host_retry"
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> Lac
            com.bytedance.retrofit2.RetrofitMetrics r6 = r6.f5083d     // Catch: java.lang.Throwable -> Lac
            com.bytedance.retrofit2.A r0 = r6.F0     // Catch: java.lang.Throwable -> Lac
            com.bytedance.retrofit2.A$e r0 = r0.f5889e     // Catch: java.lang.Throwable -> Lac
            r0.f5911c = r7     // Catch: java.lang.Throwable -> Lac
            r6.A0 = r7     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r6 = move-exception
            r6.printStackTrace()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.b.w(com.bytedance.frameworks.baselib.network.http.b, com.bytedance.frameworks.baselib.network.http.impl.g):void");
    }

    protected void x(Exception exc) {
    }

    protected void y(com.bytedance.retrofit2.mime.h hVar) {
    }

    protected abstract void z(String str, Request request, com.bytedance.frameworks.baselib.network.http.b bVar, Map<String, String> map) throws IOException;
}
