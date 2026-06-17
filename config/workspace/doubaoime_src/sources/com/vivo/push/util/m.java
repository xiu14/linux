package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    private static Method f8928f;
    public static final boolean a = ah.b("ro.vivo.product.overseas", "no").equals("yes");
    public static final boolean b = b("rom_1.0");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8925c = b("rom_2.0");

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8926d = b("rom_2.5");

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f8927e = b("rom_3.0");

    /* renamed from: g, reason: collision with root package name */
    private static String f8929g = null;
    private static String h = null;

    public static String a(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    private static boolean b(String str) {
        String b2 = ah.b("ro.vivo.rom", "");
        String b3 = ah.b("ro.vivo.rom.version", "");
        t.d("Device", "ro.vivo.rom = " + b2 + " ; ro.vivo.rom.version = " + b3);
        if (b2 == null || !b2.contains(str)) {
            return b3 != null && b3.contains(str);
        }
        return true;
    }

    public static synchronized String a() {
        synchronized (m.class) {
            if (f8929g == null && h == null) {
                try {
                    Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class);
                    f8928f = declaredMethod;
                    declaredMethod.setAccessible(true);
                    f8929g = (String) f8928f.invoke(null, "ro.vivo.rom", "@><@");
                    h = (String) f8928f.invoke(null, "ro.vivo.rom.version", "@><@");
                } catch (Exception unused) {
                    t.b("Device", "getRomCode error");
                }
            }
            t.d("Device", "sRomProperty1 : " + f8929g + " ; sRomProperty2 : " + h);
            String a2 = a(f8929g);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            String a3 = a(h);
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            return a3;
        }
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            t.d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        t.d("Device", "Build.MANUFACTURER is " + str);
        return str.toLowerCase().contains("bbk") || str.toLowerCase().startsWith("vivo");
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(matcher.group(1));
        sb.append(TextUtils.isEmpty(matcher.group(2)) ? "0" : matcher.group(2).substring(0, 1));
        return sb.toString();
    }
}
