package com.bytedance.crash.O;

import com.bytedance.crash.N.h;
import com.vivo.push.PushClient;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a {
    private boolean a;
    private String b;

    public a(JSONArray jSONArray, boolean z, boolean z2, boolean z3) {
        this.b = null;
        this.a = z && z2;
        if (jSONArray == null || jSONArray.length() >= 10) {
            this.a = false;
        }
        if (!this.a) {
            if (h.g()) {
                this.a = true;
                this.b = "1#all#all#null#lib#SIG#0#0#7#";
                return;
            }
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        boolean equals = PushClient.DEFAULT_REQUEST_ID.equals(jSONArray.optString(0));
        for (int i = 0; i < jSONArray.length(); i++) {
            stringBuffer.append(jSONArray.optString(i) + "#");
        }
        this.a = equals;
        this.b = stringBuffer.toString();
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CoreDumpConfig{isEnable=");
        M.append(this.a);
        M.append(", nativeCrashFeature=");
        M.append((Object) null);
        M.append('}');
        return M.toString();
    }
}
