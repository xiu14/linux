package f;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface x extends Closeable, Flushable {
    void O(e eVar, long j) throws IOException;

    A c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;
}
