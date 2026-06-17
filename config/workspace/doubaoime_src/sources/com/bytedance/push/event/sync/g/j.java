package com.bytedance.push.event.sync.g;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.interfaze.v;
import com.bytedance.push.sys.broadcast.SystemBroadcastServiceImpl;

/* loaded from: classes2.dex */
public class j extends a implements v.a {
    @Override // com.bytedance.push.event.sync.g.a
    String n() {
        return "pull_down_notification_bar";
    }

    @Override // com.bytedance.push.interfaze.v.a
    public void onReceiveFromPushSystemBroadcastService(Intent intent) {
        StringBuilder M = e.a.a.a.a.M("[onReceiveFromPushSystemBroadcastService]action:");
        M.append(intent.getAction());
        com.bytedance.push.g0.f.c("PullDownNotificationBarAdapter", M.toString());
        if (TextUtils.equals(intent.getAction(), "com.android.systemui.fsgesture")) {
            ((com.bytedance.push.event.sync.f) ((C) C.a()).t().getISignalReporter()).n(this.a, "pull_down_notification_bar", this.b, null);
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        ((SystemBroadcastServiceImpl) ((C) C.a()).u()).b(this);
    }
}
