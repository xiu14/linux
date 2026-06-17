package com.bytedance.apm.s;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.apm.B.l.j;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.s.l.a;
import com.bytedance.crash.dumper.Scraps;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.bytedance.apm.B.a implements a.b {

    /* renamed from: g, reason: collision with root package name */
    private boolean f3475g;
    private long h;
    private ConcurrentHashMap<String, b> i = new ConcurrentHashMap<>();
    private final Object j = new Object();

    class a {
    }

    public class b {
    }

    private static final class c {
        private static final d a = new d(null);
    }

    d(a aVar) {
        j.e();
        new CopyOnWriteArrayList();
        this.f3229e = Scraps.BATTERY;
    }

    private void l() {
        if (TextUtils.isEmpty(null)) {
            return;
        }
        com.bytedance.apm.F.b.e().l(this);
        e.j.b.a.a();
    }

    public static d m() {
        return c.a;
    }

    @Override // com.bytedance.apm.s.l.a.b
    public void a(boolean z) {
        if (z) {
            synchronized (this.j) {
                l();
            }
        }
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        boolean z = jSONObject.optInt("energy_enable", 0) == 1;
        this.f3475g = z;
        if (z) {
            jSONObject.optInt("battery_energy_sample_interval", 3000);
            this.h = jSONObject.optLong("battery_energy_upload_interval", 120000L);
        } else {
            ActivityLifeObserver.getInstance().unregister(this);
            com.bytedance.apm.F.b.e().l(this);
        }
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return !d();
    }

    @Override // com.bytedance.apm.B.a
    protected void f() {
        com.bytedance.apm.s.l.a.d(com.bytedance.apm.g.h(), this);
    }

    @Override // com.bytedance.apm.B.a
    protected void g() {
        for (Map.Entry<String, b> entry : this.i.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                new JSONObject().put("scene", entry.getKey());
                Objects.requireNonNull(entry.getValue());
                jSONObject.put("current", 0.0f);
                Objects.requireNonNull(entry.getValue());
                jSONObject.put("capacity", 0L);
                JSONObject jSONObject2 = new JSONObject();
                Objects.requireNonNull(entry.getValue());
                jSONObject2.put("cpu_time", 0L);
                Objects.requireNonNull(entry.getValue());
                jSONObject2.put("traffic", 0L);
                Objects.requireNonNull(entry.getValue());
                throw null;
            } catch (JSONException unused) {
            }
        }
        this.i.clear();
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return this.h;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        com.bytedance.apm.F.b.e().l(this);
        synchronized (this.j) {
            l();
        }
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        super.onFront(activity);
    }
}
