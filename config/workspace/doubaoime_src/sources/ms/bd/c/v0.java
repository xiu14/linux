package ms.bd.c;

import java.io.BufferedInputStream;

/* loaded from: classes2.dex */
public abstract class v0 {
    public static final String a;

    static {
        a = (String) y2.a(16777217, 0, 0L, "9bcaa8", new byte[]{37, 101, 30, 17});
    }

    public static String a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                }
            } catch (Exception unused) {
            }
        } while (read >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        if (r5 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.v0.b(java.lang.String):java.lang.String");
    }
}
