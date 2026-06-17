package kotlinx.coroutines.N0;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.N0.w;

/* loaded from: classes2.dex */
public abstract class w<S extends w<S>> extends f<S> {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10176d = AtomicIntegerFieldUpdater.newUpdater(w.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    private final long f10177c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public w(long j, S s, int i) {
        super(s);
        this.f10177c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // kotlinx.coroutines.N0.f
    public boolean d() {
        return this.cleanedAndPointers == j() && !e();
    }

    public final boolean h() {
        return f10176d.addAndGet(this, SupportMenu.CATEGORY_MASK) == j() && !e();
    }

    public final long i() {
        return this.f10177c;
    }

    public abstract int j();

    public final void k() {
        if (f10176d.incrementAndGet(this) != j() || e()) {
            return;
        }
        f();
    }

    public final boolean l() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (!(i != j() || e())) {
                return false;
            }
        } while (!f10176d.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
