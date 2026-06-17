package com.bytedance.apm.config;

import android.content.Intent;
import com.bytedance.apm.util.l;

/* loaded from: classes.dex */
class h implements Runnable {
    h(i iVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Intent intent = new Intent("com.apm.setting.update.action");
            com.bytedance.apm.g.h();
            intent.putExtra("PROCESS_NAME", l.a());
            com.bytedance.apm.g.h().sendBroadcast(intent);
            if (com.bytedance.apm.g.B()) {
                com.bytedance.apm.y.d.d("apm_initializing", "BroadcastReceiver.sendBroadUpdateSetting");
            }
        } catch (Exception unused) {
        }
    }
}
