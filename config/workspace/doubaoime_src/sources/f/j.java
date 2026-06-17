package f;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class j implements z {
    private final z a;

    public j(z zVar) {
        kotlin.s.c.l.g(zVar, "delegate");
        this.a = zVar;
    }

    public final z a() {
        return this.a;
    }

    @Override // f.z
    public A c() {
        return this.a.c();
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
