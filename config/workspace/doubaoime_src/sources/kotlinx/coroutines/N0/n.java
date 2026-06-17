package kotlinx.coroutines.N0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class n<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public n(boolean z) {
        this._cur = new o(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            o oVar = (o) this._cur;
            int a2 = oVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, oVar, oVar.e());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            o oVar = (o) this._cur;
            if (oVar.b()) {
                return;
            } else {
                a.compareAndSet(this, oVar, oVar.e());
            }
        }
    }

    public final int c() {
        return ((o) this._cur).c();
    }

    public final E d() {
        while (true) {
            o oVar = (o) this._cur;
            E e2 = (E) oVar.f();
            if (e2 != o.h) {
                return e2;
            }
            a.compareAndSet(this, oVar, oVar.e());
        }
    }
}
