package com.bytedance.dataplatform;

import android.content.Context;

/* loaded from: classes.dex */
class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4721c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f4722d;

    e(String str, Context context, String str2, String str3) {
        this.a = str;
        this.b = context;
        this.f4721c = str2;
        this.f4722d = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a == null) {
            d.e(this.b, this.f4721c).edit().remove(this.f4722d).apply();
        } else {
            d.e(this.b, this.f4721c).edit().putString(this.f4722d, this.a).apply();
        }
    }
}
