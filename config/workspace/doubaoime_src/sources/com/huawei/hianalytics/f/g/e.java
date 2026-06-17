package com.huawei.hianalytics.f.g;

import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class e {
    public static String a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return a(bArr);
    }

    public static String a(byte[] bArr) {
        return com.huawei.hianalytics.util.d.a(bArr);
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i2 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i2])) << 4));
        }
        return bArr;
    }

    public static String b() {
        byte[] bArr = new byte[128];
        new SecureRandom().nextBytes(bArr);
        return a(bArr);
    }

    public static String c() {
        return "a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }
}
