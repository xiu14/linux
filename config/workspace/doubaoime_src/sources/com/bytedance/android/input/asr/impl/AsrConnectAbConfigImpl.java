package com.bytedance.android.input.asr.impl;

import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.asr.sdkImpl.i.IAsrConnectAbConfig;
import com.bytedance.common.a.e.p;
import e.a.a.a.a;

/* loaded from: classes.dex */
public final class AsrConnectAbConfigImpl implements IAsrConnectAbConfig {
    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.IAsrConnectAbConfig
    public boolean isCanWsOpt() {
        boolean z;
        boolean x = IInputSettings.a.d().x();
        a.y0("isSupportVoiceNetworkOptimize = ", x, "FrontierWsConfigManager");
        if (x) {
            boolean a = p.a();
            a.y0("isHitFrontierOptExp = ", a, "FrontierWsConfigManager");
            if (a) {
                z = true;
                a.y0("isCanWsOpt: ", z, "FrontierWsConfigManager");
                return z;
            }
        }
        z = false;
        a.y0("isCanWsOpt: ", z, "FrontierWsConfigManager");
        return z;
    }
}
