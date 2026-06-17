package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.s.c.C0782b;

/* loaded from: classes2.dex */
final class e<T> implements Collection<T>, kotlin.s.c.E.a {
    private final T[] a;
    private final boolean b;

    public e(T[] tArr, boolean z) {
        kotlin.s.c.l.f(tArr, "values");
        this.a = tArr;
        this.b = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return g.g(this.a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        kotlin.s.c.l.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C0782b.a(this.a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.a;
        boolean z = this.b;
        kotlin.s.c.l.f(tArr, "<this>");
        if (z && kotlin.s.c.l.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.s.c.l.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.s.c.l.f(tArr, "array");
        return (T[]) kotlin.s.c.f.b(this, tArr);
    }
}
