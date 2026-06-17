package com.bumptech.glide.util.k;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class d {

    private static class b extends d {
        private volatile boolean a;

        b() {
            super(null);
        }

        @Override // com.bumptech.glide.util.k.d
        public void b(boolean z) {
            this.a = z;
        }

        @Override // com.bumptech.glide.util.k.d
        public void c() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    d(a aVar) {
    }

    @NonNull
    public static d a() {
        return new b();
    }

    abstract void b(boolean z);

    public abstract void c();
}
