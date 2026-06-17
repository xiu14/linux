package com.bytedance.tailor;

import android.os.Debug;
import androidx.annotation.Keep;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import e.a.a.a.a;
import java.io.IOException;
import java.io.RandomAccessFile;

@Keep
/* loaded from: classes2.dex */
public class Tailor {
    static {
        System.loadLibrary("tailor");
    }

    public static void cropHprofData(String str, String str2, boolean z) throws IOException {
        if (!isHprofValid(str)) {
            throw new IOException(a.s("Bad hprof file ", str));
        }
        nCropHprof(str, str2, z);
    }

    public static synchronized void dumpHprofData(String str, boolean z) throws IOException {
        synchronized (Tailor.class) {
            nOpenProxy(str, z);
            Debug.dumpHprofData(str);
            nCloseProxy();
        }
    }

    public static void dumpHprofDataAsync(String str, boolean z) {
        nDumpAsync(str, z);
    }

    static boolean isHprofValid(String str) {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, DownloadFileUtils.MODE_READ);
            try {
                randomAccessFile2.seek(randomAccessFile2.length() - 9);
                boolean z = randomAccessFile2.readByte() == 44;
                try {
                    randomAccessFile2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return z;
            } catch (IOException unused) {
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            th = th5;
        }
    }

    static native void nCloseProxy();

    static native void nCropHprof(String str, String str2, boolean z);

    static native void nDumpAsync(String str, boolean z);

    static native void nOpenProxy(String str, boolean z);
}
