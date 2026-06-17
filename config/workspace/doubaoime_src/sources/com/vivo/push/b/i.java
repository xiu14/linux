package com.vivo.push.b;

/* loaded from: classes2.dex */
public final class i extends t {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f8792c;

    /* renamed from: d, reason: collision with root package name */
    private String f8793d;

    public i(int i) {
        super(i);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("app_id", this.a);
        dVar.a("client_id", this.b);
        dVar.a("client_token", this.f8792c);
        dVar.a("client_token_validity_period", this.f8793d);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.a("app_id");
        this.b = dVar.a("client_id");
        this.f8792c = dVar.a("client_token");
        this.f8793d = dVar.a("client_token_validity_period");
    }

    public final String e() {
        return this.a;
    }

    public final String f() {
        return this.f8792c;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnBindCommand";
    }
}
