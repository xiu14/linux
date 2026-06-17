package com.ttnet.org.chromium.base;

import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.c;

/* loaded from: classes2.dex */
public class EarlyTraceEvent {

    @VisibleForTesting
    static volatile int a;

    @VisibleForTesting
    static final Object b = new Object();

    public static void a(String str, boolean z) {
        if (c()) {
            Process.myTid();
            System.nanoTime();
            SystemClock.currentThreadTimeMillis();
            synchronized (b) {
                if (c()) {
                    throw null;
                }
            }
        }
    }

    static void b() {
        synchronized (b) {
            if (c()) {
                throw null;
            }
        }
    }

    static boolean c() {
        return a == 1;
    }

    public static void d(String str, boolean z) {
        if (c()) {
            Process.myTid();
            System.nanoTime();
            SystemClock.currentThreadTimeMillis();
            synchronized (b) {
                if (c()) {
                    throw null;
                }
            }
        }
    }

    @CalledByNative
    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    @CalledByNative
    static void setBackgroundStartupTracingFlag(boolean z) {
        SharedPreferences sharedPreferences;
        sharedPreferences = c.a.a;
        sharedPreferences.edit().putBoolean("bg_startup_tracing", z).apply();
    }
}
