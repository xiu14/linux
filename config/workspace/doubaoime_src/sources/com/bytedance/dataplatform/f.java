package com.bytedance.dataplatform;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* loaded from: classes.dex */
class f implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map f4723c;

    f(Context context, String str, Map map) {
        this.a = context;
        this.b = str;
        this.f4723c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        SharedPreferences.Editor edit = d.e(this.a, this.b).edit();
        edit.clear().apply();
        for (String str : this.f4723c.keySet()) {
            edit.putString(str, (String) this.f4723c.get(str));
        }
        edit.apply();
    }
}
