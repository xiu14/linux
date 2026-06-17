package com.bytedance.bdinstall.m0;

import android.content.Context;
import com.bytedance.bdinstall.I;
import com.bytedance.bdinstall.Q;

/* loaded from: classes.dex */
class l implements Runnable {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Q q;
        n nVar;
        String str;
        com.bytedance.bdinstall.g0.c cVar;
        com.bytedance.bdinstall.g0.c cVar2;
        boolean z;
        n nVar2;
        context = this.a.f4067d;
        q = this.a.j;
        if (com.bytedance.bdinstall.util.g.d(context, q).getBoolean("_install_started_v2", false)) {
            nVar = this.a.h;
            if (nVar != null) {
                nVar2 = this.a.h;
                str = nVar2.a;
            } else {
                str = null;
            }
            cVar = this.a.i;
            if (cVar != null) {
                cVar2 = this.a.i;
                z = this.a.f4066c;
                cVar2.b(new com.bytedance.bdinstall.g0.i.d(new I(str, z)));
            }
            k.g(this.a, null);
        }
    }
}
