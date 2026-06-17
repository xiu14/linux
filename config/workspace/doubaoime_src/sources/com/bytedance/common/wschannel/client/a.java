package com.bytedance.common.wschannel.client;

import androidx.annotation.NonNull;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.event.ConnectionState;

/* loaded from: classes.dex */
public abstract class a implements c {

    @NonNull
    protected final b.a a;

    public a(@NonNull b.a aVar) {
        this.a = aVar;
    }

    @NonNull
    protected ConnectionState b(int i, int i2, boolean z) {
        ConnectionState connectionState = ConnectionState.CONNECTION_UNKNOWN;
        if (i2 != 0) {
            if (i2 == 1) {
                connectionState = ConnectionState.CONNECTING;
            } else if (i2 == 2) {
                connectionState = ConnectionState.CONNECT_FAILED;
            } else if (i2 == 3) {
                connectionState = ConnectionState.CONNECT_CLOSED;
            } else if (i2 == 4) {
                connectionState = ConnectionState.CONNECTED;
            }
        }
        if (Logger.debug()) {
            Logger.d("AbsWsClientService", "state = " + i2 + " connectionState = " + connectionState);
        }
        this.a.e(i, connectionState, z);
        return connectionState;
    }
}
