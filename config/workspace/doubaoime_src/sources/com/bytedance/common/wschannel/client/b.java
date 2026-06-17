package com.bytedance.common.wschannel.client;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.bytedance.common.wschannel.client.a {
    private final Map<String, c> b;

    public interface a {
        void a(WsChannelMsg wsChannelMsg, boolean z);

        void b(com.bytedance.common.wschannel.event.a aVar, JSONObject jSONObject);

        void c(WsChannelMsg wsChannelMsg);

        void d(ServiceConnectEvent serviceConnectEvent);

        void e(int i, ConnectionState connectionState, boolean z);

        void f(String str, boolean z);
    }

    public b(@NonNull a aVar) {
        super(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(WsConstants.RECEIVE_CONNECTION_ACTION, new d(aVar));
        hashMap.put(WsConstants.SYNC_CONNECT_STATE, new i(aVar));
        hashMap.put(WsConstants.RECEIVE_PROGRESS_ACTION, new f(aVar));
        hashMap.put(WsConstants.RECEIVE_PAYLOAD_ACTION, new e(aVar));
        hashMap.put(WsConstants.SEND_PAYLOAD_ACTION, new h(aVar));
        hashMap.put(WsConstants.RECEIVE_SERVICE_ACTION, new g(aVar));
        this.b = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.bytedance.common.wschannel.client.c
    public void a(Intent intent, com.bytedance.common.wschannel.model.a aVar) {
        try {
            c cVar = this.b.get(intent.getAction());
            if (cVar != null) {
                cVar.a(intent, aVar);
            } else {
                Logger.e("error action!");
            }
        } catch (Throwable th) {
            Logger.e("AbsWsClientService", th.toString());
        }
        if (Logger.debug()) {
            Logger.d("AbsWsClientService", "count = " + intent.getIntExtra(WsConstants.MSG_COUNT, -1));
        }
    }
}
