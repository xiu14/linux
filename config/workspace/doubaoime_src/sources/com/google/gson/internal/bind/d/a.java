package com.google.gson.internal.bind.d;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public class a {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5 A[Catch: IllegalArgumentException -> 0x01d4, NumberFormatException -> 0x01d6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:18:0x0054, B:20:0x0064, B:21:0x0066, B:23:0x0072, B:24:0x0074, B:26:0x007a, B:30:0x0084, B:35:0x0094, B:37:0x009c, B:38:0x00a0, B:40:0x00a6, B:44:0x00b3, B:47:0x00ba, B:52:0x00df, B:54:0x00e5, B:56:0x00ec, B:57:0x019b, B:63:0x00f8, B:64:0x0113, B:65:0x0114, B:68:0x0130, B:70:0x013d, B:73:0x0146, B:75:0x0165, B:78:0x0174, B:79:0x0196, B:81:0x0199, B:82:0x011f, B:83:0x01cc, B:84:0x01d3, B:85:0x00ca, B:86:0x00cd, B:89:0x00b6), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc A[Catch: IllegalArgumentException -> 0x01d4, NumberFormatException -> 0x01d6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:18:0x0054, B:20:0x0064, B:21:0x0066, B:23:0x0072, B:24:0x0074, B:26:0x007a, B:30:0x0084, B:35:0x0094, B:37:0x009c, B:38:0x00a0, B:40:0x00a6, B:44:0x00b3, B:47:0x00ba, B:52:0x00df, B:54:0x00e5, B:56:0x00ec, B:57:0x019b, B:63:0x00f8, B:64:0x0113, B:65:0x0114, B:68:0x0130, B:70:0x013d, B:73:0x0146, B:75:0x0165, B:78:0x0174, B:79:0x0196, B:81:0x0199, B:82:0x011f, B:83:0x01cc, B:84:0x01d3, B:85:0x00ca, B:86:0x00cd, B:89:0x00b6), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.d.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int c(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                StringBuilder M = e.a.a.a.a.M("Invalid number: ");
                M.append(str.substring(i, i2));
                throw new NumberFormatException(M.toString());
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                StringBuilder M2 = e.a.a.a.a.M("Invalid number: ");
                M2.append(str.substring(i, i2));
                throw new NumberFormatException(M2.toString());
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
