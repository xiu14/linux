package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class T implements U {
    private final Future<?> a;

    public T(Future<?> future) {
        this.a = future;
    }

    @Override // kotlinx.coroutines.U
    public void b() {
        this.a.cancel(false);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DisposableFutureHandle[");
        M.append(this.a);
        M.append(']');
        return M.toString();
    }
}
