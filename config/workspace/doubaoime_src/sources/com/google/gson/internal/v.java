package com.google.gson.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> i = new a();
    private final Comparator<? super K> a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    e<K, V> f6827c;

    /* renamed from: d, reason: collision with root package name */
    int f6828d;

    /* renamed from: e, reason: collision with root package name */
    int f6829e;

    /* renamed from: f, reason: collision with root package name */
    final e<K, V> f6830f;

    /* renamed from: g, reason: collision with root package name */
    private v<K, V>.b f6831g;
    private v<K, V>.c h;

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends v<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && v.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> b;
            if (!(obj instanceof Map.Entry) || (b = v.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            v.this.e(b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.f6828d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends v<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f6837f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return v.this.c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            v vVar = v.this;
            e<K, V> c2 = vVar.c(obj);
            if (c2 != null) {
                vVar.e(c2, true);
            }
            return c2 != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.f6828d;
        }
    }

    private abstract class d<T> implements Iterator<T> {
        e<K, V> a;
        e<K, V> b = null;

        /* renamed from: c, reason: collision with root package name */
        int f6832c;

        d() {
            this.a = v.this.f6830f.f6835d;
            this.f6832c = v.this.f6829e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.a;
            v vVar = v.this;
            if (eVar == vVar.f6830f) {
                throw new NoSuchElementException();
            }
            if (vVar.f6829e != this.f6832c) {
                throw new ConcurrentModificationException();
            }
            this.a = eVar.f6835d;
            this.b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != v.this.f6830f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            v.this.e(eVar, true);
            this.b = null;
            this.f6832c = v.this.f6829e;
        }
    }

    public v() {
        this(i, true);
    }

    private void d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.f6834c;
            int i2 = eVar2 != null ? eVar2.i : 0;
            int i3 = eVar3 != null ? eVar3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.f6834c;
                int i5 = (eVar4 != null ? eVar4.i : 0) - (eVar5 != null ? eVar5.i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    g(eVar);
                } else {
                    h(eVar3);
                    g(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.f6834c;
                int i6 = (eVar6 != null ? eVar6.i : 0) - (eVar7 != null ? eVar7.i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    h(eVar);
                } else {
                    g(eVar2);
                    h(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    private void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 == null) {
            this.f6827c = eVar2;
        } else if (eVar3.b == eVar) {
            eVar3.b = eVar2;
        } else {
            eVar3.f6834c = eVar2;
        }
    }

    private void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.f6834c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.f6834c;
        eVar.f6834c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        f(eVar, eVar3);
        eVar3.b = eVar;
        eVar.a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.i : 0, eVar4 != null ? eVar4.i : 0) + 1;
        eVar.i = max;
        eVar3.i = Math.max(max, eVar5 != null ? eVar5.i : 0) + 1;
    }

    private void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.f6834c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.f6834c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        f(eVar, eVar2);
        eVar2.f6834c = eVar;
        eVar.a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.i : 0, eVar5 != null ? eVar5.i : 0) + 1;
        eVar.i = max;
        eVar2.i = Math.max(max, eVar4 != null ? eVar4.i : 0) + 1;
    }

    e<K, V> a(K k, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.a;
        e<K, V> eVar2 = this.f6827c;
        if (eVar2 != null) {
            Comparable comparable = comparator == i ? (Comparable) k : null;
            while (true) {
                i2 = comparable != null ? comparable.compareTo(eVar2.f6837f) : comparator.compare(k, eVar2.f6837f);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.b : eVar2.f6834c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f6830f;
        if (eVar2 != null) {
            eVar = new e<>(this.b, eVar2, k, eVar4, eVar4.f6836e);
            if (i2 < 0) {
                eVar2.b = eVar;
            } else {
                eVar2.f6834c = eVar;
            }
            d(eVar2, true);
        } else {
            if (comparator == i && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.b, eVar2, k, eVar4, eVar4.f6836e);
            this.f6827c = eVar;
        }
        this.f6828d++;
        this.f6829e++;
        return eVar;
    }

    e<K, V> b(Map.Entry<?, ?> entry) {
        e<K, V> c2 = c(entry.getKey());
        if (c2 != null && Objects.equals(c2.h, entry.getValue())) {
            return c2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f6827c = null;
        this.f6828d = 0;
        this.f6829e++;
        e<K, V> eVar = this.f6830f;
        eVar.f6836e = eVar;
        eVar.f6835d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    void e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i2;
        if (z) {
            e<K, V> eVar4 = eVar.f6836e;
            eVar4.f6835d = eVar.f6835d;
            eVar.f6835d.f6836e = eVar4;
        }
        e<K, V> eVar5 = eVar.b;
        e<K, V> eVar6 = eVar.f6834c;
        e<K, V> eVar7 = eVar.a;
        int i3 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.b = null;
            } else if (eVar6 != null) {
                f(eVar, eVar6);
                eVar.f6834c = null;
            } else {
                f(eVar, null);
            }
            d(eVar7, false);
            this.f6828d--;
            this.f6829e++;
            return;
        }
        if (eVar5.i > eVar6.i) {
            e<K, V> eVar8 = eVar5.f6834c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.f6834c;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.b;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.b;
                }
            }
            eVar3 = eVar2;
        }
        e(eVar3, false);
        e<K, V> eVar11 = eVar.b;
        if (eVar11 != null) {
            i2 = eVar11.i;
            eVar3.b = eVar11;
            eVar11.a = eVar3;
            eVar.b = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar12 = eVar.f6834c;
        if (eVar12 != null) {
            i3 = eVar12.i;
            eVar3.f6834c = eVar12;
            eVar12.a = eVar3;
            eVar.f6834c = null;
        }
        eVar3.i = Math.max(i2, i3) + 1;
        f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        v<K, V>.b bVar = this.f6831g;
        if (bVar != null) {
            return bVar;
        }
        v<K, V>.b bVar2 = new b();
        this.f6831g = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> c2 = c(obj);
        if (c2 != null) {
            return c2.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        v<K, V>.c cVar = this.h;
        if (cVar != null) {
            return cVar;
        }
        v<K, V>.c cVar2 = new c();
        this.h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        if (v == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> a2 = a(k, true);
        V v2 = a2.h;
        a2.h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> c2 = c(obj);
        if (c2 != null) {
            e(c2, true);
        }
        if (c2 != null) {
            return c2.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6828d;
    }

    public v(boolean z) {
        this(i, z);
    }

    public v(Comparator<? super K> comparator, boolean z) {
        this.f6828d = 0;
        this.f6829e = 0;
        this.a = comparator;
        this.b = z;
        this.f6830f = new e<>(z);
    }

    static final class e<K, V> implements Map.Entry<K, V> {
        e<K, V> a;
        e<K, V> b;

        /* renamed from: c, reason: collision with root package name */
        e<K, V> f6834c;

        /* renamed from: d, reason: collision with root package name */
        e<K, V> f6835d;

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f6836e;

        /* renamed from: f, reason: collision with root package name */
        final K f6837f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f6838g;
        V h;
        int i;

        e(boolean z) {
            this.f6837f = null;
            this.f6838g = z;
            this.f6836e = this;
            this.f6835d = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f6837f;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.h;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6837f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f6837f;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.h;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (v == null && !this.f6838g) {
                throw new NullPointerException("value == null");
            }
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        public String toString() {
            return this.f6837f + ContainerUtils.KEY_VALUE_DELIMITER + this.h;
        }

        e(boolean z, e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.a = eVar;
            this.f6837f = k;
            this.f6838g = z;
            this.i = 1;
            this.f6835d = eVar2;
            this.f6836e = eVar3;
            eVar3.f6835d = this;
            eVar2.f6836e = this;
        }
    }
}
