package com.bytedance.common.wschannel.m;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.io.IOException;

/* loaded from: classes.dex */
public interface a {
    WsChannelMsg a(byte[] bArr) throws IOException;

    byte[] b(WsChannelMsg wsChannelMsg);
}
