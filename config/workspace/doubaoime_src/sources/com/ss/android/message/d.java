package com.ss.android.message;

import android.content.Intent;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.trace.Constants;
import com.bytedance.android.service.manager.push.trace.PushTraceSceneType;
import com.bytedance.push.g0.f;
import com.bytedance.push.o;
import com.bytedance.push.third.h;

/* loaded from: classes2.dex */
class d implements Runnable {
    final /* synthetic */ Intent a;

    d(NotifyService notifyService, Intent intent) {
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PushServiceManager.get().getPushTraceExternalService().getTraceScene(PushTraceSceneType.ALLIANCE_WAKEUP).enterNode(Constants.NODE_PUSH_PROCESS_STARTED, "The push process is started");
            f.c("NotifyService", "onServiceStart");
            o.d().g(com.bytedance.common.g.a.c().e().c().a);
            try {
                h.h().e(this.a);
            } catch (Throwable unused) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
