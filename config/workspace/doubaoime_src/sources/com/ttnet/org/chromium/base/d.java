package com.ttnet.org.chromium.base;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes2.dex */
public class d {
    public static void a(String str, String str2, Object... objArr) {
        Throwable c2 = c(objArr);
        String b = b(str2, c2, objArr);
        if (c2 != null) {
            Log.e(e(str), b, c2);
        } else {
            Log.e(e(str), b);
        }
    }

    private static String b(String str, Throwable th, Object... objArr) {
        return objArr != null ? ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr) : str;
    }

    private static Throwable c(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static void d(String str, String str2, Object... objArr) {
        Throwable c2 = c(objArr);
        String b = b(str2, c2, objArr);
        if (c2 != null) {
            Log.i(e(str), b, c2);
        } else {
            Log.i(e(str), b);
        }
    }

    public static String e(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = str.startsWith("cr.") ? 3 : 0;
        StringBuilder M = e.a.a.a.a.M("cr_");
        M.append(str.substring(i, str.length()));
        return M.toString();
    }

    public static void f(String str, String str2, Object... objArr) {
        Throwable c2 = c(objArr);
        String b = b(str2, c2, objArr);
        if (c2 != null) {
            Log.w(e(str), b, c2);
        } else {
            Log.w(e(str), b);
        }
    }
}
