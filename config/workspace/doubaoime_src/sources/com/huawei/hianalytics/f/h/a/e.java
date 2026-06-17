package com.huawei.hianalytics.f.h.a;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e implements b {
    private void c(String str, String str2) {
        long parseLong;
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length != 3) {
            return;
        }
        String str3 = split[0];
        String str4 = split[1];
        String str5 = split[2];
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return;
        }
        long longValue = com.huawei.hianalytics.f.h.b.a.a(str4).longValue();
        if (!TextUtils.isEmpty(str5)) {
            try {
                parseLong = Long.parseLong(str5) * 1000;
            } catch (NumberFormatException unused) {
                com.huawei.hianalytics.g.b.c("V1LifeCycleAdapter", "failed to bisdk convertDuration.");
            }
            if (longValue > 0 || parseLong < 0) {
            }
            a.b(new com.huawei.hianalytics.f.h.c.a(str3, longValue), str2);
            a.a(new com.huawei.hianalytics.f.h.c.a(str3, longValue + parseLong, parseLong), str2);
            return;
        }
        parseLong = -1;
        if (longValue > 0) {
        }
    }

    @Override // com.huawei.hianalytics.f.h.a.b
    public void a(String str) {
        a.a(str);
    }

    @Override // com.huawei.hianalytics.f.h.a.b
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str3 : str.split(";")) {
            c(str3, str2);
        }
    }

    @Override // com.huawei.hianalytics.f.h.a.b
    public void b(String str, String str2) {
        JSONArray jSONArray;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray2 = new JSONObject(str).getJSONArray("termination");
            if (jSONArray2 == null) {
                return;
            }
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i);
                if (jSONObject != null && jSONObject.has(com.heytap.mcssdk.liquid.b.a) && (jSONArray = jSONObject.getJSONArray(com.heytap.mcssdk.liquid.b.a)) != null) {
                    int length2 = jSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        c(jSONArray.getString(i2), str2);
                    }
                }
            }
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.d("V1LifeCycleAdapter", "Exception occurred in parsing file data.");
        }
    }
}
