package com.ss.alive.monitor.m;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.alive.monitor.f;
import com.ss.alive.monitor.g;
import com.ss.alive.monitor.h.b;
import java.io.File;

/* loaded from: classes2.dex */
public class a {
    private final Application a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private C0367a f8259c;

    /* renamed from: d, reason: collision with root package name */
    private File f8260d;

    /* renamed from: com.ss.alive.monitor.m.a$a, reason: collision with other inner class name */
    private class C0367a implements Application.ActivityLifecycleCallbacks {
        private final Application a;
        private f b;

        /* renamed from: com.ss.alive.monitor.m.a$a$a, reason: collision with other inner class name */
        class RunnableC0368a implements Runnable {
            final /* synthetic */ b a;

            RunnableC0368a(b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.ss.alive.monitor.h.a.a(C0367a.this.a).c(this.a);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        C0367a(Application application) {
            this.a = application;
        }

        void b(f fVar) {
            this.b = fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        
            if (r4.f8261c.f8260d.createNewFile() != false) goto L21;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
            /*
                r4 = this;
                java.lang.String r6 = com.ss.alive.monitor.m.a.c(r5)
                boolean r0 = com.bytedance.common.utility.Logger.debug()
                if (r0 == 0) goto L2c
                java.lang.String r0 = "startActivity = "
                java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
                android.content.ComponentName r1 = r5.getComponentName()
                java.lang.String r1 = r1.getClassName()
                r0.append(r1)
                java.lang.String r1 = ", referrer = "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ActivityAliveTracker"
                com.bytedance.common.utility.Logger.d(r1, r0)
            L2c:
                com.ss.alive.monitor.f r0 = r4.b
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L42
                boolean r0 = com.ss.alive.monitor.m.a.a(r6, r5)
                if (r0 == 0) goto L3d
                com.ss.alive.monitor.f r0 = r4.b
                r0.a(r6)
            L3d:
                r0 = 0
                r4.b = r0
                r0 = r1
                goto L43
            L42:
                r0 = r2
            L43:
                boolean r3 = com.ss.alive.monitor.util.a.b(r5)
                if (r3 == 0) goto L4a
                return
            L4a:
                com.ss.alive.monitor.m.a r3 = com.ss.alive.monitor.m.a.this     // Catch: java.lang.Exception -> L66
                java.io.File r3 = com.ss.alive.monitor.m.a.b(r3)     // Catch: java.lang.Exception -> L66
                boolean r3 = r3.exists()     // Catch: java.lang.Exception -> L66
                if (r3 != 0) goto L63
                com.ss.alive.monitor.m.a r3 = com.ss.alive.monitor.m.a.this     // Catch: java.lang.Exception -> L66
                java.io.File r3 = com.ss.alive.monitor.m.a.b(r3)     // Catch: java.lang.Exception -> L66
                boolean r3 = r3.createNewFile()     // Catch: java.lang.Exception -> L66
                if (r3 == 0) goto L63
                goto L64
            L63:
                r1 = r2
            L64:
                r2 = r1
                goto L6a
            L66:
                r1 = move-exception
                r1.printStackTrace()
            L6a:
                if (r0 == 0) goto L72
                android.app.Application r5 = r4.a
                r5.unregisterActivityLifecycleCallbacks(r4)
                return
            L72:
                if (r2 == 0) goto Lbf
                com.ss.alive.monitor.g r0 = new com.ss.alive.monitor.g
                r0.<init>()
                long r1 = com.ss.android.message.f.a.f()
                r0.a = r1
                android.content.Intent r1 = r5.getIntent()
                r0.f8251f = r1
                r0.f8252g = r6
                java.lang.String r6 = com.ss.android.message.f.a.h(r5)
                r0.b = r6
                int r5 = com.ss.alive.monitor.util.a.a(r5)
                r0.h = r5
                r5 = 4
                r0.f8250e = r5
                android.app.Application r5 = r4.a
                com.ss.alive.monitor.e r5 = com.ss.alive.monitor.e.a(r5)
                com.ss.alive.monitor.e$a r5 = r5.b()
                boolean r5 = r5.a
                if (r5 == 0) goto Lbf
                com.ss.alive.monitor.h.b r5 = new com.ss.alive.monitor.h.b
                r5.<init>()
                org.json.JSONObject r6 = r0.a()
                java.lang.String r6 = r6.toString()
                r5.b = r6
                r0 = -1
                r5.f8255c = r0
                com.ss.alive.monitor.m.a$a$a r6 = new com.ss.alive.monitor.m.a$a$a
                r6.<init>(r5)
                com.bytedance.common.push.d.b(r6)
            Lbf:
                android.app.Application r5 = r4.a
                r5.unregisterActivityLifecycleCallbacks(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.m.a.C0367a.onActivityCreated(android.app.Activity, android.os.Bundle):void");
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
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public a(Application application, boolean z) {
        this.a = application;
        this.b = z;
        this.f8260d = new File(application.getFilesDir(), "process_activity.lock");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String c(android.app.Activity r2) {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mReferrer"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.NoSuchFieldException -> L18
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.NoSuchFieldException -> L18
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.NoSuchFieldException -> L18
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IllegalAccessException -> L13 java.lang.NoSuchFieldException -> L18
            goto L1d
        L13:
            r0 = move-exception
            r0.printStackTrace()
            goto L1c
        L18:
            r0 = move-exception
            r0.printStackTrace()
        L1c:
            r0 = 0
        L1d:
            boolean r1 = d(r0, r2)
            if (r1 != 0) goto L2d
            android.net.Uri r1 = r2.getReferrer()
            if (r1 == 0) goto L2d
            java.lang.String r0 = r1.getHost()
        L2d:
            boolean r1 = d(r0, r2)
            if (r1 != 0) goto L37
            java.lang.String r0 = r2.getCallingPackage()
        L37:
            boolean r1 = d(r0, r2)
            if (r1 != 0) goto L4e
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L4a
            int r1 = android.os.Binder.getCallingUid()     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = r2.getNameForUid(r1)     // Catch: java.lang.Exception -> L4a
            goto L4e
        L4a:
            r2 = move-exception
            r2.printStackTrace()
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.m.a.c(android.app.Activity):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str, Activity activity) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, activity.getPackageName())) ? false : true;
    }

    public void e() {
        if (this.b) {
            try {
                this.f8260d.delete();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Application application = this.a;
        C0367a c0367a = new C0367a(application);
        this.f8259c = c0367a;
        application.registerActivityLifecycleCallbacks(c0367a);
    }

    public void f(g gVar, f fVar) {
        if (gVar == null) {
            return;
        }
        this.f8259c.b(fVar);
    }
}
