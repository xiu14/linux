package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public interface s<E> {
    Object c(kotlin.r.d<? super g<? extends E>> dVar);

    void d(CancellationException cancellationException);

    Object e(kotlin.r.d<? super E> dVar);
}
