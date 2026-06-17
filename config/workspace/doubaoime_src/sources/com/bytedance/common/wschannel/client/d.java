package com.bytedance.common.wschannel.client;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.event.ChannelType;
import com.bytedance.common.wschannel.model.SocketState;

/* loaded from: classes.dex */
class d extends a {
    public d(@NonNull b.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.c
    public void a(Intent intent, com.bytedance.common.wschannel.model.a aVar) {
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        SocketState socketState = (SocketState) intent.getParcelableExtra(WsConstants.KEY_CONNECTION);
        try {
            this.a.b(new com.bytedance.common.wschannel.event.a(b(socketState.f4281d, socketState.b, socketState.b()), ChannelType.of(socketState.f4282e), socketState.f4281d), socketState.p());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
