package f;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class d implements z {
    final /* synthetic */ b a;
    final /* synthetic */ z b;

    d(b bVar, z zVar) {
        this.a = bVar;
        this.b = zVar;
    }

    @Override // f.z
    public long b0(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "sink");
        this.a.q();
        try {
            try {
                long b0 = this.b.b0(eVar, j);
                this.a.t(true);
                return b0;
            } catch (IOException e2) {
                throw this.a.s(e2);
            }
        } catch (Throwable th) {
            this.a.t(false);
            throw th;
        }
    }

    @Override // f.z
    public A c() {
        return this.a;
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.q();
        try {
            try {
                this.b.close();
                this.a.t(true);
            } catch (IOException e2) {
                throw this.a.s(e2);
            }
        } catch (Throwable th) {
            this.a.t(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AsyncTimeout.source(");
        M.append(this.b);
        M.append(')');
        return M.toString();
    }
}
