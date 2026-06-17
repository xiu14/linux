package com.bytedance.ttnet.config;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {

    public static class a {
        private String a;
        private JSONObject b;

        public boolean a() {
            JSONObject jSONObject;
            return !TextUtils.isEmpty(this.a) || ((jSONObject = this.b) != null && jSONObject.length() > 0);
        }

        public JSONObject b() throws JSONException {
            if (this.b == null) {
                this.b = new JSONObject(this.a);
            }
            return this.b;
        }

        public String c() {
            if (TextUtils.isEmpty(this.a)) {
                this.a = this.b.toString();
            }
            return this.a;
        }
    }

    public static boolean a(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).length() > 0;
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).length() > 0;
        }
        if (obj instanceof a) {
            return ((a) obj).a();
        }
        return false;
    }
}
