package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class t {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private static final HandlerThread b;

    /* renamed from: c, reason: collision with root package name */
    private static final Handler f8894c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        b = handlerThread;
        handlerThread.start();
        f8894c = new u(handlerThread.getLooper());
    }

    public static void a(s sVar, long j) {
        if (sVar == null) {
            com.vivo.push.util.t.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a2 = sVar.a();
        if (j > 0) {
            f8894c.removeMessages(a2);
        }
        Message message = new Message();
        message.what = a2;
        message.obj = sVar;
        f8894c.sendMessageDelayed(message, j);
    }

    public static void b(Runnable runnable) {
        Handler handler = f8894c;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void a(RunnableC0778r runnableC0778r) {
        Handler handler = f8894c;
        handler.removeCallbacks(runnableC0778r);
        handler.postDelayed(runnableC0778r, 15000L);
    }

    public static void a(Runnable runnable) {
        a.post(runnable);
    }
}
