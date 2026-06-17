package com.bumptech.glide.load.j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public interface o<Model, Data> {

    public static class a<Data> {
        public final com.bumptech.glide.load.d a;
        public final List<com.bumptech.glide.load.d> b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f1715c;

        public a(@NonNull com.bumptech.glide.load.d dVar, @NonNull com.bumptech.glide.load.data.d<Data> dVar2) {
            List<com.bumptech.glide.load.d> emptyList = Collections.emptyList();
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.a = dVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.b = emptyList;
            Objects.requireNonNull(dVar2, "Argument must not be null");
            this.f1715c = dVar2;
        }
    }

    boolean a(@NonNull Model model);

    @Nullable
    a<Data> b(@NonNull Model model, int i, int i2, @NonNull com.bumptech.glide.load.f fVar);
}
