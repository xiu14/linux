package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f7282e = "a";

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, Map<String, Map<String, String>>> f7283f = new ConcurrentHashMap(16);
    private final Map<String, Long> a = new ConcurrentHashMap(16);
    private final c b;

    /* renamed from: c, reason: collision with root package name */
    private final c f7284c;

    /* renamed from: d, reason: collision with root package name */
    private final g f7285d;

    public a(c cVar, c cVar2, g gVar) {
        this.f7284c = cVar2;
        this.b = cVar;
        this.f7285d = gVar;
        gVar.a(this);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l = this.a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l)) {
            bVar.a(2);
            return;
        }
        if (e.a(l, 300000L)) {
            this.f7285d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, str, this.f7284c, -1);
        }
        bVar.a(1);
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.a.get(str), 300000L)) {
            this.f7285d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, null, this.f7284c, -1);
        }
    }

    public c a() {
        return this.b;
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map<String, Map<String, Map<String, String>>> map = f7283f;
        Map<String, Map<String, String>> map2 = map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            a(grsBaseInfo, bVar, context, str);
            return map2.get(str);
        }
        String str2 = f7282e;
        StringBuilder M = e.a.a.a.a.M("Cache size is: ");
        M.append(map.size());
        Logger.d(str2, M.toString());
        return new HashMap();
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.b.b(grsParasKey + CrashHianalyticsData.TIME, "0");
        this.a.remove(grsParasKey + CrashHianalyticsData.TIME);
        Map<String, Map<String, Map<String, String>>> map = f7283f;
        map.remove(grsParasKey);
        String str = f7282e;
        StringBuilder M = e.a.a.a.a.M("Cache size is: ");
        M.append(map.size());
        Logger.d(str, M.toString());
        this.f7285d.a(grsParasKey);
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, com.huawei.hms.framework.network.grs.g.j.c cVar) {
        if (dVar.f() == 2) {
            Logger.w(f7282e, "update cache from server failed");
            return;
        }
        if (cVar.d().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.m()) {
                f7283f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.b.a(grsParasKey, "")));
            } else {
                this.b.b(grsParasKey, dVar.j());
                f7283f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
            }
            if (!TextUtils.isEmpty(dVar.e())) {
                this.b.b(e.a.a.a.a.s(grsParasKey, "ETag"), dVar.e());
            }
            this.b.b(e.a.a.a.a.s(grsParasKey, CrashHianalyticsData.TIME), dVar.a());
            this.a.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        } else {
            this.b.b("geoipCountryCode", dVar.j());
            this.b.b("geoipCountryCodetime", dVar.a());
        }
        String str = f7282e;
        StringBuilder M = e.a.a.a.a.M("Cache size is: ");
        M.append(f7283f.size());
        Logger.d(str, M.toString());
    }

    public g b() {
        return this.f7285d;
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String a = this.b.a(grsParasKey, "");
        String a2 = this.b.a(grsParasKey + CrashHianalyticsData.TIME, "0");
        long j = 0;
        if (!TextUtils.isEmpty(a2) && a2.matches("\\d+")) {
            try {
                j = Long.parseLong(a2);
            } catch (NumberFormatException e2) {
                Logger.w(f7282e, "convert urlParamKey from String to Long catch NumberFormatException.", e2);
            }
        }
        Map<String, Map<String, Map<String, String>>> map = f7283f;
        map.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a));
        String str = f7282e;
        StringBuilder M = e.a.a.a.a.M("Cache size is: ");
        M.append(map.size());
        Logger.d(str, M.toString());
        this.a.put(grsParasKey, Long.valueOf(j));
        a(grsBaseInfo, grsParasKey, context);
    }

    public c c() {
        return this.f7284c;
    }
}
