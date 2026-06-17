package com.bytedance.common.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.push.g0.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class PushDeviceKeyReceiver extends BroadcastReceiver {
    private Set<com.bytedance.common.push.e.b> a = new HashSet();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("reason");
            f.c("DeviceKeyReceiver", "onReceive:" + action + " reason:" + stringExtra);
            if (TextUtils.equals(action, "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                if (TextUtils.equals(stringExtra, "recentapps") || TextUtils.equals(stringExtra, "fs_gesture")) {
                    f.c("DeviceKeyReceiver", "update app status for multi task action");
                    Iterator<com.bytedance.common.push.e.b> it2 = this.a.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                }
            }
        }
    }
}
