package com.bytedance.common.wschannel.client;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.Logger;

/* loaded from: classes.dex */
public class m implements j {
    private void d(Context context, int i) {
        if (context == null || i <= 0 || i > 3) {
            return;
        }
        if (Logger.debug()) {
            Logger.d("WsChannelSdk", "sendAppState appState = " + i);
        }
        if (com.bytedance.common.wschannel.k.e(context).f()) {
            Message message = new Message();
            message.what = 2;
            message.arg1 = i;
            com.bytedance.common.wschannel.server.g.d(context).handleMsg(message);
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public void a(Context context, boolean z, boolean z2) {
    }

    @Override // com.bytedance.common.wschannel.client.j
    public void b(Context context) {
        d(context, 2);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public void c(Context context) {
        d(context, 1);
    }
}
