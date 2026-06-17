package com.bytedance.common.wschannel.client;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.model.SocketState;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends a {
    public i(@NonNull b.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.c
    public void a(Intent intent, com.bytedance.common.wschannel.model.a aVar) {
        Logger.d("AbsWsClientService", "sync socket state");
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra(WsConstants.KEY_CONNECTION);
        if (parcelableArrayListExtra != null) {
            for (SocketState socketState : parcelableArrayListExtra) {
                if (socketState != null) {
                    b(socketState.f4281d, socketState.b, socketState.b());
                }
            }
        }
    }
}
