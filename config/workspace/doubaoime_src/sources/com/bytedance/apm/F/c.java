package com.bytedance.apm.F;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
class c implements ThreadFactory {
    c(d dVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "Apm_Log_Bypass_Store");
    }
}
