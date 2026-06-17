package com.mammon.audiosdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SAMICoreNativeTraceSpanCallback {
    private static SAMICoreTraceSpanCallback userCallback;

    public static void onSpan(int i, String str, String str2, String str3, String str4, String str5) {
        if (userCallback != null) {
            JSONObject jSONObject = null;
            if (str5 != null) {
                try {
                    jSONObject = new JSONObject(str5);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject = new JSONObject();
                }
            }
            userCallback.onSpan(i, str, str2, str3, str4, jSONObject);
        }
    }

    public static void setTraceSpanCallback(SAMICoreTraceSpanCallback sAMICoreTraceSpanCallback) {
        userCallback = sAMICoreTraceSpanCallback;
    }
}
