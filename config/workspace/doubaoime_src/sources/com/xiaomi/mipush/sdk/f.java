package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.message.log.PushLog;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ah;
import com.xiaomi.push.ax;
import com.xiaomi.push.bh;
import com.xiaomi.push.bl;
import com.xiaomi.push.iq;
import com.xiaomi.push.service.aq;
import com.xiaomi.push.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: com.xiaomi.mipush.sdk.f$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            d.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                d dVar = d.ASSEMBLE_PUSH_HUAWEI;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                d dVar2 = d.ASSEMBLE_PUSH_FCM;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                d dVar3 = d.ASSEMBLE_PUSH_COS;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = a;
                d dVar4 = d.ASSEMBLE_PUSH_FTOS;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m63a(Context context, d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int a = a(context, dVar, str);
        if (a == 0) {
            com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : do not need to send token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : send token upload, check:" + a);
        a(context, str);
        v m67a = g.m67a(dVar);
        if (m67a == null) {
            return;
        }
        u.a(context).a((String) null, m67a, dVar, "upload");
    }

    public static void b(final Context context, final d dVar, final String str) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.f.1
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String[] split = str.split(Constants.WAVE_SEPARATOR);
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str2 = "";
                        break;
                    }
                    String str3 = split[i];
                    if (!TextUtils.isEmpty(str3) && str3.startsWith("token:")) {
                        str2 = str3.substring(str3.indexOf(Constants.COLON_SEPARATOR) + 1);
                        break;
                    }
                    i++;
                }
                if (TextUtils.isEmpty(str2)) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : receive incorrect token");
                    return;
                }
                com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : receive correct token");
                f.d(context, dVar, str2);
                f.m61a(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context, d dVar, String str) {
        synchronized (f.class) {
            String a = a(dVar);
            if (TextUtils.isEmpty(a)) {
                com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(a, str).putString("last_check_token", b.m41a(context).m49c());
            if (m66a(dVar)) {
                edit.putInt(b(dVar), a());
            }
            edit.putString("syncingToken", "");
            com.xiaomi.push.q.a(edit);
            com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : update sp file success!  " + str);
        }
    }

    public static void b(Context context) {
        e.a(context).register();
    }

    public static void c(Context context) {
        e.a(context).unregister();
    }

    public static String b(d dVar) {
        return a(dVar) + "_version";
    }

    public static String c(d dVar) {
        int i = AnonymousClass2.a[dVar.ordinal()];
        if (i == 1) {
            return "hms_push_error";
        }
        if (i == 2) {
            return "fcm_push_error";
        }
        if (i == 3) {
            return "cos_push_error";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_error";
    }

    private static int a(Context context, d dVar, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a = a(dVar);
        String string = sharedPreferences.getString(a, "");
        String m49c = b.m41a(context).m49c();
        String string2 = sharedPreferences.getString("last_check_token", "");
        if (TextUtils.isEmpty(a)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return 0;
        }
        if (TextUtils.isEmpty(string)) {
            return 1;
        }
        if (!string.equals(str)) {
            return 2;
        }
        if (!TextUtils.equals(m49c, string2)) {
            return 3;
        }
        if (m66a(dVar)) {
            if (a() != sharedPreferences.getInt(b(dVar), 0)) {
                return 4;
            }
        }
        return 0;
    }

    static String a(Context context, d dVar) {
        return a(context, dVar, false);
    }

    public static boolean a(iq iqVar, d dVar) {
        if (iqVar == null || iqVar.m558a() == null || iqVar.m558a().m525a() == null) {
            return false;
        }
        return (dVar == d.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(iqVar.m558a().m525a().get("assemble_push_type"));
    }

    public static byte[] a(Context context, iq iqVar, d dVar) {
        if (a(iqVar, dVar)) {
            return bl.m132a(a(context, dVar));
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    static void m61a(Context context) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a = a(d.ASSEMBLE_PUSH_HUAWEI);
        String a2 = a(d.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(a, "")) && TextUtils.isEmpty(sharedPreferences.getString(a2, ""))) {
            z = true;
        }
        if (z) {
            u.a(context).a(2, a);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m62a(Context context, d dVar) {
        String a = a(dVar);
        if (TextUtils.isEmpty(a)) {
            return;
        }
        com.xiaomi.push.q.a(context.getSharedPreferences("mipush_extra", 0).edit().putString(a, ""));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m65a(Context context, d dVar) {
        if (g.m68a(dVar) != null) {
            return aq.a(context).a(g.m68a(dVar).a(), true);
        }
        return false;
    }

    public static void a(String str, int i) {
        MiTinyDataClient.upload("hms_push_error", str, 1L, e.a.a.a.a.j("error code = ", i));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m64a(Context context) {
        if (context == null) {
            return false;
        }
        return ax.m117a(context);
    }

    private static synchronized void a(Context context, String str) {
        synchronized (f.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString("syncingToken", str);
            edit.apply();
        }
    }

    protected static synchronized String a(Context context, d dVar, boolean z) {
        synchronized (f.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
            if (z) {
                String string = sharedPreferences.getString("syncingToken", "");
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
            String a = a(dVar);
            if (TextUtils.isEmpty(a)) {
                return "";
            }
            return sharedPreferences.getString(a, "");
        }
    }

    protected static PushMessageReceiver a(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                Iterator<ResolveInfo> it2 = queryBroadcastReceivers.iterator();
                while (it2.hasNext()) {
                    resolveInfo = it2.next();
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName())) {
                        break;
                    }
                }
            }
            resolveInfo = null;
            if (resolveInfo != null) {
                return (PushMessageReceiver) com.xiaomi.push.t.a(context, resolveInfo.activityInfo.name).newInstance();
            }
            return null;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.d(e2.toString());
            return null;
        }
    }

    public static void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("pushMsg")) {
            return;
        }
        intent.putExtra(PushMessageHelper.KEY_MESSAGE, a(extras.getString("pushMsg")));
    }

    public static MiPushMessage a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has(com.heytap.mcssdk.constant.b.i)) {
                    miPushMessage.setDescription(jSONObject.getString(com.heytap.mcssdk.constant.b.i));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has(RemoteMessageConst.Notification.NOTIFY_ID)) {
                    miPushMessage.setNotifyId(jSONObject.getInt(RemoteMessageConst.Notification.NOTIFY_ID));
                }
                if (jSONObject.has(PushLog.KEY_CATEGORY)) {
                    miPushMessage.setCategory(jSONObject.getString(PushLog.KEY_CATEGORY));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    if (hashMap.size() > 0) {
                        miPushMessage.setExtra(hashMap);
                    }
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d(e2.toString());
            }
        }
        return miPushMessage;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static HashMap<String, String> m60a(Context context, d dVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        int i = AnonymousClass2.a[dVar.ordinal()];
        String str = null;
        ApplicationInfo applicationInfo = null;
        if (i == 1) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d(e2.toString());
            }
            str = new u.a(Constants.COLON_SEPARATOR, Constants.WAVE_SEPARATOR).a(Constants.PHONE_BRAND, q.HUAWEI.name()).a("token", a(context, dVar, true)).a(Constants.PACKAGE_NAME, context.getPackageName()).a("app_id", Integer.valueOf(applicationInfo != null ? applicationInfo.metaData.getInt(Constants.HUAWEI_HMS_CLIENT_APPID) : -1)).toString();
        } else if (i == 2) {
            u.a a = new u.a(Constants.COLON_SEPARATOR, Constants.WAVE_SEPARATOR).a(Constants.PHONE_BRAND, q.FCM.name()).a("token", a(context, dVar, false)).a(Constants.PACKAGE_NAME, context.getPackageName());
            int a2 = a();
            if (a2 != 0) {
                a.a("version", Integer.valueOf(a2));
            } else {
                a.a("version", Integer.valueOf(BuildConfig.VERSION_CODE));
            }
            str = a.toString();
        } else if (i == 3) {
            str = new u.a(Constants.COLON_SEPARATOR, Constants.WAVE_SEPARATOR).a(Constants.PHONE_BRAND, q.OPPO.name()).a("token", a(context, dVar, true)).a(Constants.PACKAGE_NAME, context.getPackageName()).toString();
        } else if (i == 4) {
            u.a a3 = new u.a(Constants.COLON_SEPARATOR, Constants.WAVE_SEPARATOR).a(Constants.PHONE_BRAND, q.VIVO.name()).a("token", a(context, dVar, true)).a(Constants.PACKAGE_NAME, context.getPackageName());
            int a4 = a();
            if (a4 != 0) {
                a3.a("version", Integer.valueOf(a4));
            }
            str = a3.toString();
        }
        hashMap.put(Constants.ASSEMBLE_PUSH_REG_INFO, str);
        return hashMap;
    }

    public static int a() {
        Integer num = (Integer) bh.a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m66a(d dVar) {
        return dVar == d.ASSEMBLE_PUSH_FTOS || dVar == d.ASSEMBLE_PUSH_FCM;
    }

    public static String a(d dVar) {
        int i = AnonymousClass2.a[dVar.ordinal()];
        if (i == 1) {
            return "hms_push_token";
        }
        if (i == 2) {
            return "fcm_push_token_v2";
        }
        if (i == 3) {
            return "cos_push_token";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_token";
    }
}
