package com.bytedance.crash.entity;

import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.LocaleInfo;
import com.bytedance.crash.monitor.c;
import com.bytedance.crash.monitor.h;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Header {

    /* renamed from: c, reason: collision with root package name */
    private static int f4614c = -1;
    private long b = -1;
    private final JSONObject a = new JSONObject();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.crash.entity.Header a(@androidx.annotation.NonNull com.bytedance.crash.monitor.a r18, long r19, long r21, com.bytedance.crash.CrashType r23, int r24, java.io.File r25) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.entity.Header.a(com.bytedance.crash.monitor.a, long, long, com.bytedance.crash.CrashType, int, java.io.File):com.bytedance.crash.entity.Header");
    }

    public static Header b(@NonNull h hVar, long j, CrashType crashType, int i) {
        int i2;
        Header header = new Header();
        com.bytedance.crash.general.a.j(header.a, j);
        com.bytedance.android.input.k.b.a.y0(header.a, "device_id", hVar.f("0"));
        com.bytedance.android.input.k.b.a.y0(header.a, "user_id", Long.valueOf(hVar.k()));
        com.bytedance.android.input.k.b.a.y0(header.a, "channel", hVar.d());
        com.bytedance.android.input.k.b.a.y0(header.a, "mp_params", null);
        try {
            i2 = Integer.parseInt(hVar.b());
        } catch (Throwable unused) {
            i2 = 4444;
        }
        com.bytedance.android.input.k.b.a.y0(header.a, WsConstants.KEY_APP_ID, Integer.valueOf(i2));
        c l = hVar.l();
        if (l.d() != null) {
            com.bytedance.android.input.k.b.a.y0(header.a, "app_version", l.d());
        }
        if (l.c() != 0) {
            com.bytedance.android.input.k.b.a.y0(header.a, "version_code", Long.valueOf(l.c()));
        }
        if (l.b() != 0) {
            com.bytedance.android.input.k.b.a.y0(header.a, "update_version_code", Long.valueOf(l.b()));
        }
        if (l.a() != 0) {
            com.bytedance.android.input.k.b.a.y0(header.a, "manifest_version_code", Long.valueOf(l.a()));
        }
        Map<String, Object> e2 = hVar.e();
        if (e2 != null) {
            for (String str : e2.keySet()) {
                if (e2.get(str) != null) {
                    com.bytedance.android.input.k.b.a.y0(header.a, str, e2.get(str));
                }
            }
        }
        header.g(j, crashType, i, null);
        return header;
    }

    public static Header c(@NonNull com.bytedance.crash.monitor.a aVar, long j, CrashType crashType, int i) {
        Header header = new Header();
        com.bytedance.crash.general.a.j(header.a, j);
        JSONObject jSONObject = header.a;
        if (!jSONObject.has("device_id")) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "device_id", aVar.f("0"));
        }
        if (!jSONObject.has("channel")) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "channel", aVar.t(j));
        }
        int i2 = 4444;
        try {
            i2 = Integer.parseInt(aVar.b());
        } catch (Throwable unused) {
        }
        com.bytedance.android.input.k.b.a.y0(jSONObject, WsConstants.KEY_APP_ID, Integer.valueOf(i2));
        c y = aVar.y(j);
        if (y.d() != null) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "app_version", y.d());
        }
        if (y.c() != 0) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "version_code", Long.valueOf(y.c()));
        }
        if (y.b() != 0) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "update_version_code", Long.valueOf(y.b()));
        }
        if (y.a() != 0) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "manifest_version_code", Long.valueOf(y.a()));
        }
        header.g(j, crashType, i, null);
        return header;
    }

    public static boolean f() {
        if (f4614c == -1) {
            f4614c = com.bytedance.crash.general.b.a().contains("64") ? 1 : 0;
        }
        return f4614c == 1;
    }

    private void g(long j, CrashType crashType, int i, File file) {
        com.bytedance.crash.general.a.l(this.a);
        com.bytedance.crash.general.a.k(this.a);
        this.b = com.bytedance.crash.general.a.d();
        com.bytedance.android.input.k.b.a.y0(this.a, CrashHianalyticsData.CRASH_TYPE, crashType.getName());
        com.bytedance.android.input.k.b.a.y0(this.a, "unique_key", "android_" + this.a.optString("device_id") + BundleUtil.UNDERLINE_TAG + j + BundleUtil.UNDERLINE_TAG + i + BundleUtil.UNDERLINE_TAG + crashType.getName());
        LocaleInfo.putTo(this.a, file);
    }

    public long d() {
        return this.b;
    }

    @NonNull
    public JSONObject e() {
        return this.a;
    }
}
