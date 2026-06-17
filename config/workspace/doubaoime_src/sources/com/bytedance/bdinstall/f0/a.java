package com.bytedance.bdinstall.f0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.bdinstall.f0.b;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks, b {
    private int a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3983c;

    /* renamed from: d, reason: collision with root package name */
    private b.a f3984d;

    public boolean a() {
        return this.f3983c;
    }

    public boolean b() {
        return this.b;
    }

    public void c(b.a aVar) {
        this.f3984d = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.a - 1;
        this.a = i;
        if (i <= 0) {
            this.b = false;
        }
        if (i < 0) {
            this.a = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.a < 0) {
            this.a = 0;
        }
        int i = this.a;
        if (i == 0) {
            this.b = true;
        }
        this.a = i + 1;
        this.f3983c = true;
        b.a aVar = this.f3984d;
        if (aVar != null) {
            aVar.onResume();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
