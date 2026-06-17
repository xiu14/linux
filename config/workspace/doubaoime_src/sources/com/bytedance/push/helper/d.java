package com.bytedance.push.helper;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.push.g0.f;
import com.bytedance.push.g0.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/* loaded from: classes2.dex */
public class d extends Observable implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    private static final k<d> f5724d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f5725e = true;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5726f = false;
    private final List<Application.ActivityLifecycleCallbacks> a = new ArrayList();
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f5727c;

    static class a extends k<d> {
        a() {
        }

        @Override // com.bytedance.push.g0.k
        protected d e(Object[] objArr) {
            return new d();
        }
    }

    public d() {
        f5725e = com.bytedance.common.push.b.e().j();
        Activity h = com.bytedance.common.push.b.e().h();
        if (h != null) {
            this.f5727c = new WeakReference<>(h);
        }
        com.bytedance.common.push.b.e().c(this);
    }

    private Object[] b() {
        Object[] array;
        synchronized (this.a) {
            array = this.a.size() > 0 ? this.a.toArray() : null;
        }
        return array;
    }

    public static d c() {
        return f5724d.f(new Object[0]);
    }

    public void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        synchronized (this.a) {
            if (this.a.contains(activityLifecycleCallbacks)) {
                return;
            }
            this.a.add(activityLifecycleCallbacks);
        }
    }

    public boolean d() {
        return f5726f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        StringBuilder M = e.a.a.a.a.M("onActivityPaused:");
        M.append(activity.getClass().getName());
        f.c("SysDialogActivityLifecycleObserver", M.toString());
        if (activity.getClass().getName().contains("tSysActivity") || activity.getClass().getName().contains("BSysActivity")) {
            return;
        }
        int i = this.b - 1;
        this.b = i;
        if (i <= 0) {
            StringBuilder M2 = e.a.a.a.a.M("onEnterBackground,topActivity:");
            WeakReference<Activity> weakReference = this.f5727c;
            M2.append(weakReference != null ? weakReference.get() : null);
            f.c("SysDialogActivityLifecycleObserver", M2.toString());
            f5725e = true;
            setChanged();
            notifyObservers(Boolean.valueOf(f5725e));
        }
        if (this.b < 0) {
            this.b = 0;
        }
        Object[] b = b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (f.d()) {
            StringBuilder M = e.a.a.a.a.M("onActivityResumed:");
            M.append(activity.getClass().getName());
            f.c("SysDialogActivityLifecycleObserver", M.toString());
        }
        if (activity.getClass().getName().contains("tSysActivity") || activity.getClass().getName().contains("BSysActivity")) {
            return;
        }
        if (this.b < 0) {
            this.b = 0;
        }
        this.f5727c = new WeakReference<>(activity);
        if (this.b == 0) {
            StringBuilder M2 = e.a.a.a.a.M("onEnterForeground,topActivity:");
            WeakReference<Activity> weakReference = this.f5727c;
            M2.append(weakReference != null ? weakReference.get() : null);
            f.c("SysDialogActivityLifecycleObserver", M2.toString());
            f5725e = false;
            f5726f = true;
            setChanged();
            notifyObservers(Boolean.valueOf(f5725e));
        }
        this.b++;
        Object[] b = b();
        if (b != null) {
            for (Object obj : b) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
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
