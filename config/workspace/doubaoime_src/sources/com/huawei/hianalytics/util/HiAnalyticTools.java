package com.huawei.hianalytics.util;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class HiAnalyticTools {
    public static void enableLog(Context context) {
        enableLog(context, 4);
    }

    public static void enableLog(Context context, int i) {
        com.huawei.hianalytics.g.b.a(context, i, "hianalytics");
    }
}
