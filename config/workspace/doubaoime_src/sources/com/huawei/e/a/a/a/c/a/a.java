package com.huawei.e.a.a.a.c.a;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.huawei.e.a.a.a.d.d;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes2.dex */
public class a {
    private static Map<String, SecretKey> a = new ConcurrentHashMap();

    private static SecretKey a(String str, Boolean bool) throws b {
        d.b("GCMKS", "load key");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            if (!bool.booleanValue()) {
                return null;
            }
            d.b("GCMKS", "generate key");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
            return keyGenerator.generateKey();
        } catch (IOException e2) {
            StringBuilder M = e.a.a.a.a.M("IOException : ");
            M.append(e2.getMessage());
            d.a("GCMKS", M.toString());
            StringBuilder M2 = e.a.a.a.a.M("IOException : ");
            M2.append(e2.getMessage());
            throw new b(M2.toString());
        } catch (InvalidAlgorithmParameterException e3) {
            StringBuilder M3 = e.a.a.a.a.M("InvalidAlgorithmParameterException : ");
            M3.append(e3.getMessage());
            d.a("GCMKS", M3.toString());
            StringBuilder M4 = e.a.a.a.a.M("InvalidAlgorithmParameterException : ");
            M4.append(e3.getMessage());
            throw new b(M4.toString());
        } catch (KeyStoreException e4) {
            StringBuilder M5 = e.a.a.a.a.M("KeyStoreException : ");
            M5.append(e4.getMessage());
            d.a("GCMKS", M5.toString());
            StringBuilder M6 = e.a.a.a.a.M("KeyStoreException : ");
            M6.append(e4.getMessage());
            throw new b(M6.toString());
        } catch (NoSuchAlgorithmException e5) {
            StringBuilder M7 = e.a.a.a.a.M("NoSuchAlgorithmException : ");
            M7.append(e5.getMessage());
            d.a("GCMKS", M7.toString());
            StringBuilder M8 = e.a.a.a.a.M("NoSuchAlgorithmException : ");
            M8.append(e5.getMessage());
            throw new b(M8.toString());
        } catch (NoSuchProviderException e6) {
            StringBuilder M9 = e.a.a.a.a.M("NoSuchProviderException : ");
            M9.append(e6.getMessage());
            d.a("GCMKS", M9.toString());
            StringBuilder M10 = e.a.a.a.a.M("NoSuchProviderException : ");
            M10.append(e6.getMessage());
            throw new b(M10.toString());
        } catch (UnrecoverableKeyException e7) {
            StringBuilder M11 = e.a.a.a.a.M("UnrecoverableKeyException : ");
            M11.append(e7.getMessage());
            d.a("GCMKS", M11.toString());
            StringBuilder M12 = e.a.a.a.a.M("UnrecoverableKeyException : ");
            M12.append(e7.getMessage());
            throw new b(M12.toString());
        } catch (CertificateException e8) {
            StringBuilder M13 = e.a.a.a.a.M("CertificateException : ");
            M13.append(e8.getMessage());
            d.a("GCMKS", M13.toString());
            StringBuilder M14 = e.a.a.a.a.M("CertificateException : ");
            M14.append(e8.getMessage());
            throw new b(M14.toString());
        } catch (Exception e9) {
            StringBuilder M15 = e.a.a.a.a.M("Exception: ");
            M15.append(e9.getMessage());
            d.a("GCMKS", M15.toString());
            StringBuilder M16 = e.a.a.a.a.M("Exception : ");
            M16.append(e9.getMessage());
            throw new b(M16.toString());
        }
    }

    private static byte[] b(SecretKey secretKey, byte[] bArr) throws b {
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, copyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e2) {
            StringBuilder M = e.a.a.a.a.M("InvalidAlgorithmParameterException : ");
            M.append(e2.getMessage());
            d.a("GCMKS", M.toString());
            StringBuilder M2 = e.a.a.a.a.M("InvalidAlgorithmParameterException : ");
            M2.append(e2.getMessage());
            throw new b(M2.toString());
        } catch (InvalidKeyException e3) {
            StringBuilder M3 = e.a.a.a.a.M("InvalidKeyException : ");
            M3.append(e3.getMessage());
            d.a("GCMKS", M3.toString());
            StringBuilder M4 = e.a.a.a.a.M("InvalidKeyException : ");
            M4.append(e3.getMessage());
            throw new b(M4.toString());
        } catch (NoSuchAlgorithmException e4) {
            StringBuilder M5 = e.a.a.a.a.M("NoSuchAlgorithmException : ");
            M5.append(e4.getMessage());
            d.a("GCMKS", M5.toString());
            StringBuilder M6 = e.a.a.a.a.M("NoSuchAlgorithmException : ");
            M6.append(e4.getMessage());
            throw new b(M6.toString());
        } catch (BadPaddingException e5) {
            StringBuilder M7 = e.a.a.a.a.M("BadPaddingException : ");
            M7.append(e5.getMessage());
            d.a("GCMKS", M7.toString());
            StringBuilder M8 = e.a.a.a.a.M("BadPaddingException : ");
            M8.append(e5.getMessage());
            throw new b(M8.toString());
        } catch (IllegalBlockSizeException e6) {
            StringBuilder M9 = e.a.a.a.a.M("IllegalBlockSizeException : ");
            M9.append(e6.getMessage());
            d.a("GCMKS", M9.toString());
            StringBuilder M10 = e.a.a.a.a.M("IllegalBlockSizeException : ");
            M10.append(e6.getMessage());
            throw new b(M10.toString());
        } catch (NoSuchPaddingException e7) {
            StringBuilder M11 = e.a.a.a.a.M("NoSuchPaddingException : ");
            M11.append(e7.getMessage());
            d.a("GCMKS", M11.toString());
            StringBuilder M12 = e.a.a.a.a.M("NoSuchPaddingException : ");
            M12.append(e7.getMessage());
            throw new b(M12.toString());
        } catch (Exception e8) {
            StringBuilder M13 = e.a.a.a.a.M("Exception: ");
            M13.append(e8.getMessage());
            d.a("GCMKS", M13.toString());
            StringBuilder M14 = e.a.a.a.a.M("Exception: ");
            M14.append(e8.getMessage());
            throw new b(M14.toString());
        }
    }

    private static SecretKey c(String str, Boolean bool) throws b {
        if (TextUtils.isEmpty(str)) {
            throw new b("alias is null");
        }
        if (a.get(str) == null) {
            synchronized (a.class) {
                if (a.get(str) == null) {
                    SecretKey a2 = a(str, bool);
                    if (a2 == null) {
                        throw new b("AES GCM is decrypt,but alias is null");
                    }
                    a.put(str, a2);
                }
            }
        }
        return a.get(str);
    }

    private static byte[] d(SecretKey secretKey, byte[] bArr) throws b {
        byte[] bArr2 = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                return copyOf;
            }
            d.a("GCMKS", "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e2) {
            StringBuilder M = e.a.a.a.a.M("InvalidKeyException : ");
            M.append(e2.getMessage());
            d.a("GCMKS", M.toString());
            StringBuilder M2 = e.a.a.a.a.M("InvalidKeyException : ");
            M2.append(e2.getMessage());
            throw new b(M2.toString());
        } catch (NoSuchAlgorithmException e3) {
            StringBuilder M3 = e.a.a.a.a.M("NoSuchAlgorithmException : ");
            M3.append(e3.getMessage());
            d.a("GCMKS", M3.toString());
            StringBuilder M4 = e.a.a.a.a.M("NoSuchAlgorithmException : ");
            M4.append(e3.getMessage());
            throw new b(M4.toString());
        } catch (BadPaddingException e4) {
            StringBuilder M5 = e.a.a.a.a.M("BadPaddingException : ");
            M5.append(e4.getMessage());
            d.a("GCMKS", M5.toString());
            StringBuilder M6 = e.a.a.a.a.M("BadPaddingException : ");
            M6.append(e4.getMessage());
            throw new b(M6.toString());
        } catch (IllegalBlockSizeException e5) {
            StringBuilder M7 = e.a.a.a.a.M("IllegalBlockSizeException : ");
            M7.append(e5.getMessage());
            d.a("GCMKS", M7.toString());
            StringBuilder M8 = e.a.a.a.a.M("IllegalBlockSizeException : ");
            M8.append(e5.getMessage());
            throw new b(M8.toString());
        } catch (NoSuchPaddingException e6) {
            StringBuilder M9 = e.a.a.a.a.M("NoSuchPaddingException : ");
            M9.append(e6.getMessage());
            d.a("GCMKS", M9.toString());
            StringBuilder M10 = e.a.a.a.a.M("NoSuchPaddingException : ");
            M10.append(e6.getMessage());
            throw new b(M10.toString());
        } catch (Exception e7) {
            StringBuilder M11 = e.a.a.a.a.M("Exception: ");
            M11.append(e7.getMessage());
            d.a("GCMKS", M11.toString());
            StringBuilder M12 = e.a.a.a.a.M("Exception : ");
            M12.append(e7.getMessage());
            throw new b(M12.toString());
        }
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            d.a("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(f(str, com.bytedance.feedbackerlib.a.Q(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            StringBuilder M = e.a.a.a.a.M("decrypt: UnsupportedEncodingException : ");
            M.append(e2.getMessage());
            d.a("GCMKS", M.toString());
            return "";
        }
    }

    public static byte[] f(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str)) {
            d.a("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        if (bArr.length <= 12) {
            d.a("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        }
        SecretKey secretKey = null;
        try {
            secretKey = c(str, Boolean.FALSE);
        } catch (b e2) {
            StringBuilder M = e.a.a.a.a.M("e : ");
            M.append(e2.getMessage());
            d.a("GCMKS", M.toString());
        }
        if (secretKey == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[0];
        if (bArr.length <= 12) {
            d.a("GCMKS", "Decrypt source data is invalid.");
            return bArr3;
        }
        try {
            return b(secretKey, bArr);
        } catch (b e3) {
            StringBuilder M2 = e.a.a.a.a.M("e : ");
            M2.append(e3.getMessage());
            d.a("GCMKS", M2.toString());
            return bArr3;
        }
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            d.a("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return com.bytedance.feedbackerlib.a.f(h(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e2) {
            StringBuilder M = e.a.a.a.a.M("encrypt: UnsupportedEncodingException : ");
            M.append(e2.getMessage());
            d.a("GCMKS", M.toString());
            return "";
        }
    }

    public static byte[] h(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            d.a("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        SecretKey secretKey = null;
        try {
            secretKey = c(str, Boolean.TRUE);
        } catch (b e2) {
            StringBuilder M = e.a.a.a.a.M("e : ");
            M.append(e2.getMessage());
            d.a("GCMKS", M.toString());
        }
        if (secretKey == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[0];
        try {
            return d(secretKey, bArr);
        } catch (b e3) {
            StringBuilder M2 = e.a.a.a.a.M("e : ");
            M2.append(e3.getMessage());
            d.a("GCMKS", M2.toString());
            return bArr3;
        }
    }
}
