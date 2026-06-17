package com.huawei.hianalytics.f.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n {
    private Context a;

    n(Context context) {
        this.a = context;
    }

    public void a() {
        JSONArray jSONArray;
        if (!com.huawei.hianalytics.a.b.h()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "ServerAddrGetTask() Not need RetrieveUploadUrl,URL is empty, But the switch is closed !");
            return;
        }
        List<String> a = com.huawei.hianalytics.f.g.d.a(this.a);
        com.huawei.hianalytics.h.e.a().a("pre_report_url_tag", com.huawei.hianalytics.f.g.i.a(a, "{url}/getServerInfoWithBackup"));
        String a2 = com.huawei.hianalytics.util.f.a("ro.product.CustCVersion", "");
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "cust version: %s", a2);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isoCode", a2);
            byte[] bytes = jSONObject.toString().getBytes("UTF-8");
            com.huawei.hianalytics.h.c a3 = com.huawei.hianalytics.h.e.a().a(bytes, null, "pre_report_url_tag");
            if (a3.a() == 404) {
                com.huawei.hianalytics.g.b.b("ServerAddrGetTask", "second time to get the pro address");
                com.huawei.hianalytics.h.e.a().a("pre_report_backup_url_tag", com.huawei.hianalytics.f.g.i.a(a, "{url}/getServerInfo"));
                a3 = com.huawei.hianalytics.h.e.a().a(bytes, null, "pre_report_backup_url_tag");
            }
            JSONObject jSONObject2 = new JSONObject(a3.b());
            com.huawei.hianalytics.g.b.b("HiAnalytics/event", "get server add response err code: %s", jSONObject2.optString("resultcode", "-100"));
            ArrayList arrayList = new ArrayList();
            if (jSONObject2.has("serverUrls")) {
                jSONArray = jSONObject2.optJSONArray("serverUrls");
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = jSONArray.optString(i, "");
                        if (com.huawei.hianalytics.util.h.a(optString)) {
                            arrayList.add("{url}/common/hmshioperbatch".replace("{url}", optString));
                        }
                    }
                }
            } else {
                String optString2 = jSONObject2.optString("serverUrl", "");
                if (com.huawei.hianalytics.util.h.a(optString2)) {
                    arrayList.add("{url}/common/hmshioperbatch".replace("{url}", optString2));
                }
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(optString2);
                jSONArray = jSONArray2;
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            if (strArr.length <= 0 || jSONArray == null) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "ServerAddrGetTask() No access to preloaded URL");
                return;
            }
            com.huawei.hianalytics.a.b.a(strArr);
            com.huawei.hianalytics.a.b.a(false);
            com.huawei.hianalytics.h.e.a().a("preload_url_tag", strArr);
            SharedPreferences d2 = com.huawei.hianalytics.f.g.g.d(this.a, "global_v2");
            com.huawei.hianalytics.f.g.g.a(d2, "upload_url", jSONArray.toString());
            com.huawei.hianalytics.f.g.g.a(d2, "upload_url_time", Long.valueOf(System.currentTimeMillis()));
        } catch (UnsupportedEncodingException unused) {
            com.huawei.hianalytics.g.b.c("ServerAddrGetTask", "get server address Unsupported Encoding: UTF-8!");
        } catch (JSONException unused2) {
            com.huawei.hianalytics.g.b.c("ServerAddrGetTask", "getUploadServerAddr(): JSON structure Exception!");
        }
    }
}
