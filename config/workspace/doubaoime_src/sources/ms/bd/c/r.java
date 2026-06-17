package ms.bd.c;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class r {
    public static final String a = (String) y2.a(16777217, 0, 0, "197e91", new byte[]{1, 25, 103, 53, 35, 0, 21, 48, 79, 31, 11, 23, 105, 63, 41, 22, 3, 42, 85, 1, 21, 13, 115, 41, 63, 28, 51, 26, 101, 49, 37, 61, 67, 25, 15, 44, 57, 20, 107, 59, 47, 43, 85, 3, 21, 50, 39, 14, 113, 45, 57, 33, 20, 64, 84, 117, 102, 77, 48, 98, 120, 98, 15, 94});
    public static final String b = (String) y2.a(16777217, 0, 0, "db440d", new byte[]{40});

    public static String a(String str) {
        return (str == null || str.length() <= 0) ? str : str.replaceAll((String) y2.a(16777217, 0, 0L, "236dea", new byte[]{31, 122}), (String) y2.a(16777217, 0, 0L, "92cbf0", new byte[]{101})).replaceAll((String) y2.a(16777217, 0, 0L, "6a44ff", new byte[]{104}), (String) y2.a(16777217, 0, 0L, "b1f96b", new byte[]{76})).replaceAll(b, "");
    }

    public static byte[] b(String str) {
        try {
            int length = (str.length() * 3) / 4;
            byte[] bArr = new byte[length];
            int length2 = str.length();
            String str2 = "";
            for (int i = 0; i < 2; i++) {
                if (str.charAt((length2 - 1) - i) == b.charAt(0)) {
                    str2 = str2 + a.charAt(0);
                }
            }
            String str3 = str.substring(0, length2 - str2.length()) + str2;
            int i2 = 0;
            int i3 = 0;
            while (i2 < str3.length()) {
                String str4 = a;
                int indexOf = str4.indexOf(str3.charAt(i2));
                int indexOf2 = str4.indexOf(str3.charAt(i2 + 1));
                int indexOf3 = str4.indexOf(str3.charAt(i2 + 2));
                int indexOf4 = str4.indexOf(str3.charAt(i2 + 3));
                bArr[i3] = (byte) (((indexOf << 2) | (indexOf2 >> 4)) & 255);
                bArr[i3 + 1] = (byte) (((indexOf2 << 4) | (indexOf3 >> 2)) & 255);
                bArr[i3 + 2] = (byte) ((indexOf4 | (indexOf3 << 6)) & 255);
                i2 += 4;
                i3 += 3;
            }
            return Arrays.copyOfRange(bArr, 0, length - str2.length());
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
