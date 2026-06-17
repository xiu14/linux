package com.huawei.hianalytics.f.f;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: d, reason: collision with root package name */
    private static h f7103d;

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, Long> f7104e = new HashMap();
    private Context a;
    private com.huawei.hianalytics.f.c.a b = new com.huawei.hianalytics.f.c.a();

    /* renamed from: c, reason: collision with root package name */
    private long f7105c = 0;

    public static h a() {
        h hVar;
        synchronized (h.class) {
            if (f7103d == null) {
                f7103d = new h();
            }
            hVar = f7103d;
        }
        return hVar;
    }

    private static void b(String str, Context context, String str2, long j, LinkedHashMap<String, String> linkedHashMap, String str3, String str4) {
        com.huawei.hianalytics.f.g.j.a(new d(context, str, str3, com.huawei.hianalytics.f.g.j.a(str2, j, linkedHashMap, str4).toString(), System.currentTimeMillis()));
    }

    private static void c(String str, Context context, String str2, LinkedHashMap<String, String> linkedHashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = f7104e.containsKey(str) ? f7104e.get(str).longValue() : 0L;
        b(str, context, str2, longValue == 0 ? 0L : currentTimeMillis - longValue, linkedHashMap, "$AppOnPause", "OnPause");
    }

    public void a(Context context) {
        this.a = context;
        com.huawei.hianalytics.e.a.a().f().c(com.huawei.hianalytics.c.c.b());
        String b = com.huawei.hianalytics.c.c.b(context);
        com.huawei.hianalytics.a.b.d(b);
        if (!com.huawei.hianalytics.util.i.a().b()) {
            com.huawei.hianalytics.g.b.b("HiAnalyticsEventServer", "userManager.isUserUnlocked() == false");
            return;
        }
        String a = com.huawei.hianalytics.f.g.g.a(context);
        com.huawei.hianalytics.f.g.g.a(context, b);
        com.huawei.hianalytics.a.b.e(a);
        com.huawei.hianalytics.f.g.j.a(new k(context));
    }

    public void a(String str, int i) {
        a(str, this.a, com.huawei.hianalytics.f.g.i.a(i), com.huawei.hianalytics.a.b.g());
    }

    public void a(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        JSONObject jSONObject = linkedHashMap == null ? new JSONObject() : com.huawei.hianalytics.f.g.j.a(linkedHashMap);
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            currentTimeMillis = com.huawei.hianalytics.f.g.i.a("yyyy-MM-dd", currentTimeMillis);
        }
        com.huawei.hianalytics.f.g.j.a(new d(this.a, str, i, str2, jSONObject.toString(), currentTimeMillis));
    }

    public void a(String str, Context context) {
        Context context2;
        if (context == null || (context2 = this.a) == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onPause's mContext is null or SDK was not init.");
        } else {
            c(str, context2, context.getClass().getCanonicalName(), null);
            f7104e.put(str, 0L);
        }
    }

    public void a(String str, Context context, String str2, String str3) {
        if (context == null || this.a == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onReport() null context or SDK was not init.");
            return;
        }
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "onReport: Before calling runtaskhandler()");
        String a = com.huawei.hianalytics.log.e.d.a(context);
        if (TextUtils.isEmpty(a) || "2G".equals(a)) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "The network is bad.");
        } else {
            com.huawei.hianalytics.f.g.j.a(new e(context, str, str2, str3));
        }
    }

    public void a(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        Context context2;
        if (context == null || (context2 = this.a) == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onPause null context or SDK was not init.");
        } else {
            c(str, context2, context.getClass().getCanonicalName(), linkedHashMap);
            f7104e.put(str, 0L);
        }
    }

    public void a(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f7105c <= 30000) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "autoReport timeout. interval < 30s ");
            return;
        }
        com.huawei.hianalytics.g.b.a("HiAnalyticsEventServer", "begin to call onReport!");
        this.f7105c = currentTimeMillis;
        a(str, this.a, str2, com.huawei.hianalytics.a.b.g());
    }

    public void a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            com.huawei.hianalytics.f.g.j.a(new d(this.a, str, str2, jSONObject.toString(), System.currentTimeMillis()));
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onEvent():JSON structure Exception!");
        }
    }

    public void a(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        Context context = this.a;
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onPause null context or SDK was not init.");
        } else {
            c(str, context, str2, linkedHashMap);
            f7104e.put(str, 0L);
        }
    }

    public void a(boolean z) {
        Context context = this.a;
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onEventCrashInit() SDK was not init.");
        } else if (z) {
            b.a(context).a();
        } else {
            b.a(context).b();
        }
    }

    public com.huawei.hianalytics.f.c.a b() {
        return this.b;
    }

    public void b(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        new i(str, com.huawei.hianalytics.f.g.i.a(i), str2, (linkedHashMap == null ? new JSONObject() : com.huawei.hianalytics.f.g.j.a(linkedHashMap)).toString(), this.a).a();
    }

    public void b(String str, Context context) {
        if (context == null || this.a == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onResume's mContext is null or SDK was not init.");
        } else {
            f7104e.put(str, Long.valueOf(System.currentTimeMillis()));
            b(str, this.a, context.getClass().getCanonicalName(), 0L, null, "$AppOnResume", "OnResume");
        }
    }

    public void b(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        Context context2;
        f7104e.put(str, Long.valueOf(System.currentTimeMillis()));
        if (context == null || (context2 = this.a) == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onResume() null context or SDK was not init.");
        } else {
            b(str, context2, context.getClass().getCanonicalName(), 0L, linkedHashMap, "$AppOnResume", "OnResume");
        }
    }

    public void b(String str, String str2) {
        Context context = this.a;
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onStartApp() SDK was not init.");
            return;
        }
        JSONObject a = com.huawei.hianalytics.f.g.b.a(context, str, str2);
        if (a != null) {
            com.huawei.hianalytics.f.g.j.a(new d(this.a, "_instance_ex_tag", "$AppOnStart", a.toString(), System.currentTimeMillis()));
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onStartApp() getInfoJson is null,The end of the event ");
        }
    }

    public void b(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        f7104e.put(str, Long.valueOf(System.currentTimeMillis()));
        b(str, this.a, str2, 0L, linkedHashMap, "$AppOnResume", "OnResume");
    }

    public void c() {
        Context context = this.a;
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onFirstRun() SDK was not init.");
            return;
        }
        JSONObject a = com.huawei.hianalytics.f.g.b.a(context);
        if (a != null) {
            com.huawei.hianalytics.f.g.j.a(new d(this.a, "_instance_ex_tag", "$AppFirstStart", a.toString(), System.currentTimeMillis()));
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onFirstRun() getInfoJson is null,The end of the event ");
        }
    }

    public void c(String str, String str2) {
        if (this.a == null) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onAppUpgrade() SDK was not init.");
            return;
        }
        JSONObject a = com.huawei.hianalytics.f.g.b.a(str, str2);
        if (a != null) {
            com.huawei.hianalytics.f.g.j.a(new d(this.a, "_instance_ex_tag", "$AppOnUpdate", a.toString(), System.currentTimeMillis()));
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalyticsEventServer", "onAppUpgrade() getInfoJson is null,The end of the event ");
        }
    }
}
