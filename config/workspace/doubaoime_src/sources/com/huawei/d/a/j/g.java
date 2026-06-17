package com.huawei.d.a.j;

import java.util.concurrent.CountDownLatch;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes2.dex */
public class g<TResult> implements com.huawei.d.a.e<TResult>, com.huawei.d.a.d {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // com.huawei.d.a.d
    public final void a(Exception exc) {
        this.a.countDown();
    }

    @Override // com.huawei.d.a.e
    public final void onSuccess(TResult tresult) {
        this.a.countDown();
    }
}
