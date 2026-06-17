package com.bumptech.glide.util;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements b<T> {
        private volatile T a;
        final /* synthetic */ b b;

        a(b bVar) {
            this.b = bVar;
        }

        @Override // com.bumptech.glide.util.e.b
        public T get() {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        T t = (T) this.b.get();
                        Objects.requireNonNull(t, "Argument must not be null");
                        this.a = t;
                    }
                }
            }
            return this.a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
