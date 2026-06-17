package com.heytap.mcssdk.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class f {
    private static final String a = "RegisterTimeoutTask";
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6930c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f6931d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f6932e = new Object();

    private static class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.g()) {
                e.b(f.a, "register timeout, increment timeout count");
            }
            g.f().d();
        }
    }

    public f(Handler handler, long j) {
        this.b = handler == null ? new Handler(Looper.getMainLooper()) : handler;
        this.f6930c = j;
    }

    public void a() {
        synchronized (this.f6932e) {
            b();
            a aVar = new a();
            this.f6931d = aVar;
            this.b.postDelayed(aVar, this.f6930c);
            if (e.g()) {
                e.b(a, "register timeout task started, timeout: " + this.f6930c + "ms");
            }
        }
    }

    public void b() {
        Runnable runnable;
        synchronized (this.f6932e) {
            Handler handler = this.b;
            if (handler != null && (runnable = this.f6931d) != null) {
                handler.removeCallbacks(runnable);
                this.f6931d = null;
                if (e.g()) {
                    e.b(a, "register timeout task cancelled");
                }
            }
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this.f6932e) {
            z = this.f6931d != null;
        }
        return z;
    }
}
