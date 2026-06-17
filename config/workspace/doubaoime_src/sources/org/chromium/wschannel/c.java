package org.chromium.wschannel;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.ttnet.org.chromium.net.impl.CronetFrontierClient;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class c implements CronetFrontierClient.c {
    private IWsChannelClient a;
    private a b;

    public c(IWsChannelClient iWsChannelClient, a aVar) {
        this.a = iWsChannelClient;
        this.b = aVar;
    }

    private static int d(int i) {
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i;
        }
        return 3;
    }

    private boolean e(int i) {
        if ((i != 2 && i != 3 && i != 4) || !this.b.t()) {
            return false;
        }
        if (!Logger.debug()) {
            return true;
        }
        Logger.d("CronetFrontierConnection", "Wait fallback task running and ignore state:" + i);
        return true;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetFrontierClient.c
    public void a(int i, String str) {
        int d2 = d(i);
        if (Logger.debug()) {
            Logger.d("CronetFrontierConnection", "PP onConnectionStateChanged state:" + d2 + " url:" + str);
        }
        if (d2 == 4) {
            this.b.z(false);
        }
        if (e(d2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE, 1);
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, d2);
            jSONObject.put("url", str);
            this.a.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetFrontierClient.c
    public void b(String str, long j, long j2, boolean z) {
        try {
            d.a().b(str, j, j2, z);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetFrontierClient.c
    public void c(int i, String str, String str2) {
        int d2 = d(i);
        if (Logger.debug()) {
            e.a.a.a.a.I0(e.a.a.a.a.P("PP onConnectionError state:", d2, " url:", str, " error:"), str2, "CronetFrontierConnection");
        }
        if (e(d2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 0);
            jSONObject.put(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE, 1);
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, d2);
            jSONObject.put("url", str);
            jSONObject.put(WsConstants.KEY_CONNECTION_ERROR, str2);
            if (b.d(str2, false)) {
                jSONObject.put("error_code", -192);
                if (Logger.debug()) {
                    Logger.d("CronetFrontierConnection", "PP connection timeout.");
                }
            }
            this.a.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }
}
