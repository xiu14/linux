package com.huawei.hms.common.internal;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import e.a.a.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ResponseWrap {
    private String a;
    private ResponseHeader b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.b = responseHeader;
    }

    public boolean fromJson(String str) {
        if (this.b == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b.setStatusCode(JsonUtil.getIntValue(jSONObject, MonitorConstants.STATUS_CODE));
            this.b.setErrorCode(JsonUtil.getIntValue(jSONObject, "error_code"));
            this.b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.b.setAppID(JsonUtil.getStringValue(jSONObject, "app_id"));
            this.b.setPkgName(JsonUtil.getStringValue(jSONObject, MonitorConstants.PKG_NAME));
            this.b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.b.setTransactionId(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID));
            this.b.setResolution(JsonUtil.getStringValue(jSONObject, "resolution"));
            this.a = JsonUtil.getStringValue(jSONObject, "body");
            return true;
        } catch (JSONException e2) {
            StringBuilder M = a.M("fromJson failed: ");
            M.append(e2.getMessage());
            HMSLog.e("ResponseWrap", M.toString());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = new JSONObject().toString();
        }
        return this.a;
    }

    public ResponseHeader getResponseHeader() {
        return this.b;
    }

    public void setBody(String str) {
        this.a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.b = responseHeader;
    }

    public String toJson() {
        if (this.b == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MonitorConstants.STATUS_CODE, this.b.getStatusCode());
            jSONObject.put("error_code", this.b.getErrorCode());
            jSONObject.put("error_reason", this.b.getErrorReason());
            jSONObject.put("srv_name", this.b.getSrvName());
            jSONObject.put("api_name", this.b.getApiName());
            jSONObject.put("app_id", this.b.getAppID());
            jSONObject.put(MonitorConstants.PKG_NAME, this.b.getPkgName());
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.b.getTransactionId());
            jSONObject.put("resolution", this.b.getResolution());
            String sessionId = this.b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put("body", this.a);
            }
        } catch (JSONException e2) {
            StringBuilder M = a.M("toJson failed: ");
            M.append(e2.getMessage());
            HMSLog.e("ResponseWrap", M.toString());
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder M = a.M("ResponseWrap{body='");
        a.G0(M, this.a, '\'', ", responseHeader=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }
}
