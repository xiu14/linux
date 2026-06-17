package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class k {
    private static volatile int a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, o> f923a = null;
    private static int b = -1;

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m654a() {
        return a() == 1;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m659b() {
        return a() == 2;
    }

    /* renamed from: c, reason: collision with other method in class */
    public static boolean m660c() {
        if (b < 0) {
            b = !m664g() ? 1 : 0;
        }
        return b > 0;
    }

    /* renamed from: d, reason: collision with other method in class */
    public static boolean m661d() {
        try {
            return TextUtils.equals("com.xiaomi.xmsf", (CharSequence) bh.a("android.app.ActivityThread", "currentPackageName", new Object[0]));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    public static boolean m662e() {
        return !o.China.name().equalsIgnoreCase(a(m657b()).name());
    }

    /* renamed from: f, reason: collision with other method in class */
    public static boolean m663f() {
        return a(1);
    }

    /* renamed from: g, reason: collision with other method in class */
    public static boolean m664g() {
        String str;
        String str2 = "";
        try {
            str = C0779r.a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str2 = C0779r.a("ro.mi.os.version.code", "");
            } catch (Exception unused2) {
            }
        } else {
            str2 = str;
        }
        return !TextUtils.isEmpty(str2);
    }

    public static String h() {
        return m652a("ro.product.manufacturer");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            int r0 = com.xiaomi.push.k.a
            if (r0 != 0) goto L5b
            r0 = 0
            java.lang.String r1 = "ro.miui.ui.version.code"
            java.lang.String r1 = m652a(r1)     // Catch: java.lang.Throwable -> L41
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L41
            r2 = 1
            if (r1 == 0) goto L39
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = m652a(r1)     // Catch: java.lang.Throwable -> L41
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L39
            java.lang.String r1 = "ro.mi.os.version.code"
            java.lang.String r1 = m652a(r1)     // Catch: java.lang.Throwable -> L41
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L39
            java.lang.String r1 = "ro.mi.os.version.name"
            java.lang.String r1 = m652a(r1)     // Catch: java.lang.Throwable -> L41
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L37
            goto L39
        L37:
            r1 = r0
            goto L3a
        L39:
            r1 = r2
        L3a:
            if (r1 == 0) goto L3d
            goto L3e
        L3d:
            r2 = 2
        L3e:
            com.xiaomi.push.k.a = r2     // Catch: java.lang.Throwable -> L41
            goto L49
        L41:
            r1 = move-exception
            java.lang.String r2 = "get isMIUI failed"
            com.xiaomi.channel.commonutils.logger.c.a(r2, r1)
            com.xiaomi.push.k.a = r0
        L49:
            java.lang.String r0 = "isMIUI's value is: "
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            int r1 = com.xiaomi.push.k.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.c.b(r0)
        L5b:
            int r0 = com.xiaomi.push.k.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.k.a():int");
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m657b() {
        String a2 = C0779r.a("ro.miui.region", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = m658b(C0779r.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = C0779r.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a2)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("get region from system, region = " + a2);
        }
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String country = Locale.getDefault().getCountry();
        com.xiaomi.channel.commonutils.logger.c.m15a("locale.default.country = " + country);
        return country;
    }

    public static String d() {
        return m652a("ro.mi.os.version.incremental");
    }

    public static String e() {
        return m663f() ? d() : Build.VERSION.INCREMENTAL;
    }

    public static String f() {
        return m652a("ro.miui.ui.version.name");
    }

    public static String c() {
        return m652a("ro.mi.os.version.name");
    }

    public static String g() {
        return m652a(com.heytap.mcssdk.utils.d.f6924d);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m651a() {
        int a2 = t.a();
        return (!m654a() || a2 <= 0) ? "" : a2 < 2 ? "alpha" : a2 < 3 ? "development" : "stable";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m652a(String str) {
        try {
            try {
                return (String) bh.a("android.os.SystemProperties", MonitorConstants.CONNECT_TYPE_GET, str, "");
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d("fail to get property. " + e2);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m655a(Context context) {
        return context != null && m656a(context.getPackageName());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m656a(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    public static o a(String str) {
        o b2 = b(str);
        return b2 == null ? o.Global : b2;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m653a() {
        if (f923a != null) {
            return;
        }
        HashMap hashMap = new HashMap();
        f923a = hashMap;
        hashMap.put("CN", o.China);
        Map<String, o> map = f923a;
        o oVar = o.Europe;
        map.put("FI", oVar);
        f923a.put("SE", oVar);
        f923a.put("NO", oVar);
        f923a.put("FO", oVar);
        f923a.put("EE", oVar);
        f923a.put("LV", oVar);
        f923a.put("LT", oVar);
        f923a.put("BY", oVar);
        f923a.put("MD", oVar);
        f923a.put("UA", oVar);
        f923a.put("PL", oVar);
        f923a.put("CZ", oVar);
        f923a.put("SK", oVar);
        f923a.put("HU", oVar);
        f923a.put("DE", oVar);
        f923a.put("AT", oVar);
        f923a.put("CH", oVar);
        f923a.put("LI", oVar);
        f923a.put("GB", oVar);
        f923a.put("IE", oVar);
        f923a.put("NL", oVar);
        f923a.put("BE", oVar);
        f923a.put("LU", oVar);
        f923a.put("FR", oVar);
        f923a.put("RO", oVar);
        f923a.put("BG", oVar);
        f923a.put("RS", oVar);
        f923a.put("MK", oVar);
        f923a.put("AL", oVar);
        f923a.put("GR", oVar);
        f923a.put("SI", oVar);
        f923a.put("HR", oVar);
        f923a.put("IT", oVar);
        f923a.put("SM", oVar);
        f923a.put("MT", oVar);
        f923a.put("ES", oVar);
        f923a.put("PT", oVar);
        f923a.put("AD", oVar);
        f923a.put("CY", oVar);
        f923a.put("DK", oVar);
        f923a.put("IS", oVar);
        f923a.put("UK", oVar);
        f923a.put("EL", oVar);
        f923a.put("RU", o.Russia);
        f923a.put("IN", o.India);
    }

    private static o b(String str) {
        m653a();
        return f923a.get(str.toUpperCase());
    }

    public static int b() {
        String m652a = m652a("ro.mi.os.version.code");
        if (TextUtils.isEmpty(m652a) || !TextUtils.isDigitsOnly(m652a)) {
            return 0;
        }
        return Integer.parseInt(m652a);
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private static String m658b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return split.length > 0 ? split[0] : str;
    }

    public static int a(Context context) {
        String m652a = m652a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(m652a) || !TextUtils.isDigitsOnly(m652a)) {
            return 0;
        }
        return Integer.parseInt(m652a);
    }

    public static boolean a(int i) {
        String m652a = m652a("ro.mi.os.version.code");
        return !TextUtils.isEmpty(m652a) && TextUtils.isDigitsOnly(m652a) && Integer.parseInt(m652a) >= i;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + a(intent.getExtras());
    }

    public static String a(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) obj));
                } else if (obj instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb.append(a((Bundle) obj));
                } else {
                    sb.append(obj);
                }
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
