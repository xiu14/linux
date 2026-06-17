package com.bytedance.common.wschannel.channel.c.a;

import com.bytedance.common.utility.Logger;

/* loaded from: classes.dex */
class e implements Runnable {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.a.l != null) {
                Logger.d("WsChannelSdk_ok", "send ping");
                this.a.l.t();
            }
        } catch (Throwable unused) {
        }
        this.a.n.e();
    }
}
