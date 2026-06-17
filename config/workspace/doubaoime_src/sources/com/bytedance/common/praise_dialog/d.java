package com.bytedance.common.praise_dialog;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    d() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.f(activity, "activity");
        e eVar = e.a;
        e.b.remove(activity);
        e.b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        l.f(activity, "activity");
        e eVar = e.a;
        e.b.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.f(activity, "activity");
        l.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        l.f(activity, "activity");
    }
}
