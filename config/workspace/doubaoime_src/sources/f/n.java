package f;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class n implements z {
    private final InputStream a;
    private final A b;

    public n(InputStream inputStream, A a) {
        kotlin.s.c.l.g(inputStream, "input");
        kotlin.s.c.l.g(a, "timeout");
        this.a = inputStream;
        this.b = a;
    }

    @Override // f.z
    public long b0(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "sink");
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j).toString());
        }
        try {
            this.b.f();
            u M = eVar.M(1);
            int read = this.a.read(M.a, M.f10061c, (int) Math.min(j, 8192 - M.f10061c));
            if (read == -1) {
                return -1L;
            }
            M.f10061c += read;
            long j2 = read;
            eVar.H(eVar.I() + j2);
            return j2;
        } catch (AssertionError e2) {
            if (o.b(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // f.z
    public A c() {
        return this.b;
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("source(");
        M.append(this.a);
        M.append(')');
        return M.toString();
    }
}
