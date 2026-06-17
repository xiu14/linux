package com.bytedance.compression.zstd;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class Zstd {
    static {
        com.bytedance.compression.zstd.f.a.a();
    }

    static native long errGeneric();

    static final byte[] extractArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        throw new IllegalArgumentException("provided ByteBuffer lacks array or has non-zero arrayOffset");
    }

    public static native long getErrorCode(long j);

    public static native String getErrorName(long j);

    public static long getFunAddressBySymbol(String str) {
        long[] funAddressesBySymbols = getFunAddressesBySymbols(new String[]{str});
        if (funAddressesBySymbols == null || funAddressesBySymbols.length != 1) {
            return 0L;
        }
        return funAddressesBySymbols[0];
    }

    public static native long[] getFunAddressesBySymbols(String[] strArr);

    public static native boolean isError(long j);
}
