package kotlinx.coroutines;

import java.util.concurrent.Future;

/* renamed from: kotlinx.coroutines.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0806h extends AbstractC0808i {
    private final Future<?> a;

    public C0806h(Future<?> future) {
        this.a = future;
    }

    @Override // kotlinx.coroutines.AbstractC0810j
    public void a(Throwable th) {
        if (th != null) {
            this.a.cancel(false);
        }
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Throwable th) {
        if (th != null) {
            this.a.cancel(false);
        }
        return kotlin.o.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CancelFutureOnCancel[");
        M.append(this.a);
        M.append(']');
        return M.toString();
    }
}
