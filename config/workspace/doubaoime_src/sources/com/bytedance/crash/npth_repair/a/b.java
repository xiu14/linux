package com.bytedance.crash.npth_repair.a;

import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private String[] a;
    private String[] b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f4648c;

    public b(JSONArray jSONArray) {
        try {
            this.a = jSONArray.optString(0).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            this.b = jSONArray.optString(1).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            this.f4648c = new JSONObject();
            for (int i = 2; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!"".equals(optString)) {
                    String[] split = optString.split(Constants.COLON_SEPARATOR);
                    if (split.length == 2) {
                        this.f4648c.putOpt(split[0], split[1]);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean c(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0 || "none".equals(strArr[0])) {
            return false;
        }
        if ("all".equals(strArr[0])) {
            return true;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i) {
        return c(this.a, String.valueOf(i));
    }

    public boolean b(String str) {
        return c(this.b, str);
    }

    public JSONArray d(String str) {
        if (this.f4648c != null && !"".equals(str)) {
            try {
                return new JSONArray(this.f4648c.optString(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
