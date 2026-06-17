package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.common.Priority;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class JobScheduler {
    private final Executor a;
    private final c b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f6547c;

    /* renamed from: e, reason: collision with root package name */
    private final int f6549e;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f6548d = new b();

    /* renamed from: f, reason: collision with root package name */
    com.facebook.imagepipeline.image.f f6550f = null;

    /* renamed from: g, reason: collision with root package name */
    int f6551g = 0;
    JobState h = JobState.IDLE;
    long i = 0;
    long j = 0;

    enum JobState {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    class a extends e.c.c.b.a {
        a(int i) {
            super(i);
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.a(JobScheduler.this);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.b(JobScheduler.this);
        }
    }

    public interface c {
        void a(com.facebook.imagepipeline.image.f fVar, int i);
    }

    static class d {
        private static ScheduledExecutorService a;

        static ScheduledExecutorService a() {
            if (a == null) {
                a = Executors.newSingleThreadScheduledExecutor();
            }
            return a;
        }
    }

    public static abstract class e implements c {
        private Priority a;

        public e(Priority priority) {
            this.a = priority;
        }

        public Priority b() {
            return this.a;
        }
    }

    public JobScheduler(Executor executor, c cVar, int i) {
        this.a = executor;
        this.b = cVar;
        this.f6549e = i;
        this.f6547c = new a(Priority.getIntPriorityValue(((e) cVar).b()));
    }

    static void a(JobScheduler jobScheduler) {
        com.facebook.imagepipeline.image.f fVar;
        int i;
        Objects.requireNonNull(jobScheduler);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (jobScheduler) {
            fVar = jobScheduler.f6550f;
            i = jobScheduler.f6551g;
            jobScheduler.f6550f = null;
            jobScheduler.f6551g = 0;
            jobScheduler.h = JobState.RUNNING;
            jobScheduler.j = uptimeMillis;
        }
        try {
            if (h(fVar, i)) {
                jobScheduler.b.a(fVar, i);
            }
        } finally {
            com.facebook.imagepipeline.image.f.d(fVar);
            jobScheduler.f();
        }
    }

    static void b(JobScheduler jobScheduler) {
        jobScheduler.a.execute(jobScheduler.f6547c);
    }

    private void d(long j) {
        Runnable runnable = this.f6548d;
        if (j > 0) {
            d.a().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            runnable.run();
        }
    }

    private void f() {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.h == JobState.RUNNING_AND_PENDING) {
                j = Math.max(this.j + this.f6549e, uptimeMillis);
                z = true;
                this.i = uptimeMillis;
                this.h = JobState.QUEUED;
            } else {
                this.h = JobState.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            d(j - uptimeMillis);
        }
    }

    private static boolean h(com.facebook.imagepipeline.image.f fVar, int i) {
        return AbstractC0722b.e(i) || AbstractC0722b.m(i, 4) || com.facebook.imagepipeline.image.f.c0(fVar);
    }

    public void c() {
        com.facebook.imagepipeline.image.f fVar;
        synchronized (this) {
            fVar = this.f6550f;
            this.f6550f = null;
            this.f6551g = 0;
        }
        com.facebook.imagepipeline.image.f.d(fVar);
    }

    public synchronized long e() {
        return this.j - this.i;
    }

    public boolean g() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!h(this.f6550f, this.f6551g)) {
                return false;
            }
            int ordinal = this.h.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    this.h = JobState.RUNNING_AND_PENDING;
                }
                max = 0;
            } else {
                max = Math.max(this.j + this.f6549e, uptimeMillis);
                this.i = uptimeMillis;
                this.h = JobState.QUEUED;
                z = true;
            }
            if (z) {
                d(max - uptimeMillis);
            }
            return true;
        }
    }

    public boolean i(com.facebook.imagepipeline.image.f fVar, int i) {
        com.facebook.imagepipeline.image.f fVar2;
        if (!h(fVar, i)) {
            return false;
        }
        synchronized (this) {
            fVar2 = this.f6550f;
            this.f6550f = com.facebook.imagepipeline.image.f.a(fVar);
            this.f6551g = i;
        }
        com.facebook.imagepipeline.image.f.d(fVar2);
        return true;
    }
}
