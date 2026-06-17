package com.bytedance.push;

import android.content.Context;

/* loaded from: classes2.dex */
class F implements com.bytedance.push.settings.a {
    final /* synthetic */ Context a;
    final /* synthetic */ E b;

    F(E e2, Context context) {
        this.b = e2;
        this.a = context;
    }

    @Override // com.bytedance.push.settings.a
    public void a() {
        this.b.c(this.a);
    }
}
