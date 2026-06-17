package com.bytedance.common.wschannel.event;

/* loaded from: classes.dex */
public enum ChannelType {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);

    int mTypeValue;

    ChannelType(int i) {
        this.mTypeValue = i;
    }

    public static ChannelType of(int i) {
        return i == 1 ? CHANNEL_SELF : CHANNEL_OK;
    }

    public int getVal() {
        return this.mTypeValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return e.a.a.a.a.C(e.a.a.a.a.M("ChannelType{Type="), this.mTypeValue, '}');
    }
}
