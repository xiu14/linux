package com.bytedance.ttnet.utils;

import com.bytedance.retrofit2.RetrofitMetrics;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private static a a = null;
    private static volatile boolean b = true;

    public interface a {
        void a(String str, String str2, int i, boolean z, JSONObject jSONObject);
    }

    public static a a() {
        return a;
    }

    public static void b(String str, String str2, int i, boolean z, JSONObject jSONObject) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(str, str2, i, z, jSONObject);
        }
    }

    public static void c(boolean z) {
        b = z;
    }

    public static void d(a aVar) {
        a = aVar;
    }

    public static void e(String str, List<com.bytedance.retrofit2.client.b> list, RetrofitMetrics retrofitMetrics) {
        if (b) {
            retrofitMetrics.E0.f5962c.c();
            try {
                String host = com.bytedance.feedbackerlib.a.E0(str).getHost();
                com.bytedance.feedbackerlib.a.C();
                String valueOf = host.endsWith("snssdk.com") ? String.valueOf(System.currentTimeMillis()) : null;
                if (!com.bytedance.android.input.k.b.a.Y(valueOf)) {
                    list.add(new com.bytedance.retrofit2.client.b("X-SS-REQ-TICKET", valueOf));
                }
            } catch (Throwable unused) {
            }
            retrofitMetrics.y();
        }
    }
}
