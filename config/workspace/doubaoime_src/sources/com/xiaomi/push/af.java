package com.xiaomi.push;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public class af {
    public static boolean a(Context context, String str, long j) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock = null;
        try {
            File file = new File(context.getFilesDir(), "/.vdevdir/");
            if (!x.m849a(file)) {
                y.a((Closeable) null);
                return true;
            }
            File file2 = new File(file, "lcfp.lock");
            y.m850a(file2);
            randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    boolean b = b(context, str, j);
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    y.a(randomAccessFile);
                    return b;
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    y.a(randomAccessFile);
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException unused3) {
                    }
                }
                y.a(randomAccessFile);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (fileLock != null) {
                fileLock.release();
            }
            y.a(randomAccessFile);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2 A[Catch: all -> 0x00e2, IOException -> 0x00e4, LOOP:0: B:15:0x00cc->B:17:0x00d2, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:14:0x00c8, B:15:0x00cc, B:17:0x00d2, B:23:0x00eb), top: B:11:0x00be }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [long] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(android.content.Context r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.af.b(android.content.Context, java.lang.String, long):boolean");
    }
}
