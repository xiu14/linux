package com.bytedance.apm.launch.evil;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class LaunchSleepDetector {
    private static volatile boolean a = false;

    @SuppressLint({"CI_NotAllowInvokeExecutorsMethods"})
    private static ExecutorService b;

    private enum State {
        NONE,
        SLEEP,
        NOT_SLEEP,
        DISK_SLEEP
    }

    static class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("launch_sleep_detector");
            return thread;
        }
    }

    static {
        State state = State.NONE;
        b = Executors.newSingleThreadExecutor(new a());
    }

    public static void a() {
        if (a) {
            a = false;
            State state = State.NONE;
        }
    }
}
