package d.a.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.s.c.f;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a<V> implements List<V>, Object {
    private final /* synthetic */ List a;

    public a() {
        this(false, 1);
    }

    public a(boolean z) {
        List arrayList;
        if (z) {
            arrayList = Collections.synchronizedList(new ArrayList());
            l.b(arrayList, "Collections.synchronizedList(mutableListOf())");
        } else {
            arrayList = new ArrayList();
        }
        this.a = arrayList;
    }

    public /* synthetic */ a(boolean z, int i) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // java.util.List
    public void add(int i, V v) {
        this.a.add(i, v);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(V v) {
        return this.a.add(v);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends V> collection) {
        l.g(collection, "elements");
        return this.a.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        l.g(collection, "elements");
        return this.a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        l.g(collection, "elements");
        return this.a.containsAll(collection);
    }

    @Override // java.util.List
    public V get(int i) {
        return (V) this.a.get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<V> listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List
    public ListIterator<V> listIterator(int i) {
        return this.a.listIterator(i);
    }

    @Override // java.util.List
    public final V remove(int i) {
        return (V) this.a.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        l.g(collection, "elements");
        return this.a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        l.g(collection, "elements");
        return this.a.retainAll(collection);
    }

    @Override // java.util.List
    public V set(int i, V v) {
        return (V) this.a.set(i, v);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public List<V> subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f.b(this, tArr);
    }
}
