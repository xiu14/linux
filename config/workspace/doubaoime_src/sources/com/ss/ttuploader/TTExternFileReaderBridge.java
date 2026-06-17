package com.ss.ttuploader;

import android.util.Log;

/* loaded from: classes2.dex */
public class TTExternFileReaderBridge {
    void cancel(Object obj) {
        Log.e("ttmn", "try to cancel");
        if (obj == null) {
            Log.e("ttmn", "try to cancel end fail");
        } else {
            ((TTExternFileReader) obj).cancel();
            Log.e("ttmn", "try to cancel end");
        }
    }

    long getCrc32ByOffset(Object obj, long j, int i) {
        Log.e("ttmn", "try to read end");
        if (obj == null) {
            Log.e("ttmn", "try to read end fail");
            return 0L;
        }
        long crc32ByOffset = ((TTExternFileReader) obj).getCrc32ByOffset(j, i);
        Log.e("ttmn", "try to read end");
        return crc32ByOffset;
    }

    long getValue(Object obj, int i) {
        Log.e("ttmn", "try to get value");
        if (obj == null) {
            Log.e("ttmn", "try to get value fail");
            return -1L;
        }
        long value = ((TTExternFileReader) obj).getValue(i);
        Log.e("ttmn", "try to get value end");
        return value;
    }

    int readSlice(Object obj, int i, byte[] bArr, int i2) {
        Log.e("ttmn", "try to read end");
        if (obj == null || bArr == null || i2 == 0) {
            Log.e("ttmn", "try to read end fail");
            return 0;
        }
        int readSlice = ((TTExternFileReader) obj).readSlice(i, bArr, i2);
        Log.e("ttmn", "try to read end");
        return readSlice;
    }

    int readSliceByOffset(Object obj, long j, byte[] bArr, int i, int i2) {
        Log.e("ttmn", "try to read end");
        if (obj == null || bArr == null || i == 0) {
            Log.e("ttmn", "try to read end fail");
            return 0;
        }
        int readSliceByOffset = ((TTExternFileReader) obj).readSliceByOffset(j, bArr, i, i2);
        Log.e("ttmn", "try to read end");
        return readSliceByOffset;
    }
}
