package com.huawei.e.a.a.a.d;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* loaded from: classes2.dex */
public class b {
    private static boolean a = true;

    private static SecureRandom a() {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            d.a("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
            secureRandom = null;
        }
        if (secureRandom == null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                d.a("EncryptUtil", "NoSuchAlgorithmException");
                return secureRandom;
            } catch (Throwable unused3) {
                return secureRandom;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        return new SP800SecureRandomBuilder(secureRandom, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
    }

    public static SecureRandom b() {
        if (a) {
            return a();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            d.a("EncryptUtil", "genSecureRandom: NoSuchAlgorithmException");
            return null;
        }
    }

    public static byte[] c(int i) {
        if (a) {
            SecureRandom a2 = a();
            if (a2 == null) {
                return new byte[0];
            }
            try {
                byte[] bArr = new byte[i];
                a2.nextBytes(bArr);
                return bArr;
            } catch (NullPointerException e2) {
                StringBuilder M = e.a.a.a.a.M("secureRandom nextBytes error is : ");
                M.append(e2.getMessage());
                d.a("EncryptUtil", M.toString());
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[i];
        SecureRandom secureRandom = null;
        try {
            secureRandom = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            d.a("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (secureRandom == null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                d.a("EncryptUtil", "getSecureRandomBytes getInstance: NoSuchAlgorithmException");
                return new byte[0];
            } catch (Exception e3) {
                StringBuilder M2 = e.a.a.a.a.M("getSecureRandomBytes getInstance: exception : ");
                M2.append(e3.getMessage());
                d.a("EncryptUtil", M2.toString());
                return new byte[0];
            }
        }
        secureRandom.nextBytes(bArr2);
        return bArr2;
    }

    public static String d(int i) {
        return com.bytedance.feedbackerlib.a.f(c(i));
    }

    public static void e(boolean z) {
        d.b("EncryptUtil", "setBouncycastleFlag: " + z);
        a = z;
    }
}
