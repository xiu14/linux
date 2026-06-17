package com.bytedance.applog;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StageEventType;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.bdinstall.G;
import com.bytedance.bdinstall.Level;
import com.bytedance.bdinstall.P;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements f {
    private static final List<c> H = new CopyOnWriteArrayList();
    private static final AtomicInteger I = new AtomicInteger(0);
    private final com.bytedance.applog.monitor.v3.e B;
    private volatile Long C;
    private volatile com.bytedance.applog.util.d D;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.applog.x.a f3770c;
    private volatile com.bytedance.applog.x.b k;
    private volatile com.bytedance.applog.x.c l;
    private volatile com.bytedance.applog.q.c m;
    private final com.bytedance.applog.collector.a n;
    private volatile boolean o;
    private com.bytedance.applog.util.b p;
    private final com.bytedance.applog.o.d r;
    private final com.bytedance.applog.v.c a = new com.bytedance.applog.v.c();
    private final com.bytedance.applog.v.a b = new com.bytedance.applog.v.a();
    private int h = 0;
    private String i = "";
    private volatile Application j = null;
    private volatile boolean q = true;
    private volatile boolean s = true;
    private volatile boolean t = false;
    private final AtomicInteger u = new AtomicInteger(0);
    private volatile boolean v = true;
    private volatile int w = 5;
    private volatile int x = 200;
    private volatile boolean y = false;
    private volatile int z = 8;
    private final com.bytedance.applog.monitor.a A = new com.bytedance.applog.monitor.a();
    private final List<String> G = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final int f3774g = I.getAndIncrement();
    private final com.bytedance.applog.w.e F = new com.bytedance.applog.w.k();

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.applog.A.a f3772e = new com.bytedance.applog.A.a(this);
    private final com.bytedance.applog.v.b E = new com.bytedance.applog.v.b(this);

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.applog.A.b f3771d = new com.bytedance.applog.A.b(this);

    /* renamed from: f, reason: collision with root package name */
    private final G f3773f = new com.bytedance.applog.util.c(this);

    public c() {
        H.add(this);
        this.f3770c = new com.bytedance.applog.x.a(this);
        this.r = new com.bytedance.applog.o.b(this);
        this.n = new com.bytedance.applog.collector.a(this);
        this.B = new com.bytedance.applog.monitor.v3.e();
    }

    private String C0(StageEventType stageEventType, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString();
        } catch (Throwable th) {
            this.F.i(e.a.a.a.a.u("event toString failed ", str, ", label: ", str2), th, new Object[0]);
            JSONObject c2 = com.bytedance.applog.util.k.c(jSONObject);
            if (c2 == null) {
                return null;
            }
            l C = C();
            boolean z = C != null && "local_test".equalsIgnoreCase(C.f());
            try {
                return c2.toString();
            } catch (OutOfMemoryError e2) {
                this.B.i(StatsCountKeys.MEM_ERROR_COUNT, 1);
                if (!z) {
                    this.F.i(e.a.a.a.a.u("event toString OOM tag: ", str, ", label: ", str2), e2, new Object[0]);
                    return null;
                }
                if (this.B.n(str)) {
                    this.B.v(EventStage.PARAMS_INVALID_DROP, str, com.bytedance.applog.monitor.v3.f.d(), System.currentTimeMillis(), StageEventType.V3_EVENT);
                }
                throw new RuntimeException(e.a.a.a.a.u("event toString OOM tag: ", str, ", label: ", str2), e2);
            } catch (StackOverflowError e3) {
                this.B.i(StatsCountKeys.SOF_ERROR_COUNT, 1);
                if (!z) {
                    this.F.i(e.a.a.a.a.u("event toString stack overflow tag: ", str, ", label: ", str2), e3, new Object[0]);
                    return null;
                }
                if (this.B.n(str)) {
                    this.B.v(EventStage.PARAMS_INVALID_DROP, str, com.bytedance.applog.monitor.v3.f.d(), System.currentTimeMillis(), stageEventType);
                }
                throw new RuntimeException(e.a.a.a.a.u("event toString stack overflow tag: ", str, ", label: ", str2), e3);
            } catch (ConcurrentModificationException unused) {
                this.B.i(StatsCountKeys.CONCURRENT_MODIFY_ERROR_COUNT, 1);
                try {
                    return c2.toString();
                } catch (Throwable th2) {
                    if (this.B.n(str)) {
                        this.B.v(EventStage.PARAMS_INVALID_DROP, str, com.bytedance.applog.monitor.v3.f.d(), System.currentTimeMillis(), stageEventType);
                    }
                    throw new RuntimeException(e.a.a.a.a.u("event params exception tag: ", str, ", label: ", str2), th2);
                }
            }
        }
    }

    public static List<c> h() {
        return H;
    }

    private void r0(@NonNull String str, @Nullable JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            this.F.b("event name is empty", new Object[0]);
        } else {
            s0(new com.bytedance.applog.B.e(this.i, str, false, C0(StageEventType.V3_EVENT, str, null, jSONObject)));
        }
    }

    @Nullable
    public JSONObject A() {
        if (this.l != null) {
            return this.l.c();
        }
        this.F.b("Init first please to get header", new Object[0]);
        return null;
    }

    public void A0() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.m.x();
        this.F.o("System start!", new Object[0]);
    }

    public String B() {
        return ((com.bytedance.applog.o.b) this.r).n();
    }

    public void B0() {
        this.F.o("System stop!", new Object[0]);
        if (this.o) {
            this.o = false;
        }
    }

    public l C() {
        if (this.k != null) {
            return this.k.r();
        }
        return null;
    }

    public int D() {
        return this.h;
    }

    public com.bytedance.applog.v.b E() {
        return this.E;
    }

    public com.bytedance.applog.util.d F() {
        return this.D;
    }

    public com.bytedance.applog.monitor.a G() {
        return this.A;
    }

    public JSONObject H() {
        if (this.k != null) {
            return this.k.v();
        }
        this.F.b("call getLogback after init plz.", new Object[0]);
        return null;
    }

    public com.bytedance.applog.w.e I() {
        return this.F;
    }

    public int J() {
        return this.z;
    }

    public com.bytedance.applog.monitor.v3.e K() {
        return this.B;
    }

    public G L() {
        G h = this.k.r().h();
        return h != null ? h : this.f3773f;
    }

    public long M() {
        if (this.m == null) {
            return 0L;
        }
        return this.m.q().k();
    }

    @NonNull
    public com.bytedance.applog.C.b N() {
        return com.bytedance.applog.C.a.c();
    }

    public com.bytedance.applog.s.d O() {
        if (this.m != null) {
            return this.m.o();
        }
        return null;
    }

    public String P() {
        if (this.m != null) {
            return this.m.r();
        }
        return null;
    }

    public com.bytedance.applog.v.c Q() {
        return this.a;
    }

    public String R() {
        return ((com.bytedance.applog.o.b) this.r).q();
    }

    public void S(Map<String, String> map) {
        P o = ((com.bytedance.applog.o.b) this.r).o();
        if (o != null) {
            String c2 = o.c();
            if (!TextUtils.isEmpty(c2)) {
                map.put("device_id", c2);
            }
            String e2 = o.e();
            if (!TextUtils.isEmpty(e2)) {
                map.put("install_id", e2);
            }
            String f2 = o.f();
            if (!TextUtils.isEmpty(f2)) {
                map.put("openudid", f2);
            }
            String b = o.b();
            if (TextUtils.isEmpty(b)) {
                return;
            }
            map.put("clientudid", b);
        }
    }

    public String T() {
        if (this.m != null) {
            return String.valueOf(this.m.q().h());
        }
        return null;
    }

    public String U() {
        return this.l != null ? this.l.g() : "";
    }

    public boolean V() {
        return this.o;
    }

    public void W(@NonNull Context context, @NonNull l lVar) {
        synchronized (c.class) {
            if (TextUtils.isEmpty(lVar.c())) {
                throw new IllegalStateException("App id must not be empty!");
            }
            if (b.c(lVar.c())) {
                throw new IllegalStateException("The app id is init already!");
            }
            this.F.d(lVar.c());
            this.i = lVar.c();
            this.j = (Application) context.getApplicationContext();
            if (lVar.q()) {
                com.bytedance.applog.w.i.e(this.i, new com.bytedance.applog.w.c(this));
            }
            this.F.o("App:{} init begin...", this.i);
            if (TextUtils.isEmpty(lVar.j())) {
                lVar.y(b.b(this, "applog_stats"));
            }
            int i = com.bytedance.applog.w.j.a;
            this.k = new com.bytedance.applog.x.b(this, this.j, lVar);
            if (this.D == null) {
                this.D = new com.bytedance.applog.util.d(this, this.k);
            }
            this.l = new com.bytedance.applog.x.c(this, this.k, this.r);
            this.m = new com.bytedance.applog.q.c(this, this.k, this.l, this.r, lVar.e(), this.f3770c);
            if (lVar.p()) {
                this.j.registerActivityLifecycleCallbacks(this.n);
            }
            this.h = 1;
            this.o = lVar.a();
            if (this.C != null) {
                long longValue = this.C.longValue();
                if (this.m == null || this.m.q() == null) {
                    this.C = Long.valueOf(longValue);
                } else if (this.m.q().h() != longValue) {
                    this.m.q().m(longValue);
                }
                this.C = null;
            }
            this.B.r("congestion_enable", 1L);
            if (lVar.p()) {
                this.B.r("handle_lifecycle_enable", 1L);
            }
            this.F.o("App:{} init end.", this.i);
            Objects.requireNonNull(this.k);
        }
    }

    public boolean X() {
        return false;
    }

    public boolean Y() {
        return false;
    }

    public boolean Z() {
        return false;
    }

    public synchronized void a(g gVar) {
        if (this.p == null) {
            this.p = new com.bytedance.applog.util.b();
        }
        this.p.d(gVar);
    }

    public boolean a0() {
        if (C() == null) {
            return false;
        }
        Objects.requireNonNull(C());
        return false;
    }

    public String b(Context context, String str, boolean z, Level level) {
        return ((com.bytedance.applog.o.b) this.r).h(context, new StringBuilder(str), z, level);
    }

    public boolean b0() {
        return this.s;
    }

    public void c(com.bytedance.applog.B.a aVar) {
        if (this.m == null) {
            return;
        }
        this.m.q().a(aVar);
    }

    public boolean c0() {
        return false;
    }

    public String d() {
        if (this.m == null) {
            return null;
        }
        String.valueOf(this.m.q().h());
        if (this.l != null) {
            return this.l.b();
        }
        return null;
    }

    public boolean d0() {
        return false;
    }

    public String e(String str) {
        if (this.l != null) {
            return this.l.b();
        }
        return null;
    }

    public boolean e0() {
        return false;
    }

    public boolean f() {
        return this.t;
    }

    public boolean f0() {
        return false;
    }

    public String g() {
        return this.i;
    }

    public boolean g0() {
        return false;
    }

    public boolean h0() {
        l C = C();
        if (C != null) {
            return C.q();
        }
        return false;
    }

    public com.bytedance.applog.A.a i() {
        return this.f3772e;
    }

    public boolean i0() {
        return false;
    }

    public com.bytedance.applog.A.b j() {
        return this.f3771d;
    }

    public boolean j0() {
        return this.y;
    }

    public String k() {
        return this.i;
    }

    public boolean k0() {
        return false;
    }

    public int l() {
        return this.w;
    }

    public boolean l0() {
        return false;
    }

    public int m() {
        return this.x;
    }

    public void m0() {
        this.n.onActivityPaused(null);
    }

    public List<String> n() {
        return this.G;
    }

    public void n0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.n.b(str, i);
    }

    public Context o() {
        return this.j;
    }

    public void o0(@NonNull String str, @NonNull String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.F.b("category or tag is empty", new Object[0]);
        } else {
            s0(new com.bytedance.applog.B.c(this.i, str, str2, str3, j, j2, C0(StageEventType.V1_EVENT, str2, str3, jSONObject)));
        }
    }

    public com.bytedance.applog.B.i p() {
        return this.n.a();
    }

    public void p0(@NonNull String str, @Nullable Bundle bundle) {
        JSONObject jSONObject = null;
        try {
            if (!bundle.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (String str2 : bundle.keySet()) {
                        jSONObject2.put(str2, bundle.get(str2));
                    }
                    jSONObject = jSONObject2;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    this.F.i("parse bundle params failed", th, new Object[0]);
                    this.B.i(StatsCountKeys.JSON_ERROR_COUNT, 1);
                    r0(str, jSONObject);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        r0(str, jSONObject);
    }

    public com.bytedance.applog.util.b q() {
        return this.p;
    }

    public void q0(@NonNull String str, @Nullable JSONObject jSONObject) {
        r0(str, jSONObject);
    }

    public String r() {
        return ((com.bytedance.applog.o.b) this.r).m();
    }

    public boolean s() {
        return false;
    }

    public void s0(com.bytedance.applog.B.a aVar) {
        aVar.s(this.i);
        if ((aVar instanceof com.bytedance.applog.B.e) || (aVar instanceof com.bytedance.applog.B.c) || (aVar instanceof com.bytedance.applog.B.d)) {
            this.B.i(StatsCountKeys.COLLECT_EVENT_COUNT, 1);
            int S = com.bytedance.android.input.k.b.a.S(this.B, aVar);
            aVar.s = S;
            if (S > 0) {
                com.bytedance.android.input.k.b.a.H0(this.B, EventStage.PRE_PROCESS_START, aVar);
            }
        }
        if (!this.b.a(1)) {
            try {
                if (aVar instanceof com.bytedance.applog.B.c) {
                    com.bytedance.applog.B.c cVar = (com.bytedance.applog.B.c) aVar;
                    this.b.b(1, cVar.w, cVar.x, cVar.y, cVar.A, cVar.B, cVar.z);
                } else if (aVar instanceof com.bytedance.applog.B.e) {
                    com.bytedance.applog.B.e eVar = (com.bytedance.applog.B.e) aVar;
                    this.b.c(1, eVar.C(), eVar.j());
                } else if (aVar instanceof com.bytedance.applog.B.d) {
                    com.bytedance.applog.B.d dVar = (com.bytedance.applog.B.d) aVar;
                    this.b.d(1, dVar.C(), dVar.j());
                }
            } catch (Throwable th) {
                this.F.u(4, "notify event observer before receive failed", th, new Object[0]);
                this.B.q("notify event observer before receive failed", th);
            }
        }
        if (this.m == null) {
            this.f3770c.a(aVar);
            if (aVar.s > 0) {
                com.bytedance.android.input.k.b.a.H0(this.B, EventStage.CACHED_BEFORE_HANDLE, aVar);
            }
        } else {
            this.m.u(aVar);
        }
        if (aVar.v() > 1048576) {
            this.B.q("receive data too big (>1MB)", new Throwable(aVar.toString()));
        }
        int i = com.bytedance.applog.w.j.a;
    }

    public boolean t() {
        return this.q;
    }

    public void t0(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (this.m == null) {
            this.f3770c.b(strArr);
        } else {
            this.m.v(strArr);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AppLogInstance{id:");
        M.append(this.f3774g);
        M.append(";appId:");
        M.append(this.i);
        M.append("}@");
        M.append(hashCode());
        return M.toString();
    }

    public com.bytedance.applog.t.a u() {
        if (this.k != null) {
            return this.k.m();
        }
        return null;
    }

    public void u0(boolean z) {
        this.t = z;
        int i = com.bytedance.applog.w.j.a;
        this.B.s("dau_fix", z);
    }

    public com.bytedance.applog.u.a v() {
        return null;
    }

    public void v0(boolean z) {
        this.q = z;
        this.B.r("encrypt_enable", z ? 1L : 0L);
    }

    public com.bytedance.applog.v.a w() {
        return this.b;
    }

    public void w0(String str) {
        if (this.l != null) {
            this.l.o(str);
        }
    }

    public com.bytedance.applog.y.a x() {
        if (this.k != null) {
            return this.k.o();
        }
        return null;
    }

    public void x0(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(str, obj);
        ((com.bytedance.applog.o.b) this.r).u(hashMap);
    }

    public int y() {
        return this.u.get();
    }

    public void y0(int i) {
        this.h = i;
    }

    public JSONObject z() {
        return null;
    }

    public void z0(boolean z) {
        this.y = z;
    }
}
