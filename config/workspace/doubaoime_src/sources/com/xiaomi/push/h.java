package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class h {
    private static a a;

    /* renamed from: a, reason: collision with other field name */
    private static Boolean f534a;

    public interface a {
        int a(Context context);

        int a(String str, Context context);

        int a(String str, String str2, Context context);

        String a();

        String a(Context context, String str);

        /* renamed from: a, reason: collision with other method in class */
        Map<String, String> m462a(Context context, String str);

        /* renamed from: a, reason: collision with other method in class */
        boolean m463a(Context context);

        /* renamed from: a, reason: collision with other method in class */
        boolean m464a(Context context, String str);

        boolean a(Context context, String str, Set<String> set);
    }

    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* renamed from: a, reason: collision with other field name */
        private final int f536a;

        b(int i) {
            this.f536a = i;
        }

        public int a() {
            return this.f536a;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m454a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m460b(Context context, String str) {
        a aVar = a;
        return aVar != null && aVar.m464a(context, str);
    }

    /* renamed from: c, reason: collision with other method in class */
    public static boolean m461c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            return m452a(context, str) == null;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("check package is uninstall error, packageName or context is null");
        return true;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m459b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    public static String c(Context context, String str) {
        a aVar = a;
        return aVar != null ? aVar.a(context, str) : "";
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static boolean a(Context context, String str, String str2) {
        Bundle bundle;
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean(str2, false);
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.m15a("error occurred while getting metadata switch. throwable:" + th);
            }
            return false;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("context|pkg|key is invalid while getting metadata switch");
        return false;
    }

    public static int b(Context context, String str) {
        ApplicationInfo m452a = m452a(context, str);
        if (m452a == null) {
            return 0;
        }
        int i = m452a.icon;
        return i == 0 ? m452a.logo : i;
    }

    public static boolean b(Context context) {
        if (f534a == null) {
            a aVar = a;
            f534a = Boolean.valueOf(aVar != null && aVar.m463a(context));
        }
        return f534a.booleanValue();
    }

    @TargetApi(19)
    public static b a(Context context, String str, boolean z) {
        ApplicationInfo applicationInfo;
        b a2;
        b bVar;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                if (str.equals(context.getPackageName())) {
                    applicationInfo = context.getApplicationInfo();
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                }
                a2 = a(context, applicationInfo);
                bVar = b.UNKNOWN;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.m15a("get app op error " + th);
            }
            if (a2 != bVar) {
                return a2;
            }
            Integer num = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return bVar;
            }
            Integer num2 = (Integer) bh.a(context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
            int i = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
            int i2 = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
            com.xiaomi.channel.commonutils.logger.c.b(String.format("get app mode %s|%s|%s", num2, i, i2));
            if (i == null) {
                i = 0;
            }
            if (i2 == null) {
                i2 = 1;
            }
            if (num2 != null) {
                return z ? !num2.equals(i2) ? b.ALLOWED : b.NOT_ALLOWED : num2.equals(i) ? b.ALLOWED : b.NOT_ALLOWED;
            }
            return b.UNKNOWN;
        }
        return b.UNKNOWN;
    }

    private static b a(Context context, ApplicationInfo applicationInfo) {
        Object systemService;
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo != null) {
            Boolean bool = null;
            try {
                if (applicationInfo.packageName.equals(context.getPackageName())) {
                    bool = Boolean.valueOf(((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled());
                } else {
                    if (i >= 29) {
                        systemService = bh.a(context.getSystemService(RemoteMessageConst.NOTIFICATION), "getService", new Object[0]);
                    } else {
                        systemService = context.getSystemService("security");
                    }
                    if (systemService != null) {
                        bool = (Boolean) bh.b(systemService, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid));
                    }
                }
                if (bool != null) {
                    return bool.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.m15a("are notifications enabled error " + e2);
            }
            return b.UNKNOWN;
        }
        return b.UNKNOWN;
    }

    public static void a(Context context, ApplicationInfo applicationInfo, boolean z) {
        Object systemService;
        int i = Build.VERSION.SDK_INT;
        if (b.ALLOWED != a(context, applicationInfo)) {
            try {
                if (i >= 29) {
                    systemService = bh.a(context.getSystemService(RemoteMessageConst.NOTIFICATION), "getService", new Object[0]);
                } else {
                    systemService = context.getSystemService("security");
                }
                if (systemService != null) {
                    bh.b(systemService, "setNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid), Boolean.valueOf(z));
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.m15a("set notifications enabled error " + e2);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m458a(Context context, String str) {
        return a(context, str, (Set<String>) null);
    }

    public static boolean a(Context context, String str, Set<String> set) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!k.m654a()) {
            return context.getPackageName().equals(str);
        }
        a aVar = a;
        return aVar != null && aVar.a(context, str, set);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m457a(Context context) {
        String a2 = a();
        if (TextUtils.isEmpty(a2) || context == null) {
            return false;
        }
        return a2.equals(context.getPackageName());
    }

    public static String a() {
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            str = (String) bh.a("android.app.ActivityThread", "currentProcessName", new Object[0]);
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static ApplicationInfo m452a(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.c.m15a("not found app info " + str);
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Drawable m453a(Context context, String str) {
        ApplicationInfo m452a = m452a(context, str);
        Drawable drawable = null;
        if (m452a != null) {
            try {
                drawable = m452a.loadIcon(context.getPackageManager());
                if (drawable == null) {
                    drawable = m452a.loadLogo(context.getPackageManager());
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.m15a("get app icon drawable failed, " + e2);
            }
        }
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Map<String, String> m456a(Context context, String str) {
        a aVar = a;
        if (aVar == null) {
            return null;
        }
        return aVar.m462a(context, str);
    }

    public static int a(Context context) {
        a aVar = a;
        if (aVar == null || context == null) {
            return 0;
        }
        return aVar.a(context);
    }

    public static int a(String str, String str2, String str3, Context context) {
        a aVar;
        if (context == null) {
            return 0;
        }
        if (TextUtils.equals(str3, "com.xiaomi.xmsf") && b(context) && (aVar = a) != null) {
            return aVar.a(str, str2, context);
        }
        return context.getResources().getIdentifier(str, str2, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m455a(String str, Context context) {
        a aVar;
        return (TextUtils.equals(str, "com.xiaomi.xmsf") && b(context) && (aVar = a) != null) ? aVar.a() : str;
    }

    public static int a(String str, Context context) {
        if (a == null || context == null || TextUtils.isEmpty(str)) {
            return 2;
        }
        return a.a(str, context);
    }
}
