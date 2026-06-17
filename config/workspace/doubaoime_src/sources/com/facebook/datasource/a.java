package com.facebook.datasource;

/* loaded from: classes2.dex */
class a implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ f b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f6327c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractDataSource f6328d;

    a(AbstractDataSource abstractDataSource, boolean z, f fVar, boolean z2) {
        this.f6328d = abstractDataSource;
        this.a = z;
        this.b = fVar;
        this.f6327c = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a) {
            this.b.b(this.f6328d);
        } else if (this.f6327c) {
            this.b.a(this.f6328d);
        } else {
            this.b.c(this.f6328d);
        }
    }
}
