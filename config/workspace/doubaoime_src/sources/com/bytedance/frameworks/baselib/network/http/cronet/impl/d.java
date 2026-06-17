package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.net.Uri;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.h;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class d extends c implements WeakHandler.IHandler {
    private static boolean Q;
    private static Class R;
    private volatile HttpURLConnection A;
    private volatile com.bytedance.frameworks.baselib.network.http.b B;
    private List<a> C;
    private volatile int D;
    private CountDownLatch E;

    /* renamed from: J, reason: collision with root package name */
    private WeakHandler f5099J;
    private long K;
    private boolean L;
    private boolean M;
    private long N;
    private long O;
    private String l;
    private Set<String> m;
    private String n;
    private a o;
    private String p;
    private String q;
    private String r;
    private List<String> s;
    private final Object t;
    private volatile AtomicInteger u;
    private List<HttpURLConnection> v;
    private volatile boolean w;
    private volatile HttpURLConnection x;
    private volatile int y;
    private volatile com.bytedance.frameworks.baselib.network.http.b z;
    private static HandlerThread P = new HandlerThread("Concurrent-Handler");
    private static String S = null;

    static class a {
        String b;

        /* renamed from: d, reason: collision with root package name */
        long f5101d;

        /* renamed from: g, reason: collision with root package name */
        IOException f5104g;
        com.bytedance.frameworks.baselib.network.http.b l;
        int a = -1;

        /* renamed from: c, reason: collision with root package name */
        long f5100c = System.currentTimeMillis();

        /* renamed from: e, reason: collision with root package name */
        int f5102e = 0;

        /* renamed from: f, reason: collision with root package name */
        int f5103f = -1;
        String h = "";
        long i = -1;
        Boolean j = Boolean.FALSE;
        long k = -1;

        a(String str) {
            this.b = str;
        }

        JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("host", this.b);
                jSONObject.put("start", this.f5100c);
                jSONObject.put("end", this.f5101d);
                jSONObject.put("net_error", this.f5102e);
                jSONObject.put("code", this.f5103f);
                IOException iOException = this.f5104g;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (!TextUtils.isEmpty(message) && message.length() > 64) {
                        message = message.substring(0, 64);
                    }
                    jSONObject.put("exception", message);
                }
                jSONObject.put("dispatch", this.i);
                jSONObject.put("dpHost", this.h);
                if (this.j.booleanValue()) {
                    jSONObject.put("sentAlready", true);
                }
                long j = this.k;
                if (j > 0) {
                    jSONObject.put("cleanUpTime", j);
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    static {
        try {
            R = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
        P.start();
    }

    public d(Request request, h.a aVar) {
        super(request);
        this.m = new CopyOnWriteArraySet();
        this.n = "";
        this.o = null;
        this.s = new ArrayList();
        this.t = new Object();
        int i = 0;
        this.u = new AtomicInteger(0);
        this.v = new CopyOnWriteArrayList();
        this.w = false;
        this.x = null;
        this.y = -1;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = new CopyOnWriteArrayList();
        this.D = 0;
        this.E = new CountDownLatch(1);
        this.f5099J = new WeakHandler(P.getLooper(), this);
        this.M = false;
        this.N = 0L;
        String url = request.getUrl();
        this.l = url;
        Uri parse = Uri.parse(url);
        String scheme = parse.getScheme();
        String t = e.a.a.a.a.t(scheme, "://", parse.getHost());
        String query = parse.getQuery();
        Iterator<String> it2 = aVar.b.iterator();
        while (it2.hasNext()) {
            String replaceFirst = this.l.replaceFirst(t, e.a.a.a.a.t(scheme, "://", it2.next()));
            if (!TextUtils.isEmpty(query)) {
                if (!query.contains("concurrent=")) {
                    replaceFirst = replaceFirst + "&concurrent=" + i;
                }
                if (i > 0 && !query.contains("is_retry=")) {
                    replaceFirst = e.a.a.a.a.s(replaceFirst, "&is_retry=1");
                }
            }
            i++;
            this.s.add(replaceFirst);
        }
        this.p = UUID.randomUUID().toString();
        this.q = aVar.i;
        this.r = aVar.p;
        this.K = aVar.m;
        Q = aVar.n;
        this.L = aVar.o;
        this.N = aVar.r;
        this.M = aVar.q;
        int i2 = com.bytedance.frameworks.baselib.network.http.f.v;
        this.O = 30000;
        if (request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.c) {
            com.bytedance.frameworks.baselib.network.http.c cVar = (com.bytedance.frameworks.baselib.network.http.c) request.getExtraInfo();
            long j = cVar.f5089e;
            if (j > 0) {
                this.O = j;
            } else {
                long j2 = cVar.b;
                if (j2 > 0) {
                    long j3 = cVar.f5087c;
                    if (j3 > 0) {
                        this.O = j2 + j3;
                    }
                }
            }
        }
        this.O += 1000;
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("Request max wait time milliseconds: ");
            M.append(this.O);
            M.append(", user max wait time: ");
            M.append(this.N);
            M.append(", connect interval milliseconds: ");
            M.append(this.K);
            Logger.d("ConcurrentCronetSsCall", M.toString());
        }
        RetrofitMetrics retrofitMetrics = this.b.f5083d;
        retrofitMetrics.l = this.p;
        retrofitMetrics.m = true;
    }

    private void W() {
        this.f5099J.removeCallbacksAndMessages(null);
        synchronized (this.t) {
            if (this.w) {
                return;
            }
            for (HttpURLConnection httpURLConnection : this.v) {
                if (httpURLConnection != null) {
                    Iterator<a> it2 = this.C.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a next = it2.next();
                        if (next.a == httpURLConnection.hashCode()) {
                            next.f5101d = System.currentTimeMillis();
                            if (this.M) {
                                next.k = System.currentTimeMillis();
                            } else {
                                next.f5102e = -999;
                                next.f5104g = new IOException("cleanupMessagesAndPendingConnections");
                            }
                        }
                    }
                    httpURLConnection.disconnect();
                    this.v.remove(httpURLConnection);
                }
            }
            this.b.f5083d.k = d0();
            this.w = true;
        }
    }

    private com.bytedance.frameworks.baselib.network.http.b X(com.bytedance.frameworks.baselib.network.http.b bVar) {
        com.bytedance.frameworks.baselib.network.http.b o = com.bytedance.frameworks.baselib.network.http.b.o();
        RetrofitMetrics retrofitMetrics = bVar.f5083d;
        if (retrofitMetrics != null) {
            Objects.requireNonNull(retrofitMetrics);
            RetrofitMetrics retrofitMetrics2 = new RetrofitMetrics();
            retrofitMetrics.o(retrofitMetrics2);
            o.n(retrofitMetrics2);
        }
        o.C = bVar.C;
        o.f5082c = bVar.f5082c;
        com.bytedance.frameworks.baselib.network.http.i iVar = bVar.O;
        if (iVar != null) {
            o.O = iVar.b();
        }
        o.x = bVar.x;
        try {
            if (o.B != null) {
                o.B = new JSONObject(o.B.toString());
            }
        } catch (Exception unused) {
        }
        return o;
    }

    private String Y(String str, a aVar) {
        if (aVar == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str2 = k.X(str, -1, true).a;
            aVar.i = System.currentTimeMillis() - currentTimeMillis;
            try {
                aVar.h = new URI(str2).getHost();
                if (Logger.debug()) {
                    Logger.e("ConcurrentCronetSsCall", "url is " + str + " dispatchedUrl is " + str2);
                }
                return aVar.h;
            } catch (URISyntaxException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    private void Z(final com.bytedance.frameworks.baselib.network.http.b bVar) {
        final com.bytedance.frameworks.baselib.network.http.b X = X(bVar);
        com.bytedance.frameworks.baselib.network.http.b X2 = X(bVar);
        com.bytedance.frameworks.baselib.network.dispatcher.e.c().a(new com.bytedance.frameworks.baselib.network.dispatcher.a("Concurrent-Call", IRequest.Priority.IMMEDIATE, 0, new Runnable() { // from class: com.bytedance.frameworks.baselib.network.http.cronet.impl.b
            @Override // java.lang.Runnable
            public final void run() {
                d.this.c0(bVar, X);
            }
        }, this.b.C));
        long j = this.K;
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = new Pair(this, X2);
        this.f5099J.sendMessageDelayed(obtain, j);
    }

    private IOException b0(Exception exc, String str, HttpURLConnection httpURLConnection, boolean z) {
        if (!this.M && (exc instanceof IOException) && exc.getMessage() != null && exc.getMessage().startsWith("request canceled")) {
            return (IOException) exc;
        }
        int h = ("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl".equals(exc.getClass().getName()) || "com.ttnet.org.chromium.net.impl.D".equals(exc.getClass().getName())) ? k.h(httpURLConnection) : 0;
        if (TextUtils.isEmpty(str)) {
            str = this.l;
        }
        String str2 = str;
        if (!z && httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        try {
            b(this.a, exc);
            e eVar = new e(exc, this.b, h);
            com.bytedance.frameworks.baselib.network.http.b bVar = this.b;
            eVar.a(false, z, str2, bVar.G, bVar);
            return eVar;
        } catch (com.bytedance.frameworks.baselib.network.http.l.d e2) {
            return e2;
        }
    }

    private JSONObject d0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("concurrent", this.C.size() - 1);
            jSONObject.put("duration", System.currentTimeMillis() - this.b.f5086g);
            if (this.M && !TextUtils.isEmpty(S)) {
                jSONObject.put("call_msg", S);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it2 = this.C.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().a());
            }
            jSONObject.put("tasks", jSONArray);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private void e0(com.bytedance.frameworks.baselib.network.http.b bVar) {
        if (bVar == null) {
            return;
        }
        bVar.f5083d.o(this.b.f5083d);
        bVar.f5083d = this.b.f5083d;
        this.b = bVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.c
    public HttpURLConnection L() {
        return this.x != null ? this.x : this.A;
    }

    public Boolean a0(String str, a aVar) {
        if (!TTNetInitMetrics.k()) {
            if (Logger.debug()) {
                Logger.e("ConcurrentCronetSsCall", "cronet did not init, dispatch fail");
            }
            return Boolean.TRUE;
        }
        try {
            new URL(str).toURI();
            if (this.u.get() == 0) {
                this.n = str;
                this.o = aVar;
                return Boolean.FALSE;
            }
            if (this.u.get() == 1) {
                this.m.add(Y(this.n, this.o));
            }
            Y(str, aVar);
            if (!this.m.contains(aVar.h)) {
                this.m.add(aVar.h);
                return Boolean.FALSE;
            }
            Boolean bool = Boolean.TRUE;
            aVar.j = bool;
            return bool;
        } catch (Exception e2) {
            e2.printStackTrace();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8 A[Catch: IOException -> 0x0257, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0257, blocks: (B:60:0x0130, B:66:0x014b, B:72:0x01d8, B:184:0x016f, B:190:0x017e, B:193:0x0183), top: B:59:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(com.bytedance.frameworks.baselib.network.http.b r19, com.bytedance.frameworks.baselib.network.http.b r20) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.d.c0(com.bytedance.frameworks.baselib.network.http.b, com.bytedance.frameworks.baselib.network.http.b):void");
    }

    @Override // com.bytedance.retrofit2.client.d
    public void cancel() {
        if (Logger.debug()) {
            Logger.d("ConcurrentCronetSsCall", "cancel countdown.");
        }
        synchronized (this.t) {
            if (!this.M) {
                this.E.countDown();
            }
            W();
            J(this.x);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b, com.bytedance.retrofit2.client.d
    public com.bytedance.retrofit2.client.c execute() throws IOException {
        if (this.f5131d) {
            throw new IOException("request canceled");
        }
        com.bytedance.frameworks.baselib.network.http.impl.b.G(this.a, this.b);
        c();
        Z(X(this.b));
        try {
            try {
                long j = this.O;
                if (this.M) {
                    j = Math.max(j, this.N);
                }
                this.E.await(j, TimeUnit.MILLISECONDS);
                this.E.countDown();
                synchronized (this.t) {
                    if (!this.M && this.f5131d) {
                        throw new IOException("request canceled");
                    }
                    if (this.x == null) {
                        e0(this.B);
                        h.d().g(this.q, false);
                        if (this.C.size() > 0 && this.C.get(0).f5104g != null) {
                            e0(this.C.get(0).l);
                            throw this.C.get(0).f5104g;
                        }
                        if (!this.M) {
                            throw b0(new IOException("All urls have been tried and timed out by max wait time."), this.l, this.x, false);
                        }
                        S = "All urls have been tried and timed out by max wait time.";
                    } else {
                        e0(this.z);
                        this.v.remove(this.x);
                    }
                }
                W();
                try {
                    try {
                        if (this.y > 0 && !TextUtils.isEmpty(this.r)) {
                            if (Logger.debug()) {
                                Logger.e("ConcurrentCronetSsCall", "winner is " + this.y + " url is " + this.x.getURL().getHost());
                            }
                            try {
                                k.D(new URL(this.s.get(this.y)).getHost(), this.r);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        h.d().g(this.q, true);
                        List<String> D = D(this.a, this.b, this, true, true);
                        w(this.b, this);
                        com.bytedance.retrofit2.mime.h B = com.bytedance.frameworks.baselib.network.http.impl.b.B(this.l, this.a, this.b, this, this);
                        y(B);
                        com.bytedance.retrofit2.client.c cVar = new com.bytedance.retrofit2.client.c(this.l, this.f5098g, this.x.getResponseMessage(), com.bytedance.frameworks.baselib.network.http.impl.b.e(this, D), B);
                        cVar.k(this.b);
                        if (!this.a.isResponseStreaming()) {
                            s();
                        }
                        return cVar;
                    } catch (Throwable th) {
                        if (!this.a.isResponseStreaming() || 0 != 0) {
                            s();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    throw b0(e3, this.l, this.x, true);
                }
            } catch (Exception e4) {
                W();
                if (this.x != null || this.A == null) {
                    throw b0(e4, this.l, this.x, true);
                }
                throw b0(e4, this.l, this.A, true);
            }
        } finally {
            if (0 != 0) {
                com.bytedance.frameworks.baselib.network.http.impl.b.I(this.b, this, null);
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Pair) {
                try {
                    Pair pair = (Pair) obj;
                    d dVar = (d) pair.first;
                    com.bytedance.frameworks.baselib.network.http.b bVar = (com.bytedance.frameworks.baselib.network.http.b) pair.second;
                    int i = message.what;
                    if (i == 0) {
                        dVar.Z(bVar);
                    } else if (i == 1 && dVar.f5099J.obtainMessage(0) != null) {
                        dVar.f5099J.removeMessages(0);
                        dVar.Z(bVar);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.c, com.bytedance.retrofit2.client.d
    public boolean setThrottleNetSpeed(long j) {
        super.setThrottleNetSpeed(j);
        if (this.x != null) {
            try {
                if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                    com.bytedance.frameworks.baselib.network.i.a.b(this.x).a("configureConnection", new Class[]{String.class, Object[].class}, "setThrottleNetSpeed", new Object[]{Long.valueOf(j)});
                } else {
                    com.bytedance.frameworks.baselib.network.i.a.b(this.x).a("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
