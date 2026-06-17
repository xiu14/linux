package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s implements k {
    private final Set<com.bumptech.glide.request.k.h<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public void d() {
        this.a.clear();
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            ((com.bumptech.glide.request.k.h) it2.next()).f();
        }
    }

    @NonNull
    public List<com.bumptech.glide.request.k.h<?>> g() {
        return com.bumptech.glide.util.j.e(this.a);
    }

    public void l(@NonNull com.bumptech.glide.request.k.h<?> hVar) {
        this.a.add(hVar);
    }

    public void m(@NonNull com.bumptech.glide.request.k.h<?> hVar) {
        this.a.remove(hVar);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            ((com.bumptech.glide.request.k.h) it2.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            ((com.bumptech.glide.request.k.h) it2.next()).onStart();
        }
    }
}
