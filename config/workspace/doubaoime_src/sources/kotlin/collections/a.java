package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class a<E> implements Collection<E>, kotlin.s.c.E.a {

    /* renamed from: kotlin.collections.a$a, reason: collision with other inner class name */
    static final class C0466a extends kotlin.s.c.m implements kotlin.s.b.l<E, CharSequence> {
        final /* synthetic */ a<E> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0466a(a<? extends E> aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // kotlin.s.b.l
        public CharSequence invoke(Object obj) {
            return obj == this.a ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected a() {
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e2) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (kotlin.s.c.l.a(it2.next(), e2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        return a() == 0;
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
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.s.c.f.a(this);
    }

    public String toString() {
        return g.C(this, ", ", "[", "]", 0, null, new C0466a(this), 24, null);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.s.c.l.f(tArr, "array");
        T[] tArr2 = (T[]) kotlin.s.c.f.b(this, tArr);
        kotlin.s.c.l.d(tArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return tArr2;
    }
}
