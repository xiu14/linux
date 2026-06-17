package com.bytedance.push.g0;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.common.BundleUtil;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j {
    private static final String a;
    private static final l b;

    /* renamed from: c, reason: collision with root package name */
    private static String f5712c;

    /* renamed from: d, reason: collision with root package name */
    private static String f5713d;

    /* renamed from: e, reason: collision with root package name */
    private static String f5714e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f5715f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f5716g;
    private static final JSONObject h;
    private static Boolean i;

    static {
        String str;
        String valueOf = String.valueOf(Build.VERSION.SDK);
        a = valueOf;
        b = new l();
        f5712c = valueOf;
        try {
            str = d();
        } catch (Throwable th) {
            th.printStackTrace();
            str = null;
        }
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            str = a;
        }
        f5712c = str;
        h = new JSONObject();
        i = null;
    }

    public static String a() {
        JSONObject jSONObject = h;
        synchronized (jSONObject) {
            if (!f5715f) {
                f();
            }
            if (!jSONObject.keys().hasNext()) {
                return "";
            }
            return jSONObject.toString();
        }
    }

    private static String b() {
        if (com.bytedance.android.input.k.b.a.Y(f5714e)) {
            f5714e = e("ro.build.version.emui");
        }
        if (com.bytedance.android.input.k.b.a.Y(f5714e)) {
            f5714e = e("ro.build.version.magic");
        }
        if (!com.bytedance.android.input.k.b.a.Y(f5714e)) {
            String lowerCase = (f5714e + BundleUtil.UNDERLINE_TAG + Build.DISPLAY).toLowerCase();
            if (!com.bytedance.android.input.k.b.a.Y(lowerCase)) {
                return lowerCase.toLowerCase();
            }
        }
        return a;
    }

    public static String c() {
        return f5712c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String d() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.g0.j.d():java.lang.String");
    }

    public static String e(String str) {
        return b.a(str);
    }

    private static void f() {
        if (f5715f) {
            return;
        }
        try {
            boolean h2 = h();
            f5716g = h2;
            if (h2) {
                String e2 = e("hw_sc.build.os.apiversion");
                String e3 = e("hw_sc.build.os.releasetype");
                String e4 = e("hw_sc.build.platform.version");
                JSONObject jSONObject = h;
                jSONObject.put("api_version", e2);
                jSONObject.put("release_type", e3);
                jSONObject.put("version", e4);
                Log.d("RomVersionParamHelper", "initHarmonyOsVersion: apiVersion is " + e2 + " releaseType is " + e3 + " version is " + e4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        f5715f = true;
    }

    public static boolean g() {
        a();
        try {
            String optString = h.optString("version", "");
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            return Integer.parseInt(optString.split("\\.")[0]) >= 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean h() {
        try {
            Boolean bool = i;
            if (bool != null) {
                return bool.booleanValue();
            }
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Boolean valueOf = Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            i = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            f.l("", "isn't harmony");
            return false;
        }
    }

    public static boolean i() {
        if (!com.ss.android.e.a.a.b()) {
            return false;
        }
        try {
            return Integer.parseInt(e("ro.miui.ui.version.name").substring(1)) >= 12;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean j() {
        String str = Build.MANUFACTURER;
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return false;
        }
        return str.toLowerCase().contains("oppo");
    }
}
