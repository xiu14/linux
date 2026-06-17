package com.huawei.hianalytics.f.f;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e implements g {
    private Context a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7097c;

    /* renamed from: d, reason: collision with root package name */
    private int f7098d = -1;

    /* renamed from: e, reason: collision with root package name */
    private String f7099e;

    public e(Context context, String str, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.f7097c = str2;
        this.f7099e = str3;
    }

    private void a() {
        Set<String> a = com.huawei.hianalytics.f.g.g.a(com.huawei.hianalytics.f.g.g.d(this.a, "stat_v2_1"));
        Set<String> a2 = com.huawei.hianalytics.f.g.g.a(com.huawei.hianalytics.f.g.g.d(this.a, "cached_v2_1"));
        HashSet hashSet = new HashSet(a);
        hashSet.addAll(a2);
        Set<String> a3 = com.huawei.hianalytics.f.g.i.a(com.huawei.hianalytics.a.b.a());
        a.removeAll(a3);
        com.huawei.hianalytics.f.g.g.a(a3, hashSet, this.a);
    }

    private void b(String str, com.huawei.hianalytics.f.b.c[] cVarArr) {
        new c(this.a, str, cVarArr, this.f7099e, "").a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map<String, com.huawei.hianalytics.f.b.c[]> a;
        boolean z = true;
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "run report.TAG : %s,TYPE: %s", this.b, this.f7097c);
        String str = this.b;
        boolean b = com.huawei.hianalytics.f.g.g.b(this.a);
        if (b) {
            this.f7098d = 1;
            a();
        } else {
            if (TextUtils.isEmpty(this.f7097c) && TextUtils.isEmpty(this.b)) {
                a();
                a = com.huawei.hianalytics.f.b.e.a(com.huawei.hianalytics.f.g.g.d(this.a, "stat_v2_1"), this.a, str, z);
                Map<String, com.huawei.hianalytics.f.b.c[]> a2 = com.huawei.hianalytics.f.b.a.a(com.huawei.hianalytics.f.g.g.d(this.a, "cached_v2_1"), this.a, str, z);
                if (a != null || a2 == null) {
                    com.huawei.hianalytics.g.b.c("EventReportTask", "Unknown anomaly,No data send!");
                }
                for (Map.Entry<String, com.huawei.hianalytics.f.b.c[]> entry : a.entrySet()) {
                    String key = entry.getKey();
                    com.huawei.hianalytics.f.b.c[] value = entry.getValue();
                    com.huawei.hianalytics.f.b.c[] cVarArr = a2.get(key);
                    if (cVarArr != null) {
                        com.huawei.hianalytics.f.b.c[] cVarArr2 = new com.huawei.hianalytics.f.b.c[value.length + cVarArr.length];
                        System.arraycopy(cVarArr, 0, cVarArr2, 0, cVarArr.length);
                        System.arraycopy(value, 0, cVarArr2, cVarArr.length, value.length);
                        a2.remove(key);
                        b(key, cVarArr2);
                    } else {
                        b(key, value);
                    }
                }
                if (a2.size() > 0) {
                    for (Map.Entry<String, com.huawei.hianalytics.f.b.c[]> entry2 : a2.entrySet()) {
                        b(entry2.getKey(), entry2.getValue());
                    }
                }
                com.huawei.hianalytics.f.g.g.a(str, z, this.a);
                com.huawei.hianalytics.f.g.a.a(this.a).a(com.huawei.hianalytics.f.g.e.a(), this.f7098d);
                return;
            }
            if (!"_default_config_tag".equals(this.b) && "allType".equals(this.f7097c)) {
                com.huawei.hianalytics.g.b.c("EventReportTask", "eventType UnKnown,Stop Report!");
                return;
            } else if (!"_default_config_tag".equals(this.b) && !"allType".equals(this.f7097c)) {
                StringBuilder S = e.a.a.a.a.S(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                S.append(this.f7097c);
                str = S.toString();
            }
        }
        z = b;
        a = com.huawei.hianalytics.f.b.e.a(com.huawei.hianalytics.f.g.g.d(this.a, "stat_v2_1"), this.a, str, z);
        Map<String, com.huawei.hianalytics.f.b.c[]> a22 = com.huawei.hianalytics.f.b.a.a(com.huawei.hianalytics.f.g.g.d(this.a, "cached_v2_1"), this.a, str, z);
        if (a != null) {
        }
        com.huawei.hianalytics.g.b.c("EventReportTask", "Unknown anomaly,No data send!");
    }
}
