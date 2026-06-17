package com.bytedance.frameworks.baselib.network;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.h.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTNetInitMetrics {
    public static final String c0 = "TTNetInitMetrics";
    private static volatile CopyOnWriteArrayList<b> d0 = new CopyOnWriteArrayList<>();
    private static AtomicBoolean e0 = new AtomicBoolean(false);
    public static volatile TTNetInitMetrics f0;

    /* renamed from: J, reason: collision with root package name */
    public String f5007J;
    public String L;

    /* renamed from: c, reason: collision with root package name */
    public int f5008c;
    public CronetInitMode a = CronetInitMode.NONE;
    public boolean b = true;

    /* renamed from: d, reason: collision with root package name */
    public long f5009d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f5010e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f5011f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f5012g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public long l = 0;
    public long m = 0;
    public long n = 0;
    public long o = 0;
    public long p = 0;
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public long t = 0;
    public long u = 0;
    public long v = 0;
    public long w = 0;
    public long x = 0;
    public long y = 0;
    public long z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public long D = 0;
    public long E = 0;
    public long F = 0;
    public long G = 0;
    public long H = 0;
    public long I = 0;
    public long K = 0;
    public long M = 0;
    public long N = 0;
    public long O = 0;
    public long P = 0;
    public long Q = 0;
    public long R = 0;
    public long S = 0;
    public long T = 0;
    public long U = 0;
    public long V = 0;
    public long W = 0;
    public long X = 0;
    public long Y = 0;
    public long Z = 0;
    public long a0 = 0;
    public long b0 = 0;

    public enum CronetInitMode {
        NONE(0),
        LAZY_INIT(1),
        PRE_INIT(2),
        FORCE_INIT(3),
        DEPRECATED_API(4),
        BIZ_HTTPDNS_API(5),
        ZSTD_API(6),
        COOKIE_INIT_COMPLETE_API(7);

        final int initMode;

        CronetInitMode(int i) {
            this.initMode = i;
        }
    }

    class a extends c {
        a(String str) {
            super(str);
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            Iterator it2 = TTNetInitMetrics.d0.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a();
            }
        }
    }

    public interface b {
        void a();
    }

    private long d(long j) {
        return (this.f5009d + j) - this.f5010e;
    }

    private static long e(long j, long j2) {
        long f2 = f(j, j2);
        if (f2 == -1) {
            return -1L;
        }
        return f2 / 1000;
    }

    private static long f(long j, long j2) {
        if (j == 0 || j2 == 0 || j > j2) {
            return -1L;
        }
        return (j2 - j) / 1000;
    }

    private static String g(long j, long j2) {
        return String.valueOf(f(j, j2));
    }

    public static TTNetInitMetrics j() {
        if (f0 == null) {
            synchronized (TTNetInitMetrics.class) {
                if (f0 == null) {
                    f0 = new TTNetInitMetrics();
                }
            }
        }
        return f0;
    }

    public static boolean k() {
        return e0.get();
    }

    private boolean l(Context context, List<Long> list) {
        Class<?> cls;
        HashMap hashMap = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ml.MSB");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            try {
                cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (cls == null) {
            return false;
        }
        if (list != null) {
            try {
                if (list.size() == 2) {
                    hashMap = new HashMap();
                    hashMap.put("http_callback", String.valueOf(list.get(0)));
                    hashMap.put("ws_callback", String.valueOf(list.get(1)));
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        cls.getMethod("a", Context.class, Integer.TYPE, Map.class).invoke(cls, context, 1, hashMap);
        return true;
    }

    public static void m(boolean z) {
        e0.set(z);
        if (d0.isEmpty()) {
            return;
        }
        new a("ttnet-init").a();
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("mode", this.a.initMode);
            jSONObject.put("is_main_process", this.b);
            jSONObject.put("net_thread_priority", this.f5008c);
            jSONObject2.put("ttnet_start", this.f5009d);
            jSONObject2.put("ttnet_end", d(this.h));
            jSONObject2.put("engine_start", d(this.n));
            jSONObject2.put("engine_end", d(this.E));
            jSONObject2.put("init_start", d(this.F));
            jSONObject2.put("init_end", d(this.G));
            jSONObject2.put("preconnect_start", this.M);
            jSONObject3.put("builder_build", e(this.A, this.B));
            jSONObject3.put("load_cronet", e(this.H, this.I));
            jSONObject3.put("init_metasec", e(this.f5011f, this.f5012g));
            jSONObject3.put("init_ttnet", e(this.f5010e, this.h));
            jSONObject3.put("init_mssdk", e(this.C, this.D));
            jSONObject3.put("create_engine", e(this.n, this.E));
            jSONObject3.put("init_thread", e(this.F, this.G));
            jSONObject3.put("init_total", e(Math.min(this.f5009d, this.m) * 1000000, this.O * 1000000));
            jSONObject3.put("init_preconnect", e(this.f5009d, this.M));
            long j = this.N;
            long j2 = this.O;
            long j3 = -1;
            jSONObject3.put("network_thread", j > j2 ? -1L : j2 - j);
            long j4 = this.O;
            long j5 = this.P;
            if (j4 <= j5) {
                j3 = j5 - j4;
            }
            jSONObject3.put("exec_tasks", j3);
            jSONObject3.put("nqe_init", this.Q);
            jSONObject3.put("prefs_init", this.R);
            jSONObject3.put("channel_init", this.S);
            jSONObject3.put("context_build", this.T);
            jSONObject3.put("tnc_config", this.U);
            jSONObject3.put("update_appinfo", this.V);
            jSONObject3.put("netlog_init", this.W);
            jSONObject3.put("nqe_detect", this.X);
            jSONObject3.put("preconnect", this.Y);
            jSONObject3.put("ssl_session", this.Z);
            jSONObject3.put("ttnet_config", this.a0);
            jSONObject3.put("install_cert", this.b0);
            jSONObject.put("ttnet_timestamp", jSONObject2);
            jSONObject.put("ttnet_duration", jSONObject3);
            jSONObject.put("ab_test", this.L);
        } catch (JSONException unused) {
        }
        if (Logger.debug()) {
            String str = c0;
            StringBuilder M = e.a.a.a.a.M("cronet init metrics json: ");
            M.append(jSONObject.toString());
            Logger.d(str, M.toString());
        }
        return jSONObject;
    }

    public JSONObject c(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("mssdk", g(this.C, this.D));
            jSONObject4.put("app_info_subset", g(this.q, this.r));
            jSONObject4.put("thread_config_list", g(this.s, this.t));
            jSONObject4.put("sla_samp_setting", g(this.w, this.x));
            jSONObject4.put("build_ctx_config", g(this.y, this.z));
            jSONObject4.put("init_total", g(Math.min(this.f5009d, this.m) * 1000000, this.O * 1000000));
            jSONObject4.put("app_init_time", j != -1 ? g(j, this.f5010e) : "-1");
            jSONObject3.put("cross_plfm", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("ttnet_init", g(this.f5010e, this.h));
            jSONObject5.put("init_stack_config", g(this.k, this.l));
            jSONObject5.put("get_stack_config", g(this.o, this.p));
            jSONObject5.put("init_cookie_mgr", g(this.i, this.j));
            jSONObject5.put("pre_init_mssdk", g(this.f5011f, this.f5012g));
            jSONObject5.put("builder_build", g(this.A, this.B));
            jSONObject5.put("create_engine", g(this.n, this.E));
            jSONObject5.put("cronet_init_thread", g(this.F, this.G));
            jSONObject5.put("cronet_load_so", g(this.H, this.I));
            jSONObject5.put("thread_config_callback", g(this.u, this.v));
            jSONObject3.put("android_spec", jSONObject5);
            jSONObject2.put("durations_us", jSONObject3);
            jSONObject2.put("cronet_init_mode", this.a.initMode);
            jSONObject.put("ttnet_layer", jSONObject2);
            jSONObject.put("cronet_layer", new JSONObject(this.f5007J));
            jSONObject.put("ab_test", this.L);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void h(Context context, List<Long> list) {
        if (list == null || list.size() != 2) {
            return;
        }
        if (Logger.debug()) {
            String str = c0;
            StringBuilder M = e.a.a.a.a.M("http address: ");
            M.append(list.get(0));
            M.append(" ws address: ");
            M.append(list.get(1));
            Logger.d(str, M.toString());
        }
        this.C = System.nanoTime();
        if (!l(context, list) && Logger.debug()) {
            Logger.d(c0, "init mssdk failed.");
        }
        this.D = System.nanoTime();
    }

    public void i(Context context) {
        this.f5011f = System.nanoTime();
        l(context, null);
        this.f5012g = System.nanoTime();
    }
}
