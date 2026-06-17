package com.ss.ttuploader;

import android.util.Log;

/* loaded from: classes2.dex */
public class TTMediaDataReaderBridge {
    private static final String TAG = "ttmn";

    int close(Object obj, int i) {
        if (obj != null && i >= 0) {
            return ((TTMediaDataReader) obj).close(i);
        }
        Log.e(TAG, "try to close fail");
        return 0;
    }

    long getValue(Object obj, int i, int i2) {
        if (obj != null) {
            return ((TTMediaDataReader) obj).getValue(i, i2);
        }
        Log.e(TAG, "try to get value fail");
        return -1L;
    }

    int open(Object obj, int i) {
        if (obj != null) {
            return ((TTMediaDataReader) obj).open(i);
        }
        Log.e(TAG, "try to open failed");
        return 0;
    }

    int read(Object obj, int i, long j, byte[] bArr, int i2) {
        if (obj != null && bArr != null && i2 != 0) {
            return ((TTMediaDataReader) obj).read(i, j, bArr, i2);
        }
        Log.e(TAG, "try to read end fail");
        return 0;
    }
}
