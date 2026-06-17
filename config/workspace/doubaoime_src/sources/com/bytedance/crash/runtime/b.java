package com.bytedance.crash.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class b extends HandlerThread {

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f4685d;
    private final Queue<a> a;
    private Handler b;

    /* renamed from: c, reason: collision with root package name */
    private int f4686c;

    static class a {
        Runnable a;
        long b;

        a(Runnable runnable, long j) {
            this.a = runnable;
            this.b = j;
        }
    }

    private b() {
        super("npth-worker");
        this.a = new ConcurrentLinkedQueue();
    }

    public static Thread a() {
        return b();
    }

    private static b b() {
        if (f4685d == null) {
            synchronized (b.class) {
                if (f4685d == null) {
                    f4685d = new b();
                    f4685d.start();
                }
            }
        }
        return f4685d;
    }

    public static boolean c() {
        return Thread.currentThread() == b();
    }

    public static void d(Runnable runnable) {
        b b = b();
        Objects.requireNonNull(b);
        b.g(runnable, SystemClock.uptimeMillis() + 0);
    }

    public static void e(Runnable runnable) {
        b().g(runnable, 0L);
    }

    public static void f(Runnable runnable, long j) {
        b b = b();
        Objects.requireNonNull(b);
        if (j < 0) {
            j = 0;
        }
        b.g(runnable, SystemClock.uptimeMillis() + j);
    }

    private void g(Runnable runnable, long j) {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.a.add(new a(runnable, j));
                    return;
                }
            }
        }
        this.b.sendMessageAtTime(Message.obtain(this.b, runnable), j);
    }

    public static void h(Runnable runnable) {
        b b = b();
        synchronized (b.a) {
            Iterator<a> it2 = b.a.iterator();
            while (it2.hasNext()) {
                if (it2.next().a.equals(runnable)) {
                    it2.remove();
                }
            }
        }
        Handler handler = b.b;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.b = new Handler(Looper.myLooper());
        synchronized (this.a) {
            while (!this.a.isEmpty()) {
                a poll = this.a.poll();
                if (poll != null) {
                    try {
                        this.b.sendMessageAtTime(Message.obtain(this.b, poll.a), poll.b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                com.bytedance.android.input.k.b.a.W(th);
                try {
                    int i = this.f4686c;
                    if (i <= 5) {
                        com.bytedance.crash.Q.b.e(i == 5 ? "NPTH_ERR_MAX" : "NPTH_CATCH", th);
                    }
                    this.f4686c++;
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
