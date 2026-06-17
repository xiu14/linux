package com.bytedance.android.input.basic.applog.api;

import com.bytedance.android.input.basic.applog.impl.AppDidChangeImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes.dex */
public class IAppDidChange__ServiceProxy implements IServiceProxy<IAppDidChange> {
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.android.input.basic.applog.api.IAppDidChange", "com.bytedance.android.input.basic.applog.impl.AppDidChangeImpl");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IAppDidChange newInstance() {
        return new AppDidChangeImpl();
    }
}
