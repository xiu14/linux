package com.bytedance.apm6.consumer.slardar.send.downgrade;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bytedance.apm6.consumer.slardar.send.downgrade.DowngradeInfo;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public volatile DowngradeInfo a;
    private b b;

    /* renamed from: com.bytedance.apm6.consumer.slardar.send.downgrade.a$a, reason: collision with other inner class name */
    private static class C0135a {
        private static final a a = new a();
    }

    public static a a() {
        return C0135a.a;
    }

    public void b(Context context) {
        b bVar = new b(context);
        this.b = bVar;
        c(bVar.a(), false);
    }

    public void c(@Nullable DowngradeInfo downgradeInfo, boolean z) {
        b bVar;
        if (downgradeInfo != null) {
            synchronized (this) {
                this.a = downgradeInfo;
            }
            if (!z || (bVar = this.b) == null) {
                return;
            }
            bVar.b(downgradeInfo);
        }
    }

    public boolean d(JSONObject jSONObject, int i) {
        boolean z = true;
        if (this.a == null || System.currentTimeMillis() > this.a.a) {
            return true;
        }
        String valueOf = String.valueOf(i);
        String optString = jSONObject.optString("log_type");
        synchronized (this) {
            DowngradeInfo.LogType logType = DowngradeInfo.LogType.SERVICE_MONITOR;
            if (logType.logType.equals(optString)) {
                String optString2 = jSONObject.optString("service");
                DowngradeInfo.a aVar = this.a.b.get(logType);
                if (aVar != null) {
                    JSONObject jSONObject2 = aVar.b.get(valueOf);
                    if (jSONObject2 == null || jSONObject2.optInt(optString2, -1) == -1) {
                        return aVar.a;
                    }
                    if (jSONObject2.optInt(optString2, -1) != 1) {
                        z = false;
                    }
                    return z;
                }
            } else {
                DowngradeInfo.a aVar2 = this.a.b.get(DowngradeInfo.LogType.OTHER_LOG_TYPE);
                if (aVar2 != null) {
                    JSONObject jSONObject3 = aVar2.b.get(valueOf);
                    if (jSONObject3 == null || jSONObject3.optInt(optString, -1) == -1) {
                        return aVar2.a;
                    }
                    if (jSONObject3.optInt(optString, -1) != 1) {
                        z = false;
                    }
                    return z;
                }
            }
            return true;
        }
    }
}
