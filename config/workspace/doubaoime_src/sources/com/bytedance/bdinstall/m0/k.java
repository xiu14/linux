package com.bytedance.bdinstall.m0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.C0643x;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.m0.e;
import com.bytedance.bdinstall.m0.m;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    @SuppressLint({"CI_StaticFieldLeak", "StaticFieldLeak"})
    private static volatile k k;
    private final m a;
    private final p b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4066c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4067d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4068e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private Runnable f4069f;

    /* renamed from: g, reason: collision with root package name */
    private Future<n> f4070g;
    private n h;
    private com.bytedance.bdinstall.g0.c i;
    private Q j;

    class a implements Callable<n> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public n call() throws Exception {
            return k.a(k.this);
        }
    }

    @WorkerThread
    private k(Context context) {
        m eVar;
        Context applicationContext = context.getApplicationContext();
        this.f4067d = applicationContext;
        String str = Build.BRAND;
        if (str.equals("Pico")) {
            eVar = new s();
        } else if (com.bytedance.bdinstall.util.n.h()) {
            eVar = new r(new v());
        } else {
            String str2 = Build.MANUFACTURER;
            boolean z = true;
            if (!(str2.equalsIgnoreCase("XIAOMI") || str.equalsIgnoreCase("XIAOMI") || str.equalsIgnoreCase("REDMI")) || !v.c()) {
                if (!("BlackShark".equalsIgnoreCase(str2) || "BlackShark".equalsIgnoreCase(str))) {
                    if (q.e()) {
                        eVar = new q();
                    } else if (com.bytedance.bdinstall.util.n.k() && com.bytedance.bdinstall.util.n.f()) {
                        int i = C0640u.a;
                        eVar = new e();
                    } else if (com.bytedance.bdinstall.util.n.k() && !com.bytedance.bdinstall.util.n.f()) {
                        int i2 = C0640u.a;
                        eVar = new g();
                    } else if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str2)) {
                        eVar = new e();
                    } else {
                        if ("OnePlus".equalsIgnoreCase(str2) || "OnePlus".equalsIgnoreCase(str)) {
                            eVar = new r();
                        } else if (com.bytedance.bdinstall.util.n.m()) {
                            eVar = new i();
                        } else if (Build.VERSION.SDK_INT > 28) {
                            if (!"samsung".equalsIgnoreCase(str) && !"samsung".equalsIgnoreCase(str2)) {
                                z = false;
                            }
                            if (z) {
                                eVar = new t();
                            } else if (str2.trim().toUpperCase().contains("NUBIA")) {
                                eVar = new j();
                            } else if (com.bytedance.bdinstall.util.n.l()) {
                                eVar = new h();
                            } else if (str2.trim().toUpperCase().contains("ASUS")) {
                                eVar = new com.bytedance.bdinstall.m0.a();
                            } else {
                                eVar = new d(context);
                                if (!eVar.b(context)) {
                                    eVar = new c();
                                }
                            }
                        } else {
                            eVar = (com.bytedance.bdinstall.util.n.n() || !e.c(context)) ? null : new e();
                        }
                    }
                }
            }
            eVar = new v();
        }
        this.a = eVar;
        if (eVar != null) {
            this.f4066c = eVar.b(context);
        } else {
            this.f4066c = false;
        }
        this.b = new p(applicationContext);
    }

    static n a(k kVar) {
        Objects.requireNonNull(kVar);
        int i = C0640u.a;
        o.j();
        try {
            n b = kVar.b.b();
            String str = "Oaid#initOaid fetch=" + b;
            if (b != null) {
                kVar.h = b;
            }
            o.k();
            n h = kVar.h(kVar.f4067d, b);
            o.l();
            if (h != null) {
                kVar.b.c(h);
            }
            if (h != null) {
                kVar.h = h;
            }
            String str2 = "Oaid#initOaid oaidModel=" + h;
            return h;
        } finally {
            o.i();
            kVar.f4069f = new l(kVar);
            kVar.u();
        }
    }

    static /* synthetic */ Runnable g(k kVar, Runnable runnable) {
        kVar.f4069f = null;
        return null;
    }

    @WorkerThread
    private n h(Context context, n nVar) {
        m.a a2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m mVar = this.a;
        String str = null;
        if (mVar == null || (a2 = mVar.a(context)) == null) {
            return null;
        }
        int i = -1;
        if (nVar != null) {
            str = nVar.b;
            Integer num = nVar.f4074f;
            i = (num == null ? 0 : num.intValue()) + 1;
        }
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
        }
        return new n(a2.a, str, Boolean.valueOf(a2.b), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i > 0 ? i : 1), Long.valueOf(a2 instanceof e.b ? ((e.b) a2).f4063c : 0L));
    }

    @NonNull
    @WorkerThread
    public static k n(Context context) {
        if (k == null) {
            synchronized (k.class) {
                if (k == null) {
                    k = new k(context);
                }
            }
        }
        return k;
    }

    static void p(JSONObject jSONObject, String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    static <K, V> void q(Map<K, V> map, K k2, V v) {
        if (v != null) {
            map.put(k2, v);
        }
    }

    private synchronized void u() {
        Runnable runnable = this.f4069f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void i() {
        this.b.a();
    }

    public String j() {
        m mVar = this.a;
        if (mVar == null) {
            return null;
        }
        return mVar.getName();
    }

    @Nullable
    @WorkerThread
    public Map<String, String> k(long j) {
        HashMap hashMap = null;
        if (!this.f4066c) {
            return null;
        }
        m();
        n nVar = this.h;
        if (nVar == null) {
            SystemClock.elapsedRealtime();
            try {
                if (this.a instanceof g) {
                    j += 100;
                }
                int i = C0640u.a;
                n nVar2 = this.f4070g.get(j, TimeUnit.MILLISECONDS);
                SystemClock.elapsedRealtime();
                nVar = nVar2;
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    SystemClock.elapsedRealtime();
                    int i2 = C0640u.a;
                }
            }
        }
        if (nVar == null) {
            nVar = this.h;
        }
        if (nVar != null) {
            hashMap = new HashMap();
            q(hashMap, "id", nVar.a);
            q(hashMap, "req_id", nVar.b);
            q(hashMap, "is_track_limited", String.valueOf(nVar.f4071c));
            q(hashMap, "take_ms", String.valueOf(nVar.f4072d));
            q(hashMap, CrashHianalyticsData.TIME, String.valueOf(nVar.f4073e));
            q(hashMap, "query_times", String.valueOf(nVar.f4074f));
            q(hashMap, "hw_id_version_code", String.valueOf(nVar.f4075g));
            if (this.j != null) {
                com.bytedance.bdinstall.h0.b c2 = com.bytedance.bdinstall.util.d.b().c(this.j.h());
                Boolean bool = nVar.f4071c;
                if (bool == null || !bool.booleanValue()) {
                    c2.e(0);
                } else {
                    c2.e(1);
                }
                c2.f(!TextUtils.isEmpty(nVar.a) ? 1 : 0);
                c2.g(1);
                c2.d(o.g() - o.f());
            }
        }
        Q q = this.j;
        if (q != null) {
            com.bytedance.bdinstall.util.d.b().c(q.h()).b(q, "dr_register_param");
        }
        String str = "Oaid#getOaid return apiMap=" + hashMap;
        int i3 = C0640u.a;
        return hashMap;
    }

    @Nullable
    @AnyThread
    public String l() {
        m();
        n nVar = this.h;
        String str = nVar != null ? nVar.a : null;
        int i = C0640u.a;
        return str;
    }

    public void m() {
        if (this.f4068e.compareAndSet(false, true)) {
            o.h();
            this.f4070g = C0643x.l(new a());
        }
    }

    @WorkerThread
    public boolean o() {
        m();
        return this.f4066c;
    }

    public void r(com.bytedance.bdinstall.g0.c cVar) {
        this.i = cVar;
    }

    public void s(Q q) {
        this.j = q;
    }

    public void t() {
        u();
    }
}
