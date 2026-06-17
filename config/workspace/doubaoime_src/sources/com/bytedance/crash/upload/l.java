package com.bytedance.crash.upload;

import androidx.annotation.Nullable;
import com.bytedance.crash.C0652g;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class l {

    /* renamed from: d, reason: collision with root package name */
    private static final a f4707d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4708e = false;

    /* renamed from: f, reason: collision with root package name */
    private static int f4709f = 100;

    /* renamed from: g, reason: collision with root package name */
    private static int f4710g = 2;
    private static int h = 5;
    private static boolean i = false;
    private static l j;
    private static volatile boolean k;
    private long a;
    private final HashMap<String, Long> b;

    /* renamed from: c, reason: collision with root package name */
    private final File f4711c;

    public static class a {
    }

    private l() {
        Long l;
        this.a = 0L;
        String str = com.bytedance.crash.util.a.i().replace(".", BundleUtil.UNDERLINE_TAG).replace(Constants.COLON_SEPARATOR, Constants.ACCEPT_TIME_SEPARATOR_SERVER) + ".times";
        File file = new File(C0652g.k(), "uploadLimits");
        com.bytedance.android.input.k.b.a.m(file);
        File file2 = new File(file, str);
        this.f4711c = file2;
        HashMap<String, Long> hashMap = new HashMap<>();
        if (file2.exists()) {
            try {
                JSONArray s = com.bytedance.crash.util.a.s(file2, -1L);
                if (!com.bytedance.android.input.k.b.a.b0(s)) {
                    try {
                        l = Long.decode(s.optString(0, null));
                    } catch (Exception unused) {
                        l = 0L;
                    }
                    if (System.currentTimeMillis() - l.longValue() >= com.heytap.mcssdk.constant.a.f6888f) {
                        com.bytedance.android.input.k.b.a.X("UploadLimits", "limit file exceed 1 day");
                        this.a = System.currentTimeMillis();
                        com.bytedance.crash.util.a.b(this.f4711c);
                    } else {
                        this.a = l.longValue();
                        for (int i2 = 1; i2 < s.length(); i2++) {
                            String[] split = s.optString(i2, "").split(" ");
                            if (split.length == 2) {
                                hashMap.put(split[0], Long.decode(split[1]));
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
                this.a = System.currentTimeMillis();
                com.bytedance.crash.util.a.b(this.f4711c);
            }
        } else {
            this.a = System.currentTimeMillis();
        }
        this.b = hashMap;
        com.bytedance.android.input.k.b.a.X("UploadLimits", "upload_times:" + hashMap);
        k = true;
    }

    public static l d() {
        if (j == null) {
            synchronized (l.class) {
                if (j == null) {
                    j = new l();
                }
            }
        }
        return j;
    }

    public static boolean e() {
        return k;
    }

    public static void f(k kVar) {
        if (kVar == null) {
            return;
        }
        f4709f = kVar.a();
        h = kVar.b();
        f4710g = kVar.c();
        i = false;
        com.bytedance.android.input.k.b.a.X("UploadLimits", "updateConfig:" + kVar);
    }

    private synchronized void h(String str) {
        com.bytedance.android.input.k.b.a.X("UploadLimits", "updateTimes:" + str);
        Long l = this.b.get(str);
        this.b.put(str, Long.valueOf(l != null ? 1 + l.longValue() : 1L));
    }

    public boolean a() {
        return c("ensure_all", f4709f);
    }

    public boolean b(@Nullable String str, String str2) {
        if (i) {
            return false;
        }
        boolean c2 = c(str2, f4710g);
        boolean c3 = str != null ? c(str, h) : false;
        boolean c4 = c("ensure_all", f4709f);
        StringBuilder U = e.a.a.a.a.U("checkEnsureLimit:", str2, " ");
        U.append(f4710g);
        U.append(ContainerUtils.KEY_VALUE_DELIMITER);
        U.append(c2);
        U.append(" ");
        U.append(str);
        U.append(" ");
        U.append(h);
        U.append(ContainerUtils.KEY_VALUE_DELIMITER);
        U.append(c3);
        U.append(" totalExceed=");
        U.append(c4);
        com.bytedance.android.input.k.b.a.X("CustomException", U.toString());
        boolean z = c2 || c3 || c4;
        if (z && !f4708e) {
            f4708e = true;
        }
        return z;
    }

    public synchronized boolean c(String str, long j2) {
        if (str == null) {
            return false;
        }
        Long l = this.b.get(str);
        if (l == null) {
            l = 0L;
        }
        return l.longValue() >= j2;
    }

    public void g(String str, @Nullable String str2) {
        if (str != null) {
            h(str);
        }
        if (str2 != null) {
            h(str2);
        }
        h("ensure_all");
    }

    public void i() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append('\n');
            for (Map.Entry<String, Long> entry : this.b.entrySet()) {
                sb.append(entry.getKey());
                sb.append(' ');
                sb.append(entry.getValue());
                sb.append('\n');
            }
            com.bytedance.android.input.k.b.a.X("CustomException", "writeUploadTimesFile:" + ((Object) sb));
            com.bytedance.crash.util.a.x(this.f4711c, sb.toString(), false);
        } catch (Exception e2) {
            com.bytedance.crash.Q.b.e("NPTH_ANR_ERROR_AppMonitor", e2);
            com.bytedance.android.input.k.b.a.F(e2);
        }
    }
}
