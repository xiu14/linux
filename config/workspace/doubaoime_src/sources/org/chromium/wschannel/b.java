package org.chromium.wschannel;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.baselib.network.http.f;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static long f10770d = 100;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f10771e;
    private long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f10772c;

    public b(Map<String, Object> map, boolean z) {
        this.f10772c = true;
        if (f.i() <= 0) {
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("Destroy delta disable: ");
                M.append(f.i());
                Logger.d("CronetFrontierConnection", M.toString());
                return;
            }
            return;
        }
        f10770d = f.i();
        long a = a(map, "destroy_timeout_millis", 0L);
        if (a < 1000) {
            if (Logger.debug()) {
                Logger.d("CronetFrontierConnection", "Destroy timeout disable: " + a);
                return;
            }
            return;
        }
        f10771e = true;
        if (z) {
            this.a = a - f10770d;
            if (Logger.debug()) {
                StringBuilder M2 = e.a.a.a.a.M("Destroy ws timeout: ");
                M2.append(this.a);
                Logger.d("CronetFrontierConnection", M2.toString());
                return;
            }
            return;
        }
        long a2 = a(map, "fallback_timeout_mills", com.heytap.mcssdk.constant.a.q);
        if (Logger.debug()) {
            StringBuilder Q = e.a.a.a.a.Q("fallback timeout:", a2, " destroy timeout:");
            Q.append(a);
            Logger.d("CronetFrontierConnection", Q.toString());
        }
        if (a2 >= a) {
            this.f10772c = false;
            if (Logger.debug()) {
                Logger.d("CronetFrontierConnection", "Disable fallback to websocket, fallback >= destroy timeout");
            }
            this.b = a - f10770d;
            return;
        }
        long j = f10770d;
        this.b = a2 - j;
        long j2 = (a - a2) - j;
        this.a = j2;
        if (j2 < 0) {
            if (Logger.debug()) {
                StringBuilder M3 = e.a.a.a.a.M("Disable fallback to websocket, timeout <= 0:");
                M3.append(this.a);
                Logger.d("CronetFrontierConnection", M3.toString());
            }
            this.f10772c = false;
        }
    }

    private static long a(Map<String, Object> map, String str, long j) {
        Map map2 = (Map) map.get(WsConstants.KEY_HEADERS);
        if (map2 == null || map2.isEmpty() || !map2.containsKey(str)) {
            return j;
        }
        String str2 = (String) map2.get(str);
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        try {
            int intValue = Integer.valueOf(str2).intValue();
            return intValue > 0 ? intValue : j;
        } catch (Exception unused) {
            return j;
        }
    }

    public static boolean d(String str, boolean z) {
        if (!f10771e || TextUtils.isEmpty(str)) {
            return false;
        }
        return z ? str.contains("\\\"net_error\\\":-7") && str.contains("WebSocket opening handshake timed out") : str.contains("\"error_code\":-193") || (str.contains("\"error_code\":-356") && str.contains("\\\"internal_error\\\":67"));
    }

    public long b() {
        if (f10771e) {
            return this.b;
        }
        return 0L;
    }

    public long c() {
        if (f10771e) {
            return this.a;
        }
        return 0L;
    }

    public boolean e() {
        if (f10771e) {
            return this.f10772c;
        }
        return true;
    }
}
