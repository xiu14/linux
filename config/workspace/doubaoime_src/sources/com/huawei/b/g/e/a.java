package com.huawei.b.g.e;

/* loaded from: classes2.dex */
public class a {
    private static final char[] a = "0123456789ABCDEF".toCharArray();

    public static byte[] a(String str) {
        char[] charArray = str.toCharArray();
        if ((charArray.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[charArray.length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < charArray.length) {
            int digit = Character.digit(charArray[i], 16);
            if (digit == -1) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Illegal hexadecimal character at index ", i));
            }
            int i3 = i + 1;
            int digit2 = Character.digit(charArray[i3], 16);
            if (digit2 == -1) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Illegal hexadecimal character at index ", i3));
            }
            i = i3 + 1;
            bArr[i2] = (byte) (((digit << 4) | digit2) & 255);
            i2++;
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
