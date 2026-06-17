package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.push.service.ServiceClient;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.t;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (t.m848d()) {
            StringBuilder M = a.M("Power connection status changed. Receive action: ");
            M.append(intent.getAction());
            c.m15a(M.toString());
            if (!"android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction())) {
                "android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction());
                return;
            }
            try {
                Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                intent2.setAction("com.xiaomi.push.timer");
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.putExtra("speaker_reset_ping_timing", true);
                ServiceClient.getInstance(context).startServiceSafely(intent2);
            } catch (Exception e2) {
                c.m18a((Throwable) e2);
            }
        }
    }
}
