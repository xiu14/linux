package com.ttnet.org.chromium.net;

import J.N;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.RouteInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.CalledByNativeUnchecked;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
class AndroidNetworkLibrary {
    private static Boolean a;
    private static Boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f8597c;

    class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ ConnectivityManager a;

        a(ConnectivityManager connectivityManager) {
            this.a = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
                N.MeYG7FqD(true, -1);
            } else {
                N.MeYG7FqD(false, 8);
            }
        }
    }

    private static class b extends Socket {

        private static class a extends SocketImpl {
            a(FileDescriptor fileDescriptor) {
                ((SocketImpl) this).fd = fileDescriptor;
            }

            @Override // java.net.SocketImpl
            protected void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected int available() {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected void bind(InetAddress inetAddress, int i) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected void close() {
            }

            @Override // java.net.SocketImpl
            protected void connect(InetAddress inetAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            protected void create(boolean z) {
            }

            @Override // java.net.SocketImpl
            protected InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            @Override // java.net.SocketOptions
            public Object getOption(int i) {
                throw new RuntimeException("getOption not implemented");
            }

            @Override // java.net.SocketImpl
            protected OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            @Override // java.net.SocketImpl
            protected void listen(int i) {
                throw new RuntimeException("listen not implemented");
            }

            @Override // java.net.SocketImpl
            protected void sendUrgentData(int i) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            @Override // java.net.SocketOptions
            public void setOption(int i, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }

            @Override // java.net.SocketImpl
            protected void connect(SocketAddress socketAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            protected void connect(String str, int i) {
                throw new RuntimeException("connect not implemented");
            }
        }

        b(FileDescriptor fileDescriptor) throws IOException {
            super(new a(fileDescriptor));
        }
    }

    AndroidNetworkLibrary() {
    }

    private static int a(int i) {
        if (i == 2484) {
            return 14;
        }
        if (i < 2484) {
            return (i - 2407) / 5;
        }
        if (i >= 4910 && i <= 4980) {
            return (i - 4000) / 5;
        }
        if (i < 5925) {
            return (i - 5000) / 5;
        }
        if (i == 5935) {
            return 2;
        }
        if (i <= 45000) {
            return (i - 5950) / 5;
        }
        if (i < 58320 || i > 70200) {
            return -1;
        }
        return (i - 56160) / 2160;
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        H.b(bArr);
    }

    @CalledByNative
    @TargetApi(21)
    private static void alwaysUpCellularOnThreadPool() {
        ConnectivityManager connectivityManager = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity");
        if (connectivityManager == null) {
            N.MeYG7FqD(false, 7);
            return;
        }
        try {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new a(connectivityManager));
        } catch (Exception e2) {
            e2.printStackTrace();
            N.MeYG7FqD(false, 9);
        }
    }

    @RequiresApi(23)
    public static DnsStatus b(Network network) {
        ConnectivityManager connectivityManager;
        if (!e() || (connectivityManager = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            String domains = linkProperties.getDomains();
            return Build.VERSION.SDK_INT >= 28 ? new DnsStatus(dnsServers, linkProperties.isPrivateDnsActive(), linkProperties.getPrivateDnsServerName(), domains) : new DnsStatus(dnsServers, false, "", domains);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static WifiInfo c() {
        TransportInfo transportInfo;
        if (!f()) {
            Intent registerReceiver = com.ttnet.org.chromium.base.c.b().registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null) {
                return (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            }
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return ((WifiManager) com.ttnet.org.chromium.base.c.b().getSystemService("wifi")).getConnectionInfo();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = networkCapabilities.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                return (WifiInfo) transportInfo;
            }
        }
        return null;
    }

    @CalledByNative
    @TargetApi(21)
    private static boolean checkIsVpnOn() {
        ConnectivityManager connectivityManager = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        for (int i = 0; i < allNetworks.length; i++) {
            if (connectivityManager.getNetworkInfo(allNetworks[i]).isConnected() && connectivityManager.getNetworkCapabilities(allNetworks[i]).hasTransport(4)) {
                return true;
            }
        }
        return false;
    }

    @CalledByNativeUnchecked
    public static void clearTestRootCertificates() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        H.d();
    }

    private static boolean d(Context context, String str) {
        return com.prolificinteractive.materialcalendarview.r.C(context, str, Process.myPid(), Process.myUid()) == 0;
    }

    private static boolean e() {
        if (a == null) {
            a = Boolean.valueOf(d(com.ttnet.org.chromium.base.c.b(), "android.permission.ACCESS_NETWORK_STATE"));
        }
        return a.booleanValue();
    }

    private static boolean f() {
        if (b == null) {
            b = Boolean.valueOf(d(com.ttnet.org.chromium.base.c.b(), "android.permission.ACCESS_WIFI_STATE"));
        }
        return b.booleanValue();
    }

    @CalledByNative
    public static int[] getAllAccessPointChannels() {
        if (f8597c == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                f8597c = Boolean.valueOf(d(com.ttnet.org.chromium.base.c.b(), "android.permission.ACCESS_FINE_LOCATION"));
            } else {
                f8597c = Boolean.valueOf(d(com.ttnet.org.chromium.base.c.b(), "android.permission.ACCESS_COARSE_LOCATION") || d(com.ttnet.org.chromium.base.c.b(), "android.permission.ACCESS_FINE_LOCATION"));
            }
        }
        if (!f8597c.booleanValue() || !f()) {
            return new int[0];
        }
        WifiManager wifiManager = (WifiManager) com.ttnet.org.chromium.base.c.b().getSystemService("wifi");
        if (wifiManager == null) {
            return new int[0];
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.isEmpty()) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ScanResult> it2 = scanResults.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(a(it2.next().frequency)));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    @CalledByNative
    public static String[][] getAllRouteInfo() {
        if (!e()) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            Network[] allNetworks = connectivityManager.getAllNetworks();
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                if (linkProperties != null) {
                    for (RouteInfo routeInfo : linkProperties.getRoutes()) {
                        String[] strArr = new String[4];
                        if (routeInfo.getDestination() != null) {
                            strArr[0] = routeInfo.getDestination().getAddress().getHostAddress();
                            strArr[1] = Integer.toString(routeInfo.getDestination().getPrefixLength());
                        }
                        if (routeInfo.getGateway() != null) {
                            strArr[2] = routeInfo.getGateway().getHostAddress();
                        }
                        strArr[3] = routeInfo.getInterface();
                        arrayList.add(strArr);
                    }
                }
            }
            return (String[][]) arrayList.toArray((String[][]) Array.newInstance((Class<?>) String.class, 0, 0));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @CalledByNative
    public static int getCurrentAccessPointChannel() {
        Objects.requireNonNull(v.a());
        if (N.Mhd7DRFo()) {
            return a(v.a().d());
        }
        WifiInfo c2 = c();
        if (c2 == null) {
            return -1;
        }
        return a(c2.getFrequency());
    }

    @RequiresApi(23)
    @CalledByNative
    public static DnsStatus getCurrentDnsStatus() {
        return b(null);
    }

    @CalledByNative
    public static int[] getDhcpInfo() {
        DhcpInfo dhcpInfo;
        Objects.requireNonNull(v.a());
        if (N.MaSRwBiO()) {
            return new int[0];
        }
        try {
            WifiManager wifiManager = (WifiManager) com.ttnet.org.chromium.base.c.b().getSystemService("wifi");
            if (wifiManager != null && (dhcpInfo = wifiManager.getDhcpInfo()) != null) {
                return new int[]{dhcpInfo.ipAddress, dhcpInfo.gateway};
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new int[0];
    }

    @RequiresApi(28)
    @CalledByNative
    public static DnsStatus getDnsStatusForNetwork(long j) {
        try {
            return b(Network.fromNetworkHandle(j));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @RequiresApi(23)
    @CalledByNative
    private static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    @CalledByNative
    private static String getNetworkOperator() {
        Objects.requireNonNull(v.a());
        if (N.Mhd7DRFo()) {
            return v.a().b();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.ttnet.org.chromium.base.c.b().getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @CalledByNative
    private static String getSimOperator() {
        Objects.requireNonNull(v.a());
        if (N.Mhd7DRFo()) {
            return v.a().c();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.ttnet.org.chromium.base.c.b().getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @CalledByNative
    public static String getWifiSSID() {
        return "";
    }

    @CalledByNative
    public static int getWifiSignalLevel(int i) {
        int intExtra;
        int calculateSignalLevel;
        if (com.ttnet.org.chromium.base.c.b() == null || com.ttnet.org.chromium.base.c.b().getContentResolver() == null) {
            return -1;
        }
        Objects.requireNonNull(v.a());
        if (N.Mhd7DRFo()) {
            intExtra = v.a().e();
        } else if (f()) {
            WifiInfo c2 = c();
            if (c2 == null) {
                return -1;
            }
            intExtra = c2.getRssi();
        } else {
            try {
                Intent registerReceiver = com.ttnet.org.chromium.base.c.b().registerReceiver(null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (registerReceiver == null) {
                    return -1;
                }
                intExtra = registerReceiver.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i)) >= 0 && calculateSignalLevel < i) {
            return calculateSignalLevel;
        }
        return -1;
    }

    @CalledByNative
    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e2) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: " + e2);
            return false;
        }
    }

    @CalledByNative
    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    @RequiresApi(23)
    @CalledByNative
    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    @CalledByNative
    public static void setWifiEnabled(boolean z) {
        ((WifiManager) com.ttnet.org.chromium.base.c.b().getSystemService("wifi")).setWifiEnabled(z);
    }

    @CalledByNative
    private static void tagSocket(int i, int i2, int i3) throws IOException {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            C.b(i2);
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(i);
        b bVar = new b(adoptFd.getFileDescriptor());
        TrafficStats.tagSocket(bVar);
        bVar.close();
        adoptFd.detachFd();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            C.a();
        }
    }

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return H.k(bArr, str, str2);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
