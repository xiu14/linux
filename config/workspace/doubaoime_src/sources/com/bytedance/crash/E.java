package com.bytedance.crash;

import com.bytedance.crash.D;
import com.bytedance.crash.ensure.EnsureApi;

/* loaded from: classes.dex */
class E implements Runnable {
    E(D.b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.android.input.k.b.a.W("initAsyncForEvent");
        com.bytedance.crash.Q.b.d();
        com.bytedance.crash.general.a.h();
        EnsureApi.a();
    }
}
