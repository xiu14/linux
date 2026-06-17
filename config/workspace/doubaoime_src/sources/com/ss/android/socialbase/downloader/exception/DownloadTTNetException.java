package com.ss.android.socialbase.downloader.exception;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadTTNetException extends BaseException {
    private String remoteIp;

    public DownloadTTNetException(int i, String str) {
        super(i, str);
    }

    public String getRemoteIp() {
        return this.remoteIp;
    }

    public String getRequestLog() {
        return getExtraInfo();
    }

    public void parseRemoteIp() {
        String str = this.remoteIp;
        if ((str == null || "0:".equals(str)) && !TextUtils.isEmpty(getRequestLog())) {
            try {
                String optString = new JSONObject(getRequestLog()).getJSONObject("socket").optString("remote");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                this.remoteIp = DownloadUtils.parseTTNetIp(optString);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public DownloadTTNetException setRemoteIp(String str) {
        this.remoteIp = str;
        return this;
    }

    public DownloadTTNetException setRequestLog(String str) {
        setExtraInfo(str);
        return this;
    }

    public DownloadTTNetException(int i, Throwable th) {
        super(i, th);
    }
}
