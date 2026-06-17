package com.huawei.e.a.a.b.g;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class e {
    private static SharedPreferences a;

    public static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (e.class) {
            if (a == null) {
                a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
