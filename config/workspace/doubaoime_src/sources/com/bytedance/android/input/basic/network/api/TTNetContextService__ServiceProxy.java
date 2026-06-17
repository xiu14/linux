package com.bytedance.android.input.basic.network.api;

import com.bytedance.android.input.ttnet.TTNetContextImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes.dex */
public class TTNetContextService__ServiceProxy implements IServiceProxy<TTNetContextService> {
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.android.input.basic.network.api.TTNetContextService", "com.bytedance.android.input.ttnet.TTNetContextImpl");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public TTNetContextService newInstance() {
        return new TTNetContextImpl();
    }
}
