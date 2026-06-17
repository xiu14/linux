package com.huawei.e.a.a.a.b;

import android.text.TextUtils;
import com.huawei.e.a.a.a.d.d;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class b {
    private static final String[] a = {"SHA-256", "SHA-384", "SHA-512"};

    private static boolean a(String str) {
        for (String str2 : a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        byte[] bArr;
        byte[] bArr2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("SHA-256")) {
            d.a("SHA", "content or algorithm is null.");
            return "";
        }
        if (!a("SHA-256")) {
            d.a("SHA", "algorithm is not safe or legal");
            return "";
        }
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = new byte[0];
            d.a("SHA", "Error in generate SHA UnsupportedEncodingException");
        }
        if (bArr == null || TextUtils.isEmpty("SHA-256")) {
            d.a("SHA", "content or algorithm is null.");
            bArr2 = new byte[0];
        } else if (a("SHA-256")) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bArr);
                bArr2 = messageDigest.digest();
            } catch (NoSuchAlgorithmException unused2) {
                d.a("SHA", "Error in generate SHA NoSuchAlgorithmException");
                bArr2 = new byte[0];
            }
        } else {
            d.a("SHA", "algorithm is not safe or legal");
            bArr2 = new byte[0];
        }
        return com.bytedance.feedbackerlib.a.f(bArr2);
    }
}
