package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class c<E> extends kotlin.collections.a<E> implements List<E>, kotlin.s.c.E.a {

    private class a implements Iterator<E>, kotlin.s.c.E.a {
        private int a;

        public a() {
        }

        protected final int a() {
            return this.a;
        }

        protected final void b(int i) {
            this.a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < c.this.a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            int i = this.a;
            this.a = i + 1;
            return cVar.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private class b extends c<E>.a implements ListIterator<E>, kotlin.s.c.E.a {
        public b(int i) {
            super();
            int a = c.this.a();
            if (i < 0 || i > a) {
                throw new IndexOutOfBoundsException(e.a.a.a.a.l("index: ", i, ", size: ", a));
            }
            b(i);
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            b(a() - 1);
            return cVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    private static final class C0467c<E> extends c<E> implements RandomAccess {
        private final c<E> a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private int f10100c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0467c(c<? extends E> cVar, int i, int i2) {
            kotlin.s.c.l.f(cVar, "list");
            this.a = cVar;
            this.b = i;
            int a = cVar.a();
            if (i < 0 || i2 > a) {
                StringBuilder O = e.a.a.a.a.O("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                O.append(a);
                throw new IndexOutOfBoundsException(O.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(e.a.a.a.a.l("fromIndex: ", i, " > toIndex: ", i2));
            }
            this.f10100c = i2 - i;
        }

        @Override // kotlin.collections.a
        public int a() {
            return this.f10100c;
        }

        @Override // kotlin.collections.c, java.util.List
        public E get(int i) {
            int i2 = this.f10100c;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(e.a.a.a.a.l("index: ", i, ", size: ", i2));
            }
            return this.a.get(this.b + i);
        }
    }

    protected c() {
    }

    @Override // java.util.List
    public void add(int i, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        kotlin.s.c.l.f(this, "c");
        kotlin.s.c.l.f(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it2 = collection.iterator();
            Iterator<E> it3 = iterator();
            while (it3.hasNext()) {
                if (!kotlin.s.c.l.a(it3.next(), it2.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        kotlin.s.c.l.f(this, "c");
        Iterator<E> it2 = iterator();
        int i = 1;
        while (it2.hasNext()) {
            E next = it2.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(E e2) {
        Iterator<E> it2 = iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (kotlin.s.c.l.a(it2.next(), e2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.List
    public int lastIndexOf(E e2) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.s.c.l.a(listIterator.previous(), e2)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new b(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new C0467c(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new b(i);
    }
}
