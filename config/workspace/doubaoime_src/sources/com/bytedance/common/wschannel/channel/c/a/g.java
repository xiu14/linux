package com.bytedance.common.wschannel.channel.c.a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.c.a.d;
import com.ss.android.message.log.PushLog;
import f.h;
import java.io.UnsupportedEncodingException;
import okhttp3.B;
import org.json.JSONObject;

/* loaded from: classes.dex */
class g implements d.h {
    private final IWsChannelClient a;
    private final Context b;

    g(Context context, d dVar, IWsChannelClient iWsChannelClient) {
        this.a = iWsChannelClient;
        this.b = context;
    }

    public void a(String str, int i, String str2) {
        e.a.a.a.a.s0("onClosed() : ", str2, "WsChannelSdk_ok");
        if (this.a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put(WsConstants.KEY_CONNECTION_STATE, 3);
                jSONObject.put("url", str);
                jSONObject.put(WsConstants.KEY_CHANNEL_TYPE, 2);
                this.a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void b(String str) {
        if (this.a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put(WsConstants.KEY_CONNECTION_STATE, 1);
                jSONObject.put("url", str);
                jSONObject.put(WsConstants.KEY_CHANNEL_TYPE, 2);
                this.a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void c(String str, int i, String str2) {
        Logger.d("WsChannelSdk_ok", "onFailure() : " + str2);
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onFailure");
        try {
            PushLog.onEventV3Bundle(this.b, "WsChannelSdk_ok", bundle);
        } catch (Throwable unused) {
        }
        if (this.a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put(WsConstants.KEY_CONNECTION_STATE, 2);
                jSONObject.put("url", str);
                jSONObject.put(WsConstants.KEY_CHANNEL_TYPE, 2);
                jSONObject.put(WsConstants.KEY_CONNECTION_ERROR, str2);
                jSONObject.put("error_code", i);
                this.a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void d(String str) {
        e.a.a.a.a.s0("onMessage():", str, "WsChannelSdk_ok");
        IWsChannelClient iWsChannelClient = this.a;
        if (iWsChannelClient != null) {
            try {
                iWsChannelClient.onMessage(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void e(h hVar) {
        StringBuilder M = e.a.a.a.a.M("onMessage() : ");
        M.append(hVar.toString());
        Logger.d("WsChannelSdk_ok", M.toString());
        IWsChannelClient iWsChannelClient = this.a;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(hVar.s());
        }
    }

    public void f(B b) {
        StringBuilder M = e.a.a.a.a.M("onOpen(): ");
        M.append(b.toString());
        Logger.d("WsChannelSdk_ok", M.toString());
        if (this.a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put(WsConstants.KEY_CONNECTION_STATE, 4);
                jSONObject.put("url", b.N().url().toString());
                jSONObject.put(WsConstants.KEY_CHANNEL_TYPE, 2);
                this.a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
