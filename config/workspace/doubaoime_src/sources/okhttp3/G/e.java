package okhttp3.G;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* loaded from: classes2.dex */
public class e {
    private static int a(IOException iOException, int i) {
        if (iOException == null) {
            return i;
        }
        try {
            int b = b(iOException.getMessage(), i);
            if (b != i) {
                return b;
            }
            try {
                Throwable cause = iOException.getCause();
                if (cause == null) {
                    return b;
                }
                String message = cause.getMessage();
                return TextUtils.isEmpty(message) ? b : b(message, i);
            } catch (Throwable unused) {
                i = b;
                return i;
            }
        } catch (Throwable unused2) {
        }
    }

    private static int b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.contains("ECONNRESET") || str.contains("Connection reset") || str.contains("reset by peer")) {
            return -101;
        }
        if (str.contains("ECONNREFUSED")) {
            return -102;
        }
        if (str.contains("CONNECTION_ABORTED") || str.contains("connection abort")) {
            return -103;
        }
        if (str.contains("ENETDOWN") || str.contains("Network is unreachable")) {
            return -106;
        }
        if (str.contains("EHOSTUNREACH") || str.contains("ENETUNREACH")) {
            return -109;
        }
        if (str.contains("EADDRNOTAVAIL")) {
            return -108;
        }
        if (str.contains("EADDRINUSE")) {
            return -147;
        }
        return i;
    }

    public static int c(IOException iOException) {
        Throwable cause;
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return a(iOException, -104);
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof SocketException) {
            return a(iOException, -15);
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if (iOException instanceof ProtocolException) {
            return -901;
        }
        if (iOException instanceof HttpRetryException) {
            String message = iOException.getMessage();
            return (TextUtils.isEmpty(message) || !message.contains("Too many follow-up requests")) ? -196 : -310;
        }
        if (iOException instanceof UnknownServiceException) {
            return -902;
        }
        if (iOException != null && "Canceled#Reason=-199".equals(iOException.getMessage())) {
            return -199;
        }
        boolean z = false;
        if (iOException != null && ("Canceled#Reason=-192".equals(iOException.getMessage()) || ((iOException instanceof InterruptedIOException) && (cause = iOException.getCause()) != null && !TextUtils.isEmpty(cause.getMessage()) && "Canceled#Reason=-192".equals(cause.getMessage())))) {
            z = true;
        }
        return z ? -192 : -1;
    }
}
