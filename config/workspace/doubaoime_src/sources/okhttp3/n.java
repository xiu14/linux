package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public interface n {
    public static final n a = new a();

    static class a implements n {
        a() {
        }

        @Override // okhttp3.n
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e2) {
                UnknownHostException unknownHostException = new UnknownHostException(e.a.a.a.a.s("Broken system behaviour for dns lookup of ", str));
                unknownHostException.initCause(e2);
                throw unknownHostException;
            } catch (SecurityException e3) {
                UnknownHostException unknownHostException2 = new UnknownHostException(e.a.a.a.a.s("Permission denied for dns lookup of ", str));
                unknownHostException2.initCause(e3);
                throw unknownHostException2;
            }
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
