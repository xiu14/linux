package f;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class i implements x {
    private final x a;

    public i(x xVar) {
        kotlin.s.c.l.g(xVar, "delegate");
        this.a = xVar;
    }

    @Override // f.x
    public void O(e eVar, long j) throws IOException {
        kotlin.s.c.l.g(eVar, "source");
        this.a.O(eVar, j);
    }

    @Override // f.x
    public A c() {
        return this.a.c();
    }

    @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // f.x, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
