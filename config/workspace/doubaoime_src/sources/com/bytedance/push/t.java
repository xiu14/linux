package com.bytedance.push;

import com.bytedance.android.service.manager.PushServiceManager;

/* loaded from: classes2.dex */
class t implements Runnable {
    t(o oVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        PushServiceManager.get().getAliveMonitorService().monitorAssociationStart(C0679c.a().a);
    }
}
