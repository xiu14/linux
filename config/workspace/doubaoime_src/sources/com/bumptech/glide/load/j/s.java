package com.bumptech.glide.load.j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.g;
import com.bumptech.glide.load.j.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class s {

    /* renamed from: e, reason: collision with root package name */
    private static final c f1721e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f1722f = new a();
    private final List<b<?, ?>> a;
    private final c b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f1723c;

    /* renamed from: d, reason: collision with root package name */
    private final Pools.Pool<List<Throwable>> f1724d;

    private static class a implements o<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.j.o
        public boolean a(@NonNull Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.j.o
        @Nullable
        public o.a<Object> b(@NonNull Object obj, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
            return null;
        }
    }

    private static class b<Model, Data> {
        private final Class<Model> a;
        final Class<Data> b;

        /* renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f1725c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
            this.a = cls;
            this.b = cls2;
            this.f1725c = pVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }
    }

    public s(@NonNull Pools.Pool<List<Throwable>> pool) {
        c cVar = f1721e;
        this.a = new ArrayList();
        this.f1723c = new HashSet();
        this.f1724d = pool;
        this.b = cVar;
    }

    @NonNull
    private <Model, Data> o<Model, Data> b(@NonNull b<?, ?> bVar) {
        o<Model, Data> oVar = (o<Model, Data>) bVar.f1725c.d(this);
        Objects.requireNonNull(oVar, "Argument must not be null");
        return oVar;
    }

    synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.a;
        list.add(list.size(), bVar);
    }

    @NonNull
    public synchronized <Model, Data> o<Model, Data> c(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.f1723c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f1723c.add(bVar);
                    arrayList.add(b(bVar));
                    this.f1723c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                Pools.Pool<List<Throwable>> pool = this.f1724d;
                Objects.requireNonNull(cVar);
                return new r(arrayList, pool);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z) {
                throw new g.c((Class<?>) cls, (Class<?>) cls2);
            }
            return (o<Model, Data>) f1722f;
        } catch (Throwable th) {
            this.f1723c.clear();
            throw th;
        }
    }

    @NonNull
    synchronized <Model> List<o<Model, ?>> d(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.f1723c.contains(bVar) && bVar.a(cls)) {
                    this.f1723c.add(bVar);
                    o<? extends Object, ? extends Object> d2 = bVar.f1725c.d(this);
                    Objects.requireNonNull(d2, "Argument must not be null");
                    arrayList.add(d2);
                    this.f1723c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f1723c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    synchronized List<Class<?>> e(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
