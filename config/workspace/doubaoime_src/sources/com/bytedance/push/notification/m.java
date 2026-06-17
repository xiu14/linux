package com.bytedance.push.notification;

import com.bytedance.push.C;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class m extends TimerTask {
    public static volatile m b;
    private final AtomicBoolean a = new AtomicBoolean(false);

    public void a(long j) {
        if (!this.a.compareAndSet(false, true)) {
            com.bytedance.push.g0.f.c("NotificationTimer", "[startNotificationShowTask] not start new timer task because cur has exists");
        } else {
            com.bytedance.push.g0.f.c("NotificationTimer", String.format("[startNotificationShowTask]handle message after %s", Long.valueOf(j)));
            com.ss.android.message.e.e().f(this, j);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.bytedance.push.g0.f.c("NotificationTimer", "on NotificationTimer#run,handleMessageNotBeenShown");
        this.a.compareAndSet(true, false);
        ((com.bytedance.push.a0.a.a) ((C) C.a()).h()).c();
    }
}
