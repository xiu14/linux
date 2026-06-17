package com.huawei.hianalytics.f.h.a;

import android.content.Context;
import com.huawei.hianalytics.f.f.h;
import com.huawei.hianalytics.f.g.j;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static final Object a = new Object();
    private static Context b;

    public static void a(Context context) {
        b = context;
    }

    public static void a(com.huawei.hianalytics.f.h.c.a aVar, String str) {
        if (aVar == null || !aVar.d()) {
            return;
        }
        b(b, aVar.a(), aVar.c(), null, "$AppOnPause", "OnPause", aVar.b(), str);
    }

    public static void a(com.huawei.hianalytics.f.h.c.b bVar, String str) {
        if (b == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/V1Server", "onEvent null context");
            return;
        }
        String a2 = bVar.a();
        String b2 = bVar.b();
        Long c2 = bVar.c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", b2);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/V1Server", "onEvent(): JSONException");
        }
        j.a(new com.huawei.hianalytics.f.f.d(b, str, a2, jSONObject.toString(), c2.longValue()));
    }

    public static void a(String str) {
        h.a().a(str, 0);
    }

    private static void b(Context context, String str, long j, LinkedHashMap<String, String> linkedHashMap, String str2, String str3, long j2, String str4) {
        j.a(new com.huawei.hianalytics.f.f.d(context, str4, str2, j.a(str, j, null, str3).toString(), j2));
    }

    public static void b(com.huawei.hianalytics.f.h.c.a aVar, String str) {
        if (aVar == null || !aVar.d()) {
            return;
        }
        b(b, aVar.a(), 0L, null, "$AppOnResume", "OnResume", aVar.b(), str);
    }

    public static void b(String str) {
        if (b == null) {
            com.huawei.hianalytics.g.b.b("HiAnalytics/event", "You must execute Builder.create() before you execute this method.");
            return;
        }
        synchronized (a) {
            if (com.huawei.hianalytics.f.h.b.a.a(b)) {
                com.huawei.hianalytics.g.b.b("HiAnalytics/V1Server", "cached data by BISDK has already handled.");
            } else {
                com.huawei.hianalytics.f.h.b.a.b(b);
                j.a(new c(b, str));
            }
        }
    }
}
