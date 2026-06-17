package com.huawei.b.g.e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class j {
    private static String a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            Log.w("ResourcesUtils", "resName is empty");
            return null;
        }
        int identifier = context.getResources().getIdentifier(str2, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            Log.w("ResourcesUtils", "resId == 0");
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException e2) {
            StringBuilder M = e.a.a.a.a.M("resources not fund");
            M.append(e2.getMessage());
            Log.e("ResourcesUtils", M.toString());
            return null;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        try {
            return a(context, str, str2 + a.b(MessageDigest.getInstance("SHA-256").digest(str3.getBytes("utf-8"))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            StringBuilder M = e.a.a.a.a.M("getResources exception:");
            M.append(e2.getMessage());
            Log.e("ResourcesUtils", M.toString());
            return null;
        }
    }

    public static SecretKey c(d dVar) throws NoSuchAlgorithmException, InvalidKeySpecException {
        if (dVar == null || !dVar.a()) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        StringBuilder M = e.a.a.a.a.M("build aes key, iterationCount:");
        M.append(dVar.g());
        Log.d("AGC_Keys", M.toString());
        byte[] a = a.a(dVar.b());
        byte[] a2 = a.a(dVar.c());
        byte[] a3 = a.a(dVar.d());
        e(a, -4);
        byte[] f2 = f(a, a2);
        e(f2, 6);
        SecretKey generateSecret = SecretKeyFactory.getInstance(dVar.f()).generateSecret(new PBEKeySpec(a.b(f(f2, a3)).toCharArray(), a.a(dVar.e()), dVar.g(), dVar.h() * 8));
        Log.d("AGC_Keys", "build aes key end");
        return new SecretKeySpec(generateSecret.getEncoded(), "AES");
    }

    static byte[] d(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKey, new IvParameterSpec(copyOfRange));
        return cipher.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
    }

    private static byte[] e(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "bytes must not be null.");
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
        return bArr;
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }
}
