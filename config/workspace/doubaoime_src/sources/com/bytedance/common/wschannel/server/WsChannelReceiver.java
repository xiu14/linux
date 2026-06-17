package com.bytedance.common.wschannel.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import java.util.Objects;

/* loaded from: classes.dex */
public class WsChannelReceiver extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4308d = false;
    private b a;
    private boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    private NetworkUtils$NetworkType f4309c;

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WsChannelReceiver.a(WsChannelReceiver.this, this.a);
            if (WsChannelReceiver.f4308d) {
                try {
                    if (Logger.debug()) {
                        Logger.d("WsChannelReceiver", "ConnectivityReceiver");
                    }
                    Context context = this.a;
                    boolean f2 = g.f(context);
                    NetworkUtils$NetworkType c2 = g.c(context);
                    int i = !f2 ? 2 : NetworkUtils$NetworkType.WIFI == c2 ? 3 : NetworkUtils$NetworkType.NONE != c2 ? 4 : 1;
                    Message obtain = Message.obtain();
                    obtain.what = 3;
                    obtain.arg1 = i;
                    WsChannelReceiver.this.a.handleMsg(obtain);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Deprecated
    public WsChannelReceiver() {
    }

    static void a(WsChannelReceiver wsChannelReceiver, Context context) {
        Objects.requireNonNull(wsChannelReceiver);
        try {
            boolean f2 = com.bytedance.common.wschannel.k.e(context).f();
            if (f2 != f4308d) {
                f4308d = f2;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || this.a == null || TextUtils.isEmpty(intent.getAction()) || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (this.b) {
            this.b = false;
            if (g.c(context) == this.f4309c) {
                return;
            }
        }
        com.bytedance.common.utility.h.c.b(new a(context));
    }

    public WsChannelReceiver(Context context, b bVar) {
        this.f4309c = g.c(context);
        this.a = bVar;
    }
}
