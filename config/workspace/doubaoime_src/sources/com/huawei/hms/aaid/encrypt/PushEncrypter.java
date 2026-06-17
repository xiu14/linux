package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.feedbackerlib.a;
import com.huawei.e.a.a.a.d.d;
import com.huawei.hms.opendevice.l;

/* loaded from: classes2.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String b = l.b(context);
        if (TextUtils.isEmpty(str)) {
            d.a("CBC", "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(b)) {
            d.a("CBC", "decrypt 1 key is null");
            return "";
        }
        byte[] Q = a.Q(b);
        if (Q.length >= 16) {
            return com.huawei.e.a.a.a.a.a.a(str, Q);
        }
        d.a("CBC", "decrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String encrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String b = l.b(context);
        if (TextUtils.isEmpty(str)) {
            d.a("CBC", "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(b)) {
            d.a("CBC", "encrypt 1 key is null");
            return "";
        }
        byte[] Q = a.Q(b);
        if (Q.length >= 16) {
            return com.huawei.e.a.a.a.a.a.c(str, Q);
        }
        d.a("CBC", "encrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String encrypterOld(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : com.huawei.e.a.a.a.a.a.c(str, l.a(context));
    }
}
