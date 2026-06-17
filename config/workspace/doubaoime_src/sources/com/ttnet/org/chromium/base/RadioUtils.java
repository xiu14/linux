package com.ttnet.org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import com.prolificinteractive.materialcalendarview.r;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class RadioUtils {
    private static Boolean a;
    private static Boolean b;

    private RadioUtils() {
    }

    @RequiresApi(28)
    @CalledByNative
    private static int getCellDataActivity() {
        TraceEvent r = TraceEvent.r("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) c.b().getSystemService("phone")).getDataActivity();
                if (r != null) {
                    r.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (r != null) {
                    r.close();
                }
                return -1;
            }
        } catch (Throwable th) {
            if (r != null) {
                try {
                    r.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @RequiresApi(28)
    @CalledByNative
    private static int getCellSignalLevel() {
        TraceEvent r = TraceEvent.r("RadioUtils::getCellSignalLevel");
        try {
            int i = -1;
            try {
                SignalStrength signalStrength = ((TelephonyManager) c.b().getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    i = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (r != null) {
                r.close();
            }
            return i;
        } catch (Throwable th) {
            if (r != null) {
                try {
                    r.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    private static boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (a == null) {
                a = Boolean.valueOf(r.C(c.b(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
            }
            if (a.booleanValue()) {
                if (b == null) {
                    b = Boolean.valueOf(r.C(c.b(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
                }
                if (b.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @RequiresApi(28)
    @CalledByNative
    private static boolean isWifiConnected() {
        TraceEvent r = TraceEvent.r("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.b().getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (r != null) {
                    r.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (r != null) {
                    r.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (r != null) {
                r.close();
            }
            return hasTransport;
        } catch (Throwable th) {
            if (r != null) {
                try {
                    r.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
