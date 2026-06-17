package com.ttnet.org.chromium.base;

import J.N;
import android.os.Handler;
import android.os.HandlerThread;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.lang.Thread;

/* loaded from: classes2.dex */
public class JavaHandlerThread {
    private final HandlerThread a;
    private Throwable b;

    class a implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ long b;

        a(JavaHandlerThread javaHandlerThread, long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            N.M3RaWo13(this.a, this.b);
        }
    }

    class b implements Runnable {
        final /* synthetic */ long a;

        b(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            JavaHandlerThread.this.a.quit();
            N.MSKUcgE4(this.a);
        }
    }

    class c implements Thread.UncaughtExceptionHandler {
        c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            JavaHandlerThread.this.b = th;
        }
    }

    public JavaHandlerThread(String str, int i) {
        this.a = new HandlerThread(str, i);
    }

    @CalledByNative
    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    @CalledByNative
    private Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }

    @CalledByNative
    private boolean isAlive() {
        return this.a.isAlive();
    }

    @CalledByNative
    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.a.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    @CalledByNative
    private void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new c());
    }

    @CalledByNative
    private void quitThreadSafely(long j) {
        new Handler(this.a.getLooper()).post(new b(j));
        this.a.getLooper().quitSafely();
    }

    @CalledByNative
    private void startAndInitialize(long j, long j2) {
        if (!(this.a.getState() != Thread.State.NEW)) {
            this.a.start();
        }
        new Handler(this.a.getLooper()).post(new a(this, j, j2));
    }
}
