package com.bytedance.apm.B;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes.dex */
class f extends BroadcastReceiver {
    final /* synthetic */ g a;

    f(g gVar) {
        this.a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        this.a.a = intent.getIntExtra("temperature", 0) / 10.0f;
        this.a.b = intent.getIntExtra("status", 1);
        g gVar = this.a;
        intent.getIntExtra("plugged", -1);
        Objects.requireNonNull(gVar);
    }
}
