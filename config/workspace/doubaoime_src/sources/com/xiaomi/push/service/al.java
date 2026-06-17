package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import com.xiaomi.push.hz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TargetApi(24)
/* loaded from: classes2.dex */
class al {
    private static al a = new al();

    /* renamed from: a, reason: collision with other field name */
    private SpannableString f1028a;

    private class a {

        /* renamed from: a, reason: collision with other field name */
        List<b> f1029a;
        List<b> b;

        private a() {
            this.f1029a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    private class b {
        int a;

        /* renamed from: a, reason: collision with other field name */
        Notification f1030a;

        public b(int i, Notification notification) {
            this.a = i;
            this.f1030a = notification;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("id:");
            M.append(this.a);
            return M.toString();
        }
    }

    private al() {
    }

    public static al a() {
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m738a() {
        return true;
    }

    private boolean b(Context context) {
        return aq.a(context).a(hz.NotificationAutoGroupSwitch.a(), true);
    }

    private boolean a(Context context) {
        if (b(context) && an.m744a(context)) {
            return aq.a(context).a(hz.LatestNotificationNotIntoGroupSwitch.a(), false);
        }
        return false;
    }

    private String b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m740b(notification) ? a(notification) : notification.getGroup();
    }

    private String a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* renamed from: b, reason: collision with other method in class */
    private boolean m740b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), a(notification)));
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m739a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object a2 = com.xiaomi.push.bh.a((Object) notification, "isGroupSummary", (Object[]) null);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }

    private void b(Context context, int i, Notification notification) {
        String c2 = ao.c(notification);
        if (TextUtils.isEmpty(c2)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("group restore not extract pkg from notification:" + i);
            return;
        }
        an a2 = an.a(context, c2);
        List<StatusBarNotification> a3 = a(a2);
        if (a3 == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("group restore not get notifications");
            return;
        }
        for (StatusBarNotification statusBarNotification : a3) {
            Notification notification2 = statusBarNotification.getNotification();
            if (notification2 != null && m740b(notification2) && statusBarNotification.getId() != i) {
                Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                recoverBuilder.setGroup(a(notification2));
                ao.a(recoverBuilder, m739a(notification2));
                a2.a(statusBarNotification.getId(), recoverBuilder.build());
                com.xiaomi.channel.commonutils.logger.c.b("group restore notification:" + statusBarNotification.getId());
            }
        }
    }

    public String a(Context context, Notification.Builder builder, String str) {
        if (!m738a() || !a(context)) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", currentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(currentTimeMillis), str);
    }

    public void a(Context context, int i, Notification notification) {
        if (m738a()) {
            if (a(context)) {
                try {
                    b(context, i, notification);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("group notify handle restore error " + e2);
                }
            }
            if (b(context)) {
                try {
                    a(context, i, notification, true);
                } catch (Exception e3) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("group notify handle auto error " + e3);
                }
            }
        }
    }

    private void a(Context context, int i, Notification notification, boolean z) {
        Notification notification2;
        String c2 = ao.c(notification);
        if (TextUtils.isEmpty(c2)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("group auto not extract pkg from notification:" + i);
            return;
        }
        List<StatusBarNotification> a2 = a(an.a(context, c2));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("group auto not get notifications");
            return;
        }
        String b2 = b(notification);
        HashMap hashMap = new HashMap();
        for (StatusBarNotification statusBarNotification : a2) {
            if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i) {
                a(hashMap, statusBarNotification);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (!TextUtils.isEmpty(str)) {
                a aVar = (a) entry.getValue();
                if (z && str.equals(b2) && !m740b(notification)) {
                    b bVar = new b(i, notification);
                    if (m739a(notification)) {
                        aVar.b.add(bVar);
                    } else {
                        aVar.f1029a.add(bVar);
                    }
                }
                int size = aVar.f1029a.size();
                if (aVar.b.size() <= 0) {
                    if (z && size >= 2) {
                        a(context, c2, str, aVar.f1029a.get(0).f1030a);
                    }
                } else if (size <= 0) {
                    a(context, c2, str);
                } else if (aq.a(context).a(hz.NotificationGroupUpdateTimeSwitch.a(), false) && (notification2 = aVar.b.get(0).f1030a) != null) {
                    notification2.when = System.currentTimeMillis();
                    a(context, c2, str, notification2);
                }
            }
        }
    }

    private void a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String b2 = b(statusBarNotification.getNotification());
        a aVar = map.get(b2);
        if (aVar == null) {
            aVar = new a();
            map.put(b2, aVar);
        }
        b bVar = new b(statusBarNotification.getId(), statusBarNotification.getNotification());
        if (m739a(statusBarNotification.getNotification())) {
            aVar.b.add(bVar);
        } else {
            aVar.f1029a.add(bVar);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private SpannableString m737a(Context context, String str) {
        Resources resources;
        DisplayMetrics displayMetrics;
        int max;
        if (this.f1028a == null) {
            int i = 200;
            if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (max = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels)) > 0) {
                i = max / 16;
            }
            if (TextUtils.isEmpty(str)) {
                str = "新消息";
            }
            StringBuilder sb = new StringBuilder(str.length() + i + 12);
            sb.append(str);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append("GroupSummary");
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new ForegroundColorSpan(0), str.length(), sb.length(), 33);
            this.f1028a = spannableString;
        }
        return this.f1028a;
    }

    private void a(Context context, String str, String str2, Notification notification) {
        try {
            if (TextUtils.isEmpty(str2)) {
                com.xiaomi.channel.commonutils.logger.c.m15a("group show summary group is null");
                return;
            }
            int a2 = ao.a(context, str);
            if (a2 == 0) {
                com.xiaomi.channel.commonutils.logger.c.m15a("group show summary not get icon from " + str);
                return;
            }
            an a3 = an.a(context, str);
            int i = Build.VERSION.SDK_INT;
            String c2 = a3.c(notification.getChannelId(), "groupSummary");
            NotificationChannel m747a = a3.m747a(c2);
            if ("groupSummary".equals(c2) && m747a == null) {
                a3.a(new NotificationChannel(c2, "group_summary", 3));
            }
            Notification.Builder builder = new Notification.Builder(context, c2);
            ao.a(builder, true);
            Notification build = builder.setContentTitle(m737a(context, "新消息")).setContentText("你有一条新消息").setSmallIcon(Icon.createWithResource(str, a2)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (i >= 31) {
                build.contentIntent = a(context, str);
            }
            if (!com.xiaomi.push.k.m660c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                ao.m754a(build, str);
            }
            int a4 = a(str, str2);
            a3.a(a4, build);
            com.xiaomi.channel.commonutils.logger.c.b("group show summary notify:" + a4);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("group show summary error " + e2);
        }
    }

    private PendingIntent a(Context context, String str) {
        PendingIntent activity;
        if (context == null && TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("ctx or pkg must not be null in getting launch intent");
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("pm must not be null in getting launch intent");
                return null;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("targetIntent must not be null in getting launch intent");
                return null;
            }
            launchIntentForPackage.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 31) {
                activity = PendingIntent.getActivity(context, 0, launchIntentForPackage, 33554432);
            } else {
                activity = PendingIntent.getActivity(context, 0, launchIntentForPackage, 0);
            }
            return activity;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d("error occurred during getting launch pendingIntent. exception:" + th);
            return null;
        }
    }

    private void a(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.c.b("group cancel summary:" + str2);
        an.a(context, str).a(a(str, str2));
    }

    private int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    private List<StatusBarNotification> a(an anVar) {
        List<StatusBarNotification> c2 = anVar != null ? anVar.c() : null;
        if (c2 == null || c2.size() == 0) {
            return null;
        }
        return c2;
    }
}
