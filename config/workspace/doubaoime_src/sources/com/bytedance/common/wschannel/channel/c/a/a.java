package com.bytedance.common.wschannel.channel.c.a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.c.a.d;
import com.bytedance.common.wschannel.i;
import com.bytedance.common.wschannel.k;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements IWsChannelClient, WeakHandler.IHandler {
    private final int a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f4196c;

    /* renamed from: d, reason: collision with root package name */
    private d f4197d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4198e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f4199f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private List<String> f4200g;
    private ContentObserver h;

    /* renamed from: com.bytedance.common.wschannel.channel.c.a.a$a, reason: collision with other inner class name */
    class C0180a extends ContentObserver {
        C0180a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            a aVar = a.this;
            if (!aVar.e(aVar.b)) {
                a.this.stopConnection();
            } else {
                a aVar2 = a.this;
                aVar2.openConnection(aVar2.f4199f, a.this.f4200g);
            }
        }
    }

    public a(int i, Handler handler) {
        this.a = i;
        this.f4196c = handler;
        this.h = new C0180a(this.f4196c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Context context) {
        return k.e(context).h();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        e.a.a.a.a.z0(e.a.a.a.a.M("destroy() , channelId = "), this.a, "WsChannelSdk_ok");
        this.f4197d.y();
        try {
            Context context = this.b;
            if (context != null) {
                context.getContentResolver().unregisterContentObserver(this.h);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        Class<?> cls;
        if (this.f4198e) {
            return;
        }
        this.f4198e = true;
        StringBuilder M = e.a.a.a.a.M("init() , channelId = ");
        M.append(this.a);
        Log.d("WsChannelSdk_ok", M.toString());
        this.b = context.getApplicationContext();
        System.currentTimeMillis();
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
        } catch (ClassNotFoundException unused) {
            Log.d("WsChannelSdk_ok", "MSSdk Class -com.bytedance.mobsec.metasec.ov.MSB- not found, init fail.");
            cls = null;
        }
        if (cls != null) {
            try {
                cls.getMethod("a", Context.class, Integer.TYPE, Map.class).invoke(cls, context, 2, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            System.currentTimeMillis();
        }
        d.e eVar = new d.e(context);
        eVar.c(new com.bytedance.common.wschannel.channel.c.a.h.b(context));
        eVar.b(i.d(this.a));
        d a = eVar.a();
        this.f4197d = a;
        a.M(new g(this.b, a, iWsChannelClient));
        try {
            context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.b(context, WsConstants.KEY_OK_IMPL_ENABLE, TypedValues.Custom.S_BOOLEAN), true, this.h);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        return this.f4197d.D();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        if (e(this.b)) {
            e.a.a.a.a.z0(e.a.a.a.a.M("onAppStateChanged(), channelId = "), this.a, "WsChannelSdk_ok");
            this.f4197d.F(i == 1);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        Log.d("WsChannelSdk_ok", "onConnection()");
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(WsChannelMsg wsChannelMsg) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        e.a.a.a.a.z0(e.a.a.a.a.M("onMessage(),channel = "), this.a, "WsChannelSdk_ok");
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
        if (e(this.b)) {
            e.a.a.a.a.z0(e.a.a.a.a.M("onNetworkStateChanged(), channelId = "), this.a, "WsChannelSdk_ok");
            this.f4197d.G(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f4199f.putAll(map);
        }
        this.f4200g = list;
        if (e(this.b)) {
            e.a.a.a.a.z0(e.a.a.a.a.M("onParameterChange(),channelId = "), this.a, "WsChannelSdk_ok");
            this.f4197d.H(map, list);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onServiceConnectEvent(int i, boolean z, String str) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f4199f.putAll(map);
        }
        this.f4200g = list;
        if (e(this.b)) {
            this.f4197d.x(map, list);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolEnabled() {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void registerService(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(WsChannelMsg wsChannelMsg) {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        if (!e(this.b)) {
            return false;
        }
        e.a.a.a.a.z0(e.a.a.a.a.M("sendMessage(),channelId = "), this.a, "WsChannelSdk_ok");
        return this.f4197d.J(bArr);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        e.a.a.a.a.z0(e.a.a.a.a.M("stopConnection(),channelId = "), this.a, "WsChannelSdk_ok");
        this.f4197d.N();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void unregisterService(int i) {
    }
}
