package com.xiaomi.mipush.sdk.api;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class OnSuccessListener<TResult> {
    protected AtomicBoolean mCalled = new AtomicBoolean(false);

    void callSuccess(TResult tresult) {
        if (this.mCalled.compareAndSet(false, true)) {
            onSuccess(tresult);
        }
    }

    public abstract void onSuccess(TResult tresult);
}
