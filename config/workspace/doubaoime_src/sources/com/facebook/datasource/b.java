package com.facebook.datasource;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ f a;
    final /* synthetic */ AbstractDataSource b;

    b(AbstractDataSource abstractDataSource, f fVar) {
        this.b = abstractDataSource;
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.d(this.b);
    }
}
