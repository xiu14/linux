package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0824u {
    private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C0824u.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable a;

    public C0824u(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public C0824u(Throwable th, boolean z, int i) {
        ?? r2 = (i & 2) != 0 ? 0 : z;
        this.a = th;
        this._handled = r2;
    }
}
