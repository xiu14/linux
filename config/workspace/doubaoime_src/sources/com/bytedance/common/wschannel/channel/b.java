package com.bytedance.common.wschannel.channel;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements IWsChannelClient {
    private final int a;
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f4192c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4193d = true;

    /* renamed from: e, reason: collision with root package name */
    private IWsChannelClient f4194e;

    /* renamed from: f, reason: collision with root package name */
    private a f4195f;

    private b(int i, a aVar, Handler handler) {
        this.a = i;
        this.f4195f = aVar;
        this.b = handler;
        try {
            d();
            if (this.f4193d) {
                Logger.d("WsChannelClient", "use cronet to connect");
            } else {
                Logger.d("WsChannelClient", "use PushManager to connect");
            }
        } catch (ClassNotFoundException unused) {
            Logger.d("WsChannelClient", "don't find plugin or plugin download failed");
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.d("WsChannelClient", "don't find plugin");
        }
        if (this.f4194e == null) {
            Logger.d("WsChannelClient", "use okhttp to connect");
            this.f4194e = new com.bytedance.common.wschannel.channel.c.a.a(i, handler);
        }
    }

    private Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static b c(int i, a aVar, Handler handler) {
        return new b(i, aVar, handler);
    }

    private void d() throws Exception {
        if (this.f4194e == null) {
            Class<?> a = com.bytedance.android.input.k.b.a.Y("") ? null : a("");
            if (a == null) {
                a = a("org.chromium.wschannel.MySelfChannelImpl");
                this.f4193d = true;
            }
            if (a == null) {
                a = a("com.b.c.ws.MySelfChannelImpl");
                this.f4193d = false;
            }
            if (a == null) {
                throw new ClassNotFoundException("plugin class not found");
            }
            Object newInstance = a.newInstance();
            if (newInstance instanceof IWsChannelClient) {
                this.f4194e = (IWsChannelClient) newInstance;
            }
        }
    }

    public boolean b() {
        return this.f4194e instanceof com.bytedance.common.wschannel.channel.c.a.a;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        synchronized (this) {
            IWsChannelClient iWsChannelClient = this.f4194e;
            if (iWsChannelClient != null) {
                iWsChannelClient.destroy();
                if (!(this.f4194e instanceof com.bytedance.common.wschannel.channel.c.a.a)) {
                    JSONObject jSONObject = new JSONObject();
                    List<String> list = this.f4192c;
                    String str = (list == null || list.size() < 1) ? "" : this.f4192c.get(0);
                    try {
                        jSONObject.put("type", 0);
                        jSONObject.put(WsConstants.KEY_CONNECTION_STATE, 3);
                        jSONObject.put("url", str);
                        jSONObject.put(WsConstants.KEY_CHANNEL_TYPE, 1);
                        a aVar = this.f4195f;
                        if (aVar != null) {
                            aVar.d(this, this.a, jSONObject);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        IWsChannelClient iWsChannelClient2 = this.f4194e;
        if (iWsChannelClient2 != null) {
            try {
                iWsChannelClient2.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (this.f4194e instanceof com.bytedance.common.wschannel.channel.c.a.a) {
                    throw th;
                }
                th.printStackTrace();
                Logger.d("WsChannelClient", "cronet socket init failed，use okhttp to connect");
                com.bytedance.common.wschannel.channel.c.a.a aVar = new com.bytedance.common.wschannel.channel.c.a.a(this.a, this.b);
                this.f4194e = aVar;
                aVar.init(context, iWsChannelClient);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            return iWsChannelClient.isConnected();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            iWsChannelClient.onAppStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        synchronized (this) {
            a aVar = this.f4195f;
            if (aVar != null) {
                aVar.d(this, this.a, jSONObject);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        a aVar = this.f4195f;
        if (aVar != null) {
            aVar.f(this.a, bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            iWsChannelClient.onNetworkStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            iWsChannelClient.onParameterChange(map, list);
        }
        this.f4192c = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onServiceConnectEvent(int i, boolean z, String str) {
        a aVar = this.f4195f;
        if (aVar != null) {
            aVar.b(new ServiceConnectEvent(this.a, i, z, str));
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            iWsChannelClient.openConnection(map, list);
        }
        this.f4192c = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolEnabled() {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            return iWsChannelClient.privateProtocolEnabled();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolProxyEnabled() {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            return iWsChannelClient.privateProtocolProxyEnabled();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void registerService(int i) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            iWsChannelClient.registerService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(bArr);
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            iWsChannelClient.stopConnection();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void unregisterService(int i) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            iWsChannelClient.unregisterService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(WsChannelMsg wsChannelMsg) {
        a aVar = this.f4195f;
        if (aVar != null) {
            aVar.g(this.a, wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(WsChannelMsg wsChannelMsg) {
        IWsChannelClient iWsChannelClient = this.f4194e;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(wsChannelMsg);
        }
        return false;
    }
}
