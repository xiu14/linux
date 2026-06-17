package com.huawei.hianalytics.h;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: classes2.dex */
public final class a extends SSLSocketFactory {
    public static final X509HostnameVerifier a = new StrictHostnameVerifier();

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f7121c = {"TLS_RSA", "3DES", "DES", "MD5", "RC4", "aNULL", "eNULL", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "DESX", "DES40", "RC2", "ANON", "NULL", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    /* renamed from: d, reason: collision with root package name */
    private static a f7122d;
    private final SSLContext b;

    private a() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        this.b = sSLContext;
        sSLContext.init(null, new X509TrustManager[]{new f()}, null);
    }

    public static SocketFactory a() {
        String str;
        String str2;
        a aVar;
        synchronized (a.class) {
            try {
                if (f7122d == null) {
                    f7122d = new a();
                }
                aVar = f7122d;
            } catch (IOException unused) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,IO!";
                com.huawei.hianalytics.g.b.c(str, str2);
                aVar = null;
                return aVar;
            } catch (IllegalArgumentException e2) {
                com.huawei.hianalytics.g.b.c("Factory", "getLocalInstanceLock(): " + e2.getMessage());
                aVar = null;
                return aVar;
            } catch (KeyManagementException unused2) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,Key Manage!";
                com.huawei.hianalytics.g.b.c(str, str2);
                aVar = null;
                return aVar;
            } catch (KeyStoreException unused3) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,Key Store!";
                com.huawei.hianalytics.g.b.c(str, str2);
                aVar = null;
                return aVar;
            } catch (NoSuchAlgorithmException unused4) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,Algorithm Exception!";
                com.huawei.hianalytics.g.b.c(str, str2);
                aVar = null;
                return aVar;
            } catch (GeneralSecurityException unused5) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): GeneralSecurityException: Failed to new SSLSocketFactory instance";
                com.huawei.hianalytics.g.b.c(str, str2);
                aVar = null;
                return aVar;
            }
        }
        return aVar;
    }

    private void b(Socket socket) {
        boolean z;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (sSLSocket != null) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            }
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            if (enabledCipherSuites == null || enabledCipherSuites.length == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                String[] strArr = f7121c;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else {
                        if (str.contains(strArr[i].toUpperCase(Locale.ENGLISH))) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!z) {
                    arrayList.add(str);
                }
            }
            sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.b.getSocketFactory().createSocket(str, i);
        b(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.b.getSocketFactory().createSocket(socket, str, i, z);
        b(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
