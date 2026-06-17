package com.bytedance.common.wschannel.app;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface c {
    void b(com.bytedance.common.wschannel.event.a aVar, JSONObject jSONObject);

    void c(WsChannelMsg wsChannelMsg);
}
