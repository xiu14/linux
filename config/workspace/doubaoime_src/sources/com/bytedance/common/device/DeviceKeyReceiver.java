package com.bytedance.common.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.push.g0.f;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class DeviceKeyReceiver extends BroadcastReceiver {
    private static Set<a> a = new HashSet();
    private static DeviceKeyReceiver b = new DeviceKeyReceiver();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f4136c = new AtomicBoolean(false);

    public interface a {
        void a();

        void b();
    }

    public static void a(a aVar) {
        if (f4136c.compareAndSet(false, true)) {
            com.bytedance.common.g.a.c().b().registerReceiver(com.ss.android.message.a.a(), b, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        a.add(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("reason");
            f.c("DeviceKeyReceiver", "onReceive:" + action + " reason:" + stringExtra);
            if (TextUtils.equals(action, "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                int i = 0;
                if (TextUtils.equals(stringExtra, "fs_gesture") || TextUtils.equals(stringExtra, "recentapps")) {
                    Object[] array = a.toArray();
                    int length = array.length;
                    while (i < length) {
                        ((a) array[i]).a();
                        i++;
                    }
                    return;
                }
                if (TextUtils.equals(stringExtra, "homekey")) {
                    Object[] array2 = a.toArray();
                    int length2 = array2.length;
                    while (i < length2) {
                        ((a) array2[i]).b();
                        i++;
                    }
                }
            }
        }
    }
}
