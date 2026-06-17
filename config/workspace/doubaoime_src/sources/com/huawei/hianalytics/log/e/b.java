package com.huawei.hianalytics.log.e;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class b {
    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return com.huawei.hianalytics.util.d.a(messageDigest.digest());
        } catch (UnsupportedEncodingException unused) {
            str2 = "getSHA256StrJava, getBytes - Unsupported coding format!";
            com.huawei.hianalytics.g.b.d("LogCrypter", str2);
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            str2 = "getSHA256StrJava, getInstance - No such algorithm,transformation!";
            com.huawei.hianalytics.g.b.d("LogCrypter", str2);
            return "";
        }
    }

    public static String a(Key key) {
        return com.huawei.hianalytics.util.d.a(key.getEncoded());
    }

    public static Cipher a(int i, Key key, byte[] bArr) {
        String str;
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, key, ivParameterSpec);
            return cipher;
        } catch (InvalidAlgorithmParameterException unused) {
            str = "AES:getCipher() Invalid algorithm parameters";
            com.huawei.hianalytics.g.b.c("LogCrypter", str);
            return null;
        } catch (InvalidKeyException unused2) {
            str = "AES:getCipher() init - Invalid key!";
            com.huawei.hianalytics.g.b.c("LogCrypter", str);
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            str = "AES:getCipher() getInstance - No such algorithm,transformation!";
            com.huawei.hianalytics.g.b.c("LogCrypter", str);
            return null;
        } catch (NoSuchPaddingException unused4) {
            str = "AES:getCipher() No such filling parameters !";
            com.huawei.hianalytics.g.b.c("LogCrypter", str);
            return null;
        }
    }

    public static byte[] a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static Key b() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
