package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.e;

/* loaded from: classes.dex */
public class e implements e.c {

    /* renamed from: c, reason: collision with root package name */
    private static final String f5157c = "e";
    private com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.e a = new com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.e();
    private BroadcastReceiver b = new a(this);

    class a extends BroadcastReceiver {
        a(e eVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c.n().r();
            }
        }
    }

    public void a(Context context) {
        Application application;
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.b, intentFilter);
            if (Logger.debug()) {
                Logger.d(f5157c, "register network state changed completed");
            }
        }
        if (Logger.debug()) {
            Logger.d(f5157c, "register activity forground and background switch Callback");
        }
        if (!(context instanceof Application) || (application = (Application) context) == null) {
            return;
        }
        this.a.d(this);
        application.registerActivityLifecycleCallbacks(this.a);
    }
}
