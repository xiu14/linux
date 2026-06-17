package com.bytedance.apm6.cpu.collect;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.Log;
import com.bytedance.apm6.cpu.CgroupFetcher;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a {
    private AtomicBoolean a = new AtomicBoolean(false);
    private e b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.apm6.cpu.collect.b f3663c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f3664d;

    /* renamed from: e, reason: collision with root package name */
    private e.b.b.m.g.a f3665e;

    /* renamed from: f, reason: collision with root package name */
    private e.b.o.a.a.b f3666f;

    /* renamed from: com.bytedance.apm6.cpu.collect.a$a, reason: collision with other inner class name */
    class C0137a extends com.bytedance.apm6.util.timetask.a {
        C0137a(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c();
        }
    }

    class b implements e.b.b.m.g.c {
        b() {
        }

        @Override // e.b.b.m.g.c
        public void a(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onActivityPause(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onActivityResume(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onActivityStarted(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onBackground(Activity activity) {
            a.this.f3664d.edit().putString(e.b.b.h.c.a.k(), Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SP + false).apply();
        }

        @Override // e.b.b.m.g.c
        public void onFront(Activity activity) {
            a.this.f3664d.edit().putString(e.b.b.h.c.a.k(), Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SP + true).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        private static final a a = new a(null);
    }

    a(C0137a c0137a) {
        try {
            Context h = com.bytedance.apm.g.h();
            this.f3666f = h == null ? null : e.b.o.a.b.a.e(h);
        } catch (Throwable unused) {
        }
        com.bytedance.apm6.cpu.collect.b bVar = new com.bytedance.apm6.cpu.collect.b(this.f3666f);
        this.f3663c = bVar;
        this.b = new e(bVar, this.f3666f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f3664d
            java.util.Map r0 = r0.getAll()
            if (r0 == 0) goto La8
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = ","
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L10
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r4.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L10
            r4.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "/stat"
            r4.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L10
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            java.lang.String r4 = ""
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L68
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L68
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L68
            r3 = 100
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L67
            r5.close()     // Catch: java.lang.Throwable -> L10
            goto L6d
        L67:
            r1 = r5
        L68:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Throwable -> L10
        L6d:
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L81
            android.content.SharedPreferences r1 = r7.f3664d     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L10
            r1.apply()     // Catch: java.lang.Throwable -> L10
            goto L10
        L81:
            java.lang.String r1 = " "
            java.lang.String[] r1 = r4.split(r1)     // Catch: java.lang.Throwable -> L10
            r3 = 1
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L10
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L10
            int r4 = r4 - r3
            java.lang.String r1 = r1.substring(r3, r4)     // Catch: java.lang.Throwable -> L10
            boolean r1 = r2.endsWith(r1)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L10
            android.content.SharedPreferences r1 = r7.f3664d     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L10
            r1.apply()     // Catch: java.lang.Throwable -> L10
            goto L10
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.cpu.collect.a.c():void");
    }

    public static a d() {
        return c.a;
    }

    public void e() {
        if (this.a.compareAndSet(false, true)) {
            this.f3665e = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
            this.f3664d = com.bytedance.apm.core.e.e(e.b.b.n.a.a(), "apm_cpu_front");
            if (e.b.b.h.c.a.y()) {
                c();
                com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).c(new C0137a(300000L, 300000L));
            }
            this.f3664d.edit().putString(e.b.b.h.c.a.k(), Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f3665e.isForeground()).apply();
            this.f3665e.b(new b());
            e.b.b.m.c.a(com.bytedance.apm6.cpu.b.b.class);
        }
    }

    public boolean f() {
        boolean z;
        if (this.f3665e.isForeground()) {
            this.f3664d.edit().putString(e.b.b.h.c.a.k(), Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f3665e.isForeground()).apply();
            return true;
        }
        Map<String, ?> all = this.f3664d.getAll();
        if (all != null) {
            Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
            while (it2.hasNext()) {
                if (((String) it2.next().getValue()).split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1].equals("true")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        CgroupFetcher.CGROUP_LEVEL a = CgroupFetcher.a();
        return z || this.f3665e.isForeground() || a == CgroupFetcher.CGROUP_LEVEL.TOP_APP || a == CgroupFetcher.CGROUP_LEVEL.FOREGROUND;
    }

    public void g(com.bytedance.apm6.cpu.b.a aVar) {
        if (aVar == null) {
            return;
        }
        g.a();
        Log.i("APM-CPU", "config: " + aVar);
        if ((com.bytedance.apm.g.F() || aVar.f()) && aVar.g()) {
            this.b.h(aVar);
            this.f3663c.h(aVar);
        }
    }
}
