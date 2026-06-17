package com.bytedance.android.input.basic.applog.api;

import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes.dex */
public interface IAppDidChange extends IService {
    void notifyConfigChange(boolean z);

    void registerDidChangeListener(a aVar);

    void unregisterDidChangeListener(a aVar);
}
