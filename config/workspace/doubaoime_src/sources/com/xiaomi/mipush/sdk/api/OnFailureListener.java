package com.xiaomi.mipush.sdk.api;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class OnFailureListener {
    protected AtomicBoolean mCalled = new AtomicBoolean(false);

    void callFailure(Exception exc) {
        if (this.mCalled.compareAndSet(false, true)) {
            onFailure(exc);
        }
    }

    public abstract void onFailure(Exception exc);
}
