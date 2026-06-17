package kotlin.s.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.s.c.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0781a<T> implements Iterator<T>, kotlin.s.c.E.a {
    private final T[] a;
    private int b;

    public C0781a(T[] tArr) {
        l.f(tArr, "array");
        this.a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
