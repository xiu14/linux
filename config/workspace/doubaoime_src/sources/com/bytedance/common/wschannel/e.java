package com.bytedance.common.wschannel;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes.dex */
public class e implements WeakHandler.IHandler {
    private static volatile e a;
    private static WeakHandler b;

    private e() {
        if (b == null) {
            try {
                b = com.ss.android.message.e.e().b();
            } catch (Throwable unused) {
                HandlerThread handlerThread = new HandlerThread("WsHT");
                handlerThread.start();
                b = new WeakHandler(handlerThread.getLooper(), this);
            }
        }
    }

    public static e b() {
        if (a == null) {
            synchronized (e.class) {
                if (a == null) {
                    a = new e();
                }
            }
        }
        return a;
    }

    public WeakHandler a() {
        return b;
    }

    public void c(Runnable runnable) {
        b.post(runnable);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }
}
