package com.bytedance.common.wschannel.event;

/* loaded from: classes.dex */
public enum ConnectionState {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);

    final int mTypeValue;

    ConnectionState(int i) {
        this.mTypeValue = i;
    }

    public int getTypeValue() {
        return this.mTypeValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return e.a.a.a.a.C(e.a.a.a.a.M("ConnectionState{State="), this.mTypeValue, '}');
    }
}
