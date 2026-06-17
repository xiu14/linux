package com.bytedance.apm.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.common.utility.NetworkUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class j {
    private static com.bytedance.apm.net.a a;

    static {
        NetworkUtils.NetworkType networkType = NetworkUtils.NetworkType.UNKNOWN;
    }

    public static HttpURLConnection a(String str) throws IOException {
        com.bytedance.apm.net.a aVar = a;
        return aVar == null ? (HttpURLConnection) new URL(str).openConnection() : aVar.a(str);
    }

    public static boolean b(Context context) {
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

    public static boolean c(Context context) {
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

    public static void d(com.bytedance.apm.net.a aVar) {
        a = null;
    }
}
