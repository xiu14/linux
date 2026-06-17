package com.huawei.e.a.a.b.f;

import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c {
    private static final Pattern a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final String[] b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", DBDefinition.SEGMENT_INFO, "lg", "ne", "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144 A[EDGE_INSN: B:74:0x0144->B:75:0x0144 BREAK  A[LOOP:2: B:43:0x00b1->B:80:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[LOOP:2: B:43:0x00b1->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r9, java.security.cert.X509Certificate r10, boolean r11) throws javax.net.ssl.SSLException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.e.a.a.b.f.c.a(java.lang.String, java.security.cert.X509Certificate, boolean):void");
    }

    public static int b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }
}
