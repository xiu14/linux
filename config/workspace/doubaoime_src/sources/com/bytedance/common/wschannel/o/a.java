package com.bytedance.common.wschannel.o;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes.dex */
public class a {
    private static String a;

    public static String a(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder("");
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = e.a.a.a.a.s("0", hexString);
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString().toUpperCase().trim();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.o.a.b(android.content.Context):java.lang.String");
    }

    public static boolean c(Context context) {
        String b = b(context);
        return (b == null || !b.contains(Constants.COLON_SEPARATOR)) && b != null && b.equals(context.getPackageName());
    }
}
