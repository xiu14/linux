package com.bytedance.feedbackerlib.util;

import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class e {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @Nullable
    public static String a(@NonNull InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            if (length + 0 > digest.length) {
                throw new IndexOutOfBoundsException();
            }
            int i = length * 2;
            char[] cArr = new char[i];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = digest[0 + i3] & 255;
                int i5 = i2 + 1;
                char[] cArr2 = a;
                cArr[i2] = cArr2[i4 >> 4];
                i2 = i5 + 1;
                cArr[i5] = cArr2[i4 & 15];
            }
            return String.valueOf(cArr, 0, i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static String b(@NonNull Signature signature) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(signature.toByteArray());
            if (digest == null) {
                return null;
            }
            int length = (digest.length * 3) - 1;
            char[] cArr = new char[length];
            int i = 0;
            for (byte b : digest) {
                int i2 = b & 255;
                int i3 = i + 1;
                char[] cArr2 = a;
                cArr[i] = cArr2[i2 >> 4];
                i = i3 + 1;
                cArr[i3] = cArr2[i2 & 15];
                if (i < length) {
                    cArr[i] = ':';
                    i++;
                }
            }
            return String.valueOf(cArr, 0, length);
        } catch (NoSuchAlgorithmException e2) {
            com.bytedance.feedbackerlib.a.s("MD5Utils", "get MessageDigest instance failed!", e2);
            return null;
        }
    }
}
