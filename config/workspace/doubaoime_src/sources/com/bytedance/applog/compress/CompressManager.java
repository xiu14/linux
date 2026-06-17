package com.bytedance.applog.compress;

import android.content.Context;
import com.bytedance.applog.w.e;
import com.bytedance.applog.w.k;
import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.compression.zstd.ZstdDictCompress;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CompressManager {
    public static final int TYPE_EMPTY = -1;
    public static final int TYPE_GZIP = 0;
    public static final int TYPE_ZSTD = 1;
    public static final int TYPE_ZSTD_DICT = 2;
    private static byte[] mDictionary;
    private final Context mContext;
    private final e mLogger;

    @Deprecated
    public CompressManager(Context context, String str, b bVar, e eVar) {
        this(context, eVar);
    }

    private int getEncodeType(int i) {
        if (i == 2 && mDictionary == null) {
            return 1;
        }
        return i;
    }

    @Deprecated
    public static void setReportStatsEnabled(boolean z) {
    }

    public static void setZstdDict(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        mDictionary = Arrays.copyOf(bArr, bArr.length);
    }

    public byte[] compress(byte[] bArr, int i, a aVar) {
        int encodeType = getEncodeType(i);
        if (encodeType == 0) {
            bArr = compressUsingGzip(bArr, aVar);
        } else if (encodeType == 1 || encodeType == 2) {
            bArr = compressUsingZstd(bArr, aVar, i);
        }
        return (bArr == null || bArr.length == 0) ? compressUsingGzip(bArr, aVar) : bArr;
    }

    public byte[] compressUsingGzip(byte[] bArr, a aVar) {
        aVar.a = bArr == null ? 0 : bArr.length;
        aVar.f3783c = 0;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] k = com.bytedance.android.input.k.b.a.k(bArr);
        long currentTimeMillis2 = System.currentTimeMillis();
        aVar.f3785e = 0;
        aVar.f3784d = currentTimeMillis2 - currentTimeMillis;
        aVar.b = k.length;
        return k;
    }

    public byte[] compressUsingZstd(byte[] bArr, a aVar, int i) {
        aVar.a = bArr.length;
        aVar.f3783c = i;
        byte[] bArr2 = null;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            bArr2 = (i != 2 || mDictionary == null) ? ZstdCompress.compress(bArr, 15) : ZstdCompress.compress(bArr, new ZstdDictCompress(mDictionary, 15));
            aVar.f3784d = System.currentTimeMillis() - currentTimeMillis;
            aVar.b = bArr2.length;
            aVar.f3785e = 0;
            return bArr2;
        } catch (Throwable th) {
            this.mLogger.u(14, "compress with zstd failed", th, new Object[0]);
            aVar.f3785e = 1;
            return bArr2;
        }
    }

    public CompressManager(Context context, e eVar) {
        this.mContext = context;
        this.mLogger = eVar == null ? k.z() : eVar;
    }
}
