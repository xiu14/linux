package com.bumptech.glide.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private final List<C0043a<?>> a = new ArrayList();

    /* renamed from: com.bumptech.glide.p.a$a, reason: collision with other inner class name */
    private static final class C0043a<T> {
        private final Class<T> a;
        final com.bumptech.glide.load.a<T> b;

        C0043a(@NonNull Class<T> cls, @NonNull com.bumptech.glide.load.a<T> aVar) {
            this.a = cls;
            this.b = aVar;
        }

        boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull com.bumptech.glide.load.a<T> aVar) {
        this.a.add(new C0043a<>(cls, aVar));
    }

    @Nullable
    public synchronized <T> com.bumptech.glide.load.a<T> b(@NonNull Class<T> cls) {
        for (C0043a<?> c0043a : this.a) {
            if (c0043a.a(cls)) {
                return (com.bumptech.glide.load.a<T>) c0043a.b;
            }
        }
        return null;
    }
}
