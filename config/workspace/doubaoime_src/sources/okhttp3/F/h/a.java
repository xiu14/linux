package okhttp3.F.h;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
class a extends b {
    a(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    @Override // okhttp3.F.h.b, okhttp3.F.h.g
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) ((ArrayList) g.b(list)).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }

    @Override // okhttp3.F.h.b, okhttp3.F.h.g
    @IgnoreJRERequirement
    public String j(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
