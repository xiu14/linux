package com.bytedance.dataplatform;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4715c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ JSONObject f4716d;

    b(Context context, String str, String str2, JSONObject jSONObject) {
        this.a = context;
        this.b = str;
        this.f4715c = str2;
        this.f4716d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.e(this.a, this.b).edit().putString(this.f4715c, this.f4716d.toString()).apply();
    }
}
