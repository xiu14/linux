package com.bytedance.android.service.manager.client.ai;

import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IClientAiExternalService {
    void init();

    boolean isClientAiReady();

    void registerClientAICallback(IClientAICallback iClientAICallback);

    void runTask(JSONObject jSONObject);
}
