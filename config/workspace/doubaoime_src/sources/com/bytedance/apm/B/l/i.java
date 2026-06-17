package com.bytedance.apm.B.l;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.B.l.c;
import com.bytedance.apm.B.l.e;
import com.bytedance.apm.B.l.j;
import com.bytedance.apm.util.o;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i extends com.bytedance.apm.B.a {
    private static String t = "bg_never_front";
    private static com.bytedance.apm.x.e u;
    private static e.b.b.n.f.a<e.b.b.d.c.c> v = new e.b.b.n.f.a<>(20);
    private static e.b.b.n.f.a<String> w = new e.b.b.n.f.a<>(20);
    private long o;
    private long q;
    private long r;
    private j s;

    /* renamed from: g, reason: collision with root package name */
    private long f3284g = 500000000;
    private long h = 0;
    private long i = 1;
    private long j = -1;
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private long p = 0;

    private static class a {
        private static final i a = new i(null);
    }

    i(h hVar) {
        this.f3229e = "traffic";
        j jVar = j.b.a;
        this.s = jVar;
        jVar.k(d());
    }

    public static i l() {
        return a.a;
    }

    private JSONArray m(Map<String, c.a> map, String str, JSONArray jSONArray) {
        if (map == null || map.size() == 0) {
            return null;
        }
        try {
            Iterator<Map.Entry<String, c.a>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                JSONObject b = it2.next().getValue().b(this.h);
                if (!TextUtils.isEmpty(str)) {
                    b.put("traffic_category", str);
                }
                jSONArray.put(b);
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void n(com.bytedance.apm.x.e eVar) {
        u = null;
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        c cVar;
        c cVar2;
        if (jSONObject.optInt("cause_analysis", 0) == 1) {
            cVar = c.b.a;
            cVar.n();
            this.f3284g = jSONObject.optInt("exception_threshold_mb", 500) * 1000 * 1000;
            this.i = jSONObject.optInt("exception_threshold_bg_mb", 500) * 1000 * 1000;
            this.q = jSONObject.optInt("high_freq_threshold", 200);
            double optDouble = jSONObject.optDouble("large_usage_threshold_mb", 10.0d) * 1000.0d * 1000.0d;
            cVar2 = c.b.a;
            cVar2.m(optDouble);
            jSONObject.optDouble("alog_record_threshold", 100.0d);
        }
        this.h = jSONObject.optLong("record_usage_kb", 1L) * DownloadConstants.KB;
        boolean b = com.bytedance.apm.D.c.b(this.f3229e);
        while (!v.a()) {
            e.b.b.d.c.c b2 = v.b();
            String b3 = w.b();
            if (b || jSONObject.optInt(b3, 0) == 1) {
                e.b.b.d.a.h(b2);
            } else if (com.bytedance.apm.g.B()) {
                com.bytedance.apm.doctor.a.b(b2.a(), b2.d(), false);
            }
            if (com.bytedance.apm.g.B()) {
                String[] strArr = new String[1];
                StringBuilder M = e.a.a.a.a.M("isSample:key:");
                M.append(b || jSONObject.optInt(b3, 0) == 1);
                strArr[0] = M.toString();
                com.bytedance.apm.y.d.b("Traffic", strArr);
            }
        }
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return true;
    }

    @Override // com.bytedance.apm.B.a
    protected void f() {
        i iVar;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2 = com.bytedance.apm.g.h().getSharedPreferences("traffic_monitor_info", 0);
        long j = sharedPreferences2.getLong("init", -1L);
        long j2 = sharedPreferences2.getLong("init_ts", 0L);
        if (j > -1) {
            long j3 = sharedPreferences2.getLong("usage", 0L);
            long j4 = sharedPreferences2.getLong("usage_ts", 0L);
            long j5 = j3 - j;
            if (j5 > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("total_usage", j5);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("total_usage_duration", ((j4 - j2) / 1000) / 60);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("init_ts", j2);
                    jSONObject3.put("usage_ts", j4);
                    sharedPreferences = sharedPreferences2;
                    try {
                        jSONObject3.put("biz_usage", sharedPreferences.getLong("biz_usage", 0L));
                        jSONObject3.put("init", j);
                        jSONObject3.put("usage", j3);
                        String string = sharedPreferences.getString("biz_json", "");
                        if (string != "") {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("usage", new JSONArray(string));
                            jSONObject3.put("detail", jSONObject4);
                        }
                        com.bytedance.apm.v.d.d dVar = new com.bytedance.apm.v.d.d();
                        iVar = this;
                        try {
                            dVar.a = iVar.f3229e;
                            dVar.f3604d = jSONObject;
                            dVar.f3605e = jSONObject2;
                            dVar.f3607g = jSONObject3;
                            iVar.h(dVar);
                            com.bytedance.apm.x.e eVar = u;
                            if (eVar != null) {
                                eVar.b(j5);
                            }
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        iVar = this;
                    }
                } catch (JSONException unused3) {
                }
            }
            iVar = this;
            sharedPreferences = sharedPreferences2;
        } else {
            iVar = this;
            sharedPreferences = sharedPreferences2;
        }
        iVar.p = iVar.s.h();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("init", iVar.p);
        edit.putLong("init_ts", System.currentTimeMillis());
        edit.putLong("usage", 0L);
        edit.apply();
    }

    @Override // com.bytedance.apm.B.a
    protected void g() {
        c cVar;
        e eVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        c cVar6;
        long j;
        c cVar7;
        c cVar8;
        c cVar9;
        e eVar2;
        c cVar10;
        c cVar11;
        e eVar3;
        Map<String, k> map;
        c cVar12;
        if (!d()) {
            t = "bg_ever_front";
        }
        long currentTimeMillis = System.currentTimeMillis();
        long h = this.s.h();
        long f2 = this.s.f();
        long g2 = this.s.g();
        long i = this.s.i();
        long j2 = this.s.j();
        if (this.j == -1) {
            this.j = h;
            this.k = f2;
            this.l = g2;
            this.m = i;
            this.n = j2;
            this.o = currentTimeMillis;
            return;
        }
        JSONArray jSONArray = new JSONArray();
        long j3 = h - this.j;
        long j4 = f2 - this.k;
        long j5 = g2 - this.l;
        long j6 = i - this.m;
        long j7 = j2 - this.n;
        long j8 = this.f3284g;
        if (j8 <= 0 || j3 <= j8) {
            long j9 = this.i;
            if (j9 > 0 && j4 + j6 > j9) {
                if (TextUtils.equals(t, "bg_never_front")) {
                    jSONArray.put("never_front_usage_abnormal");
                } else {
                    jSONArray.put("bg_usage_abnormal");
                }
            }
        } else {
            jSONArray.put("total_usage_abnormal");
        }
        cVar = c.b.a;
        o<k> j10 = cVar.j();
        if (j10 != null && j10.c() > 0) {
            jSONArray.put("large_request");
        }
        eVar = e.a.a;
        if (eVar.c() > this.q) {
            jSONArray.put("high_feq_request");
        }
        this.j = h;
        this.n = j2;
        this.m = i;
        this.k = f2;
        this.l = g2;
        JSONArray jSONArray2 = new JSONArray();
        com.bytedance.apm.D.c.b(this.f3229e);
        cVar2 = c.b.a;
        m(cVar2.g(), "usage_10_minutes", jSONArray2);
        cVar3 = c.b.a;
        m(cVar3.i(), "wifi_front", jSONArray2);
        cVar4 = c.b.a;
        m(cVar4.h(), "wifi_back", jSONArray2);
        cVar5 = c.b.a;
        m(cVar5.f(), "mobile_front", jSONArray2);
        cVar6 = c.b.a;
        m(cVar6.e(), "mobile_back", jSONArray2);
        JSONObject jSONObject = new JSONObject();
        if (jSONArray2.length() > 0) {
            try {
                jSONObject.put("usage", jSONArray2);
            } catch (Exception unused) {
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("usage_10_minutes", j3);
            jSONObject2.put("mobile_back", j4);
            jSONObject2.put("mobile_front", j5);
            jSONObject2.put("wifi_back", j6);
            j = h;
            try {
                jSONObject2.put("wifi_front", j7);
                com.bytedance.apm.x.e eVar4 = u;
                if (eVar4 != null) {
                    eVar4.a(j3, j6, j7, j4, j5);
                }
                JSONObject jSONObject3 = new JSONObject();
                com.bytedance.apm.v.d.d dVar = new com.bytedance.apm.v.d.d();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("detail", jSONObject);
                cVar11 = c.b.a;
                jSONObject4.put("biz_usage", cVar11.d());
                jSONObject4.put("init_ts", this.o);
                jSONObject4.put("usage_ts", currentTimeMillis);
                dVar.a = this.f3229e;
                dVar.f3605e = jSONObject3;
                dVar.f3604d = jSONObject2;
                dVar.f3607g = jSONObject4;
                h(dVar);
                this.o = currentTimeMillis;
                if (jSONArray.length() > 0) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("exception", true);
                    jSONObject5.put("exception_type", jSONArray);
                    eVar3 = e.a.a;
                    synchronized (eVar3) {
                        map = eVar3.b;
                    }
                    if (map != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (Map.Entry<String, k> entry : map.entrySet()) {
                            if (entry.getValue().f3286d > this.q) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put(DownloadConstants.PATH_KEY, entry.getValue().a);
                                jSONObject6.put("freq", entry.getValue().f3286d);
                                jSONObject6.put("biz", entry.getValue().b);
                                jSONArray3.put(jSONObject6);
                            }
                        }
                        jSONObject.put("high_freq", jSONArray3);
                    }
                    if (j10 != null) {
                        ArrayList arrayList = (ArrayList) j10.d();
                        if (arrayList.size() > 0) {
                            JSONArray jSONArray4 = new JSONArray();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                k kVar = (k) it2.next();
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put(DownloadConstants.PATH_KEY, kVar.a);
                                jSONObject7.put("usage", kVar.f3285c);
                                jSONObject7.put("biz", kVar.b);
                                jSONArray4.put(jSONObject7);
                            }
                            jSONObject.put("large_usage", jSONArray4);
                        }
                    }
                    cVar12 = c.b.a;
                    jSONObject5.put("biz_usage", cVar12.d());
                    jSONObject5.put("detail", jSONObject);
                    com.bytedance.apm.v.d.d dVar2 = new com.bytedance.apm.v.d.d();
                    dVar2.a = this.f3229e;
                    dVar2.f3605e = jSONObject3;
                    dVar2.f3604d = jSONObject2;
                    dVar2.f3607g = jSONObject5;
                    h(dVar2);
                }
            } catch (JSONException unused2) {
            }
        } catch (JSONException unused3) {
            j = h;
        }
        SharedPreferences.Editor edit = com.bytedance.apm.g.h().getSharedPreferences("traffic_monitor_info", 0).edit();
        long j11 = j;
        edit.putLong("usage", j11);
        long j12 = this.r;
        cVar7 = c.b.a;
        long d2 = cVar7.d() + j12;
        this.r = d2;
        edit.putLong("biz_usage", d2);
        edit.putLong("usage_ts", System.currentTimeMillis());
        cVar8 = c.b.a;
        Map<String, c.a> k = cVar8.k();
        if (k != null && k.size() > 0) {
            JSONArray jSONArray5 = new JSONArray();
            Iterator<Map.Entry<String, c.a>> it3 = k.entrySet().iterator();
            while (it3.hasNext()) {
                c.a value = it3.next().getValue();
                Objects.requireNonNull(value);
                JSONObject jSONObject8 = new JSONObject();
                try {
                    jSONObject8.put("biz", value.a);
                    jSONObject8.put("usage", value.f3271c);
                    JSONArray jSONArray6 = new JSONArray();
                    Map<String, Long> map2 = value.b;
                    if (map2 != null && map2.size() > 0) {
                        for (Map.Entry<String, Long> entry2 : value.b.entrySet()) {
                            JSONObject jSONObject9 = new JSONObject();
                            jSONObject9.put("source_id", entry2.getKey());
                            jSONObject9.put("usage", entry2.getValue());
                            jSONArray6.put(jSONObject9);
                        }
                    }
                    jSONObject8.put("detail", jSONArray6);
                } catch (JSONException unused4) {
                }
                try {
                    jSONObject8.put("traffic_category", "total_usage");
                } catch (Exception unused5) {
                }
                jSONArray5.put(jSONObject8);
            }
            edit.putString("biz_json", jSONArray5.toString());
        }
        edit.apply();
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("traffic since app boot: ");
            M.append(j11 - this.p);
            Log.d("APM-Traffic-Detail ", M.toString());
            StringBuilder sb = new StringBuilder();
            sb.append("traffic stats from biz (include ttnet/ok/httpurl plus trafficStats): ");
            cVar10 = c.b.a;
            sb.append(cVar10.d());
            Log.d("APM-Traffic-Detail ", sb.toString());
        }
        cVar9 = c.b.a;
        cVar9.c();
        eVar2 = e.a.a;
        eVar2.b();
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return 600000L;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        this.s.k(true);
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        super.onFront(activity);
        t = "bg_ever_front";
        this.s.k(false);
    }
}
