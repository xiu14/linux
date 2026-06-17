package com.huawei.hianalytics.abtesting;

import android.content.Context;
import com.huawei.hianalytics.g.b;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.util.e;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static a f7007f = new a();
    public Context a;
    private final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private HiAnalyticsInstance f7008c = null;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f7009d = Executors.newSingleThreadExecutor();

    /* renamed from: e, reason: collision with root package name */
    private long f7010e = com.heytap.mcssdk.constant.a.f6888f;

    public static a a() {
        return f7007f;
    }

    private boolean d() {
        long longValue = ((Long) e.b(e.a(this.a, "abtest"), "expdata_refresh_time", -1L)).longValue() + this.f7010e;
        boolean z = longValue == 0 || longValue < Long.valueOf(System.currentTimeMillis()).longValue();
        b.b("ABTestManager", z ? "Achieving Request Cycle" : "Not reaching the request cycle");
        return z;
    }

    public final String a(String str) {
        if (!com.huawei.hianalytics.abtesting.a.b.a().b()) {
            b.c("ABTestManager", "ABTest sdk is not initialized");
            return "";
        }
        String b = com.huawei.hianalytics.abtesting.a.b.a().b(str);
        if (com.huawei.hianalytics.abtesting.a.b.a().c()) {
            b.b("ABTestManager", "Already requesting network, quit.");
        } else {
            com.huawei.hianalytics.abtesting.a.b.a().b(true);
            if (d()) {
                b.b("ABTestManager", "syncDataTask(): requesting network...");
                this.f7009d.execute(new com.huawei.hianalytics.abtesting.b.b(this.a));
            } else {
                com.huawei.hianalytics.abtesting.a.b.a().b(false);
            }
        }
        return b;
    }

    public final void a(int i) {
        if (com.huawei.hianalytics.abtesting.a.b.a().b()) {
            this.f7010e = i * com.heytap.mcssdk.constant.a.f6886d;
        } else {
            b.c("ABTestManager", "setSyncInterval : ABTest sdk is not initialized");
        }
    }

    public final void a(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        if (!com.huawei.hianalytics.abtesting.a.b.a().b()) {
            b.c("ABTestManager", "ABTest sdk is not initialized");
            return;
        }
        if (this.f7008c == null) {
            b.c("ABTestManager", "onEvent : instance is null");
            return;
        }
        if (linkedHashMap == null) {
            b.b("ABTestManager", "onEvent: mapValue is empty!");
            linkedHashMap = new LinkedHashMap<>();
        }
        String c2 = com.huawei.hianalytics.abtesting.a.b.a().c(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupId", c2);
        } catch (JSONException unused) {
            b.c("ABTestManager", "json exception from getGroupId");
        }
        linkedHashMap.put("experiment", jSONObject.toString());
        String e2 = com.huawei.hianalytics.abtesting.a.b.a().e();
        if (!e2.equals(linkedHashMap.get("userId"))) {
            linkedHashMap.put("userId", e2);
        }
        this.f7008c.onEvent(str2, linkedHashMap);
    }

    public final void b() {
        if (!com.huawei.hianalytics.abtesting.a.b.a().b()) {
            b.c("ABTestManager", "onReport : ABTest sdk is not initialized");
            return;
        }
        HiAnalyticsInstance hiAnalyticsInstance = this.f7008c;
        if (hiAnalyticsInstance == null) {
            b.c("ABTestManager", "instance is null");
        } else {
            hiAnalyticsInstance.onReport(0);
        }
    }

    public final void c() {
        if (com.huawei.hianalytics.abtesting.a.b.a().b()) {
            this.f7009d.execute(new com.huawei.hianalytics.abtesting.b.b(this.a));
        } else {
            b.c("ABTestManager", "syncExpParameters: ABTest sdk is not initialized");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r5, com.huawei.hianalytics.abtesting.ABTestConfig r6) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.abtesting.a.a(android.content.Context, com.huawei.hianalytics.abtesting.ABTestConfig):void");
    }
}
