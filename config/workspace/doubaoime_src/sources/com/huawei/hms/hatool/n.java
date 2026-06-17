package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class n {
    public static final Charset a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, i);
        return new Pair<>(com.bytedance.feedbackerlib.a.Q(substring), str.substring(i));
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> a2 = a(str, 32);
        return new String(com.huawei.e.a.a.a.a.a.b(com.bytedance.feedbackerlib.a.Q((String) a2.second), com.bytedance.feedbackerlib.a.Q(str2), (byte[]) a2.first), a);
    }

    public static String a(byte[] bArr, String str) {
        String str2;
        byte[] bArr2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] Q = com.bytedance.feedbackerlib.a.Q(str);
            if (Q.length >= 16) {
                byte[] c2 = com.huawei.e.a.a.a.d.b.c(12);
                if (bArr.length == 0) {
                    com.huawei.e.a.a.a.d.d.a("GCM", "encrypt 6 content length is 0");
                    bArr2 = new byte[0];
                } else if (Q.length < 16) {
                    com.huawei.e.a.a.a.d.d.a("GCM", "encrypt 6 key error: 6 key length less than 16 bytes.");
                    bArr2 = new byte[0];
                } else if (c2.length < 12) {
                    com.huawei.e.a.a.a.d.d.a("GCM", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
                    bArr2 = new byte[0];
                } else {
                    try {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(Q, "AES");
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, c2));
                        bArr2 = cipher.doFinal(bArr);
                    } catch (NullPointerException e2) {
                        StringBuilder M = e.a.a.a.a.M("GCM encrypt data error");
                        M.append(e2.getMessage());
                        com.huawei.e.a.a.a.d.d.a("GCM", M.toString());
                        bArr2 = new byte[0];
                        byte[] bArr3 = new byte[c2.length + bArr2.length];
                        System.arraycopy(c2, 0, bArr3, 0, c2.length);
                        System.arraycopy(bArr2, 0, bArr3, c2.length, bArr2.length);
                        return com.bytedance.feedbackerlib.a.f(bArr3);
                    } catch (GeneralSecurityException e3) {
                        StringBuilder M2 = e.a.a.a.a.M("GCM encrypt data error");
                        M2.append(e3.getMessage());
                        com.huawei.e.a.a.a.d.d.a("GCM", M2.toString());
                        bArr2 = new byte[0];
                        byte[] bArr32 = new byte[c2.length + bArr2.length];
                        System.arraycopy(c2, 0, bArr32, 0, c2.length);
                        System.arraycopy(bArr2, 0, bArr32, c2.length, bArr2.length);
                        return com.bytedance.feedbackerlib.a.f(bArr32);
                    }
                }
                byte[] bArr322 = new byte[c2.length + bArr2.length];
                System.arraycopy(c2, 0, bArr322, 0, c2.length);
                System.arraycopy(bArr2, 0, bArr322, c2.length, bArr2.length);
                return com.bytedance.feedbackerlib.a.f(bArr322);
            }
            str2 = "key length is not right";
        }
        v.b("AesCipher", str2);
        return "";
    }

    public static String b(String str, String str2) {
        byte[] bArr;
        byte[] bytes = str.getBytes(a);
        byte[] Q = com.bytedance.feedbackerlib.a.Q(str2);
        byte[] c2 = com.huawei.e.a.a.a.d.b.c(16);
        byte[] d2 = com.huawei.e.a.a.a.a.a.d(bytes, Q, c2);
        if (Arrays.equals(d2, new byte[0])) {
            com.huawei.e.a.a.a.d.d.a("CBC", "encrypt encryptContent is null");
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[c2.length + d2.length];
            System.arraycopy(c2, 0, bArr2, 0, c2.length);
            System.arraycopy(d2, 0, bArr2, c2.length, d2.length);
            bArr = bArr2;
        }
        return com.bytedance.feedbackerlib.a.f(bArr);
    }
}
