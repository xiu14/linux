package com.bytedance.android.input.common.asr.api;

import com.bytedance.android.input.speech.modifypair.AsrModify;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes.dex */
public class IAsrModify__ServiceProxy implements IServiceProxy<IAsrModify> {
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.android.input.common.asr.api.IAsrModify", "com.bytedance.android.input.speech.modifypair.AsrModify");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IAsrModify newInstance() {
        return new AsrModify();
    }
}
