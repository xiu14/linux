package com.ttnet.org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class g implements Executor {

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f8779g = new AtomicBoolean(false);
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8780c;

    /* renamed from: d, reason: collision with root package name */
    private InterruptedIOException f8781d;

    /* renamed from: e, reason: collision with root package name */
    private RuntimeException f8782e;

    /* renamed from: f, reason: collision with root package name */
    private long f8783f = -1;
    private final BlockingQueue<Runnable> a = new LinkedBlockingQueue();

    private Runnable f(boolean z, long j) throws InterruptedIOException {
        try {
            Runnable take = !z ? this.a.take() : this.a.poll(j, TimeUnit.NANOSECONDS);
            if (take != null) {
                return take;
            }
            throw new SocketTimeoutException("ttnet");
        } catch (InterruptedException e2) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e2);
            throw interruptedIOException;
        }
    }

    public boolean a() {
        return this.b;
    }

    public void b(int i) throws IOException {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.f8780c) {
            InterruptedIOException interruptedIOException = this.f8781d;
            if (interruptedIOException == null) {
                throw this.f8782e;
            }
            throw interruptedIOException;
        }
        if (this.b) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
        this.b = true;
        while (this.b) {
            if (i == 0) {
                try {
                    f(false, 0L).run();
                } catch (SocketTimeoutException e2) {
                    this.b = false;
                    this.f8780c = true;
                    throw e2;
                } catch (InterruptedIOException e3) {
                    this.b = false;
                    this.f8780c = true;
                    this.f8781d = e3;
                    throw e3;
                } catch (RuntimeException e4) {
                    this.b = false;
                    this.f8780c = true;
                    this.f8782e = e4;
                    throw e4;
                }
            } else {
                f(true, (convert - System.nanoTime()) + nanoTime).run();
            }
        }
    }

    public boolean c() {
        long j = this.f8783f;
        return j == -1 || j == Thread.currentThread().getId();
    }

    public void d() {
        this.b = false;
    }

    public void e() {
        this.f8780c = false;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) throws RejectedExecutionException {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.a.put(runnable);
        } catch (InterruptedException e2) {
            throw new RejectedExecutionException(e2);
        }
    }
}
