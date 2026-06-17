package com.alibaba.fastjson;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class b extends a implements List<Object>, Cloneable, RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private final List<Object> f1467f;

    /* renamed from: g, reason: collision with root package name */
    protected transient Object f1468g;
    protected transient Type h;

    public b() {
        this.f1467f = new ArrayList(10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f1467f.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Object> collection) {
        return this.f1467f.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f1467f.clear();
    }

    public Object clone() {
        return new b(new ArrayList(this.f1467f));
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f1467f.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f1467f.containsAll(collection);
    }

    public Type e() {
        return this.h;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f1467f.equals(obj);
    }

    public Object f() {
        return this.f1468g;
    }

    public void g(Type type) {
        this.h = type;
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.f1467f.get(i);
    }

    public void h(Object obj) {
        this.f1468g = obj;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f1467f.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f1467f.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f1467f.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f1467f.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f1467f.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return this.f1467f.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f1467f.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f1467f.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f1467f.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return this.f1467f.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f1467f.size();
    }

    @Override // java.util.List
    public List<Object> subList(int i, int i2) {
        return this.f1467f.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f1467f.toArray();
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.f1467f.add(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Object> collection) {
        return this.f1467f.addAll(i, collection);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i) {
        return this.f1467f.listIterator(i);
    }

    @Override // java.util.List
    public Object remove(int i) {
        return this.f1467f.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f1467f.toArray(tArr);
    }

    public b(List<Object> list) {
        this.f1467f = list;
    }
}
