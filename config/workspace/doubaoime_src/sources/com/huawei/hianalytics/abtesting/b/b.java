package com.huawei.hianalytics.abtesting.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.h.c;
import com.huawei.hianalytics.util.d;
import com.huawei.hianalytics.util.e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements Runnable {
    private Context a;
    private String b = com.huawei.hianalytics.abtesting.a.b.a().d();

    /* renamed from: c, reason: collision with root package name */
    private String f7016c = com.huawei.hianalytics.abtesting.a.b.a().e();

    /* renamed from: d, reason: collision with root package name */
    private String f7017d = com.huawei.hianalytics.abtesting.a.b.a().f();

    public b(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.huawei.hianalytics.g.b.b("ABTest/SyncDataTask", "sync data running..");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", this.f7016c);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("ABTest/SyncDataTask", "getBody: json exception");
        }
        String jSONObject2 = jSONObject.toString();
        String str = this.b;
        String f2 = com.huawei.hianalytics.a.b.f();
        String valueOf = String.valueOf(System.currentTimeMillis());
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        StringBuilder W = e.a.a.a.a.W(f2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, valueOf, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, replace);
        W.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        int indexOf = str.indexOf("?");
        String a = d.a(d.a(e.a.a.a.a.K(W, indexOf != -1 ? str.substring(indexOf + 1, str.length()) : "", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, jSONObject2), this.f7017d));
        HashMap hashMap = new HashMap();
        hashMap.put("appId", f2);
        hashMap.put("timestamp", valueOf);
        hashMap.put("random", replace);
        hashMap.put("sign", a);
        try {
            c a2 = com.huawei.hianalytics.h.b.a(this.b + "/api/gateway/ab/api/service/shunting/hasdk/api/v1/getuserparameters", jSONObject2.getBytes("UTF-8"), hashMap);
            StringBuilder sb = new StringBuilder("get experimental data request code : ");
            sb.append(a2.a());
            com.huawei.hianalytics.g.b.b("ABTest/SyncDataTask", sb.toString());
            String b = a2.b();
            if (!TextUtils.isEmpty(b)) {
                try {
                    com.huawei.hianalytics.abtesting.a.b.a().a(b);
                    com.huawei.hianalytics.g.b.b("ABTest/SyncDataTask", "Start caching data!");
                    SharedPreferences.Editor edit = e.a(this.a, "abtest").edit();
                    edit.putString("exp_data", com.huawei.hianalytics.f.g.c.b(b, this.a));
                    edit.putLong("expdata_refresh_time", System.currentTimeMillis());
                    edit.commit();
                } catch (JSONException unused2) {
                    com.huawei.hianalytics.g.b.c("ABTest/SyncDataTask", "experiment data error");
                }
            }
        } catch (IOException unused3) {
            com.huawei.hianalytics.g.b.c("ABTest/SyncDataTask", "getBody: body to bytes error!");
        }
        com.huawei.hianalytics.abtesting.a.b.a().a(true);
        com.huawei.hianalytics.abtesting.a.b.a().b(false);
    }
}
