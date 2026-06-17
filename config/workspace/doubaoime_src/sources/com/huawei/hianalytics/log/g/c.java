package com.huawei.hianalytics.log.g;

import android.content.Context;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements com.huawei.hianalytics.b.b {
    private static c b;
    private Context a;

    public c(Context context) {
        this.a = context;
    }

    public static c a(Context context) {
        c cVar;
        synchronized (com.huawei.hianalytics.b.a.class) {
            if (b == null) {
                b = new c(context);
            }
            cVar = b;
        }
        return cVar;
    }

    public void a() {
        com.huawei.hianalytics.b.a.a().b();
    }

    @Override // com.huawei.hianalytics.b.b
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.putOpt("HappenTime", new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()));
            jSONObject.putOpt("Eventid", 907121999);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("logCrashHandler", "logHandlerExc json put value error");
        }
        Bundle bundle = new Bundle();
        bundle.putString("MetaData", jSONObject.toString());
        a.a("logCrashHandler", "CrashMsg", "907121999", bundle);
    }

    public void a(String[] strArr) {
        com.huawei.hianalytics.b.a.a().a(this.a, strArr, this);
    }
}
