package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T>, kotlin.s.c.E.a {
    private State a = State.NotReady;
    private T b;

    protected abstract void a();

    protected final void b() {
        this.a = State.Done;
    }

    protected final void c(T t) {
        this.b = t;
        this.a = State.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        State state = this.a;
        State state2 = State.Failed;
        if (!(state != state2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.a = state2;
            a();
            if (this.a == State.Ready) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = State.NotReady;
        return this.b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
