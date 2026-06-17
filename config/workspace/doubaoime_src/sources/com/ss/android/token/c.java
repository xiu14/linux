package com.ss.android.token;

import android.util.Log;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {
    static {
        new HashSet();
    }

    public static void a(Throwable th) {
        try {
            th.printStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_msg", th.getMessage());
            jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
            b("tt_token_exception", jSONObject);
            int i = b.b;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("passport-sdk-version", 40490);
            jSONObject.put("result", 0);
            try {
                if (!jSONObject.has("passport-sdk-version")) {
                    jSONObject.put("passport-sdk-version", 40490);
                }
                jSONObject.put("params_for_special", "uc_login");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            int i = b.b;
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }
}
