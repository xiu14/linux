package com.bytedance.crash.a0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class d extends BroadcastReceiver {
    final /* synthetic */ e a;

    d(e eVar) {
        this.a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("level", 0);
                this.a.a = (intExtra * 100) / intent.getIntExtra("scale", 100);
            }
        } catch (Exception unused) {
        }
    }
}
