package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public class AndroidKeyStore {
    @CalledByNative
    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e2) {
                StringBuilder U = e.a.a.a.a.U("Exception while encrypting input with ", str, " and ");
                U.append(privateKey.getAlgorithm());
                U.append(" private key (");
                U.append(privateKey.getClass().getName());
                U.append("): ");
                U.append(e2);
                com.ttnet.org.chromium.base.d.a("AndroidKeyStore", U.toString(), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            com.ttnet.org.chromium.base.d.a("AndroidKeyStore", "Cipher " + str + " not supported: " + e3, new Object[0]);
            return null;
        }
    }

    @CalledByNative
    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    @CalledByNative
    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e2) {
            com.ttnet.org.chromium.base.d.a("AndroidKeyStore", "Exception while checking support for " + str + ": " + e2, new Object[0]);
            return false;
        }
    }

    @CalledByNative
    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e2) {
            com.ttnet.org.chromium.base.d.a("AndroidKeyStore", "Exception while checking support for " + str + ": " + e2, new Object[0]);
            return false;
        }
    }

    @CalledByNative
    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e2) {
                StringBuilder U = e.a.a.a.a.U("Exception while signing message with ", str, " and ");
                U.append(privateKey.getAlgorithm());
                U.append(" private key (");
                U.append(privateKey.getClass().getName());
                U.append("): ");
                U.append(e2);
                com.ttnet.org.chromium.base.d.a("AndroidKeyStore", U.toString(), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e3) {
            com.ttnet.org.chromium.base.d.a("AndroidKeyStore", "Signature algorithm " + str + " not supported: " + e3, new Object[0]);
            return null;
        }
    }
}
