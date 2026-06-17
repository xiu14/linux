package okhttp3.F.h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
final class d extends g {

    /* renamed from: c, reason: collision with root package name */
    final Method f10562c;

    /* renamed from: d, reason: collision with root package name */
    final Method f10563d;

    d(Method method, Method method2) {
        this.f10562c = method;
        this.f10563d = method2;
    }

    @Override // okhttp3.F.h.g
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = (ArrayList) g.b(list);
            this.f10562c.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw okhttp3.F.c.b("unable to set ssl parameters", e2);
        }
    }

    @Override // okhttp3.F.h.g
    public String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f10563d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw okhttp3.F.c.b("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw okhttp3.F.c.b("failed to get ALPN selected protocol", e3);
        }
    }
}
