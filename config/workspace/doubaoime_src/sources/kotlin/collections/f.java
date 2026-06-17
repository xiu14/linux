package kotlin.collections;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f<E> extends d<E> {

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f10101d = new Object[0];
    private int a;
    private Object[] b = f10101d;

    /* renamed from: c, reason: collision with root package name */
    private int f10102c;

    private final void c(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        int length = this.b.length;
        while (i < length && it2.hasNext()) {
            this.b[i] = it2.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it2.hasNext(); i3++) {
            this.b[i3] = it2.next();
        }
        this.f10102c = collection.size() + this.f10102c;
    }

    private final int d(int i) {
        return i == 0 ? g.y(this.b) : i - 1;
    }

    private final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f10101d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        g.i(objArr, objArr2, 0, this.a, objArr.length);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        g.i(objArr3, objArr2, length2 - i3, 0, i3);
        this.a = 0;
        this.b = objArr2;
    }

    private final int f(int i) {
        if (i == g.y(this.b)) {
            return 0;
        }
        return i + 1;
    }

    private final int g(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    private final int h(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // kotlin.collections.d
    public int a() {
        return this.f10102c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e2) {
        int a = a();
        if (i < 0 || i > a) {
            throw new IndexOutOfBoundsException(e.a.a.a.a.l("index: ", i, ", size: ", a));
        }
        if (i == a()) {
            addLast(e2);
            return;
        }
        if (i == 0) {
            e(a() + 1);
            int d2 = d(this.a);
            this.a = d2;
            this.b[d2] = e2;
            this.f10102c = a() + 1;
            return;
        }
        e(a() + 1);
        int h = h(this.a + i);
        if (i < ((a() + 1) >> 1)) {
            int d3 = d(h);
            int d4 = d(this.a);
            int i2 = this.a;
            if (d3 >= i2) {
                Object[] objArr = this.b;
                objArr[d4] = objArr[i2];
                g.i(objArr, objArr, i2, i2 + 1, d3 + 1);
            } else {
                Object[] objArr2 = this.b;
                g.i(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                g.i(objArr3, objArr3, 0, 1, d3 + 1);
            }
            this.b[d3] = e2;
            this.a = d4;
        } else {
            int h2 = h(a() + this.a);
            if (h < h2) {
                Object[] objArr4 = this.b;
                g.i(objArr4, objArr4, h + 1, h, h2);
            } else {
                Object[] objArr5 = this.b;
                g.i(objArr5, objArr5, 1, 0, h2);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                g.i(objArr6, objArr6, h + 1, h, objArr6.length - 1);
            }
            this.b[h] = e2;
        }
        this.f10102c = a() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        kotlin.s.c.l.f(collection, "elements");
        int a = a();
        if (i < 0 || i > a) {
            throw new IndexOutOfBoundsException(e.a.a.a.a.l("index: ", i, ", size: ", a));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == a()) {
            return addAll(collection);
        }
        e(collection.size() + a());
        int h = h(a() + this.a);
        int h2 = h(this.a + i);
        int size = collection.size();
        if (i < ((a() + 1) >> 1)) {
            int i2 = this.a;
            int i3 = i2 - size;
            if (h2 < i2) {
                Object[] objArr = this.b;
                g.i(objArr, objArr, i3, i2, objArr.length);
                if (size >= h2) {
                    Object[] objArr2 = this.b;
                    g.i(objArr2, objArr2, objArr2.length - size, 0, h2);
                } else {
                    Object[] objArr3 = this.b;
                    g.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    g.i(objArr4, objArr4, 0, size, h2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.b;
                g.i(objArr5, objArr5, i3, i2, h2);
            } else {
                Object[] objArr6 = this.b;
                i3 += objArr6.length;
                int i4 = h2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    g.i(objArr6, objArr6, i3, i2, h2);
                } else {
                    g.i(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.b;
                    g.i(objArr7, objArr7, 0, this.a + length, h2);
                }
            }
            this.a = i3;
            c(g(h2 - size), collection);
        } else {
            int i5 = h2 + size;
            if (h2 < h) {
                int i6 = size + h;
                Object[] objArr8 = this.b;
                if (i6 <= objArr8.length) {
                    g.i(objArr8, objArr8, i5, h2, h);
                } else if (i5 >= objArr8.length) {
                    g.i(objArr8, objArr8, i5 - objArr8.length, h2, h);
                } else {
                    int length2 = h - (i6 - objArr8.length);
                    g.i(objArr8, objArr8, 0, length2, h);
                    Object[] objArr9 = this.b;
                    g.i(objArr9, objArr9, i5, h2, length2);
                }
            } else {
                Object[] objArr10 = this.b;
                g.i(objArr10, objArr10, size, 0, h);
                Object[] objArr11 = this.b;
                if (i5 >= objArr11.length) {
                    g.i(objArr11, objArr11, i5 - objArr11.length, h2, objArr11.length);
                } else {
                    g.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.b;
                    g.i(objArr12, objArr12, i5, h2, objArr12.length - size);
                }
            }
            c(h2, collection);
        }
        return true;
    }

    public final void addLast(E e2) {
        e(a() + 1);
        this.b[h(this.a + a())] = e2;
        this.f10102c = a() + 1;
    }

    @Override // kotlin.collections.d
    public E b(int i) {
        int a = a();
        if (i < 0 || i >= a) {
            throw new IndexOutOfBoundsException(e.a.a.a.a.l("index: ", i, ", size: ", a));
        }
        if (i == g.w(this)) {
            return removeLast();
        }
        if (i == 0) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            Object[] objArr = this.b;
            int i2 = this.a;
            E e2 = (E) objArr[i2];
            objArr[i2] = null;
            this.a = f(i2);
            this.f10102c = a() - 1;
            return e2;
        }
        int h = h(this.a + i);
        E e3 = (E) this.b[h];
        if (i < (a() >> 1)) {
            int i3 = this.a;
            if (h >= i3) {
                Object[] objArr2 = this.b;
                g.i(objArr2, objArr2, i3 + 1, i3, h);
            } else {
                Object[] objArr3 = this.b;
                g.i(objArr3, objArr3, 1, 0, h);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                int i4 = this.a;
                g.i(objArr4, objArr4, i4 + 1, i4, objArr4.length - 1);
            }
            Object[] objArr5 = this.b;
            int i5 = this.a;
            objArr5[i5] = null;
            this.a = f(i5);
        } else {
            int h2 = h(g.w(this) + this.a);
            if (h <= h2) {
                Object[] objArr6 = this.b;
                g.i(objArr6, objArr6, h, h + 1, h2 + 1);
            } else {
                Object[] objArr7 = this.b;
                g.i(objArr7, objArr7, h, h + 1, objArr7.length);
                Object[] objArr8 = this.b;
                objArr8[objArr8.length - 1] = objArr8[0];
                g.i(objArr8, objArr8, 0, 1, h2 + 1);
            }
            this.b[h2] = null;
        }
        this.f10102c = a() - 1;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int h = h(this.a + a());
        int i = this.a;
        if (i < h) {
            g.p(this.b, null, i, h);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            g.p(objArr, null, this.a, objArr.length);
            g.p(this.b, null, 0, h);
        }
        this.a = 0;
        this.f10102c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int a = a();
        if (i < 0 || i >= a) {
            throw new IndexOutOfBoundsException(e.a.a.a.a.l("index: ", i, ", size: ", a));
        }
        return (E) this.b[h(this.a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int h = h(this.a + a());
        int i2 = this.a;
        if (i2 < h) {
            while (i2 < h) {
                if (kotlin.s.c.l.a(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < h) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < h; i3++) {
                    if (kotlin.s.c.l.a(obj, this.b[i3])) {
                        i2 = i3 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (kotlin.s.c.l.a(obj, this.b[i2])) {
                i = this.a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int y;
        int i;
        int h = h(this.a + a());
        int i2 = this.a;
        if (i2 < h) {
            y = h - 1;
            if (i2 <= y) {
                while (!kotlin.s.c.l.a(obj, this.b[y])) {
                    if (y != i2) {
                        y--;
                    }
                }
                i = this.a;
                return y - i;
            }
            return -1;
        }
        if (i2 > h) {
            int i3 = h - 1;
            while (true) {
                if (-1 >= i3) {
                    y = g.y(this.b);
                    int i4 = this.a;
                    if (i4 <= y) {
                        while (!kotlin.s.c.l.a(obj, this.b[y])) {
                            if (y != i4) {
                                y--;
                            }
                        }
                        i = this.a;
                    }
                } else {
                    if (kotlin.s.c.l.a(obj, this.b[i3])) {
                        y = i3 + this.b.length;
                        i = this.a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int h;
        kotlin.s.c.l.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.b.length == 0) == false) {
                int h2 = h(this.a + a());
                int i = this.a;
                if (i < h2) {
                    h = i;
                    while (i < h2) {
                        Object obj = this.b[i];
                        if (!collection.contains(obj)) {
                            this.b[h] = obj;
                            h++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    g.p(this.b, null, h, h2);
                } else {
                    int length = this.b.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.b;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!collection.contains(obj2)) {
                            this.b[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    h = h(i2);
                    for (int i3 = 0; i3 < h2; i3++) {
                        Object[] objArr2 = this.b;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.b[h] = obj3;
                            h = f(h);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f10102c = g(h - this.a);
                }
            }
        }
        return z;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int h = h(g.w(this) + this.a);
        Object[] objArr = this.b;
        E e2 = (E) objArr[h];
        objArr[h] = null;
        this.f10102c = a() - 1;
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int h;
        kotlin.s.c.l.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.b.length == 0) == false) {
                int h2 = h(this.a + a());
                int i = this.a;
                if (i < h2) {
                    h = i;
                    while (i < h2) {
                        Object obj = this.b[i];
                        if (collection.contains(obj)) {
                            this.b[h] = obj;
                            h++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    g.p(this.b, null, h, h2);
                } else {
                    int length = this.b.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.b;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.b[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    h = h(i2);
                    for (int i3 = 0; i3 < h2; i3++) {
                        Object[] objArr2 = this.b;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            this.b[h] = obj3;
                            h = f(h);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f10102c = g(h - this.a);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e2) {
        int a = a();
        if (i < 0 || i >= a) {
            throw new IndexOutOfBoundsException(e.a.a.a.a.l("index: ", i, ", size: ", a));
        }
        int h = h(this.a + i);
        Object[] objArr = this.b;
        E e3 = (E) objArr[h];
        objArr[h] = e2;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        kotlin.s.c.l.f(tArr, "array");
        if (tArr.length < a()) {
            int a = a();
            kotlin.s.c.l.f(tArr, "reference");
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), a);
            kotlin.s.c.l.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) newInstance);
        }
        kotlin.s.c.l.d(tArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int h = h(this.a + a());
        int i = this.a;
        if (i < h) {
            g.j(this.b, tArr, 0, i, h, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            g.i(objArr, tArr, 0, this.a, objArr.length);
            Object[] objArr2 = this.b;
            g.i(objArr2, tArr, objArr2.length - this.a, 0, h);
        }
        if (tArr.length > a()) {
            tArr[a()] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        kotlin.s.c.l.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        e(collection.size() + a());
        c(h(this.a + a()), collection);
        return true;
    }
}
