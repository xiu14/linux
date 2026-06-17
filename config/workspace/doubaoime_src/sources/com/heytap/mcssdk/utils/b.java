package com.heytap.mcssdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.heytap.msp.push.encrypt.AESEncrypt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class b {
    public static String a = null;
    public static final String b = "Y29tLm5lYXJtZS5tY3M=";

    /* renamed from: c, reason: collision with root package name */
    public static String f6922c = "";

    private static String a() {
        if (TextUtils.isEmpty(f6922c)) {
            f6922c = new String(Base64.decode(b, 0));
        }
        byte[] a2 = a(a(f6922c));
        return a2 != null ? new String(a2, Charset.forName("UTF-8")) : "";
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static String b(String str) {
        boolean z;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = c.a(str, a());
            e.b("sdkDecrypt desDecrypt des data " + str2);
            z = true;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("sdkDecrypt DES exception ");
            M.append(e2.toString());
            e.b(M.toString());
            z = false;
        }
        if (TextUtils.isEmpty(str2) ? false : z) {
            return str2;
        }
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            a = "AES";
            g.f().a(a);
            e.b("sdkDecrypt desDecrypt aes data " + str2);
            return str2;
        } catch (Exception e3) {
            StringBuilder M2 = e.a.a.a.a.M("sdkDecrypt AES exception ");
            M2.append(e3.toString());
            e.b(M2.toString());
            return str2;
        }
    }

    public static String c(String str) {
        boolean z;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        boolean z2 = false;
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            e.b("sdkDecrypt aesDecrypt aes data " + str2);
            z = true;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("sdkDecrypt AES exception ");
            M.append(e2.toString());
            e.b(M.toString());
            z = false;
        }
        if (TextUtils.isEmpty(str2)) {
            e.b("sdkDecrypt AES empty");
        } else {
            z2 = z;
        }
        if (z2) {
            return str2;
        }
        try {
            str2 = c.a(str, a());
            a = "DES";
            g.f().a(a);
            e.b("sdkDecrypt aesDecrypt des data " + str2);
            return str2;
        } catch (Exception e3) {
            StringBuilder M2 = e.a.a.a.a.M("sdkDecrypt DES excepiton ");
            M2.append(e3.toString());
            e.b(M2.toString());
            return str2;
        }
    }

    public static String d(String str) {
        e.b("sdkDecrypt start data " + str);
        if (TextUtils.isEmpty(a)) {
            a = g.f().b();
        }
        if ("DES".equals(a)) {
            e.b("sdkDecrypt start DES");
            return b(str);
        }
        e.b("sdkDecrypt start AES");
        return c(str);
    }
}
