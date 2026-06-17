package com.huawei.e.a.a.a.d;

import android.annotation.SuppressLint;

/* loaded from: classes2.dex */
public class a {
    private static boolean a(int i, String str) {
        return str != null && str.length() >= i;
    }

    public static byte[] b(String str, String str2, String str3, String str4, int i, boolean z) {
        return c(str, str2, str3, com.bytedance.feedbackerlib.a.Q(str4), i, z);
    }

    @SuppressLint({"NewApi"})
    public static byte[] c(String str, String str2, String str3, byte[] bArr, int i, boolean z) {
        if (!(i >= 16)) {
            d.a("BaseKeyUtil", "exportLen length must be more than 128bit.");
            return new byte[0];
        }
        if (!a(i, str)) {
            d.a("BaseKeyUtil", "material(first) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (!a(i, str2)) {
            d.a("BaseKeyUtil", "material(second) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (!a(i, str3)) {
            d.a("BaseKeyUtil", "material(third) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        byte[] Q = com.bytedance.feedbackerlib.a.Q(str);
        byte[] Q2 = com.bytedance.feedbackerlib.a.Q(str2);
        byte[] Q3 = com.bytedance.feedbackerlib.a.Q(str3);
        int length = Q.length;
        int length2 = Q2.length;
        int length3 = Q3.length;
        if (length2 < length) {
            length = length2;
        }
        if (length3 >= length) {
            length3 = length;
        }
        if (!(bArr.length >= 16) || !(length3 >= 16)) {
            throw new IllegalArgumentException("key length must be more than 128bit.");
        }
        char[] cArr = new char[length3];
        for (int i2 = 0; i2 < length3; i2++) {
            cArr[i2] = (char) ((Q[i2] ^ Q2[i2]) ^ Q3[i2]);
        }
        if (z) {
            d.b("BaseKeyUtil", "exportRootKey: sha256");
            return com.huawei.e.a.a.a.b.a.a(cArr, bArr, 10000, i * 8, true);
        }
        d.b("BaseKeyUtil", "exportRootKey: sha1");
        return com.huawei.e.a.a.a.b.a.a(cArr, bArr, 10000, i * 8, false);
    }
}
