package com.xiaomi.clientreport.data;

import com.bytedance.crash.general.RomInfo;
import com.heytap.mcssdk.constant.b;
import com.vivo.push.PushClientConstants;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.push.bw;
import com.xiaomi.push.k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public String clientInterfaceId;
    private String pkgName;
    public int production;
    public int reportType;
    private String sdkVersion;
    private String os = bw.a();
    private String miuiVersion = k.m651a();

    public String getPackageName() {
        return this.pkgName;
    }

    public void setAppPackageName(String str) {
        this.pkgName = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.production);
            jSONObject.put("reportType", this.reportType);
            jSONObject.put("clientInterfaceId", this.clientInterfaceId);
            jSONObject.put(RomInfo.KEY_OS_TYPE, this.os);
            jSONObject.put("miuiVersion", this.miuiVersion);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.pkgName);
            jSONObject.put(b.C, this.sdkVersion);
            return jSONObject;
        } catch (JSONException e2) {
            c.m18a((Throwable) e2);
            return null;
        }
    }

    public String toJsonString() {
        JSONObject json = toJson();
        return json == null ? "" : json.toString();
    }
}
