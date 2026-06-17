package com.huawei.hianalytics.f.g;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public class f {

    public static class a extends Exception {
        public a() {
            super("Fail to encrypt with RSA");
        }
    }

    public static String a(String str, String str2) {
        try {
            try {
                return e.a(c(str, str2.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException unused) {
                com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt(): Unsupported Encoding - utf-8!");
                throw new a();
            }
        } catch (a unused2) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt(): Fail to encrypt with RSA!");
            return "";
        }
    }

    private static PublicKey b(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(e.a(str)));
    }

    private static byte[] c(String str, byte[] bArr) {
        try {
            PublicKey b = b(str);
            if (b == null) {
                throw new UnsupportedEncodingException();
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");
            cipher.init(1, b);
            return cipher.doFinal(bArr);
        } catch (UnsupportedEncodingException unused) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt(): getBytes - Unsupported coding format!");
            throw new a();
        } catch (InvalidKeyException unused2) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt(): init - Invalid key!");
            throw new a();
        } catch (NoSuchAlgorithmException unused3) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt(): getInstance - No such algorithm,transformation");
            throw new a();
        } catch (InvalidKeySpecException unused4) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt(): Invalid key specification");
            throw new a();
        } catch (BadPaddingException unused5) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt():False filling parameters!");
            throw new a();
        } catch (IllegalBlockSizeException unused6) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt(): doFinal - The provided block is not filled with");
            throw new a();
        } catch (NoSuchPaddingException unused7) {
            com.huawei.hianalytics.g.b.c("RsaCryPter", "rsaEncrypt():  No such filling parameters ");
            throw new a();
        }
    }
}
