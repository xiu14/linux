package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class l implements com.bytedance.common.wschannel.channel.a {
    private static AtomicBoolean j = new AtomicBoolean(true);
    private final Context a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private final c f4333c;

    /* renamed from: e, reason: collision with root package name */
    private b f4335e;
    private Future<?> i;

    /* renamed from: f, reason: collision with root package name */
    private BlockingQueue<WsChannelService.b> f4336f = new LinkedBlockingQueue();

    /* renamed from: g, reason: collision with root package name */
    private ExecutorService f4337g = Executors.newSingleThreadExecutor();
    private Runnable h = new k(this);

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4334d = true;

    l(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
        this.f4333c = new c(context, WsClientService.class);
        n();
    }

    static void k(l lVar, WsChannelService.b bVar) {
        WsChannelMsg a;
        Objects.requireNonNull(lVar);
        if (bVar == null) {
            return;
        }
        if (bVar.b == null && bVar.f4312d == null) {
            return;
        }
        boolean z = bVar.f4312d != null;
        try {
            long l = lVar.l();
            if (z) {
                a = bVar.f4312d;
            } else {
                byte[] bArr = bVar.b;
                if (Logger.debug()) {
                    Logger.d("WsChannelService", "data = " + com.bytedance.common.wschannel.o.a.a(bArr, " ") + " data.length = " + bArr.length);
                }
                a = com.bytedance.common.wschannel.m.b.a().a(bArr);
            }
            long l2 = lVar.l();
            if (a == WsChannelMsg.r) {
                Logger.e("WsChannelService", "handleMessage decode msg is EMPTY!");
                return;
            }
            int i = d.f4325d;
            a.E(new NewMsgTimeHolder(bVar.f4311c, l, l2));
            a.u(bVar.a);
            a.L(new ComponentName(lVar.a, (Class<?>) WsChannelService.class));
            if (Logger.debug()) {
                Logger.d("WsChannelService", "version =  seqId = " + a.k() + " logId = " + a.a() + " wsChannelMsg = " + a.toString());
            }
            Map<Integer, IWsApp> map = lVar.b.a;
            if (map != null && map.size() > 0) {
                Iterator<Map.Entry<Integer, IWsApp>> it2 = lVar.b.a.entrySet().iterator();
                while (it2.hasNext()) {
                    IWsApp value = it2.next().getValue();
                    if (value == null) {
                        Logger.e("WsChannelService", "wsApp is null!");
                    } else if (value.l() == a.l()) {
                        try {
                            Intent intent = new Intent();
                            intent.setAction(WsConstants.RECEIVE_PAYLOAD_ACTION);
                            intent.setComponent(new ComponentName(lVar.a, (Class<?>) WsClientService.class));
                            intent.putExtra(WsConstants.KEY_PAYLOAD, a);
                            lVar.f4333c.b(intent);
                        } catch (Throwable th) {
                            Logger.e("WsChannelService", "deliver fail,reason:" + th);
                        }
                    }
                }
                return;
            }
            Logger.e("WsChannelService", "mKeeper.mWsAppMap is empty!");
        } catch (Throwable th2) {
            if (th2 instanceof ProtocolException) {
                Logger.e("WsChannelSdk", "Unsupported message protocol, ignore this message");
            } else {
                th2.printStackTrace();
            }
        }
    }

    private long l() {
        if (this.f4334d) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return 0L;
    }

    private void n() {
        if (this.h == null) {
            this.h = new k(this);
        }
        try {
            this.i = this.f4337g.submit(this.h);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void a(WsChannelMsg wsChannelMsg, boolean z) {
        ComponentName j2 = wsChannelMsg.j();
        if (j2 != null) {
            try {
                byte[] f2 = wsChannelMsg.f();
                if (f2 == null) {
                    f2 = new byte[1];
                }
                Intent intent = new Intent();
                intent.setAction(WsConstants.SEND_PAYLOAD_ACTION);
                intent.setComponent(j2);
                intent.putExtra(WsConstants.KEY_SEND_RESULT, z);
                String str = null;
                try {
                    if (f2.length != 0) {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(f2);
                        str = e.b.a.a.a.b.a.a(messageDigest.digest());
                    }
                } catch (Exception unused) {
                }
                intent.putExtra(WsConstants.KEY_PAYLOAD_MD5, str);
                if (Logger.debug()) {
                    Logger.d("WsChannelService", "send result = " + z + " payloadMd5 = " + intent.getStringExtra(WsConstants.KEY_PAYLOAD_MD5));
                }
                this.a.startService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void b(ServiceConnectEvent serviceConnectEvent) {
        try {
            Intent intent = new Intent();
            intent.setAction(WsConstants.RECEIVE_SERVICE_ACTION);
            intent.setComponent(new ComponentName(this.a, (Class<?>) WsClientService.class));
            intent.putExtra("service", serviceConnectEvent);
            this.f4333c.b(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void c() {
        this.f4333c.c();
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
        SocketState a = SocketState.a(jSONObject);
        h(iWsChannelClient, a);
        if (com.bytedance.common.wschannel.k.e(this.a).i()) {
            this.f4335e.m(iWsChannelClient);
        }
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("onConnection: state=");
            M.append(a.b);
            M.append(" | type=");
            M.append(a.a);
            M.append(" | error=");
            e.a.a.a.a.I0(M, a.f4283f, "WsChannelService");
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void e() {
        try {
            Intent intent = new Intent();
            intent.setAction(WsConstants.SYNC_CONNECT_STATE);
            intent.setComponent(new ComponentName(this.a, (Class<?>) WsClientService.class));
            intent.putParcelableArrayListExtra(WsConstants.KEY_CONNECTION, new ArrayList<>(this.b.f4313c.values()));
            this.f4333c.b(intent);
            Logger.d("WsChannelSdk", "try sync socket state to main process");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void f(int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        try {
            this.f4336f.offer(new WsChannelService.b(i, bArr, l()));
            j.getAndSet(true);
            n();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void g(int i, WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null) {
            return;
        }
        try {
            this.f4336f.offer(new WsChannelService.b(i, wsChannelMsg, l()));
            j.getAndSet(true);
            n();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public void h(IWsChannelClient iWsChannelClient, SocketState socketState) {
        this.b.f4313c.put(Integer.valueOf(socketState.f4281d), socketState);
        try {
            Intent intent = new Intent();
            intent.setAction(WsConstants.RECEIVE_CONNECTION_ACTION);
            intent.setComponent(new ComponentName(this.a, (Class<?>) WsClientService.class));
            intent.putExtra(WsConstants.KEY_CONNECTION, socketState);
            this.f4333c.b(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void m(b bVar) {
        this.f4335e = bVar;
    }
}
