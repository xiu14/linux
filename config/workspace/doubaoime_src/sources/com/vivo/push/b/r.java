package com.vivo.push.b;

/* loaded from: classes2.dex */
public final class r extends t {
    private static String a = "notify_guide_dialog_result";
    private int b;

    public r() {
        super(2023);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a(a, this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.b = dVar.b(a, -1);
    }

    public final int e() {
        return this.b;
    }
}
