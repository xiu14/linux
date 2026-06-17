package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.Z;

/* loaded from: classes2.dex */
public final class J extends Z implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g, reason: collision with root package name */
    public static final J f10154g;
    private static final long h;

    static {
        Long l;
        J j = new J();
        f10154g = j;
        j.e0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        h = timeUnit.toNanos(l.longValue());
    }

    private J() {
    }

    private final synchronized void w0() {
        if (x0()) {
            debugStatus = 3;
            u0();
            notifyAll();
        }
    }

    private final boolean x0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // kotlinx.coroutines.Z, kotlinx.coroutines.N
    public U A(long j, Runnable runnable, kotlin.r.f fVar) {
        long c2 = C0792b0.c(j);
        if (c2 >= 4611686018427387903L) {
            return x0.a;
        }
        long nanoTime = System.nanoTime();
        Z.b bVar = new Z.b(c2 + nanoTime, runnable);
        v0(nanoTime, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.AbstractC0790a0
    protected Thread o0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC0790a0
    protected void p0(long j, Z.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.Z
    public void r0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.r0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        boolean t0;
        F0 f0 = F0.a;
        F0.c(this);
        try {
            synchronized (this) {
                if (x0()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z) {
                if (t0) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long l0 = l0();
                if (l0 == LocationRequestCompat.PASSIVE_INTERVAL) {
                    long nanoTime = System.nanoTime();
                    if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                        j = h + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        w0();
                        if (t0()) {
                            return;
                        }
                        o0();
                        return;
                    }
                    l0 = kotlin.w.h.d(l0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (l0 > 0) {
                    if (x0()) {
                        _thread = null;
                        w0();
                        if (t0()) {
                            return;
                        }
                        o0();
                        return;
                    }
                    LockSupport.parkNanos(this, l0);
                }
            }
        } finally {
            _thread = null;
            w0();
            if (!t0()) {
                o0();
            }
        }
    }

    @Override // kotlinx.coroutines.Z, kotlinx.coroutines.Y
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
