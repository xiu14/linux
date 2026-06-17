package com.bytedance.crash.L;

import android.os.Looper;
import android.os.Process;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.C0653h;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.LocaleInfo;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.jni.NativeBridge;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b {
    private static volatile boolean C;
    private final File a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4395c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4396d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4397e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f4398f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f4399g = new AtomicBoolean(false);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final AtomicBoolean m = new AtomicBoolean(false);
    private final AtomicBoolean n = new AtomicBoolean(false);
    private final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean p = new AtomicBoolean(false);
    private final AtomicBoolean q = new AtomicBoolean(false);
    private final AtomicBoolean r = new AtomicBoolean(false);
    private final AtomicBoolean s = new AtomicBoolean(false);
    private final AtomicBoolean t = new AtomicBoolean(false);
    private final AtomicBoolean u = new AtomicBoolean(false);
    private final AtomicBoolean v = new AtomicBoolean(false);
    private final AtomicBoolean w = new AtomicBoolean(false);
    private final AtomicBoolean x = new AtomicBoolean(false);
    private final AtomicBoolean y = new AtomicBoolean(false);
    private boolean z = false;
    private final AtomicBoolean A = new AtomicBoolean(false);
    private final AtomicBoolean B = new AtomicBoolean(false);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.k.compareAndSet(false, true)) {
                    com.bytedance.crash.U.c.d().c(b.this.a);
                }
            } catch (Throwable th) {
                com.bytedance.crash.Q.b.c("dumpLooperMessages", th);
            }
        }
    }

    /* renamed from: com.bytedance.crash.L.b$b, reason: collision with other inner class name */
    public static class C0193b {
        public static void a(File file, int i) {
            com.bytedance.crash.dumper.j.f fVar = new com.bytedance.crash.dumper.j.f(file.getAbsolutePath() + "/anr_config.txt");
            fVar.a('{');
            fVar.i("oom_adj");
            fVar.b(i);
            fVar.a(',');
            fVar.i("enable_upload_bg_anr");
            fVar.f(false);
            fVar.a(',');
            fVar.i("enable_new_anr");
            fVar.f(C0653h.c());
            long i2 = C0652g.i() - Process.getStartElapsedRealtime();
            fVar.a(',');
            fVar.i("init_sub_launch_time");
            fVar.c(i2);
            fVar.a('}');
            fVar.h();
        }
    }

    private b(File file, long j, boolean z) {
        this.a = file;
        this.b = j;
        this.f4395c = z;
        this.f4396d = NativeBridge.f(file.getAbsolutePath());
    }

    public static b c(File file, long j, boolean z) {
        return new b(file, j, z);
    }

    private void e(boolean z) {
        if (z) {
            com.bytedance.crash.runtime.b.d(new a());
            return;
        }
        try {
            if (this.k.compareAndSet(false, true)) {
                com.bytedance.crash.U.c.d().c(this.a);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.c("dumpLooperMessages", th);
        }
    }

    public static void f(boolean z) {
        C = z;
    }

    JSONArray d(int i) {
        com.bytedance.crash.dumper.e c2;
        com.bytedance.crash.monitor.a e2;
        if (j.f()) {
            return null;
        }
        try {
            if (this.f4397e.compareAndSet(false, true)) {
                q.b(this.a, this.b, this.f4395c);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.c("dumpSummary", th);
        }
        try {
            if (this.h.compareAndSet(false, true)) {
                com.bytedance.android.input.k.b.a.x(this.a);
            }
        } catch (Throwable th2) {
            com.bytedance.crash.Q.b.c("dumpAppVersion", th2);
        }
        try {
            if (this.j.compareAndSet(false, true)) {
                j.e(this.a, this.f4396d);
            }
        } catch (Throwable th3) {
            com.bytedance.crash.Q.b.c("dumpProfileInfo", th3);
        }
        e(true);
        try {
            if (this.B.compareAndSet(false, true) && (e2 = com.bytedance.crash.monitor.l.e()) != null) {
                Iterator<com.bytedance.crash.r> it2 = e2.j().B(CrashType.ANR).iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().a(CrashType.ANR, this.b);
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            if (j.g() && this.f4399g.compareAndSet(false, true)) {
                try {
                    com.bytedance.crash.util.a.x(com.bytedance.android.input.k.b.a.o(this.a, "main_stack.txt"), new com.bytedance.crash.dumper.f(Looper.getMainLooper().getThread().getStackTrace()).a(), false);
                } catch (Exception unused3) {
                }
                CrashType crashType = CrashType.ANR;
            }
        } catch (Throwable th4) {
            com.bytedance.crash.Q.b.c("dumpMainStack", th4);
        }
        if (j.g()) {
            try {
                if (this.l.compareAndSet(false, true)) {
                    NativeBridge.e(r.c(this.a).getAbsolutePath());
                }
            } catch (Throwable th5) {
                com.bytedance.crash.Q.b.c("dumpAnrTrace", th5);
            }
        }
        if (j.g()) {
            try {
                if (this.f4398f.compareAndSet(false, true) && i != Integer.MAX_VALUE) {
                    C0193b.a(this.a, i);
                }
            } catch (Throwable th6) {
                com.bytedance.crash.Q.b.c("dumpAdj", th6);
            }
            try {
                if (this.x.compareAndSet(false, true)) {
                    com.bytedance.crash.dumper.a.c(this.a);
                }
            } catch (Throwable th7) {
                com.bytedance.crash.Q.b.c("dumpCustomFile", th7);
            }
            e(false);
            if (!this.z) {
                NativeBridge.c(this.f4396d);
                this.z = true;
            }
            try {
                if (this.i.compareAndSet(false, true)) {
                    com.bytedance.android.input.k.b.a.y(this.a);
                }
            } catch (Throwable th8) {
                com.bytedance.crash.Q.b.c("dumpCommonParams", th8);
            }
            try {
                if (this.o.compareAndSet(false, true)) {
                    com.bytedance.crash.dumper.a.e(this.a);
                }
            } catch (Throwable th9) {
                com.bytedance.crash.Q.b.c("dumpMemoryInfo", th9);
            }
            try {
                if (this.m.compareAndSet(false, true)) {
                    LocaleInfo.dump(this.a);
                }
            } catch (Throwable th10) {
                com.bytedance.crash.Q.b.c("dumpLocaleInfo", th10);
            }
            try {
                if (this.n.compareAndSet(false, true)) {
                    com.bytedance.android.input.k.b.a.z(this.a);
                    com.bytedance.android.input.k.b.a.C(this.a);
                }
            } catch (Throwable th11) {
                com.bytedance.crash.Q.b.c("dumpCustomFilter", th11);
            }
            try {
                if (this.p.compareAndSet(false, true)) {
                    Scraps.dump(this.a);
                }
            } catch (Throwable th12) {
                com.bytedance.crash.Q.b.c("dumpScraps", th12);
            }
            try {
                if (this.q.compareAndSet(false, true)) {
                    com.bytedance.android.input.k.b.a.B(this.a);
                }
            } catch (Throwable th13) {
                com.bytedance.crash.Q.b.c("dumpSdkInfo", th13);
            }
            try {
                if (this.r.compareAndSet(false, true)) {
                    com.bytedance.crash.a0.a.u(this.a);
                }
            } catch (Throwable th14) {
                com.bytedance.crash.Q.b.c("dumpActivityLifecycle", th14);
            }
            try {
                if (this.s.compareAndSet(false, true)) {
                    com.bytedance.android.input.k.b.a.A(this.a);
                }
            } catch (Throwable th15) {
                com.bytedance.crash.Q.b.c("dumpGfxInfo", th15);
            }
            if (C) {
                try {
                    if (this.u.compareAndSet(false, true)) {
                        com.bytedance.crash.dumper.a.f(this.a);
                    }
                } catch (Throwable th16) {
                    com.bytedance.crash.Q.b.c("dumpViewTree", th16);
                }
            }
            try {
                if (com.bytedance.crash.monitor.l.e() != null && (c2 = com.bytedance.crash.monitor.l.e().c()) != null && this.A.compareAndSet(false, true)) {
                    c2.a(this.a);
                }
            } catch (Throwable unused4) {
            }
            try {
                if (this.y.compareAndSet(false, true)) {
                    com.bytedance.crash.K.a.b();
                }
            } catch (Throwable unused5) {
            }
            try {
                if (this.v.compareAndSet(false, true)) {
                    com.bytedance.crash.dumper.a.d(this.a, CrashType.ANR, 0);
                }
            } catch (Throwable th17) {
                com.bytedance.crash.Q.b.c("dumpCustomData", th17);
            }
            try {
                if (this.w.compareAndSet(false, true)) {
                    com.bytedance.crash.dumper.c.a(this.a, CrashType.ANR);
                }
            } catch (Throwable th18) {
                com.bytedance.crash.Q.b.c("dumpCustomFile", th18);
            }
            try {
                if (this.t.compareAndSet(false, true)) {
                    try {
                        com.bytedance.crash.X.a.g(2, new File(this.a, "signal_monitor.txt").getAbsolutePath());
                    } catch (Throwable unused6) {
                    }
                }
            } catch (Throwable th19) {
                com.bytedance.crash.Q.b.c("dumpRepairInfo", th19);
            }
        }
        return null;
    }

    protected void finalize() {
        NativeBridge.d(this.f4396d);
    }
}
