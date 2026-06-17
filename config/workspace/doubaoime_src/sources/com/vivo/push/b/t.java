package com.vivo.push.b;

/* loaded from: classes2.dex */
public class t extends com.vivo.push.v {
    private String a;
    private int b;

    public t(int i) {
        super(i);
        this.a = null;
        this.b = 0;
    }

    @Override // com.vivo.push.v
    protected void c(com.vivo.push.d dVar) {
        dVar.a("req_id", this.a);
        dVar.a("status_msg_code", this.b);
    }

    @Override // com.vivo.push.v
    protected void d(com.vivo.push.d dVar) {
        this.a = dVar.a("req_id");
        this.b = dVar.b("status_msg_code", this.b);
    }

    public final String i() {
        return this.a;
    }

    public final int j() {
        return this.b;
    }

    @Override // com.vivo.push.v
    public String toString() {
        return "OnReceiveCommand";
    }
}
