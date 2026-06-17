package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h;

import com.bytedance.common.utility.Logger;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d {
    private static final String a = "d";
    private static AtomicBoolean b = new AtomicBoolean(false);

    public static void a() {
        if (Logger.debug()) {
            Logger.d(a, "detectIpv6Reachable");
        }
        AtomicBoolean atomicBoolean = b;
        boolean z = false;
        DatagramSocket datagramSocket = null;
        try {
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.connect(new InetSocketAddress("2001:4860:4860::8888", 53));
                InetAddress localAddress = datagramSocket2.getLocalAddress();
                if (localAddress instanceof Inet6Address) {
                    boolean z2 = !localAddress.isLinkLocalAddress();
                    if (!localAddress.getHostAddress().startsWith("2001:0000")) {
                        z = z2;
                    }
                }
                datagramSocket2.close();
            } catch (IOException unused) {
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                atomicBoolean.set(z);
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        atomicBoolean.set(z);
    }

    public static AtomicBoolean b() {
        return b;
    }
}
