package com.huawei.hianalytics.process;

import android.content.Context;
import com.huawei.hianalytics.util.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f7165e;
    private ConcurrentHashMap<String, d> a = new ConcurrentHashMap<>();
    private c b = null;

    /* renamed from: c, reason: collision with root package name */
    private Context f7168c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f7164d = {"ABTesting", "_default_config_tag"};

    /* renamed from: f, reason: collision with root package name */
    private static final Object f7166f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f7167g = new Object();

    private a() {
    }

    public static a b() {
        if (f7165e == null) {
            synchronized (a.class) {
                if (f7165e == null) {
                    f7165e = new a();
                }
            }
        }
        return f7165e;
    }

    public final int a() {
        return this.a.size();
    }

    public final d a(String str) {
        String str2;
        if (str == null) {
            str2 = "getInstanceByTag() tag Can't be null";
        } else {
            if (this.a.containsKey(str)) {
                com.huawei.hianalytics.g.b.a("HianalyticsSDK", "getInstanceByTag(): TAG: " + str + " found.");
                return this.a.get(str);
            }
            str2 = "getInstanceByTag(): TAG: " + str + " not found.";
        }
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", str2);
        return null;
    }

    public final d a(String str, d dVar) {
        d putIfAbsent = this.a.putIfAbsent(str, dVar);
        com.huawei.hianalytics.e.a.a().a(str, this.a.get(str).a);
        return putIfAbsent;
    }

    public final void a(int i) {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.setSPCacheSize is execute.");
        if (this.f7168c == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "sdk is not init");
        } else {
            com.huawei.hianalytics.d.c.a(g.a(i, 10, 5));
        }
    }

    public final void a(Context context) {
        synchronized (f7166f) {
            if (this.f7168c != null) {
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", "SDK has been initialized,But an instance can be registered!");
                return;
            }
            this.f7168c = context;
            com.huawei.hianalytics.e.a.a().f().a(context);
            com.huawei.hianalytics.e.a.a().f().g(context.getPackageName());
            com.huawei.hianalytics.d.a.a().a(context);
        }
    }

    public final void a(Context context, HiAnalyticsLogConfig hiAnalyticsLogConfig) {
        if (hiAnalyticsLogConfig == null || context == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "enableLogCollection(): config or context is null, Log disabled.");
            com.huawei.hianalytics.e.a.a().c();
            return;
        }
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.enableLogCollection() is execute.");
        if (com.huawei.hianalytics.e.a.a().d()) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "enableLogCollection(): LogConfig already exists.");
        } else {
            com.huawei.hianalytics.e.a.a().a(hiAnalyticsLogConfig.a());
            com.huawei.hianalytics.log.d.a.a().a(context);
        }
    }

    public final void a(HiAnalyticsLogConfig hiAnalyticsLogConfig, boolean z) {
        if (hiAnalyticsLogConfig == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "refreshLogConfig(): config is null, Log disabled.");
            com.huawei.hianalytics.e.a.a().c();
            return;
        }
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.refreshLogConfig() is execute.");
        synchronized (f7167g) {
            com.huawei.hianalytics.e.a.a().a(hiAnalyticsLogConfig.a());
            com.huawei.hianalytics.log.d.a.a().a(z);
        }
    }

    public final void a(c cVar) {
        this.b = cVar;
        com.huawei.hianalytics.e.a.a().a("_instance_ex_tag", cVar.a);
    }

    public final void a(boolean z) {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.setHandlerAbnormalData is execute.");
        com.huawei.hianalytics.d.c.a(z);
    }

    public final boolean b(String str) {
        if (str == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "getInitFlag() tag Can't be null");
            return false;
        }
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.getInitFlag(String tag) is execute.");
        return "_instance_ex_tag".equals(str) ? this.b != null : this.a.containsKey(str);
    }

    public final List<String> c() {
        return new ArrayList(this.a.keySet());
    }

    public final boolean c(String str) {
        for (String str2 : f7164d) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final c d() {
        return this.b;
    }

    public final void d(String str) {
        if (this.f7168c == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "clearDataByTag() sdk is not init");
        } else {
            com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.clearDataByTag(String appid) is execute.");
            com.huawei.hianalytics.f.g.g.a(str, this.f7168c);
        }
    }

    public final int e() {
        int i = 0;
        for (String str : f7164d) {
            if (this.a.containsKey(str)) {
                i++;
            }
        }
        return i;
    }

    public final void e(String str) {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f7168c;
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "sdk is not init");
        } else {
            com.huawei.hianalytics.d.c.a(g.a(com.heytap.mcssdk.constant.b.u, str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }

    public final void f() {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "clearCachedData() is execute.");
        if (this.f7168c == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "clearCachedData() sdk is not init");
        } else {
            com.huawei.hianalytics.g.b.b("HianalyticsSDK", "HiAnalyticsDataManager.clearCachedData() is execute.");
            com.huawei.hianalytics.f.g.g.a("", true, this.f7168c);
        }
    }
}
