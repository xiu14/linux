package com.bytedance.feedbackerlib.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.a;
import com.bytedance.feedbackerlib.service.FloatWindowService;

/* loaded from: classes.dex */
public class NetworkStateChangeReceiver extends BroadcastReceiver {
    private NetworkStateChangeReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context applicationContext = Feedbacker.getApplicationContext();
        if (a.c0(applicationContext) || !Feedbacker.isFeedbackCommonInfoSetted() || Feedbacker.getApplicationContext() == null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("on_receive->");
        M.append(System.currentTimeMillis());
        FloatWindowService.h(applicationContext, false, false, M.toString());
    }
}
