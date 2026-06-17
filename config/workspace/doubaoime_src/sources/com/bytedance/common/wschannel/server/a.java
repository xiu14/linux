package com.bytedance.common.wschannel.server;

import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class a {
    Map<Integer, IWsApp> a = new ConcurrentHashMap();
    Map<Integer, IWsChannelClient> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    Map<Integer, SocketState> f4313c = new ConcurrentHashMap();

    a() {
    }
}
