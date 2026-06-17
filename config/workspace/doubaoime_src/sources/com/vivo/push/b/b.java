package com.vivo.push.b;

/* loaded from: classes2.dex */
public final class b extends c {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f8785c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8786d;

    public b(boolean z, String str) {
        super(z ? 2006 : 2007, str);
        this.f8785c = 1;
        this.f8786d = false;
    }

    public final void a(int i) {
        this.f8785c = i;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("sdk_clients", this.a);
        dVar.a("sdk_version", 356L);
        dVar.a("PUSH_REGID", this.b);
        if (b() == 2007) {
            dVar.a("PUSH_UNBIND_SOURCE_CODE", this.f8785c);
        }
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.a("sdk_clients");
        this.b = dVar.a("PUSH_REGID");
        if (b() == 2007) {
            this.f8785c = dVar.b("PUSH_UNBIND_SOURCE_CODE", 1);
        }
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final String toString() {
        return "AppCommand:" + b();
    }
}
