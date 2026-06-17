package com.huawei.hms.opendevice;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public class c implements ThreadFactory {
    private final ThreadGroup a;
    private int b = 1;

    /* renamed from: c, reason: collision with root package name */
    private final String f7407c;

    public c(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f7407c = e.a.a.a.a.s(str, "-pool-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        synchronized (this) {
            this.b++;
        }
        Thread thread = new Thread(this.a, runnable, this.f7407c + this.b, 0L);
        thread.setUncaughtExceptionHandler(null);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
