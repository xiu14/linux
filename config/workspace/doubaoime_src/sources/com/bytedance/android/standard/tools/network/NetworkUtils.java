package com.bytedance.android.standard.tools.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class NetworkUtils {
    private static NetworkType a = NetworkType.UNKNOWN;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile long f3223c = 2000;

    /* renamed from: d, reason: collision with root package name */
    private static long f3224d = 0;

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
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);

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

        public boolean is3GOrHigher() {
            return this == MOBILE_3G || this == MOBILE_3G_H || this == MOBILE_3G_HP || this == MOBILE_4G || this == MOBILE_5G;
        }

        public boolean is4GOrHigher() {
            return this == MOBILE_4G || this == MOBILE_5G;
        }

        public boolean isAvailable() {
            return (this == UNKNOWN || this == NONE) ? false : true;
        }

        public boolean isWifi() {
            return this == WIFI;
        }
    }

    public static NetworkType a(Context context) {
        return b(context);
    }

    private static NetworkType b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return NetworkType.WIFI;
                }
                if (type != 0) {
                    return NetworkType.MOBILE;
                }
                int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                if (networkType != 3) {
                    if (networkType == 20) {
                        return NetworkType.MOBILE_5G;
                    }
                    if (networkType != 5 && networkType != 6) {
                        switch (networkType) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                switch (networkType) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        return NetworkType.MOBILE_4G;
                                    default:
                                        return NetworkType.MOBILE;
                                }
                        }
                    }
                }
                return NetworkType.MOBILE_3G;
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }

    static void c(NetworkType networkType) {
        a = networkType;
    }
}
