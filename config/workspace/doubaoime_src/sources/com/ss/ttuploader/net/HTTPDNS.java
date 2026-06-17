package com.ss.ttuploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.ttuploader.TTUploadLog;
import com.ss.ttuploader.net.TTVNetClient;
import com.xiaomi.mipush.sdk.Constants;
import e.a.a.a.a;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class HTTPDNS extends BaseDNS {
    private static final String TAG = "HTTPDNS";
    private static String mGlobalGoogleDNSParseHost = "";
    private static String mGlobalOwnDNSParseHost = "";
    private static String mGoogleDNSServerPath = "/resolve?name=";
    private static String mTTDNSServerPath = "/q?host=";
    private int mHttpDNSType;
    private Object mSource;
    private long mSourceId;

    public HTTPDNS(String str, TTVNetClient tTVNetClient, int i, Handler handler) {
        super(str, tTVNetClient, handler);
        this.mHttpDNSType = 2;
        this.mHttpDNSType = i;
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            StringBuilder M = a.M("https://");
            M.append(mGlobalOwnDNSParseHost);
            M.append(mTTDNSServerPath);
            sb.append(M.toString());
        } else if (i == 3) {
            StringBuilder M2 = a.M("https://");
            M2.append(mGlobalGoogleDNSParseHost);
            M2.append(mGoogleDNSServerPath);
            sb.append(M2.toString());
        }
        sb.append(this.mHostname);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _handleResponse(JSONObject jSONObject, Error error) {
        TTUploadLog.d(TAG, String.format("****http dns id:%s", this.mId));
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(this.mHttpDNSType, this.mHostname, null, 0L, this.mId);
        if (error != null) {
            tTUploadDNSInfo.mErrorStr = error.errStr;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            TTUploadLog.d(TAG, String.format("http dns json is empty type:%d", Integer.valueOf(this.mHttpDNSType)));
        } else {
            TTUploadDNSInfo parserResult = parserResult(jSONObject);
            if (parserResult != null) {
                IPCache.getInstance().put(this.mHostname, parserResult);
                notifySuccess(parserResult);
                return;
            }
        }
        notifyError(tTUploadDNSInfo);
    }

    private TTUploadDNSInfo parserResult(JSONObject jSONObject) {
        long currentTimeMillis;
        String str;
        int i = this.mHttpDNSType;
        String str2 = "";
        if (i == 2 || i == 1) {
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                TTUploadLog.d(TAG, String.format("no ips in json, type:%d", Integer.valueOf(this.mHttpDNSType)));
                return null;
            }
            r7 = jSONObject.has(RemoteMessageConst.TTL) ? jSONObject.optInt(RemoteMessageConst.TTL) : 60;
            currentTimeMillis = System.currentTimeMillis() + (r7 * 1000);
            String str3 = null;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    str3 = optJSONArray.getString(i2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    str2 = TextUtils.isEmpty(str2) ? a.s(str2, str3) : a.t(str2, Constants.ACCEPT_TIME_SEPARATOR_SP, str3);
                }
            }
            str = str3;
        } else {
            currentTimeMillis = 0;
            str = null;
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("Answer");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    if (jSONObject2.has("type") && jSONObject2.getInt("type") == 1) {
                        if (jSONObject2.has("TTL")) {
                            r7 = jSONObject2.optInt("TTL");
                        }
                        if (jSONObject2.has(RemoteMessageConst.DATA)) {
                            str = jSONObject2.optString(RemoteMessageConst.DATA);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            str2 = TextUtils.isEmpty(str2) ? str2 + str : str2 + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
                        }
                    }
                }
                currentTimeMillis = System.currentTimeMillis() + (r7 * 1000);
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return new TTUploadDNSInfo(this.mHttpDNSType, this.mHostname, str2, currentTimeMillis, this.mId);
    }

    public static void setDNSServerHost(String str, String str2) {
        synchronized (HTTPDNS.class) {
            if (!TextUtils.isEmpty(str)) {
                mGlobalOwnDNSParseHost = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                mGlobalGoogleDNSParseHost = str2;
            }
        }
    }

    @Override // com.ss.ttuploader.net.BaseDNS
    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        this.mNetClient.cancel();
    }

    @Override // com.ss.ttuploader.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.mNetClient.startTask(_getURL, null, null, 0, new TTVNetClient.CompletionListener() { // from class: com.ss.ttuploader.net.HTTPDNS.1
                @Override // com.ss.ttuploader.net.TTVNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        } else {
            this.mNetClient.startTask(_getURL, null, new TTVNetClient.CompletionListener() { // from class: com.ss.ttuploader.net.HTTPDNS.2
                @Override // com.ss.ttuploader.net.TTVNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        }
    }
}
