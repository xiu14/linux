package com.bytedance.retrofit2;

import com.bytedance.retrofit2.s;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class I {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f5961f = -1;
    public b a = new b();
    public a b = new a();

    /* renamed from: c, reason: collision with root package name */
    public c f5962c = new c();

    /* renamed from: d, reason: collision with root package name */
    s f5963d = new s();

    /* renamed from: e, reason: collision with root package name */
    public d f5964e = new d();

    public static class a {
        private long a = -1;
        public long b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f5965c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f5966d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f5967e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f5968f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5969g = -1;
        public long h = -1;
        public long i = -1;
        public long j = -1;
        public long k = -1;
        public long l = -1;
        public long m = -1;
        public long n = -1;

        public long a() {
            long nanoTime = System.nanoTime() - this.a;
            this.a = -1L;
            return nanoTime;
        }

        public a b() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.f5965c = this.f5965c;
            aVar.f5966d = this.f5966d;
            aVar.f5967e = this.f5967e;
            aVar.f5968f = this.f5968f;
            aVar.f5969g = this.f5969g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            aVar.l = this.l;
            aVar.m = this.m;
            aVar.n = this.n;
            return aVar;
        }

        public void c() {
            this.a = System.nanoTime();
        }
    }

    public static class b {
        public long a = -1;
        public long b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f5970c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f5971d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f5972e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f5973f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5974g = -1;
        public long h = -1;
        public long i = -1;
        public long j = -1;
        public long k = -1;
        public long l = -1;
        public long m = -1;
        public long n = -1;
        public long o = -1;
        public long p = -1;
        public long q = -1;
        public long r = -1;
        public long s = -1;
        public long t = -1;
        public long u = -1;
        public long v = -1;
        public long w = -1;
        public long x = -1;
    }

    public static class c {
        private Deque<Long> a = new ArrayDeque();
        public long b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f5975c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f5976d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f5977e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f5978f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5979g = -1;
        public long h = -1;
        public long i = -1;
        public long j = -1;
        public long k = -1;

        public long a() {
            try {
                return System.nanoTime() - this.a.pop().longValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1L;
            }
        }

        public c b() {
            c cVar = new c();
            if (!this.a.isEmpty()) {
                cVar.a = new ArrayDeque();
                Iterator<Long> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    cVar.a.push(it2.next());
                }
            }
            cVar.b = this.b;
            cVar.f5975c = this.f5975c;
            cVar.f5976d = this.f5976d;
            cVar.f5978f = this.f5978f;
            cVar.f5979g = this.f5979g;
            cVar.h = this.h;
            cVar.i = this.i;
            cVar.j = this.j;
            cVar.k = this.k;
            return cVar;
        }

        public void c() {
            this.a.push(Long.valueOf(System.nanoTime()));
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;

        /* renamed from: c, reason: collision with root package name */
        public transient Throwable f5980c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f5981d = 0;

        /* renamed from: e, reason: collision with root package name */
        public transient WeakReference<Throwable> f5982e = null;

        /* renamed from: f, reason: collision with root package name */
        public long f5983f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5984g = -1;
    }

    public I() {
        InterfaceC0698b interfaceC0698b = RetrofitMetrics.J0;
        if (interfaceC0698b != null) {
            this.a.a = interfaceC0698b.a();
            this.a.b = RetrofitMetrics.J0.b();
        }
    }

    public static void c(int i) {
        f5961f = i;
    }

    public long b() {
        b bVar = this.a;
        return bVar.w - bVar.l;
    }

    public JSONObject d() throws JSONException {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        JSONObject jSONObject = new JSONObject();
        b bVar = this.a;
        Objects.requireNonNull(bVar);
        if ((f5961f & 1) == 0) {
            obj = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            e.a.a.a.a.c0(bVar.a, jSONObject2, "app_start");
            jSONObject2.put("app_start_wc", String.valueOf(bVar.b));
            e.a.a.a.a.c0(bVar.f5970c, jSONObject2, "cronet_init_s");
            e.a.a.a.a.c0(bVar.f5971d, jSONObject2, "cronet_init_e");
            jSONObject2.put("create_hcall_s_wc", String.valueOf(bVar.f5972e));
            e.a.a.a.a.c0(bVar.f5973f, jSONObject2, "create_hcall_s");
            e.a.a.a.a.c0(bVar.f5974g, jSONObject2, "create_hcall_e");
            e.a.a.a.a.c0(bVar.k, jSONObject2, "hcall_api_s");
            jSONObject2.put("hcall_api_s_ws", String.valueOf(bVar.l));
            e.a.a.a.a.c0(bVar.m, jSONObject2, "hcall_api_e");
            e.a.a.a.a.c0(bVar.j, jSONObject2, "req_real_s");
            e.a.a.a.a.c0(bVar.n, jSONObject2, "req_itcpt_s");
            e.a.a.a.a.c0(bVar.o, jSONObject2, "req_itcpt_e");
            e.a.a.a.a.c0(bVar.p, jSONObject2, "sscall_s");
            e.a.a.a.a.c0(bVar.q, jSONObject2, "sscall_e");
            e.a.a.a.a.c0(bVar.r, jSONObject2, "rsp_itcpt_s");
            e.a.a.a.a.c0(bVar.s, jSONObject2, "rsp_itcpt_e");
            jSONObject2.put("biz_rcv_rsp_hdr_wc", String.valueOf(bVar.u));
            e.a.a.a.a.c0(bVar.t, jSONObject2, "biz_rcv_rsp_hdr");
            jSONObject2.put("req_e_wc", String.valueOf(bVar.w));
            e.a.a.a.a.c0(bVar.v, jSONObject2, "req_e");
            e.a.a.a.a.c0(bVar.x, jSONObject2, "log_rpt");
            obj = jSONObject2;
        }
        jSONObject.put("event_ts", obj);
        a aVar = this.b;
        Objects.requireNonNull(aVar);
        if ((f5961f & 2) == 0) {
            obj2 = null;
        } else {
            JSONObject jSONObject3 = new JSONObject();
            e.a.a.a.a.c0(aVar.b, jSONObject3, "wait_hcall_exe");
            e.a.a.a.a.c0(aVar.f5965c, jSONObject3, "mon_http_bfr_flt");
            e.a.a.a.a.c0(aVar.f5966d, jSONObject3, "flt_url");
            e.a.a.a.a.c0(aVar.f5967e, jSONObject3, "mon_http_aft_flt");
            e.a.a.a.a.c0(aVar.f5968f, jSONObject3, "add_com_prm");
            e.a.a.a.a.c0(aVar.f5969g, jSONObject3, "encrypt_req");
            e.a.a.a.a.c0(aVar.h, jSONObject3, "req_vfy");
            e.a.a.a.a.c0(aVar.i, jSONObject3, "cmd_lst");
            e.a.a.a.a.c0(aVar.j, jSONObject3, "chk_req_tkt");
            e.a.a.a.a.c0(aVar.k, jSONObject3, "post_cdn_cache_vfy");
            e.a.a.a.a.c0(aVar.l, jSONObject3, "biz_req_itcpt");
            e.a.a.a.a.c0(aVar.m, jSONObject3, "biz_rsp_itcpt");
            e.a.a.a.a.c0(aVar.n, jSONObject3, "hcall_async_cb");
            obj2 = jSONObject3;
        }
        jSONObject.put("biz_span", obj2);
        c cVar = this.f5962c;
        Objects.requireNonNull(cVar);
        if ((f5961f & 4) == 0) {
            obj3 = null;
        } else {
            JSONObject jSONObject4 = new JSONObject();
            e.a.a.a.a.c0(cVar.b, jSONObject4, "crt_req_fact");
            e.a.a.a.a.c0(cVar.f5975c, jSONObject4, "crt_http_svc_meth");
            e.a.a.a.a.c0(cVar.f5976d, jSONObject4, "to_retrofit_req");
            e.a.a.a.a.c0(cVar.f5977e, jSONObject4, "req_delay");
            e.a.a.a.a.c0(cVar.f5978f, jSONObject4, "flt_dup_qry");
            e.a.a.a.a.c0(cVar.f5979g, jSONObject4, "gen_req_tkt");
            e.a.a.a.a.c0(cVar.h, jSONObject4, "pre_cdn_cache_vrf");
            e.a.a.a.a.c0(cVar.i, jSONObject4, "add_cli_key");
            e.a.a.a.a.c0(cVar.j, jSONObject4, "to_ss_rsp");
            e.a.a.a.a.c0(cVar.k, jSONObject4, "upd_cli_key");
            obj3 = jSONObject4;
        }
        jSONObject.put("inner_span", obj3);
        JSONObject jSONObject5 = jSONObject;
        if ((f5961f & 8) != 0) {
            s sVar = this.f5963d;
            Objects.requireNonNull(sVar);
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            new HashMap();
            long j = 0;
            long j2 = 0;
            JSONObject jSONObject7 = jSONObject;
            for (s.a aVar2 : sVar.b) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("name", aVar2.a);
                JSONObject jSONObject9 = jSONObject7;
                long g2 = com.bytedance.feedbackerlib.a.g(aVar2.f6042c, aVar2.f6043d);
                if (g2 > 0) {
                    j += g2;
                }
                jSONObject8.put(HiAnalyticsConstant.Direction.REQUEST, g2);
                long g3 = com.bytedance.feedbackerlib.a.g(aVar2.f6044e, aVar2.f6045f);
                if (g3 > 0) {
                    j2 += g3;
                }
                jSONObject8.put(HiAnalyticsConstant.Direction.RESPONSE, g3);
                String str = aVar2.f6046g;
                if (str != null) {
                    jSONObject8.put("ex", str);
                }
                jSONArray.put(jSONObject8);
                jSONObject7 = jSONObject9;
            }
            jSONObject6.put("detail", jSONArray);
            jSONObject6.put("req_total", j);
            jSONObject6.put("rsp_total", j2);
            jSONObject7.put("intcptr", jSONObject6);
            jSONObject5 = jSONObject7;
        }
        d dVar = this.f5964e;
        Objects.requireNonNull(dVar);
        if ((f5961f & 16) == 0) {
            obj4 = null;
        } else {
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("call_svr_times", dVar.b);
            jSONObject10.put("app_rsm_ssp_req_s", dVar.f5983f);
            jSONObject10.put("app_rsm_ssp_req_e", dVar.f5984g);
            obj4 = jSONObject10;
        }
        jSONObject5.put("misc", obj4);
        return jSONObject5;
    }
}
