package com.bumptech.glide.manager;

import com.bumptech.glide.manager.q;
import java.util.Objects;

/* loaded from: classes.dex */
class r implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ q.d.a b;

    r(q.d.a aVar, boolean z) {
        this.b = aVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        q.d.a aVar = this.b;
        boolean z = this.a;
        Objects.requireNonNull(aVar);
        com.bumptech.glide.util.j.a();
        q.d dVar = q.d.this;
        boolean z2 = dVar.a;
        dVar.a = z;
        if (z2 != z) {
            dVar.b.a(z);
        }
    }
}
