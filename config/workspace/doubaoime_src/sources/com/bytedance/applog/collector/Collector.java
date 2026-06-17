package com.bytedance.applog.collector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.applog.c;
import com.bytedance.applog.w.k;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Collector extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("K_DATA");
        if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
            k.z().b("Collector onReceive empty", new Object[0]);
            return;
        }
        Iterator<c> it2 = c.h().iterator();
        while (it2.hasNext()) {
            it2.next().t0((String[]) stringArrayExtra.clone());
        }
    }
}
