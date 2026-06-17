package com.ttnet.org.chromium.base;

import J.N;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.lang.Thread;

/* loaded from: classes2.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8551c;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.a = uncaughtExceptionHandler;
        this.b = z;
    }

    @CalledByNative
    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.f8551c) {
            this.f8551c = true;
            N.M9gfm$zh(this.b, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
