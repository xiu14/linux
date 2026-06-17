package com.huawei.hianalytics.f.f;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements com.huawei.hianalytics.b.b {
    private static b b;
    private Context a;

    public b(Context context) {
        this.a = context;
    }

    public static b a(Context context) {
        b bVar;
        synchronized (com.huawei.hianalytics.b.a.class) {
            if (b == null) {
                b = new b(context);
            }
            bVar = b;
        }
        return bVar;
    }

    public void a() {
        com.huawei.hianalytics.b.a.a().a(this.a, this);
    }

    @Override // com.huawei.hianalytics.b.b
    public void a(JSONObject jSONObject) {
        com.huawei.hianalytics.f.g.j.a(new d(this.a, "_instance_ex_tag", "$AppOnCrash", jSONObject.toString(), System.currentTimeMillis()));
    }

    public void b() {
        com.huawei.hianalytics.b.a.a().c();
    }
}
