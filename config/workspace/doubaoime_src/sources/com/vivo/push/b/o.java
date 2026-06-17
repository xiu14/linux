package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.UnvarnishedMessage;

/* loaded from: classes2.dex */
public final class o extends w {
    protected UnvarnishedMessage a;

    public o() {
        super(3);
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("msg_v1", this.a.unpackToJson());
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        String a = dVar.a("msg_v1");
        if (TextUtils.isEmpty(a)) {
            return;
        }
        UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(a);
        this.a = unvarnishedMessage;
        unvarnishedMessage.setMsgId(h());
        this.a.setTransmissionMessageEventType(dVar.b("transmission_message_event_type", 0));
    }

    public final String e() {
        UnvarnishedMessage unvarnishedMessage = this.a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }

    public final UnvarnishedMessage f() {
        return this.a;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnMessageCommand";
    }
}
