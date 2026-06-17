package com.bytedance.crash;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

/* renamed from: com.bytedance.crash.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0650e {
    public static boolean a(Throwable th) {
        if (th == null) {
            return true;
        }
        try {
            if ((th instanceof g.a.b.c.a) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException)) {
                return true;
            }
            return th instanceof SSLException;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }
}
