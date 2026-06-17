package f;

import java.io.OutputStream;

/* loaded from: classes2.dex */
final class q implements x {
    private final OutputStream a;
    private final A b;

    public q(OutputStream outputStream, A a) {
        kotlin.s.c.l.g(outputStream, "out");
        kotlin.s.c.l.g(a, "timeout");
        this.a = outputStream;
        this.b = a;
    }

    @Override // f.x
    public void O(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "source");
        com.prolificinteractive.materialcalendarview.r.A(eVar.I(), 0L, j);
        while (j > 0) {
            this.b.f();
            u uVar = eVar.a;
            if (uVar == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            int min = (int) Math.min(j, uVar.f10061c - uVar.b);
            this.a.write(uVar.a, uVar.b, min);
            uVar.b += min;
            long j2 = min;
            j -= j2;
            eVar.H(eVar.I() - j2);
            if (uVar.b == uVar.f10061c) {
                eVar.a = uVar.a();
                v.a(uVar);
            }
        }
    }

    @Override // f.x
    public A c() {
        return this.b;
    }

    @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // f.x, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("sink(");
        M.append(this.a);
        M.append(')');
        return M.toString();
    }
}
