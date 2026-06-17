package e.b.b.h.c;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.x.c;
import com.bytedance.apm6.hub.y;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends e.b.b.n.a {

    /* renamed from: c, reason: collision with root package name */
    private static y f9453c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f9454d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f9455e = null;

    /* renamed from: f, reason: collision with root package name */
    private static String f9456f = null;

    /* renamed from: g, reason: collision with root package name */
    private static int f9457g = -1;
    private static String h = null;
    private static int i = -1;
    private static String j = null;
    private static String k = null;
    private static long l = -1;
    private static long m = 0;
    private static int n = -1;
    private static JSONObject o = null;
    private static Map<String, String> p = null;
    private static long q = -1;
    private static c r;

    public static void A(long j2) {
        q = j2;
    }

    public static void B(long j2) {
        m = j2;
    }

    public static void C(c cVar) {
        r = null;
    }

    public static void D(long j2) {
        l = j2;
    }

    public static com.bytedance.services.apm.api.c e(String str, Map<String, String> map, byte[] bArr) throws Exception {
        return ((IHttpService) e.b.b.m.c.a(IHttpService.class)).doPost(str, bArr, map);
    }

    public static int f() {
        return f9453c.h();
    }

    public static y g() {
        return f9453c;
    }

    public static String h() {
        if (TextUtils.isEmpty(j)) {
            synchronized (a.class) {
                if (TextUtils.isEmpty(j)) {
                    j = f9453c.i();
                }
            }
        }
        return j;
    }

    public static String i() {
        if (f9456f == null) {
            synchronized (a.class) {
                if (f9456f == null) {
                    f9456f = f9453c.j();
                }
            }
        }
        return f9456f;
    }

    public static long j() {
        return q;
    }

    public static String k() {
        if (f9454d == null) {
            synchronized (a.class) {
                if (f9454d == null) {
                    f9454d = f9453c.p();
                }
            }
        }
        return f9454d;
    }

    public static String l() {
        return f9453c.l();
    }

    public static long m() {
        if (m <= 0) {
            m = System.currentTimeMillis();
        }
        return m;
    }

    public static String n() {
        if (n == -1) {
            synchronized (a.class) {
                if (n == -1) {
                    n = f9453c.m();
                }
            }
        }
        return String.valueOf(n);
    }

    public static c o() {
        return r;
    }

    public static String p() {
        if (TextUtils.isEmpty(k)) {
            synchronized (a.class) {
                if (TextUtils.isEmpty(k)) {
                    k = f9453c.q();
                }
            }
        }
        return k;
    }

    public static String q() {
        return f9453c.r();
    }

    public static JSONObject r() {
        if (o == null) {
            synchronized (a.class) {
                if (o == null) {
                    o = f9453c.s();
                }
            }
        }
        return o;
    }

    public static long s() {
        if (l < 0) {
            l = System.currentTimeMillis();
        }
        return l;
    }

    public static int t() {
        if (f9457g == -1) {
            synchronized (a.class) {
                if (f9457g == -1) {
                    f9457g = f9453c.u();
                }
            }
        }
        return f9457g;
    }

    public static Map<String, String> u() {
        if (p == null) {
            HashMap hashMap = new HashMap();
            p = hashMap;
            hashMap.put(WsConstants.KEY_APP_ID, String.valueOf(f()));
            p.put(RomInfo.KEY_OS_TYPE, "Android");
            p.put("device_platform", "android");
            p.put(RomInfo.KEY_ROM_OS_API, Build.VERSION.SDK_INT + "");
            p.put("update_version_code", String.valueOf(t()));
            p.put("version_code", h());
            p.put("channel", i());
            p.put(HardwareInfo.KEY_HW_VENDOR_MODEL, Build.MODEL);
            p.put(HardwareInfo.KEY_HW_VENDOR_BRAND, Build.BRAND);
        }
        p.put("device_id", l());
        if (e.b.b.n.a.b()) {
            p.put("_log_level", DownloadSettingKeys.DEBUG);
        }
        try {
            Map<String, String> o2 = f9453c.o();
            if (o2 != null && o2.size() > 0) {
                for (Map.Entry<String, String> entry : o2.entrySet()) {
                    p.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return p;
    }

    public static long v() {
        return f9453c.t();
    }

    public static int w() {
        if (i == -1) {
            synchronized (a.class) {
                if (i == -1) {
                    i = f9453c.v();
                }
            }
        }
        return i;
    }

    public static String x() {
        if (TextUtils.isEmpty(h)) {
            synchronized (a.class) {
                if (TextUtils.isEmpty(h)) {
                    h = f9453c.w();
                }
            }
        }
        return h;
    }

    public static boolean y() {
        if (f9455e == null) {
            synchronized (a.class) {
                if (f9455e == null) {
                    String k2 = k();
                    if (k2 == null || !k2.contains(Constants.COLON_SEPARATOR)) {
                        f9455e = Boolean.valueOf(k2 != null && k2.equals(e.b.b.n.a.a().getPackageName()));
                    } else {
                        f9455e = Boolean.FALSE;
                    }
                }
            }
        }
        return f9455e.booleanValue();
    }

    public static void z(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("apmAdapter cannot be null!");
        }
        f9453c = yVar;
        e.b.b.n.a.c(yVar.k());
    }
}
