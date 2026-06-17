package com.bytedance.dataplatform;

import android.content.Context;

/* loaded from: classes.dex */
class c implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4717c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f4718d;

    c(Context context, String str, String str2, int i) {
        this.a = context;
        this.b = str;
        this.f4717c = str2;
        this.f4718d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.e(this.a, this.b).edit().putInt(this.f4717c, this.f4718d).apply();
    }
}
