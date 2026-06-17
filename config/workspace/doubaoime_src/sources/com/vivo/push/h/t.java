package com.vivo.push.h;

import com.vivo.push.model.UnvarnishedMessage;

/* loaded from: classes2.dex */
final class t extends ab {
    t(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.b.o oVar = (com.vivo.push.b.o) vVar;
        UnvarnishedMessage f2 = oVar.f();
        if (f2 != null && f2.isTransMsgArrive()) {
            com.vivo.push.m.a().a(new com.vivo.push.b.h(String.valueOf(oVar.h())));
        }
        if (com.vivo.push.m.a().g() && !a(com.vivo.push.util.ah.c(this.a), oVar.e(), oVar.k())) {
            super.a(1021);
            return;
        }
        if (f2 == null) {
            super.a(2807);
            com.vivo.push.util.t.a("OnMessageTask", " message is null");
            return;
        }
        if (f2.isTransMsgExpired()) {
            com.vivo.push.util.t.d("OnMessageTask", "tragetType is Expired msg =" + f2.getMsgId());
            ((ab) this).b.onTransmissionMessageExpired(f2);
            super.a(0);
            return;
        }
        com.vivo.push.util.t.d("OnMessageTask", "tragetType is " + f2.getTargetType() + " ; messageId is " + f2.getMsgId());
        ((ab) this).b.onTransmissionMessage(this.a, f2);
        super.a(0);
    }
}
