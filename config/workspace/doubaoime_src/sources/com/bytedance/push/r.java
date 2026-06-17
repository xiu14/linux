package com.bytedance.push;

import com.bytedance.android.service.manager.PushServiceManager;

/* loaded from: classes2.dex */
class r implements Runnable {
    r(o oVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        PushServiceManager.get().getIAllianceService().onInitOnProcessIsolationProtectedMode();
    }
}
