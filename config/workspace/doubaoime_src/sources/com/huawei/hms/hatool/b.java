package com.huawei.hms.hatool;

import android.content.Context;

/* loaded from: classes2.dex */
public class b {
    s0 a;
    s0 b;

    /* renamed from: c, reason: collision with root package name */
    Context f7329c;

    /* renamed from: d, reason: collision with root package name */
    String f7330d;

    public b(Context context) {
        if (context != null) {
            this.f7329c = context.getApplicationContext();
        }
        this.a = new s0();
        this.b = new s0();
    }

    public b a(int i, String str) {
        s0 s0Var;
        v.a("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
        if (!p1.b(str)) {
            str = "";
        }
        if (i == 0) {
            s0Var = this.a;
        } else {
            if (i != 1) {
                v.f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
                return this;
            }
            s0Var = this.b;
        }
        s0Var.b(str);
        return this;
    }

    public b a(String str) {
        v.a("hmsSdk", "Builder.setAppID is execute");
        this.f7330d = str;
        return this;
    }

    @Deprecated
    public b a(boolean z) {
        v.a("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.a.j().a(z);
        this.b.j().a(z);
        return this;
    }

    public void a() {
        if (this.f7329c == null) {
            v.b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        v.a("hmsSdk", "Builder.create() is execute.");
        z0 z0Var = new z0("_hms_config_tag");
        z0Var.b(new s0(this.a));
        z0Var.a(new s0(this.b));
        m.a().a(this.f7329c);
        g0.a().a(this.f7329c);
        q.c().a(z0Var);
        m.a().a(this.f7330d);
    }

    @Deprecated
    public b b(boolean z) {
        v.a("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.a.j().b(z);
        this.b.j().b(z);
        return this;
    }

    @Deprecated
    public b c(boolean z) {
        v.a("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.a.j().c(z);
        this.b.j().c(z);
        return this;
    }
}
