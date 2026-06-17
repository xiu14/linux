package com.bumptech.glide.load.j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class r<Model, Data> implements o<Model, Data> {
    private final List<o<Model, Data>> a;
    private final Pools.Pool<List<Throwable>> b;

    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {
        private final List<com.bumptech.glide.load.data.d<Data>> a;
        private final Pools.Pool<List<Throwable>> b;

        /* renamed from: c, reason: collision with root package name */
        private int f1716c;

        /* renamed from: d, reason: collision with root package name */
        private Priority f1717d;

        /* renamed from: e, reason: collision with root package name */
        private d.a<? super Data> f1718e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private List<Throwable> f1719f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1720g;

        a(@NonNull List<com.bumptech.glide.load.data.d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.b = pool;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.a = list;
            this.f1716c = 0;
        }

        private void g() {
            if (this.f1720g) {
                return;
            }
            if (this.f1716c < this.a.size() - 1) {
                this.f1716c++;
                e(this.f1717d, this.f1718e);
            } else {
                Objects.requireNonNull(this.f1719f, "Argument must not be null");
                this.f1718e.c(new com.bumptech.glide.load.engine.q("Fetch failed", new ArrayList(this.f1719f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f1719f;
            if (list != null) {
                this.b.release(list);
            }
            this.f1719f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@NonNull Exception exc) {
            List<Throwable> list = this.f1719f;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f1720g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource d() {
            return this.a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            this.f1717d = priority;
            this.f1718e = aVar;
            this.f1719f = this.b.acquire();
            this.a.get(this.f1716c).e(priority, this);
            if (this.f1720g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@Nullable Data data) {
            if (data != null) {
                this.f1718e.f(data);
            } else {
                g();
            }
        }
    }

    r(@NonNull List<o<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.a = list;
        this.b = pool;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Model model) {
        Iterator<o<Model, Data>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a<Data> b(@NonNull Model model, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        o.a<Data> b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.d dVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            o<Model, Data> oVar = this.a.get(i3);
            if (oVar.a(model) && (b = oVar.b(model, i, i2, fVar)) != null) {
                dVar = b.a;
                arrayList.add(b.f1715c);
            }
        }
        if (arrayList.isEmpty() || dVar == null) {
            return null;
        }
        return new o.a<>(dVar, new a(arrayList, this.b));
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MultiModelLoader{modelLoaders=");
        M.append(Arrays.toString(this.a.toArray()));
        M.append('}');
        return M.toString();
    }
}
