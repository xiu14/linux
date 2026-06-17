package com.ss.ttuploader;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class TTVideoUploaderAbstractListener {
    public static final int netType4G = 2;
    public static final int netTypeWIFI = 1;
    public static final int vidContextTypeRoutALL = 3;
    public static final int vidContextTypeRoutError = 4;
    public static final int vidContextTypeRoutFirst = 2;
    public static final int vidContextTypeSpeedTestFailed = 1;
    public static final int vidContextTypeSpeedTestSuccess = 0;

    public void onEventLog(JSONObject jSONObject) {
    }

    public void onEventLogMap(Map<String, String> map) {
    }

    public void onSpeedVidContext(int i, int i2, String str) {
    }

    public void onVidContext(String str) {
    }

    public boolean switchNetType(int i) {
        return false;
    }
}
