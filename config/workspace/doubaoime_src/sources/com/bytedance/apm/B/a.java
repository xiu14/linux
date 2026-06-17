package com.bytedance.apm.B;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.F.b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a implements com.bytedance.services.apm.api.d, com.bytedance.services.slardar.config.a, b.e {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3227c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3228d;

    /* renamed from: e, reason: collision with root package name */
    protected String f3229e;

    /* renamed from: f, reason: collision with root package name */
    private long f3230f;

    private final void i() {
        if (!this.f3228d) {
            this.f3228d = true;
            if (e()) {
                com.bytedance.apm.F.b.e().b(this);
            }
        }
        g();
        this.f3230f = System.currentTimeMillis();
    }

    protected abstract void b(JSONObject jSONObject);

    public final void c() {
        if (this.f3227c) {
            return;
        }
        if (TextUtils.isEmpty(this.f3229e)) {
            throw new IllegalStateException("Must set collector Setting key, before init");
        }
        this.f3227c = true;
        ActivityLifeObserver.getInstance().register(this);
        this.b = !ActivityLifeObserver.getInstance().isForeground();
        f();
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(this);
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("perf init: ");
            M.append(this.f3229e);
            com.bytedance.apm.y.d.b("AbstractPerfCollector", M.toString());
        }
    }

    protected boolean d() {
        return this.b;
    }

    protected abstract boolean e();

    protected void f() {
    }

    protected void g() {
    }

    protected void h(com.bytedance.apm.v.d.d dVar) {
        String c2 = d.a().c();
        JSONObject jSONObject = dVar.f3605e;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(c2)) {
                c2 = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put("scene", c2);
            jSONObject.put("process_name", com.bytedance.apm.g.i());
            jSONObject.put("is_main_process", com.bytedance.apm.g.F());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            dVar.f3605e = jSONObject;
        } catch (JSONException unused) {
        }
        com.bytedance.android.input.k.b.a.Q0(dVar, TextUtils.equals(dVar.a, "memory"));
        com.bytedance.apm.data.pipeline.a.k().d(dVar);
    }

    public final void j() {
        if (this.f3228d) {
            this.f3228d = false;
            com.bytedance.apm.F.b.e().l(this);
        }
    }

    protected abstract long k();

    @Override // com.bytedance.services.apm.api.d
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        this.b = true;
        int i = com.bytedance.apm.g.A;
    }

    @Override // com.bytedance.services.apm.api.d
    public void onChange(Activity activity, Fragment fragment) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        this.b = false;
        int i = com.bytedance.apm.g.A;
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onReady() {
        this.a = true;
        i();
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(this.f3229e)) == null) {
            return;
        }
        b(optJSONObject);
    }

    @Override // com.bytedance.apm.F.b.e
    public final void onTimeEvent(long j) {
        long k = k();
        if (k <= 0 || j - this.f3230f <= k || !this.a) {
            return;
        }
        g();
        this.f3230f = System.currentTimeMillis();
    }
}
