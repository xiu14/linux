package com.huawei.hianalytics.f.f;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k implements com.huawei.hianalytics.i.a {
    private Context a;

    public k(Context context) {
        this.a = context;
    }

    private void a(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String optString = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
                    String a = com.huawei.hianalytics.f.g.c.a(jSONObject.getString("content"), this.a);
                    String optString2 = jSONObject.optString("eventtime");
                    String optString3 = jSONObject.optString("type");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(a) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                        com.huawei.hianalytics.f.g.j.a(new d(this.a, "_default_config_tag", com.huawei.hianalytics.f.g.h.a(optString3), optString, a, Long.parseLong(optString2)));
                    }
                    com.huawei.hianalytics.g.b.c("InitInfoV2support", "parseV2SPData() Data anomaly! Discarding data.");
                    return;
                }
                continue;
            } catch (JSONException unused) {
                com.huawei.hianalytics.g.b.c("InitInfoV2support", "parseV2SPData() eventJsonArray.getJSONObject() error !");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.f.f.k.run():void");
    }
}
