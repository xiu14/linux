package com.bytedance.common.wschannel.client;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.event.MessageAckEvent;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WsClientService extends AbsWsClientService {
    @Override // com.bytedance.common.wschannel.client.b.a
    public void a(WsChannelMsg wsChannelMsg, boolean z) {
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void b(com.bytedance.common.wschannel.event.a aVar, JSONObject jSONObject) {
        com.bytedance.common.wschannel.app.c listener = WsConstants.getListener(aVar.f4252c);
        if (listener != null) {
            listener.b(aVar, jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, com.bytedance.common.wschannel.client.b.a
    public void c(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null) {
            try {
                com.bytedance.common.wschannel.app.c listener = WsConstants.getListener(wsChannelMsg.l());
                if (listener == null || wsChannelMsg.t()) {
                    com.bytedance.common.wschannel.app.b messageAckListener = WsConstants.getMessageAckListener();
                    if (messageAckListener != null && wsChannelMsg.t()) {
                        MessageAckEvent messageAckEvent = new MessageAckEvent(wsChannelMsg.q(), wsChannelMsg.l(), wsChannelMsg.m(), wsChannelMsg.c(), wsChannelMsg.b());
                        messageAckEvent.a(wsChannelMsg.n());
                        messageAckListener.a(messageAckEvent);
                    }
                } else {
                    listener.c(wsChannelMsg);
                }
            } catch (Throwable th) {
                Logger.e(th.toString());
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void d(ServiceConnectEvent serviceConnectEvent) {
        if (serviceConnectEvent == null) {
            return;
        }
        WsConstants.setServiceState(serviceConnectEvent);
        com.bytedance.common.wschannel.app.d serviceConnectListener = WsConstants.getServiceConnectListener();
        if (serviceConnectListener != null) {
            serviceConnectListener.b(serviceConnectEvent);
        }
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void e(int i, ConnectionState connectionState, boolean z) {
        WsConstants.setConnectionState(i, connectionState, z);
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, com.bytedance.common.wschannel.client.b.a
    public void f(String str, boolean z) {
    }
}
