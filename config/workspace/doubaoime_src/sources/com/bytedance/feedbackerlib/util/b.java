package com.bytedance.feedbackerlib.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class b {
    public static final Object[] a = new Object[0];
    public static final Class<?>[] b = new Class[0];

    public static boolean a(@NonNull Context context, @NonNull String str) {
        PackageManager packageManager;
        if (context == null || context.getApplicationContext() == null || TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            return str.equals(packageManager.getPackageInfo(str, 0).packageName);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object[] b(Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? a : objArr;
    }

    public static Class<?>[] c(Object... objArr) {
        if (objArr.length == 0) {
            return b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i] == null ? null : objArr[i].getClass();
        }
        return clsArr;
    }
}
