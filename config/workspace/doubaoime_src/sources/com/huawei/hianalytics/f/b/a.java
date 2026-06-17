package com.huawei.hianalytics.f.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends c {
    private Context i;

    public a() {
    }

    public a(Context context) {
        this.i = context;
    }

    public static Map<String, c[]> a(SharedPreferences sharedPreferences, Context context, String str, boolean z) {
        if (sharedPreferences == null || context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            Map<String, String> b = com.huawei.hianalytics.f.g.g.b(sharedPreferences);
            if (b.size() > 200 || b.size() == 0) {
                com.huawei.hianalytics.g.b.c("ActionData", "get state data ：The number of data obtained is too much! or No data");
                return hashMap;
            }
            for (Map.Entry<String, String> entry : b.entrySet()) {
                k(entry.getKey(), entry.getValue(), context, hashMap);
            }
        } else {
            k(str, com.huawei.hianalytics.f.g.g.a(sharedPreferences, str), context, hashMap);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void k(String str, String str2, Context context, Map<String, c[]> map) {
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str2)) {
                com.huawei.hianalytics.g.b.c("ActionData", "No data from cache sp!");
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                a aVar = new a(context);
                aVar.a(optJSONObject);
                arrayList.add(aVar);
            }
            map.put(str, arrayList.toArray(new a[arrayList.size()]));
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("ActionData", "readDataToAppAction() events is not json format");
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", g());
            jSONObject.put("eventtime", this.a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.b);
            jSONObject.put("event_session_name", this.f7063g);
            jSONObject.put("first_session_event", this.h);
            String b = com.huawei.hianalytics.f.g.c.b(h(), this.i);
            this.f7060d = b.length();
            jSONObject.put("content", b);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("ActionData", "When toJsonStr() executed,properties parameter anomaly.JSON Exception has happen!");
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject a(boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", g());
            jSONObject2.put("eventtime", this.a);
            jSONObject2.put(NotificationCompat.CATEGORY_EVENT, this.b);
            jSONObject2.put("event_session_name", this.f7063g);
            jSONObject2.put("first_session_event", this.h);
            if (z) {
                String b = com.huawei.hianalytics.f.g.c.b(h(), this.i);
                this.f7060d = b.length();
                jSONObject = b;
            } else {
                jSONObject = new JSONObject(this.f7059c);
            }
            jSONObject2.put("properties", jSONObject);
            return jSONObject2;
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("ActionData", "When toJsonObj() executed,properties parameter anomaly.JSON Exception has happen!");
            return null;
        }
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.a = jSONObject.optString("eventtime", "");
        this.b = jSONObject.optString(NotificationCompat.CATEGORY_EVENT, "");
        f(com.huawei.hianalytics.f.g.c.a(jSONObject.optString("properties"), this.i));
        this.f7061e = jSONObject.optString("type", "");
    }

    public JSONObject b() {
        return a(false);
    }
}
