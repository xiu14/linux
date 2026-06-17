package com.bytedance.apm6.hub;

import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.apm.api.IActivityLifeManager;

/* loaded from: classes.dex */
final class m implements com.bytedance.news.common.service.manager.a<IActivityLifeManager> {
    m() {
    }

    @Override // com.bytedance.news.common.service.manager.a
    public IActivityLifeManager a() {
        return ActivityLifeObserver.getInstance();
    }
}
