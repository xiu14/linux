package com.bytedance.push;

import android.content.Context;

/* loaded from: classes2.dex */
class y implements Runnable {
    final /* synthetic */ Context a;

    y(A a, Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((E) ((C) C.a()).s()).i(this.a);
    }
}
