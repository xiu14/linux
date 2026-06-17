package com.bytedance.apm.internal;

import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.services.apm.api.ILaunchTrace;

/* loaded from: classes.dex */
class b implements com.bytedance.news.common.service.manager.a<ILaunchTrace> {
    b(ApmDelegate apmDelegate) {
    }

    @Override // com.bytedance.news.common.service.manager.a
    public ILaunchTrace a() {
        return new LaunchTraceImpl();
    }
}
