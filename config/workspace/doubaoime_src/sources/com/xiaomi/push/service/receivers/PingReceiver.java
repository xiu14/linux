package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.push.fk;
import com.xiaomi.push.service.ServiceClient;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ay;

/* loaded from: classes2.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.c(intent.getPackage() + " is the package name");
        if (XMPushService.m684e()) {
            return;
        }
        if (!ay.t.equals(intent.getAction())) {
            c.m15a("cancel the old ping timer");
            fk.m397a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            c.c("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                ServiceClient.getInstance(context).startServiceSafely(intent2);
            } catch (Exception e2) {
                c.m18a((Throwable) e2);
            }
        }
    }
}
