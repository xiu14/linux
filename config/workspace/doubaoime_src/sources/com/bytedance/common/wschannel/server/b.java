package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.ServiceParcelable;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.e;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.message.log.PushLog;
import com.vivo.push.PushClient;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class b implements WeakHandler.IHandler, e.a {
    private final WeakHandler a;
    private final Context b;

    /* renamed from: d, reason: collision with root package name */
    private final f f4315d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.common.wschannel.channel.a f4316e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bytedance.common.wschannel.server.a f4317f;
    private e h;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4314c = new Object();

    /* renamed from: g, reason: collision with root package name */
    private AtomicLong f4318g = new AtomicLong(0);
    private boolean i = false;

    class a implements Runnable {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
            b bVar = b.this;
            bVar.n(bVar.f4315d.a());
        }
    }

    /* renamed from: com.bytedance.common.wschannel.server.b$b, reason: collision with other inner class name */
    class RunnableC0189b implements Runnable {
        final /* synthetic */ Message a;

        RunnableC0189b(Message message) {
            this.a = message;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.what == 1 || b.this.h.isEnable()) {
                b.d(b.this, this.a);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ IWsChannelClient a;

        c(IWsChannelClient iWsChannelClient) {
            this.a = iWsChannelClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.l(this.a);
        }
    }

    b(Context context, Looper looper, f fVar, com.bytedance.common.wschannel.server.a aVar, com.bytedance.common.wschannel.channel.a aVar2, e eVar) {
        this.b = context.getApplicationContext();
        WeakHandler weakHandler = new WeakHandler(looper, this);
        this.a = weakHandler;
        this.f4315d = fVar;
        this.f4317f = aVar;
        this.f4316e = aVar2;
        this.h = eVar;
        eVar.b(this);
        weakHandler.post(new a(eVar));
    }

    static void d(b bVar, Message message) {
        int i;
        IWsChannelClient remove;
        Objects.requireNonNull(bVar);
        try {
            i = message.what;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (i == 0) {
            message.getData().setClassLoader(SsWsApp.class.getClassLoader());
            Parcelable parcelable = message.getData().getParcelable(WsConstants.KEY_WS_APP);
            if (parcelable instanceof IWsApp) {
                bVar.g((IWsApp) parcelable);
                return;
            }
            return;
        }
        boolean z = true;
        if (i == 1) {
            message.getData().setClassLoader(SsWsApp.class.getClassLoader());
            Parcelable parcelable2 = message.getData().getParcelable(WsConstants.KEY_WS_APP);
            if (parcelable2 instanceof IntegerParcelable) {
                int a2 = ((IntegerParcelable) parcelable2).a();
                synchronized (WsChannelService.class) {
                    bVar.f4317f.a.remove(Integer.valueOf(a2));
                    bVar.f4315d.b(bVar.f4317f.a);
                }
                synchronized (bVar.f4314c) {
                    remove = bVar.f4317f.b.remove(Integer.valueOf(a2));
                }
                if (remove != null) {
                    if (Logger.debug()) {
                        Logger.d("WsChannelService", "stopConnection,channelId = " + a2);
                    }
                    remove.destroy();
                }
                bVar.f4317f.f4313c.remove(Integer.valueOf(a2));
                bVar.a.sendMessageDelayed(bVar.a.obtainMessage(8, remove), 1000L);
                return;
            }
            return;
        }
        boolean z2 = false;
        if (i == 2) {
            int i2 = message.arg1;
            if (Logger.debug()) {
                Logger.d("WsChannelService", "appState = " + i2);
            }
            if (i2 != 1) {
                z = false;
            }
            bVar.i = z;
            bVar.f4316e.c();
            if (bVar.i()) {
                Collection<IWsChannelClient> values = bVar.f4317f.b.values();
                if (com.bytedance.common.wschannel.k.e(bVar.b).i()) {
                    Iterator<IWsChannelClient> it2 = values.iterator();
                    while (it2.hasNext()) {
                        try {
                            bVar.l(it2.next());
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                for (IWsChannelClient iWsChannelClient : bVar.f4317f.b.values()) {
                    if (iWsChannelClient != null) {
                        iWsChannelClient.onAppStateChanged(i2);
                    }
                }
                return;
            }
            return;
        }
        if (i == 3) {
            int i3 = message.arg1;
            if (Logger.debug()) {
                Logger.d("WsChannelService", "networkState = " + i3);
            }
            bVar.f4316e.c();
            if (bVar.i()) {
                for (IWsChannelClient iWsChannelClient2 : bVar.f4317f.b.values()) {
                    if (iWsChannelClient2 != null) {
                        iWsChannelClient2.onNetworkStateChanged(i3);
                    }
                }
                return;
            }
            return;
        }
        if (i == 4) {
            message.getData().setClassLoader(SsWsApp.class.getClassLoader());
            Parcelable parcelable3 = message.getData().getParcelable(WsConstants.KEY_WS_APP);
            if (parcelable3 instanceof IWsApp) {
                bVar.f((IWsApp) parcelable3);
                return;
            }
            return;
        }
        if (i != 5) {
            if (i == 9) {
                bVar.f4316e.e();
                return;
            }
            if (i != 10) {
                if (i == 12) {
                    message.getData().setClassLoader(ServiceParcelable.class.getClassLoader());
                    Parcelable parcelable4 = message.getData().getParcelable(WsConstants.KEY_WS_APP);
                    if (parcelable4 instanceof ServiceParcelable) {
                        int l = ((ServiceParcelable) parcelable4).l();
                        int a3 = ((ServiceParcelable) parcelable4).a();
                        IWsChannelClient iWsChannelClient3 = bVar.f4317f.b.get(Integer.valueOf(l));
                        if (iWsChannelClient3 != null) {
                            if (Logger.debug()) {
                                Logger.d("WsChannelService", "register serviceId = " + a3);
                            }
                            iWsChannelClient3.registerService(a3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i != 13) {
                    return;
                }
                message.getData().setClassLoader(ServiceParcelable.class.getClassLoader());
                Parcelable parcelable5 = message.getData().getParcelable(WsConstants.KEY_WS_APP);
                if (parcelable5 instanceof ServiceParcelable) {
                    int l2 = ((ServiceParcelable) parcelable5).l();
                    int a4 = ((ServiceParcelable) parcelable5).a();
                    IWsChannelClient iWsChannelClient4 = bVar.f4317f.b.get(Integer.valueOf(l2));
                    if (iWsChannelClient4 != null) {
                        if (Logger.debug()) {
                            Logger.d("WsChannelService", "unregister serviceId = " + a4);
                        }
                        iWsChannelClient4.unregisterService(a4);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (i != 10) {
            z = false;
        }
        message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
        Parcelable parcelable6 = message.getData().getParcelable(WsConstants.KEY_PAYLOAD);
        if (parcelable6 instanceof WsChannelMsg) {
            WsChannelMsg wsChannelMsg = (WsChannelMsg) parcelable6;
            if (wsChannelMsg.k() <= 0) {
                wsChannelMsg.O(bVar.f4318g.incrementAndGet());
            }
            IWsChannelClient iWsChannelClient5 = bVar.f4317f.b.get(Integer.valueOf(wsChannelMsg.l()));
            if (z) {
                Logger.d("WsChannelService", "retry send msg");
            }
            if (iWsChannelClient5 != null) {
                if (i != 10 && (iWsChannelClient5 instanceof com.bytedance.common.wschannel.channel.b) && ((com.bytedance.common.wschannel.channel.b) iWsChannelClient5).b()) {
                    int i4 = com.bytedance.common.wschannel.k.f4262d;
                }
                z2 = (!iWsChannelClient5.privateProtocolEnabled() || iWsChannelClient5.privateProtocolProxyEnabled()) ? iWsChannelClient5.sendMessage(com.bytedance.common.wschannel.m.b.a().b(wsChannelMsg)) : iWsChannelClient5.sendMessage(wsChannelMsg);
                long b = com.bytedance.common.wschannel.k.e(bVar.b).b();
                if (!z2 && !z && b > 0) {
                    Message obtain = Message.obtain(message);
                    obtain.what = 10;
                    bVar.a.sendMessageDelayed(obtain, b);
                }
                if (z2 || b <= 0 || z) {
                    bVar.f4316e.a(wsChannelMsg, z2);
                }
            } else {
                bVar.f4316e.a(wsChannelMsg, false);
            }
            if (Logger.debug()) {
                Logger.d("WsChannelService", "send payload success = " + z2);
                return;
            }
            return;
        }
        return;
        th.printStackTrace();
    }

    private void f(@NonNull IWsApp iWsApp) {
        if (Logger.debug()) {
            Logger.d("WsChannelService", "doOnParamChange");
        }
        int a2 = WsChannelService.a(iWsApp);
        if (i()) {
            try {
                IWsChannelClient iWsChannelClient = this.f4317f.b.get(Integer.valueOf(iWsApp.l()));
                synchronized (WsChannelService.class) {
                    IWsApp iWsApp2 = this.f4317f.a.get(Integer.valueOf(a2));
                    if (iWsChannelClient != null && (!iWsApp.equals(iWsApp2) || !iWsChannelClient.isConnected())) {
                        this.f4317f.a.put(Integer.valueOf(a2), iWsApp);
                        this.f4315d.b(this.f4317f.a);
                        iWsChannelClient.onParameterChange(h(iWsApp), iWsApp.j0());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void g(@NonNull IWsApp iWsApp) {
        boolean z;
        boolean z2;
        IWsChannelClient iWsChannelClient;
        int a2 = WsChannelService.a(iWsApp);
        if (i()) {
            synchronized (WsChannelService.class) {
                IWsApp iWsApp2 = this.f4317f.a.get(Integer.valueOf(a2));
                IWsChannelClient iWsChannelClient2 = this.f4317f.b.get(Integer.valueOf(a2));
                z = false;
                z2 = true;
                if (iWsApp2 != null && iWsApp.equals(iWsApp2)) {
                    if (iWsChannelClient2 != null) {
                        z2 = false;
                    }
                    z2 = false;
                    z = true;
                } else if (iWsApp2 == null) {
                    this.f4317f.a.put(Integer.valueOf(a2), iWsApp);
                    this.f4315d.b(this.f4317f.a);
                    z2 = false;
                    z = true;
                }
            }
            if (!z) {
                if (z2) {
                    f(iWsApp);
                    return;
                }
                return;
            }
            if (Logger.debug()) {
                Logger.d("WsChannelService", "tryOpenConnection");
            }
            synchronized (this.f4314c) {
                iWsChannelClient = this.f4317f.b.get(Integer.valueOf(iWsApp.l()));
                if (iWsChannelClient == null) {
                    iWsChannelClient = com.bytedance.common.wschannel.channel.b.c(iWsApp.l(), this.f4316e, this.a);
                    iWsChannelClient.init(this.b, iWsChannelClient);
                    this.f4317f.b.put(Integer.valueOf(iWsApp.l()), iWsChannelClient);
                }
            }
            if (iWsChannelClient.isConnected()) {
                SocketState socketState = this.f4317f.f4313c.get(Integer.valueOf(iWsApp.l()));
                Logger.d("WsChannelService", "state = " + socketState);
                if (socketState != null) {
                    try {
                        this.f4316e.h(iWsChannelClient, socketState);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            try {
                if (Logger.debug()) {
                    Logger.d("WsChannelService", "try to open connection ,channelId = " + iWsApp.l());
                }
                iWsChannelClient.openConnection(h(iWsApp), iWsApp.j0());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private Map<String, Object> h(IWsApp iWsApp) {
        HashMap hashMap = new HashMap();
        hashMap.put(WsConstants.KEY_APP_KEY, iWsApp.x());
        hashMap.put(WsConstants.KEY_FPID, Integer.valueOf(iWsApp.e0()));
        hashMap.put("sdk_version", 2);
        hashMap.put(WsConstants.KEY_PLATFORM, 0);
        hashMap.put("app_version", Integer.valueOf(iWsApp.D()));
        hashMap.put(WsConstants.KEY_APP_ID, Integer.valueOf(iWsApp.getAppId()));
        hashMap.put("device_id", iWsApp.getDeviceId());
        hashMap.put(WsConstants.KEY_INSTALL_ID, iWsApp.h());
        hashMap.put(WsConstants.KEY_HEADERS, iWsApp.d());
        String extra = iWsApp.getExtra();
        if (extra == null) {
            j("extra");
            extra = "";
        }
        if (com.bytedance.common.wschannel.k.e(this.b).i()) {
            String[] split = extra.split(ContainerUtils.FIELD_DELIMITER);
            StringBuilder M = e.a.a.a.a.M("is_background=");
            M.append(this.i ? "0" : PushClient.DEFAULT_REQUEST_ID);
            String sb = M.toString();
            extra = (split.length <= 0 || TextUtils.isEmpty(split[0])) ? sb : e.a.a.a.a.t(extra, ContainerUtils.FIELD_DELIMITER, sb);
        }
        hashMap.put("extra", extra);
        if (iWsApp.getDeviceId() == null) {
            j("device_id");
        }
        if (iWsApp.h() == null) {
            j("install_id");
        }
        if (com.bytedance.android.input.k.b.a.Y(iWsApp.x())) {
            j(WsConstants.KEY_APP_KEY);
        }
        hashMap.put(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE, Boolean.valueOf(iWsApp.r()));
        if (iWsApp.A() != null) {
            hashMap.put(WsConstants.KEY_SERVICE_ID_LIST, iWsApp.A());
        }
        if (!TextUtils.isEmpty(iWsApp.N())) {
            hashMap.put(WsConstants.KEY_PRIVATE_PROTOCOL_URL, iWsApp.N());
        }
        hashMap.put(WsConstants.KEY_TRANSPORT_MODE, Integer.valueOf(iWsApp.o()));
        hashMap.put(WsConstants.KEY_DISABLE_FALLBACK_WEBSOCKET, Boolean.valueOf(iWsApp.P()));
        return hashMap;
    }

    private boolean i() {
        return this.h.isEnable();
    }

    private void j(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("param_name", str);
        try {
            PushLog.onEventV3Bundle(this.b, "wschannel_param_null", bundle);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(IWsChannelClient iWsChannelClient) {
        if (iWsChannelClient == null) {
            return;
        }
        WsChannelMsg.b bVar = new WsChannelMsg.b(Integer.MAX_VALUE);
        bVar.d(4);
        bVar.h(9000);
        bVar.c(1008601L);
        bVar.e(new byte[0]);
        bVar.f("pb");
        bVar.g("pb");
        bVar.a(WsConstants.APP_STATE_BACKGROUND_KEY, this.i ? "0" : PushClient.DEFAULT_REQUEST_ID);
        WsChannelMsg b = bVar.b();
        if (iWsChannelClient.privateProtocolEnabled()) {
            iWsChannelClient.sendMessage(b);
        } else {
            iWsChannelClient.sendMessage(com.bytedance.common.wschannel.m.b.a().b(b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Map<Integer, IWsApp> map) {
        com.bytedance.common.wschannel.k e2;
        Context context = this.b;
        boolean z = false;
        if (context != null && (e2 = com.bytedance.common.wschannel.k.e(context)) != null) {
            z = e2.g();
        }
        if ((!z || g.f(this.b)) && this.h.isEnable() && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    g(iWsApp);
                }
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        this.a.post(new RunnableC0189b(Message.obtain(message)));
    }

    public void k(boolean z) {
        if (z) {
            n(this.f4315d.a());
            return;
        }
        try {
            synchronized (this.f4314c) {
                Iterator<Map.Entry<Integer, IWsChannelClient>> it2 = this.f4317f.b.entrySet().iterator();
                while (it2.hasNext()) {
                    IWsChannelClient value = it2.next().getValue();
                    if (value != null) {
                        value.destroy();
                    }
                }
                this.f4317f.b.clear();
            }
            this.f4317f.a.clear();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void m(IWsChannelClient iWsChannelClient) {
        if (iWsChannelClient.isConnected()) {
            this.a.post(new c(iWsChannelClient));
        }
    }
}
