package com.bytedance.applog.collector;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.B.i;
import com.bytedance.applog.c;
import com.bytedance.applog.w.e;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private i b;

    /* renamed from: c, reason: collision with root package name */
    private long f3775c;

    /* renamed from: d, reason: collision with root package name */
    private String f3776d;

    /* renamed from: f, reason: collision with root package name */
    private final c f3778f;
    private int a = 0;

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<Integer> f3777e = new HashSet<>(8);

    /* renamed from: g, reason: collision with root package name */
    private boolean f3779g = false;

    public a(c cVar) {
        this.f3778f = cVar;
    }

    public i a() {
        return this.b;
    }

    public void b(String str, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f3778f.I().h("onActivityResumed: {}", str);
        i iVar = this.b;
        String str2 = this.f3776d;
        i iVar2 = new i();
        if (TextUtils.isEmpty("")) {
            iVar2.y = str;
        } else {
            iVar2.y = e.a.a.a.a.t(str, Constants.COLON_SEPARATOR, "");
        }
        iVar2.u(currentTimeMillis);
        iVar2.w = -1L;
        if (str2 == null) {
            str2 = "";
        }
        iVar2.x = str2;
        this.f3778f.s0(iVar2);
        this.b = iVar2;
        iVar2.z = !this.f3777e.remove(Integer.valueOf(i)) ? 1 : 0;
        this.f3779g = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f3777e.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f3777e.remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        e I = this.f3778f.I();
        Object[] objArr = new Object[1];
        objArr[0] = activity != null ? activity.getClass().getName() : "";
        I.h("onActivityPaused:{}", objArr);
        i iVar = this.b;
        if (iVar != null) {
            this.f3776d = iVar.y;
            this.f3775c = currentTimeMillis;
            i iVar2 = (i) iVar.clone();
            iVar2.u(currentTimeMillis);
            long j = currentTimeMillis - iVar.b;
            if (j <= 0) {
                j = 1000;
            }
            iVar2.w = j;
            this.f3778f.s0(iVar2);
            this.b = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(activity.getClass().getName(), activity.hashCode());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f3776d != null) {
            int i = this.a - 1;
            this.a = i;
            if (i <= 0) {
                this.f3776d = null;
                this.f3775c = 0L;
            }
        }
    }
}
