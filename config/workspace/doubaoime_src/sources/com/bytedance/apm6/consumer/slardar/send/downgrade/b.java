package com.bytedance.apm6.consumer.slardar.send.downgrade;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.bytedance.apm6.consumer.slardar.send.downgrade.DowngradeInfo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b {
    private SharedPreferences a;

    public b(Context context) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = context.getSharedPreferences("monitor_downgrade", 0);
                }
            }
        }
    }

    @Nullable
    public DowngradeInfo a() {
        String string = this.a.getString(com.heytap.mcssdk.constant.b.p, null);
        if (string != null) {
            try {
                if (e.b.b.n.a.b()) {
                    e.b.b.n.g.b.d("APM-Downgrade", "DowngradeData-load-" + string);
                }
                DowngradeInfo a = DowngradeInfo.a(new JSONObject(string));
                if (System.currentTimeMillis() < a.a) {
                    return a;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public void b(DowngradeInfo downgradeInfo) {
        JSONObject jSONObject;
        if (this.a != null) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("expire_time", downgradeInfo.a);
                for (Map.Entry<DowngradeInfo.LogType, DowngradeInfo.a> entry : downgradeInfo.b.entrySet()) {
                    jSONObject.put(entry.getKey().logType, entry.getValue().b());
                }
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String jSONObject2 = jSONObject.toString();
                if (e.b.b.n.a.b()) {
                    e.b.b.n.g.b.d("APM-Downgrade", "DowngradeData-save-" + jSONObject2);
                }
                this.a.edit().putString(com.heytap.mcssdk.constant.b.p, jSONObject.toString()).apply();
            }
        }
    }
}
