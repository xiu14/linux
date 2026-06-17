package com.bytedance.lego.init;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class n implements ThreadFactory {
    public static final n a = new n();

    n() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "A-DelayTaskThread");
    }
}
