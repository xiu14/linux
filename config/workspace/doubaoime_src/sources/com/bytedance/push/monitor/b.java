package com.bytedance.push.monitor;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface b {
    void onRequestFailed(String str, String str2, String str3, String str4, long j);

    void onRequestFailed(String str, String str2, String str3, String str4, long j, JSONObject jSONObject);

    void onRequestSuccess(String str, String str2, String str3, long j);

    void onRequestSuccess(String str, String str2, String str3, long j, JSONObject jSONObject);
}
