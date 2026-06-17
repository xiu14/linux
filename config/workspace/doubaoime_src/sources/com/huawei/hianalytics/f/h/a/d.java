package com.huawei.hianalytics.f.h.a;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d implements b {
    private LinkedList<com.huawei.hianalytics.f.h.c.b> a = new LinkedList<>();

    private boolean c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.split(Constants.ACCEPT_TIME_SEPARATOR_SP).length == 3;
        }
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "event data is empty");
        return false;
    }

    private void d(String str) {
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        String replace = split[0].replace("^", Constants.ACCEPT_TIME_SEPARATOR_SP);
        String replace2 = split[1].replace("^", Constants.ACCEPT_TIME_SEPARATOR_SP);
        Long a = com.huawei.hianalytics.f.h.b.a.a(split[2]);
        if (TextUtils.isEmpty(replace) || a.longValue() == -1) {
            return;
        }
        this.a.add(new com.huawei.hianalytics.f.h.c.b(replace, replace2, a.longValue()));
    }

    @Override // com.huawei.hianalytics.f.h.a.b
    public void a(String str) {
        com.huawei.hianalytics.g.b.b("V1EventsAdapter", "onReport: will report " + this.a.size() + " events.");
        Iterator<com.huawei.hianalytics.f.h.c.b> it2 = this.a.iterator();
        while (it2.hasNext()) {
            a.a(it2.next(), str);
        }
        a.a(str);
        this.a.clear();
    }

    @Override // com.huawei.hianalytics.f.h.a.b
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str3 : str.split(";")) {
            if (c(str3)) {
                d(str3);
            }
        }
    }

    @Override // com.huawei.hianalytics.f.h.a.b
    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.isNull("termination") ? new JSONArray() : jSONObject.getJSONArray("termination");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.has("e")) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("e");
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String string = optJSONArray.getString(i2);
                        if (string != null && c(string)) {
                            d(string);
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.d("V1EventsAdapter", "Exception occurred in parsing file data.");
        }
    }
}
