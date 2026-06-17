package com.bytedance.apm.impl;

import com.bytedance.services.apm.api.ILaunchTrace;

/* loaded from: classes.dex */
public class LaunchTraceImpl implements ILaunchTrace {
    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void cancelTrace() {
        com.bytedance.apm.G.c.a();
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endSpan(String str, String str2) {
        com.bytedance.apm.G.c.b(str, str2);
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endTrace(int i, String str, long j) {
        com.bytedance.apm.G.c.c(i, str, j);
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startSpan(String str, String str2) {
        com.bytedance.apm.G.c.e(str, str2);
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startTrace() {
        com.bytedance.apm.G.c.f();
    }
}
