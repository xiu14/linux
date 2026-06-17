package com.bytedance.dataplatform;

import android.app.Application;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class l implements Runnable {
    final /* synthetic */ Application a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f4738c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f4739d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p f4740e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.bytedance.common.a.b f4741f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f4742g;

    l(Application application, String str, boolean z, q qVar, p pVar, com.bytedance.common.a.b bVar, r rVar) {
        this.a = application;
        this.b = str;
        this.f4738c = z;
        this.f4739d = qVar;
        this.f4740e = pVar;
        this.f4741f = bVar;
        this.f4742g = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set set;
        Application application = this.a;
        String str = this.b;
        boolean z = this.f4738c;
        q qVar = this.f4739d;
        p pVar = this.f4740e;
        com.bytedance.common.a.b bVar = this.f4741f;
        Map map = m.i;
        set = m.j;
        j unused = m.b = new j(application, str, z, qVar, pVar, bVar, map, set);
        r unused2 = m.a = this.f4742g;
        n.d(this.a, this.f4742g, this.f4739d, m.b);
        int i = m.m;
    }
}
