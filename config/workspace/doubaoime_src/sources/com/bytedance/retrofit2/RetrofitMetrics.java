package com.bytedance.retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.A;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.s;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RetrofitMetrics {
    public static InterfaceC0698b J0 = null;
    private static HandlerThread K0 = null;
    private static volatile Handler L0 = null;
    private static c M0 = null;
    private static volatile boolean N0 = false;
    private static volatile boolean O0 = false;
    private static volatile InterfaceC0699c P0;
    public boolean A;

    @Deprecated
    public JSONObject A0;
    public long B;

    @Deprecated
    public int B0;
    public long C;

    @Deprecated
    public List<d> C0;
    public long D;

    @Deprecated
    public List<d> D0;
    public long E;
    public I E0;
    public long F;
    public A F0;

    @Deprecated
    public long G;
    private boolean G0;

    @Deprecated
    public long H;
    private boolean H0;

    @Deprecated
    public long I;
    private boolean I0;

    /* renamed from: J, reason: collision with root package name */
    @Deprecated
    public long f5989J;

    @Deprecated
    public long K;

    @Deprecated
    public long L;

    @Deprecated
    public long M;

    @Deprecated
    public transient Throwable N;

    @Deprecated
    public Map<String, Long> O;

    @Deprecated
    public Map<String, Long> P;

    @Deprecated
    public long Q;

    @Deprecated
    public long R;

    @Deprecated
    public long S;

    @Deprecated
    public long T;

    @Deprecated
    public long U;

    @Deprecated
    public long V;

    @Deprecated
    public long W;

    @Deprecated
    public long X;

    @Deprecated
    public long Y;

    @Deprecated
    public long Z;
    public URL a;

    @Deprecated
    public long a0;
    public boolean b;

    @Deprecated
    public long b0;

    /* renamed from: c, reason: collision with root package name */
    public transient WeakReference<z> f5990c;

    @Deprecated
    public long c0;

    /* renamed from: d, reason: collision with root package name */
    public int f5991d;

    @Deprecated
    public long d0;

    /* renamed from: e, reason: collision with root package name */
    public int f5992e;

    @Deprecated
    public Map<String, Long> e0;

    /* renamed from: f, reason: collision with root package name */
    private EncryptType f5993f;
    public String f0;

    /* renamed from: g, reason: collision with root package name */
    public int f5994g;
    public JSONArray g0;
    public String h;
    public String h0;
    public int i;
    public boolean i0;
    public String j;

    @Deprecated
    public long j0;
    public JSONObject k;

    @Deprecated
    public long k0;
    public String l;

    @Deprecated
    public long l0;
    public boolean m;
    public int m0;

    @Deprecated
    public long n;
    public int n0;

    @Deprecated
    public long o;
    public String o0;

    @Deprecated
    public long p;
    public String p0;

    @Deprecated
    public long q;
    public JSONObject q0;

    @Deprecated
    public long r;
    public int r0;

    @Deprecated
    public long s;

    @Deprecated
    public long s0;

    @Deprecated
    public long t;

    @Deprecated
    public long t0;

    @Deprecated
    public long u;

    @Deprecated
    public long u0;

    @Deprecated
    public long v;

    @Deprecated
    public long v0;

    @Deprecated
    public long w;

    @Deprecated
    public long w0;

    @Deprecated
    public long x;

    @Deprecated
    public long x0;
    public int y;

    @Deprecated
    public int y0;
    public String z;
    public Map<String, Object> z0;

    public enum EncryptType {
        ENCRYPT_NONE(0),
        ENCRYPT_QUERY(1),
        ENCRYPT_BODY(2),
        ENCRYPT_BOTH_QUERY_AND_BODY(3);

        final int type;

        EncryptType(int i) {
            this.type = i;
        }

        public int getValue() {
            return this.type;
        }
    }

    class a implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ Throwable b;

        a(Object obj, Throwable th) {
            this.a = obj;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            RetrofitMetrics.this.p(this.a, this.b);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ Throwable b;

        b(Object obj, Throwable th) {
            this.a = obj;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            RetrofitMetrics.this.p(this.a, this.b);
        }
    }

    public interface c {
    }

    @Deprecated
    public class d {
        public String a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        public long f5997c;

        /* renamed from: d, reason: collision with root package name */
        public String f5998d = null;

        public d(RetrofitMetrics retrofitMetrics, String str, long j) {
            this.a = str;
            this.b = j;
            this.f5997c = j;
        }
    }

    public RetrofitMetrics(z zVar) {
        this.a = null;
        this.f5990c = null;
        this.f5991d = -1;
        this.f5992e = -1;
        this.f5993f = EncryptType.ENCRYPT_NONE;
        this.f5994g = -1;
        this.h = "";
        this.i = -1;
        this.j = "";
        this.l = "";
        this.m = false;
        this.y = -1;
        this.z = null;
        this.B = -1L;
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.N = null;
        this.O = new ConcurrentHashMap();
        this.P = new ConcurrentHashMap();
        this.Q = -1L;
        this.R = -1L;
        this.S = -1L;
        this.T = -1L;
        this.U = -1L;
        this.V = -1L;
        this.W = -1L;
        this.X = -1L;
        this.Y = -1L;
        this.Z = -1L;
        this.a0 = -1L;
        this.b0 = -1L;
        this.c0 = -1L;
        this.d0 = -1L;
        this.e0 = new HashMap();
        this.f0 = "";
        this.h0 = "";
        this.i0 = true;
        this.m0 = -999;
        this.n0 = -1;
        this.o0 = "";
        this.p0 = "";
        this.s0 = -1L;
        this.t0 = -1L;
        this.u0 = -1L;
        this.v0 = -1L;
        this.w0 = -1L;
        this.x0 = -1L;
        this.y0 = -1;
        this.z0 = new HashMap();
        this.A0 = null;
        this.B0 = 0;
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new I();
        this.F0 = new A();
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.f5990c = new WeakReference<>(zVar);
    }

    @Deprecated
    private JSONObject A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filterUrl", this.Q);
            jSONObject.put("addCommonParam", this.R);
            jSONObject.put("requestVerify", this.S);
            jSONObject.put("encryptRequest", this.U);
            jSONObject.put("genReqTicket", this.V);
            jSONObject.put("checkReqTicket", this.W);
            jSONObject.put("preCdnVerify", this.X);
            jSONObject.put("postCdnVerify", this.a0);
            jSONObject.put("addClientKey", this.Y);
            jSONObject.put("updateClientKey", this.Z);
            jSONObject.put("commandListener", this.b0);
            jSONObject.put("filterDupQuery", this.T);
            jSONObject.put("queryFilter", this.c0);
            long j = this.d0;
            if (j >= 0) {
                jSONObject.put("bodyEncrypt", j);
            }
            jSONObject.put("setSpeed", this.s0);
            jSONObject.put("tryInit", this.t0);
            jSONObject.put("openConn", this.u0);
            jSONObject.put("prepareReq", this.v0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Deprecated
    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.O.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Long> entry : this.O.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("request", jSONObject2);
            }
            if (!this.P.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Long> entry2 : this.P.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("response", jSONObject3);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private void I() {
        WeakReference<z> weakReference;
        if (this.I0 && this.H0) {
            this.E0.a.v = System.nanoTime();
            this.E0.a.w = System.currentTimeMillis();
            WeakReference<z> weakReference2 = this.f5990c;
            if (weakReference2 != null) {
                weakReference2.get().d(this.E0.a.w);
            }
            if (this.G0) {
                return;
            }
            l0(C0697a.a());
            if (M0 == null || (weakReference = this.f5990c) == null || weakReference.get() == null) {
                return;
            }
            z zVar = this.f5990c.get();
            WeakReference<Throwable> weakReference3 = this.E0.f5964e.f5982e;
            Throwable th = weakReference3 != null ? weakReference3.get() : null;
            if (O0) {
                p(zVar, th);
                return;
            }
            if (P0 != null) {
                ((com.bytedance.frameworks.baselib.network.d.a) P0).a(new a(zVar, th), 100L);
                return;
            }
            if (L0 == null) {
                synchronized (RetrofitMetrics.class) {
                    if (L0 == null) {
                        HandlerThread handlerThread = new HandlerThread("TTNet-Log-Report");
                        K0 = handlerThread;
                        handlerThread.start();
                        L0 = new Handler(K0.getLooper());
                    }
                }
            }
            L0.postDelayed(new b(zVar, th), 100L);
        }
    }

    public static void h0(InterfaceC0699c interfaceC0699c) {
        P0 = interfaceC0699c;
    }

    public static void k0(boolean z) {
        N0 = z;
    }

    public static void m0(c cVar) {
        M0 = cVar;
    }

    public static void n0(boolean z) {
        O0 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Object obj, Throwable th) {
        URL url = this.a;
        String url2 = url != null ? url.toString() : "";
        if (th == null) {
            ((com.bytedance.frameworks.baselib.network.http.j) M0).c(url2, obj);
            return;
        }
        if (th instanceof com.bytedance.retrofit2.T.c) {
            com.bytedance.retrofit2.T.c cVar = (com.bytedance.retrofit2.T.c) th;
            if (cVar.a) {
                ((com.bytedance.frameworks.baselib.network.http.j) M0).c(url2, obj);
            }
            if (cVar.b) {
                ((com.bytedance.frameworks.baselib.network.http.j) M0).b(url2, obj, th);
                return;
            }
            return;
        }
        I.d dVar = this.E0.f5964e;
        if (!dVar.a) {
            Objects.requireNonNull((com.bytedance.frameworks.baselib.network.http.j) M0);
            int i = com.bytedance.frameworks.baselib.network.http.f.v;
        } else {
            dVar.f5980c = th;
            this.N = th;
            ((com.bytedance.frameworks.baselib.network.http.j) M0).c(url2, obj);
        }
    }

    private boolean v0(JSONObject jSONObject, String str, long j, long j2, boolean z) {
        try {
            if (!z || j > j2) {
                jSONObject.put(str, -1);
                return false;
            }
            jSONObject.put(str, j2 - j);
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Deprecated
    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", this.f5994g);
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put("fallbackMessage", this.h);
            }
            jSONObject.put("reqFallback", this.i);
            if (!TextUtils.isEmpty(this.j)) {
                jSONObject.put("reqFallbackMsg", this.j);
            }
            jSONObject.put("createRetrofitTime", this.n);
            jSONObject.put("appRequestStartTime", this.o);
            jSONObject.put("beforeAllInterceptTime", this.p);
            jSONObject.put("callServerInterceptTime", this.q);
            jSONObject.put("callExecuteStartTime", this.r);
            jSONObject.put("reportTime", this.s);
            EncryptType encryptType = this.f5993f;
            if (encryptType != EncryptType.ENCRYPT_NONE) {
                jSONObject.put("encrypt", encryptType.getValue());
            }
            if (!TextUtils.isEmpty(this.l)) {
                jSONObject.put("transactionId", this.l);
            }
            long j = this.w0;
            if (j >= 0) {
                jSONObject.put("upper_add_cookie_us", j);
            }
            long j2 = this.x0;
            if (j2 >= 0) {
                jSONObject.put("upper_save_cookie_us", j2);
            }
            jSONObject.put("request_cookie_source", this.y0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        boolean v0 = v0(jSONObject, "loadServiceMethod", this.t, this.u, true);
        long j3 = this.w;
        boolean v02 = j3 > 0 ? v0(jSONObject, "enqueueWait", j3, this.G, v0) : v0(jSONObject, "executeWait", this.x, this.G, v0);
        I.b bVar = this.E0.a;
        v0(jSONObject, "biz_start_after_cronet_start", bVar.f5970c / 1000, bVar.k / 1000, true);
        I.b bVar2 = this.E0.a;
        v0(jSONObject, "biz_start_before_cronet_end", bVar2.m / 1000, bVar2.f5971d / 1000, true);
        v0(jSONObject, "responseParse", this.L, this.M, v0(jSONObject, "requestParse", this.H, this.I, v0(jSONObject, "executeCall", this.f5989J, this.K, v02)));
        return jSONObject;
    }

    @Deprecated
    public String C() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f5994g != -1) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("model", Build.MODEL);
                    String str = "";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr != null && strArr.length > 0) {
                        str = Arrays.asList(strArr).toString();
                    }
                    jSONObject2.put("abis", str);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                jSONObject.put("model", jSONObject2);
            }
            JSONObject jSONObject3 = this.k;
            if (jSONObject3 != null) {
                jSONObject.put("concurrentRequest", jSONObject3);
            }
            jSONObject.put("concurrent", this.m);
            jSONObject.put("base", z());
            jSONObject.put("callback", A());
            jSONObject.put("interceptor", B());
            jSONObject.put("ttnetVersion", this.f0);
            JSONArray jSONArray = this.g0;
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject.put("actionInfo", this.g0);
            }
            JSONObject jSONObject4 = this.q0;
            if (jSONObject4 != null) {
                jSONObject.put("compress", jSONObject4);
            }
            int i = this.r0;
            if (i > 0) {
                jSONObject.put("postBufferSize", i);
            }
            int i2 = this.B0;
            if (i2 > 0) {
                jSONObject.put("blockingQueueSize", i2);
            }
            long j = this.F0.f5889e.f5912d;
            if (j > 0) {
                jSONObject.put("apiStreamReadCount", j);
            }
            jSONObject.put("stateDelayed", this.A);
            jSONObject.put("stateDelayTime", this.B);
            jSONObject.put("syncCount", this.C);
            jSONObject.put("asyncCount", this.D);
            jSONObject.put("delayState", this.y);
            jSONObject.put("random", this.F);
            if (!TextUtils.isEmpty(this.z)) {
                jSONObject.put("stateName", this.z);
            }
            if (this.Y >= 0) {
                jSONObject.put("cli_key", true);
            }
            int i3 = this.f5991d;
            if (i3 >= 0) {
                jSONObject.put("cp_cnt", i3);
            }
            int i4 = this.f5992e;
            if (i4 >= 0) {
                jSONObject.put("read_type", i4);
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void D() {
        this.E0.a.x = System.nanoTime();
        this.s = a(this.E0.a.x);
    }

    public void E() {
        long nanoTime = System.nanoTime();
        I i = this.E0;
        i.a.o = nanoTime;
        s.a a2 = i.f5963d.a();
        if (a2 != null) {
            a2.f6043d = nanoTime;
        }
    }

    public void F() {
        long nanoTime = System.nanoTime();
        I i = this.E0;
        i.a.r = nanoTime;
        s.a a2 = i.f5963d.a();
        if (a2 != null) {
            a2.f6044e = nanoTime;
        }
    }

    public void G() {
        this.H0 = true;
        I();
    }

    public void H() {
        this.I0 = true;
        I();
    }

    public void J() {
        A.a aVar = this.F0.b;
        aVar.f5891c = aVar.a();
        if (this.t0 == -1) {
            this.t0 = 0L;
        }
        this.t0 = com.bytedance.feedbackerlib.a.p0(this.F0.b.f5891c) + this.t0;
    }

    public void K() {
        A.c cVar = this.F0.f5887c;
        cVar.i = cVar.a();
    }

    public void L() {
        I.c cVar = this.E0.f5962c;
        cVar.h = cVar.a();
        this.X = com.bytedance.feedbackerlib.a.p0(this.E0.f5962c.h);
    }

    public void M() {
        this.F0.a.b = System.nanoTime();
    }

    public void N() {
        this.F0.a.a = System.nanoTime();
    }

    public void O() {
        this.F0.a.f5899f = System.nanoTime();
        A.c cVar = this.F0.f5887c;
        cVar.h = cVar.a();
    }

    public void P() {
        A.c cVar = this.F0.f5887c;
        cVar.b = cVar.a();
        this.c0 = com.bytedance.feedbackerlib.a.p0(this.F0.f5887c.b);
    }

    public void Q() {
        this.G0 = false;
        this.F0.a.h = System.nanoTime();
        A a2 = this.F0;
        if (a2.f5889e.f5913e) {
            return;
        }
        A.c cVar = a2.f5887c;
        if (cVar.j == -1) {
            cVar.j = 0L;
        }
        cVar.j = cVar.a() + cVar.j;
        if (this.E0.a.v != -1) {
            I();
        }
    }

    public void R() {
        this.G0 = true;
        A a2 = this.F0;
        A.e eVar = a2.f5889e;
        if (eVar.f5912d == -1) {
            eVar.f5912d = 0L;
        }
        eVar.f5912d++;
        A.b bVar = a2.a;
        if (bVar.f5900g == -1) {
            bVar.f5900g = System.nanoTime();
        }
        A a3 = this.F0;
        if (a3.f5889e.f5913e) {
            return;
        }
        A.a aVar = a3.b;
        if (aVar.i == -1) {
            long j = this.E0.a.t;
            if (j != -1) {
                long j2 = a3.a.f5900g;
                if (j2 > j) {
                    aVar.i = j2 - j;
                }
            }
        }
        if (a3.a.h != -1) {
            if (aVar.j == -1) {
                aVar.j = 0L;
            }
            aVar.j = (System.nanoTime() - this.F0.a.h) + aVar.j;
        }
        this.F0.f5887c.c();
    }

    @Deprecated
    public void S() {
        if (this.C0.size() <= 0) {
            return;
        }
        this.C0.get(r0.size() - 1).f5997c = SystemClock.uptimeMillis();
    }

    @Deprecated
    public void T(com.bytedance.retrofit2.S.a aVar) {
        String name = aVar.getClass().getName();
        if (TextUtils.isEmpty(name)) {
            return;
        }
        this.C0.add(new d(this, name.substring(name.lastIndexOf(46) + 1), SystemClock.uptimeMillis()));
    }

    @Deprecated
    public void U(Exception exc) {
        if (this.D0.size() <= 0) {
            return;
        }
        this.D0.get(r0.size() - 1).f5997c = SystemClock.uptimeMillis();
        if (exc != null) {
            this.D0.get(r0.size() - 1).f5998d = exc.getClass().getSimpleName();
        }
    }

    @Deprecated
    public void V(com.bytedance.retrofit2.S.a aVar) {
        String name = aVar.getClass().getName();
        if (TextUtils.isEmpty(name)) {
            return;
        }
        this.D0.add(new d(this, name.substring(name.lastIndexOf(46) + 1), SystemClock.uptimeMillis()));
    }

    public void W() {
        long nanoTime = System.nanoTime();
        I i = this.E0;
        I.b bVar = i.a;
        bVar.j = nanoTime;
        I.c cVar = i.f5962c;
        long j = bVar.k;
        long j2 = nanoTime - j;
        cVar.f5977e = j2;
        if (bVar.h > j) {
            long j3 = cVar.f5976d;
            if (j3 != -1) {
                cVar.f5977e = j2 - j3;
            }
        }
    }

    public void X() {
        I.a aVar = this.E0.b;
        aVar.h = aVar.a();
        this.S = com.bytedance.feedbackerlib.a.p0(this.E0.b.h);
    }

    @Deprecated
    public void Y(long j) {
        this.F0.f5887c.f5905g = System.nanoTime() - j;
    }

    public void Z(EncryptType encryptType) {
        this.f5993f = encryptType;
    }

    public long a(long j) {
        I.b bVar = this.E0.a;
        long j2 = bVar.f5972e;
        long j3 = bVar.f5973f;
        if (j2 < 0 || j3 < 0 || j < 0 || j3 > j) {
            return -1L;
        }
        return com.bytedance.feedbackerlib.a.p0(j - j3) + j2;
    }

    public void a0(long j) {
        this.F0.f5888d.a = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().j(j);
        }
    }

    public void b0(long j) {
        this.F0.f5888d.f5910g = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().i(j);
        }
    }

    public void c() {
        I.a aVar = this.E0.b;
        aVar.f5968f = aVar.a();
        this.R = com.bytedance.feedbackerlib.a.p0(this.E0.b.f5968f);
    }

    public void c0(long j) {
        this.F0.f5888d.f5907d = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().f(j);
        }
    }

    public void d() {
        this.E0.b.c();
    }

    public void d0(long j) {
        this.F0.f5888d.b = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().m(j);
        }
    }

    public void e(Throwable th) {
        s.a aVar;
        long nanoTime = System.nanoTime();
        s sVar = this.E0.f5963d;
        Objects.requireNonNull(sVar);
        try {
            aVar = sVar.a.pop();
            sVar.b.push(aVar);
        } catch (NoSuchElementException unused) {
            aVar = null;
        }
        if (aVar != null) {
            if (aVar.f6043d == -1) {
                aVar.f6043d = nanoTime;
                if (th != null) {
                    aVar.f6046g = th.getClass().getSimpleName();
                }
            } else if (aVar.f6044e != -1) {
                aVar.f6045f = nanoTime;
                if (th != null) {
                    aVar.f6046g = th.getClass().getSimpleName();
                }
            }
            if (!aVar.b) {
                long j = aVar.f6044e;
                if (j != -1) {
                    long j2 = aVar.f6045f;
                    if (j2 != -1) {
                        I.a aVar2 = this.E0.b;
                        if (aVar2.m == -1) {
                            aVar2.m = 0L;
                        }
                        aVar2.m = (j2 - j) + aVar2.m;
                    }
                }
            }
        }
        s.a a2 = this.E0.f5963d.a();
        if (a2 == null) {
            this.E0.a.s = nanoTime;
        } else if (th == null) {
            a2.f6044e = nanoTime;
        }
    }

    public void e0(long j) {
        this.F0.f5888d.f5909f = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().g(j);
        }
    }

    public void f() {
        A.a aVar = this.F0.b;
        aVar.f5893e = aVar.a();
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().k(com.bytedance.feedbackerlib.a.p0(this.F0.b.f5893e));
        }
    }

    public void f0(long j) {
        this.F0.f5888d.f5906c = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().a(j);
        }
    }

    public void g(com.bytedance.retrofit2.S.a aVar) {
        String name = aVar.getClass().getName();
        if (TextUtils.isEmpty(name)) {
            return;
        }
        long nanoTime = System.nanoTime();
        s.a a2 = this.E0.f5963d.a();
        if (a2 != null) {
            if (a2.f6043d == -1) {
                a2.f6043d = nanoTime;
            }
            if (!a2.b) {
                I.a aVar2 = this.E0.b;
                if (aVar2.l == -1) {
                    aVar2.l = 0L;
                }
                aVar2.l = (a2.f6043d - a2.f6042c) + aVar2.l;
            }
        } else {
            this.E0.a.n = nanoTime;
            this.G = com.bytedance.feedbackerlib.a.p0(nanoTime);
            this.p = a(nanoTime);
        }
        this.E0.f5963d.a.push(new s.a(name.substring(name.lastIndexOf(46) + 1), aVar instanceof com.bytedance.retrofit2.T.b, nanoTime));
    }

    public void g0(long j) {
        this.F0.f5888d.h = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().b(j);
        }
    }

    public void h(boolean z) {
        I.b bVar = this.E0.a;
        long currentTimeMillis = System.currentTimeMillis();
        bVar.f5972e = currentTimeMillis;
        this.n = currentTimeMillis;
        this.E0.a.f5973f = System.nanoTime();
        long p0 = com.bytedance.feedbackerlib.a.p0(this.E0.a.f5973f);
        this.v = p0;
        if (z) {
            this.u = p0;
            this.t = p0;
        }
    }

    public void i() {
        this.E0.a.u = System.currentTimeMillis();
        this.E0.a.t = System.nanoTime();
    }

    public void i0(String str) {
        this.F0.f5890f = str;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().e(str);
        }
    }

    public void j() {
        A.a aVar = this.F0.b;
        aVar.b = aVar.a();
        this.d0 = com.bytedance.feedbackerlib.a.p0(this.F0.b.b);
    }

    public void j0(int i) {
        if (this.m0 == -999) {
            this.m0 = i;
        }
    }

    public void k() {
        I.a aVar = this.E0.b;
        aVar.j = aVar.a();
        this.W = com.bytedance.feedbackerlib.a.p0(this.E0.b.j);
    }

    public void l() {
        I.a aVar = this.E0.b;
        aVar.i = aVar.a();
        this.b0 = com.bytedance.feedbackerlib.a.p0(this.E0.b.i);
    }

    public void l0(long j) {
        this.E0.f5964e.f5984g = j;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().l(j);
        }
    }

    public void m(long j) {
        this.F0.f5887c.f5902d = System.nanoTime() - j;
        this.v0 = com.bytedance.feedbackerlib.a.p0(this.F0.f5887c.f5902d);
    }

    public void n(long j) {
        this.F0.f5887c.f5901c = System.nanoTime() - j;
        this.u0 = com.bytedance.feedbackerlib.a.p0(this.F0.f5887c.f5901c);
    }

    public void o(RetrofitMetrics retrofitMetrics) {
        if (retrofitMetrics == null) {
            return;
        }
        try {
            if (this.a != null) {
                retrofitMetrics.a = new URL(this.a.toString());
            }
        } catch (Exception unused) {
        }
        retrofitMetrics.b = this.b;
        retrofitMetrics.f5991d = this.f5991d;
        retrofitMetrics.f5992e = this.f5992e;
        retrofitMetrics.f5993f = this.f5993f;
        retrofitMetrics.f5994g = this.f5994g;
        retrofitMetrics.h = this.h;
        retrofitMetrics.i = this.i;
        retrofitMetrics.j = this.j;
        try {
            retrofitMetrics.k = this.k != null ? new JSONObject(this.k.toString()) : null;
        } catch (JSONException unused2) {
        }
        retrofitMetrics.l = this.l;
        retrofitMetrics.m = this.m;
        retrofitMetrics.n = this.n;
        retrofitMetrics.o = this.o;
        retrofitMetrics.p = this.p;
        retrofitMetrics.q = this.q;
        retrofitMetrics.r = this.r;
        retrofitMetrics.s = this.s;
        retrofitMetrics.t = this.t;
        retrofitMetrics.u = this.u;
        retrofitMetrics.v = this.v;
        retrofitMetrics.w = this.w;
        retrofitMetrics.x = this.x;
        retrofitMetrics.y = this.y;
        retrofitMetrics.z = this.z;
        retrofitMetrics.A = this.A;
        retrofitMetrics.B = this.B;
        retrofitMetrics.C = this.C;
        retrofitMetrics.D = this.D;
        retrofitMetrics.E = this.E;
        retrofitMetrics.F = this.F;
        retrofitMetrics.G = this.G;
        retrofitMetrics.H = this.H;
        retrofitMetrics.I = this.I;
        retrofitMetrics.f5989J = this.f5989J;
        retrofitMetrics.K = this.K;
        retrofitMetrics.L = this.L;
        retrofitMetrics.M = this.M;
        if (this.N != null) {
            Throwable th = new Throwable(this.N.getMessage());
            th.setStackTrace(this.N.getStackTrace());
            retrofitMetrics.N = th;
        }
        if (this.O != null) {
            retrofitMetrics.O = new ConcurrentHashMap();
            for (Map.Entry<String, Long> entry : this.O.entrySet()) {
                retrofitMetrics.O.put(entry.getKey(), entry.getValue());
            }
        }
        if (this.P != null) {
            retrofitMetrics.P = new ConcurrentHashMap();
            for (Map.Entry<String, Long> entry2 : this.P.entrySet()) {
                retrofitMetrics.P.put(entry2.getKey(), entry2.getValue());
            }
        }
        retrofitMetrics.Q = this.Q;
        retrofitMetrics.R = this.R;
        retrofitMetrics.S = this.S;
        retrofitMetrics.T = this.T;
        retrofitMetrics.U = this.U;
        retrofitMetrics.V = this.V;
        retrofitMetrics.W = this.W;
        retrofitMetrics.X = this.X;
        retrofitMetrics.Y = this.Y;
        retrofitMetrics.Z = this.Z;
        retrofitMetrics.a0 = this.a0;
        retrofitMetrics.b0 = this.b0;
        retrofitMetrics.c0 = this.c0;
        retrofitMetrics.d0 = this.d0;
        if (this.e0 != null) {
            retrofitMetrics.e0 = new ConcurrentHashMap();
            for (Map.Entry<String, Long> entry3 : this.e0.entrySet()) {
                retrofitMetrics.e0.put(entry3.getKey(), entry3.getValue());
            }
        }
        retrofitMetrics.f0 = this.f0;
        try {
            if (this.g0 != null) {
                retrofitMetrics.g0 = new JSONArray(this.g0.toString());
            }
        } catch (JSONException unused3) {
        }
        retrofitMetrics.h0 = this.h0;
        retrofitMetrics.i0 = this.i0;
        retrofitMetrics.j0 = this.j0;
        retrofitMetrics.k0 = this.k0;
        retrofitMetrics.l0 = this.l0;
        retrofitMetrics.m0 = this.m0;
        retrofitMetrics.n0 = this.n0;
        retrofitMetrics.o0 = this.o0;
        retrofitMetrics.p0 = this.p0;
        try {
            retrofitMetrics.q0 = this.q0 != null ? new JSONObject(this.q0.toString()) : null;
        } catch (JSONException unused4) {
        }
        retrofitMetrics.r0 = this.r0;
        retrofitMetrics.s0 = this.s0;
        retrofitMetrics.t0 = this.t0;
        retrofitMetrics.u0 = this.u0;
        retrofitMetrics.v0 = this.v0;
        retrofitMetrics.w0 = this.w0;
        retrofitMetrics.x0 = this.x0;
        retrofitMetrics.y0 = this.y0;
        if (this.z0 != null) {
            retrofitMetrics.z0 = new HashMap();
            for (Map.Entry<String, Object> entry4 : this.z0.entrySet()) {
                retrofitMetrics.z0.put(entry4.getKey(), entry4.getValue());
            }
        }
        try {
            retrofitMetrics.A0 = this.A0 != null ? new JSONObject(this.A0.toString()) : null;
        } catch (JSONException unused5) {
        }
        retrofitMetrics.B0 = this.B0;
        List<d> list = this.C0;
        if (list != null) {
            for (d dVar : list) {
                d dVar2 = new d(this, dVar.a, dVar.b);
                dVar2.f5997c = dVar.f5997c;
                dVar2.f5998d = dVar.f5998d;
                retrofitMetrics.C0.add(dVar2);
            }
        }
        List<d> list2 = this.D0;
        if (list2 != null) {
            for (d dVar3 : list2) {
                d dVar4 = new d(this, dVar3.a, dVar3.b);
                dVar4.f5997c = dVar3.f5997c;
                dVar4.f5998d = dVar3.f5998d;
                retrofitMetrics.D0.add(dVar4);
            }
        }
        retrofitMetrics.H0 = this.H0;
        retrofitMetrics.I0 = this.I0;
        retrofitMetrics.f5990c = this.f5990c;
        I i = this.E0;
        Objects.requireNonNull(i);
        I i2 = new I();
        I.b bVar = i.a;
        I.b bVar2 = new I.b();
        bVar2.a = bVar.a;
        bVar2.b = bVar.b;
        bVar2.f5970c = bVar.f5970c;
        bVar2.f5971d = bVar.f5971d;
        bVar2.f5972e = bVar.f5972e;
        bVar2.f5973f = bVar.f5973f;
        bVar2.f5974g = bVar.f5974g;
        bVar2.l = bVar.l;
        bVar2.j = bVar.j;
        bVar2.k = bVar.k;
        bVar2.m = bVar.m;
        bVar2.n = bVar.n;
        bVar2.o = bVar.o;
        bVar2.p = bVar.p;
        bVar2.q = bVar.q;
        bVar2.r = bVar.r;
        bVar2.s = bVar.s;
        bVar2.t = bVar.t;
        bVar2.u = bVar.u;
        bVar2.v = bVar.v;
        bVar2.w = bVar.w;
        bVar2.x = bVar.x;
        i2.a = bVar2;
        i2.b = i.b.b();
        i2.f5962c = i.f5962c.b();
        s sVar = i.f5963d;
        Objects.requireNonNull(sVar);
        s sVar2 = new s();
        sVar2.a = new ArrayDeque();
        Iterator<s.a> it2 = sVar.a.iterator();
        while (it2.hasNext()) {
            sVar2.a.push(it2.next().a());
        }
        sVar2.b = new ArrayDeque();
        Iterator<s.a> it3 = sVar.b.iterator();
        while (it3.hasNext()) {
            sVar2.b.push(it3.next().a());
        }
        i2.f5963d = sVar2;
        I.d dVar5 = i.f5964e;
        I.d dVar6 = new I.d();
        dVar6.a = dVar5.a;
        dVar6.b = dVar5.b;
        dVar6.f5981d = dVar5.f5981d;
        dVar6.f5983f = dVar5.f5983f;
        dVar6.f5984g = dVar5.f5984g;
        if (dVar5.f5980c != null) {
            Throwable th2 = new Throwable(dVar5.f5980c.getMessage());
            dVar6.f5980c = th2;
            th2.setStackTrace(dVar5.f5980c.getStackTrace());
        }
        WeakReference<Throwable> weakReference = dVar5.f5982e;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference<Throwable> weakReference2 = new WeakReference<>(new Throwable(dVar5.f5982e.get().getMessage()));
            dVar6.f5982e = weakReference2;
            weakReference2.get().setStackTrace(dVar5.f5982e.get().getStackTrace());
        }
        i2.f5964e = dVar6;
        retrofitMetrics.E0 = i2;
        A a2 = this.F0;
        Objects.requireNonNull(a2);
        A a3 = new A();
        A.b bVar3 = a2.a;
        A.b bVar4 = new A.b();
        bVar4.a = bVar3.a;
        bVar4.b = bVar3.b;
        bVar4.f5896c = bVar3.f5896c;
        bVar4.f5897d = bVar3.f5897d;
        bVar4.f5898e = bVar3.f5898e;
        bVar4.f5899f = bVar3.f5899f;
        bVar4.f5900g = bVar3.f5900g;
        bVar4.h = bVar3.h;
        a3.a = bVar4;
        a3.b = a2.b.b();
        a3.f5887c = a2.f5887c.b();
        A.d dVar7 = a2.f5888d;
        A.d dVar8 = new A.d();
        dVar8.a = dVar7.a;
        dVar8.b = dVar7.b;
        dVar8.f5906c = dVar7.f5906c;
        dVar8.f5907d = dVar7.f5907d;
        dVar8.f5908e = dVar7.f5908e;
        dVar8.f5909f = dVar7.f5909f;
        dVar8.f5910g = dVar7.f5910g;
        dVar8.h = dVar7.h;
        dVar8.i = dVar7.i;
        dVar8.j = dVar7.j;
        a3.f5888d = dVar8;
        A.e eVar = a2.f5889e;
        A.e eVar2 = new A.e();
        eVar2.a = eVar.a;
        eVar2.b = eVar.b;
        eVar2.f5912d = eVar.f5912d;
        eVar2.f5913e = eVar.f5913e;
        eVar2.f5914f = eVar.f5914f;
        try {
            if (eVar.f5911c != null) {
                eVar2.f5911c = new JSONObject(eVar.f5911c.toString());
            }
            if (eVar.f5915g != null) {
                eVar2.f5915g = new JSONObject(eVar.f5915g.toString());
            }
        } catch (JSONException unused6) {
        }
        a3.f5889e = eVar2;
        a3.f5890f = a2.f5890f;
        retrofitMetrics.F0 = a3;
    }

    public void o0() {
        this.E0.a.m = System.nanoTime();
        this.l0 = com.bytedance.feedbackerlib.a.p0(this.E0.a.m);
    }

    public void p0(boolean z) {
        I.b bVar = this.E0.a;
        long currentTimeMillis = System.currentTimeMillis();
        bVar.l = currentTimeMillis;
        this.o = currentTimeMillis;
        this.E0.a.k = System.nanoTime();
        if (z) {
            this.w = com.bytedance.feedbackerlib.a.p0(this.E0.a.k);
        } else {
            this.x = com.bytedance.feedbackerlib.a.p0(this.E0.a.k);
        }
        this.E0.f5964e.f5983f = C0697a.a();
        I i = this.E0;
        I.a aVar = i.b;
        I.b bVar2 = i.a;
        long j = bVar2.k;
        long j2 = j - bVar2.f5974g;
        aVar.b = j2;
        long j3 = bVar2.i;
        if (j3 == -1 || j3 >= j) {
            return;
        }
        long j4 = i.f5962c.f5976d;
        if (j4 != -1) {
            aVar.b = j2 - j4;
        }
    }

    public void q() {
        I.a aVar = this.E0.b;
        aVar.f5969g = aVar.a();
        this.U = com.bytedance.feedbackerlib.a.p0(this.E0.b.f5969g);
    }

    public void q0(JSONObject jSONObject) throws JSONException {
        int i;
        JSONObject jSONObject2;
        int i2;
        JSONObject jSONObject3;
        int i3;
        JSONObject jSONObject4;
        int i4;
        WeakReference<z> weakReference = this.f5990c;
        if (weakReference != null) {
            weakReference.get().h(jSONObject);
        }
        if (N0) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("retrofit", this.E0.d());
            A a2 = this.F0;
            Objects.requireNonNull(a2);
            JSONObject jSONObject6 = new JSONObject();
            A.b bVar = a2.a;
            Objects.requireNonNull(bVar);
            i = A.f5886g;
            JSONObject jSONObject7 = null;
            if ((i & 32) == 0) {
                jSONObject2 = null;
            } else {
                jSONObject2 = new JSONObject();
                e.a.a.a.a.c0(bVar.a, jSONObject2, "prp_conn_s");
                e.a.a.a.a.c0(bVar.b, jSONObject2, "prp_conn_e");
                e.a.a.a.a.c0(bVar.f5896c, jSONObject2, "exe_conn_s");
                e.a.a.a.a.c0(bVar.f5897d, jSONObject2, "exe_conn_e");
                e.a.a.a.a.c0(bVar.f5898e, jSONObject2, "prc_rsp_bdy_s");
                e.a.a.a.a.c0(bVar.f5899f, jSONObject2, "prc_rsp_bdy_e");
                e.a.a.a.a.c0(bVar.f5900g, jSONObject2, "frs_rd_rsp_bdy_s");
                e.a.a.a.a.c0(bVar.h, jSONObject2, "lst_rd_rsp_bdy_e");
            }
            jSONObject6.put("event_ts", jSONObject2);
            A.a aVar = a2.b;
            Objects.requireNonNull(aVar);
            i2 = A.f5886g;
            if ((i2 & 64) == 0) {
                jSONObject3 = null;
            } else {
                jSONObject3 = new JSONObject();
                e.a.a.a.a.c0(aVar.b, jSONObject3, "bdy_encrypt");
                e.a.a.a.a.c0(aVar.f5891c, jSONObject3, "on_try_init");
                e.a.a.a.a.c0(aVar.f5892d, jSONObject3, "init_cookie");
                e.a.a.a.a.c0(aVar.f5893e, jSONObject3, "bd_turing");
                e.a.a.a.a.c0(aVar.f5894f, jSONObject3, "acnt_rty");
                e.a.a.a.a.c0(aVar.f5895g, jSONObject3, "rot_rty");
                e.a.a.a.a.c0(aVar.i, jSONObject3, "wait_rd_rsp_bdy");
                e.a.a.a.a.c0(aVar.j, jSONObject3, "rd_rsp_bdy_intvl");
                e.a.a.a.a.c0(aVar.k, jSONObject3, "input_stream_prc");
                long j = aVar.h;
                if (j > 0) {
                    e.a.a.a.a.c0(j, jSONObject3, "req_audit");
                }
            }
            jSONObject6.put("biz_span", jSONObject3);
            A.c cVar = a2.f5887c;
            Objects.requireNonNull(cVar);
            i3 = A.f5886g;
            if ((i3 & 128) == 0) {
                jSONObject4 = null;
            } else {
                jSONObject4 = new JSONObject();
                e.a.a.a.a.c0(cVar.b, jSONObject4, "qry_flt");
                e.a.a.a.a.c0(cVar.f5901c, jSONObject4, "last_cons_conn");
                e.a.a.a.a.c0(cVar.f5902d, jSONObject4, "last_conf_conn");
                e.a.a.a.a.c0(cVar.f5904f, jSONObject4, "last_exe_conn");
                e.a.a.a.a.c0(cVar.f5905g, jSONObject4, "cons_conf_n_rty_conn");
                e.a.a.a.a.c0(cVar.h, jSONObject4, "prc_rsp_bdy");
                e.a.a.a.a.c0(cVar.i, jSONObject4, "post_prc_rsp_bdy");
                e.a.a.a.a.c0(cVar.j, jSONObject4, "total_rd_rsp_bdy");
                e.a.a.a.a.c0(cVar.f5903e, jSONObject4, "reflect");
            }
            jSONObject6.put("inner_span", jSONObject4);
            A.e eVar = a2.f5889e;
            Objects.requireNonNull(eVar);
            i4 = A.f5886g;
            if ((i4 & 256) != 0) {
                jSONObject7 = new JSONObject();
                JSONObject jSONObject8 = eVar.f5915g;
                if (jSONObject8 != null) {
                    jSONObject7.put("req_audit", jSONObject8);
                }
            }
            jSONObject6.put("misc", jSONObject7);
            jSONObject5.put("networklib", jSONObject6);
            jSONObject.put("ttnet", jSONObject5);
        }
    }

    public void r() {
        I.a aVar = this.E0.b;
        aVar.n = aVar.a();
        this.k0 = SystemClock.uptimeMillis();
    }

    public void r0() {
        I.c cVar = this.E0.f5962c;
        cVar.f5976d = cVar.a();
        this.E0.a.i = System.nanoTime();
        this.I = com.bytedance.feedbackerlib.a.p0(this.E0.a.i);
    }

    public void s() {
        this.E0.b.c();
        this.j0 = SystemClock.uptimeMillis();
    }

    public void s0() {
        this.E0.f5962c.c();
        this.E0.a.h = System.nanoTime();
        this.H = com.bytedance.feedbackerlib.a.p0(this.E0.a.h);
    }

    public void t(long j) {
        long nanoTime = System.nanoTime();
        A a2 = this.F0;
        a2.a.f5897d = nanoTime;
        a2.f5887c.f5904f = nanoTime - j;
    }

    public void t0() {
        A.a aVar = this.F0.b;
        aVar.f5892d = aVar.a();
        if (this.t0 == -1) {
            this.t0 = 0L;
        }
        this.t0 = com.bytedance.feedbackerlib.a.p0(this.F0.b.f5892d) + this.t0;
    }

    public long u() {
        long nanoTime = System.nanoTime();
        this.F0.a.f5896c = nanoTime;
        return nanoTime;
    }

    public void u0() {
        I.c cVar = this.E0.f5962c;
        cVar.k = cVar.a();
        this.Z = com.bytedance.feedbackerlib.a.p0(this.E0.f5962c.k);
    }

    public void v() {
        this.E0.a.q = System.nanoTime();
        this.K = com.bytedance.feedbackerlib.a.p0(this.E0.a.q);
    }

    public void w() {
        I.c cVar = this.E0.f5962c;
        cVar.f5978f = cVar.a();
        this.T = com.bytedance.feedbackerlib.a.p0(this.E0.f5962c.f5978f);
    }

    public void x() {
        I.a aVar = this.E0.b;
        aVar.f5966d = aVar.a();
        this.Q = com.bytedance.feedbackerlib.a.p0(this.E0.b.f5966d);
    }

    public void y() {
        I.c cVar = this.E0.f5962c;
        cVar.f5979g = cVar.a();
        this.V = com.bytedance.feedbackerlib.a.p0(this.E0.f5962c.f5979g);
    }

    public RetrofitMetrics() {
        this.a = null;
        this.f5990c = null;
        this.f5991d = -1;
        this.f5992e = -1;
        this.f5993f = EncryptType.ENCRYPT_NONE;
        this.f5994g = -1;
        this.h = "";
        this.i = -1;
        this.j = "";
        this.l = "";
        this.m = false;
        this.y = -1;
        this.z = null;
        this.B = -1L;
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.N = null;
        this.O = new ConcurrentHashMap();
        this.P = new ConcurrentHashMap();
        this.Q = -1L;
        this.R = -1L;
        this.S = -1L;
        this.T = -1L;
        this.U = -1L;
        this.V = -1L;
        this.W = -1L;
        this.X = -1L;
        this.Y = -1L;
        this.Z = -1L;
        this.a0 = -1L;
        this.b0 = -1L;
        this.c0 = -1L;
        this.d0 = -1L;
        this.e0 = new HashMap();
        this.f0 = "";
        this.h0 = "";
        this.i0 = true;
        this.m0 = -999;
        this.n0 = -1;
        this.o0 = "";
        this.p0 = "";
        this.s0 = -1L;
        this.t0 = -1L;
        this.u0 = -1L;
        this.v0 = -1L;
        this.w0 = -1L;
        this.x0 = -1L;
        this.y0 = -1;
        this.z0 = new HashMap();
        this.A0 = null;
        this.B0 = 0;
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new I();
        this.F0 = new A();
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        EncryptType encryptType = EncryptType.ENCRYPT_NONE;
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        new I();
        new A();
        new WeakReference(null);
    }
}
