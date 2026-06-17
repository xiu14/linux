package com.bytedance.frameworks.baselib.network.http.p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g<K, V> {
    private Map<K, V> a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f5237c;

    /* renamed from: d, reason: collision with root package name */
    private int f5238d;

    /* renamed from: e, reason: collision with root package name */
    private int f5239e;

    /* renamed from: f, reason: collision with root package name */
    private int f5240f;

    /* renamed from: g, reason: collision with root package name */
    private int f5241g;

    public g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5237c = i;
        this.a = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
    }

    private void g(int i) {
        Map.Entry<K, V> next;
        while (this.b > i && !this.a.isEmpty() && (next = this.a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            next.getValue();
            this.a.remove(key);
            this.b--;
            this.f5239e++;
        }
        if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
            throw new IllegalStateException(g.class.getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    public final synchronized void a() {
        g(-1);
    }

    public final synchronized V b(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        V v = this.a.get(k);
        if (v != null) {
            this.f5240f++;
            return v;
        }
        this.f5241g++;
        return null;
    }

    public synchronized Map<K, V> c() {
        return this.a;
    }

    public final synchronized V d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f5238d++;
        this.b++;
        put = this.a.put(k, v);
        if (put != null) {
            this.b--;
        }
        g(this.f5237c);
        return put;
    }

    public final synchronized V e(K k) {
        V remove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        remove = this.a.remove(k);
        if (remove != null) {
            this.b--;
        }
        return remove;
    }

    public final synchronized int f() {
        return this.b;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f5240f;
        i2 = this.f5241g + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f5237c), Integer.valueOf(this.f5240f), Integer.valueOf(this.f5241g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
