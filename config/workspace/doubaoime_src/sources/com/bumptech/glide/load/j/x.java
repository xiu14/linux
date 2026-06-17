package com.bumptech.glide.load.j;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;

/* loaded from: classes.dex */
public class x<Model> implements o<Model, Model> {
    private static final x<?> a = new x<>();

    public static class a<Model> implements p<Model, Model> {
        private static final a<?> a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Model, Model> d(s sVar) {
            return x.c();
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {
        private final Model a;

        b(Model model) {
            this.a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Model> a() {
            return (Class<Model>) this.a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super Model> aVar) {
            aVar.f(this.a);
        }
    }

    @Deprecated
    public x() {
    }

    public static <T> x<T> c() {
        return (x<T>) a;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a<Model> b(@NonNull Model model, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.q.b(model), new b(model));
    }
}
