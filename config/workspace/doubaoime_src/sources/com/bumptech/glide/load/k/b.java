package com.bumptech.glide.load.k;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import java.util.Objects;

/* loaded from: classes.dex */
public class b<T> implements v<T> {
    protected final T a;

    public b(@NonNull T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.a = t;
    }

    @Override // com.bumptech.glide.load.engine.v
    public final int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<T> c() {
        return (Class<T>) this.a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public final T get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}
