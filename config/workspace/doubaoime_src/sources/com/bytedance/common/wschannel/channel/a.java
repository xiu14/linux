package com.bytedance.common.wschannel.channel;

import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface a {
    void a(WsChannelMsg wsChannelMsg, boolean z);

    void b(ServiceConnectEvent serviceConnectEvent);

    void c();

    void d(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject);

    void e();

    void f(int i, byte[] bArr);

    void g(int i, WsChannelMsg wsChannelMsg);

    void h(IWsChannelClient iWsChannelClient, SocketState socketState);
}
