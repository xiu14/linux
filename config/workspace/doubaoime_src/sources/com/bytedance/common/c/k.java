package com.bytedance.common.c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class k {
    public static void a(byte[] bArr, int i) throws IOException {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r5 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        r11[0] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(boolean r8, int r9, java.io.InputStream r10, int[] r11) throws java.io.IOException {
        /*
            java.lang.String r0 = "ungzip got exception "
            java.lang.String r1 = "NetworkUtils"
            if (r9 > 0) goto L8
            r9 = 5242880(0x500000, float:7.34684E-39)
        L8:
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r9 >= r2) goto Ld
            r9 = r2
        Ld:
            r2 = 0
            if (r8 == 0) goto L16
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L91
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L91
            r10 = r3
        L16:
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L91
            r4 = 0
            r5 = r4
        L1c:
            int r6 = r5 + 4096
            int r7 = r3.length     // Catch: java.io.IOException -> L40 java.io.EOFException -> L6d java.lang.Throwable -> L91
            if (r6 <= r7) goto L2a
            int r6 = r3.length     // Catch: java.io.IOException -> L40 java.io.EOFException -> L6d java.lang.Throwable -> L91
            int r6 = r6 * 2
            byte[] r6 = new byte[r6]     // Catch: java.io.IOException -> L40 java.io.EOFException -> L6d java.lang.Throwable -> L91
            java.lang.System.arraycopy(r3, r4, r6, r4, r5)     // Catch: java.io.IOException -> L40 java.io.EOFException -> L6d java.lang.Throwable -> L91
            r3 = r6
        L2a:
            r6 = 4096(0x1000, float:5.74E-42)
            int r6 = r10.read(r3, r5, r6)     // Catch: java.io.IOException -> L40 java.io.EOFException -> L6d java.lang.Throwable -> L91
            if (r6 <= 0) goto L84
            int r5 = r5 + r6
            if (r9 <= 0) goto L1c
            if (r5 <= r9) goto L1c
            java.lang.String r9 = "entity length did exceed given maxLength"
            com.bytedance.push.g0.f.c(r1, r9)     // Catch: java.io.IOException -> L40 java.io.EOFException -> L6d java.lang.Throwable -> L91
            d(r10)
            return r2
        L40:
            r9 = move-exception
            java.lang.String r6 = r9.getMessage()     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L6c
            if (r5 <= 0) goto L6c
            java.lang.String r8 = "CRC mismatch"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Throwable -> L91
            if (r8 != 0) goto L59
            java.lang.String r8 = "Size mismatch"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L6c
        L59:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r8.<init>()     // Catch: java.lang.Throwable -> L91
            r8.append(r0)     // Catch: java.lang.Throwable -> L91
            r8.append(r9)     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L91
            com.bytedance.push.g0.f.c(r1, r8)     // Catch: java.lang.Throwable -> L91
            goto L84
        L6c:
            throw r9     // Catch: java.lang.Throwable -> L91
        L6d:
            r9 = move-exception
            if (r8 == 0) goto L90
            if (r5 <= 0) goto L90
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r8.<init>()     // Catch: java.lang.Throwable -> L91
            r8.append(r0)     // Catch: java.lang.Throwable -> L91
            r8.append(r9)     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L91
            com.bytedance.push.g0.f.c(r1, r8)     // Catch: java.lang.Throwable -> L91
        L84:
            if (r5 <= 0) goto L8c
            r11[r4] = r5     // Catch: java.lang.Throwable -> L91
            d(r10)
            return r3
        L8c:
            d(r10)
            return r2
        L90:
            throw r9     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            d(r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.c.k.b(boolean, int, java.io.InputStream, int[]):byte[]");
    }

    public static byte[] c(boolean z, int i, InputStream inputStream, int[] iArr, j jVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] b = b(z, i, inputStream, iArr);
            if (b == null || iArr[0] <= 0) {
                return null;
            }
            return b;
        } catch (Exception e2) {
            try {
                jVar.a();
            } catch (Throwable unused) {
            }
            throw e2;
        }
    }

    public static void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("application/octet-stream");
        if (indexOf >= 0) {
            indexOf = str.indexOf("ssmix=", indexOf + 24);
        }
        return indexOf > 0;
    }
}
