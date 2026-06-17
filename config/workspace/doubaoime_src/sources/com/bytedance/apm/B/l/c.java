package com.bytedance.apm.B.l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.apm.B.l.e;
import com.bytedance.apm.util.o;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private boolean a;
    private Map<String, a> b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, a> f3266c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, a> f3267d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, a> f3268e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, a> f3269f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, a> f3270g;
    private o<k> h;
    private volatile long i = 0;
    private double j = 102400.0d;

    class a {
        public String a;

        /* renamed from: c, reason: collision with root package name */
        public long f3271c = 0;
        public Map<String, Long> b = new HashMap();

        public a(c cVar, String str) {
            this.a = str;
        }

        public void a(String str, long j) {
            if (this.b.containsKey(str)) {
                Map<String, Long> map = this.b;
                map.put(str, Long.valueOf(map.get(str).longValue() + j));
            } else {
                this.b.put(str, Long.valueOf(j));
            }
            this.f3271c += j;
        }

        public JSONObject b(long j) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("biz", this.a);
                jSONObject.put("usage", this.f3271c);
                JSONArray jSONArray = new JSONArray();
                Map<String, Long> map = this.b;
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, Long> entry : this.b.entrySet()) {
                        if (entry.getValue().longValue() >= j) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("source_id", entry.getKey());
                            jSONObject2.put("usage", entry.getValue());
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
                jSONObject.put("detail", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        private static final c a = new c(null);
    }

    c(com.bytedance.apm.B.l.a aVar) {
    }

    private void b(String str, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean c2 = com.bytedance.apm.util.j.c(com.bytedance.apm.g.h());
        e.b.b.m.g.a aVar = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
        boolean isForeground = aVar != null ? aVar.isForeground() : false;
        if (this.b == null) {
            this.b = new HashMap();
        }
        if (this.f3266c == null) {
            this.f3266c = new HashMap();
        }
        if (this.f3267d == null) {
            this.f3267d = new HashMap();
        }
        if (this.f3268e == null) {
            this.f3268e = new HashMap();
        }
        if (this.f3269f == null) {
            this.f3269f = new HashMap();
        }
        if (this.b.containsKey(str)) {
            this.b.get(str).a(str2, j);
        } else {
            a aVar2 = new a(this, str);
            aVar2.a(str2, j);
            this.b.put(str, aVar2);
        }
        if (c2 && !isForeground) {
            if (this.f3266c.containsKey(str)) {
                this.f3266c.get(str).a(str2, j);
            } else {
                a aVar3 = new a(this, str);
                aVar3.a(str2, j);
                this.f3266c.put(str, aVar3);
            }
        }
        if (c2 && isForeground) {
            if (this.f3267d.containsKey(str)) {
                this.f3267d.get(str).a(str2, j);
            } else {
                a aVar4 = new a(this, str);
                aVar4.a(str2, j);
                this.f3267d.put(str, aVar4);
            }
        }
        if (!c2 && !isForeground) {
            if (this.f3268e.containsKey(str)) {
                this.f3268e.get(str).a(str2, j);
            } else {
                a aVar5 = new a(this, str);
                aVar5.a(str2, j);
                this.f3268e.put(str, aVar5);
            }
        }
        if (!c2 && isForeground) {
            if (this.f3269f.containsKey(str)) {
                this.f3269f.get(str).a(str2, j);
            } else {
                a aVar6 = new a(this, str);
                aVar6.a(str2, j);
                this.f3269f.put(str, aVar6);
            }
        }
        if (this.f3270g == null) {
            this.f3270g = new HashMap();
        }
        if (this.f3270g.containsKey(str)) {
            this.f3270g.get(str).a(str2, j);
            return;
        }
        a aVar7 = new a(this, str);
        aVar7.a(str2, j);
        this.f3270g.put(str, aVar7);
    }

    public void c() {
        Map<String, a> map = this.b;
        if (map != null) {
            map.clear();
        }
        Map<String, a> map2 = this.f3266c;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, a> map3 = this.f3267d;
        if (map3 != null) {
            map3.clear();
        }
        Map<String, a> map4 = this.f3268e;
        if (map4 != null) {
            map4.clear();
        }
        Map<String, a> map5 = this.f3269f;
        if (map5 != null) {
            map5.clear();
        }
        o<k> oVar = this.h;
        if (oVar != null) {
            oVar.b();
        }
        this.i = 0L;
    }

    public long d() {
        return this.i;
    }

    @Nullable
    public Map<String, a> e() {
        return this.f3268e;
    }

    @Nullable
    public Map<String, a> f() {
        return this.f3269f;
    }

    @Nullable
    public Map<String, a> g() {
        return this.b;
    }

    @Nullable
    public Map<String, a> h() {
        return this.f3266c;
    }

    @Nullable
    public Map<String, a> i() {
        return this.f3267d;
    }

    @Nullable
    public o<k> j() {
        return this.h;
    }

    public Map<String, a> k() {
        return this.f3270g;
    }

    public void l(String str, JSONObject jSONObject) {
        e eVar;
        if (!this.a || TextUtils.isEmpty(str) || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        try {
            String path = new URL(str).getPath();
            if (TextUtils.isEmpty(path)) {
                return;
            }
            String optString = jSONObject.optString("net_consume_type", "ttnet");
            JSONObject optJSONObject = jSONObject.optJSONObject(MonitorConstants.REQUEST_LOG);
            if (optJSONObject == null) {
                String optString2 = jSONObject.optString(MonitorConstants.REQUEST_LOG);
                if (!TextUtils.isEmpty(optString2)) {
                    optJSONObject = new JSONObject(optString2);
                }
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("response");
            long optLong = optJSONObject2 != null ? optJSONObject2.optLong("received_bytes") + optJSONObject2.optLong("sent_bytes") : 0L;
            this.i += optLong;
            if (optLong > this.j) {
                if (this.h == null) {
                    this.h = new o<>(30);
                }
                this.h.a(new k(path, optLong, optString));
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    str = Uri.parse(str).buildUpon().clearQuery().build().toString();
                } catch (Exception unused) {
                }
            }
            b(optString, optLong, str);
            eVar = e.a.a;
            eVar.a(optLong, path, optString);
        } catch (Throwable unused2) {
        }
    }

    public void m(double d2) {
        this.j = d2;
    }

    public void n() {
        this.a = true;
        com.bytedance.apm.y.a.f(true);
        com.bytedance.apm.data.pipeline.d.l().r(new com.bytedance.apm.B.l.a(this));
        com.bytedance.apm.data.pipeline.a.k().l(new com.bytedance.apm.B.l.b(this));
    }
}
