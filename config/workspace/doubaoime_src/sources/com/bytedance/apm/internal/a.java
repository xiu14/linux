package com.bytedance.apm.internal;

import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.services.apm.api.IApmAgent;

/* loaded from: classes.dex */
class a implements com.bytedance.news.common.service.manager.a<IApmAgent> {
    a(ApmDelegate apmDelegate) {
    }

    @Override // com.bytedance.news.common.service.manager.a
    public IApmAgent a() {
        return new ApmAgentServiceImpl();
    }
}
