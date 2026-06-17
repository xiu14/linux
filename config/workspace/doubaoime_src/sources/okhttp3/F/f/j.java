package okhttp3.F.f;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
public final class j {
    public final Protocol a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10541c;

    public j(Protocol protocol, int i, String str) {
        this.a = protocol;
        this.b = i;
        this.f10541c = str;
    }

    public static j a(String str) throws IOException {
        Protocol protocol;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(e.a.a.a.a.s("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException(e.a.a.a.a.s("Unexpected status line: ", str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException(e.a.a.a.a.s("Unexpected status line: ", str));
            }
            protocol = Protocol.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException(e.a.a.a.a.s("Unexpected status line: ", str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException(e.a.a.a.a.s("Unexpected status line: ", str));
                }
                str2 = str.substring(i + 4);
            }
            return new j(protocol, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(e.a.a.a.a.s("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.f10541c != null) {
            sb.append(' ');
            sb.append(this.f10541c);
        }
        return sb.toString();
    }
}
