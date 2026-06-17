package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.bm;
import com.xiaomi.push.fs;
import com.xiaomi.push.h;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.ii;
import com.xiaomi.push.ik;
import com.xiaomi.push.it;
import com.xiaomi.push.iu;
import com.xiaomi.push.iv;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.je;
import com.xiaomi.push.service.ac;
import com.xiaomi.push.service.as;
import com.xiaomi.push.service.bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes2.dex */
public class MiPushClient4Hybrid {
    private static MiPushCallback sCallback;
    private static Map<String, b.a> dataMap = new HashMap();
    private static Map<String, Long> sRegisterTimeMap = new HashMap();

    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    private static void addPullNotificationTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putLong(e.a.a.a.a.s("last_pull_notification_", str), System.currentTimeMillis()).commit();
    }

    private static short getDeviceStatus(MiPushMessage miPushMessage, boolean z) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        int intValue = TextUtils.isEmpty(str) ? 0 : Integer.valueOf(str).intValue();
        if (!z) {
            intValue = h.b.NOT_ALLOWED.a() + (intValue & (-4));
        }
        return (short) intValue;
    }

    public static boolean isRegistered(Context context, String str) {
        return b.m41a(context).a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, iv ivVar) {
        b.a aVar;
        String c2 = ivVar.c();
        if (ivVar.a() == 0 && (aVar = dataMap.get(c2)) != null) {
            aVar.a(ivVar.f808e, ivVar.f809f);
            b.m41a(context).a(c2, aVar);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(ivVar.f808e)) {
            arrayList = new ArrayList();
            arrayList.add(ivVar.f808e);
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fs.COMMAND_REGISTER.f436a, arrayList, ivVar.f796a, ivVar.f807d, null, null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(c2, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, jb jbVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fs.COMMAND_UNREGISTER.f436a, null, jbVar.f876a, jbVar.f884d, null, null);
        String a = jbVar.a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(a, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (b.m41a(context).m46a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            b.a a = b.m41a(context).a(str);
            if (a != null) {
                arrayList.add(a.f8961c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fs.COMMAND_REGISTER.f436a, arrayList, 0L, null, null, null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (shouldPullNotification(context, str)) {
                it itVar = new it();
                itVar.b(str2);
                itVar.c(ie.PullOfflineMessage.f611a);
                itVar.a(as.a());
                itVar.a(false);
                u.a(context).a(itVar, hu.Notification, false, true, null, false, str, str2);
                com.xiaomi.channel.commonutils.logger.c.b("MiPushClient4Hybrid pull offline pass through message");
                addPullNotificationTime(context, str);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - (sRegisterTimeMap.get(str) != null ? sRegisterTimeMap.get(str).longValue() : 0L)) < com.heytap.mcssdk.constant.a.r) {
            com.xiaomi.channel.commonutils.logger.c.m15a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(currentTimeMillis));
        String a2 = bm.a(6);
        b.a aVar = new b.a(context);
        aVar.c(str2, str3, a2);
        dataMap.put(str, aVar);
        iu iuVar = new iu();
        iuVar.a(as.a());
        iuVar.b(str2);
        iuVar.e(str3);
        iuVar.d(str);
        iuVar.f(a2);
        iuVar.c(com.xiaomi.push.h.m454a(context, context.getPackageName()));
        iuVar.b(com.xiaomi.push.h.a(context, context.getPackageName()));
        iuVar.d(com.xiaomi.push.h.a(context));
        iuVar.h(BuildConfig.VERSION_NAME);
        iuVar.a(BuildConfig.VERSION_CODE);
        iuVar.a(ii.Init);
        if (!com.xiaomi.push.k.m662e()) {
            String c2 = com.xiaomi.push.j.c(context);
            if (!TextUtils.isEmpty(c2)) {
                iuVar.i(bm.a(c2));
            }
        }
        int a3 = com.xiaomi.push.j.a();
        if (a3 >= 0) {
            iuVar.c(a3);
        }
        it itVar2 = new it();
        itVar2.c(ie.HybridRegister.f611a);
        itVar2.b(b.m41a(context).m42a());
        itVar2.d(context.getPackageName());
        itVar2.a(je.a(iuVar));
        itVar2.a(as.a());
        u.a(context).a((u) itVar2, hu.Notification, (ih) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        t.a(context, str);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("do not ack message, message is null");
            return;
        }
        try {
            ik ikVar = new ik();
            ikVar.b(b.m41a(context).m42a());
            ikVar.a(miPushMessage.getMessageId());
            ikVar.a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            ikVar.a(getDeviceStatus(miPushMessage, z));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                ikVar.c(miPushMessage.getTopic());
            }
            u.a(context).a((u) ikVar, hu.AckMessage, false, bf.a(PushMessageHelper.generateMessage(miPushMessage)));
            com.xiaomi.channel.commonutils.logger.c.b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        sCallback = miPushCallback;
    }

    private static boolean shouldPullNotification(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("last_pull_notification_");
        sb.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb.toString(), -1L)) > 300000;
    }

    public static void unregisterPush(Context context, String str) {
        sRegisterTimeMap.remove(str);
        b.a a = b.m41a(context).a(str);
        if (a == null) {
            return;
        }
        ja jaVar = new ja();
        jaVar.a(as.a());
        jaVar.d(str);
        jaVar.b(a.f51a);
        jaVar.c(a.f8961c);
        jaVar.e(a.b);
        it itVar = new it();
        itVar.c(ie.HybridUnregister.f611a);
        itVar.b(b.m41a(context).m42a());
        itVar.d(context.getPackageName());
        itVar.a(je.a(jaVar));
        itVar.a(as.a());
        u.a(context).a((u) itVar, hu.Notification, (ih) null);
        b.m41a(context).b(str);
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        ac.a(context, linkedList);
    }
}
