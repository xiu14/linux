package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class a {
    private static final Pattern a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (a.matcher(String.valueOf(charAt)).matches()) {
                if (i % 2 == 0) {
                    charAt = '*';
                }
                i++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String b(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                sb.append(a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, b(str2, false));
    }

    public static void d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(a(str3));
        }
        Log.e(str, sb.toString());
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, b(str2, false));
    }
}
