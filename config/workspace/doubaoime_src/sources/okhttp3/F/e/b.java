package okhttp3.F.e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.j;

/* loaded from: classes2.dex */
public final class b {
    private final List<j> a;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10510c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10511d;

    public b(List<j> list) {
        this.a = list;
    }

    public j a(SSLSocket sSLSocket) throws IOException {
        boolean z;
        j jVar;
        int i = this.b;
        int size = this.a.size();
        while (true) {
            z = true;
            if (i >= size) {
                jVar = null;
                break;
            }
            jVar = this.a.get(i);
            if (jVar.a(sSLSocket)) {
                this.b = i + 1;
                break;
            }
            i++;
        }
        if (jVar == null) {
            StringBuilder M = e.a.a.a.a.M("Unable to find acceptable protocols. isFallback=");
            M.append(this.f10511d);
            M.append(", modes=");
            M.append(this.a);
            M.append(", supported protocols=");
            M.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(M.toString());
        }
        int i2 = this.b;
        while (true) {
            if (i2 >= this.a.size()) {
                z = false;
                break;
            }
            if (this.a.get(i2).a(sSLSocket)) {
                break;
            }
            i2++;
        }
        this.f10510c = z;
        okhttp3.F.a.a.c(jVar, sSLSocket, this.f10511d);
        return jVar;
    }

    public boolean b(IOException iOException) {
        this.f10511d = true;
        if (!this.f10510c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
