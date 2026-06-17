package com.bytedance.push.event.sync.g;

/* loaded from: classes2.dex */
class h implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ com.bytedance.push.settings.A.a.b b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f5685c;

    h(f fVar, String str, com.bytedance.push.settings.A.a.b bVar) {
        this.f5685c = fVar;
        this.a = str;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5685c.p(this.a, this.b);
    }
}
