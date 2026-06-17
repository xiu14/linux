package com.bumptech.glide.load.j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class q {
    private final s a;
    private final a b;

    private static class a {
        private final Map<Class<?>, C0035a<?>> a = new HashMap();

        /* renamed from: com.bumptech.glide.load.j.q$a$a, reason: collision with other inner class name */
        private static class C0035a<Model> {
            final List<o<Model, ?>> a;

            public C0035a(List<o<Model, ?>> list) {
                this.a = list;
            }
        }

        a() {
        }

        public void a() {
            this.a.clear();
        }

        @Nullable
        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C0035a<?> c0035a = this.a.get(cls);
            if (c0035a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c0035a.a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.a.put(cls, new C0035a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(@NonNull Pools.Pool<List<Throwable>> pool) {
        s sVar = new s(pool);
        this.b = new a();
        this.a = sVar;
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        this.a.a(cls, cls2, pVar);
        this.b.a();
    }

    @NonNull
    public synchronized List<Class<?>> b(@NonNull Class<?> cls) {
        return this.a.e(cls);
    }

    @NonNull
    public <A> List<o<A, ?>> c(@NonNull A a2) {
        List b;
        Class<?> cls = a2.getClass();
        synchronized (this) {
            b = this.b.b(cls);
            if (b == null) {
                b = Collections.unmodifiableList(this.a.d(cls));
                this.b.c(cls, b);
            }
        }
        if (b.isEmpty()) {
            throw new g.c(a2);
        }
        int size = b.size();
        List<o<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            o<A, ?> oVar = (o) b.get(i);
            if (oVar.a(a2)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(oVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new g.c(a2, (List<o<A, ?>>) b);
        }
        return emptyList;
    }
}
