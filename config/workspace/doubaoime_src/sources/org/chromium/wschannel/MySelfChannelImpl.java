package org.chromium.wschannel;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ttnet.org.chromium.net.impl.K;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MySelfChannelImpl implements IWsChannelClient, WeakHandler.IHandler {
    private static final String TAG = "MySelfChannelImpl";
    private static String WSCHANNEL_ACTION_BACK;
    private static String WSCHANNEL_ACTION_FORE;
    private static String sPackageName;
    private static volatile String sUserAgent;
    private Context mContext;
    private a mFrontierConnection;
    private IWsChannelClient mWsChannelClient;

    public static String getDefaultUserAgent() {
        return sUserAgent;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            aVar.o();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("handleMsg data:");
            M.append(message.toString());
            Logger.d(TAG, M.toString());
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        if (Logger.debug()) {
            Logger.d(TAG, "MySelfChannelImpl init");
        }
        this.mContext = context;
        sPackageName = context.getPackageName();
        this.mWsChannelClient = iWsChannelClient;
        this.mFrontierConnection = new a(this);
        if (TextUtils.isEmpty(sUserAgent)) {
            try {
                sUserAgent = K.a(context);
            } catch (Throwable unused) {
            }
        }
        WSCHANNEL_ACTION_BACK = e.a.a.a.a.c(this.mContext, new StringBuilder(), ".wschannel.APP_BACKGROUND");
        WSCHANNEL_ACTION_FORE = e.a.a.a.a.c(this.mContext, new StringBuilder(), ".wschannel.APP_FOREGROUND");
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            return aVar.s();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        Intent intent = new Intent();
        if (i == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
            return;
        }
        if (i == 2) {
            intent.setAction(WSCHANNEL_ACTION_BACK);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put(WsConstants.KEY_CHANNEL_TYPE, 1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            aVar.C();
        }
        openConnection(map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onServiceConnectEvent(int i, boolean z, String str) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onServiceConnectEvent(i, z, str);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map<String, Object> map, List<String> list) {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            aVar.A(map, list);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolEnabled() {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            return aVar.u();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolProxyEnabled() {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            return aVar.v();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void registerService(int i) {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("WS sendMessage data:");
            M.append(bArr.toString());
            Logger.d(TAG, M.toString());
        }
        a aVar = this.mFrontierConnection;
        if (aVar == null) {
            return false;
        }
        return (aVar.u() && this.mFrontierConnection.v()) ? this.mFrontierConnection.x(bArr) : this.mFrontierConnection.y(bArr);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            aVar.C();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void unregisterService(int i) {
        a aVar = this.mFrontierConnection;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(WsChannelMsg wsChannelMsg) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(WsChannelMsg wsChannelMsg) {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("PP data:");
            M.append(wsChannelMsg.toString());
            Logger.d(TAG, M.toString());
        }
        a aVar = this.mFrontierConnection;
        if (aVar == null) {
            return false;
        }
        return aVar.w(wsChannelMsg);
    }
}
