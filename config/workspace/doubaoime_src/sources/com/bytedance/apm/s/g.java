package com.bytedance.apm.s;

import android.app.Activity;
import android.os.BatteryManager;
import android.os.SystemClock;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.crash.dumper.Scraps;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends com.bytedance.apm.B.a {

    /* renamed from: g, reason: collision with root package name */
    private boolean f3480g;
    private long h;
    private long i;
    private long j;
    private final LinkedList<b> k;
    private int l;
    long m;
    long n;
    int o;
    int p;
    long q;
    long r;
    private long s;

    private static final class a {
        private static final g a = new g();
    }

    private static class b {
        private b() {
        }

        public double a() {
            if (0 / 1000.0d > 0.0d) {
                return (Math.round(r0 / r2) * 100) / 100.0d;
            }
            return 0.0d;
        }

        public String toString() {
            return String.format("Scene{ name=%s, cpu=%s ms, dur=%s ms, speed=%s", null, 0L, 0L, Double.valueOf(a()));
        }
    }

    public g() {
        new ConcurrentHashMap();
        new LinkedList();
        this.k = new LinkedList<>();
        this.l = 0;
        this.m = 0L;
        this.n = 0L;
        this.o = 0;
        this.p = 0;
        this.q = 0L;
        this.r = 0L;
        this.f3229e = Scraps.BATTERY;
    }

    public static g l() {
        return a.a;
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        boolean z = jSONObject.optInt("power_monitor_enable", 0) == 1;
        this.f3480g = z;
        if (!z) {
            ActivityLifeObserver.getInstance().unregister(this);
            com.bytedance.apm.F.b.e().l(this);
        } else {
            this.h = jSONObject.optLong("power_cpu_monitor_interval", com.heytap.mcssdk.constant.a.f6886d);
            this.i = jSONObject.optLong("power_battery_monior_interval", 300000L);
            this.j = jSONObject.optLong("power_proc_cpu_upload_interval", 120000L);
        }
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return this.f3480g;
    }

    @Override // com.bytedance.apm.B.a
    protected void g() {
        int abs;
        long a2 = com.bytedance.apm.util.b.a();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.n != 0 && this.o == this.l) {
            if ((uptimeMillis - r4) / 60000.0d > 0.0d) {
                double round = Math.round(((a2 - this.m) / r4) * 100.0d) / 100.0d;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", d() ? "background" : "foreground");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cpu_speed_min", round);
                    e.b.b.d.a.g("apm_cpu_speed", jSONObject, jSONObject2, null);
                } catch (Exception unused) {
                }
            }
        }
        this.o = this.l;
        this.m = a2;
        this.n = uptimeMillis;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j = this.q;
        if (this.i + j <= uptimeMillis2) {
            long j2 = uptimeMillis2 - j;
            this.q = uptimeMillis2;
            int intProperty = ((BatteryManager) e.b.b.n.a.a().getSystemService("batterymanager")).getIntProperty(4);
            int i = intProperty - this.p;
            if (this.r == this.l && !d() && i <= 0 && (abs = Math.abs(i)) <= 100) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(Scraps.BATTERY, Math.abs(abs));
                    jSONObject3.put("duraion", j2);
                    e.b.b.d.a.g("apm_battery_monitor", null, jSONObject3, null);
                } catch (Exception unused2) {
                }
            }
            this.p = intProperty;
            this.r = this.l;
        }
        long uptimeMillis3 = SystemClock.uptimeMillis();
        if (this.s + this.j > uptimeMillis3) {
            return;
        }
        this.s = uptimeMillis3;
        synchronized (this.k) {
            Iterator<b> it2 = this.k.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    Objects.requireNonNull(next);
                    jSONObject4.put("scene", (Object) null);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("cpu_speed", next.a());
                    e.b.b.d.a.g("apm_proc_cpu_info", jSONObject4, jSONObject5, null);
                } catch (Exception unused3) {
                }
            }
            this.k.clear();
        }
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return this.h;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        this.l++;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        super.onFront(activity);
        this.l++;
    }
}
