package com.monitor.cloudmessage.utils;

import android.os.Environment;
import android.os.StatFs;
import com.bytedance.apm.g;
import com.bytedance.apm.util.f;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.File;

/* loaded from: classes2.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r4 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] a() {
        /*
            java.lang.String r0 = "\\s+"
            java.lang.String r1 = "/proc/cpuinfo"
            java.lang.String r2 = ""
            java.lang.String[] r2 = new java.lang.String[]{r2, r2}
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L7b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L7b
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L7c
            r5 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L7c
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r5 = 2
            r6 = r5
        L21:
            int r7 = r3.length     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            if (r6 >= r7) goto L42
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r7.<init>()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r8 = 0
            r9 = r2[r8]     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r7.append(r9)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r9 = r3[r6]     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r7.append(r9)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r9 = " "
            r7.append(r9)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r2[r8] = r7     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            int r6 = r6 + 1
            goto L21
        L42:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r3.<init>()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r6 = 1
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r3.append(r7)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r3.append(r0)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r2[r6] = r0     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r1.close()     // Catch: java.lang.Throwable -> L63
        L63:
            r4.close()     // Catch: java.lang.Throwable -> L84
            goto L84
        L67:
            r0 = move-exception
            r3 = r1
            goto L70
        L6a:
            r3 = r1
            goto L7c
        L6c:
            r0 = move-exception
            goto L70
        L6e:
            r0 = move-exception
            r4 = r3
        L70:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.lang.Throwable -> L75
        L75:
            if (r4 == 0) goto L7a
            r4.close()     // Catch: java.lang.Throwable -> L7a
        L7a:
            throw r0
        L7b:
            r4 = r3
        L7c:
            if (r3 == 0) goto L81
            r3.close()     // Catch: java.lang.Throwable -> L81
        L81:
            if (r4 == 0) goto L84
            goto L63
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.utils.b.a():java.lang.String[]");
    }

    public static long[] b() {
        File c2;
        long[] jArr = new long[2];
        if (!"mounted".equals(Environment.getExternalStorageState()) || (c2 = f.c(g.h())) == null) {
            return jArr;
        }
        StatFs statFs = new StatFs(c2.getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = statFs.getBlockCount();
        long availableBlocks = statFs.getAvailableBlocks();
        jArr[0] = ((blockCount * blockSize) / DownloadConstants.KB) / DownloadConstants.KB;
        jArr[1] = ((blockSize * availableBlocks) / DownloadConstants.KB) / DownloadConstants.KB;
        return jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r4 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] c() {
        /*
            java.lang.String r0 = "null"
            java.lang.String[] r0 = new java.lang.String[]{r0, r0, r0, r0}
            java.lang.String r1 = "/proc/version"
            r2 = 2
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L40
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L40
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L41
            r5 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L41
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r5 = 0
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r0[r5] = r3     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r1.close()     // Catch: java.lang.Throwable -> L28
        L28:
            r4.close()     // Catch: java.lang.Throwable -> L49
            goto L49
        L2c:
            r0 = move-exception
            r3 = r1
            goto L35
        L2f:
            r3 = r1
            goto L41
        L31:
            r0 = move-exception
            goto L35
        L33:
            r0 = move-exception
            r4 = r3
        L35:
            if (r3 == 0) goto L3a
            r3.close()     // Catch: java.lang.Throwable -> L3a
        L3a:
            if (r4 == 0) goto L3f
            r4.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            throw r0
        L40:
            r4 = r3
        L41:
            if (r3 == 0) goto L46
            r3.close()     // Catch: java.lang.Throwable -> L46
        L46:
            if (r4 == 0) goto L49
            goto L28
        L49:
            r1 = 1
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r0[r1] = r3
            java.lang.String r1 = android.os.Build.MODEL
            r0[r2] = r1
            r1 = 3
            java.lang.String r2 = android.os.Build.DISPLAY
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.utils.b.c():java.lang.String[]");
    }
}
