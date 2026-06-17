package com.bytedance.crash.a0;

/* loaded from: classes.dex */
class c implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f4558c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f4559d;

    c(a aVar, String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.f4558c = i;
        this.f4559d = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.c().a("activityLifeCycle", this.a + '.' + this.b + '@' + Long.toHexString(this.f4558c), this.f4559d);
    }
}
