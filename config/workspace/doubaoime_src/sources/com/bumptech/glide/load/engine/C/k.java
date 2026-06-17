package com.bumptech.glide.load.engine.C;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.util.k.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {
    private final com.bumptech.glide.util.g<com.bumptech.glide.load.d, String> a = new com.bumptech.glide.util.g<>(1000);
    private final Pools.Pool<b> b = com.bumptech.glide.util.k.a.a(10, new a(this));

    class a implements a.b<b> {
        a(k kVar) {
        }

        @Override // com.bumptech.glide.util.k.a.b
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private static final class b implements a.d {
        final MessageDigest a;
        private final com.bumptech.glide.util.k.d b = com.bumptech.glide.util.k.d.a();

        b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // com.bumptech.glide.util.k.a.d
        @NonNull
        public com.bumptech.glide.util.k.d b() {
            return this.b;
        }
    }

    public String a(com.bumptech.glide.load.d dVar) {
        String e2;
        synchronized (this.a) {
            e2 = this.a.e(dVar);
        }
        if (e2 == null) {
            b acquire = this.b.acquire();
            Objects.requireNonNull(acquire, "Argument must not be null");
            b bVar = acquire;
            try {
                dVar.a(bVar.a);
                e2 = com.bumptech.glide.util.j.m(bVar.a.digest());
            } finally {
                this.b.release(bVar);
            }
        }
        synchronized (this.a) {
            this.a.i(dVar, e2);
        }
        return e2;
    }
}
