package kotlinx.coroutines.N0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.N0.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0787c<T> extends s {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0787c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C0786b.a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.N0.s
    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C0786b.a;
        if (obj2 == obj3) {
            obj2 = c(obj);
            Object obj4 = this._consensus;
            if (obj4 != obj3) {
                obj2 = obj4;
            } else if (!a.compareAndSet(this, obj3, obj2)) {
                obj2 = this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract Object c(T t);
}
