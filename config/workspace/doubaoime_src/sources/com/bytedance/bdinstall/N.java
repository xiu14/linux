package com.bytedance.bdinstall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.bdinstall.K;

/* loaded from: classes.dex */
class N extends BroadcastReceiver {
    private boolean a = true;
    final /* synthetic */ K.d b;

    N(K.d dVar) {
        this.b = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2;
        if (this.a) {
            this.a = false;
            return;
        }
        if (intent == null) {
            int i = C0640u.a;
            return;
        }
        if (intent.getBooleanExtra("noConnectivity", false)) {
            int i2 = C0640u.a;
            return;
        }
        context2 = this.b.f3948c;
        if (com.bytedance.android.input.k.b.a.j0(context2)) {
            K.d dVar = this.b;
            synchronized (dVar) {
                C0643x.g(new O(dVar));
            }
        }
    }
}
