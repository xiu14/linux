package com.bytedance.dataplatform;

import android.content.Context;

/* loaded from: classes.dex */
class g implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4724c;

    g(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.f4724c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.e(this.a, this.b).edit().remove(this.f4724c).apply();
    }
}
