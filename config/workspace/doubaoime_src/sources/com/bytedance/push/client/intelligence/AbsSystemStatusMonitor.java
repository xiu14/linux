package com.bytedance.push.client.intelligence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.g0.f;
import com.bytedance.push.interfaze.v;
import com.bytedance.push.sys.broadcast.SystemBroadcastServiceImpl;

/* loaded from: classes2.dex */
public abstract class AbsSystemStatusMonitor extends BroadcastReceiver implements v.a {
    private final String TAG = "AbsSystemStatusMonitor";
    private Context mContext;
    private boolean mHasMonitorScreenStatus;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsSystemStatusMonitor.this.onUserPresent();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsSystemStatusMonitor.this.onNotificationBarPull();
        }
    }

    public AbsSystemStatusMonitor(Context context) {
        this.mContext = context;
    }

    abstract void onNotificationBarPull();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder M = e.a.a.a.a.M("onReceive:");
        M.append(intent.getAction());
        f.c("AbsSystemStatusMonitor", M.toString());
        if (TextUtils.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            f.c("AbsSystemStatusMonitor", "on user present");
            com.ss.android.message.e.e().f(new a(), 0L);
        }
    }

    @Override // com.bytedance.push.interfaze.v.a
    public void onReceiveFromPushSystemBroadcastService(Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.android.systemui.fsgesture")) {
            com.ss.android.message.e.e().f(new b(), 0L);
        }
    }

    abstract void onUserPresent();

    public void startMonitorNotificationBarPull() {
        ((SystemBroadcastServiceImpl) ((C) C.a()).u()).b(this);
    }

    public void startMonitorScreenOn() {
        if (this.mHasMonitorScreenStatus) {
            return;
        }
        this.mHasMonitorScreenStatus = true;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.USER_PRESENT");
        f.c("AbsSystemStatusMonitor", "register as : android.intent.action.USER_PRESENT");
        com.bytedance.common.g.a.c().b().registerReceiver(this.mContext, this, intentFilter);
    }

    public void startMonitorSystemBroadCastForUnDoze() {
        if (com.ss.android.message.f.a.t(this.mContext)) {
            f.c("AbsSystemStatusMonitor", "register system action for un doze");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            com.bytedance.common.g.a.c().b().registerReceiver(this.mContext, this, intentFilter);
            startMonitorScreenOn();
        }
    }
}
