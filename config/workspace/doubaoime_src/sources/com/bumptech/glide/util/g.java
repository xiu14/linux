package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g<T, Y> {
    private final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f1859c;

    static final class a<Y> {
        final Y a;
        final int b;

        a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public g(long j) {
        this.b = j;
    }

    public void a() {
        k(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public /* bridge */ /* synthetic */ v b(@NonNull com.bumptech.glide.load.d dVar, @Nullable v vVar) {
        return (v) i(dVar, vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public /* bridge */ /* synthetic */ v c(@NonNull com.bumptech.glide.load.d dVar) {
        return (v) j(dVar);
    }

    @Nullable
    public synchronized Y e(@NonNull T t) {
        a<Y> aVar;
        aVar = this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public synchronized long f() {
        return this.b;
    }

    protected int g(@Nullable Y y) {
        return 1;
    }

    protected void h(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    public synchronized Y i(@NonNull T t, @Nullable Y y) {
        int g2 = g(y);
        long j = g2;
        if (j >= this.b) {
            h(t, y);
            return null;
        }
        if (y != null) {
            this.f1859c += j;
        }
        a<Y> put = this.a.put(t, y == null ? null : new a<>(y, g2));
        if (put != null) {
            this.f1859c -= put.b;
            if (!put.a.equals(y)) {
                h(t, put.a);
            }
        }
        k(this.b);
        return put != null ? put.a : null;
    }

    @Nullable
    public synchronized Y j(@NonNull T t) {
        a<Y> remove = this.a.remove(t);
        if (remove == null) {
            return null;
        }
        this.f1859c -= remove.b;
        return remove.a;
    }

    protected synchronized void k(long j) {
        while (this.f1859c > j) {
            Iterator<Map.Entry<T, a<Y>>> it2 = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it2.next();
            a<Y> value = next.getValue();
            this.f1859c -= value.b;
            T key = next.getKey();
            it2.remove();
            h(key, value.a);
        }
    }
}
