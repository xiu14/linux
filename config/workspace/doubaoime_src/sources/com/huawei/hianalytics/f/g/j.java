package com.huawei.hianalytics.f.g;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j {
    public static JSONObject a(String str, long j, LinkedHashMap<String, String> linkedHashMap, String str2) {
        JSONObject jSONObject = linkedHashMap == null ? new JSONObject() : a(linkedHashMap);
        try {
            if ("OnPause".equals(str2)) {
                jSONObject.put("_event_duration", j);
            }
            jSONObject.put("_activity_name", str);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("ThreadUtil", "getEventContent(): JSONException");
        }
        return jSONObject;
    }

    public static JSONObject a(LinkedHashMap<String, String> linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            try {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                com.huawei.hianalytics.g.b.c("ThreadUtil", "onEvent(): JSONException: mapValue");
            }
        }
        return jSONObject;
    }

    public static void a(com.huawei.hianalytics.i.a aVar) {
        if (aVar == null) {
            com.huawei.hianalytics.g.b.c("ThreadUtil", "runTaskSessionHandler - task is null");
            return;
        }
        com.huawei.hianalytics.i.b a = com.huawei.hianalytics.i.b.a();
        if (a != null) {
            a.a(aVar);
        } else {
            com.huawei.hianalytics.g.b.c("ThreadUtil", "SessionHandler is NULL, failed to call task: %s", aVar.getClass().getSimpleName());
        }
    }

    public static boolean a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            com.huawei.hianalytics.g.b.c("ThreadUtil", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }

    public static void b(com.huawei.hianalytics.i.a aVar) {
        if (aVar == null) {
            com.huawei.hianalytics.g.b.c("ThreadUtil", "runTaskMessageThread - task is null");
            return;
        }
        com.huawei.hianalytics.i.b b = com.huawei.hianalytics.i.b.b();
        if (b != null) {
            b.a(aVar);
        } else {
            com.huawei.hianalytics.g.b.c("ThreadUtil", "runTaskMessageThread is NULL, failed to call task: %s", aVar.getClass().getSimpleName());
        }
    }
}
