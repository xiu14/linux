package com.ss.android.ugc.quota.f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements b {
    private int a = 0;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8417c = true;

    /* renamed from: d, reason: collision with root package name */
    private int f8418d = -999;

    /* renamed from: com.ss.android.ugc.quota.f.a$a, reason: collision with other inner class name */
    class C0387a implements Application.ActivityLifecycleCallbacks {
        C0387a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v3 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ?? r5 = bundle != null ? 1 : 0;
            Log.d("BDNetworkLaunchMonitor", "onActivityCreated, Activity:" + activity + ",firstLaunch:" + a.this.f8417c + ",restore:" + ((boolean) r5));
            if (a.this.f8417c) {
                a.this.f8417c = false;
                a.d(a.this, r5);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.e(a.this, "onActivityStarted enter", activity);
            a.g(a.this);
            if (a.this.a == 1) {
                if (a.this.b) {
                    a.d(a.this, 2);
                }
                a.this.b = false;
            }
            a.e(a.this, "onActivityStarted exit", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.e(a.this, "onActivityStopped enter", activity);
            a.h(a.this);
            if (a.this.a == 0) {
                a.this.b = true;
            }
            a.e(a.this, "onActivityStopped exit", activity);
        }
    }

    public a(Application application) {
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C0387a());
    }

    static void d(a aVar, int i) {
        if (aVar.f8418d == i) {
            return;
        }
        e.a.a.a.a.i0("Current launch type is ", i, "BDNetworkLaunchMonitor");
        aVar.f8418d = i;
        com.ss.android.ugc.quota.b.g().i(i);
    }

    static void e(a aVar, String str, Activity activity) {
        Objects.requireNonNull(aVar);
        Log.d("BDNetworkLaunchMonitor", str + ", Activity:" + activity + ",fgActivityCount: " + aVar.a + ",appInBackground: " + aVar.b);
    }

    static /* synthetic */ int g(a aVar) {
        int i = aVar.a;
        aVar.a = i + 1;
        return i;
    }

    static /* synthetic */ int h(a aVar) {
        int i = aVar.a;
        aVar.a = i - 1;
        return i;
    }

    @Override // com.ss.android.ugc.quota.f.b
    public int a() {
        return this.f8418d;
    }
}
