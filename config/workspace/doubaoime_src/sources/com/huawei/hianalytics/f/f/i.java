package com.huawei.hianalytics.f.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7106c;

    /* renamed from: d, reason: collision with root package name */
    private String f7107d;

    /* renamed from: e, reason: collision with root package name */
    private Context f7108e;

    public i(String str, String str2, String str3, String str4, Context context) {
        this.f7108e = context;
        this.a = str;
        this.b = str2;
        this.f7106c = str3;
        this.f7107d = str4;
    }

    public void a() {
        com.huawei.hianalytics.g.b.b("IMEventReportTask", "Stream Event run!");
        com.huawei.hianalytics.f.b.a aVar = new com.huawei.hianalytics.f.b.a(this.f7108e);
        long currentTimeMillis = System.currentTimeMillis();
        aVar.f(this.f7107d);
        aVar.e(this.b);
        aVar.d(this.f7106c);
        aVar.c(String.valueOf(currentTimeMillis));
        aVar.g(this.a);
        if ("oper".equals(this.b) && com.huawei.hianalytics.a.a.e(this.a, "oper")) {
            com.huawei.hianalytics.f.e.b a = com.huawei.hianalytics.f.e.a.a().a(this.a, currentTimeMillis);
            String a2 = a.a();
            Boolean valueOf = Boolean.valueOf(a.b());
            aVar.a(a2);
            aVar.b(String.valueOf(valueOf));
        }
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        if (com.huawei.hianalytics.f.g.g.a(this.f7108e, "backup_event", 5242880)) {
            com.huawei.hianalytics.g.b.b("IMEventReportTask", "backup file reach max limited size, discard new event ");
        } else {
            SharedPreferences d2 = com.huawei.hianalytics.f.g.g.d(this.f7108e, "backup_event");
            JSONObject a3 = aVar.a();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(a3);
            com.huawei.hianalytics.f.g.g.a(d2, com.huawei.hianalytics.f.g.i.a(this.a, this.b, replace), jSONArray.toString());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        com.huawei.hianalytics.f.g.j.b(new a(this.f7108e, arrayList, this.b, this.a, com.huawei.hianalytics.a.b.g(), replace));
    }
}
