package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class f {
    private static final f b = new f();
    private final LruCache<String, com.airbnb.lottie.g> a = new LruCache<>(20);

    @VisibleForTesting
    f() {
    }

    public static f b() {
        return b;
    }

    @Nullable
    public com.airbnb.lottie.g a(@Nullable String str) {
        return this.a.get(str);
    }

    public void c(@Nullable String str, com.airbnb.lottie.g gVar) {
        if (str == null) {
            return;
        }
        this.a.put(str, gVar);
    }
}
