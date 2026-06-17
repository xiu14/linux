package com.bumptech.glide.util.k;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.k.a;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class c<T> implements a.e<List<T>> {
    c() {
    }

    @Override // com.bumptech.glide.util.k.a.e
    public void a(@NonNull Object obj) {
        ((List) obj).clear();
    }
}
