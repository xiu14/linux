package com.xiaomi.push.service;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.eg;
import com.xiaomi.push.eh;
import com.xiaomi.push.ei;
import com.xiaomi.push.ej;
import com.xiaomi.push.ek;
import com.xiaomi.push.gx;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.il;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ai {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(XMPushService xMPushService, String str, StatusBarNotification statusBarNotification) {
        List<StatusBarNotification> a = a((Context) xMPushService, str);
        int id = statusBarNotification.getId();
        for (StatusBarNotification statusBarNotification2 : a) {
            if (statusBarNotification2 != null && id == statusBarNotification2.getId() && TextUtils.equals(str, statusBarNotification2.getPackageName()) && an.m745a(statusBarNotification.getNotification().getChannelId(), str)) {
                return false;
            }
        }
        return true;
    }

    static void a(XMPushService xMPushService, it itVar, iq iqVar) {
        eg ekVar;
        if (xMPushService == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pushService can't be null when canceling message");
            return;
        }
        if (itVar == null || itVar.f750a == null || TextUtils.isEmpty(iqVar.f738b)) {
            a(xMPushService, iqVar, itVar, -1, "", -1, 0, false);
            return;
        }
        String str = iqVar.f738b;
        Map<String, String> map = itVar.f750a;
        int a = a(map);
        String str2 = map.get("msg_id");
        boolean a2 = a(xMPushService, iqVar);
        if (m735a((Context) xMPushService, str2)) {
            boolean a3 = a(itVar);
            a(xMPushService, iqVar, itVar, a3 ? 0 : -1, str2, a3 ? 2 : -4, 2, a2);
            return;
        }
        if (a >= 0 && !TextUtils.isEmpty(str2)) {
            ekVar = new ej(a, str2, str);
        } else if (!TextUtils.isEmpty(str2)) {
            ekVar = new eh(str2);
        } else if (a >= 0) {
            ekVar = new ei(a, str);
        } else {
            String str3 = map.get("title");
            String str4 = map.get(com.heytap.mcssdk.constant.b.i);
            ekVar = (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? null : new ek(str4, str3);
        }
        if (ekVar == null) {
            a(xMPushService, iqVar, itVar, -1, "", -1, 0, a2);
        } else {
            ekVar.a(xMPushService, str, itVar, iqVar, a2);
        }
    }

    private static boolean a(Context context, iq iqVar) {
        if (context == null || !com.xiaomi.push.k.m655a(context) || iqVar.m558a() == null || iqVar.m558a().m525a() == null || !"pulldown".equals(ao.a((Object) iqVar.m558a().m525a()))) {
            return false;
        }
        aa.m704a(iqVar);
        return true;
    }

    private static int a(Map<String, String> map) {
        String str = map.get(RemoteMessageConst.Notification.NOTIFY_ID);
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        try {
            return com.xiaomi.push.u.a(str, -2);
        } catch (NumberFormatException e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("parse notifyId from STRING to INT failed: " + e2);
            return -2;
        }
    }

    public static void a(final XMPushService xMPushService, final iq iqVar, final it itVar, final int i, final String str, final int i2, final int i3, final boolean z) {
        if (xMPushService == null) {
            return;
        }
        xMPushService.a(new XMPushService.j(4) { // from class: com.xiaomi.push.service.ai.1
            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "send ack message for clear push message.";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                try {
                    il ilVar = new il();
                    ilVar.c(ie.CancelPushMessageACK.f611a);
                    ilVar.a(itVar.m573a());
                    ilVar.a(itVar.a());
                    ilVar.b(itVar.b());
                    ilVar.e(itVar.d());
                    ilVar.a(i);
                    ilVar.d("");
                    HashMap hashMap = new HashMap(itVar.f750a);
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(RemoteMessageConst.MSGID, str);
                    }
                    hashMap.put("cancelType", String.valueOf(i3));
                    hashMap.put("hasPullDownCancel", String.valueOf(z ? 1 : 0));
                    hashMap.put("resultCode", String.valueOf(i2));
                    ilVar.a(hashMap);
                    ab.a(xMPushService, ab.b(iqVar.b(), iqVar.m559a(), ilVar, hu.Notification));
                } catch (gx e2) {
                    com.xiaomi.channel.commonutils.logger.c.d("clear push message. " + e2);
                    xMPushService.a(10, e2);
                }
            }
        });
    }

    public static List<StatusBarNotification> a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            return an.a(context, str).m753b();
        }
        return new ArrayList();
    }

    public static void a(final StatusBarNotification statusBarNotification, final String str, final XMPushService xMPushService, final it itVar, final iq iqVar, final boolean z, final int i) {
        if (xMPushService == null || TextUtils.isEmpty(str) || statusBarNotification == null || itVar == null || iqVar == null) {
            return;
        }
        ac.m720a((Context) xMPushService, 1);
        a(xMPushService, str, statusBarNotification, itVar, iqVar, z, i);
        com.xiaomi.push.ba.a("cancelTask", new Runnable() { // from class: com.xiaomi.push.service.ai.2
            @Override // java.lang.Runnable
            public void run() {
                boolean b = ai.b(XMPushService.this, str, statusBarNotification);
                ai.a(XMPushService.this, iqVar, itVar, b ? 0 : -1, ao.d(statusBarNotification.getNotification()), b ? 1 : -3, i, z);
            }
        }, 500L, TimeUnit.MILLISECONDS);
    }

    private static void a(XMPushService xMPushService, String str, StatusBarNotification statusBarNotification, it itVar, iq iqVar, boolean z, int i) {
        an a = an.a(xMPushService, str);
        if (an.a(statusBarNotification)) {
            try {
                a.a(statusBarNotification.getId());
                return;
            } catch (Exception unused) {
                a(xMPushService, iqVar, itVar, -1, ao.d(statusBarNotification.getNotification()), -2, i, z);
                return;
            }
        }
        a(xMPushService, iqVar, itVar, 0, ao.d(statusBarNotification.getNotification()), 4, i, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m735a(Context context, String str) {
        return context != null && !TextUtils.isEmpty(str) && com.xiaomi.push.k.m655a(context) && aa.m707a(str);
    }

    private static boolean a(it itVar) {
        return aa.a(itVar);
    }
}
