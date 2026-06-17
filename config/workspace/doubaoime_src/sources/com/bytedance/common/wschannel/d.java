package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements b.a {
    @Override // com.bytedance.common.wschannel.client.b.a
    public void a(WsChannelMsg wsChannelMsg, boolean z) {
        if (j.c(wsChannelMsg.l()) == null || !(wsChannelMsg instanceof MainProcessMsg)) {
            return;
        }
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void b(com.bytedance.common.wschannel.event.a aVar, JSONObject jSONObject) {
        if (j.c(aVar.f4252c) != null && aVar.b == ConnectionState.CONNECT_CLOSED) {
            throw null;
        }
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void c(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null) {
            return;
        }
        j.c(wsChannelMsg.l());
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void d(ServiceConnectEvent serviceConnectEvent) {
        if (j.c(serviceConnectEvent.l()) != null) {
            throw null;
        }
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void e(int i, ConnectionState connectionState, boolean z) {
        j.c(i);
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void f(String str, boolean z) {
    }
}
