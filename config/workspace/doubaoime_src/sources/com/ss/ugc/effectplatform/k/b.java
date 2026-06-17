package com.ss.ugc.effectplatform.k;

/* loaded from: classes2.dex */
public final class b implements Runnable {
    final /* synthetic */ kotlin.s.b.a a;

    b(kotlin.s.b.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.invoke();
    }
}
