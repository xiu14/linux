package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.WorkerThread;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h implements com.bytedance.common.wschannel.channel.a {
    private final Context a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private b.a f4326c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.common.wschannel.client.b f4327d;

    /* renamed from: e, reason: collision with root package name */
    private b f4328e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f4329f;

    h(Context context, a aVar) {
        com.bytedance.common.wschannel.d dVar = new com.bytedance.common.wschannel.d();
        this.f4326c = dVar;
        this.f4327d = new com.bytedance.common.wschannel.client.b(dVar);
        this.f4329f = new AtomicInteger(0);
        this.a = context;
        this.b = aVar;
    }

    @WorkerThread
    private void i(WsChannelService.b bVar) {
        byte[] bArr = bVar.b;
        if (bArr == null && bVar.f4312d == null) {
            return;
        }
        WsChannelMsg wsChannelMsg = bVar.f4312d;
        if (!(wsChannelMsg != null)) {
            try {
                if (Logger.debug()) {
                    Logger.d("WsChannelService", "data = " + com.bytedance.common.wschannel.o.a.a(bArr, " ") + " data.length = " + bArr.length);
                }
                wsChannelMsg = com.bytedance.common.wschannel.m.b.a().a(bArr);
            } catch (Throwable th) {
                if (th instanceof ProtocolException) {
                    Logger.e("WsChannelSdk", "Unsupported message protocol, ignore this message");
                    return;
                } else {
                    th.printStackTrace();
                    return;
                }
            }
        }
        if (wsChannelMsg != WsChannelMsg.r) {
            int i = d.f4325d;
            wsChannelMsg.E(new NewMsgTimeHolder(bVar.f4311c, 0L, 0L));
            wsChannelMsg.u(bVar.a);
            wsChannelMsg.L(new ComponentName(this.a, (Class<?>) WsChannelService.class));
            if (Logger.debug()) {
                Logger.d("WsChannelService", "version =  seqId = " + wsChannelMsg.k() + " logId = " + wsChannelMsg.a() + " wsChannelMsg = " + wsChannelMsg.toString());
            }
            Map<Integer, IWsApp> map = this.b.a;
            if (map != null && map.size() > 0) {
                Iterator<Map.Entry<Integer, IWsApp>> it2 = this.b.a.entrySet().iterator();
                while (it2.hasNext()) {
                    IWsApp value = it2.next().getValue();
                    if (value != null && value.l() == wsChannelMsg.l()) {
                        Intent intent = new Intent();
                        intent.setAction(WsConstants.RECEIVE_PAYLOAD_ACTION);
                        intent.putExtra(WsConstants.KEY_PAYLOAD, wsChannelMsg);
                        if (Logger.debug()) {
                            intent.putExtra(WsConstants.MSG_COUNT, this.f4329f.addAndGet(1));
                        }
                        this.f4327d.a(intent, null);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void a(WsChannelMsg wsChannelMsg, boolean z) {
        this.f4326c.a(wsChannelMsg, z);
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void b(ServiceConnectEvent serviceConnectEvent) {
        try {
            Intent intent = new Intent();
            intent.setAction(WsConstants.RECEIVE_SERVICE_ACTION);
            intent.putExtra("service", serviceConnectEvent);
            this.f4327d.a(intent, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void c() {
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void d(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(WsConstants.KEY_CHANNEL_ID, i);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        h(iWsChannelClient, SocketState.a(jSONObject));
        if (com.bytedance.common.wschannel.k.e(this.a).i()) {
            this.f4328e.m(iWsChannelClient);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void e() {
        Intent intent = new Intent();
        intent.setAction(WsConstants.SYNC_CONNECT_STATE);
        intent.putParcelableArrayListExtra(WsConstants.KEY_CONNECTION, new ArrayList<>(this.b.f4313c.values()));
        this.f4327d.a(intent, null);
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void f(int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        i(new WsChannelService.b(i, bArr, 0L));
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void g(int i, WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null) {
            return;
        }
        i(new WsChannelService.b(i, wsChannelMsg, 0L));
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void h(IWsChannelClient iWsChannelClient, SocketState socketState) {
        this.b.f4313c.put(Integer.valueOf(socketState.f4281d), socketState);
        try {
            Intent intent = new Intent();
            intent.setAction(WsConstants.RECEIVE_CONNECTION_ACTION);
            intent.putExtra(WsConstants.KEY_CONNECTION, socketState);
            this.f4327d.a(intent, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void j(b bVar) {
        this.f4328e = bVar;
    }
}
