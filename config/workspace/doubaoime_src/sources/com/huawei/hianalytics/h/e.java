package com.huawei.hianalytics.h;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class e {
    private static e b;
    private Map<String, d> a = new ConcurrentHashMap();

    private e() {
    }

    public static e a() {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public final c a(byte[] bArr, Map<String, String> map, String str) {
        d dVar = this.a.get(str);
        if (dVar != null) {
            return dVar.a(bArr, map);
        }
        com.huawei.hianalytics.g.b.b("ReportManager", "report instance is null");
        return new c(-100, "");
    }

    public final synchronized void a(String str, String[] strArr) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "ReportManager:init instance with url");
        d dVar = new d(str);
        dVar.a(strArr);
        this.a.put(str, dVar);
    }
}
