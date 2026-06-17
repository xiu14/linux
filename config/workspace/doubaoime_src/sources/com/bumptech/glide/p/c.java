package com.bumptech.glide.p;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.k.g.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final t<?, ?, ?> f1827c = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);
    private final ArrayMap<com.bumptech.glide.util.i, t<?, ?, ?>> a = new ArrayMap<>();
    private final AtomicReference<com.bumptech.glide.util.i> b = new AtomicReference<>();

    @Nullable
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        com.bumptech.glide.util.i andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new com.bumptech.glide.util.i();
        }
        andSet.a(cls, cls2, cls3);
        synchronized (this.a) {
            tVar = (t) this.a.get(andSet);
        }
        this.b.set(andSet);
        return tVar;
    }

    public boolean b(@Nullable t<?, ?, ?> tVar) {
        return f1827c.equals(tVar);
    }

    public void c(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable t<?, ?, ?> tVar) {
        synchronized (this.a) {
            ArrayMap<com.bumptech.glide.util.i, t<?, ?, ?>> arrayMap = this.a;
            com.bumptech.glide.util.i iVar = new com.bumptech.glide.util.i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f1827c;
            }
            arrayMap.put(iVar, tVar);
        }
    }
}
