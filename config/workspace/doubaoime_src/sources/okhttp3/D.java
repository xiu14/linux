package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class D implements Closeable {
    public static D l(v vVar, byte[] bArr) {
        f.e eVar = new f.e();
        eVar.P(bArr);
        return new C(null, bArr.length, eVar);
    }

    public final InputStream a() {
        return o().j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.F.c.g(o());
    }

    public abstract long d();

    public abstract v h();

    public abstract f.g o();

    public final String p() throws IOException {
        f.g o = o();
        try {
            v h = h();
            return o.L(okhttp3.F.c.c(o, h != null ? h.b(okhttp3.F.c.i) : okhttp3.F.c.i));
        } finally {
            okhttp3.F.c.g(o);
        }
    }
}
