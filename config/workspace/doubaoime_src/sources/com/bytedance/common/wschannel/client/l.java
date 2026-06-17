package com.bytedance.common.wschannel.client;

import android.content.Context;

/* loaded from: classes.dex */
class l implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f4248c;

    l(k kVar, Context context, boolean z) {
        this.f4248c = kVar;
        this.a = context;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0.get() == null) goto L9;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r3 = this;
            android.content.Context r0 = r3.a
            if (r0 != 0) goto L5
            return
        L5:
            com.bytedance.common.wschannel.client.k r0 = r3.f4248c
            java.lang.ref.WeakReference r0 = com.bytedance.common.wschannel.client.k.f(r0)
            if (r0 == 0) goto L19
            com.bytedance.common.wschannel.client.k r0 = r3.f4248c
            java.lang.ref.WeakReference r0 = com.bytedance.common.wschannel.client.k.f(r0)
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L29
        L19:
            com.bytedance.common.wschannel.client.k r0 = r3.f4248c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            android.content.Context r2 = r3.a
            android.content.Context r2 = r2.getApplicationContext()
            r1.<init>(r2)
            com.bytedance.common.wschannel.client.k.g(r0, r1)
        L29:
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L51
            android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.bytedance.common.wschannel.server.WsChannelService> r2 = com.bytedance.common.wschannel.server.WsChannelService.class
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L51
            com.bytedance.common.wschannel.client.j$a r1 = new com.bytedance.common.wschannel.client.j$a     // Catch: java.lang.Throwable -> L51
            r1.<init>()     // Catch: java.lang.Throwable -> L51
            boolean r2 = r3.b     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L3e
            r2 = 9
            goto L40
        L3e:
            r2 = 11
        L40:
            r1.a = r2     // Catch: java.lang.Throwable -> L51
            com.bytedance.common.wschannel.client.k r2 = r3.f4248c     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.LinkedBlockingDeque r2 = com.bytedance.common.wschannel.client.k.h(r2)     // Catch: java.lang.Throwable -> L51
            r2.offer(r1)     // Catch: java.lang.Throwable -> L51
            com.bytedance.common.wschannel.client.k r1 = r3.f4248c     // Catch: java.lang.Throwable -> L51
            com.bytedance.common.wschannel.client.k.i(r1, r0)     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.l.run():void");
    }
}
