package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.bdinstall.e0;

/* loaded from: classes.dex */
final class p {
    private final SharedPreferences a;

    @WorkerThread
    p(Context context) {
        this.a = context.getSharedPreferences("device_register_oaid_refine", 0);
    }

    public void a() {
        e0.i(this.a, new String[]{"oaid"});
    }

    @Nullable
    @WorkerThread
    n b() {
        return n.a(this.a.getString("oaid", ""));
    }

    @WorkerThread
    void c(@Nullable n nVar) {
        this.a.edit().putString("oaid", nVar.b().toString()).apply();
    }
}
