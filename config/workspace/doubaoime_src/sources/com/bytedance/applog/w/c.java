package com.bytedance.applog.w;

import android.util.Log;

/* loaded from: classes.dex */
public class c implements f {
    private final com.bytedance.applog.c a;

    public c(com.bytedance.applog.c cVar) {
        this.a = cVar;
        int i = g.j;
        h hVar = new h();
        hVar.a(cVar.k());
        hVar.d(1);
        hVar.g(Thread.currentThread().getName());
        hVar.e("Console logger is ready.");
        a(hVar.b());
    }

    @Override // com.bytedance.applog.w.f
    public void a(g gVar) {
        if (this.a.h0()) {
            int a = gVar.a();
            if (a == 0) {
                Log.v("AppLog", gVar.l());
                return;
            }
            if (a == 2) {
                Log.i("AppLog", gVar.l());
                return;
            }
            if (a == 3) {
                Log.w("AppLog", gVar.l(), gVar.c());
            } else if (a == 4 || a == 5) {
                Log.e("AppLog", gVar.l(), gVar.c());
            } else {
                Log.d("AppLog", gVar.toString());
            }
        }
    }
}
