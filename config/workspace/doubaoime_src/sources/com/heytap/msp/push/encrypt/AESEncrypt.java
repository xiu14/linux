package com.heytap.msp.push.encrypt;

import android.util.Base64;
import com.heytap.mcssdk.utils.e;
import e.a.a.a.a;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class AESEncrypt {
    private static final String ALGORITHM = "AES";
    private static final String IV_CONNECT = "%IV1%";
    private static final int KEY_BYTE_SIZE = 256;
    public static final String SDK_APP_SECRET = "isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=";
    private static final String TRANSFORMATION = "AES/CTR/NoPadding";

    public static String decrypt(String str, String str2) {
        String[] split = str2.split(IV_CONNECT);
        byte[] decode = Base64.decode(split[0], 0);
        byte[] decode2 = Base64.decode(split[1], 0);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 0), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(2, secretKeySpec, new IvParameterSpec(decode2));
        return new String(cipher.doFinal(decode));
    }

    public static String encrypt(String str) {
        try {
            return encrypt(SDK_APP_SECRET, str);
        } catch (Exception e2) {
            e.b(e2.getLocalizedMessage());
            return "";
        }
    }

    public static String encrypt(String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 0), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, secretKeySpec);
        return a.t(Base64.encodeToString(cipher.doFinal(str2.getBytes()), 2), IV_CONNECT, Base64.encodeToString(cipher.getIV(), 2));
    }

    public static String genKey() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(256);
        return Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 2);
    }
}
