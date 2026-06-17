package com.bytedance.push.settings;

import com.vivo.push.PushClient;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {
    public static boolean a(JSONObject jSONObject, String str) {
        Boolean bool;
        Object opt = jSONObject.opt(str);
        if (opt instanceof Boolean) {
            bool = (Boolean) opt;
        } else if (opt instanceof Integer) {
            Integer num = (Integer) opt;
            if (num.intValue() == 1) {
                bool = Boolean.TRUE;
            } else {
                if (num.intValue() == 0) {
                    bool = Boolean.FALSE;
                }
                bool = null;
            }
        } else {
            if (opt instanceof String) {
                String str2 = (String) opt;
                if ("true".equalsIgnoreCase(str2) || PushClient.DEFAULT_REQUEST_ID.equals(str2)) {
                    bool = Boolean.TRUE;
                } else if ("false".equalsIgnoreCase(str2) || "0".equals(str2)) {
                    bool = Boolean.FALSE;
                }
            }
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
