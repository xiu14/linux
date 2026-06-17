package com.bytedance.android.input.basic.applog.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.bdinstall.Level;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import kotlin.s.c.l;
import org.json.JSONObject;

@ServiceImpl
/* loaded from: classes.dex */
public final class AppLogImpl implements IAppLog {
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2049c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2050d = true;

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public String getDeviceId() {
        String c2 = com.bytedance.applog.a.c();
        return c2 == null ? "" : c2;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public String getUserID() {
        String i = com.bytedance.applog.a.i();
        return i == null ? "" : i;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public String h() {
        String d2 = com.bytedance.applog.a.d();
        return d2 == null ? "" : d2;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void i(String str) {
        l.f(str, NotificationCompat.CATEGORY_EVENT);
        if (this.f2050d && this.b && this.f2049c) {
            com.bytedance.applog.a.r("cur_app_name", IAppGlobals.a.H());
            com.bytedance.applog.a.n(str, new JSONObject().put("growth_deepevent", 1));
        }
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void initialize() {
        b bVar = b.a;
        b.b();
        this.b = true;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void j(String str, JSONObject jSONObject) {
        l.f(str, NotificationCompat.CATEGORY_EVENT);
        l.f(jSONObject, "jsonParams");
        if (this.f2050d && this.b && this.f2049c) {
            com.bytedance.applog.a.r("cur_app_name", IAppGlobals.a.H());
            jSONObject.put("growth_deepevent", 1);
            com.bytedance.applog.a.n(str, jSONObject);
        }
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void k(boolean z) {
        this.f2049c = z;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void l() {
        com.bytedance.applog.a.k();
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public String m(Context context, String str, boolean z) {
        String b = com.bytedance.applog.a.b(context, str, z, Level.L1);
        l.e(b, "addNetCommonParams(context, url, isApi, Level.L1)");
        return b;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public String n() {
        String g2 = com.bytedance.applog.a.g();
        return g2 == null ? "" : g2;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void o(com.bytedance.android.input.basic.applog.api.b bVar) {
        l.f(bVar, "listener");
        d.a.e(bVar);
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void onResume() {
        com.bytedance.applog.a.l("com.bytedance.android.input.fake.activity", -1865172491);
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void p(com.bytedance.android.input.basic.applog.api.b bVar) {
        l.f(bVar, "listener");
        d dVar = d.a;
        com.bytedance.applog.a.a(dVar);
        dVar.d(bVar);
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void q(String str) {
        l.f(str, "version");
        com.bytedance.applog.a.q(str);
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public String r(Context context, String str, boolean z) {
        l.f(context, "context");
        l.f(str, "str");
        String b = ((com.bytedance.applog.c) com.bytedance.applog.a.e()).b(context, str, z, Level.L0);
        l.e(b, "getInstance().addNetComm…xt, str, isApi, Level.L0)");
        return b;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void s(boolean z) {
        this.f2050d = z;
        b bVar = b.a;
        b.c(z);
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void start() {
        com.bytedance.applog.a.t();
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void stop() {
        com.bytedance.applog.a.u();
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppLog
    public void t(String str, JSONObject jSONObject) {
        l.f(str, NotificationCompat.CATEGORY_EVENT);
        l.f(jSONObject, "jsonParams");
        if (this.f2050d && this.b && this.f2049c) {
            com.bytedance.applog.a.r("cur_app_name", IAppGlobals.a.H());
            jSONObject.put("growth_deepevent", 1);
            com.bytedance.applog.a.n(str, jSONObject);
        }
    }
}
