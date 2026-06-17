package com.bytedance.ug.sdk.pangolin.d;

import java.io.DataInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class a {
    static final byte[] a = {108, 116, 108, 111, 118, 101, 122, 104};

    private static boolean a(byte[] bArr) {
        if (bArr.length != a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0072, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.io.File r7) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65 java.io.IOException -> L6d java.io.FileNotFoundException -> L78 java.io.UnsupportedEncodingException -> L80
            java.lang.String r2 = "r"
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65 java.io.IOException -> L6d java.io.FileNotFoundException -> L78 java.io.UnsupportedEncodingException -> L80
            long r2 = r1.length()     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            byte[] r7 = com.bytedance.ug.sdk.pangolin.d.a.a     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            int r4 = r7.length     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            int r7 = r7.length     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            long r5 = (long) r7     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            long r2 = r2 - r5
            r1.seek(r2)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            r1.readFully(r4)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            boolean r7 = a(r4)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            java.lang.String r4 = ""
            if (r7 != 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L26
            goto L2a
        L26:
            r7 = move-exception
            r7.printStackTrace()
        L2a:
            return r4
        L2b:
            r5 = 2
            long r2 = r2 - r5
            r1.seek(r2)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            short r7 = c(r1)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            if (r7 > 0) goto L40
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L3f
        L3b:
            r7 = move-exception
            r7.printStackTrace()
        L3f:
            return r4
        L40:
            long r4 = (long) r7
            long r2 = r2 - r4
            r1.seek(r2)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            byte[] r7 = new byte[r7]     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            r1.readFully(r7)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            java.lang.String r3 = "UTF-8"
            r2.<init>(r7, r3)     // Catch: java.lang.Exception -> L5b java.io.IOException -> L5d java.io.FileNotFoundException -> L5f java.io.UnsupportedEncodingException -> L61 java.lang.Throwable -> L8d
            r1.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r7 = move-exception
            r7.printStackTrace()
        L59:
            r0 = r2
            goto L8c
        L5b:
            r7 = move-exception
            goto L67
        L5d:
            r7 = move-exception
            goto L6f
        L5f:
            r7 = move-exception
            goto L7a
        L61:
            r7 = move-exception
            goto L82
        L63:
            r7 = move-exception
            goto L8f
        L65:
            r7 = move-exception
            r1 = r0
        L67:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L8c
            goto L87
        L6d:
            r7 = move-exception
            r1 = r0
        L6f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L8c
        L74:
            r1.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L78:
            r7 = move-exception
            r1 = r0
        L7a:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L8c
            goto L87
        L80:
            r7 = move-exception
            r1 = r0
        L82:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L8c
        L87:
            goto L74
        L88:
            r7 = move-exception
            r7.printStackTrace()
        L8c:
            return r0
        L8d:
            r7 = move-exception
            r0 = r1
        L8f:
            if (r0 == 0) goto L99
            r0.close()     // Catch: java.io.IOException -> L95
            goto L99
        L95:
            r0 = move-exception
            r0.printStackTrace()
        L99:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ug.sdk.pangolin.d.a.b(java.io.File):java.lang.String");
    }

    private static short c(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }
}
