package com.bytedance.apm6.cpu.exception.f;

import android.app.Activity;

/* loaded from: classes.dex */
public class d extends e.b.b.m.g.b {
    private volatile com.bytedance.apm6.cpu.exception.d a;
    private e.b.b.m.g.a b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.apm6.cpu.exception.a f3703c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.apm6.cpu.exception.a f3704d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.apm6.cpu.exception.a f3705e;

    /* renamed from: f, reason: collision with root package name */
    private com.bytedance.apm6.cpu.exception.a f3706f;

    /* renamed from: g, reason: collision with root package name */
    private com.bytedance.apm6.cpu.exception.a f3707g;

    public d() {
        e.b.b.m.g.a aVar = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
        this.b = aVar;
        this.a = new com.bytedance.apm6.cpu.exception.d(aVar);
        this.f3703c = new f(this.a);
        this.f3704d = new g(this.a);
        this.f3705e = new h(this.a);
        this.f3706f = new c(this.a);
        this.f3707g = new e(this.a);
        this.a.c(this.f3703c, this.f3704d, this.f3705e, this.f3706f, this.f3707g);
        this.b.b(this);
    }

    public void b(com.bytedance.apm6.cpu.b.c cVar) {
        this.a.j(cVar);
    }

    public void c() {
        this.a.k();
    }

    @Override // e.b.b.m.g.b, e.b.b.m.g.c
    public void onBackground(Activity activity) {
        this.a.f(true);
    }

    @Override // e.b.b.m.g.b, e.b.b.m.g.c
    public void onFront(Activity activity) {
        this.a.f(false);
    }
}
