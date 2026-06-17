package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.vivo.push.PushClient;

/* loaded from: classes2.dex */
public class t {
    private static Context a;

    /* renamed from: a, reason: collision with other field name */
    private static String f1173a;

    public static void a(Context context) {
        a = context.getApplicationContext();
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m846b() {
        try {
            return a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.c.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return false;
        }
    }

    private static String c() {
        String a2 = C0779r.a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("ColorOS_")) {
            f1173a = e.a.a.a.a.s("ColorOS_", a2);
        }
        return f1173a;
    }

    private static String d() {
        String a2 = C0779r.a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("FuntouchOS_")) {
            f1173a = e.a.a.a.a.s("FuntouchOS_", a2);
        }
        return f1173a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Context m841a() {
        return a;
    }

    public static int a() {
        try {
            Class<?> a2 = a(null, "miui.os.Build");
            if (a2.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return a2.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String b() {
        String a2 = C0779r.a("ro.build.version.emui", "");
        f1173a = a2;
        return a2;
    }

    /* renamed from: c, reason: collision with other method in class */
    public static boolean m847c() {
        return "tv".equals(C0779r.a(com.heytap.mcssdk.utils.d.f6924d));
    }

    /* renamed from: d, reason: collision with other method in class */
    public static boolean m848d() {
        return "XiaoAiTongXue".equals(Build.BRAND);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m845a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m844a() {
        return TextUtils.equals((String) bh.a("android.os.SystemProperties", MonitorConstants.CONNECT_TYPE_GET, "sys.boot_completed"), PushClient.DEFAULT_REQUEST_ID);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized String m842a() {
        synchronized (t.class) {
            String str = f1173a;
            if (str != null) {
                return str;
            }
            String e2 = k.e();
            if (a() <= 0) {
                String b = b();
                if (TextUtils.isEmpty(b)) {
                    b = c();
                    if (TextUtils.isEmpty(b)) {
                        b = d();
                        if (TextUtils.isEmpty(b)) {
                            e2 = String.valueOf(C0779r.a(SystemUtils.PRODUCT_BRAND, "Android") + BundleUtil.UNDERLINE_TAG + e2);
                        }
                    }
                }
                e2 = b;
            }
            f1173a = e2;
            return e2;
        }
    }

    public static Class<?> a(Context context, String str) {
        if (str != null && str.trim().length() != 0) {
            boolean z = context != null;
            if (z && Build.VERSION.SDK_INT >= 29) {
                try {
                    return context.getClassLoader().loadClass(str);
                } catch (Throwable unused) {
                }
            }
            try {
                return Class.forName(str);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.m15a(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
                throw new ClassNotFoundException("loadClass fail ", th);
            }
        }
        throw new ClassNotFoundException("class is empty");
    }

    public static void a(Context context, int i, String str, long j) {
        try {
            ((PowerManager) context.getSystemService("power")).newWakeLock(i, str).acquire(j);
        } catch (Throwable th) {
            e.a.a.a.a.w0("Failed to acquire a wake lock, caused by ", th, "WakeLock");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m843a() {
        final Context context = a;
        if (context == null) {
            return;
        }
        if (!k.m655a(context)) {
            com.xiaomi.channel.commonutils.logger.c.m16a("Wi-Fi", "Cannot trigger wifi broadcast without xmsf");
        } else {
            ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.t.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.xiaomi.channel.commonutils.logger.c.m15a("try to trigger the wifi digest broadcast.");
                        Object systemService = context.getSystemService("MiuiWifiService");
                        if (systemService != null) {
                            bh.b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
                        }
                    } catch (Throwable th) {
                        com.xiaomi.channel.commonutils.logger.c.m16a("Wi-Fi", "Failed to trigger DIGEST_INFORMATION_CHANGED broadcast, because: " + th);
                    }
                }
            });
        }
    }
}
