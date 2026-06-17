package com.bytedance.crash.L;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c {
    protected final f a;
    protected final File b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f4400c;

    /* renamed from: d, reason: collision with root package name */
    protected final com.bytedance.crash.L.b f4401d;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* renamed from: e, reason: collision with root package name */
        private final Runnable f4402e;

        /* renamed from: f, reason: collision with root package name */
        private final AtomicInteger f4403f;

        /* renamed from: g, reason: collision with root package name */
        private long f4404g;
        private long h;
        private volatile boolean i;

        /* renamed from: com.bytedance.crash.L.c$a$a, reason: collision with other inner class name */
        class RunnableC0194a implements Runnable {
            RunnableC0194a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.e(a.this);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j.m(a.this);
            }
        }

        a(f fVar, File file, long j, boolean z) {
            super(fVar, file, j, z);
            this.f4403f = new AtomicInteger(0);
            this.f4402e = new RunnableC0194a();
        }

        static void e(a aVar) {
            aVar.i = true;
            aVar.f4403f.incrementAndGet();
            aVar.f();
        }

        private void f() {
            if (this.f4403f.decrementAndGet() > 0) {
                return;
            }
            if (this.h == 0) {
                File d2 = this.a.d(Process.myPid(), this.f4400c);
                synchronized (this) {
                    this.h = c(d2);
                }
            }
            if (this.h != 0) {
                com.bytedance.crash.runtime.b.f(new b(), 120000L);
            } else if (this.i) {
                j.m(this);
                if (this.f4403f.decrementAndGet() < 0) {
                    com.bytedance.android.input.k.b.a.s(this.b);
                }
            }
        }

        @Override // com.bytedance.crash.L.c
        boolean b(boolean z) {
            if (z) {
                if (this.f4404g != 0) {
                    return true;
                }
            } else if (this.h != 0) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.crash.L.c
        void d(long j, boolean z, File file, int i) {
            boolean z2;
            if (this.f4403f.incrementAndGet() <= 0) {
                z2 = false;
            } else {
                if (z) {
                    synchronized (this) {
                        this.f4404g = j;
                    }
                    if (this.h == 0) {
                        com.bytedance.crash.runtime.b.f(this.f4402e, 35000L);
                    }
                } else {
                    if (this.f4404g != 0) {
                        com.bytedance.crash.runtime.b.h(this.f4402e);
                    }
                    synchronized (this) {
                        this.h = c(file);
                    }
                }
                z2 = true;
            }
            if (z2) {
                this.f4401d.d(i);
                if (file != null) {
                    a(file);
                }
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends c {

        /* renamed from: e, reason: collision with root package name */
        private Runnable f4405e;

        /* renamed from: f, reason: collision with root package name */
        private final AtomicInteger f4406f;

        b(f fVar, File file, long j, boolean z) {
            super(fVar, file, j, z);
            this.f4406f = new AtomicInteger(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            if (this.f4406f.get() <= 0) {
                a(new File(this.b, "anr_info.txt"));
                com.bytedance.crash.runtime.b.h(this.f4405e);
                this.f4405e = null;
                j.m(this);
            }
        }

        @Override // com.bytedance.crash.L.c
        boolean b(boolean z) {
            return false;
        }

        @Override // com.bytedance.crash.L.c
        void d(long j, boolean z, File file, int i) {
            boolean z2;
            if (this.f4406f.decrementAndGet() < 0) {
                z2 = false;
            } else {
                if (this.f4405e == null) {
                    d dVar = new d(this);
                    this.f4405e = dVar;
                    com.bytedance.crash.runtime.b.f(dVar, 120000L);
                }
                z2 = true;
            }
            if (z2) {
                if (file != null && file.exists()) {
                    c(file);
                }
                this.f4401d.d(i);
                if (!new File(this.b, "anr_info.txt").exists()) {
                    try {
                        com.bytedance.crash.util.a.x(new File(this.b, "anr_info.txt"), "silent anr no anr info", false);
                    } catch (Exception unused) {
                    }
                }
                g();
            }
        }
    }

    c(f fVar, File file, long j, boolean z) {
        this.a = fVar;
        this.f4400c = j;
        File n = com.bytedance.android.input.k.b.a.n(com.bytedance.android.input.k.b.a.n(file, com.bytedance.crash.crash.c.b()), String.valueOf(j));
        this.b = n;
        this.f4401d = com.bytedance.crash.L.b.c(n, j, z);
    }

    void a(@NonNull File file) {
        String C0 = com.bytedance.android.input.k.b.a.C0(file);
        if (TextUtils.isEmpty(C0)) {
            return;
        }
        Iterator<com.bytedance.crash.monitor.f> it2 = com.bytedance.crash.monitor.l.h().iterator();
        while (it2.hasNext()) {
            Iterator<ICrashCallback> it3 = it2.next().j().u(CrashType.ANR).iterator();
            while (it3.hasNext()) {
                try {
                    it3.next().onCrash(CrashType.ANR, C0, null);
                } catch (Throwable unused) {
                }
            }
        }
    }

    abstract boolean b(boolean z);

    protected long c(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        long h = f.h(file.getName());
        file.renameTo(new File(this.b, "anr_info.txt"));
        return h;
    }

    abstract void d(long j, boolean z, File file, int i);
}
