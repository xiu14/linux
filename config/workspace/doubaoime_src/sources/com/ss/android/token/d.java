package com.ss.android.token;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class d {
    public static String a(Object obj) {
        String obj2 = obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            return "";
        }
        if (obj2.length() <= 10) {
            return obj2;
        }
        return obj2.substring(0, 9) + "***" + obj2.substring(obj2.length() - 5);
    }
}
