package com.bytedance.android.input.common.asr.sdkImpl.i;

import com.bytedance.news.common.service.manager.IService;
import kotlin.s.c.A;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AsrConnectConfig implements IAsrConnectAbConfig {
    public static final AsrConnectConfig INSTANCE = new AsrConnectConfig();
    private final /* synthetic */ IAsrConnectAbConfig $$delegate_0;

    private AsrConnectConfig() {
        IService S = com.bytedance.feedbackerlib.a.S(A.b(IAsrConnectAbConfig.class));
        l.c(S);
        this.$$delegate_0 = (IAsrConnectAbConfig) S;
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.IAsrConnectAbConfig
    public boolean isCanWsOpt() {
        return this.$$delegate_0.isCanWsOpt();
    }
}
