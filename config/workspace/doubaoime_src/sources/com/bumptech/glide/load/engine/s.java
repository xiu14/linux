package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class s {
    private final Map<com.bumptech.glide.load.d, l<?>> a = new HashMap();
    private final Map<com.bumptech.glide.load.d, l<?>> b = new HashMap();

    s() {
    }

    private Map<com.bumptech.glide.load.d, l<?>> b(boolean z) {
        return z ? this.b : this.a;
    }

    l<?> a(com.bumptech.glide.load.d dVar, boolean z) {
        return (z ? this.b : this.a).get(dVar);
    }

    void c(com.bumptech.glide.load.d dVar, l<?> lVar) {
        b(lVar.j()).put(dVar, lVar);
    }

    void d(com.bumptech.glide.load.d dVar, l<?> lVar) {
        Map<com.bumptech.glide.load.d, l<?>> b = b(lVar.j());
        if (lVar.equals(b.get(dVar))) {
            b.remove(dVar);
        }
    }
}
