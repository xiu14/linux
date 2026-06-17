package com.ss.android.message.f;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.common.model.c;
import com.bytedance.common.push.e.g;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.push.g0.f;
import com.bytedance.push.g0.i;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.ugc.quota.b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {
    private static String a = null;
    private static String b = null;

    /* renamed from: c, reason: collision with root package name */
    private static ProcessEnum f8349c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f8350d = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f8353g = false;
    public static boolean h = false;
    private static long i;
    private static List<ActivityManager.RunningAppProcessInfo> k;
    private static long l;
    private static long m;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f8351e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f8352f = new Object();
    private static final Object j = new Object();

    /* renamed from: com.ss.android.message.f.a$a, reason: collision with other inner class name */
    static class C0379a extends com.ss.android.ugc.quota.a {
        C0379a() {
        }

        @Override // com.ss.android.ugc.quota.c
        public boolean a() {
            return b.g().h();
        }

        @Override // com.ss.android.ugc.quota.c
        public int b() {
            return 0;
        }
    }

    public static boolean A(String str) {
        String str2;
        try {
            str2 = Build.BRAND;
        } catch (Throwable unused) {
        }
        if (com.bytedance.android.input.k.b.a.Y(str2) || !str2.toLowerCase().startsWith(str)) {
            String str3 = Build.MANUFACTURER;
            if (!com.bytedance.android.input.k.b.a.Y(str3)) {
                if (str3.toLowerCase().startsWith(str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void B() {
        Process.killProcess(Process.myPid());
    }

    public static String C(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (!list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (TextUtils.isEmpty(it2.next())) {
                    it2.remove();
                }
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(list.get(i2));
                if (i2 < size - 1) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
        }
        return sb.toString();
    }

    public static boolean D(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Throwable th) {
                f.f("ToolUtils", "[parseBool] ", th);
            }
        }
        return z;
    }

    public static int E(String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable th) {
                f.f("ToolUtils", "[parseLong] ", th);
            }
        }
        return i2;
    }

    public static long F(String str, long j2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (Throwable th) {
                f.f("ToolUtils", "[parseLong] ", th);
            }
        }
        return j2;
    }

    public static void G(Context context, String str, boolean z) {
        ComponentName componentName = new ComponentName(context.getPackageName(), str);
        PackageManager packageManager = context.getPackageManager();
        try {
            f.g("", "set " + str + " enable to " + z);
            packageManager.setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
        } catch (Throwable th) {
            f.e("", "error to set " + str + " enable to " + z);
            th.printStackTrace();
        }
    }

    public static void H(String str) {
        a = str;
    }

    public static List<String> I(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 0) {
            try {
                String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                Iterator it2 = new ArrayList(Arrays.asList(split)).iterator();
                while (it2.hasNext()) {
                    if (TextUtils.isEmpty((String) it2.next())) {
                        it2.remove();
                    }
                }
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return arrayList;
    }

    @RequiresApi(api = 19)
    public static String J(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("[toMd5]exception:");
            M.append(th.getLocalizedMessage());
            f.e("ToolUtils", M.toString());
            return str;
        }
    }

    public static Map<String, String> a(Map<String, String> map) {
        try {
            C0379a c0379a = new C0379a();
            Map hashMap = map == null ? new HashMap() : map;
            Pair<String, String> e2 = b.g().e(c0379a);
            hashMap.put(e2.first, e2.second);
            return hashMap;
        } catch (Exception unused) {
            return map;
        }
    }

    public static String b(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        sb.append(NetworkUtils.c(list, "UTF-8"));
        return sb.toString();
    }

    public static String c(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return b(str, arrayList);
    }

    public static int d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((Boolean) Reflect.on((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).call("areNotificationsEnabled").get()).booleanValue() ? 1 : 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i2 = applicationInfo.uid;
                Reflect on = Reflect.on(appOpsManager);
                Class<?> cls = Integer.TYPE;
                return ((Integer) on.call("checkOpNoThrow", new Class[]{cls, cls, String.class}, Integer.valueOf(((Integer) on.field("OP_POST_NOTIFICATION", cls).get()).intValue()), Integer.valueOf(i2), packageName).get()).intValue() == 0 ? 1 : 0;
            } catch (Throwable th) {
                th.printStackTrace();
                return -1;
            }
        }
    }

    public static String e(Bundle bundle) {
        Set<String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : keySet) {
            Object obj = bundle.get(str);
            if (obj instanceof Intent) {
                sb.append(String.format("%s--%s\n", str, e(((Intent) obj).getExtras())));
            } else {
                sb.append(String.format("%s--%s\n", str, obj));
            }
        }
        return sb.toString();
    }

    public static long f() {
        long j2 = l;
        if (j2 == 0) {
            String a2 = i.b().a("log.tag.push.timestamp");
            if (!TextUtils.isEmpty(a2)) {
                try {
                    l = Long.parseLong(a2);
                } catch (Throwable unused) {
                    l = -1L;
                }
                m = System.currentTimeMillis();
                return l;
            }
            l = -1L;
        } else if (j2 != -1) {
            return (System.currentTimeMillis() - m) + j2;
        }
        return System.currentTimeMillis();
    }

    public static ProcessEnum g(Context context) {
        ProcessEnum processEnum = f8349c;
        if (processEnum != null) {
            return processEnum;
        }
        ProcessEnum parseProcess = ProcessEnum.parseProcess(h(context), context.getPackageName());
        f8349c = parseProcess;
        return parseProcess;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x00ae, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0017, B:9:0x001f, B:10:0x0021, B:13:0x0023, B:57:0x002a, B:17:0x0034, B:19:0x003c, B:20:0x003e, B:26:0x006b, B:28:0x0073, B:29:0x0075, B:31:0x0077, B:33:0x0083, B:34:0x0085, B:38:0x00aa, B:39:0x00ac, B:41:0x008a, B:43:0x0094, B:44:0x0098, B:46:0x009e, B:49:0x00a8, B:55:0x0067, B:60:0x0030, B:23:0x0040, B:25:0x0063), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: all -> 0x00ae, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0017, B:9:0x001f, B:10:0x0021, B:13:0x0023, B:57:0x002a, B:17:0x0034, B:19:0x003c, B:20:0x003e, B:26:0x006b, B:28:0x0073, B:29:0x0075, B:31:0x0077, B:33:0x0083, B:34:0x0085, B:38:0x00aa, B:39:0x00ac, B:41:0x008a, B:43:0x0094, B:44:0x0098, B:46:0x009e, B:49:0x00a8, B:55:0x0067, B:60:0x0030, B:23:0x0040, B:25:0x0063), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: all -> 0x00ae, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0017, B:9:0x001f, B:10:0x0021, B:13:0x0023, B:57:0x002a, B:17:0x0034, B:19:0x003c, B:20:0x003e, B:26:0x006b, B:28:0x0073, B:29:0x0075, B:31:0x0077, B:33:0x0083, B:34:0x0085, B:38:0x00aa, B:39:0x00ac, B:41:0x008a, B:43:0x0094, B:44:0x0098, B:46:0x009e, B:49:0x00a8, B:55:0x0067, B:60:0x0030, B:23:0x0040, B:25:0x0063), top: B:3:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(android.content.Context r6) {
        /*
            java.lang.Object r0 = com.ss.android.message.f.a.f8352f
            monitor-enter(r0)
            java.lang.String r1 = com.ss.android.message.f.a.a     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L17
            com.bytedance.common.g.a r1 = com.bytedance.common.g.a.c()     // Catch: java.lang.Throwable -> Lae
            com.bytedance.common.g.b.b r1 = r1.e()     // Catch: java.lang.Throwable -> Lae
            com.bytedance.common.model.c r1 = r1.c()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = r1.p     // Catch: java.lang.Throwable -> Lae
            com.ss.android.message.f.a.a = r1     // Catch: java.lang.Throwable -> Lae
        L17:
            java.lang.String r1 = com.ss.android.message.f.a.a     // Catch: java.lang.Throwable -> Lae
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L23
            java.lang.String r6 = com.ss.android.message.f.a.a     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            return r6
        L23:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lae
            r2 = 28
            r3 = 0
            if (r1 < r2) goto L33
            java.lang.String r1 = android.app.Application.getProcessName()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> Lae
            goto L34
        L2f:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lae
        L33:
            r1 = r3
        L34:
            com.ss.android.message.f.a.a = r1     // Catch: java.lang.Throwable -> Lae
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L40
            java.lang.String r6 = com.ss.android.message.f.a.a     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            return r6
        L40:
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L66
            r4 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L66
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L66
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Throwable -> L66
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L66
            goto L6b
        L66:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lae
        L6a:
            r1 = r3
        L6b:
            com.ss.android.message.f.a.a = r1     // Catch: java.lang.Throwable -> Lae
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L77
            java.lang.String r6 = com.ss.android.message.f.a.a     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            return r6
        L77:
            java.lang.String r1 = i()     // Catch: java.lang.Throwable -> Lae
            com.ss.android.message.f.a.a = r1     // Catch: java.lang.Throwable -> Lae
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L87
            java.lang.String r6 = com.ss.android.message.f.a.a     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            return r6
        L87:
            if (r6 != 0) goto L8a
            goto Laa
        L8a:
            int r6 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lae
            java.util.List r1 = o()     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto Laa
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lae
        L98:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lae
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> Lae
            int r4 = r2.pid     // Catch: java.lang.Throwable -> Lae
            if (r4 != r6) goto L98
            java.lang.String r3 = r2.processName     // Catch: java.lang.Throwable -> Lae
        Laa:
            com.ss.android.message.f.a.a = r3     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            return r3
        Lae:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.f.a.h(android.content.Context):java.lang.String");
    }

    private static String i() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read <= 0) {
                    break;
                }
                sb.append((char) read);
            }
            if (f.d()) {
                f.c("Process", "get processName = " + sb.toString());
            }
            String sb2 = sb.toString();
            try {
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            return sb2;
        } catch (Throwable unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        }
    }

    public static String j(Context context) {
        String str = b;
        if (!com.bytedance.android.input.k.b.a.Y(str)) {
            return str;
        }
        String h2 = h(context);
        String str2 = TextUtils.equals(h2, context.getPackageName()) ? PullConfiguration.PROCESS_NAME_MAIN : h2.contains(Constants.COLON_SEPARATOR) ? h2.split(Constants.COLON_SEPARATOR)[1] : "";
        b = str2;
        return str2;
    }

    public static String k(Context context) {
        HashMap hashMap = new HashMap();
        String string = context.getSharedPreferences("push_multi_process_config", 4).getString("ssids", "");
        if (!com.bytedance.android.input.k.b.a.Y(string)) {
            com.bytedance.android.input.k.b.a.I0(string, hashMap);
        }
        return (String) hashMap.get("device_id");
    }

    public static String l(Context context) {
        f.c("ToolUtils", "[getFocusPermissionVersion]");
        if (!i.b().f()) {
            return "-1";
        }
        try {
            int i2 = Settings.System.getInt(context.getContentResolver(), "notification_focus_protocol", 0);
            f.c("ToolUtils", "[getFocusPermissionVersion]notificationFocusProtocol:" + i2);
            return String.valueOf(i2);
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("[getFocusPermissionVersion]exception:");
            M.append(th.getLocalizedMessage());
            f.e("ToolUtils", M.toString());
            return "-1";
        }
    }

    public static String m(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
                    launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                    Logger.d("ToolUtils", "add category LAUNCHER in launch intent");
                }
                launchIntentForPackage.setPackage(null);
                launchIntentForPackage.addFlags(2097152);
                launchIntentForPackage.addFlags(268435456);
            }
            ComponentName resolveActivity = launchIntentForPackage.resolveActivity(context.getPackageManager());
            if (resolveActivity != null) {
                return resolveActivity.getClassName();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    @RequiresApi(api = 21)
    public static String n(Context context) {
        synchronized (f8351e) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("push_multi_process_config", 4);
                String string = sharedPreferences.getString("depths_device_id", "");
                f.c("ToolUtils", "[getPushFakeDeviceId]cache id:" + string);
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                StringBuilder sb = new StringBuilder();
                sb.append(Build.BOARD);
                sb.append(Build.HARDWARE);
                String[] strArr = Build.SUPPORTED_ABIS;
                sb.append(strArr.length > 0 ? strArr.hashCode() : 0);
                sb.append(Build.BRAND);
                sb.append(System.currentTimeMillis());
                sb.append(new Random().nextInt(9999));
                sb.append(i2);
                sb.append(i3);
                String J2 = J(sb.toString());
                f.c("ToolUtils", "[getPushFakeDeviceId]depths device id:" + J2);
                sharedPreferences.edit().putString("depths_device_id", J2).apply();
                return J2;
            } catch (Throwable th) {
                f.f("ToolUtils", "[getPushFakeDeviceId]exception ", th);
                return "";
            }
        }
    }

    public static List<ActivityManager.RunningAppProcessInfo> o() {
        if (!r(com.ss.android.message.a.a())) {
            f.c("ToolUtils", "[getRunningAppProcesses]return  empty running process because cur is inactive user");
            return new ArrayList();
        }
        boolean d2 = com.ss.android.pushmanager.setting.a.d();
        f.c("ToolUtils", "[getRunningAppProcesses]optSensitiveApiInvoke:" + d2);
        if (!d2) {
            f.c("ToolUtils", "[getRunningAppProcesses]invoke getRunningAppProcessesInternal without any frequency because settings of opt_sensitive_api_invoke is false");
            return ((ActivityManager) com.ss.android.message.a.a().getSystemService("activity")).getRunningAppProcesses();
        }
        synchronized (j) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - i >= 1000) {
                f.c("ToolUtils", "[getRunningAppProcesses]invoke getRunningAppProcess");
                i = currentTimeMillis;
                k = ((ActivityManager) com.ss.android.message.a.a().getSystemService("activity")).getRunningAppProcesses();
            } else {
                f.c("ToolUtils", "[getRunningAppProcesses]api invoke frequency,return lastRunningAppProcess");
            }
        }
        return k;
    }

    public static String p(String str) {
        Throwable th;
        String str2;
        Process exec;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        String str3 = null;
        try {
            exec = Runtime.getRuntime().exec("getprop " + str);
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
        } catch (Throwable th2) {
            th = th2;
            str2 = null;
        }
        try {
            str3 = bufferedReader.readLine();
            exec.destroy();
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                StringBuilder M = e.a.a.a.a.M("Exception while closing InputStream");
                M.append(e2.getMessage());
                f.e("ToolUtils", M.toString());
            }
            return str3;
        } catch (Throwable th3) {
            str2 = str3;
            bufferedReader2 = bufferedReader;
            th = th3;
            try {
                f.e("ToolUtils", "Unable to read sysprop " + str + th.getMessage());
                return str2;
            } finally {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e3) {
                        StringBuilder M2 = e.a.a.a.a.M("Exception while closing InputStream");
                        M2.append(e3.getMessage());
                        f.e("ToolUtils", M2.toString());
                    }
                }
            }
        }
    }

    public static int q(Context context) {
        f.c("ToolUtils", "[hasFocusPermission]");
        if (!i.b().f()) {
            return -1;
        }
        try {
            Uri parse = Uri.parse("content://miui.statusbar.notification.public");
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            Bundle call = context.getContentResolver().call(parse, "canShowFocus", (String) null, bundle);
            if (call == null) {
                return -1;
            }
            boolean z = call.getBoolean("canShowFocus", false);
            f.c("ToolUtils", "[hasFocusPermission]canShowFocus:" + z);
            return z ? 2 : 1;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("[hasFocusPermission]exception:");
            M.append(th.getLocalizedMessage());
            f.e("ToolUtils", M.toString());
            return -1;
        }
    }

    public static boolean r(Context context) {
        g gVar;
        c c2 = com.bytedance.common.g.a.c().e().c();
        if (c2 == null || (gVar = c2.o) == null || gVar.isGuestMode() || !gVar.hasAgreedForPrivacyDialog()) {
            return false;
        }
        return !TextUtils.isEmpty(k(context));
    }

    public static boolean s() {
        try {
            String str = Build.BRAND;
            if (com.bytedance.android.input.k.b.a.Y(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (com.bytedance.android.input.k.b.a.Y(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean t(Context context) {
        Boolean bool = f8350d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String h2 = h(context);
        boolean z = false;
        if (h2 != null && h2.contains(Constants.COLON_SEPARATOR)) {
            return false;
        }
        if (h2 != null && h2.equals(context.getPackageName())) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f8350d = valueOf;
        return valueOf.booleanValue();
    }

    public static Boolean u(Context context) {
        g gVar = com.bytedance.common.g.a.c().e().c().o;
        if (gVar == null || !gVar.hasAgreedForPrivacyDialog()) {
            f.c("ToolUtils", "hasAgreedForPrivacyDialog return false when isMainProcessStart is invoked.");
            return null;
        }
        if (t(context)) {
            f.c("ToolUtils", "isMainProcess return true when isMainProcessStart is invoked.");
            return Boolean.TRUE;
        }
        f.c("ToolUtils", "getRunningAppProcesses is to be invoked when isMainProcessStart is invoked.");
        try {
            List<ActivityManager.RunningAppProcessInfo> o = o();
            String packageName = context.getPackageName();
            if (o != null && !o.isEmpty()) {
                Iterator<ActivityManager.RunningAppProcessInfo> it2 = o.iterator();
                while (it2.hasNext()) {
                    if (packageName.equals(it2.next().processName)) {
                        return Boolean.TRUE;
                    }
                }
            }
            return Boolean.FALSE;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean v(Context context) {
        String h2 = h(context);
        if (h2 == null || !h2.endsWith(":push")) {
            return false;
        }
        f8350d = Boolean.FALSE;
        return true;
    }

    public static boolean w() {
        if (!h) {
            try {
                Class.forName("miui.os.Build");
                f8353g = true;
                h = true;
                return true;
            } catch (Exception unused) {
                h = true;
            }
        }
        return f8353g;
    }

    public static boolean x() {
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        return i.b().d() || (!TextUtils.isEmpty(str) && (str.toLowerCase().contains("oppo") || str.toLowerCase().contains("oneplus"))) || (!TextUtils.isEmpty(str2) && (str2.toLowerCase().contains("oppo") || str2.toLowerCase().contains("oneplus")));
    }

    public static boolean y(Context context) {
        String h2 = h(context);
        if (h2 == null || !h2.endsWith(":pushservice")) {
            return false;
        }
        f8350d = Boolean.FALSE;
        return true;
    }

    public static boolean z(Context context) {
        String h2 = h(context);
        if (h2 == null) {
            return false;
        }
        if (!h2.endsWith(":smp") && !h2.endsWith(":widgetProvider")) {
            return false;
        }
        f8350d = Boolean.FALSE;
        return true;
    }
}
