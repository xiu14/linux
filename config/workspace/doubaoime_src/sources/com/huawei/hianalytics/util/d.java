package com.huawei.hianalytics.util;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class d {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return a(messageDigest.digest());
        } catch (UnsupportedEncodingException unused) {
            str2 = "getSHA256StrJava, Unsupported Encoding: UTF-8 !";
            com.huawei.hianalytics.g.b.d("HianalyticsSDK", str2);
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            str2 = "getSHA256StrJava, No Such Algorithm!";
            com.huawei.hianalytics.g.b.d("HianalyticsSDK", str2);
            return "";
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b & 240) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static byte[] a(String str, String str2) {
        String str3;
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "HmacSHA256");
        try {
            Mac mac = Mac.getInstance(secretKeySpec.getAlgorithm());
            mac.init(secretKeySpec);
            return mac.doFinal(bytes);
        } catch (InvalidKeyException unused) {
            str3 = "Exception has happened when digest2byte,From Invalid key!";
            com.huawei.hianalytics.g.b.c("HiAnalyticsHexUtil", str3);
            return new byte[0];
        } catch (NoSuchAlgorithmException unused2) {
            str3 = "When digest2byte executed Exception has happened!From Algorithm error !";
            com.huawei.hianalytics.g.b.c("HiAnalyticsHexUtil", str3);
            return new byte[0];
        }
    }
}
