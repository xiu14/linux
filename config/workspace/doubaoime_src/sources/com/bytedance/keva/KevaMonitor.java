package com.bytedance.keva;

import android.util.Log;
import e.a.a.a.a;

/* loaded from: classes.dex */
public class KevaMonitor {
    protected void loadLibrary(String str) {
        System.loadLibrary(str);
    }

    protected void logDebug(String str) {
        Log.println(4, KevaConstants.TAG, str);
    }

    protected void onLoadRepo(String str, int i) {
        Log.println(4, KevaConstants.TAG, "load repo: " + str + ", with mode: " + i);
    }

    protected void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
        StringBuilder P = a.P("action: [", i, "], repo: [", str, "], key: [");
        P.append(str2);
        P.append("], value: [");
        P.append(obj);
        P.append("], msg: ");
        P.append(th.getMessage());
        Log.e(KevaConstants.TAG, P.toString(), th);
    }

    protected void reportWarning(int i, String str, String str2, Object obj, String str3) {
        StringBuilder P = a.P("action: [", i, "], repo: [", str, "], key: [");
        P.append(str2);
        P.append("], value: [");
        P.append(obj);
        P.append("], msg: ");
        P.append(str3);
        Log.println(5, KevaConstants.TAG, P.toString());
    }
}
