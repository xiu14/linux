package com.bytedance.common.push;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.push.notification.BaseBannerActivity;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.g0.f;
import com.bytedance.push.g0.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

/* loaded from: classes.dex */
public class b extends Observable implements Application.ActivityLifecycleCallbacks {
    private static final k<b> l = new a();
    private static final List<String> m = Arrays.asList("GifPermissionBootActivity", "GifPermissionDynamicActivity", "GifPermissionToastActivity");
    private static volatile boolean n = true;
    private WeakReference<Activity> a;
    private boolean b;

    /* renamed from: d, reason: collision with root package name */
    private int f4162d;

    /* renamed from: e, reason: collision with root package name */
    private long f4163e;

    /* renamed from: g, reason: collision with root package name */
    private String f4165g;
    private Rect j;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f4161c = new RunnableC0173b();

    /* renamed from: f, reason: collision with root package name */
    private List<Long> f4164f = new ArrayList();
    private final WeakHandler h = new WeakHandler(new c(this));
    private final List<Application.ActivityLifecycleCallbacks> i = new ArrayList();
    private final List<Runnable> k = new ArrayList();

    static class a extends k<b> {
        a() {
        }

        @Override // com.bytedance.push.g0.k
        protected b e(Object[] objArr) {
            return new b(null);
        }
    }

    /* renamed from: com.bytedance.common.push.b$b, reason: collision with other inner class name */
    class RunnableC0173b implements Runnable {
        RunnableC0173b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.b) {
                b.this.b = false;
                f.c("ActivityLifecycleObserver", "sAppAlive = false");
            }
        }
    }

    class c implements WeakHandler.IHandler {
        c(b bVar) {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
        }
    }

    private b() {
    }

    private Object[] d() {
        Object[] array;
        synchronized (this.i) {
            array = this.i.size() > 0 ? this.i.toArray() : null;
        }
        return array;
    }

    public static b e() {
        return l.f(new Object[0]);
    }

    public void c(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (activityLifecycleCallbacks == null) {
            return;
        }
        synchronized (this.i) {
            if (this.i.contains(activityLifecycleCallbacks)) {
                return;
            }
            this.i.add(activityLifecycleCallbacks);
        }
    }

    public long f() {
        return this.f4163e;
    }

    public Rect g() {
        return this.j;
    }

    public Activity h() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return n;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] d2 = d();
        if (d2 != null) {
            for (Object obj : d2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        StringBuilder M = e.a.a.a.a.M("onActivityDestroyed:");
        M.append(activity.getClass().getName());
        f.c("ActivityLifecycleObserver", M.toString());
        Object[] d2 = d();
        if (d2 != null) {
            for (Object obj : d2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (f.d()) {
            StringBuilder M = e.a.a.a.a.M("onActivityPaused:");
            M.append(activity.getClass().getName());
            f.c("ActivityLifecycleObserver", M.toString());
        }
        Object[] d2 = d();
        if (d2 != null) {
            for (Object obj : d2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        StringBuilder M = e.a.a.a.a.M("onActivityResumed:");
        M.append(activity.getClass().getName());
        f.c("ActivityLifecycleObserver", M.toString());
        this.a = new WeakReference<>(activity);
        Object[] d2 = d();
        if (d2 != null) {
            for (Object obj : d2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] d2 = d();
        if (d2 != null) {
            for (Object obj : d2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (f.d()) {
            StringBuilder M = e.a.a.a.a.M("onActivityStarted:");
            M.append(activity.getClass().getName());
            f.c("ActivityLifecycleObserver", M.toString());
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            Rect sourceBounds = intent.getSourceBounds();
            if (f.d()) {
                f.c("ActivityLifecycleObserver", "[onActivityStarted]sourceBounds:" + sourceBounds);
            }
            if (sourceBounds != null) {
                this.j = sourceBounds;
            }
        }
        Object[] d2 = d();
        if (d2 != null) {
            for (Object obj : d2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        if (activity instanceof BaseBannerActivity) {
            f.c("ActivityLifecycleObserver", "on banner ActivityStarted,ignore");
            return;
        }
        StringBuilder M2 = e.a.a.a.a.M("activityWhitList: ");
        M2.append(activity.getClass().getSimpleName());
        f.c("ActivityLifecycleObserver", M2.toString());
        if (m.contains(activity.getClass().getSimpleName())) {
            return;
        }
        if (this.f4162d < 0) {
            this.f4162d = 0;
        }
        if (this.f4162d == 0) {
            StringBuilder M3 = e.a.a.a.a.M("[onEnterForeground]runnableNeedExecuteAfterAppLaunch size:");
            M3.append(this.k.size());
            f.c("ActivityLifecycleObserver", M3.toString());
            n = false;
            this.f4163e = System.currentTimeMillis();
            com.bytedance.push.K.a.d().h();
            setChanged();
            notifyObservers(Boolean.valueOf(n));
            if (this.k.size() > 0) {
                synchronized (this.k) {
                    Iterator<Runnable> it2 = this.k.iterator();
                    while (it2.hasNext()) {
                        it2.next().run();
                    }
                    this.k.clear();
                }
            }
        }
        this.f4162d++;
        if (!this.b) {
            this.b = true;
            f.c("ActivityLifecycleObserver", "onResume sAppAlive = true");
        }
        this.h.removeCallbacks(this.f4161c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        StringBuilder M = e.a.a.a.a.M("onActivityStopped:");
        M.append(activity.getClass().getName());
        f.c("ActivityLifecycleObserver", M.toString());
        if (this.b) {
            this.h.postDelayed(this.f4161c, 30000L);
        }
        Object[] d2 = d();
        if (d2 != null) {
            for (Object obj : d2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        StringBuilder M2 = e.a.a.a.a.M("activityWhitList: ");
        M2.append(activity.getClass().getSimpleName());
        f.c("ActivityLifecycleObserver", M2.toString());
        if (m.contains(activity.getClass().getSimpleName())) {
            return;
        }
        this.f4165g = activity.getClass().getCanonicalName();
        e.a.a.a.a.J0(e.a.a.a.a.M("update sLastStoppedActivityName to "), this.f4165g, "ActivityLifecycleObserver");
        int i = this.f4162d - 1;
        this.f4162d = i;
        if (i <= 0) {
            f.c("ActivityLifecycleObserver", "onEnterBackground");
            n = true;
            com.bytedance.push.K.a.d().g();
            setChanged();
            notifyObservers(Boolean.valueOf(n));
            this.f4164f.add(Long.valueOf(System.currentTimeMillis()));
        }
        if (this.f4162d < 0) {
            this.f4162d = 0;
        }
    }

    b(a aVar) {
    }
}
