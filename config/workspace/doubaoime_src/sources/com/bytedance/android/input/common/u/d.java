package com.bytedance.android.input.common.u;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.bytedance.android.input.basic.IAppGlobals;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Objects;

/* loaded from: classes.dex */
public class d {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        r1 = r3.getHostAddress();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            boolean r0 = c(r6)
            r1 = 0
            if (r0 == 0) goto Lad
            com.bytedance.android.input.basic.IAppGlobals$a r0 = com.bytedance.android.input.basic.IAppGlobals.a
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.C()
            if (r0 != 0) goto L14
            goto Lad
        L14:
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L2d
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6     // Catch: java.lang.Exception -> L2d
            android.net.wifi.WifiInfo r6 = r6.getConnectionInfo()     // Catch: java.lang.Exception -> L2d
            int r6 = r6.getIpAddress()     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = android.text.format.Formatter.formatIpAddress(r6)     // Catch: java.lang.Exception -> L2d
            goto L32
        L2d:
            r6 = move-exception
            r6.printStackTrace()
            r6 = r1
        L32:
            java.lang.String r0 = "getIpv4Address, wifiIp = "
            java.lang.String r2 = "IpAddressUtil"
            e.a.a.a.a.r0(r0, r6, r2)
            if (r6 == 0) goto L44
            java.lang.String r0 = "0.0.0.0"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L44
            return r6
        L44:
            com.bytedance.android.input.basic.IAppGlobals$a r6 = com.bytedance.android.input.basic.IAppGlobals.a     // Catch: java.net.SocketException -> La4
            java.util.Objects.requireNonNull(r6)     // Catch: java.net.SocketException -> La4
            boolean r6 = r6.C()     // Catch: java.net.SocketException -> La4
            if (r6 != 0) goto L50
            goto La8
        L50:
            java.util.Enumeration r6 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> La4
            if (r6 != 0) goto L57
            goto La8
        L57:
            boolean r0 = r6.hasMoreElements()     // Catch: java.net.SocketException -> La4
            if (r0 == 0) goto La8
            java.lang.Object r0 = r6.nextElement()     // Catch: java.net.SocketException -> La4
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch: java.net.SocketException -> La4
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch: java.net.SocketException -> La4
        L67:
            boolean r3 = r0.hasMoreElements()     // Catch: java.net.SocketException -> La4
            if (r3 == 0) goto L57
            java.lang.Object r3 = r0.nextElement()     // Catch: java.net.SocketException -> La4
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.net.SocketException -> La4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.net.SocketException -> La4
            r4.<init>()     // Catch: java.net.SocketException -> La4
            java.lang.String r5 = "getMobileIpAddress, address = "
            r4.append(r5)     // Catch: java.net.SocketException -> La4
            java.lang.String r5 = r3.getHostAddress()     // Catch: java.net.SocketException -> La4
            r4.append(r5)     // Catch: java.net.SocketException -> La4
            java.lang.String r4 = r4.toString()     // Catch: java.net.SocketException -> La4
            com.bytedance.android.input.r.j.i(r2, r4)     // Catch: java.net.SocketException -> La4
            boolean r4 = r3.isLoopbackAddress()     // Catch: java.net.SocketException -> La4
            if (r4 != 0) goto L67
            java.lang.String r4 = r3.getHostAddress()     // Catch: java.net.SocketException -> La4
            r5 = 58
            int r4 = r4.indexOf(r5)     // Catch: java.net.SocketException -> La4
            r5 = -1
            if (r4 != r5) goto L67
            java.lang.String r6 = r3.getHostAddress()     // Catch: java.net.SocketException -> La4
            r1 = r6
            goto La8
        La4:
            r6 = move-exception
            r6.printStackTrace()
        La8:
            java.lang.String r6 = "getIpv4Address, mobileIp = "
            e.a.a.a.a.r0(r6, r1, r2)
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.u.d.a(android.content.Context):java.lang.String");
    }

    public static String b(Context context) {
        String str;
        WifiManager wifiManager;
        Enumeration<NetworkInterface> networkInterfaces;
        String str2 = null;
        if (!c(context)) {
            return null;
        }
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            if (aVar.C() && (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) != null && wifiManager.getConnectionInfo() != null && (networkInterfaces = NetworkInterface.getNetworkInterfaces()) != null) {
                loop2: while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.getDisplayName().contains("wlan") || nextElement.getName().contains("wlan")) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if ((nextElement2 instanceof Inet6Address) && !nextElement2.isLoopbackAddress()) {
                                str = nextElement2.getHostAddress();
                                if (!str.contains("%")) {
                                    break loop2;
                                }
                            }
                        }
                    }
                }
            }
        } catch (SocketException e2) {
            e2.printStackTrace();
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
            e.a.a.a.a.r0("getIpv6Address, wifiIpv6 = ", str, "IpAddressUtil");
            return str;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces2 != null) {
                IAppGlobals.a aVar2 = IAppGlobals.a;
                Objects.requireNonNull(aVar2);
                if (aVar2.C()) {
                    loop0: while (true) {
                        if (!networkInterfaces2.hasMoreElements()) {
                            break;
                        }
                        NetworkInterface nextElement3 = networkInterfaces2.nextElement();
                        if (nextElement3.getName().contains("rmnet") || nextElement3.getName().contains("pdp")) {
                            Enumeration<InetAddress> inetAddresses2 = nextElement3.getInetAddresses();
                            while (inetAddresses2.hasMoreElements()) {
                                InetAddress nextElement4 = inetAddresses2.nextElement();
                                if ((nextElement4 instanceof Inet6Address) && !nextElement4.isLoopbackAddress()) {
                                    String hostAddress = nextElement4.getHostAddress();
                                    if (!hostAddress.contains("%")) {
                                        str2 = hostAddress;
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (SocketException e3) {
            e3.printStackTrace();
        }
        if (!TextUtils.isEmpty(str2)) {
            e.a.a.a.a.r0("getIpv6Address, mobileIpv6 = ", str2, "IpAddressUtil");
        }
        return str2;
    }

    private static boolean c(Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
    }
}
