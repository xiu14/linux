package com.bytedance.apm.G.h;

import com.bytedance.apm.F.b;
import com.bytedance.apm.g;
import com.bytedance.apm.util.h;
import com.bytedance.apm.y.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements b.e {
    private final HashMap<String, b> b = new HashMap<>();
    private boolean a = true;

    /* renamed from: com.bytedance.apm.G.h.a$a, reason: collision with other inner class name */
    class RunnableC0109a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Map b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f3315c;

        RunnableC0109a(String str, Map map, float f2) {
            this.a = str;
            this.b = map;
            this.f3315c = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = (b) a.this.b.get(this.a);
            if (bVar != null) {
                bVar.a(this.f3315c);
            } else {
                a.this.b.put(this.a, new b(this.b, this.a, this.f3315c));
            }
        }
    }

    private static class b {
        public Map<String, String> a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        private long f3317c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private int f3318d = 1;

        b(Map<String, String> map, String str, float f2) {
            this.a = map;
            this.b = f2;
        }

        void a(float f2) {
            this.b += f2;
            this.f3318d++;
        }

        float b() {
            int i = this.f3318d;
            if (i > 0) {
                return this.b / i;
            }
            return -1.0f;
        }

        boolean c(long j) {
            return j - this.f3317c > 120000;
        }
    }

    private static class c {
        private static final a a = new a(null);
    }

    a(RunnableC0109a runnableC0109a) {
        com.bytedance.apm.F.b.e().b(this);
    }

    public static a c() {
        return c.a;
    }

    public void b(Map<String, String> map, String str, float f2) {
        com.bytedance.apm.F.b.e().h(new RunnableC0109a(str, null, f2));
    }

    @Override // com.bytedance.apm.F.b.e
    public void onTimeEvent(long j) {
        if (this.b.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, b>> it2 = this.b.entrySet().iterator();
        int e2 = h.e();
        while (it2.hasNext()) {
            Map.Entry<String, b> next = it2.next();
            String key = next.getKey();
            b value = next.getValue();
            if (value.c(j)) {
                it2.remove();
                float b2 = value.b();
                if (g.B()) {
                    d.d("<monitor><perf>", "aggregate fps: " + key + " , value: " + b2);
                }
                if (b2 > 0.0f) {
                    float f2 = e2;
                    if (b2 > f2) {
                        b2 = f2;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("fps", b2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("scene", key);
                        com.bytedance.apm.v.d.d dVar = new com.bytedance.apm.v.d.d("fps", key, jSONObject, jSONObject2, null);
                        JSONObject c2 = e.b.b.l.a.a.a().c(true);
                        dVar.f3606f = c2;
                        c2.put("refresh_rate", e2);
                        if (this.a) {
                            this.a = false;
                            c2.put("device_max_refresh_rate", h.b());
                            c2.put("refresh_rate_restricted", !h.g());
                        }
                        Map<String, String> map = value.a;
                        if (map != null && !map.isEmpty()) {
                            for (Map.Entry<String, String> entry : value.a.entrySet()) {
                                dVar.f3606f.put(entry.getKey(), entry.getValue());
                            }
                        }
                        com.bytedance.apm.data.pipeline.a.k().d(dVar);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
