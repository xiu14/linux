package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.hu;
import com.xiaomi.push.iq;
import com.xiaomi.push.ix;
import com.xiaomi.push.je;
import com.xiaomi.push.service.ac;
import com.xiaomi.push.service.ay;
import com.xiaomi.push.service.z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class FCMPushHelper {
    private static void a(Context context, iq iqVar) {
        try {
            MiPushMessage generateMessage = PushMessageHelper.generateMessage((ix) r.a(context, iqVar), iqVar.m558a(), false);
            PushMessageReceiver a = f.a(context);
            if (a != null) {
                a.onNotificationMessageArrived(context, generateMessage);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("fcm broadcast notification come error ", th);
        }
    }

    private static boolean b(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getBoolean("is_xmsf_sup_decrypt", false);
    }

    public static void clearToken(Context context) {
        f.m62a(context, d.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        f.a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return f.m65a(context, d.ASSEMBLE_PUSH_FCM) && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (a = f.a(context)) == null) {
            return;
        }
        a.onNotificationMessageArrived(context, f.a(str));
    }

    public static Map<String, String> notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a = f.a(context)) != null) {
            a.onReceivePassThroughMessage(context, f.a(str));
        }
        String str2 = map.get("mipushContainer");
        if (TextUtils.isEmpty(str2)) {
            return new HashMap();
        }
        try {
            byte[] decode = Base64.decode(str2, 2);
            a(context, z.a(decode));
            a(context, decode);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("fcm notify notification error ", th);
        }
        return a(context);
    }

    public static void persistIfXmsfSupDecrypt(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) com.xiaomi.push.k.b(context)) >= 50002000).apply();
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(f.c(d.ASSEMBLE_PUSH_FCM), "fcm", 1L, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        f.m63a(context, d.ASSEMBLE_PUSH_FCM, str);
    }

    private static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("actionType", String.valueOf(hu.AckMessage.a()));
        hashMap.put("deviceStatus", String.valueOf((int) je.a(context, context.getPackageName())));
        hashMap.put("mat", Long.toString(System.currentTimeMillis()));
        return hashMap;
    }

    private static void a(Context context, byte[] bArr) {
        boolean m86a = u.a(context).m86a();
        boolean z = true;
        boolean z2 = !"com.xiaomi.xmsf".equals(context.getPackageName());
        boolean m34a = m34a(context);
        boolean z3 = false;
        if (m86a && z2 && m34a) {
            bArr = com.xiaomi.push.service.n.a(bArr, b.m41a(context).d());
            if (bArr == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("fcm message encrypt failed");
            } else {
                String encodeToString = Base64.encodeToString(bArr, 2);
                if (TextUtils.isEmpty(encodeToString)) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("fcm message buf base64 encode failed");
                    z = false;
                } else {
                    Intent intent = new Intent(ay.n);
                    intent.setPackage("com.xiaomi.xmsf");
                    intent.setClassName("com.xiaomi.xmsf", "com.xiaomi.push.service.XMPushService");
                    intent.putExtra("ext_fcm_container_buffer", encodeToString);
                    intent.putExtra("mipush_app_package", context.getPackageName());
                    context.startService(intent);
                    com.xiaomi.channel.commonutils.logger.c.m15a("fcm message reroute to xmsf");
                }
                z3 = z;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a(String.format("xmsf can not receive fcm msg - shouldUseMIUIPush=%s;isNotXmsf=%s;xmsfSupport=%s", Boolean.valueOf(m86a), Boolean.valueOf(z2), Boolean.valueOf(m34a)));
        }
        if (z3) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.b("fcm message post local");
        ac.m718a(context, z.a(bArr), bArr);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m34a(Context context) {
        return ((long) com.xiaomi.push.k.b(context)) >= 50002000 && b(context);
    }
}
