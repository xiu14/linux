package com.bytedance.push;

import com.bytedance.android.service.manager.PushServiceManager;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
class z implements Observer {
    z(A a) {
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        com.bytedance.push.g0.f.c("BDPush", "[startOnce]isInBackGround:" + booleanValue);
        if (booleanValue) {
            return;
        }
        com.bytedance.push.helper.d.c().deleteObserver(this);
        PushServiceManager.get().getIPermissionBootExternalService().reportDefaultNotificationStatus();
    }
}
