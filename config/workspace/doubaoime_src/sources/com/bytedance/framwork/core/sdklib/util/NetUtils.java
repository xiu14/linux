package com.bytedance.framwork.core.sdklib.util;

/* loaded from: classes.dex */
public class NetUtils {
    public static final /* synthetic */ int a = 0;

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);

        final int nativeInt;

        CompressType(int i) {
            this.nativeInt = i;
        }
    }

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);

        final int nativeInt;

        NetworkType(int i) {
            this.nativeInt = i;
        }

        public int getValue() {
            return this.nativeInt;
        }

        public boolean is2G() {
            return this == MOBILE || this == MOBILE_2G;
        }

        public boolean isAvailable() {
            return (this == UNKNOWN || this == NONE) ? false : true;
        }

        public boolean isWifi() {
            return this == WIFI;
        }
    }

    static {
        NetworkType networkType = NetworkType.UNKNOWN;
    }
}
