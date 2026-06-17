package com.bumptech.glide.util.k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    private static final e<Object> a = new C0047a();

    /* renamed from: com.bumptech.glide.util.k.a$a, reason: collision with other inner class name */
    class C0047a implements e<Object> {
        C0047a() {
        }

        @Override // com.bumptech.glide.util.k.a.e
        public void a(@NonNull Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    private static final class c<T> implements Pools.Pool<T> {
        private final b<T> a;
        private final e<T> b;

        /* renamed from: c, reason: collision with root package name */
        private final Pools.Pool<T> f1863c;

        c(@NonNull Pools.Pool<T> pool, @NonNull b<T> bVar, @NonNull e<T> eVar) {
            this.f1863c = pool;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            T acquire = this.f1863c.acquire();
            if (acquire == null) {
                acquire = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder M = e.a.a.a.a.M("Created new ");
                    M.append(acquire.getClass());
                    Log.v("FactoryPools", M.toString());
                }
            }
            if (acquire instanceof d) {
                acquire.b().b(false);
            }
            return (T) acquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t) {
            if (t instanceof d) {
                ((d) t).b().b(true);
            }
            this.b.a(t);
            return this.f1863c.release(t);
        }
    }

    public interface d {
        @NonNull
        com.bumptech.glide.util.k.d b();
    }

    public interface e<T> {
        void a(@NonNull T t);
    }

    @NonNull
    public static <T extends d> Pools.Pool<T> a(int i, @NonNull b<T> bVar) {
        return new c(new Pools.SynchronizedPool(i), bVar, a);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> b() {
        return new c(new Pools.SynchronizedPool(20), new com.bumptech.glide.util.k.b(), new com.bumptech.glide.util.k.c());
    }
}
