package com.bytedance.apm6.consumer.slardar.send.downgrade;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DowngradeInfo {
    public long a;
    public Map<LogType, a> b = new HashMap();

    public enum LogType {
        OTHER_LOG_TYPE("other"),
        SERVICE_MONITOR("service_monitor");

        public final String logType;

        LogType(String str) {
            this.logType = str;
        }
    }

    static class a {
        public boolean a;
        public Map<String, JSONObject> b = new HashMap();

        a() {
        }

        public static a a(JSONObject jSONObject) {
            JSONObject optJSONObject;
            a aVar = new a();
            aVar.a = jSONObject.optInt(DownloadSettingKeys.BugFix.DEFAULT, 1) == 1;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals(next, DownloadSettingKeys.BugFix.DEFAULT) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                    aVar.b.put(next, optJSONObject);
                }
            }
            return aVar;
        }

        @Nullable
        public JSONObject b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DownloadSettingKeys.BugFix.DEFAULT, this.a ? 1 : 0);
                for (Map.Entry<String, JSONObject> entry : this.b.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                return jSONObject;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public static DowngradeInfo a(JSONObject jSONObject) {
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            StringBuilder M = e.a.a.a.a.M("DowngradeRule=");
            M.append(jSONObject.toString());
            e.b.b.n.g.b.d("APM-Slardar", M.toString());
        }
        DowngradeInfo downgradeInfo = new DowngradeInfo();
        long optLong = jSONObject.optLong("duration", 0L);
        long optLong2 = jSONObject.optLong("expire_time", 0L);
        if (optLong2 > 0) {
            downgradeInfo.a = optLong2;
        } else {
            downgradeInfo.a = (optLong * 1000) + System.currentTimeMillis();
        }
        LogType logType = LogType.OTHER_LOG_TYPE;
        JSONObject optJSONObject = jSONObject.optJSONObject(logType.logType);
        if (optJSONObject != null) {
            downgradeInfo.b.put(logType, a.a(optJSONObject));
        }
        LogType logType2 = LogType.SERVICE_MONITOR;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(logType2.logType);
        if (optJSONObject2 != null) {
            downgradeInfo.b.put(logType2, a.a(optJSONObject2));
        }
        return downgradeInfo;
    }
}
