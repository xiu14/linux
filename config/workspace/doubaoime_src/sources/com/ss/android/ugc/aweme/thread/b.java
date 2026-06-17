package com.ss.android.ugc.aweme.thread;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.thread.g;
import java.util.Objects;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
class b implements Runnable, Comparable {
    private Runnable a;
    private a b;

    /* renamed from: c, reason: collision with root package name */
    private long f8381c = SystemClock.uptimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private Thread f8382d;

    b(Runnable runnable, a aVar) {
        this.a = runnable;
        this.b = aVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Runnable runnable = this.a;
        if ((runnable instanceof Comparable) && (obj instanceof b)) {
            return ((Comparable) runnable).compareTo(((b) obj).a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar;
        g gVar2;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f8382d = Thread.currentThread();
            if (this.a instanceof FutureTask) {
                Objects.requireNonNull(h.c());
                Objects.requireNonNull(h.c());
            }
            gVar2 = g.a.a;
            Objects.requireNonNull(gVar2);
            Objects.requireNonNull(h.c());
            if (uptimeMillis - this.f8381c >= h.b().d()) {
                Objects.requireNonNull(h.c());
            }
            this.a.run();
            if (SystemClock.uptimeMillis() - uptimeMillis >= h.b().c()) {
                Objects.requireNonNull(h.c());
            }
        } finally {
            gVar = g.a.a;
            Objects.requireNonNull(gVar);
            Objects.requireNonNull(h.c());
        }
    }
}
