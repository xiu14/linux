package com.bytedance.common.wschannel.event;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class a {
    public final ChannelType a;
    public final ConnectionState b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4252c;

    public a(@NonNull ConnectionState connectionState, ChannelType channelType, int i) {
        this.b = connectionState;
        this.a = channelType;
        this.f4252c = i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ConnectEvent{mType=");
        M.append(this.a);
        M.append(", connectionState=");
        M.append(this.b);
        M.append(", mChannelId=");
        return e.a.a.a.a.C(M, this.f4252c, '}');
    }
}
