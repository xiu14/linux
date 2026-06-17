package com.bumptech.glide.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d {
    private final AtomicReference<i> a = new AtomicReference<>();
    private final ArrayMap<i, List<Class<?>>> b = new ArrayMap<>();

    @Nullable
    public List<Class<?>> a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        i andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new i(cls, cls2, cls3), list);
        }
    }
}
