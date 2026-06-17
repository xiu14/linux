package com.bytedance.push.interfaze;

/* loaded from: classes2.dex */
public interface IClientIntelligenceService extends com.bytedance.android.service.manager.push.client.intelligence.IClientIntelligenceService {
    boolean curIsLowCtr();

    boolean enableClientIntelligencePushShow();

    com.bytedance.push.settings.n.a.b getClientIntelligenceSettings();

    void onPushStart();

    com.bytedance.push.client.intelligence.b showPushWithClientIntelligenceStrategy(com.bytedance.push.B b, boolean z);
}
