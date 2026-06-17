package com.bytedance.apm.t.l;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
final class f implements Runnable {
    f() {
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler;
        com.bytedance.monitor.collector.a aVar;
        HandlerThread handlerThread;
        handler = e.m;
        handler.removeCallbacksAndMessages(null);
        aVar = e.q;
        com.bytedance.monitor.collector.g.m(aVar);
        handlerThread = e.l;
        handlerThread.quit();
        e.h(null);
    }
}
