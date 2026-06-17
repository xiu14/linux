package com.vivo.push.b;

/* loaded from: classes2.dex */
public final class n extends t {
    private String a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8794c;

    public n() {
        super(7);
        this.b = 0;
        this.f8794c = false;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(String str) {
        this.a = str;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("content", this.a);
        dVar.a("log_level", this.b);
        dVar.a("is_server_log", this.f8794c);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.a("content");
        this.b = dVar.b("log_level", 0);
        this.f8794c = dVar.e("is_server_log");
    }

    public final String e() {
        return this.a;
    }

    public final int f() {
        return this.b;
    }

    public final boolean g() {
        return this.f8794c;
    }

    public final void h() {
        this.f8794c = false;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnLogCommand";
    }
}
