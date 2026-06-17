package com.bytedance.crash.crash;

import androidx.annotation.NonNull;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.LocaleInfo;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a {
    private final File a;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4567e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f4568f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f4569g = new AtomicBoolean(false);
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
    private long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private CrashType f4565c = CrashType.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    private int f4566d = 0;

    a(@NonNull File file) {
        this.a = file;
    }

    private void e(CrashType crashType, long j) {
        if (j != 0) {
            long j2 = this.b;
            if (j2 == 0 || j2 > j) {
                this.b = j;
                this.f4565c = crashType;
            }
        }
    }

    void a() {
        try {
            if (this.f4567e.compareAndSet(false, true)) {
                com.bytedance.android.input.k.b.a.x(this.a);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.c("NPTH_DUMP", th);
        }
    }

    void b(CrashType crashType, long j, boolean z, boolean z2) {
        try {
            e(crashType, j);
            c(NativeBridge.j(j), true, z, z2, 0);
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.c("NPTH_DUMP", th);
        }
    }

    void c(long j, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        com.bytedance.crash.dumper.e c2;
        e(CrashType.NATIVE, j);
        this.f4566d = i;
        boolean z5 = false;
        try {
            if (this.f4568f.compareAndSet(false, true)) {
                com.bytedance.android.input.k.b.a.y(this.a);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.c("dumpCommonParams", th);
        }
        if (this.f4569g.compareAndSet(false, true)) {
            LocaleInfo.dump(this.a);
        }
        if (this.h.compareAndSet(false, true)) {
            com.bytedance.android.input.k.b.a.z(this.a);
            com.bytedance.android.input.k.b.a.C(this.a);
        }
        if (this.i.compareAndSet(false, true)) {
            com.bytedance.crash.dumper.a.e(this.a);
        }
        if (this.j.compareAndSet(false, true)) {
            Scraps.dump(this.a);
        }
        if (z3) {
            try {
                if (this.k.compareAndSet(false, true)) {
                    com.bytedance.crash.U.c.d().c(this.a);
                }
            } catch (Throwable unused) {
            }
        }
        if (this.l.compareAndSet(false, true)) {
            com.bytedance.android.input.k.b.a.B(this.a);
        }
        if (this.m.compareAndSet(false, true)) {
            com.bytedance.crash.a0.a.u(this.a);
        }
        if (z && this.n.compareAndSet(false, true)) {
            File file = this.a;
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (!allStackTraces.isEmpty()) {
                com.bytedance.crash.dumper.j.f fVar = new com.bytedance.crash.dumper.j.f(file.getAbsolutePath() + "/all_thread_stacks.json");
                fVar.a('{');
                fVar.i("all_thread_stacks");
                fVar.a('{');
                fVar.i("thread_all_count");
                fVar.b(allStackTraces.size());
                fVar.a(',');
                fVar.i("thread_stacks");
                fVar.a('[');
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = allStackTraces.entrySet().iterator();
                boolean z6 = true;
                while (it2.hasNext()) {
                    Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                    StackTraceElement[] value = next.getValue();
                    if (z6) {
                        z6 = z5;
                    } else {
                        fVar.a(',');
                    }
                    fVar.a('{');
                    Thread key = next.getKey();
                    fVar.i(CrashHianalyticsData.THREAD_NAME);
                    fVar.a('\"');
                    fVar.d(key.getName());
                    fVar.a('(');
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it2;
                    fVar.c(key.getId());
                    fVar.a(')');
                    fVar.a('\"');
                    fVar.a(',');
                    fVar.i("thread_stack");
                    fVar.a('[');
                    if (value.length > 0) {
                        for (int i2 = 0; i2 < value.length; i2++) {
                            StackTraceElement stackTraceElement = value[i2];
                            fVar.a('\"');
                            fVar.d(stackTraceElement.getClassName());
                            fVar.a('.');
                            fVar.d(stackTraceElement.getMethodName());
                            fVar.a('(');
                            fVar.d(stackTraceElement.getFileName());
                            fVar.a(':');
                            fVar.b(stackTraceElement.getLineNumber());
                            fVar.a(')');
                            fVar.a('\"');
                            if (i2 != value.length - 1) {
                                fVar.a(',');
                            }
                        }
                    } else {
                        fVar.d("\"(Native Method)\"");
                    }
                    fVar.a(']');
                    fVar.a('}');
                    it2 = it3;
                    z5 = false;
                }
                fVar.a(']');
                fVar.a('}');
                fVar.a('}');
                fVar.h();
            }
        }
        if (this.o.compareAndSet(false, true)) {
            com.bytedance.android.input.k.b.a.A(this.a);
        }
        if (z2 && this.q.compareAndSet(false, true)) {
            com.bytedance.crash.dumper.a.f(this.a);
        }
        if (l.e() == null || (c2 = l.e().c()) == null) {
            z4 = false;
        } else {
            z4 = false;
            if (this.u.compareAndSet(false, true)) {
                c2.a(this.a);
            }
        }
        if (this.r.compareAndSet(z4, true)) {
            com.bytedance.crash.dumper.a.d(this.a, this.f4565c, this.f4566d);
        }
        if (this.s.compareAndSet(z4, true)) {
            com.bytedance.crash.dumper.c.a(this.a, this.f4565c);
        }
        if (this.t.compareAndSet(z4, true)) {
            com.bytedance.crash.K.a.b();
        }
        if (this.p.compareAndSet(z4, true)) {
            try {
                com.bytedance.crash.X.a.g(2, new File(this.a, "signal_monitor.txt").getAbsolutePath());
            } catch (Throwable unused2) {
            }
        }
    }

    @NonNull
    File d() {
        return this.a;
    }
}
