package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import e.a.a.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ForegroundInnerHeader {
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7188c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.b = JsonUtil.getStringValue(jSONObject, "action");
            this.f7188c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e2) {
            StringBuilder M = a.M("fromJson failed: ");
            M.append(e2.getMessage());
            HMSLog.e("ForegroundInnerHeader", M.toString());
        }
    }

    public String getAction() {
        return this.b;
    }

    public int getApkVersion() {
        return this.a;
    }

    public String getResponseCallbackKey() {
        return this.f7188c;
    }

    public void setAction(String str) {
        this.b = str;
    }

    public void setApkVersion(int i) {
        this.a = i;
    }

    public void setResponseCallbackKey(String str) {
        this.f7188c = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.a);
            jSONObject.put("action", this.b);
            jSONObject.put("responseCallbackKey", this.f7188c);
        } catch (JSONException e2) {
            StringBuilder M = a.M("ForegroundInnerHeader toJson failed: ");
            M.append(e2.getMessage());
            HMSLog.e("ForegroundInnerHeader", M.toString());
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder M = a.M("apkVersion:");
        M.append(this.a);
        M.append(", action:");
        M.append(this.b);
        M.append(", responseCallbackKey:");
        M.append(this.f7188c);
        return M.toString();
    }
}
