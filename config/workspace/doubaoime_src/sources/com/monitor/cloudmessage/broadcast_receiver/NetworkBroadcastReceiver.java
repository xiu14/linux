package com.monitor.cloudmessage.broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.apm.F.b;
import com.bytedance.apm.util.j;

/* loaded from: classes2.dex */
public class NetworkBroadcastReceiver extends BroadcastReceiver {

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(NetworkBroadcastReceiver networkBroadcastReceiver, Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.b(this.a)) {
                e.h.a.a.g().c();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b.e().h(new a(this, context));
    }
}
