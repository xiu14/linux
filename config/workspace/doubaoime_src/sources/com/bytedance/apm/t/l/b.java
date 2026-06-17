package com.bytedance.apm.t.l;

import android.view.FrameMetrics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.bytedance.apm.t.l.a {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3544e = false;
    private final ArrayList<com.bytedance.apm.G.h.b> b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, c> f3545c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private C0126b f3546d = new C0126b();

    class a implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ boolean b;

        a(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f3546d.a(this.a, this.b);
            if (b.this.b.size() <= 0) {
                return;
            }
            Objects.requireNonNull((com.bytedance.apm.G.h.b) b.this.b.get(0));
            throw null;
        }
    }

    /* renamed from: com.bytedance.apm.t.l.b$b, reason: collision with other inner class name */
    public static class C0126b {
        public int a = 0;
        public int b = 0;

        /* renamed from: c, reason: collision with root package name */
        public long f3548c = 0;

        public void a(long j, boolean z) {
            if (z) {
                this.a++;
            }
            this.b++;
            this.f3548c += j;
        }
    }

    private class c {
        String a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        int f3549c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f3550d;

        /* renamed from: e, reason: collision with root package name */
        int[] f3551e;

        /* renamed from: f, reason: collision with root package name */
        int f3552f;

        c(b bVar, String str) {
            this.a = str;
            int e2 = com.bytedance.apm.util.h.e() - 1;
            this.f3552f = e2;
            this.f3551e = new int[(e2 - 0) + 1];
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("visibleScene=");
            M.append(this.a);
            M.append(", sumFrame=");
            M.append(this.f3549c);
            M.append(", sumDroppedFrames=");
            M.append(this.f3550d);
            M.append(", sumFrameCost=");
            M.append(this.b);
            M.append(", dropLevel=");
            M.append(Arrays.toString(this.f3551e));
            return M.toString();
        }
    }

    public b() {
        d.i().r(true);
    }

    private void k(String str, long j) {
        if (!f3544e || j <= 0) {
            return;
        }
        c cVar = this.f3545c.get(str);
        if (cVar == null) {
            cVar = new c(this, str);
            this.f3545c.put(str, cVar);
        }
        Objects.requireNonNull(cVar);
        float c2 = com.bytedance.apm.util.h.c();
        cVar.b += j;
        int min = Math.min(Math.max((int) (j / c2), 0), cVar.f3552f);
        int[] iArr = cVar.f3551e;
        iArr[min] = iArr[min] + 1;
        cVar.f3550d += min;
        cVar.f3549c++;
        if (cVar.b >= com.heytap.mcssdk.constant.a.q) {
            this.f3545c.remove(str);
            try {
                float c3 = com.bytedance.apm.util.h.c();
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i <= cVar.f3552f; i++) {
                    if (cVar.f3551e[i] > 0) {
                        jSONObject.put(String.valueOf(i), cVar.f3551e[i]);
                    }
                }
                com.bytedance.apm.G.h.a.c().b(null, cVar.a, (float) ((((cVar.f3549c * 100) * com.bytedance.apm.util.h.e()) / (cVar.f3549c + cVar.f3550d)) / 100.0d));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("scene", cVar.a);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("total_scroll_time", cVar.b);
                jSONObject3.put("drop_time_rate", 1.0f - ((cVar.f3549c * 1.0f) / ((int) (cVar.b / c3))));
                jSONObject3.put("refresh_rate", cVar.f3552f + 1);
                com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.d("fps_drop", cVar.a, jSONObject, jSONObject2, jSONObject3));
            } catch (Throwable unused) {
            }
            cVar.f3549c = 0;
            cVar.f3550d = 0;
            cVar.b = 0L;
        }
    }

    public static void l(boolean z) {
        f3544e = z;
    }

    @Override // com.bytedance.apm.t.a
    public void f(String str, long j, int i) {
        k(str, j);
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).a(j);
        }
    }

    @Override // com.bytedance.apm.t.a
    public void g(String str, FrameMetrics frameMetrics, int i) {
        long metric = (frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))))) / 1000000;
        k(str, metric);
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).a(metric);
        }
    }

    public void j(long j, boolean z) {
        d.i().j.b(new a(j, z));
    }
}
