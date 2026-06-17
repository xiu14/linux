package com.bytedance.frameworks.baselib.network.http;

import android.webkit.CookieManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.C0697a;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {
    private static e a = null;
    private static b b = null;

    /* renamed from: c, reason: collision with root package name */
    private static h f5119c = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f5120d = false;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f5121e = false;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5122f = false;

    /* renamed from: g, reason: collision with root package name */
    private static i f5123g;
    private static c h;
    private static g i;
    private static InterfaceC0256f j;
    private static d k;
    private static a p;
    private static boolean u;
    public static final /* synthetic */ int v = 0;
    private static volatile AtomicBoolean l = new AtomicBoolean(false);
    private static final Object m = new Object();
    private static CountDownLatch n = new CountDownLatch(1);
    private static String o = null;
    private static final Map<String, j> q = new ConcurrentHashMap();
    private static AtomicBoolean r = new AtomicBoolean(false);
    private static int s = 100;
    private static boolean t = true;

    public interface a {
    }

    public interface b<T extends com.bytedance.frameworks.baselib.network.http.b> {
        String a(String str, boolean z, Object... objArr);

        String b(String str, boolean z);
    }

    public interface c<T extends com.bytedance.frameworks.baselib.network.http.c> {
    }

    public interface d {
    }

    public interface e {
        void a(List<String> list);

        String b();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$f, reason: collision with other inner class name */
    public interface InterfaceC0256f {
    }

    public interface g {
        List<String> c(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.impl.c cVar, URI uri);

        List<String> d(String str);
    }

    public interface h<T extends com.bytedance.frameworks.baselib.network.http.b> {
        void a(long j, long j2, String str, String str2, T t);

        void b(long j, long j2, String str, String str2, T t, Throwable th);
    }

    public interface i<T extends com.bytedance.frameworks.baselib.network.http.b> {
        void a(long j, long j2, String str, String str2, T t, JSONObject jSONObject);

        void b(long j, long j2, String str, String str2, T t, Throwable th, JSONObject jSONObject);
    }

    public interface j {
        com.bytedance.frameworks.baselib.network.http.h a(Map<String, List<String>> map);
    }

    public interface k extends j {
        com.bytedance.frameworks.baselib.network.http.h b(String str, List<com.bytedance.retrofit2.client.b> list, Map<String, List<String>> map);
    }

    public static void A(boolean z) {
        if (l.get() == z) {
            return;
        }
        l.getAndSet(z);
        CountDownLatch countDownLatch = n;
        if (countDownLatch != null && countDownLatch.getCount() > 0) {
            n.countDown();
        }
        if (z) {
            return;
        }
        n = new CountDownLatch(1);
    }

    public static void B(g gVar) {
        i = gVar;
    }

    public static void C(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (charArray[i2] < ' ' || charArray[i2] > '~') {
                            charArray[i2] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        str = new String(charArray);
                    }
                }
            } catch (Exception unused) {
            }
        }
        o = str;
    }

    public static void D(int i2) {
        s = i2;
    }

    public static void E(boolean z) {
        r.set(z);
    }

    public static void F(boolean z) {
        f5121e = z;
    }

    public static void G(boolean z) {
        u = z;
    }

    public static void H(h hVar) {
        f5119c = hVar;
        com.bytedance.frameworks.baselib.network.http.j.a();
    }

    public static void I(i iVar) {
        f5123g = iVar;
        com.bytedance.frameworks.baselib.network.http.j.a();
    }

    public static void J(boolean z) {
        f5122f = z;
    }

    public static void K(boolean z) {
        t = z;
    }

    public static void L(boolean z) {
        f5120d = z;
    }

    private static com.bytedance.frameworks.baselib.network.http.h M(Request request, com.bytedance.frameworks.baselib.network.http.b bVar, int i2, List<com.bytedance.retrofit2.client.b> list, Map<String, List<String>> map, boolean z) {
        com.bytedance.frameworks.baselib.network.http.h hVar = new com.bytedance.frameworks.baselib.network.http.h(false);
        if (!z && !bVar.K) {
            r.get();
        }
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.frameworks.baselib.network.http.h N(com.bytedance.retrofit2.client.Request r9, int r10, com.bytedance.frameworks.baselib.network.http.b r11, java.util.List<com.bytedance.retrofit2.client.b> r12, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.f.N(com.bytedance.retrofit2.client.Request, int, com.bytedance.frameworks.baselib.network.http.b, java.util.List, java.util.Map, boolean, boolean):com.bytedance.frameworks.baselib.network.http.h");
    }

    public static String O(String str, boolean z, RetrofitMetrics retrofitMetrics, Object... objArr) {
        if (b == null) {
            return null;
        }
        if (retrofitMetrics != null) {
            retrofitMetrics.E0.b.c();
        }
        try {
            b.a(str, z, objArr);
        } finally {
            if (retrofitMetrics != null) {
                retrofitMetrics.X();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> P(java.lang.String r22, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r23) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.f.P(java.lang.String, java.util.Map):java.util.Map");
    }

    public static void Q(RetrofitMetrics retrofitMetrics) {
        if (b != null) {
            if (retrofitMetrics != null) {
                retrofitMetrics.F0.b.c();
            }
            if (retrofitMetrics != null) {
                retrofitMetrics.J();
            }
        }
    }

    public static CookieManager R() {
        synchronized (m) {
            if (!l.get()) {
                try {
                    CountDownLatch countDownLatch = n;
                    if (countDownLatch != null) {
                        countDownLatch.await(com.heytap.mcssdk.constant.a.r, TimeUnit.MILLISECONDS);
                        if (n.getCount() == 1) {
                            n.countDown();
                        }
                    }
                } catch (Exception unused) {
                }
                l.getAndSet(true);
            }
        }
        CookieManager cookieManager = null;
        try {
            cookieManager = CookieManager.getInstance();
            if (!cookieManager.acceptCookie()) {
                cookieManager.setAcceptCookie(true);
            }
        } catch (Throwable unused2) {
        }
        return cookieManager;
    }

    public static String a(String str, boolean z, RetrofitMetrics retrofitMetrics) {
        if (b != null) {
            if (retrofitMetrics != null) {
                retrofitMetrics.d();
            }
            try {
                str = b.b(str, z);
            } finally {
                if (retrofitMetrics != null) {
                    retrofitMetrics.c();
                }
            }
        }
        return str;
    }

    public static synchronized boolean b(String str, j jVar) {
        synchronized (f.class) {
            if (com.bytedance.android.input.k.b.a.Y(str) || !str.toLowerCase().contains("verify")) {
                return false;
            }
            Iterator<String> it2 = q.keySet().iterator();
            while (it2.hasNext()) {
                if (it2.next().equalsIgnoreCase(str)) {
                    return false;
                }
            }
            q.put(str, jVar);
            return true;
        }
    }

    private static boolean c(String str, com.bytedance.frameworks.baselib.network.http.b bVar) {
        if (bVar == null || bVar.I || com.bytedance.android.input.k.b.a.Y(bVar.f5083d.F0.f5890f) || bVar.f5083d.E0.b() < 0) {
            return false;
        }
        return !com.bytedance.android.input.k.b.a.Y(str);
    }

    public static String d(String str, com.bytedance.frameworks.baselib.network.http.c cVar, RetrofitMetrics retrofitMetrics) {
        if (!com.bytedance.android.input.k.b.a.Y(str) && h != null) {
            if (retrofitMetrics != null) {
                retrofitMetrics.E0.b.c();
            }
            try {
                ((com.bytedance.ttnet.config.b) h).m(str, cVar);
            } finally {
                if (retrofitMetrics != null) {
                    retrofitMetrics.x();
                }
            }
        }
        return str;
    }

    public static d e() {
        return k;
    }

    public static e f() {
        return a;
    }

    public static InterfaceC0256f g() {
        return j;
    }

    public static g h() {
        return i;
    }

    public static int i() {
        return s;
    }

    public static boolean j() {
        return f5122f;
    }

    public static String k() {
        return o;
    }

    public static boolean l() {
        return u;
    }

    public static boolean m() {
        return t;
    }

    @Deprecated
    public static void n(long j2, long j3, String str, String str2, com.bytedance.frameworks.baselib.network.http.b bVar, Throwable th) {
        if (bVar == null) {
            return;
        }
        I.b bVar2 = bVar.f5083d.E0.a;
        bVar2.l = j3;
        bVar.f5086g = j3;
        long j4 = j3 + j2;
        bVar2.w = j4;
        bVar.j = j4;
        if (bVar2.v == -1) {
            bVar2.v = System.nanoTime();
        }
        bVar.f5083d.l0(C0697a.a());
        bVar.G = str2;
        bVar.Q = true;
        if (!f5121e || bVar.R.compareAndSet(false, true)) {
            if (Logger.debug()) {
                Logger.d("Report with deprecated monitorApiError, url: " + str);
            }
            if (f5120d) {
                p(str, bVar, th);
            } else {
                o(str, bVar, th);
            }
        }
    }

    public static void o(String str, com.bytedance.frameworks.baselib.network.http.b bVar, Throwable th) {
        if (!c(str, bVar) || f5119c == null || th == null) {
            return;
        }
        bVar.f5083d.D();
        f5119c.b(bVar.f5083d.E0.b(), bVar.f5083d.E0.a.l, str, bVar.G, bVar, th);
    }

    public static void p(String str, com.bytedance.frameworks.baselib.network.http.b bVar, Throwable th) {
        if (!c(str, bVar) || f5123g == null || th == null) {
            return;
        }
        bVar.f5083d.D();
        JSONObject jSONObject = new JSONObject();
        try {
            bVar.f5083d.q0(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        f5123g.b(bVar.f5083d.E0.b(), bVar.f5083d.E0.a.l, str, bVar.G, bVar, th, jSONObject);
    }

    public static void q(String str, String str2, boolean z, RetrofitMetrics retrofitMetrics) throws IOException {
        if (com.bytedance.android.input.k.b.a.Y(str) || com.bytedance.android.input.k.b.a.Y(str2) || h == null) {
            return;
        }
        if (retrofitMetrics != null) {
            if (z) {
                retrofitMetrics.E0.b.c();
            } else {
                retrofitMetrics.E0.b.c();
            }
        }
        try {
            ((com.bytedance.ttnet.config.b) h).w(str, str2, z);
            if (retrofitMetrics != null) {
                if (z) {
                    I.a aVar = retrofitMetrics.E0.b;
                    aVar.f5967e = aVar.a();
                } else {
                    I.a aVar2 = retrofitMetrics.E0.b;
                    aVar2.f5965c = aVar2.a();
                }
            }
        } catch (Throwable th) {
            if (retrofitMetrics != null) {
                if (z) {
                    I.a aVar3 = retrofitMetrics.E0.b;
                    aVar3.f5967e = aVar3.a();
                } else {
                    I.a aVar4 = retrofitMetrics.E0.b;
                    aVar4.f5965c = aVar4.a();
                }
            }
            throw th;
        }
    }

    public static void r(String str, com.bytedance.frameworks.baselib.network.http.b bVar) {
        if (!c(str, bVar) || f5119c == null) {
            return;
        }
        bVar.f5083d.D();
        f5119c.a(bVar.f5083d.E0.b(), bVar.f5083d.E0.a.l, str, bVar.G, bVar);
    }

    public static void s(String str, com.bytedance.frameworks.baselib.network.http.b bVar) {
        if (!c(str, bVar) || f5123g == null) {
            return;
        }
        bVar.f5083d.D();
        JSONObject jSONObject = new JSONObject();
        try {
            bVar.f5083d.q0(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        f5123g.a(bVar.f5083d.E0.b(), bVar.f5083d.E0.a.l, str, bVar.G, bVar, jSONObject);
    }

    @Deprecated
    public static void t(long j2, long j3, String str, String str2, com.bytedance.frameworks.baselib.network.http.b bVar) {
        if (bVar == null) {
            return;
        }
        I.b bVar2 = bVar.f5083d.E0.a;
        bVar2.l = j3;
        bVar.f5086g = j3;
        long j4 = j3 + j2;
        bVar2.w = j4;
        bVar.j = j4;
        if (bVar2.v == -1) {
            bVar2.v = System.nanoTime();
        }
        bVar.f5083d.l0(C0697a.a());
        bVar.G = str2;
        bVar.Q = true;
        if (!f5121e || bVar.R.compareAndSet(false, true)) {
            if (Logger.debug()) {
                Logger.d("Report with deprecated monitorApiSample, url: " + str);
            }
            if (f5120d) {
                s(str, bVar);
            } else {
                r(str, bVar);
            }
        }
    }

    public static void u(a aVar) {
        p = aVar;
    }

    public static void v(b bVar) {
        b = bVar;
    }

    public static void w(c cVar) {
        h = cVar;
    }

    public static void x(d dVar) {
        k = dVar;
    }

    public static void y(e eVar) {
        a = eVar;
    }

    public static void z(InterfaceC0256f interfaceC0256f) {
        j = interfaceC0256f;
    }
}
