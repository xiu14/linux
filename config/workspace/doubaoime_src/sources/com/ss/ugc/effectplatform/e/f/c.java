package com.ss.ugc.effectplatform.e.f;

import com.ss.ugc.effectplatform.e.f.a;

/* loaded from: classes2.dex */
public final class c implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ a.c b;

    c(a aVar, a.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.x(this.b);
    }
}
