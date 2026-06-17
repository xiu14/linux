package com.huawei.hianalytics.f.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e extends c {
    public static Map<String, c[]> a(SharedPreferences sharedPreferences, Context context, String str, boolean z) {
        if (sharedPreferences == null || context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            Map<String, String> b = com.huawei.hianalytics.f.g.g.b(sharedPreferences);
            if (b.size() > 200 || b.size() == 0) {
                com.huawei.hianalytics.g.b.c("e", "get state data ：The number of data obtained is too much! or No data : " + b.size());
                return hashMap;
            }
            for (Map.Entry<String, String> entry : b.entrySet()) {
                k(entry.getKey(), entry.getValue(), context, hashMap);
            }
        } else {
            k(str, (String) com.huawei.hianalytics.f.g.g.b(sharedPreferences, str, ""), context, hashMap);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void k(String str, String str2, Context context, Map<String, c[]> map) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = null;
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONArray = new JSONArray(str2);
            }
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("e", "When events turn to JSONArray,JSON Exception has happened");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            e eVar = new e();
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    eVar.b = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
                    String a = com.huawei.hianalytics.f.g.c.a(jSONObject.optString("content"), context);
                    eVar.f7059c = a;
                    if (TextUtils.isEmpty(a)) {
                        com.huawei.hianalytics.g.b.c("e", "cache content is empty");
                        return;
                    }
                    eVar.a = jSONObject.optString("eventtime");
                    eVar.f7061e = jSONObject.optString("type");
                    if (jSONObject.has("event_session_name")) {
                        eVar.f7063g = jSONObject.getString("event_session_name");
                        eVar.h = jSONObject.getString("first_session_event");
                    }
                    arrayList.add(eVar);
                } else {
                    continue;
                }
            } catch (JSONException unused2) {
                arrayList.add(eVar);
                com.huawei.hianalytics.g.b.c("e", "JSON Exception happened when create data for report - readDataToRecord");
            }
        }
        map.put(str, arrayList.toArray(new e[arrayList.size()]));
    }

    @SuppressLint({"ApplySharedPref"})
    public long a(SharedPreferences sharedPreferences) {
        String str;
        String str2;
        if (sharedPreferences == null || (str2 = this.f7062f) == null) {
            str = "saveInSp() eventTag Can't be null";
        } else {
            if (!str2.equals("_default_config_tag")) {
                StringBuilder S = e.a.a.a.a.S(str2, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                S.append(this.f7061e);
                str2 = S.toString();
            }
            String str3 = (String) com.huawei.hianalytics.f.g.g.b(sharedPreferences, str2, "");
            try {
                JSONArray jSONArray = TextUtils.isEmpty(str3) ? new JSONArray() : new JSONArray(str3);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.b);
                jSONObject.put("content", this.f7059c);
                jSONObject.put("eventtime", this.a);
                jSONObject.put("type", this.f7061e);
                jSONObject.put("event_session_name", this.f7063g);
                jSONObject.put("first_session_event", this.h);
                jSONArray.put(jSONObject);
                String jSONArray2 = jSONArray.toString();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(str2);
                edit.putString(str2, jSONArray2);
                edit.apply();
                return jSONArray2.length();
            } catch (JSONException unused) {
                str = "When saveInSp() executed, JSON Exception has happened";
            }
        }
        com.huawei.hianalytics.g.b.c("e", str);
        return -1L;
    }
}
