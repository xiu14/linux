package com.bytedance.push.monitor;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a implements b {
    @Override // com.bytedance.push.monitor.b
    public void onRequestFailed(String str, String str2, String str3, String str4, long j) {
        com.bytedance.push.g0.f.m("DefaultCommonPushSdkMonitorServiceImpl", "onRequestFailed");
    }

    @Override // com.bytedance.push.monitor.b
    public void onRequestSuccess(String str, String str2, String str3, long j) {
        com.bytedance.push.g0.f.m("DefaultCommonPushSdkMonitorServiceImpl", "onRequestSuccess");
    }

    @Override // com.bytedance.push.monitor.b
    public void onRequestFailed(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        com.bytedance.push.g0.f.m("DefaultCommonPushSdkMonitorServiceImpl", "onRequestFailed v2");
    }

    @Override // com.bytedance.push.monitor.b
    public void onRequestSuccess(String str, String str2, String str3, long j, JSONObject jSONObject) {
        com.bytedance.push.g0.f.m("DefaultCommonPushSdkMonitorServiceImpl", "onRequestSuccess v2");
    }
}
