package com.bytedance.bdinstall.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0640u;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.Locale;

/* loaded from: classes.dex */
public class n {
    private static final p<Boolean> a = new a();
    public static final /* synthetic */ int b = 0;

    static class a extends p<Boolean> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Boolean a(Object[] objArr) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                return Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            } catch (Throwable unused) {
                int i = C0640u.a;
                return Boolean.FALSE;
            }
        }
    }

    public static String a() {
        return e("ro.build.version.emui");
    }

    public static String b() {
        String d2 = d("persist.pxr.product.forcename", "");
        if (TextUtils.isEmpty(d2)) {
            d2 = d("pxr.vendorhw.product.name", "");
        }
        return TextUtils.isEmpty(d2) ? Build.PRODUCT : d2;
    }

    public static String c() {
        String str;
        if (n()) {
            if (!n()) {
                return "";
            }
            StringBuilder M = e.a.a.a.a.M("miui_");
            M.append(e("ro.miui.ui.version.name"));
            M.append(BundleUtil.UNDERLINE_TAG);
            M.append(Build.VERSION.INCREMENTAL);
            return M.toString();
        }
        if (h()) {
            if (!h()) {
                return "";
            }
            StringBuilder M2 = e.a.a.a.a.M("coloros_");
            M2.append(e("ro.build.version.opporom"));
            M2.append(BundleUtil.UNDERLINE_TAG);
            M2.append(Build.DISPLAY);
            return M2.toString();
        }
        String a2 = a();
        if (a2 == null || !(a2.toLowerCase().contains("emotionui") || a2.toLowerCase().contains("magicui"))) {
            str = "";
        } else {
            StringBuilder S = e.a.a.a.a.S(a2, BundleUtil.UNDERLINE_TAG);
            S.append(Build.DISPLAY);
            str = S.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(e("ro.vivo.os.build.display.id"))) {
            return e("ro.vivo.os.build.display.id") + BundleUtil.UNDERLINE_TAG + e("ro.vivo.product.version");
        }
        if (i()) {
            String str2 = Build.DISPLAY;
            return (str2 == null || !str2.toLowerCase().contains("flyme")) ? "" : str2;
        }
        String str3 = Build.DISPLAY;
        boolean z = false;
        if (!TextUtils.isEmpty(str3) && str3.toLowerCase().contains("amigo")) {
            StringBuilder S2 = e.a.a.a.a.S(str3, BundleUtil.UNDERLINE_TAG);
            S2.append(e("ro.gn.sv.version"));
            return S2.toString();
        }
        String str4 = Build.MANUFACTURER + Build.BRAND;
        if (!TextUtils.isEmpty(str4)) {
            String lowerCase = str4.toLowerCase();
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                z = true;
            }
        }
        if (z) {
            return e.a.a.a.a.K(new StringBuilder(), e("ro.build.uiversion"), BundleUtil.UNDERLINE_TAG, str3);
        }
        String K = true ^ TextUtils.isEmpty(e("ro.letv.release.version")) ? e.a.a.a.a.K(e.a.a.a.a.M("eui_"), e("ro.letv.release.version"), BundleUtil.UNDERLINE_TAG, str3) : "";
        return !TextUtils.isEmpty(K) ? K : str3;
    }

    public static String d(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    private static String e(String str) {
        return (String) r.a(str);
    }

    public static boolean f() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (!TextUtils.isEmpty((String) cls.getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(cls, "ro.build.version.emui"))) {
                int i = C0640u.a;
                return true;
            }
        } catch (Exception e2) {
            e2.getMessage();
            int i2 = C0640u.a;
        }
        return false;
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i >= 30 || (i == 29 && Build.VERSION.PREVIEW_SDK_INT > 0);
    }

    public static boolean h() {
        if (!"oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.BRAND;
            if (!"oppo".equalsIgnoreCase(str) && !"realme".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean i() {
        String str = Build.DISPLAY;
        return (!TextUtils.isEmpty(str) && str.contains("Flyme")) || "flyme".equals(Build.USER);
    }

    public static boolean j() {
        return a.b(new Object[0]).booleanValue();
    }

    public static boolean k() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("honor")) {
            String str2 = Build.MANUFACTURER;
            if ((TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("honor")) && !SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean l() {
        String str = Build.FINGERPRINT;
        if (!TextUtils.isEmpty(str)) {
            return str.contains("VIBEUI_V2");
        }
        String e2 = e("ro.build.version.incremental");
        return !TextUtils.isEmpty(e2) && e2.contains("VIBEUI_V2");
    }

    public static boolean m() {
        String str = Build.BRAND;
        if (str == null) {
            return false;
        }
        return str.toLowerCase(Locale.ENGLISH).contains("meizu");
    }

    public static boolean n() {
        try {
            return Class.forName("miui.os.Build").getName().length() > 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
