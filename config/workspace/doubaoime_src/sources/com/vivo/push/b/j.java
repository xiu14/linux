package com.vivo.push.b;

/* loaded from: classes2.dex */
public final class j extends t {
    private int a;
    private int b;

    public j() {
        super(12);
        this.a = -1;
        this.b = -1;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.a);
        dVar.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.a);
        this.b = dVar.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }

    public final int e() {
        return this.a;
    }

    public final int f() {
        return this.b;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnChangePushStatusCommand";
    }
}
