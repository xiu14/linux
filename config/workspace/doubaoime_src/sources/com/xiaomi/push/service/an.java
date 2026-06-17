package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.xiaomi.push.hz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class an {
    private static Context a;

    /* renamed from: a, reason: collision with other field name */
    private static Object f1035a;

    /* renamed from: a, reason: collision with other field name */
    private static WeakHashMap<Integer, an> f1036a = new WeakHashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private static boolean f1037a;

    /* renamed from: a, reason: collision with other field name */
    private String f1038a;
    private String b;

    private an(String str) {
        this.f1038a = str;
    }

    public static String b(String str, String str2) {
        return a(m743a() ? "mipush|%s|%s" : "mipush_%s_%s", str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Context m748a() {
        return a;
    }

    String c(String str, String str2) {
        return m743a() ? str : str2;
    }

    public String toString() {
        return e.a.a.a.a.J(e.a.a.a.a.M("NotificationManagerHelper{"), this.f1038a, "}");
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m749a() {
        return this.f1038a;
    }

    public List<StatusBarNotification> c() {
        String str = this.f1038a;
        NotificationManager a2 = a();
        List<StatusBarNotification> list = null;
        try {
            if (m743a()) {
                int a3 = com.xiaomi.push.j.a();
                if (a3 != -1) {
                    list = (List) a(com.xiaomi.push.bh.a(f1035a, "getAppActiveNotifications", str, Integer.valueOf(a3)));
                }
            } else {
                StatusBarNotification[] activeNotifications = a2.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(ao.c(statusBarNotification.getNotification()))) {
                                arrayList.add(statusBarNotification);
                            }
                        }
                        list = arrayList;
                    } catch (Throwable th) {
                        th = th;
                        list = arrayList;
                        m742a(e.a.a.a.a.w("getActiveNotifications error ", th));
                        return list;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return list;
    }

    public static an a(Context context, String str) {
        a(context);
        int hashCode = str.hashCode();
        an anVar = f1036a.get(Integer.valueOf(hashCode));
        if (anVar != null) {
            return anVar;
        }
        an anVar2 = new an(str);
        f1036a.put(Integer.valueOf(hashCode), anVar2);
        return anVar2;
    }

    private String b(String str) {
        return b(this.f1038a, str);
    }

    String b() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = b(DownloadSettingKeys.BugFix.DEFAULT);
        }
        return this.b;
    }

    /* renamed from: b, reason: collision with other method in class */
    public List<StatusBarNotification> m753b() {
        List<StatusBarNotification> c2 = c();
        if (c2 == null) {
            return new ArrayList();
        }
        ListIterator<StatusBarNotification> listIterator = c2.listIterator();
        while (listIterator.hasNext()) {
            if (!a(listIterator.next())) {
                listIterator.remove();
            }
        }
        return c2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m744a(Context context) {
        a(context);
        return m743a();
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a2 = a("mipush|%s|%s", str2, "");
        return str.startsWith(a2) ? a("mipush_%s_%s", str2, str.replace(a2, "")) : str;
    }

    private static void a(Context context) {
        if (a == null) {
            a = context.getApplicationContext();
            NotificationManager a2 = a();
            Boolean bool = (Boolean) com.xiaomi.push.bh.a((Object) a2, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m742a("fwk is support.init:" + bool);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            f1037a = booleanValue;
            if (booleanValue) {
                f1035a = com.xiaomi.push.bh.a((Object) a2, "getService", new Object[0]);
            }
        }
    }

    private static NotificationManager a() {
        return (NotificationManager) a.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m743a() {
        if (com.xiaomi.push.k.m654a() && aq.a(a).a(hz.NotificationBelongToAppSwitch.a(), true)) {
            return f1037a;
        }
        return false;
    }

    private static int a(String str) {
        try {
            return a.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    private static Object a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    private static <T> T a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m752a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(b(""));
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m750a(String str) {
        if (TextUtils.isEmpty(str)) {
            return b();
        }
        return com.xiaomi.push.k.m655a(m748a()) ? b(str) : str;
    }

    @TargetApi(26)
    void a(NotificationChannel notificationChannel) {
        String str = this.f1038a;
        try {
            if (m743a()) {
                int a2 = a(str);
                if (a2 != -1) {
                    com.xiaomi.push.bh.b(f1035a, "createNotificationChannelsForPackage", str, Integer.valueOf(a2), a(Arrays.asList(notificationChannel)));
                }
            } else {
                a().createNotificationChannel(notificationChannel);
            }
        } catch (Exception e2) {
            m742a("createNotificationChannel error" + e2);
        }
    }

    @TargetApi(26)
    /* renamed from: a, reason: collision with other method in class */
    public NotificationChannel m747a(String str) {
        NotificationChannel notificationChannel = null;
        try {
            if (m743a()) {
                List<NotificationChannel> m751a = m751a();
                if (m751a != null) {
                    for (NotificationChannel notificationChannel2 : m751a) {
                        if (str.equals(notificationChannel2.getId())) {
                            notificationChannel = notificationChannel2;
                            break;
                        }
                    }
                }
            } else {
                notificationChannel = a().getNotificationChannel(str);
            }
        } catch (Exception e2) {
            m742a("getNotificationChannel error" + e2);
        }
        return notificationChannel;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    /* renamed from: a, reason: collision with other method in class */
    public List<NotificationChannel> m751a() {
        String str;
        String str2 = this.f1038a;
        List<NotificationChannel> list = null;
        try {
            if (m743a()) {
                int a2 = a(str2);
                if (a2 != -1) {
                    Object obj = f1035a;
                    Object[] objArr = {str2, Integer.valueOf(a2), Boolean.FALSE};
                    str = "mipush|%s|%s";
                    list = (List) a(com.xiaomi.push.bh.a(obj, "getNotificationChannelsForPackage", objArr));
                } else {
                    str = null;
                }
            } else {
                list = a().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!com.xiaomi.push.k.m654a() || list == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            String a3 = a(str, str2, "");
            for (NotificationChannel notificationChannel : list) {
                if (notificationChannel.getId().startsWith(a3)) {
                    arrayList.add(notificationChannel);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            m742a("getNotificationChannels error " + e2);
            return list;
        }
    }

    void a(NotificationChannel notificationChannel, boolean z) {
        String str = this.f1038a;
        try {
            if (z) {
                int a2 = a(str);
                if (a2 != -1) {
                    com.xiaomi.push.bh.b(f1035a, "updateNotificationChannelForPackage", str, Integer.valueOf(a2), notificationChannel);
                }
            } else {
                a(notificationChannel);
            }
        } catch (Exception e2) {
            m742a("updateNotificationChannel error " + e2);
        }
    }

    public void a(int i, Notification notification) {
        String str = this.f1038a;
        NotificationManager a2 = a();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (m743a()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i2 >= 29) {
                    a2.notifyAsPackage(str, null, i, notification);
                } else {
                    a2.notify(i, notification);
                }
            } else {
                a2.notify(i, notification);
            }
        } catch (Exception unused) {
        }
    }

    public void a(int i) {
        String str = this.f1038a;
        try {
            if (m743a()) {
                int a2 = com.xiaomi.push.j.a();
                String packageName = m748a().getPackageName();
                if (Build.VERSION.SDK_INT >= 30) {
                    com.xiaomi.push.bh.b(f1035a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(a2));
                } else {
                    com.xiaomi.push.bh.b(f1035a, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(a2));
                }
                m742a("cancel succ:" + i);
                return;
            }
            a().cancel(i);
        } catch (Exception e2) {
            m742a("cancel error" + e2);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private StatusBarNotification[] m746a() {
        if (!com.xiaomi.push.k.m655a(m748a())) {
            return null;
        }
        try {
            Object a2 = com.xiaomi.push.bh.a(f1035a, "getActiveNotifications", m748a().getPackageName());
            if (a2 instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) a2;
            }
            return null;
        } catch (Throwable th) {
            m742a(e.a.a.a.a.w("getAllNotifications error ", th));
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    static void m742a(String str) {
        com.xiaomi.channel.commonutils.logger.c.m15a("NMHelper:" + str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m745a(String str, String str2) {
        return str.startsWith(b(str2, ""));
    }

    public static boolean a(StatusBarNotification statusBarNotification) {
        return (statusBarNotification == null || statusBarNotification.getNotification() == null || TextUtils.isEmpty(ao.d(statusBarNotification.getNotification())) || !TextUtils.equals(ao.a(statusBarNotification), "com.xiaomi.xmsf") || !m745a(statusBarNotification.getNotification().getChannelId(), statusBarNotification.getPackageName())) ? false : true;
    }
}
