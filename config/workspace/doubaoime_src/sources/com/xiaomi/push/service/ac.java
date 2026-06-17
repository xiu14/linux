package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vivo.push.PushClient;
import com.xiaomi.push.ah;
import com.xiaomi.push.eo;
import com.xiaomi.push.fe;
import com.xiaomi.push.ff;
import com.xiaomi.push.fg;
import com.xiaomi.push.h;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import com.xiaomi.push.service.am;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ac {
    public static long a;

    /* renamed from: a, reason: collision with other field name */
    private static volatile ah f1001a;

    /* renamed from: a, reason: collision with other field name */
    private static final LinkedList<Pair<Integer, iq>> f1002a = new LinkedList<>();

    /* renamed from: a, reason: collision with other field name */
    private static ExecutorService f1003a = Executors.newCachedThreadPool();

    /* renamed from: com.xiaomi.push.service.ac$1, reason: invalid class name */
    class AnonymousClass1 extends ah.a {
        final /* synthetic */ int a;

        /* renamed from: a, reason: collision with other field name */
        final /* synthetic */ an f1004a;

        /* renamed from: a, reason: collision with other field name */
        final /* synthetic */ String f1005a;

        AnonymousClass1(String str, an anVar, int i) {
            this.f1005a = str;
            this.f1004a = anVar;
            this.a = i;
        }

        @Override // com.xiaomi.push.ah.a
        /* renamed from: a */
        public String mo139a() {
            return this.f1005a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1004a.a(this.a);
        }
    }

    static class a {
        public PendingIntent a;

        /* renamed from: a, reason: collision with other field name */
        public Intent f1006a;

        public a(PendingIntent pendingIntent, Intent intent) {
            this.a = pendingIntent;
            this.f1006a = intent;
        }
    }

    private static class b implements Callable<Bitmap> {
        private Context a;

        /* renamed from: a, reason: collision with other field name */
        private String f1007a;

        /* renamed from: a, reason: collision with other field name */
        private boolean f1008a;

        public b(String str, Context context, boolean z) {
            this.a = context;
            this.f1007a = str;
            this.f1008a = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() {
            if (TextUtils.isEmpty(this.f1007a)) {
                com.xiaomi.channel.commonutils.logger.c.m15a("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            if (this.f1007a.startsWith("http")) {
                am.b a = am.a(this.a, this.f1007a, this.f1008a);
                if (a != null) {
                    return a.f1034a;
                }
                com.xiaomi.channel.commonutils.logger.c.m15a("Failed get online picture/icon resource");
                return null;
            }
            Bitmap a2 = am.a(this.a, this.f1007a);
            if (a2 != null) {
                return a2;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("Failed get online picture/icon resource");
            return a2;
        }
    }

    public static class c {
        long a = 0;

        /* renamed from: a, reason: collision with other field name */
        Notification f1009a;
    }

    public static class d {

        /* renamed from: a, reason: collision with other field name */
        public String f1011a;

        /* renamed from: a, reason: collision with other field name */
        public long f1010a = 0;

        /* renamed from: a, reason: collision with other field name */
        public boolean f1012a = false;
        public int a = 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m722a(Context context, String str) {
        return com.xiaomi.push.h.m460b(context, str);
    }

    private static void b(Context context, Intent intent, iq iqVar, ih ihVar, String str, int i, Bundle bundle) {
        if (TextUtils.isEmpty(str) || !m724a(ihVar) || bundle == null) {
            return;
        }
        bundle.putBoolean("mipush_direct_pull", true);
        bundle.putString("messageId", ihVar.m524a());
        bundle.putString("job_key", a(ihVar.m525a(), "jobkey"));
        bundle.putInt("0_target_component", a(context, iqVar.f738b, ihVar.m525a(), 0, bundle));
        try {
            ih a2 = a(ihVar);
            if (a2.m525a() == null) {
                a2.a(new HashMap());
            }
            a2.m525a().put("notification_click_button", String.valueOf(i));
            bundle.putByteArray("push_meta", je.a(a2));
        } catch (Throwable unused) {
            com.xiaomi.channel.commonutils.logger.c.m15a("add stat param for direct pull fail");
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    private static boolean m732c(Map<String, String> map) {
        if (map != null) {
            return "6".equals(map.get("notification_style_type"));
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("meta extra is null");
        return false;
    }

    public static boolean d(iq iqVar) {
        return iqVar.a() == hu.Registration;
    }

    public static boolean e(iq iqVar) {
        return m725a(iqVar) || c(iqVar) || m730b(iqVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m723a(Context context, String str, boolean z) {
        return com.xiaomi.push.k.m654a() && !z && m722a(context, str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static d m718a(Context context, iq iqVar, byte[] bArr) {
        return a(context, iqVar, bArr, (Map<String, String>) null);
    }

    static void c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    public static d a(Context context, iq iqVar, byte[] bArr, Map<String, String> map) {
        Map<String, String> map2;
        int i;
        Bundle bundle;
        d dVar = new d();
        h.b a2 = com.xiaomi.push.h.a(context, m719a(iqVar), true);
        ih m558a = iqVar.m558a();
        if (m558a != null) {
            i = m558a.c();
            map2 = m558a.m525a();
        } else {
            map2 = null;
            i = 0;
        }
        int b2 = com.xiaomi.push.u.b(m719a(iqVar), i);
        if (com.xiaomi.push.k.m655a(context) && a2 == h.b.NOT_ALLOWED) {
            if (m558a != null) {
                eo a3 = eo.a(context.getApplicationContext());
                String b3 = iqVar.b();
                String b4 = b(iqVar);
                String m524a = m558a.m524a();
                StringBuilder M = e.a.a.a.a.M("10:");
                M.append(m719a(iqVar));
                a3.a(b3, b4, m524a, M.toString());
            }
            StringBuilder M2 = e.a.a.a.a.M("Do not notify because user block ");
            M2.append(m719a(iqVar));
            M2.append("‘s notification");
            com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
            dVar.a = 1;
            return dVar;
        }
        if (com.xiaomi.push.k.m655a(context) && f1001a != null && f1001a.m734a(context, b2, m719a(iqVar), map2)) {
            if (m558a != null) {
                eo a4 = eo.a(context.getApplicationContext());
                String b5 = iqVar.b();
                String b6 = b(iqVar);
                String m524a2 = m558a.m524a();
                StringBuilder M3 = e.a.a.a.a.M("14:");
                M3.append(m719a(iqVar));
                a4.a(b5, b6, m524a2, M3.toString());
                HashMap hashMap = new HashMap();
                hashMap.put(WsConstants.KEY_CONNECTION_ERROR, "sweet_or_voip_canceled_or_sequence_incorrect");
                a(iqVar.m559a(), m558a.m524a(), iqVar.b(), hashMap);
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("Do not notify because card notification is canceled or sequence incorrect");
            dVar.a = 2;
            return dVar;
        }
        RemoteViews a5 = a(context, iqVar, bArr);
        Bundle bundle2 = new Bundle();
        a a6 = a(context, iqVar, iqVar.b(), bArr, b2, bundle2);
        PendingIntent pendingIntent = a6.a;
        if (pendingIntent == null) {
            if (m558a != null) {
                eo.a(context.getApplicationContext()).a(iqVar.b(), b(iqVar), m558a.m524a(), "11");
                HashMap hashMap2 = new HashMap();
                hashMap2.put(WsConstants.KEY_CONNECTION_ERROR, "pending_intent_null");
                a(iqVar.m559a(), m558a.m524a(), iqVar.b(), hashMap2);
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("The click PendingIntent is null. ");
            dVar.a = 3;
            return dVar;
        }
        c a7 = a(context, iqVar, bArr, a5, pendingIntent, b2);
        dVar.f1010a = a7.a;
        dVar.f1011a = m719a(iqVar);
        Notification notification = a7.f1009a;
        if (com.xiaomi.push.k.m655a(context) && notification != null && (bundle = notification.extras) != null && map2 != null) {
            bundle.putAll(bundle2);
            a(notification, map2);
            ao.a(map2, notification.extras, "use_clicked_activity", "xmsf.stat.useNCA", false);
            ao.a(map2, notification.extras, "high_priority_event", "xmsf.stat.highPriorityEvent", false);
            ao.a(map2, notification.extras, "msg_busi_type", "xmsf.stat.msgBusiType", false);
            ao.a(map2, notification.extras, "simplify_pull_type", "xmsf.stat.sPullType", false);
        }
        if (com.xiaomi.push.k.m654a()) {
            if (!TextUtils.isEmpty(m558a.m524a())) {
                notification.extras.putString("message_id", m558a.m524a());
            }
            notification.extras.putString("local_paid", iqVar.m559a());
            ao.a(map2, notification.extras, "msg_busi_type");
            ao.a(map2, notification.extras, "disable_notification_flags");
            String str = m558a.m530b() == null ? null : m558a.m530b().get("score_info");
            if (!TextUtils.isEmpty(str)) {
                notification.extras.putString("score_info", str);
            }
            notification.extras.putString("pushUid", a(m558a.f646a, "n_stats_expose"));
            notification.extras.putString("eventMessageType", String.valueOf(a(iqVar)));
            notification.extras.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, m719a(iqVar));
            a(context, iqVar, notification, map);
            if (aa.c(iqVar)) {
                notification.extras.putString("box_message", "true");
            }
        }
        String str2 = m558a.m525a() == null ? null : m558a.m525a().get("message_count");
        if (com.xiaomi.push.k.m654a() && str2 != null) {
            try {
                ao.a(notification, Integer.parseInt(str2));
            } catch (NumberFormatException e2) {
                eo.a(context.getApplicationContext()).b(iqVar.b(), b(iqVar), m558a.m524a(), "8");
                com.xiaomi.channel.commonutils.logger.c.d("fail to set message count. " + e2);
            }
        }
        String m719a = m719a(iqVar);
        ao.m754a(notification, m719a);
        an a8 = an.a(context, m719a);
        if (com.xiaomi.push.k.m655a(context) && f1001a != null) {
            f1001a.a(iqVar, m558a.m525a(), b2, notification);
        }
        if (com.xiaomi.push.k.m655a(context) && f1001a != null && f1001a.a(m558a.m525a(), b2, notification)) {
            com.xiaomi.channel.commonutils.logger.c.b("consume this notificaiton by agent");
            dVar.a = 4;
        } else {
            aa.a(iqVar, a6.f1006a, a6.a);
            a8.a(b2, notification);
            dVar.f1012a = true;
            dVar.a = 5;
            StringBuilder M4 = e.a.a.a.a.M("notification: ");
            M4.append(m558a.m524a());
            M4.append(" is notifyied");
            com.xiaomi.channel.commonutils.logger.c.m15a(M4.toString());
        }
        if (com.xiaomi.push.k.m654a() && com.xiaomi.push.k.m655a(context)) {
            al.a().a(context, b2, notification);
            bn.m790a(context, m719a, b2, m558a.m524a(), notification);
        }
        if (m725a(iqVar)) {
            eo.a(context.getApplicationContext()).a(iqVar.b(), b(iqVar), m558a.m524a(), 3002, null);
        }
        if (c(iqVar)) {
            eo.a(context.getApplicationContext()).a(iqVar.b(), b(iqVar), m558a.m524a(), 1002, null);
        }
        Pair<Integer, iq> pair = new Pair<>(Integer.valueOf(b2), iqVar);
        LinkedList<Pair<Integer, iq>> linkedList = f1002a;
        synchronized (linkedList) {
            linkedList.add(pair);
            if (linkedList.size() > 100) {
                linkedList.remove();
            }
        }
        return dVar;
    }

    public static boolean c(iq iqVar) {
        ih m558a = iqVar.m558a();
        return b(m558a) && m558a.f648b == 0 && !m725a(iqVar);
    }

    private static int c(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            com.xiaomi.channel.commonutils.logger.c.c("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.d("parsing notification priority error: " + e2);
            return 0;
        }
    }

    private static int b(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int b(Context context, String str) {
        int a2 = a(context, str, "mipush_notification");
        int a3 = a(context, str, "mipush_small_notification");
        if (a2 <= 0) {
            a2 = a3 > 0 ? a3 : context.getApplicationInfo().icon;
        }
        return a2 == 0 ? context.getApplicationInfo().logo : a2;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m728b(Context context, String str) {
        if (!com.xiaomi.push.k.m655a(context) || f1001a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f1001a.a(str);
    }

    /* renamed from: b, reason: collision with other method in class */
    static boolean m729b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    static void b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    private static boolean b(ih ihVar) {
        if (ihVar == null) {
            return false;
        }
        String m524a = ihVar.m524a();
        return !TextUtils.isEmpty(m524a) && m524a.length() == 22 && "satuigmo".indexOf(m524a.charAt(0)) >= 0;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m730b(iq iqVar) {
        ih m558a = iqVar.m558a();
        return b(m558a) && m558a.f648b == 1 && !m725a(iqVar);
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m731b(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        return TextUtils.equals(map.get("hyper_type"), ExifInterface.GPS_MEASUREMENT_3D);
    }

    public static String b(iq iqVar) {
        return m725a(iqVar) ? "E100002" : c(iqVar) ? "E100000" : m730b(iqVar) ? "E100001" : d(iqVar) ? "E100003" : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent b(android.content.Context r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ac.b(android.content.Context, java.lang.String, java.util.Map, int, android.os.Bundle):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(android.content.Context r2, java.lang.String r3, com.xiaomi.push.ff r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            boolean r0 = com.xiaomi.push.k.m655a(r2)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "fcm_icon_uri"
            java.lang.String r0 = a(r5, r0)
            java.lang.String r1 = "fcm_icon_color"
            java.lang.String r5 = a(r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2c
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L2c
            int r0 = a(r2, r3, r0)
            if (r0 <= 0) goto L2c
            r1 = 1
            r4.setSmallIcon(r0)
            r4.mo383a(r5)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 != 0) goto L3a
            int r2 = com.xiaomi.push.service.ao.a(r2, r3)
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithResource(r3, r2)
            r4.setSmallIcon(r2)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ac.b(android.content.Context, java.lang.String, com.xiaomi.push.ff, java.util.Map):void");
    }

    private static void a(Notification notification, Map<String, String> map) {
        String str = map.get("hyper_nms_skip_assistants");
        if (!TextUtils.isEmpty(str)) {
            notification.extras.putBoolean("skip_assistants", Boolean.parseBoolean(str));
        }
        String str2 = map.get("hyper_skip_group_opt");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        notification.extras.putBoolean("miui_skip_group_opt", Boolean.parseBoolean(str2));
    }

    private static void a(Context context, iq iqVar, Notification notification, Map<String, String> map) {
        ih ihVar;
        if (context == null || iqVar == null || (ihVar = iqVar.f732a) == null || ihVar.m525a() == null || notification == null) {
            return;
        }
        ih m558a = iqVar.m558a();
        Map<String, String> m525a = m558a.m525a();
        try {
            if (aa.a(m558a)) {
                notification.extras.putString("ai.push", "true");
                ih a2 = a(m558a);
                if (a2.m525a() == null) {
                    a2.a(new HashMap());
                }
                Map<String, String> m525a2 = a2.m525a();
                String str = m525a != null ? m525a.get(WsConstants.KEY_CHANNEL_ID) : null;
                m525a2.put("device_status", String.valueOf((int) je.a(context, iqVar)));
                m525a2.put("as", String.valueOf(com.xiaomi.push.service.b.a(context, iqVar.f738b)));
                m525a2.put("cs", String.valueOf(g.a(context, iqVar.f738b, str)));
                m525a2.put("__target_name", String.valueOf(m525a == null ? "" : m525a.get("__target_name")));
                if (map != null) {
                    a(m525a2, map, true, "ai_trigger_scene", "app_cache_num", "msg_clear_reason");
                    a(m525a2, map, "pop_limit_trigger_id", "sort_trigger_id", "idle_judge_trigger_id");
                }
                notification.extras.putByteArray("ai_extra", je.a(a2));
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("error occurred, when fill ai extra to notification, e：" + e2);
        }
    }

    public static void a(Map<String, String> map, Map<String, String> map2, boolean z, String... strArr) {
        if (map != null && map2 != null && strArr != null) {
            try {
                if (strArr.length != 0) {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = map2.get(str);
                            if (z || !TextUtils.isEmpty(str2)) {
                                if (str2 == null) {
                                    str2 = "";
                                }
                                map.put(str, str2);
                            }
                        }
                    }
                    return;
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d("error occurred, when add map from map, e：" + e2);
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("toMap | fromMap | sameKey is null or sameKey is empty, when add map from map.");
    }

    public static void a(Map<String, String> map, Map<String, String> map2, String... strArr) {
        a(map, map2, false, strArr);
    }

    private static a a(Context context, iq iqVar, String str, byte[] bArr, int i, Bundle bundle) {
        return a(context, iqVar, str, bArr, i, 0, a(context, iqVar, str), bundle);
    }

    private static a a(Context context, iq iqVar, String str, byte[] bArr, int i, int i2, boolean z, Bundle bundle) {
        Intent intent;
        PendingIntent service;
        String protocol;
        int a2 = a(iqVar);
        ih m558a = iqVar.m558a();
        String m524a = m558a != null ? m558a.m524a() : "";
        boolean m725a = m725a(iqVar);
        if (m558a != null && !TextUtils.isEmpty(m558a.f655e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(m558a.f655e));
            try {
                protocol = new URL(m558a.f655e).getProtocol();
            } catch (MalformedURLException unused) {
                StringBuilder M = e.a.a.a.a.M("meet URL exception : ");
                M.append(m558a.f655e);
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                intent2.setPackage(str);
            }
            if (!"http".equals(protocol) && !"https".equals(protocol)) {
                intent2.setPackage(str);
                intent2.addFlags(268435456);
                intent2.putExtra("messageId", m524a);
                intent2.putExtra("eventMessageType", a2);
                return new a(a(context, intent2, 0), intent2);
            }
            ao.a(context, str, intent2);
            intent2.addFlags(268435456);
            intent2.putExtra("messageId", m524a);
            intent2.putExtra("eventMessageType", a2);
            return new a(a(context, intent2, 0), intent2);
        }
        if (m725a) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(m524a));
        } else {
            Intent intent3 = null;
            if (f1001a != null) {
                intent3 = f1001a.a(context, iqVar, i2, bundle);
            }
            if (intent3 != null) {
                com.xiaomi.channel.commonutils.logger.c.b("use direct pull for " + m524a);
                b(context, intent3, iqVar, m558a, m524a, i2, bundle);
                int i3 = m558a != null ? m558a.f651c : 0;
                if (!TextUtils.isEmpty(m524a)) {
                    i3 = m524a.hashCode();
                }
                return new a(a(context, intent3, i3), intent3);
            }
            intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setComponent(new ComponentName(str, "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(m524a));
        }
        intent.putExtra("notification_click_button", i2);
        intent.putExtra("messageId", m524a);
        intent.putExtra("eventMessageType", a2);
        if (!m725a && z) {
            Intent intent4 = new Intent();
            intent4.setComponent(a(str));
            intent4.addFlags(276824064);
            intent4.putExtra("mipush_serviceIntent", intent);
            intent4.putExtra("messageId", m524a);
            intent4.putExtra("mipush_notified", true);
            intent4.addCategory(String.valueOf(i));
            intent4.addCategory(String.valueOf(m524a));
            intent4.addCategory(String.valueOf(i2));
            a(context, intent4, iqVar, m558a, m524a, i2, bundle);
            return new a(a(context, intent4, 0), intent4);
        }
        a(context, intent, iqVar, m558a, m524a, i2, bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            service = PendingIntent.getService(context, 0, intent, 167772160);
        } else {
            service = PendingIntent.getService(context, 0, intent, 134217728);
        }
        return new a(service, intent);
    }

    private static PendingIntent a(Context context, Intent intent, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getActivity(context, i, intent, 167772160);
        }
        return PendingIntent.getActivity(context, i, intent, 134217728);
    }

    public static int a(iq iqVar) {
        if (c(iqVar)) {
            return 1000;
        }
        return m725a(iqVar) ? 3000 : -1;
    }

    private static void a(Context context, Intent intent, iq iqVar, ih ihVar, String str, int i, Bundle bundle) {
        ComponentName component;
        if (iqVar == null || ihVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String a2 = a(ihVar.m525a(), i);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        if (ay.a.equals(a2) || ay.b.equals(a2) || ay.f9326c.equals(a2)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", iqVar.f734a);
            if (!TextUtils.isEmpty(iqVar.f738b)) {
                intent.putExtra(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, iqVar.f738b);
            }
            intent.putExtra("job_key", a(ihVar.m525a(), "jobkey"));
            intent.putExtra(i + BundleUtil.UNDERLINE_TAG + "target_component", a(context, iqVar.f738b, ihVar.m525a(), i, bundle));
            if (!com.xiaomi.push.k.m655a(context) || bundle == null || (component = intent.getComponent()) == null) {
                return;
            }
            bundle.putString(a("xmsf.stat.transfCompo", i), component.flattenToString());
        }
    }

    private static ih a(ih ihVar) {
        ih ihVar2 = new ih();
        if (ihVar != null) {
            ihVar2.a(ihVar.m524a());
            ihVar2.b(ihVar.m529b());
            ihVar2.c(ihVar.c());
            ihVar2.a(ihVar.a());
            ihVar2.b(ihVar.b());
            Map<String, String> m525a = ihVar.m525a();
            if (m525a != null) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, String> entry : m525a.entrySet()) {
                    String key = entry.getKey();
                    if (!"intent_uri".equals(key)) {
                        hashMap.put(key, entry.getValue());
                    }
                }
                ihVar2.a(hashMap);
            }
        }
        return ihVar2;
    }

    private static boolean a(Context context, iq iqVar, String str) {
        if (iqVar != null && iqVar.m558a() != null && iqVar.m558a().m525a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(iqVar.m558a().m525a().get("use_clicked_activity")) && k.a(context, a(str));
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("should clicked activity params are null.");
        return false;
    }

    public static ComponentName a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] a(android.content.Context r3, com.xiaomi.push.ih r4) {
        /*
            java.lang.String r0 = r4.m532c()
            java.lang.String r1 = r4.d()
            java.util.Map r4 = r4.m525a()
            if (r4 == 0) goto L73
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            int r3 = r3.intValue()
            r2 = 320(0x140, float:4.48E-43)
            if (r3 > r2) goto L51
            java.lang.String r3 = "title_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L42
            r0 = r3
        L42:
            java.lang.String r3 = "description_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L73
            goto L72
        L51:
            r2 = 360(0x168, float:5.04E-43)
            if (r3 <= r2) goto L73
            java.lang.String r3 = "title_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L64
            r0 = r3
        L64:
            java.lang.String r3 = "description_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L73
        L72:
            r1 = r3
        L73:
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ac.a(android.content.Context, com.xiaomi.push.ih):java.lang.String[]");
    }

    private static String a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private static int a(Context context, String str, Map<String, String> map, int i, Bundle bundle) {
        ComponentName a2;
        Intent b2 = b(context, str, map, i, bundle);
        if (b2 == null || (a2 = k.a(context, b2)) == null) {
            return 0;
        }
        b2.setComponent(a2);
        if (com.xiaomi.push.k.m655a(context) && bundle != null) {
            bundle.putString(a("xmsf.stat.tgtCompo", i), a2.flattenToString());
            bundle.putInt("xmsf.stat.tgtIntentHash", b2.filterHashCode());
        }
        return a2.hashCode();
    }

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + BundleUtil.UNDERLINE_TAG + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0429 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c8  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.ac.c a(android.content.Context r24, com.xiaomi.push.iq r25, byte[] r26, android.widget.RemoteViews r27, android.app.PendingIntent r28, int r29) {
        /*
            Method dump skipped, instructions count: 1297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ac.a(android.content.Context, com.xiaomi.push.iq, byte[], android.widget.RemoteViews, android.app.PendingIntent, int):com.xiaomi.push.service.ac$c");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static Bitmap m717a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d("error occurred while string to bitmap. throwable:" + th);
            return null;
        }
    }

    @TargetApi(16)
    private static void a(ff ffVar, Context context, String str, iq iqVar, byte[] bArr, int i) {
        PendingIntent a2;
        PendingIntent a3;
        PendingIntent a4;
        PendingIntent a5;
        Map<String, String> m525a = iqVar.m558a().m525a();
        if (TextUtils.equals(ExifInterface.GPS_MEASUREMENT_3D, m525a.get("notification_style_type")) || TextUtils.equals("4", m525a.get("notification_style_type"))) {
            return;
        }
        Bundle bundle = new Bundle();
        if (m732c(m525a)) {
            for (int i2 = 1; i2 <= 3; i2++) {
                String str2 = m525a.get(String.format("cust_btn_%s_n", Integer.valueOf(i2)));
                if (!TextUtils.isEmpty(str2) && (a5 = a(context, str, iqVar, bArr, i, i2, bundle)) != null) {
                    ffVar.addAction(0, str2, a5);
                }
            }
            ffVar.addExtras(bundle);
            return;
        }
        if (!TextUtils.isEmpty(m525a.get("notification_style_button_left_name")) && (a4 = a(context, str, iqVar, bArr, i, 1, bundle)) != null) {
            ffVar.addAction(0, m525a.get("notification_style_button_left_name"), a4);
        }
        if (!TextUtils.isEmpty(m525a.get("notification_style_button_mid_name")) && (a3 = a(context, str, iqVar, bArr, i, 2, bundle)) != null) {
            ffVar.addAction(0, m525a.get("notification_style_button_mid_name"), a3);
        }
        if (!TextUtils.isEmpty(m525a.get("notification_style_button_right_name")) && (a2 = a(context, str, iqVar, bArr, i, 3, bundle)) != null) {
            ffVar.addAction(0, m525a.get("notification_style_button_right_name"), a2);
        }
        ffVar.addExtras(bundle);
    }

    private static PendingIntent a(Context context, String str, iq iqVar, byte[] bArr, int i, int i2, Bundle bundle) {
        Map<String, String> m525a = iqVar.m558a().m525a();
        if (m525a == null) {
            return null;
        }
        boolean a2 = a(context, iqVar, str);
        if (a2) {
            return a(context, iqVar, str, bArr, i, i2, a2, bundle).a;
        }
        Intent m716a = m716a(context, str, m525a, i2, bundle);
        if (m716a != null) {
            return a(context, m716a, 0);
        }
        return null;
    }

    public static String a(Map<String, String> map, int i) {
        String format;
        if (i == 0) {
            format = "notify_effect";
        } else {
            format = m732c(map) ? String.format("cust_btn_%s_ne", Integer.valueOf(i)) : i == 1 ? "notification_style_button_left_notify_effect" : i == 2 ? "notification_style_button_mid_notify_effect" : i == 3 ? "notification_style_button_right_notify_effect" : i == 4 ? "notification_colorful_button_notify_effect" : null;
        }
        if (map == null || format == null) {
            return null;
        }
        return map.get(format);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Intent m716a(Context context, String str, Map<String, String> map, int i, Bundle bundle) {
        if (m732c(map)) {
            return a(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i)), String.format("cust_btn_%s_iu", Integer.valueOf(i)), String.format("cust_btn_%s_ic", Integer.valueOf(i)), String.format("cust_btn_%s_wu", Integer.valueOf(i)), i, bundle);
        }
        if (i == 1) {
            return a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri", i, bundle);
        }
        if (i == 2) {
            return a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri", i, bundle);
        }
        if (i == 3) {
            return a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri", i, bundle);
        }
        if (i != 4) {
            return null;
        }
        return a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri", i, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Intent a(android.content.Context r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ac.a(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, android.os.Bundle):android.content.Intent");
    }

    @TargetApi(16)
    private static ff a(Context context, iq iqVar, byte[] bArr, String str, int i) {
        String m719a = m719a(iqVar);
        Map<String, String> m525a = iqVar.m558a().m525a();
        String str2 = m525a.get("notification_style_type");
        ff a2 = (!com.xiaomi.push.k.m655a(context) || f1001a == null) ? null : f1001a.a(context, i, m719a, m525a);
        if (a2 != null) {
            a2.a(m525a);
            return a2;
        }
        if (ExifInterface.GPS_MEASUREMENT_2D.equals(str2)) {
            ff ffVar = new ff(context);
            String str3 = m525a.get("notification_bigPic_uri");
            String str4 = m525a.get("img_describe");
            if (TextUtils.isEmpty(str4)) {
                str4 = ffVar.m384a("default_big_picture_description");
            }
            Bitmap a3 = TextUtils.isEmpty(str3) ? null : a(context, m525a.get("notification_bigPic_uri"), false);
            if (a3 == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("can not get big picture.");
                return ffVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(ffVar);
            bigPictureStyle.bigPicture(a3);
            bigPictureStyle.setSummaryText(str);
            if (Build.VERSION.SDK_INT >= 31 && !TextUtils.isEmpty(str4)) {
                bigPictureStyle.setContentDescription(str4);
            }
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            ffVar.setStyle(bigPictureStyle);
            return ffVar;
        }
        if (PushClient.DEFAULT_REQUEST_ID.equals(str2)) {
            ff ffVar2 = new ff(context);
            ffVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return ffVar2;
        }
        if ("4".equals(str2) && com.xiaomi.push.k.m654a()) {
            fe feVar = new fe(context, m719a);
            if (!TextUtils.isEmpty(m525a.get("notification_banner_image_uri"))) {
                feVar.setLargeIcon(a(context, m525a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(m525a.get("notification_banner_icon_uri"))) {
                feVar.b(a(context, m525a.get("notification_banner_icon_uri"), false));
            }
            feVar.a(m525a);
            return feVar;
        }
        if (ExifInterface.GPS_MEASUREMENT_3D.equals(str2) && com.xiaomi.push.k.m654a()) {
            fg fgVar = new fg(context, i, m719a);
            if (!TextUtils.isEmpty(m525a.get("notification_colorful_button_text"))) {
                Bundle bundle = new Bundle();
                PendingIntent a4 = a(context, m719a, iqVar, bArr, i, 4, bundle);
                if (a4 != null) {
                    fgVar.a(m525a.get("notification_colorful_button_text"), a4).mo383a(m525a.get("notification_colorful_button_bg_color"));
                }
                fgVar.addExtras(bundle);
            }
            if (!TextUtils.isEmpty(m525a.get("notification_colorful_bg_color"))) {
                fgVar.b(m525a.get("notification_colorful_bg_color"));
            } else if (!TextUtils.isEmpty(m525a.get("notification_colorful_bg_image_uri"))) {
                fgVar.setLargeIcon(a(context, m525a.get("notification_colorful_bg_image_uri"), false));
            }
            fgVar.a(m525a);
            return fgVar;
        }
        return new ff(context);
    }

    private static RemoteViews a(Context context, iq iqVar, byte[] bArr) {
        ih m558a = iqVar.m558a();
        String m455a = com.xiaomi.push.h.m455a(m719a(iqVar), context);
        if (m558a != null && m558a.m525a() != null) {
            Map<String, String> m525a = m558a.m525a();
            String str = m525a.get("layout_name");
            String str2 = m525a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(m455a);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", m455a);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(m455a, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", m455a);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> keys2 = jSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", m455a);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", m455a);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has(CrashHianalyticsData.TIME)) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject(CrashHianalyticsData.TIME);
                            Iterator<String> keys3 = jSONObject4.keys();
                            while (keys3.hasNext()) {
                                String next3 = keys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", m455a);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e2) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
                }
            }
        }
        return null;
    }

    private static Bitmap a(Context context, int i) {
        return a(context.getResources().getDrawable(i));
    }

    private static int a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return com.xiaomi.push.h.a(str2, "drawable", str, context);
        }
        return 0;
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static Notification a(Notification notification) {
        Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
        if (a2 != null) {
            com.xiaomi.push.bh.a(a2, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m719a(iq iqVar) {
        ih m558a;
        if ("com.xiaomi.xmsf".equals(iqVar.f738b) && (m558a = iqVar.m558a()) != null && m558a.m525a() != null) {
            String str = m558a.m525a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iqVar.f738b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m721a(Context context, String str) {
        a(context, str, -1);
    }

    public static void a(Context context, String str, int i) {
        a(context, str, i, -1);
    }

    public static void a(Context context, String str, int i, int i2) {
        int hashCode;
        if (context == null || TextUtils.isEmpty(str) || i < -1) {
            return;
        }
        an a2 = an.a(context, str);
        List<StatusBarNotification> m753b = a2.m753b();
        if (com.xiaomi.push.u.a(m753b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z = false;
        if (i == -1) {
            z = true;
            hashCode = 0;
        } else {
            hashCode = ((str.hashCode() / 10) * 10) + i;
        }
        Iterator<StatusBarNotification> it2 = m753b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            StatusBarNotification next = it2.next();
            if (!TextUtils.isEmpty(String.valueOf(next.getId()))) {
                int id = next.getId();
                if (z) {
                    linkedList.add(next);
                    a2.a(id);
                } else if (hashCode == id) {
                    e.a(context, next, i2);
                    linkedList.add(next);
                    a2.a(id);
                    break;
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        an a2 = an.a(context, str);
        List<StatusBarNotification> c2 = a2.c();
        if (com.xiaomi.push.u.a(c2)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : c2) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String a3 = ao.a(notification);
                String b2 = ao.b(notification);
                if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(b2) && a(a3, str2) && a(b2, str3)) {
                    linkedList.add(statusBarNotification);
                    a2.a(id);
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        bl.a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m720a(Context context, int i) {
        if (i > 0) {
            bl.a(context, "category_clear_notification", "clear_notification", i, "");
        }
    }

    static int a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m726a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return PushClient.DEFAULT_REQUEST_ID.equals(map.get("notify_foreground"));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m725a(iq iqVar) {
        ih m558a = iqVar.m558a();
        return b(m558a) && m558a.l();
    }

    private static Bitmap a(Context context, String str, boolean z) {
        Future submit = f1003a.submit(new b(str, context, z));
        try {
            try {
                try {
                    Bitmap bitmap = (Bitmap) submit.get(180L, TimeUnit.SECONDS);
                    return bitmap == null ? bitmap : bitmap;
                } catch (ExecutionException e2) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                    submit.cancel(true);
                    return null;
                }
            } catch (InterruptedException e3) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
                submit.cancel(true);
                return null;
            } catch (TimeoutException e4) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e4);
                submit.cancel(true);
                return null;
            }
        } finally {
            submit.cancel(true);
        }
    }

    private static String a(Context context, String str, Map<String, String> map) {
        if (map != null && !TextUtils.isEmpty(map.get("channel_name"))) {
            return map.get("channel_name");
        }
        return com.xiaomi.push.h.m459b(context, str);
    }

    public static int a(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            com.xiaomi.channel.commonutils.logger.c.c("importance=" + str);
            return Integer.parseInt(str);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.d("parsing channel importance error: " + e2);
            return 3;
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i) {
        return b(context, str, map, i, null);
    }

    private static void a(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-2) & (-3) & (-65) & (-129));
    }

    private static void a(Context context, String str, ff ffVar, Map<String, String> map) {
        int a2 = a(context, str, "mipush_small_notification");
        int a3 = a(context, str, "mipush_notification");
        if (com.xiaomi.push.k.m655a(context)) {
            if (a2 > 0 && a3 > 0) {
                ffVar.setSmallIcon(a2);
                ffVar.setLargeIcon(a(context, a3));
                return;
            } else {
                b(context, str, ffVar, map);
                return;
            }
        }
        if (a2 > 0) {
            ffVar.setSmallIcon(a2);
        } else {
            b(context, str, ffVar, map);
        }
        if (a3 > 0) {
            ffVar.setLargeIcon(a(context, a3));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m724a(ih ihVar) {
        return m727a(ihVar != null ? ihVar.f646a : null, 0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m727a(Map<String, String> map, int i) {
        String a2 = a(map, i);
        return ay.a.equals(a2) || ay.b.equals(a2) || ay.f9326c.equals(a2);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        if (TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("report arrive failed notification failed, parameters are invalid");
            return;
        }
        it itVar = new it();
        itVar.c(ie.NOTIFICATION_ARRIVED_FAIL.f611a);
        itVar.a(false);
        itVar.a(str2);
        itVar.b(str);
        itVar.d(str3);
        itVar.f750a = map;
        h.a(itVar);
    }
}
