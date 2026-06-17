package com.bytedance.retrofit2.mime;

import java.io.InputStream;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class b {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return cArr;
    }

    public static String b(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            int read = inputStream.read(bArr, 0, 1024);
            while (read > -1) {
                messageDigest.update(bArr, 0, read);
                read = inputStream.read(bArr, 0, 1024);
            }
            return new String(a(messageDigest.digest()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(byte[] bArr) {
        try {
            return new String(a(MessageDigest.getInstance("MD5").digest(bArr)));
        } catch (Throwable unused) {
            return null;
        }
    }
}
