package com.huawei.hianalytics.f.h.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hianalytics.f.g.g;

/* loaded from: classes2.dex */
public class c implements com.huawei.hianalytics.i.a {
    private Context a;
    private String b;

    public c(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private void b(Context context, String str) {
        SharedPreferences.Editor edit = g.d(context, str).edit();
        edit.clear();
        edit.apply();
    }

    public void a() {
        String str;
        SharedPreferences d2 = g.d(this.a, WsConstants.KEY_CONNECTION_STATE);
        if (d2 == null) {
            str = "checkAndReportV1Data: get sharedPreference error.";
        } else {
            String str2 = (String) g.b(d2, "events", "");
            String str3 = (String) g.b(d2, "activities", "");
            String a = com.huawei.hianalytics.f.g.d.a(this.a, "cached");
            Context context = this.a;
            b(context, WsConstants.KEY_CONNECTION_STATE);
            b(context, "sessioncontext");
            b(context, "flag");
            com.huawei.hianalytics.f.g.d.b(context, "cached");
            if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(a)) {
                d dVar = new d();
                dVar.a(str2, this.b);
                dVar.b(a, this.b);
                dVar.a(this.b);
                e eVar = new e();
                eVar.a(str3, this.b);
                eVar.b(a, this.b);
                eVar.a(this.b);
                return;
            }
            str = "checkAndReportV1Data: No cached V1 data found.";
        }
        com.huawei.hianalytics.g.b.b("V1CompatibleReportTask", str);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }
}
