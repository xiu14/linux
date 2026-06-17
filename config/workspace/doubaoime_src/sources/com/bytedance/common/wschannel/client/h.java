package com.bytedance.common.wschannel.client;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* loaded from: classes.dex */
class h extends a {
    public h(@NonNull b.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.c
    public void a(Intent intent, com.bytedance.common.wschannel.model.a aVar) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        String stringExtra = intent.getStringExtra(WsConstants.KEY_PAYLOAD_MD5);
        boolean booleanExtra = intent.getBooleanExtra(WsConstants.KEY_SEND_RESULT, true);
        if (Logger.debug()) {
            Logger.d("AbsWsClientService", "get payloadMd5 = " + stringExtra + " sendResult = " + booleanExtra);
        }
        this.a.f(stringExtra, booleanExtra);
    }
}
