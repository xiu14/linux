package androidx.lifecycle;

import java.io.Closeable;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;

/* loaded from: classes.dex */
public final class CloseableCoroutineScope implements Closeable, G {
    private final kotlin.r.f coroutineContext;

    public CloseableCoroutineScope(kotlin.r.f fVar) {
        l.f(fVar, "context");
        this.coroutineContext = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0795d.e(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.G
    public kotlin.r.f getCoroutineContext() {
        return this.coroutineContext;
    }
}
