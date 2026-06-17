package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class TTDispatchResult {
    public final String a;

    public enum DispatchState {
        SUCCESS,
        INVALID_ORIGIN_URL,
        CRONET_NOT_INIT,
        TIMEOUT,
        INVALID_FINAL_URL,
        WRONG_FORMAT,
        OKHTTP_DISPATCH_FAILED,
        NOT_REACHED
    }

    public TTDispatchResult(String str, DispatchState dispatchState, Exception exc) {
        this.a = str;
    }

    public TTDispatchResult(String str, String str2, String str3, String str4, DispatchState dispatchState, String str5) {
        this.a = str2;
        TextUtils.isEmpty(str3);
        TextUtils.isEmpty(str4);
        TextUtils.isEmpty(str5);
    }
}
