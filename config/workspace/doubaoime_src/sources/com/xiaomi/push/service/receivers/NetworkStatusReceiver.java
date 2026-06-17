package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.mipush.sdk.p;
import com.xiaomi.mipush.sdk.u;
import com.xiaomi.mipush.sdk.v;
import com.xiaomi.push.ax;
import com.xiaomi.push.ho;
import com.xiaomi.push.n;
import com.xiaomi.push.service.ServiceClient;

/* loaded from: classes2.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {
    private static boolean a = false;
    private boolean b;

    public NetworkStatusReceiver() {
        this.b = false;
        this.b = true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        if (this.b) {
            return;
        }
        ax.m115a();
        n.a().post(new Runnable() { // from class: com.xiaomi.push.service.receivers.NetworkStatusReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                NetworkStatusReceiver.this.a(context);
            }
        });
    }

    public static boolean a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (!u.a(context).m86a() && b.m41a(context).m50c() && !b.m41a(context).m53f()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e2) {
                c.m18a((Throwable) e2);
            }
        }
        ho.m485a(context);
        if (ax.m117a(context) && u.a(context).m89b()) {
            u.a(context).m90c();
        }
        if (ax.m117a(context)) {
            if ("syncing".equals(p.a(context).a(v.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(p.a(context).a(v.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            p a2 = p.a(context);
            v vVar = v.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(a2.a(vVar))) {
                u.a(context).a((String) null, vVar, d.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            if ("syncing".equals(p.a(context).a(v.UPLOAD_FCM_TOKEN))) {
                u.a(context).a((String) null, vVar, d.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            p a3 = p.a(context);
            v vVar2 = v.UPLOAD_COS_TOKEN;
            if ("syncing".equals(a3.a(vVar2))) {
                u.a(context).a((String) null, vVar2, d.ASSEMBLE_PUSH_COS, "net");
            }
            p a4 = p.a(context);
            v vVar3 = v.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(a4.a(vVar3))) {
                u.a(context).a((String) null, vVar3, d.ASSEMBLE_PUSH_FTOS, "net");
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    public NetworkStatusReceiver(Object obj) {
        this.b = false;
        a = true;
    }
}
