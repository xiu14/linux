package com.huawei.hms.support.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import e.a.a.a.a;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = new ActivityMgr();
    private WeakReference<Activity> a;

    private ActivityMgr() {
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public Activity getCurrentActivity() {
        if (this.a == null) {
            StringBuilder M = a.M("mCurrentActivity is ");
            M.append(this.a);
            HMSLog.i("ActivityMgr", M.toString());
            return null;
        }
        StringBuilder M2 = a.M("mCurrentActivity.get() is ");
        M2.append(this.a.get());
        HMSLog.i("ActivityMgr", M2.toString());
        return this.a.get();
    }

    public void init(Application application) {
        HMSLog.d("ActivityMgr", "init");
        if (application == null) {
            HMSLog.w("ActivityMgr", "init failed for app is null");
            return;
        }
        ActivityMgr activityMgr = INST;
        application.unregisterActivityLifecycleCallbacks(activityMgr);
        application.registerActivityLifecycleCallbacks(activityMgr);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        StringBuilder M = a.M("onCreated:");
        M.append(a(activity));
        HMSLog.d("ActivityMgr", M.toString());
        this.a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        StringBuilder M = a.M("onResumed:");
        M.append(a(activity));
        HMSLog.d("ActivityMgr", M.toString());
        this.a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        StringBuilder M = a.M("onStarted:");
        M.append(a(activity));
        HMSLog.d("ActivityMgr", M.toString());
        this.a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
