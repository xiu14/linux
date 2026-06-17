package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
public interface d<T> {

    public interface a<T> {
        void c(@NonNull Exception exc);

        void f(@Nullable T t);
    }

    @NonNull
    Class<T> a();

    void b();

    void cancel();

    @NonNull
    DataSource d();

    void e(@NonNull Priority priority, @NonNull a<? super T> aVar);
}
