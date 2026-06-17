package f;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface z extends Closeable {
    long b0(e eVar, long j) throws IOException;

    A c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;
}
