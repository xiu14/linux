package com.huawei.e.a.a.a.b;

import com.huawei.e.a.a.a.d.d;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes2.dex */
public abstract class a {
    public static byte[] a(char[] cArr, byte[] bArr, int i, int i2, boolean z) {
        try {
            return (z ? SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")).generateSecret(new PBEKeySpec(cArr, bArr, i, i2)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            StringBuilder M = e.a.a.a.a.M("pbkdf exception : ");
            M.append(e2.getMessage());
            d.a("PBKDF2", M.toString());
            return new byte[0];
        }
    }
}
