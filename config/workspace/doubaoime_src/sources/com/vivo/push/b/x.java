package com.vivo.push.b;

/* loaded from: classes2.dex */
public final class x extends com.vivo.push.v {
    private int a;

    public x() {
        super(2011);
        this.a = 0;
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a("com.bbk.push.ikey.MODE_TYPE", this.a);
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.a = dVar.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }

    @Override // com.vivo.push.v
    public final boolean d() {
        return true;
    }

    public final int e() {
        return this.a;
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "PushModeCommand";
    }
}
