package com.bytedance.apm;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    public static final /* synthetic */ int A = 0;
    private static Context a;
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3429c;

    /* renamed from: d, reason: collision with root package name */
    private static long f3430d;

    /* renamed from: e, reason: collision with root package name */
    private static long f3431e;

    /* renamed from: f, reason: collision with root package name */
    private static long f3432f;
    private static long m;
    private static long n;
    private static String o;
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private static String t;
    private static i u;
    static long w;
    static long x;
    static long y;
    static long z;

    /* renamed from: g, reason: collision with root package name */
    private static JSONObject f3433g = new JSONObject();
    private static com.bytedance.apm.core.b h = new com.bytedance.apm.core.a();
    private static Map<String, String> i = Collections.emptyMap();
    private static IHttpService j = new DefaultHttpServiceImpl();
    private static long k = -1;
    private static volatile int l = -1;
    private static boolean s = true;
    private static com.bytedance.apm.core.d v = null;

    public static String A(long j2) {
        long j3 = j2 - n;
        return j3 < 30000 ? "0 - 30s" : j3 < com.heytap.mcssdk.constant.a.f6886d ? "30s - 1min" : j3 < 120000 ? "1min - 2min" : j3 < 300000 ? "2min - 5min" : j3 < 600000 ? "5min - 10min" : j3 < 1800000 ? "10min - 30min" : j3 < 3600000 ? "30min - 1h" : "1h - ";
    }

    public static boolean B() {
        return b;
    }

    public static boolean C() {
        return q;
    }

    public static boolean D() {
        return f3429c;
    }

    public static boolean E() {
        JSONObject jSONObject = f3433g;
        if (jSONObject == null || jSONObject.optString("channel") == null) {
            return false;
        }
        return f3433g.optString("channel").contains("local");
    }

    public static boolean F() {
        if (p) {
            return true;
        }
        if (a == null) {
            return G();
        }
        String i2 = i();
        if (i2 == null || !i2.contains(Constants.COLON_SEPARATOR)) {
            p = i2 != null && i2.equals(a.getPackageName());
        } else {
            p = false;
        }
        return p;
    }

    public static boolean G() {
        String i2;
        return p || (i2 = i()) == null || !i2.contains(Constants.COLON_SEPARATOR);
    }

    public static boolean H() {
        return s;
    }

    public static void I(String str) {
        t = null;
    }

    public static void J(long j2) {
        if (j2 <= 0) {
            return;
        }
        long j3 = m;
        if (j3 == 0 || j2 < j3) {
            m = j2;
        }
    }

    public static void K(Context context) {
        if (context == null) {
            return;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        a = (Application) context;
    }

    public static void L(String str) {
        o = null;
    }

    public static void M(boolean z2) {
        b = z2;
        e.b.b.n.a.d(B());
    }

    public static void N(boolean z2) {
        q = z2;
    }

    public static synchronized void O(com.bytedance.apm.core.b bVar) {
        synchronized (g.class) {
            h = bVar;
            Map<String, String> commonParams = bVar.getCommonParams();
            i = commonParams;
            if (commonParams == null) {
                i = new HashMap();
            }
            if (!i.containsKey(WsConstants.KEY_APP_ID)) {
                i.put(WsConstants.KEY_APP_ID, f3433g.optString(WsConstants.KEY_APP_ID));
            }
            if (!i.containsKey("device_id")) {
                i.put("device_id", f3433g.optString("device_id"));
            }
            if (!i.containsKey("device_platform")) {
                i.put("device_platform", "android");
            }
            i.put(RomInfo.KEY_OS_TYPE, "Android");
            if (!i.containsKey("update_version_code")) {
                i.put("update_version_code", f3433g.optString("update_version_code"));
            }
            if (!i.containsKey("version_code")) {
                i.put("version_code", f3433g.optString("version_code"));
            }
            if (!i.containsKey("channel")) {
                i.put("channel", f3433g.optString("channel"));
            }
            if (!i.containsKey(RomInfo.KEY_ROM_OS_API)) {
                i.put(RomInfo.KEY_ROM_OS_API, Build.VERSION.SDK_INT + "");
            }
            if (B() && !i.containsKey("_log_level")) {
                i.put("_log_level", DownloadSettingKeys.DEBUG);
            }
            if (u == null) {
                u = new i();
            }
            u.p(new HashMap(i));
        }
    }

    public static synchronized void P(JSONObject jSONObject) {
        synchronized (g.class) {
            try {
                if (u == null) {
                    u = new i();
                }
                jSONObject.put(RomInfo.KEY_OS_TYPE, "Android");
                jSONObject.put("device_platform", "android");
                jSONObject.put(RomInfo.KEY_ROM_OS_VERSION, Build.VERSION.RELEASE);
                jSONObject.put(RomInfo.KEY_ROM_OS_API, Build.VERSION.SDK_INT);
                jSONObject.put(HardwareInfo.KEY_HW_VENDOR_MODEL, Build.MODEL);
                jSONObject.put(HardwareInfo.KEY_HW_VENDOR_BRAND, Build.BRAND);
                jSONObject.put(HardwareInfo.KEY_HW_VENDOR_MANUFACTURER, Build.MANUFACTURER);
                jSONObject.put("process_name", com.bytedance.apm.util.a.a(Process.myPid()));
                jSONObject.put(WsConstants.KEY_SESSION_ID, z());
                if (n == 0) {
                    n = System.currentTimeMillis();
                }
                jSONObject.put("phone_startup_time", n);
                jSONObject.put("verify_info", com.bytedance.apm.util.n.c());
                jSONObject.put("rom_version", com.bytedance.apm.util.m.a());
                PackageInfo packageInfo = null;
                if (!jSONObject.has("version_name")) {
                    packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                    jSONObject.put("version_name", packageInfo.versionName);
                }
                if (TextUtils.isEmpty(jSONObject.optString("app_version"))) {
                    jSONObject.put("app_version", jSONObject.optString("version_name"));
                }
                if (!jSONObject.has("version_code")) {
                    if (packageInfo == null) {
                        packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                    }
                    jSONObject.put("version_code", packageInfo.versionCode);
                }
                if (TextUtils.isEmpty(jSONObject.optString("package"))) {
                    jSONObject.put("package", a.getPackageName());
                }
                jSONObject.put(MonitorConstants.EXTRA_MONITOR_VERSION, "5.0.21.11");
            } catch (Exception unused) {
            }
            i iVar = u;
            jSONObject.optString("process_name");
            Objects.requireNonNull(iVar);
            u.n(jSONObject.optString("device_id"));
            try {
                u.k(jSONObject.optInt(WsConstants.KEY_APP_ID));
                u.m(jSONObject.optString("channel"));
                if (jSONObject.has("update_version_code")) {
                    if (jSONObject.get("update_version_code") instanceof String) {
                        u.s(Integer.valueOf(jSONObject.optString("update_version_code")).intValue());
                    } else {
                        u.s(jSONObject.optInt("update_version_code"));
                    }
                }
                if (jSONObject.has("version_name")) {
                    u.t(jSONObject.optString("version_name"));
                }
                if (jSONObject.has("manifest_version_code")) {
                    if (jSONObject.get("manifest_version_code") instanceof String) {
                        u.o(Integer.valueOf(jSONObject.optString("manifest_version_code")).intValue());
                    } else {
                        u.o(jSONObject.optInt("manifest_version_code"));
                    }
                }
                if (jSONObject.has("version_code")) {
                    if (jSONObject.get("version_code") instanceof String) {
                        i iVar2 = u;
                        Integer.valueOf(jSONObject.optString("version_code")).intValue();
                        Objects.requireNonNull(iVar2);
                    } else {
                        i iVar3 = u;
                        jSONObject.optInt("version_code");
                        Objects.requireNonNull(iVar3);
                    }
                }
                if (jSONObject.has("app_version")) {
                    u.l(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("release_build")) {
                    u.q(jSONObject.optString("release_build"));
                } else if (!com.bytedance.apm.util.n.c().isEmpty()) {
                    u.q(com.bytedance.apm.util.n.c());
                }
            } catch (Exception unused2) {
            }
            u.r(com.bytedance.android.input.k.b.a.r(jSONObject));
            f3433g = jSONObject;
        }
    }

    public static void Q(IHttpService iHttpService) {
        if (iHttpService != null) {
            j = iHttpService;
        }
    }

    public static void R(long j2) {
        f3430d = j2;
    }

    public static void S(long j2) {
        w = j2;
    }

    public static void T(long j2) {
        x = j2;
    }

    public static void U(long j2) {
        y = j2;
    }

    public static void V(long j2) {
        z = j2;
    }

    public static void W(long j2) {
        f3431e = j2;
    }

    public static void X(long j2) {
        n = j2;
    }

    public static void Y(boolean z2) {
        f3429c = z2;
    }

    public static void Z(int i2) {
        l = i2;
    }

    public static com.bytedance.services.apm.api.g a(String str, String str2, boolean z2) throws Exception {
        return j.buildMultipartUpload(str, str2, z2);
    }

    public static synchronized void a0(com.bytedance.apm.core.d dVar) {
        synchronized (g.class) {
            v = null;
        }
    }

    public static com.bytedance.services.apm.api.g b(String str, String str2, boolean z2, Map<String, String> map) throws Exception {
        return j.buildMultipartUpload(str, str2, z2, map);
    }

    public static void b0(long j2) {
        f3432f = j2;
    }

    public static com.bytedance.services.apm.api.c c(String str, Map<String, String> map) throws Exception {
        return j.doGet(str, map);
    }

    public static void c0(boolean z2) {
        r = z2;
    }

    public static com.bytedance.services.apm.api.c d(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return j.doPost(str, bArr, map);
    }

    public static boolean d0() {
        return r;
    }

    public static boolean e(String str, String str2) {
        JSONObject jSONObject = f3433g;
        if (jSONObject == null) {
            return false;
        }
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static com.bytedance.services.apm.api.c e0(String str, List<File> list, Map<String, String> map) throws Exception {
        return j.uploadFiles(str, list, map);
    }

    public static String f() {
        return t;
    }

    public static long g() {
        return m;
    }

    public static Context h() {
        return a;
    }

    public static String i() {
        if (TextUtils.isEmpty(o)) {
            o = com.bytedance.apm.util.a.a(Process.myPid());
        }
        return o;
    }

    public static com.bytedance.apm.core.b j() {
        return h;
    }

    public static JSONObject k() {
        return f3433g;
    }

    public static IHttpService l() {
        return j;
    }

    public static long m() {
        return f3430d;
    }

    public static long n() {
        return f3431e;
    }

    public static long o() {
        return w;
    }

    public static long p() {
        return x;
    }

    public static long q() {
        return y;
    }

    public static long r() {
        return z;
    }

    public static long s() {
        if (n == 0) {
            n = System.currentTimeMillis();
        }
        return n;
    }

    public static int t() {
        return l;
    }

    public static String u() {
        Context context = a;
        return context == null ? "" : context.getPackageName();
    }

    public static synchronized i v() {
        i iVar;
        synchronized (g.class) {
            iVar = u;
        }
        return iVar;
    }

    public static synchronized Map<String, String> w() {
        Map<String, String> a2;
        synchronized (g.class) {
            com.bytedance.apm.core.d dVar = v;
            if (dVar == null || (a2 = dVar.a()) == null || a2.size() <= 0) {
                i iVar = u;
                if (iVar != null) {
                    return iVar.f();
                }
                return null;
            }
            if (u.f() == null) {
                return a2;
            }
            HashMap hashMap = new HashMap(u.f());
            hashMap.putAll(a2);
            return hashMap;
        }
    }

    public static synchronized Map<String, String> x() {
        Map<String, String> a2;
        synchronized (g.class) {
            com.bytedance.apm.core.d dVar = v;
            if (dVar == null || (a2 = dVar.a()) == null || a2.size() <= 0) {
                return i;
            }
            HashMap hashMap = new HashMap(i);
            hashMap.putAll(a2);
            return hashMap;
        }
    }

    public static long y() {
        return f3432f;
    }

    public static long z() {
        if (k == -1) {
            k = System.currentTimeMillis();
        }
        return k;
    }
}
