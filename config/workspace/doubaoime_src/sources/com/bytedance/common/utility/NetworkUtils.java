package com.bytedance.common.utility;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* loaded from: classes.dex */
public final class NetworkUtils {
    private static NetworkType a = NetworkType.UNKNOWN;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile long f4166c = 2000;

    /* renamed from: d, reason: collision with root package name */
    private static long f4167d = 0;

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

    private static void a(Context context) {
        if (System.currentTimeMillis() - f4167d > f4166c) {
            a = g(context);
            f4167d = System.currentTimeMillis();
        }
    }

    private static void b(Context context) {
        if (!b && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            context.getApplicationContext().registerReceiver(new NetworkConnectChangeReceiver(), intentFilter);
            b = true;
        }
        if (a == NetworkType.UNKNOWN) {
            a = g(context);
        }
    }

    public static String c(List<Pair<String, String>> list, String str) {
        String encode;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            try {
                String encode2 = URLEncoder.encode((String) pair.first, str);
                String str2 = (String) pair.second;
                if (str2 != null) {
                    try {
                        encode = URLEncoder.encode(str2, str);
                    } catch (UnsupportedEncodingException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    encode = "";
                }
                if (sb.length() > 0) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                e.a.a.a.a.K0(sb, encode2, ContainerUtils.KEY_VALUE_DELIMITER, encode);
            } catch (UnsupportedEncodingException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        return sb.toString();
    }

    public static String d(Context context) {
        NetworkType g2 = g(context);
        return g2 == NetworkType.WIFI ? "wifi" : g2 == NetworkType.WIFI_24GHZ ? "wifi24ghz" : g2 == NetworkType.WIFI_5GHZ ? "wifi5ghz" : g2 == NetworkType.MOBILE_2G ? "2g" : g2 == NetworkType.MOBILE_3G ? "3g" : g2 == NetworkType.MOBILE_3G_H ? "3gh" : g2 == NetworkType.MOBILE_3G_HP ? "3ghp" : g2 == NetworkType.MOBILE_4G ? "4g" : g2 == NetworkType.MOBILE_5G ? "5g" : g2 == NetworkType.MOBILE ? "mobile" : "";
    }

    public static NetworkType e(Context context) {
        return g(context);
    }

    public static NetworkType f(Context context) {
        b(context);
        a(context);
        return a;
    }

    private static NetworkType g(Context context) {
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

    public static boolean h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean i(Context context) {
        b(context);
        a(context);
        return a.isAvailable();
    }

    public static boolean j(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                return 1 == activeNetworkInfo.getType();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    static void k(NetworkType networkType) {
        a = networkType;
    }
}
