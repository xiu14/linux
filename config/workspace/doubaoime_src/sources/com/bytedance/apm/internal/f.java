package com.bytedance.apm.internal;

import android.text.TextUtils;
import com.bytedance.apm.doctor.DoctorManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class f implements DoctorManager.ApmListener {
    f() {
    }

    private void a(String str, String str2, boolean z) {
        int length = (4000 - str.length()) - 5;
        if (str2.length() <= length) {
            if (z) {
                com.bytedance.apm.y.d.c("APM-Doctor-Log", str, e.a.a.a.a.s(" ", str2));
                return;
            } else {
                com.bytedance.apm.y.d.d("APM-Doctor-Log", str, e.a.a.a.a.s(" ", str2));
                return;
            }
        }
        int i = 0;
        while (i < str2.length()) {
            int i2 = i + length;
            String substring = i2 < str2.length() ? str2.substring(i, i2) : str2.substring(i);
            if (z) {
                com.bytedance.apm.y.d.c("APM-Doctor-Log", str, e.a.a.a.a.s(" ", substring));
            } else {
                com.bytedance.apm.y.d.d("APM-Doctor-Log", str, e.a.a.a.a.s(" ", substring));
            }
            i = i2;
        }
    }

    @Override // com.bytedance.apm.doctor.DoctorManager.ApmListener
    public void onDataEvent(int i, String str, JSONObject jSONObject) {
        if (TextUtils.equals(str, "DATA_CACHE") || TextUtils.equals(str, "DATA_SEND_END") || TextUtils.equals(str, "DATA_SEND_RESPONSE")) {
            return;
        }
        if (TextUtils.equals(str, "DATA_RECEIVE") && !jSONObject.optJSONObject("DATA_DOCTOR").optBoolean("DATA_SAMPLE")) {
            str = "DATA_NOT_SAMPLED";
        }
        String optString = jSONObject.optString("service");
        String optString2 = jSONObject.optString("log_type");
        StringBuilder P = e.a.a.a.a.P("onDataEvent[", i, "] ", str, " [service:");
        P.append(optString);
        P.append("|logType:");
        P.append(optString2);
        P.append("] = ");
        a(P.toString(), jSONObject.toString(), str.contains("ERROR"));
    }

    @Override // com.bytedance.apm.doctor.DoctorManager.ApmListener
    public void onEvent(String str, String str2) {
        a(e.a.a.a.a.s("onEvent key=", str), str2, false);
    }
}
