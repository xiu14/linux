package com.monitor.cloudmessage.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.TrafficStats;
import android.text.TextUtils;
import com.bytedance.apm.util.j;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkUtils {
    private static long a;
    private static long b;

    /* renamed from: c, reason: collision with root package name */
    private static long f7511c;

    /* renamed from: d, reason: collision with root package name */
    private static long f7512d;

    enum NetworkType {
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
    }

    public static String a(Context context) {
        int i = context.getApplicationInfo().uid;
        long totalRxBytes = TrafficStats.getTotalRxBytes() / DownloadConstants.KB;
        if (totalRxBytes == -1) {
            return "UNSUPPORTED";
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = ((totalRxBytes - a) * 1000) / (currentTimeMillis - f7511c);
        f7511c = currentTimeMillis;
        a = totalRxBytes;
        return String.valueOf(j) + " KB/s";
    }

    public static List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            for (Network network : connectivityManager.getAllNetworks()) {
                if (connectivityManager.getNetworkInfo(network).getType() == activeNetworkInfo.getType()) {
                    Iterator<RouteInfo> it2 = connectivityManager.getLinkProperties(network).getRoutes().iterator();
                    while (it2.hasNext()) {
                        InetAddress gateway = it2.next().getGateway();
                        if (gateway != null) {
                            arrayList.add(gateway.getHostAddress());
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public static List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            for (Network network : connectivityManager.getAllNetworks()) {
                if (connectivityManager.getNetworkInfo(network).getType() == activeNetworkInfo.getType()) {
                    Iterator<InetAddress> it2 = connectivityManager.getLinkProperties(network).getDnsServers().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getHostAddress());
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public static String d() {
        String str = "none";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                String name = nextElement.getName();
                if (name != null && (TextUtils.equals(name.toLowerCase(), "eth0") || TextUtils.equals(name.toLowerCase(), "wlan0"))) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if ((nextElement2 instanceof Inet4Address) && !nextElement2.isLoopbackAddress()) {
                            str = nextElement2.getHostAddress();
                        }
                    }
                }
            }
        } catch (SocketException e2) {
            e2.printStackTrace();
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|3|(6:8|(1:10)(1:(2:39|40)(1:45))|11|13|14|(2:16|(2:18|(2:20|(2:22|(2:24|25)(2:27|28))(2:29|30))(2:31|32))(2:33|34))(1:35))|46|11|13|14|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(android.content.Context r3) {
        /*
            r0 = 1
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L42
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L42
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L3f
            boolean r2 = r1.isAvailable()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L16
            goto L3f
        L16:
            int r1 = r1.getType()     // Catch: java.lang.Throwable -> L42
            if (r0 != r1) goto L1f
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.WIFI     // Catch: java.lang.Throwable -> L42
            goto L44
        L1f:
            if (r1 != 0) goto L3c
            java.lang.String r1 = "phone"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L42
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L42
            int r3 = r3.getNetworkType()     // Catch: java.lang.Throwable -> L42
            switch(r3) {
                case 1: goto L39;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L36;
                case 7: goto L39;
                case 8: goto L36;
                case 9: goto L36;
                case 10: goto L36;
                case 11: goto L39;
                case 12: goto L36;
                case 13: goto L33;
                case 14: goto L36;
                case 15: goto L36;
                default: goto L30;
            }     // Catch: java.lang.Throwable -> L42
        L30:
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.MOBILE     // Catch: java.lang.Throwable -> L42
            goto L44
        L33:
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.MOBILE_4G     // Catch: java.lang.Throwable -> L42
            goto L44
        L36:
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.MOBILE_3G     // Catch: java.lang.Throwable -> L42
            goto L44
        L39:
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.MOBILE_2G     // Catch: java.lang.Throwable -> L42
            goto L44
        L3c:
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.MOBILE     // Catch: java.lang.Throwable -> L42
            goto L44
        L3f:
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.NONE     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            com.monitor.cloudmessage.utils.NetworkUtils$NetworkType r3 = com.monitor.cloudmessage.utils.NetworkUtils.NetworkType.MOBILE
        L44:
            int r3 = r3.ordinal()     // Catch: java.lang.Exception -> L66
            if (r3 == r0) goto L63
            r0 = 2
            if (r3 == r0) goto L60
            r0 = 3
            if (r3 == r0) goto L5d
            r0 = 4
            if (r3 == r0) goto L5a
            r0 = 5
            if (r3 == r0) goto L57
            goto L66
        L57:
            java.lang.String r3 = "4g"
            goto L68
        L5a:
            java.lang.String r3 = "wifi"
            goto L68
        L5d:
            java.lang.String r3 = "3g"
            goto L68
        L60:
            java.lang.String r3 = "2g"
            goto L68
        L63:
            java.lang.String r3 = "mobile"
            goto L68
        L66:
            java.lang.String r3 = ""
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.utils.NetworkUtils.e(android.content.Context):java.lang.String");
    }

    public static String f(Context context) {
        int i = context.getApplicationInfo().uid;
        long totalTxBytes = TrafficStats.getTotalTxBytes() / DownloadConstants.KB;
        if (totalTxBytes == -1) {
            return "UNSUPPORTED";
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = ((totalTxBytes - b) * 1000) / (currentTimeMillis - f7512d);
        f7512d = currentTimeMillis;
        b = totalTxBytes;
        return String.valueOf(j) + " KB/s";
    }

    public static boolean g(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean h(Context context) {
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

    public static List<String> i(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            if (allByName != null && allByName.length > 0) {
                for (InetAddress inetAddress : allByName) {
                    arrayList.add(inetAddress.getHostAddress());
                }
            }
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public static boolean j(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = j.a(str);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                String str2 = e.h.a.j.d.a.a;
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                int responseCode = httpURLConnection.getResponseCode();
                jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, responseCode);
                jSONObject2.put("header", com.bytedance.feedbackerlib.a.D(httpURLConnection.getHeaderFields()));
                jSONObject.put(str, jSONObject2);
                boolean z = responseCode == 200;
                httpURLConnection.disconnect();
                return z;
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    jSONObject.put(str, e2.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (JSONException e3) {
                    e3.printStackTrace();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                }
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
