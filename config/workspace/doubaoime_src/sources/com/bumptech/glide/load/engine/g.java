package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
interface g {

    public interface a {
        void a(com.bumptech.glide.load.d dVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar2, DataSource dataSource);

        void c();

        void d(com.bumptech.glide.load.d dVar, @Nullable Object obj, com.bumptech.glide.load.data.d<?> dVar2, DataSource dataSource, com.bumptech.glide.load.d dVar3);
    }

    boolean b();

    void cancel();
}
