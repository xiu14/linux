package com.bytedance.apm.s;

import android.app.Activity;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.crash.dumper.Scraps;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.bytedance.apm.B.a {

    /* renamed from: g, reason: collision with root package name */
    private boolean f3476g;

    public e() {
        this.f3229e = Scraps.BATTERY;
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        this.f3476g = jSONObject.optInt("energy_enable", 0) == 1;
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return this.f3476g;
    }

    @Override // com.bytedance.apm.B.a
    protected void g() {
        if (!this.f3476g || d() || com.bytedance.apm.s.l.a.e(com.bytedance.apm.g.h())) {
            return;
        }
        float a = e.j.b.b.a(com.bytedance.apm.g.h());
        if (a < 10) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timing_current", a);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
            h(new com.bytedance.apm.v.d.d(Scraps.BATTERY, "", jSONObject, jSONObject2, null));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return 300000L;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        com.bytedance.apm.F.b.e().l(this);
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        super.onFront(activity);
        if (this.f3476g) {
            com.bytedance.apm.F.b.e().b(this);
        }
    }
}
