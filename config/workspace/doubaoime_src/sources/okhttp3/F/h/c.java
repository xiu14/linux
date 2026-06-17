package okhttp3.F.h;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

/* loaded from: classes2.dex */
public class c extends g {
    private c() {
    }

    public static c p() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new c();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider q() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // okhttp3.F.h.g
    public void e(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // okhttp3.F.h.g
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ((ArrayList) g.b(list)).toArray(new String[0]));
        }
    }

    @Override // okhttp3.F.h.g
    public SSLContext i() {
        try {
            return SSLContext.getInstance("TLSv1.3", q());
        } catch (NoSuchAlgorithmException e2) {
            try {
                return SSLContext.getInstance(org.apache.http.conn.ssl.SSLSocketFactory.TLS, q());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e2);
            }
        }
    }

    @Override // okhttp3.F.h.g
    public String j(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
