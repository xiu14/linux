package com.bytedance.push.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.alliance.IAllianceService;
import com.bytedance.android.service.manager.alliance.SmpProcessInitCallback;
import com.bytedance.push.A;
import com.bytedance.push.C;
import com.bytedance.push.C0678b;
import com.bytedance.push.g0.f;
import com.bytedance.push.interfaze.IPushService;
import e.a.a.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public class BaseSignalReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        StringBuilder M = a.M("[onReceive]");
        M.append(intent.getAction());
        f.c("BaseSignalReceiver", M.toString());
        if (!com.ss.android.message.f.a.z(context)) {
            ((C) C.a()).t().onReceiveSignal(intent);
            return;
        }
        IPushService a = C0678b.a();
        SmpProcessInitCallback smpProcessInitCallback = new SmpProcessInitCallback() { // from class: com.bytedance.push.event.BaseSignalReceiver.1
            @Override // com.bytedance.android.service.manager.alliance.SmpProcessInitCallback
            public void onFinishInit() {
                ((C) C.a()).t().onReceiveSignal(intent);
            }
        };
        Objects.requireNonNull((A) a);
        PushServiceManager.get().getIAllianceService().onSmpProcessStart(context, this, IAllianceService.LAUNCH_FROM_SIGNAL, smpProcessInitCallback);
    }
}
