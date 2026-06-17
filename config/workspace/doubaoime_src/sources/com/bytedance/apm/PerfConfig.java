package com.bytedance.apm;

import android.util.Log;

/* loaded from: classes.dex */
public class PerfConfig {
    static boolean a = false;

    public static boolean a() {
        return a;
    }

    public static void setReportMessage() {
        Log.e("PerfConfig", "setReportMessage set true");
        a = true;
    }
}
