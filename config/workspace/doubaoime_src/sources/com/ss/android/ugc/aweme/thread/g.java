package com.ss.android.ugc.aweme.thread;

import android.util.Log;
import com.ss.android.ugc.aweme.thread.j;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
class g {

    /* renamed from: d, reason: collision with root package name */
    private static ExecutorService f8389d;
    private Object a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private ReentrantLock f8390c = new ReentrantLock();
    private Map<com.ss.android.ugc.aweme.thread.b, Object> b = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private static g a = new g(null);
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(h.c());
        }
    }

    g(f fVar) {
        j.b a2 = j.a(ThreadPoolType.SCHEDULED);
        a2.h(1);
        a2.i("TaskMonitor");
        f8389d = h.a(a2.g());
        Log.d("ThreadPool-TaskMonitor", String.format("taskBlockedTimeOut=%d", Long.valueOf(h.b().b())));
        ((ScheduledExecutorService) f8389d).scheduleAtFixedRate(new b(), h.b().b(), h.b().b(), TimeUnit.MILLISECONDS);
    }
}
