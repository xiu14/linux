package com.bytedance.bdinstall;

import com.bytedance.bdinstall.f0.b;

/* loaded from: classes.dex */
class M implements b.a {
    final /* synthetic */ Runnable a;
    final /* synthetic */ K b;

    M(K k, Runnable runnable) {
        this.b = k;
        this.a = runnable;
    }

    @Override // com.bytedance.bdinstall.f0.b.a
    public void onResume() {
        com.bytedance.bdinstall.f0.b bVar;
        bVar = this.b.f3944d;
        ((com.bytedance.bdinstall.f0.a) bVar).c(null);
        int i = C0640u.a;
        C0643x.h(this.b.a.i(), this.a);
    }
}
