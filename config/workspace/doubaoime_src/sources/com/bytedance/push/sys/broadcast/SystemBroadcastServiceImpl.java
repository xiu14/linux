package com.bytedance.push.sys.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.push.g0.f;
import com.bytedance.push.interfaze.v;
import com.ss.android.message.e;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class SystemBroadcastServiceImpl extends BroadcastReceiver implements v {
    private Map<String, Set<v.a>> a = new ConcurrentHashMap();
    private boolean b;

    class a implements Runnable {
        final /* synthetic */ Intent a;

        a(Intent intent) {
            this.a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set set = (Set) SystemBroadcastServiceImpl.this.a.get("com.android.systemui.fsgesture");
            if (set != null) {
                for (Object obj : set.toArray()) {
                    ((v.a) obj).onReceiveFromPushSystemBroadcastService(this.a);
                }
            }
        }
    }

    public synchronized void b(v.a aVar) {
        Set<v.a> set = this.a.get(aVar);
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(aVar);
        this.a.put("com.android.systemui.fsgesture", set);
        if (this.b) {
            return;
        }
        this.b = true;
        IntentFilter intentFilter = new IntentFilter("com.android.systemui.fsgesture");
        f.c("SystemBroadcastServiceImpl", "register as : com.android.systemui.fsgesture");
        try {
            com.bytedance.common.g.a.c().b().registerReceiver(com.ss.android.message.a.a(), this, intentFilter);
        } catch (Throwable th) {
            f.e("SystemBroadcastServiceImpl", "addNotificationBarPullDownListener failed because exception:" + th.getLocalizedMessage());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        StringBuilder M = e.a.a.a.a.M("onReceive:");
        M.append(intent.getAction());
        f.c("SystemBroadcastServiceImpl", M.toString());
        if (TextUtils.equals(intent.getAction(), "com.android.systemui.fsgesture") && (extras = intent.getExtras()) != null && TextUtils.equals(extras.getString("typeFrom"), "typefrom_status_bar_expansion")) {
            boolean z = extras.getBoolean("isEnter");
            f.c("SystemBroadcastServiceImpl", "notification bar status changed,isEnter:" + z);
            if (z) {
                e.e().f(new a(intent), 0L);
            }
        }
    }
}
