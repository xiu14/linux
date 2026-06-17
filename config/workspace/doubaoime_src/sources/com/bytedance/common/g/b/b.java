package com.bytedance.common.g.b;

import android.app.Application;
import android.util.Log;
import com.bytedance.common.push.e.h;
import com.bytedance.push.g0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    private volatile com.bytedance.common.model.c a;
    private com.bytedance.common.model.c b = new com.bytedance.common.model.c();

    /* renamed from: c, reason: collision with root package name */
    private final List<Runnable> f4140c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private long f4141d = System.currentTimeMillis();

    private com.bytedance.common.model.c a() {
        h hVar;
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null && (hVar = (h) com.ss.android.ug.bus.b.a(h.class)) != null) {
                    this.a = hVar.q();
                }
            }
        }
        return this.a;
    }

    public long b() {
        return this.f4141d;
    }

    public com.bytedance.common.model.c c() {
        Application a;
        if (a() != null) {
            return a();
        }
        if (this.b.a == null && (a = com.ss.android.message.a.a()) != null) {
            StringBuilder M = e.a.a.a.a.M("[getPushCommonConfiguration]use mDefaultPushCommonConfiguration because mPushCommonConfiguration is null and app is not null,stack is ");
            M.append(Log.getStackTraceString(new Throwable()));
            f.m("PushConfigurationService", M.toString());
            this.b.a = a;
        }
        com.bytedance.push.helper.b.a(new Throwable(), "error when getPushCommonConfiguration,mPushCommonConfiguration is null");
        return this.b;
    }

    public void d(com.bytedance.common.model.c cVar) {
        this.a = cVar;
        f.c("", "on init,try execute AfterInitTask");
        synchronized (this.f4140c) {
            f.c("", "sRunAfterSmpInitTask.size is " + this.f4140c.size());
            Iterator<Runnable> it2 = this.f4140c.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
            this.f4140c.clear();
        }
    }

    public boolean e() {
        if (com.ss.android.message.f.a.t(a().a)) {
            return !a().o.optMainProcessInitTimeCost();
        }
        return true;
    }

    public boolean f() {
        if (com.ss.android.message.f.a.t(a().a)) {
            return !a().o.optMainProcessInitTimeCostV2();
        }
        return true;
    }
}
