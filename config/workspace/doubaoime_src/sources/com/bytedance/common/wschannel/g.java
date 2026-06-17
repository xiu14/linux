package com.bytedance.common.wschannel;

/* loaded from: classes.dex */
class g implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ WsChannelMultiProcessSharedProvider f4253c;

    g(WsChannelMultiProcessSharedProvider wsChannelMultiProcessSharedProvider, String str, String str2) {
        this.f4253c = wsChannelMultiProcessSharedProvider;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        WsChannelMultiProcessSharedProvider wsChannelMultiProcessSharedProvider = this.f4253c;
        wsChannelMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(WsChannelMultiProcessSharedProvider.b(wsChannelMultiProcessSharedProvider.getContext(), this.a, this.b), null);
    }
}
