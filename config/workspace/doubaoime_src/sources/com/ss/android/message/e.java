package com.ss.android.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class e implements WeakHandler.IHandler {

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f8347c;

    /* renamed from: d, reason: collision with root package name */
    private static HandlerThread f8348d;
    private final WeakHandler a;
    private final Set<Handler.Callback> b = new HashSet();

    private e() {
        if (f8348d == null) {
            HandlerThread handlerThread = new HandlerThread("PushThreadHandler");
            f8348d = handlerThread;
            handlerThread.start();
        }
        this.a = new WeakHandler(f8348d.getLooper(), this);
    }

    public static e e() {
        if (f8347c == null) {
            synchronized (e.class) {
                if (f8347c == null) {
                    f8347c = new e();
                }
            }
        }
        return f8347c;
    }

    public void a(Handler.Callback callback) {
        synchronized (this.b) {
            this.b.add(callback);
        }
    }

    public WeakHandler b() {
        return this.a;
    }

    public WeakHandler c(Handler.Callback callback) {
        a(callback);
        return this.a;
    }

    public Looper d() {
        return f8348d.getLooper();
    }

    public void f(Runnable runnable, long j) {
        if (j > 0) {
            this.a.postDelayed(runnable, j);
        } else if (Looper.myLooper() != this.a.getLooper()) {
            this.a.post(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        synchronized (this.b) {
            Iterator<Handler.Callback> it2 = this.b.iterator();
            while (it2.hasNext()) {
                if (it2.next().handleMessage(message)) {
                    return;
                }
            }
        }
    }
}
