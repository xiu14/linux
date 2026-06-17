package com.bytedance.common.wschannel.client;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Objects;

/* loaded from: classes.dex */
public class e extends a {
    public e(@NonNull b.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.c
    public void a(Intent intent, @Nullable com.bytedance.common.wschannel.model.a aVar) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        WsChannelMsg wsChannelMsg = (WsChannelMsg) intent.getParcelableExtra(WsConstants.KEY_PAYLOAD);
        Objects.requireNonNull(WsConstants.getOptLogic());
        Message message = new Message();
        message.getData().putParcelable(WsConstants.KEY_PAYLOAD, wsChannelMsg);
        message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
        Parcelable parcelable = message.getData().getParcelable(WsConstants.KEY_PAYLOAD);
        WsChannelMsg wsChannelMsg2 = parcelable instanceof WsChannelMsg ? (WsChannelMsg) parcelable : null;
        if (wsChannelMsg2 != null) {
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("get wsChannelMsg = ");
                M.append(wsChannelMsg2.toString());
                Logger.d("AbsWsClientService", M.toString());
            }
            this.a.c(wsChannelMsg2);
        }
    }
}
