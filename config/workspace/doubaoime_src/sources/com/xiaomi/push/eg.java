package com.xiaomi.push;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes2.dex */
public abstract class eg {
    public abstract int a();

    public StatusBarNotification a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : com.xiaomi.push.service.ai.a(context, str)) {
            if (a(statusBarNotification)) {
                return statusBarNotification;
            }
        }
        return null;
    }

    abstract boolean a(StatusBarNotification statusBarNotification);

    public void a(XMPushService xMPushService, String str, it itVar, iq iqVar, boolean z) {
        StatusBarNotification a = a(xMPushService, str);
        int a2 = a();
        if (a != null) {
            com.xiaomi.push.service.aa.j(com.xiaomi.push.service.ao.d(a.getNotification()));
            com.xiaomi.push.service.ai.a(a, str, xMPushService, itVar, iqVar, z, a2);
            return;
        }
        com.xiaomi.push.service.ai.a(xMPushService, iqVar, itVar, 0, "", 3, a2, z);
        if (this instanceof ej) {
            com.xiaomi.push.service.aa.j(((ej) this).m350a());
        } else if (this instanceof eh) {
            com.xiaomi.push.service.aa.j(((eh) this).m349a());
        }
    }
}
