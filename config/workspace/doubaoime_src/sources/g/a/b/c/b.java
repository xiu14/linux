package g.a.b.c;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.apache.http.conn.ssl.d;

@Deprecated
/* loaded from: classes2.dex */
public class b extends InetSocketAddress {
    private final g.a.b.a a;

    public b(g.a.b.a aVar, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        d.j(aVar, "HTTP host");
        this.a = aVar;
    }

    public g.a.b.a a() {
        return this.a;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.a.a() + Constants.COLON_SEPARATOR + getPort();
    }
}
