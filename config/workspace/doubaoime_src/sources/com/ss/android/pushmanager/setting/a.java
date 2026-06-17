package com.ss.android.pushmanager.setting;

import android.app.Application;
import com.bytedance.push.g0.f;
import com.ss.android.common.applog.TeaAgent;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    private static a b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Boolean> f8370c = new HashMap();
    private PushMultiProcessSharedProvider.b a = PushMultiProcessSharedProvider.e(com.ss.android.message.a.a());

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        b = new a();
                    }
                }
            }
            aVar = b;
        }
        return aVar;
    }

    public static boolean d() {
        boolean z = false;
        try {
            Boolean bool = f8370c.get("opt_sensitive_api_invoke");
            if (bool != null) {
                f.c("PushCommonSetting", "[getValueFromPushOnlineSettingsSp]return cache value for opt_sensitive_api_invoke");
                z = bool.booleanValue();
            } else {
                Application a = com.ss.android.message.a.a();
                if (a == null) {
                    f.c("PushCommonSetting", "[getValueFromPushOnlineSettingsSp]return defaultValue because context is null");
                } else {
                    boolean z2 = a.getSharedPreferences("push_multi_process_config", 4).getBoolean("opt_sensitive_api_invoke", false);
                    f8370c.put("opt_sensitive_api_invoke", Boolean.valueOf(z2));
                    f.c("PushCommonSetting", "[getValueFromPushOnlineSettingsSp]return " + z2 + " for opt_sensitive_api_invoke");
                    z = z2;
                }
            }
        } catch (Throwable th) {
            f.f("PushCommonSetting", "[getValueFromPushOnlineSettingsSp]return defaultValue because exception ", th);
        }
        return z;
    }

    public void b(Map<String, String> map) {
        if (f.d()) {
            f.c("PushService", "getSSIDs start");
        }
        try {
            String b2 = this.a.b("ssids", "");
            f.c("PushService", "getSSIDs result is " + b2);
            if (!com.bytedance.android.input.k.b.a.Y(b2)) {
                com.bytedance.android.input.k.b.a.I0(b2, map);
                return;
            }
            try {
                f.c("PushService", "backup getSSIDs by TeaAgent");
                TeaAgent.getSSIDs(map);
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
        }
    }

    public boolean c() {
        return this.a.c();
    }

    public void e(Map<String, String> map) {
        if (map == null) {
            return;
        }
        if (f.d()) {
            f.c("PushService", "saveSSIDs start");
        }
        try {
            String n0 = com.bytedance.android.input.k.b.a.n0(map);
            PushMultiProcessSharedProvider.a a = this.a.a();
            a.b("ssids", n0);
            a.a();
        } catch (Exception unused) {
        }
    }
}
