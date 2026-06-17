package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class ThreadUtils {
    private static final Object a = new Object();
    private static Handler b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8559c = 0;

    public static class a {
        private final long a = Process.myTid();
    }

    public static Handler a() {
        boolean z;
        synchronized (a) {
            if (b == null) {
                b = new Handler(Looper.getMainLooper());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            TraceEvent.p();
        }
        return b;
    }

    public static boolean b() {
        return a().getLooper() == Looper.myLooper();
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }
}
