package com.bytedance.frameworks.baselib.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static WeakHandler f5018c = new WeakHandler(Looper.getMainLooper(), new a());
    private List<AbstractC0248b> a = new CopyOnWriteArrayList();

    class a implements WeakHandler.IHandler {
        a() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
        }
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
    public b() {
        /*
            r6 = this;
            r6.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r6.a = r0
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
            com.bytedance.frameworks.baselib.network.b.b = r1
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.b.<init>():void");
    }

    public void c(AbstractC0248b abstractC0248b) {
        this.a.add(abstractC0248b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (b) {
            Iterator<AbstractC0248b> it2 = this.a.iterator();
            while (it2.hasNext()) {
                f5018c.postDelayed(it2.next().a(), r0.b());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!b) {
            b = true;
            Iterator<AbstractC0248b> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().d();
            }
        }
        f5018c.removeCallbacksAndMessages(null);
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

    /* renamed from: com.bytedance.frameworks.baselib.network.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0248b {
        private int a;
        private Runnable b;

        /* renamed from: com.bytedance.frameworks.baselib.network.b$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.b) {
                    boolean unused = b.b = false;
                    AbstractC0248b.this.c();
                }
            }
        }

        public AbstractC0248b() {
            this.a = 30000;
            this.b = new a();
        }

        public Runnable a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public abstract void c();

        public abstract void d();

        public void e(int i) {
            this.a = i;
        }

        public AbstractC0248b(int i) {
            this.a = 30000;
            this.b = new a();
            this.a = i;
        }
    }
}
