package e.b.b.h;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import e.b.b.m.g.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks, e.b.b.m.g.a {
    private final ArrayList<c> a = new ArrayList<>();
    private WeakReference<Activity> b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9450c;

    /* renamed from: d, reason: collision with root package name */
    private int f9451d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f9452e;

    public a() {
        Application a = e.b.b.n.a.a();
        a.unregisterActivityLifecycleCallbacks(this);
        a.registerActivityLifecycleCallbacks(this);
    }

    private Object[] d() {
        Object[] array;
        synchronized (this.a) {
            array = this.a.size() > 0 ? this.a.toArray() : null;
        }
        return array == null ? new Object[0] : array;
    }

    @Override // e.b.b.m.g.a
    public void a(c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (this.a) {
            this.a.remove(cVar);
        }
    }

    @Override // e.b.b.m.g.a
    public void b(c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (this.a) {
            this.a.add(cVar);
        }
    }

    @Override // e.b.b.m.g.a
    public String c() {
        Activity activity;
        WeakReference<Activity> weakReference = this.b;
        return (weakReference == null || (activity = weakReference.get()) == null) ? "" : activity.getClass().getCanonicalName();
    }

    @Override // e.b.b.m.g.a
    public boolean isForeground() {
        return this.f9452e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : d()) {
            ((c) obj).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        for (Object obj : d()) {
            ((c) obj).onActivityPause(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.b = new WeakReference<>(activity);
        for (Object obj : d()) {
            ((c) obj).onActivityResume(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        for (Object obj : d()) {
            ((c) obj).onActivityStarted(activity);
        }
        if (this.f9450c) {
            this.f9450c = false;
            return;
        }
        int i = this.f9451d + 1;
        this.f9451d = i;
        if (i == 1) {
            this.f9452e = true;
            for (Object obj2 : d()) {
                ((c) obj2).onFront(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f9450c = true;
            return;
        }
        int i = this.f9451d - 1;
        this.f9451d = i;
        if (i == 0) {
            this.f9452e = false;
            for (Object obj : d()) {
                ((c) obj).onBackground(activity);
            }
        }
    }
}
