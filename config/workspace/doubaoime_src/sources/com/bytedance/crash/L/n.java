package com.bytedance.crash.L;

import com.bytedance.crash.jni.NativeBridge;

/* loaded from: classes.dex */
class n implements Runnable {
    n(p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        NativeBridge.h();
    }
}
