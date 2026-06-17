package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class q extends BroadcastReceiver {
    private final ProxyChangeListener a;

    q(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.a.h(intent);
        }
    }
}
