package f;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class c implements x {
    final /* synthetic */ b a;
    final /* synthetic */ x b;

    c(b bVar, x xVar) {
        this.a = bVar;
        this.b = xVar;
    }

    @Override // f.x
    public void O(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "source");
        com.prolificinteractive.materialcalendarview.r.A(eVar.I(), 0L, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                u uVar = eVar.a;
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                do {
                    if (j2 < 65536) {
                        j2 += uVar.f10061c - uVar.b;
                        if (j2 >= j) {
                            j2 = j;
                        } else {
                            uVar = uVar.f10064f;
                        }
                    }
                    this.a.q();
                    try {
                        try {
                            this.b.O(eVar, j2);
                            j -= j2;
                            this.a.t(true);
                        } catch (IOException e2) {
                            throw this.a.s(e2);
                        }
                    } catch (Throwable th) {
                        this.a.t(false);
                        throw th;
                    }
                } while (uVar != null);
                kotlin.s.c.l.k();
                throw null;
            }
            return;
        }
    }

    @Override // f.x
    public A c() {
        return this.a;
    }

    @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // f.x, java.io.Flushable
    public void flush() {
        this.a.q();
        try {
            try {
                this.b.flush();
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
        StringBuilder M = e.a.a.a.a.M("AsyncTimeout.sink(");
        M.append(this.b);
        M.append(')');
        return M.toString();
    }
}
