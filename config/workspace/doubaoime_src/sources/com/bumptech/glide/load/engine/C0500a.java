package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0500a {
    private final boolean a;
    private final Executor b;

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    final Map<com.bumptech.glide.load.d, b> f1628c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f1629d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f1630e;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0027a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0028a implements Runnable {
            final /* synthetic */ Runnable a;

            RunnableC0028a(ThreadFactoryC0027a threadFactoryC0027a, Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.a.run();
            }
        }

        ThreadFactoryC0027a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0028a(this, runnable), "glide-active-resources");
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.a$b */
    static final class b extends WeakReference<p<?>> {
        final com.bumptech.glide.load.d a;
        final boolean b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        v<?> f1631c;

        b(@NonNull com.bumptech.glide.load.d dVar, @NonNull p<?> pVar, @NonNull ReferenceQueue<? super p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            v<?> vVar;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.a = dVar;
            if (pVar.e() && z) {
                vVar = pVar.d();
                Objects.requireNonNull(vVar, "Argument must not be null");
            } else {
                vVar = null;
            }
            this.f1631c = vVar;
            this.b = pVar.e();
        }
    }

    C0500a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0027a());
        this.f1628c = new HashMap();
        this.f1629d = new ReferenceQueue<>();
        this.a = z;
        this.b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new com.bumptech.glide.load.engine.b(this));
    }

    synchronized void a(com.bumptech.glide.load.d dVar, p<?> pVar) {
        b put = this.f1628c.put(dVar, new b(dVar, pVar, this.f1629d, this.a));
        if (put != null) {
            put.f1631c = null;
            put.clear();
        }
    }

    void b() {
        while (true) {
            try {
                c((b) this.f1629d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(@NonNull b bVar) {
        v<?> vVar;
        synchronized (this) {
            this.f1628c.remove(bVar.a);
            if (bVar.b && (vVar = bVar.f1631c) != null) {
                this.f1630e.a(bVar.a, new p<>(vVar, true, false, bVar.a, this.f1630e));
            }
        }
    }

    void d(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f1630e = aVar;
            }
        }
    }
}
