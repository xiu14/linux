package org.chromium.wschannel;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.ttnet.org.chromium.net.B;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class e extends B.b {
    private IWsChannelClient a;

    public e(IWsChannelClient iWsChannelClient) {
        this.a = iWsChannelClient;
    }

    private static int f(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i;
        }
        return 6;
    }

    @Override // com.ttnet.org.chromium.net.B.b
    public void a(B b, int i, String str, String str2) {
        int f2 = f(i);
        if (Logger.debug()) {
            e.a.a.a.a.I0(e.a.a.a.a.P("WS onConnectionError state:", f2, " url:", str, " error:"), str2, "CronetFrontierConnection");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 0);
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, f2);
            jSONObject.put("url", str);
            jSONObject.put(WsConstants.KEY_CONNECTION_ERROR, str2);
            if (b.d(str2, true)) {
                jSONObject.put("error_code", -192);
                if (Logger.debug()) {
                    Logger.d("CronetFrontierConnection", "WS connection timeout.");
                }
            }
            this.a.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.B.b
    public void b(B b, int i, String str) {
        int f2 = f(i);
        if (Logger.debug()) {
            Logger.d("CronetFrontierConnection", "WS onConnectionStateChanged state:" + f2 + " url:" + str);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, f2);
            jSONObject.put("url", str);
            this.a.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.B.b
    public void d(B b, ByteBuffer byteBuffer, int i) throws Exception {
        byte[] bArr = new byte[byteBuffer.capacity()];
        try {
            byteBuffer.get(bArr);
            this.a.onMessage(bArr);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.B.b
    public void e(B b, String str, long j, long j2, boolean z) {
        try {
            d.a().b(str, j, j2, z);
        } catch (Throwable unused) {
        }
    }
}
