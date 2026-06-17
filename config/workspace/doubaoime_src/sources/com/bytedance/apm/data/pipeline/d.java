package com.bytedance.apm.data.pipeline;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.bytedance.apm.v.a<com.bytedance.apm.v.d.a> {
    private static long u = 30000;
    private static boolean v = false;

    /* renamed from: f, reason: collision with root package name */
    private int f3424f;
    private volatile int h;
    private volatile List<String> i;
    private List<Pattern> j;
    private List<String> k;
    private List<Pattern> l;
    private List<String> m;
    private List<String> n;
    private List<String> o;
    private double r;
    private boolean s;
    private c t;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3425g = true;
    private boolean p = true;
    private boolean q = false;

    private static final class b {
        private static final d a = new d(null);
    }

    d(a aVar) {
    }

    private void k(List<String> list, JSONObject jSONObject, String str) {
        if (list == null || jSONObject == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                String optString = jSONObject.optString(str);
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(optString);
                JSONObject jSONObject3 = new JSONObject();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (list.contains(next)) {
                        jSONObject3.put(next, jSONObject2.opt(next));
                    }
                }
                jSONObject.put(str, jSONObject3.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static d l() {
        return b.a;
    }

    private boolean m(String str, JSONObject jSONObject) {
        int i = (n() || this.f3424f != 0 || com.bytedance.android.input.k.b.a.i0(str, this.k, this.l)) ? 1 : 0;
        boolean e2 = com.bytedance.apm.D.c.e("smart_traffic");
        try {
            jSONObject.put("hit_rules", e2 ? i | 4 : i);
        } catch (JSONException unused) {
        }
        return i != 0 || e2;
    }

    public static void o(boolean z) {
        v = z;
    }

    public static void p(long j) {
        u = j;
    }

    @Override // com.bytedance.apm.v.a
    protected boolean c(com.bytedance.apm.v.d.a aVar) {
        com.bytedance.apm.v.d.a aVar2 = aVar;
        return (aVar2 == null || TextUtils.isEmpty(aVar2.f3596d)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[Catch: JSONException -> 0x009e, LOOP:1: B:34:0x008a->B:36:0x0090, LOOP_END, TRY_LEAVE, TryCatch #3 {JSONException -> 0x009e, blocks: (B:33:0x0086, B:34:0x008a, B:36:0x0090), top: B:32:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.apm.v.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void e(com.bytedance.apm.v.d.a r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.data.pipeline.d.e(com.bytedance.apm.v.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if ((java.lang.System.currentTimeMillis() - com.bytedance.apm.g.g()) > com.bytedance.apm.data.pipeline.d.u) goto L23;
     */
    @Override // com.bytedance.apm.v.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void g(com.bytedance.apm.v.d.a r8) {
        /*
            r7 = this;
            com.bytedance.apm.v.d.a r8 = (com.bytedance.apm.v.d.a) r8
            com.bytedance.apm.core.ActivityLifeObserver r0 = com.bytedance.apm.core.ActivityLifeObserver.getInstance()     // Catch: org.json.JSONException -> L71
            r1 = 1
            if (r0 != 0) goto Lb
            r0 = r1
            goto L14
        Lb:
            com.bytedance.apm.core.ActivityLifeObserver r0 = com.bytedance.apm.core.ActivityLifeObserver.getInstance()     // Catch: org.json.JSONException -> L71
            boolean r0 = r0.isForeground()     // Catch: org.json.JSONException -> L71
            r0 = r0 ^ r1
        L14:
            r2 = 0
            if (r0 != 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            org.json.JSONObject r3 = r8.h     // Catch: org.json.JSONException -> L71
            java.lang.String r4 = "front"
            boolean r3 = r3.isNull(r4)     // Catch: org.json.JSONException -> L71
            if (r3 == 0) goto L29
            org.json.JSONObject r3 = r8.h     // Catch: org.json.JSONException -> L71
            r3.put(r4, r0)     // Catch: org.json.JSONException -> L71
        L29:
            boolean r0 = com.bytedance.apm.data.pipeline.d.v     // Catch: org.json.JSONException -> L71
            if (r0 != 0) goto L2e
            goto L48
        L2e:
            long r3 = com.bytedance.apm.g.g()     // Catch: org.json.JSONException -> L71
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L39
            goto L48
        L39:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L71
            long r5 = com.bytedance.apm.g.g()     // Catch: org.json.JSONException -> L71
            long r3 = r3 - r5
            long r5 = com.bytedance.apm.data.pipeline.d.u     // Catch: org.json.JSONException -> L71
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L49
        L48:
            r1 = r2
        L49:
            if (r1 == 0) goto L60
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L60
            r0.<init>()     // Catch: org.json.JSONException -> L60
            java.lang.String r1 = "trace_base"
            long r2 = com.bytedance.apm.g.g()     // Catch: org.json.JSONException -> L60
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L60
            org.json.JSONObject r1 = r8.h     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "relate_start_trace"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L60
        L60:
            java.lang.String r0 = "ttnet"
            org.json.JSONObject r1 = r8.h     // Catch: org.json.JSONException -> L71
            java.lang.String r2 = "net_consume_type"
            boolean r1 = r1.isNull(r2)     // Catch: org.json.JSONException -> L71
            if (r1 == 0) goto L71
            org.json.JSONObject r8 = r8.h     // Catch: org.json.JSONException -> L71
            r8.put(r2, r0)     // Catch: org.json.JSONException -> L71
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.data.pipeline.d.g(com.bytedance.apm.v.c):void");
    }

    public boolean n() {
        return this.p && this.r != 0.0d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|7|(10:11|(3:13|(2:15|16)(1:18)|17)|20|21|22|23|(1:25)(4:30|(4:33|(3:35|36|37)(1:39)|38|31)|40|41)|26|(1:28)|29)|44|21|22|23|(0)(0)|26|(0)|29) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[Catch: Exception -> 0x0081, TryCatch #1 {Exception -> 0x0081, blocks: (B:23:0x0052, B:30:0x005d, B:31:0x0066, B:33:0x006c, B:36:0x0078), top: B:22:0x0052 }] */
    @Override // com.bytedance.apm.v.a, com.bytedance.services.slardar.config.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRefresh(org.json.JSONObject r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r10 = "network_image_modules"
            org.json.JSONObject r9 = com.bytedance.android.input.k.b.a.M(r9, r10)
            if (r9 == 0) goto Ld0
            java.lang.String r10 = "network"
            org.json.JSONObject r10 = com.bytedance.android.input.k.b.a.M(r9, r10)
            if (r10 == 0) goto Lc0
            java.lang.String r0 = "api_block_list"
            java.util.List r1 = com.bytedance.android.input.k.b.a.s0(r10, r0)
            r8.i = r1
            r1 = 0
            r2 = 0
            org.json.JSONArray r0 = r10.optJSONArray(r0)     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L46
            int r3 = r0.length()     // Catch: java.lang.Exception -> L46
            if (r3 <= 0) goto L46
            int r3 = r0.length()     // Catch: java.lang.Exception -> L46
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L46
            r4.<init>(r3)     // Catch: java.lang.Exception -> L46
            r5 = r2
        L30:
            if (r5 >= r3) goto L47
            java.lang.String r6 = r0.getString(r5)     // Catch: java.lang.Exception -> L46
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L46
            if (r7 != 0) goto L43
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Exception -> L46
            r4.add(r6)     // Catch: java.lang.Exception -> L46
        L43:
            int r5 = r5 + 1
            goto L30
        L46:
            r4 = r1
        L47:
            r8.j = r4
            java.lang.String r0 = "api_allow_list"
            java.util.List r3 = com.bytedance.android.input.k.b.a.t0(r10, r0)
            r8.k = r3
            r3 = 1
            org.json.JSONObject r0 = r10.optJSONObject(r0)     // Catch: java.lang.Exception -> L81
            boolean r4 = e.b.b.n.b.c(r0)     // Catch: java.lang.Exception -> L81
            if (r4 == 0) goto L5d
            goto L81
        L5d:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L81
            r4.<init>()     // Catch: java.lang.Exception -> L81
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L81
        L66:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L81
            if (r6 == 0) goto L80
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L81
            int r7 = r0.optInt(r6)     // Catch: java.lang.Exception -> L81
            if (r7 != r3) goto L66
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Exception -> L81
            r4.add(r6)     // Catch: java.lang.Exception -> L81
            goto L66
        L80:
            r1 = r4
        L81:
            r8.l = r1
            java.lang.String r0 = "enable_api_all_upload"
            int r0 = r10.optInt(r0, r2)
            r8.f3424f = r0
            java.lang.String r0 = "enable_trace_log"
            boolean r0 = r10.optBoolean(r0, r3)
            r8.f3425g = r0
            java.lang.String r0 = "enable_api_error_upload"
            int r0 = r10.optInt(r0, r3)
            r8.h = r0
            java.lang.String r0 = "enable_cancel_error_report"
            int r0 = r10.optInt(r0)
            if (r0 != r3) goto La4
            r2 = r3
        La4:
            r8.q = r2
            java.lang.String r0 = "request_allow_header"
            java.util.List r0 = com.bytedance.android.input.k.b.a.t0(r10, r0)
            r8.n = r0
            java.lang.String r0 = "response_allow_header"
            java.util.List r0 = com.bytedance.android.input.k.b.a.t0(r10, r0)
            r8.o = r0
            r0 = 0
            java.lang.String r2 = "enable_base_api_all"
            double r0 = r10.optDouble(r2, r0)
            r8.r = r0
        Lc0:
            java.lang.String r10 = "image"
            org.json.JSONObject r9 = com.bytedance.android.input.k.b.a.M(r9, r10)
            if (r9 == 0) goto Ld0
            java.lang.String r10 = "image_allow_list"
            java.util.List r9 = com.bytedance.android.input.k.b.a.t0(r9, r10)
            r8.m = r9
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.data.pipeline.d.onRefresh(org.json.JSONObject, boolean):void");
    }

    public void q(boolean z) {
        this.s = z;
    }

    public void r(c cVar) {
        this.t = cVar;
    }
}
