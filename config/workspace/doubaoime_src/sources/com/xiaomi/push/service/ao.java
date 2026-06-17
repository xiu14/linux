package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public class ao {
    public static final a<String, String, String> a;

    /* renamed from: a, reason: collision with other field name */
    static Boolean f1039a;
    public static final a<String, String, String> b;

    /* renamed from: c, reason: collision with root package name */
    public static final a<String, String, String> f9311c;

    /* renamed from: d, reason: collision with root package name */
    public static final a<String, String, String> f9312d;

    /* renamed from: e, reason: collision with root package name */
    public static final a<String, String, String> f9313e;

    /* renamed from: f, reason: collision with root package name */
    public static final a<String, String, String> f9314f;

    /* renamed from: g, reason: collision with root package name */
    public static final a<String, String, String> f9315g;
    public static final a<String, String, String> h;

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f1041a = {"com.mi.globalbrowser", "com.android.browser"};

    /* renamed from: a, reason: collision with other field name */
    private static String f1040a = null;

    public static class a<F, S, T> {
        F a;
        S b;

        /* renamed from: c, reason: collision with root package name */
        T f9316c;

        private a(F f2, S s, T t) {
            this.a = f2;
            this.b = s;
            this.f9316c = t;
        }
    }

    static {
        String str = "getNotificationSettings";
        a = new a<>(str, str, str);
        String str2 = "canSound";
        b = new a<>("setSound", str2, str2);
        String str3 = "canVibrate";
        f9311c = new a<>("setVibrate", str3, str3);
        String str4 = "canLights";
        f9312d = new a<>("setLights", str4, str4);
        String str5 = "canShowOnKeyguard";
        f9313e = new a<>("setShowOnKeyguard", str5, str5);
        f9314f = new a<>("setFloat", "canFloat", "canShowFloat");
        String str6 = "canShowBadge";
        f9315g = new a<>("setShowBadge", str6, str6);
        String str7 = "canShowOngoing";
        h = new a<>("setShowOngoing", str7, str7);
    }

    public static boolean a() {
        if (f1039a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Bundle m792a = g.m792a("com.xiaomi.xmsf", (String) null);
                if (m792a == null || m792a.isEmpty()) {
                    f1039a = Boolean.FALSE;
                } else {
                    f1039a = Boolean.TRUE;
                }
            } else {
                f1039a = Boolean.FALSE;
            }
        }
        return f1039a.booleanValue();
    }

    public static String b(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String c(Notification notification) {
        Object a2;
        try {
            Bundle bundle = notification.extras;
            r0 = bundle != null ? bundle.getString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE) : null;
            return (!TextUtils.isEmpty(r0) || (a2 = com.xiaomi.push.bh.a(notification, "extraNotification")) == null) ? r0 : (String) com.xiaomi.push.bh.a(a2, "getTargetPkg", new Object[0]);
        } catch (Exception unused) {
            return r0;
        }
    }

    public static String d(Notification notification) {
        return (String) a(notification, "message_id", "");
    }

    public static void b(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 != null) {
                com.xiaomi.push.bh.a(a2, "setEnableKeyguard", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    public static String a(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Notification.Action[] m756a(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }

    public static <T> T a(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Map<String, String> map, Bundle bundle, String str) {
        if (map != null && bundle != null && !TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(map.get(str))) {
                bundle.remove(str);
                return;
            } else {
                bundle.putString(str, map.get(str));
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("cp map to b fail:" + str);
    }

    public static void a(Map<String, String> map, Bundle bundle, String str, String str2, boolean z) {
        if (map != null && bundle != null && !TextUtils.isEmpty(str)) {
            String remove = z ? map.remove(str) : map.get(str);
            if (TextUtils.isEmpty(remove)) {
                bundle.remove(str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            bundle.putString(str, remove);
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("cp map to b fail:" + str);
    }

    /* renamed from: a, reason: collision with other method in class */
    static void m754a(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, str);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 != null) {
                com.xiaomi.push.bh.a(a2, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    static void a(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 != null) {
                com.xiaomi.push.bh.a(a2, "setEnableFloat", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    static void a(Notification notification, int i) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 != null) {
                com.xiaomi.push.bh.a(a2, "setMessageCount", Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    static void a(Notification notification, int i, int i2) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i);
            notification.extras.putInt("mipush_class", i2);
        }
    }

    public static String a(Object obj) {
        return (String) a(obj, "msg_busi_type", "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T a(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            r0 = 0
            boolean r1 = r2 instanceof android.app.Notification     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto Ld
            android.app.Notification r2 = (android.app.Notification) r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = a(r2, r3)     // Catch: java.lang.Exception -> L38
        Lb:
            r0 = r2
            goto L4d
        Ld:
            boolean r1 = r2 instanceof java.util.Map     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L18
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L38
            goto Lb
        L18:
            boolean r1 = r2 instanceof android.os.Bundle     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L23
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L38
            goto Lb
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38
            r3.<init>()     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = "not support get value from classType:"
            r3.append(r1)     // Catch: java.lang.Exception -> L38
            r3.append(r2)     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L38
            com.xiaomi.channel.commonutils.logger.c.m15a(r2)     // Catch: java.lang.Exception -> L38
            goto L4d
        L38:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "get value error "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.xiaomi.channel.commonutils.logger.c.m15a(r2)
        L4d:
            if (r0 != 0) goto L50
            goto L51
        L50:
            r4 = r0
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ao.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    static int a(Context context, String str) {
        return com.xiaomi.push.h.b(context, str);
    }

    static void a(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f1041a));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str2);
                try {
                    if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                        intent.setPackage(str2);
                        break;
                    }
                    continue;
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("can't match url intent. " + e2);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    public static int a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("get user aggregate failed, " + e2);
            return 0;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m755a(ContentResolver contentResolver) {
        int a2 = a(contentResolver);
        return a2 == 1 || a2 == 2;
    }

    public static boolean a(Map<String, String> map) {
        return Boolean.parseBoolean((String) a(map, "not_suppress", "true"));
    }

    public static boolean a(Notification.Builder builder, boolean z) {
        builder.setGroupAlertBehavior(z ? 2 : 1);
        return true;
    }

    public static int a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle a2 = a(context, aVar.b, str, str2, (Bundle) null);
            if (a2 == null || !a2.containsKey(aVar.f9316c)) {
                return -1;
            }
            return a2.getBoolean(aVar.f9316c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Bundle a(Context context, String str, String str2) {
        try {
            Bundle a2 = a(context, a.b, str, str2, (Bundle) null);
            if (a2 != null) {
                return a2;
            }
        } catch (Exception unused) {
        }
        return new Bundle();
    }

    public static boolean a(Context context, String str, String str2, a<String, String, String> aVar, boolean z) {
        if (aVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean(aVar.f9316c, z);
                a(context, aVar.a, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Bundle a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("package", str2);
            if (!TextUtils.isEmpty(str3)) {
                bundle2.putString(WsConstants.KEY_CHANNEL_ID, str3);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
        }
        throw new IllegalArgumentException("call notification provider failed!");
    }

    public static String a(StatusBarNotification statusBarNotification) {
        return statusBarNotification == null ? "" : (String) com.xiaomi.push.bh.a((Object) statusBarNotification, "getOpPkg", new Object[0]);
    }
}
