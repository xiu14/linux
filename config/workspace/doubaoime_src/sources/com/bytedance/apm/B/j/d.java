package com.bytedance.apm.B.j;

import android.app.Activity;
import android.os.MessageQueue;

/* loaded from: classes.dex */
class d implements MessageQueue.IdleHandler {
    final /* synthetic */ com.bytedance.apm.B.j.g.b a;

    d(e eVar, com.bytedance.apm.B.j.g.b bVar) {
        this.a = bVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return false;
        }
        com.bytedance.apm.B.j.g.a.a(activity);
        return false;
    }
}
