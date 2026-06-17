package com.bytedance.android.input.common.asr.sdkImpl.i;

import com.bytedance.android.input.asr.impl.AsrConnectAbConfigImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes.dex */
public class IAsrConnectAbConfig__ServiceProxy implements IServiceProxy<IAsrConnectAbConfig> {
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.android.input.common.asr.sdkImpl.i.IAsrConnectAbConfig", "com.bytedance.android.input.asr.impl.AsrConnectAbConfigImpl");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IAsrConnectAbConfig newInstance() {
        return new AsrConnectAbConfigImpl();
    }
}
