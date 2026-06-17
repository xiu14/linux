package com.bytedance.apm.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.apm.util.l;

/* loaded from: classes.dex */
class g extends BroadcastReceiver {
    final /* synthetic */ i a;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g.this.a.A();
            } catch (Throwable unused) {
            }
        }
    }

    g(i iVar) {
        this.a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("PROCESS_NAME");
                com.bytedance.apm.g.h();
                String a2 = l.a();
                if (com.bytedance.apm.g.B()) {
                    com.bytedance.apm.y.d.d("apm_initializing", "BroadcastReceiver.onReceive, processName:", stringExtra, "currentProcessName:", a2);
                }
                if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(a2) || stringExtra.equals(a2)) {
                    return;
                }
                com.bytedance.apm.F.b.e().h(new a());
            } catch (Throwable unused) {
            }
        }
    }
}
