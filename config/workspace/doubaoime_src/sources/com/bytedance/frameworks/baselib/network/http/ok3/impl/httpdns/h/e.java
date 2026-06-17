package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5181c;

    /* renamed from: d, reason: collision with root package name */
    private static WeakHandler f5182d = new WeakHandler(Looper.getMainLooper(), new a());
    private c a;
    private Runnable b = new b();

    class a implements WeakHandler.IHandler {
        a() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.f5181c) {
                boolean unused = e.f5181c = false;
                if (e.this.a != null) {
                    Objects.requireNonNull((com.bytedance.frameworks.baselib.network.http.ok3.impl.e) e.this.a);
                }
            }
        }
    }

    public interface c {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r2 = r4.getDeclaredField("activity");
        r2.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r0 = (android.app.Activity) r2.get(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r6 = this;
            r6.<init>()
            com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.e$b r0 = new com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.e$b
            r0.<init>()
            r6.b = r0
            r0 = 0
            r1 = 1
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "currentActivityThread"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r3 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.invoke(r0, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "mActivities"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L69
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto L33
            goto L6d
        L33:
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L69
        L3b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "paused"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L69
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L69
            boolean r5 = r5.getBoolean(r3)     // Catch: java.lang.Throwable -> L69
            if (r5 != 0) goto L3b
            java.lang.String r2 = "activity"
            java.lang.reflect.Field r2 = r4.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L69
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L69
            r0 = r2
            goto L6d
        L69:
            r2 = move-exception
            r2.printStackTrace()
        L6d:
            if (r0 == 0) goto L71
            com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.e.f5181c = r1
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.e.<init>():void");
    }

    public void d(c cVar) {
        this.a = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (f5181c) {
            f5182d.postDelayed(this.b, 30000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!f5181c) {
            f5181c = true;
            c cVar = this.a;
            if (cVar != null) {
                Objects.requireNonNull((com.bytedance.frameworks.baselib.network.http.ok3.impl.e) cVar);
                com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c.n().s();
            }
        }
        f5182d.removeCallbacks(this.b);
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
